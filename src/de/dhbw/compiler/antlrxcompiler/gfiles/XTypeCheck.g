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
    STRING='string';

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
decl:		^(DECL ID t=('int' | 'float'| 'string') modifier?){
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
                                    if ($r.tree.exprType == $l.tree.exprType)
                                        $op.tree.exprType = $r.tree.exprType;
                                    else if ($r.tree.exprType == XType.FloatType && $l.tree.exprType == XType.IntType
                                      || $r.tree.exprType == XType.IntType && $l.tree.exprType == XType.FloatType)
                                        $op.tree.exprType = XType.FloatType;
                                    else
                                        $op.tree.exprType = XType.InvalidType;
                                    }
			| INTCONST              { $INTCONST.tree.exprType = XType.IntType; }
			| ^(UMINUS INTCONST)    { $INTCONST.tree.exprType = XType.IntType;
			                          $UMINUS.tree.exprType = XType.IntType;
			                        }
			| FLOATCONST            { $FLOATCONST.tree.exprType = XType.FloatType; }
			| ^(UMINUS FLOATCONST)  { $FLOATCONST.tree.exprType = XType.FloatType;
			                          $UMINUS.tree.exprType = XType.FloatType;
			                        }
			| STRINGCONST           { $STRINGCONST.tree.exprType = XType.StringType; }
			| ID                    { if (symbols.containsKey($ID.getText()))
			                            $ID.tree.exprType = symbols.get($ID.getText()).type;
			                          else
			                            $ID.tree.exprType = XType.InvalidType;
			                        };

// Zuweisung
assignstat:	^(assign=':=' ID e=expr) {
                if (symbols.containsKey($ID.getText())) {
                    $ID.tree.exprType = symbols.get($ID.getText()).type;
                } else {
                    $ID.tree.exprType = XType.InvalidType;
                    System.out.println("Cannot resolve variable " + $ID.getText());
                }
                if ($ID.tree.exprType == $e.tree.exprType)
                    $assign.tree.exprType = $ID.tree.exprType;
                else if ($ID.tree.exprType == XType.FloatType && $e.tree.exprType == XType.IntType)
                    $assign.tree.exprType = XType.FloatType;
                else {
                    $assign.tree.exprType = XType.InvalidType;
                    System.out.println("Cannot assign " + $e.tree.exprType + " value to variable " + $ID.getText() +
                                        " with type " + $ID.tree.exprType);
                }
                };

// Bedingungen
cond:		^(c=comp l=expr r=expr) {if ($r.tree.exprType == $l.tree.exprType)
                                        $c.tree.exprType = $r.tree.exprType;
                                    else
                                        $c.tree.exprType = XType.InvalidType; };
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