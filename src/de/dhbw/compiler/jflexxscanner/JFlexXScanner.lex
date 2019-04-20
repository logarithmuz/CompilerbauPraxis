/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Scanner-Definition
 * 
 * **********************************************
 */


package de.dhbw.compiler.jflexxscanner;

%%

%class JFlexXScanner
%type Token
%function nextToken


%unicode
%line
%column

%xstate NUM, FRAC, EXP, STR, INVALID

%{
	StringBuffer textValue;
	int numValue;
	int fracValue;
	int fracDiv;
	int expValue;
	StringBuffer strValue;
%}

%public
%final

WS = [ \t\n\r\b]+
DIGIT0 = [0-9]
DIGIT = [1-9]
LETTER = [a-zA-Z]
OTHER = [ .:]|\\\"
ID = {LETTER}({LETTER}|{DIGIT0})*

NUMBER = 0|{DIGIT}{DIGIT0}*
INTCONST = {NUMBER}
FLOATCONST = {NUMBER}\.{DIGIT0}*((e|E)\-?{NUMBER})?
STRCONST = \"({LETTER}|{DIGIT0}|{OTHER})*\"

%%

{WS}                { }

program             { return new Token(Token.PROGRAM, yytext(), yyline+1, yycolumn+1); }
begin               { return new Token(Token.BEGIN, yytext(), yyline+1, yycolumn+1); }
end                 { return new Token(Token.END, yytext(), yyline+1, yycolumn+1); }
print               { return new Token(Token.PRINT, yytext(), yyline+1, yycolumn+1); }
read                { return new Token(Token.READ, yytext(), yyline+1, yycolumn+1); }
int                 { return new Token(Token.INT, yytext(), yyline+1, yycolumn+1); }
float               { return new Token(Token.FLOAT, yytext(), yyline+1, yycolumn+1); }
string              { return new Token(Token.STRING, yytext(), yyline+1, yycolumn+1); }
if                  { return new Token(Token.IF, yytext(), yyline+1, yycolumn+1); }
then                { return new Token(Token.THEN, yytext(), yyline+1, yycolumn+1); }
else                { return new Token(Token.ELSE, yytext(), yyline+1, yycolumn+1); }
for                 { return new Token(Token.FOR, yytext(), yyline+1, yycolumn+1); }
while               { return new Token(Token.WHILE, yytext(), yyline+1, yycolumn+1); }

\:\=                { return new Token(Token.ASSIGN, yytext(), yyline+1, yycolumn+1); }
\=                  { return new Token(Token.EQUALS, yytext(), yyline+1, yycolumn+1); }
\<                  { return new Token(Token.LESS, yytext(), yyline+1, yycolumn+1); }
\>                  { return new Token(Token.MORE, yytext(), yyline+1, yycolumn+1); }

\+                  { return new Token(Token.PLUS, yytext(), yyline+1, yycolumn+1); }
\-                  { return new Token(Token.MINUS, yytext(), yyline+1, yycolumn+1); }
\*                  { return new Token(Token.MULT, yytext(), yyline+1, yycolumn+1); }
\/                  { return new Token(Token.DIV, yytext(), yyline+1, yycolumn+1); }

\.                  { return new Token(Token.DOT, yytext(), yyline+1, yycolumn+1); }
\(                  { return new Token(Token.LBR, yytext(), yyline+1, yycolumn+1); }
\)                  { return new Token(Token.RBR, yytext(), yyline+1, yycolumn+1); }
\:                  { return new Token(Token.COLON, yytext(), yyline+1, yycolumn+1); }
\;                  { return new Token(Token.SEMICOLON, yytext(), yyline+1, yycolumn+1); }

//{FLOATCONST}      { return new FloatConstToken(Token.FLOATCONST, yytext(), yyline+1, yycolumn+1); }
//{INTCONST}        { return new IntConstToken(Token.INTCONST, yytext(), yyline+1, yycolumn+1, 0); }
//{STRCONST}        { return new Token(Token.STRINGCONST, yytext(), yyline+1, yycolumn+1); }
{ID}                { return new Token(Token.ID, yytext(), yyline+1, yycolumn+1); }


\"          { yybegin(STR); strValue = new StringBuffer(); textValue = new StringBuffer(); textValue.append("\""); }
<STR>   {
    [0-9a-zA-Z .:]  { strValue.append(yytext()); textValue.append(yytext()); }
    \\\"            { strValue.append("\""); textValue.append(yytext()); }
    \"              { yybegin(YYINITIAL); textValue.append(yytext()); return new StringConstToken(Token.STRINGCONST, textValue.toString(), yyline+1, yycolumn+2-textValue.length(), strValue.toString()); }
    [^]             { yybegin(YYINITIAL); textValue.append(yytext()); return new Token(Token.INVALID,  textValue.toString(), yyline+1, yycolumn+2-textValue.length()); }
    <<EOF>>         { yybegin(YYINITIAL); return new Token(Token.INVALID,  textValue.toString(), yyline+1, yycolumn+1-textValue.length()); }
}

/* Block für NUM-Token mit Typkonvertierung */
{DIGIT}	            { yybegin(NUM); numValue = yycharat(0)-'0';
			          textValue = new StringBuffer(); textValue.append(yytext());
			          fracValue = 0; fracDiv = 1; expValue = 0; }
0\.                 { yybegin(FRAC); numValue = 0; textValue = new StringBuffer(); textValue.append(yytext()); fracValue = 0; fracDiv = 1; expValue = 0; }
0                   { yybegin(YYINITIAL); numValue = 0; textValue = new StringBuffer(); textValue.append(yytext());
                      return new IntConstToken(Token.INTCONST, textValue.toString(), yyline+1, yycolumn+1, numValue); }

<NUM>	{
	{DIGIT0}        { numValue = numValue*10 + yycharat(0)-'0'; textValue.append(yytext()); }
	\.           	{ yybegin(FRAC);  textValue.append(yytext()); }
	(e|E)\-?0   	{ yybegin(YYINITIAL); textValue.append(yytext());
    	              return new FloatConstToken(Token.FLOATCONST, textValue.toString(), yyline+1, yycolumn+1-textValue.length()+yytext().length(), (float) ((numValue+(fracValue*1.0)/fracDiv))); }
    (e|E){DIGIT}	{ yybegin(EXP);   expValue = expValue*10 + yycharat(1)-'0'; textValue.append(yytext()); yybegin(EXP); }
    (e|E)\-{DIGIT}	{ yybegin(EXP);   expValue = expValue*(-10) + yycharat(1)-'0'; textValue.append(yytext()); yybegin(EXP); }
	[^]		        { yybegin(YYINITIAL); yypushback(1); return new IntConstToken(Token.INTCONST, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), numValue); }
	<<EOF>>	        { yybegin(YYINITIAL); /* kein Pushback bei EOF */ ;
	                  return new IntConstToken(Token.INTCONST, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), numValue); }
		}

/* Blöcke für FRAC-Token */

<FRAC>	{
 	{DIGIT0}        { fracValue = fracValue*10 + yycharat(0)-'0'; fracDiv = fracDiv * 10; textValue.append(yytext()); }
	(e|E)\-?0   	{ yybegin(YYINITIAL); textValue.append(yytext());
	                  return new FloatConstToken(Token.FLOATCONST, textValue.toString(), yyline+1, yycolumn+1-textValue.length()+yytext().length(), (float) ((numValue+(fracValue*1.0)/fracDiv))); }
    (e|E){DIGIT}	{ yybegin(EXP);   expValue = expValue*10 + yycharat(1)-'0'; textValue.append(yytext()); yybegin(EXP); }
    (e|E)\-{DIGIT}	{ yybegin(EXP);   expValue = expValue*(-10) + yycharat(1)-'0'; textValue.append(yytext()); yybegin(EXP); }
    [^]		        { yybegin(YYINITIAL); yypushback(1);
			          return new FloatConstToken(Token.FLOATCONST, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), (float) (numValue+(fracValue*1.0)/fracDiv)); }
	<<EOF>>	        { yybegin(YYINITIAL);  /* Kein Pushback von EOF! */
			          return new FloatConstToken(Token.FLOATCONST, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), (float) (numValue+(fracValue*1.0)/fracDiv)); }
		}

<EXP>	{
 	{DIGIT0}        { expValue = expValue*10 + yycharat(0)-'0'; textValue.append(yytext()); }
	[^]		        { yybegin(YYINITIAL); yypushback(1);
			          return new FloatConstToken(Token.FLOATCONST, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), (float) ((numValue+(fracValue*1.0)/fracDiv)*Math.pow(10,expValue))); }
	<<EOF>>	        { yybegin(YYINITIAL);  /* Kein Pushback von EOF! */
			          return new FloatConstToken(Token.FLOATCONST, textValue.toString(), yyline+1, yycolumn+1-textValue.length(), (float) ((numValue+(fracValue*1.0)/fracDiv)*Math.pow(10,expValue))); }
		}

(\/\*)~(\/\*)       {   }
[^]					{ return new Token(Token.INVALID,  yytext(), yyline+1, yycolumn+1); }
<<EOF>>             { return new Token(Token.EOF, yytext(), yyline+1, yycolumn+1); }