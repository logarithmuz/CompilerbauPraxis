/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Grammatik für Scanner und Parser
 * 
 * **********************************************
 */

grammar X; 
  
options {
  language = Java;
  output = AST;
}

// AST-Tokens
tokens { 
  DECL; 
  STATLIST;
  DECLLIST;
  UMINUS;
} 

@parser::header {package de.dhbw.compiler.antlrxparser;}
@lexer::header  {package de.dhbw.compiler.antlrxparser;}

fragment DIGIT0:	'0'..'9';
fragment DIGIT:		'1'..'9';
fragment LETTER:	'a'..'z' | 'A'..'Z';
fragment SYMBOL:	'\\"' | '.' | ':' | ' ';

ID: 			LETTER ( LETTER | DIGIT0 )*;
INTCONST:		DIGIT DIGIT0* | '0';
FLOATCONST:		(INTCONST ('.' DIGIT0*)? ('e'|'E')('+' |'-' )? INTCONST) => INTCONST ('.' DIGIT0*)? ('e'|'E')('+' |'-' )? INTCONST   | INTCONST ('.' DIGIT0*)?;
STRINGCONST:	'\"' ( LETTER | SYMBOL )* '\"';
WS:  			('\t'|' '|'\r'|'\n'|'\f')+ {skip();};
INVALID:  		.;



program:		'program' ID ';' declist block '.' EOF -> ^('program' ID ^(DECLLIST declist?) block);
declist:		declaration*;
block: 			'begin' stmtlist 'end' -> ^(STATLIST stmtlist?);
stmtlist:		stmtWithSemi*;

stmtWithSemi:	stmt ';' -> stmt;
stmt:			assignStmt | condStmt | whileStmt | forStmt | block;
declaration:	modifier? ID ':' type ';' -> ^(DECL ID type modifier?);

assignStmt:		ID ':=' numExpr -> ^(':=' ID numExpr);
condStmt: 		'if'^ cond 'then'! stmt (options{greedy=true;}: 'else'! stmt)?;
whileStmt:		'while' '(' cond ')' stmt -> ^('while' cond stmt);
forStmt:		'for' '(' assignStmt ';' cond ';' assignStmt ')' stmt -> ^('for' assignStmt cond assignStmt stmt);

cond:			numExpr comperator^ numExpr;
comperator:		'<' | '=' | '>';
modifier:		'read' 'print' | 'read' | 'print';
type:			'int' | 'float' | 'string';

numExpr: 		numExpr2 (('+'^ | '-'^) numExpr2 )*;
numExpr2:		numExpr3 (('*'^ | '/'^) numExpr3 )*;
numExpr3:		INTCONST | FLOATCONST | STRINGCONST | ID | '(' numExpr ')' -> numExpr| op='-' number -> ^(UMINUS[op, "UMINUS"] number);
number:			INTCONST | FLOATCONST;
