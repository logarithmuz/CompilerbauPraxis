/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner mit JFlex
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexasscanner;

%% //Optionen und reguläre Definitionen

%class JFlexASScanner
%function nextToken
%type  Token

%unicode
%line
%column
%public
%final

%char
%line
%column

%xstate NUM, FRAC, EXP, STR

%{
	StringBuffer textValue;
	StringBuffer rawText;
	int numValue;
	int fracValue;
	int fracDiv;
	int expValue;
%}

%eofval{
	return new Token(Token.EOF, yytext(), yyline+1, yycolumn+1);
%eofval}

DIGIT = [0-9]
WS = [ \t\n\r\b]+
LSBR = \[
RSBR = \]
COMMA = \,
NULL = null
ID = [a-zA-Z][0-9a-zA-Z]*
STRING = \"([0-9a-zA-Z ]|\\\")*\"

%% //Lexikalische Regeln

{LSBR}							{ return new Token(Token.LSBR, yytext(), yyline+1, yycolumn+1); }
{RSBR}							{ return new Token(Token.RSBR, yytext(), yyline+1, yycolumn+1); }
{COMMA}							{ return new Token(Token.COMMA, yytext(), yyline+1, yycolumn+1); }
{NULL}							{ return new Token(Token.NULL, yytext(), yyline+1, yycolumn+1); }
\.\./(\.\.)*					{ return new Token(Token.TO, yytext(), yyline+1, yycolumn+1); }
//{STRING}						{ return new StringToken(Token.STR, yytext(), yyline+1, yycolumn+1,yytext()); }

/* Block für STR-Token mit Typkonvertierung */
\"          { yybegin(STR); textValue = new StringBuffer(); rawText = new StringBuffer(); rawText.append("\""); }
<STR>   {
    [0-9a-zA-Z ]    { textValue.append(yytext()); rawText.append(yytext()); }
    \\\"            { textValue.append("\""); rawText.append(yytext()); }
    \"              { yybegin(YYINITIAL); rawText.append(yytext()); return new StringToken(Token.STR, rawText.toString(), yyline+1, yycolumn+2-rawText.length(), textValue.toString()); }
}
	
/* Block für NUM-Token mit Typkonvertierung */
{DIGIT}		{ yybegin(NUM); numValue = yycharat(0)-'0'; 
			  textValue = new StringBuffer(); textValue.append(yytext());
			  fracValue = 0; fracDiv = 1; expValue = 0; }
<NUM>	{	
	{DIGIT}	{ numValue = numValue*10 + yycharat(0)-'0'; textValue.append(yytext()); }
	{ID}	{ yybegin(YYINITIAL); return new Token(Token.ID, textValue.toString()+yytext(), yyline+1, yycolumn+1-textValue.length()); }
	\.\./(\.\.)*	{ yybegin(YYINITIAL); yypushback(2); return new NumToken(Token.NUM, textValue.toString(), yyline+1, yycolumn, numValue); }
	\./(\.\.)+		{ yybegin(FRAC);  textValue.append(yytext()); }
	\.		{ yybegin(FRAC);  textValue.append(yytext()); }
	[^]		{ yybegin(YYINITIAL); yypushback(1);
			  return new NumToken(Token.NUM, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), numValue); }
	<<EOF>>	{ yybegin(YYINITIAL);  /* Kein Pushback von EOF! */
			  return new NumToken(Token.NUM, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), numValue); }
		}
 
 /* Blöcke für FRAC-Token */
 <FRAC>	{
 	{DIGIT}	{ fracValue = fracValue*10 + yycharat(0)-'0'; fracDiv = fracDiv * 10; textValue.append(yytext()); }
	\^{DIGIT}	{ yybegin(EXP);   expValue = expValue*10 + yycharat(1)-'0'; textValue.append(yytext()); yybegin(EXP); }
	[^]		{ yybegin(YYINITIAL); yypushback(1); 
			  return new FracToken(Token.FRAC, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), numValue+(fracValue*1.0)/fracDiv); }
	<<EOF>>	{ yybegin(YYINITIAL);  /* Kein Pushback von EOF! */
			  return new FracToken(Token.FRAC, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), numValue+(fracValue*1.0)/fracDiv); }
		}

<EXP>	{
 	{DIGIT}	{ expValue = expValue*10 + yycharat(0)-'0'; textValue.append(yytext()); }
	[^]		{ yybegin(YYINITIAL); yypushback(1);
			  return new FracToken(Token.FRAC, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), (numValue+(fracValue*1.0)/fracDiv)*Math.pow(10,expValue)); }
	<<EOF>>	{ yybegin(YYINITIAL);  /* Kein Pushback von EOF! */
			  return new FracToken(Token.FRAC, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), (numValue+(fracValue*1.0)/fracDiv)*Math.pow(10,expValue)); }
		}
		
{ID}                    		{ return new Token(Token.ID, yytext(), yyline+1, yycolumn+1); }
{WS}            				{ /* eat whitespace */ }
[^]		        				{ return new Token(Token.INVALID, yytext(), yyline+1, yycolumn+1); }