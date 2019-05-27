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

    private void error(XTree tree, String message) {
        System.err.println("Error at "+tree.getLine()+","+tree.getCharPositionInLine()+": "+message);
    }

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
                                      if ($l.tree.exprType==XType.IntType && $r.tree.exprType==XType.IntType) {
                                        $op.tree.exprType=XType.IntType;
                                      } else if (($l.tree.exprType==XType.IntType || $l.tree.exprType==XType.FloatType) &&
                                                 ($r.tree.exprType==XType.IntType || $r.tree.exprType==XType.FloatType))   {
                                        $op.tree.exprType=XType.FloatType;
                                      } else if ($l.tree.exprType==XType.StringType && $r.tree.exprType==XType.StringType && $op.type==PLUS) {
                                        $op.tree.exprType=XType.StringType;
                                      } else {
                                        $op.tree.exprType=XType.InvalidType;
                                        error($op,$op.text+" is not valid for operands "+$l.tree.exprType+" and "+$r.tree.exprType+".");
                                      }
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
			| ID                    { if (!symbols.containsKey($ID.text)) {
                                        $ID.tree.exprType=XType.InvalidType;
                                        error($ID,"Variable "+$ID.text+" is not defined.");
                                      } else {
                                        $ID.tree.exprType=symbols.get($ID.text).type;
                                      }
			                        };

// Zuweisung
assignstat:	^(op=':=' ID e=expr) {
                if (!symbols.containsKey($ID.text)) {
                  $ID.tree.exprType=XType.InvalidType;
                  $op.tree.exprType=XType.InvalidType;
                  error($ID,"Variable "+$ID.text+" is not defined.");
                } else {
                  $ID.tree.exprType=symbols.get($ID.text).type;
                  if ($ID.tree.exprType==XType.FloatType && $expr.tree.exprType==XType.IntType) {
                    $op.tree.exprType=XType.FloatType;
                  } else if ($ID.tree.exprType!=$expr.tree.exprType) {
                    $op.tree.exprType=XType.InvalidType;
                    error($op,"An expression of type "+$expr.tree.exprType+
                              " cannot be assigned to a variable of type "+$ID.tree.exprType+".");
                  } else {
                    $op.tree.exprType=$ID.tree.exprType;
                  }
                }
                };

// Bedingungen
cond:		^(op=('<' |'>' |'=') l=expr r=expr) {
                                    if ($l.tree.exprType==XType.StringType || $r.tree.exprType==XType.StringType) {
                                        error($op,$op.text+" is not valid for string operands.");
                                    } else if ($l.tree.exprType==XType.IntType && $r.tree.exprType==XType.IntType) {
                                        $op.tree.exprType=XType.IntType;
                                    } else {
                                        $op.tree.exprType=XType.FloatType;
                                    }
                                    };

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