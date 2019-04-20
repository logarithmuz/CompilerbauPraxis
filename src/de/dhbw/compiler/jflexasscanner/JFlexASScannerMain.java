/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner mit JFlex 3
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexasscanner;

import java.io.StringReader;


public class JFlexASScannerMain {
	
	private static final String TEST = "[34, x,peter,  34kurt, g56, null,null, 8] ";
	private static final String TEST2 = "  01230.abc";
	
	public static void main(String[] args) throws Exception {
		
		JFlexASScanner scanner = new JFlexASScanner(new StringReader(TEST2));
		
		Token mytoken = scanner.nextToken();
		
		while (mytoken.getType()!=Token.EOF) {
			System.out.println(mytoken);
			mytoken = scanner.nextToken();
		}

		System.out.println(mytoken);
	}

}
