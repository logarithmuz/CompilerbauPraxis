/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Token-Definition intConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexxscanner;

public class IntConstToken extends Token {

	int value;
	
	public IntConstToken(int type, String text, int line, int column, int value) {
		super(type, text, line, column);
		this.value = value;
		this.value = Integer.parseInt(text);
	}

	public int getValue() {
		return value;
	}


}
