/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Token-Definition floatConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexxscanner;

public class FloatConstToken extends Token {

	float value;

	public FloatConstToken(int type, String text, int line, int column, float value) {
		super(type, text, line, column);
		this.value = value;
	}

	public double getValue() {
		return value;
	}


}
