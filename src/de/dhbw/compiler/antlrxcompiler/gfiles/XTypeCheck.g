tree grammar XTypeCheck;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = XTree;
}

tokens{
    PLUS='+';
    MINUS='-';
    MULT='*';
    DIV='/';

    INT='int';
    FLOAT='float';
    STRING='String';

    ASSIGN=':=';
}

@header {
package de.dhbw.compiler.antlrxcompiler;
   
import java.util.HashMap;
}

@members {

   private SymbolTable  symbols = SymbolTable.getInstance();

}


// Deklarationen
decl:		^(DECL ID t=('int' | 'float'| 'string') modifier){
                if ($t.token.getType() == INT)
                    symbols.put($ID.getText(), new Symbol($ID.getText(), XType.IntType));
                if ($t.token.getType() == FLOAT)
                    symbols.put($ID.getText(), new Symbol($ID.getText(), XType.FloatType));
                if ($t.token.getType() == STRING)
                    symbols.put($ID.getText(), new Symbol($ID.getText(), XType.StringType));
                };

modifier:   'read' | 'print' | 'read' 'print';

decllist:	^(DECLLIST decl*);

// Ausdr�cke
expr:		^(op=('+' | '-' | '*' | '/') r=expr l=expr ){
                                    if ($r.tree.exprType == XType.IntType && $l.tree.exprType == XType.IntType)
                                        $op.tree.exprType = XType.IntType;
                                    if ($r.tree.exprType == XType.FloatType && $l.tree.exprType == XType.IntType
                                      ||$r.tree.exprType == XType.IntType && $l.tree.exprType == XType.FloatType
                                      ||$r.tree.exprType == XType.FloatType && $l.tree.exprType == XType.FloatType)
                                        $op.tree.exprType = XType.FloatType;
                                    }
			| INTCONST              { $INTCONST.tree.exprType = XType.IntType; }
			| ^(UMINUS INTCONST)    { $INTCONST.tree.exprType = XType.IntType; $UMINUS.tree.exprType = XType.IntType; }
			| FLOATCONST            { $FLOATCONST.tree.exprType = XType.FloatType; }
			| ^(UMINUS FLOATCONST)  { $FLOATCONST.tree.exprType = XType.FloatType; $UMINUS.tree.exprType = XType.FloatType; }
			| ID                    { $ID.tree.exprType = symbols.get($ID.getText()).type; }
			| STRINGCONST           { $STRINGCONST.tree.exprType = XType.StringType; } ;

// Zuweisung
assignstat:	^(assign=':=' ID expr) {
                $ID.tree.exprType = symbols.get($ID.getText()).type;
                $assign.tree.exprType = $ID.tree.exprType;};

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