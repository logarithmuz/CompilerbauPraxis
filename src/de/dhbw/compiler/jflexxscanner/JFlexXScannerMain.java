/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexxscanner;

import java.io.StringReader;


public class JFlexXScannerMain {
	
	private static final String TEST = 
			"program test2;\n"+
			"	x : int;\n"+
			"	y : float;\n"+
			"	z : string;\n"+
			"begin\n"+
			"	x := 4+5+6.2;\n"+
			"	y := 3.56+1.2e3+45.e-67+4e34+3E-1;\n"+
			"	z := \"Hello \\\"World\\\"\" + \":\";\n"+
			"	z := \"Peter\" + 4;\n"+
			"	a := 3+4;\n"+
			"end.";

	private static final String TEST2 = "program test1;\nbegin\nend.";


	public static void main(String[] args) throws Exception {
		
		@SuppressWarnings("unused")
		JFlexXScanner scanner = new JFlexXScanner(new StringReader(TEST2));

		Token mytoken = scanner.nextToken();

		while (mytoken.getType()!=Token.EOF) {
			System.out.println(mytoken);
			mytoken = scanner.nextToken();
		}

		System.out.println(mytoken);

	}

}
