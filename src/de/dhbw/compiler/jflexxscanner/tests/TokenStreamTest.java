/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Testfall-Utility
 * 
 * **********************************************
 */


package de.dhbw.compiler.jflexxscanner.tests;

import de.dhbw.compiler.jflexxscanner.*;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

import java.io.StringReader;

public abstract class TokenStreamTest {
	
	protected void testTokenList(String in, boolean convert, Token... TokenList) throws Exception {
		JFlexXScanner scanner = new JFlexXScanner(new StringReader(in));
		Token myToken;
		
		for (Token expected : TokenList) {
			myToken = scanner.nextToken();
			assertEquals("Expect Token "+expected.toString()+". Error in type.", 
					expected.getType(), myToken.getType());
			assertEquals("Expect Token "+expected.toString()+". Error in text.", 
					expected.getText(), myToken.getText());
			assertEquals("Expect Token "+expected.toString()+". Error in line.", 
					expected.getLine(), myToken.getLine());
			assertEquals("Expect Token "+expected.toString()+". Error in column.", 
					expected.getColumn(), myToken.getColumn());
			if (convert) {
				switch (myToken.getType()) {
					case Token.INTCONST:
						int intValue = Integer.parseInt(expected.getText());
						Assert.assertEquals("Expected Token value "+intValue,
								intValue,((IntConstToken)myToken).getValue());
						break;
					case Token.FLOATCONST:
						double doubleValue = Double.parseDouble(expected.getText().replace("^", "e"));
						Assert.assertEquals("Expected Token value "+doubleValue,
								doubleValue,((FloatConstToken)myToken).getValue(), doubleValue*0.0000001);
						break;
					case Token.STRINGCONST:
						String stringValue = expected.getText().replace("\\\"", "\"");
						stringValue = stringValue.substring(1,stringValue.length()-1);
						Assert.assertEquals("Expected Token value "+stringValue,
								stringValue,((StringConstToken)myToken).getValue());
						break;
				}
			}
		}
		
		myToken = scanner.nextToken();
		assertEquals("Expected End of File (EOF), read " + myToken.toString() + ".", Token.EOF, myToken.getType());	
	}
	
}
