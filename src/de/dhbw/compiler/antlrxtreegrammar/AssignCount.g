tree grammar AssignCount;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = CommonTree;
}

@header {package de.dhbw.compiler.antlrxtreegrammar;}

@members {

  private int count =0;
  
  public int getCount() { return count; }
  
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
assignstat:	^(':=' ID expr) {count++;};

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
