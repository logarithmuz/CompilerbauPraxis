tree grammar XTypeCheck;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = XTree;
}

tokens{
  PLUS='+';
}

@header {
package de.dhbw.compiler.antlrxcompiler;
   
import java.util.HashMap;
}

@members {

   private SymbolTable  symbols = SymbolTable.getInstance();  
   
}


// Deklarationen
decl:		^(DECL ID type)
			| ^(DECL ID type 'read')
			| ^(DECL ID type 'print')
			| ^(DECL ID type 'read' 'print');

type:		'int' | 'float' | 'string';

decllist:	^(DECLLIST decl*);

// Ausdr�cke
expr:		^(('+' | '-' | '*' | '/') expr expr)
			| INTCONST | ^(UMINUS INTCONST)
			| FLOATCONST | ^(UMINUS FLOATCONST)
			| ID | STRINGCONST;

// Zuweisung
assignstat:	^(':=' ID expr);

// Bedingungen
cond:		^(comp expr expr);
comp:		'<' |'>' |'=';

// Bedingte Zuweisung
condstat:	^('if' cond stat stat? );

// Schleifen
whilestat:	^('while' cond stat);
forstat:	^('for' assignstat cond assignstat stat);

// Anweisungen
stat:		assignstat | condstat | whilestat | forstat | statlist;

statlist:	^(STATLIST stat*);

// Programme
program:	^('program' ID decllist statlist);

