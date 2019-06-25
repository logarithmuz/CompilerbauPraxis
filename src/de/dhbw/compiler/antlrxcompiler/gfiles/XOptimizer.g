tree grammar XOptimizer;

options {
  language = Java;
  output = AST;
  tokenVocab = XTypeCheck;
  ASTLabelType = XTree;
  filter=true;
}



@header {
    package de.dhbw.compiler.antlrxcompiler;
}

@members {

    private int intValue;
    private float floatValue;

    private String addString(String first, String last) {
      return first.substring(0, first.length()-1)+last.substring(1);
    }
    
    private String opInt(String first, String last, char op) {
      int firstValue = 0;
      int lastValue = 0;
      try {
        firstValue = Integer.parseInt(first);
        lastValue = Integer.parseInt(last);
      } catch (Exception e) {
        e.printStackTrace();
      }
      switch (op) {
        case '+': return Integer.toString(firstValue+lastValue);
        case '-': return Integer.toString(firstValue-lastValue);
        case '*': return Integer.toString(firstValue*lastValue);
        case '/': return Integer.toString(firstValue/lastValue);
        default: return "";
      }
     }
      
    private String opFloat(String first, String last, char op) {
      double firstValue = 0.0;
      double lastValue = 0.0;
      try {
	      firstValue = Double.parseDouble(first);
	      lastValue = Double.parseDouble(last);
      } catch (Exception e) {
        e.printStackTrace();
      }
      switch (op) {
        case '+': return Double.toString(firstValue+lastValue);
        case '-': return Double.toString(firstValue-lastValue);
        case '*': return Double.toString(firstValue*lastValue);
        case '/': return Double.toString(firstValue/lastValue);
        default: return "";
      }
     }
      
 }

bottomup: combineConst | multZeroOne | addZero | subZero;


combineConst:     ^('+' x=STRINGCONST y=STRINGCONST)
                  -> STRINGCONST[addString($x.text,$y.text)]
                | ^('+' x=INTCONST y=INTCONST) -> INTCONST[opInt($x.text,$y.text,'+')]
                | ^('-' x=INTCONST y=INTCONST) -> INTCONST[opInt($x.text,$y.text,'-')]
                | ^('*' x=INTCONST y=INTCONST) -> INTCONST[opInt($x.text,$y.text,'*')]
                | ^('/' x=INTCONST y=INTCONST) -> INTCONST[opInt($x.text,$y.text,'/')]
                | ^('+' (x=FLOATCONST) (y=INTCONST | y=FLOATCONST)) -> FLOATCONST[opFloat($x.text,$y.text,'+')]
                | ^('-' (x=FLOATCONST) (y=INTCONST | y=FLOATCONST)) -> FLOATCONST[opFloat($x.text,$y.text,'-')]
                | ^('*' (x=FLOATCONST) (y=INTCONST | y=FLOATCONST)) -> FLOATCONST[opFloat($x.text,$y.text,'*')]
                | ^('/' (x=FLOATCONST) (y=INTCONST | y=FLOATCONST)) -> FLOATCONST[opFloat($x.text,$y.text,'/')]
                | ^('+' (x=INTCONST) (y=FLOATCONST)) -> FLOATCONST[opFloat($x.text,$y.text,'+')]
                | ^('-' (x=INTCONST) (y=FLOATCONST)) -> FLOATCONST[opFloat($x.text,$y.text,'-')]
                | ^('*' (x=INTCONST) (y=FLOATCONST)) -> FLOATCONST[opFloat($x.text,$y.text,'*')]
                | ^('/' (x=INTCONST) (y=FLOATCONST)) -> FLOATCONST[opFloat($x.text,$y.text,'/')]
                | ^(UMINUS x=INTCONST) -> INTCONST["-"+$x.text]
                | ^(UMINUS x=FLOATCONST) -> FLOATCONST["-"+$x.text];

addZero:          ^('+' x=INTCONST {$x.text.equals("0")}? (^(op=('+' | '-' | '*' | '/' | ID) y=.* )))
                    -> ^($op $y*)
                | ^('+' ^(op=('+' | '-' | '*' | '/' | ID) y=.*) x=INTCONST {$x.text.equals("0")}?)
                    -> ^($op $y*);

subZero:          ^('-' ^(op=('+' | '-' | '*' | '/' | ID) y=.*) x=INTCONST {$x.text.equals("0")}?)
                    -> ^($op $y*);

multZeroOne:      ^('*' x=INTCONST {$x.text.equals("0")||$x.text.equals("1") }? (^(op=('+' | '-' | '*' | '/' | ID) y=.* )))
                    -> {$x.text.equals("0") }? $x
                    -> ^($op $y*)
                | ^('*' ^(op=('+' | '-' | '*' | '/' | ID) y=.*) x=INTCONST {$x.text.equals("0")||$x.text.equals("0")}?)
                    -> {$x.text.equals("0") }? $x
                    -> ^($op $y*);
