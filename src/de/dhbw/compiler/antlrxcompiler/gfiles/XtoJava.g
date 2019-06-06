tree grammar XtoJava;

options {
  language = Java;
  output = template;
  tokenVocab = XOptimizer;
  ASTLabelType = XTree;
}

@header {
    package de.dhbw.compiler.antlrxcompiler;
}

@members {

  private SymbolTable  symbols = SymbolTable.getInstance();  
     
}

// Deklarationen
decl:		^(DECL ID type) -> template(type={$type.st}, name={$ID.text}) <<<type> <name>;
>>
			| ^(DECL ID type 'read') -> template(type={$type.st}, name={$ID.text}) <<<type> <name>;
>>
			| ^(DECL ID type 'print') -> template(type={$type.st}, name={$ID.text}) <<<type> <name>;
>>
			| ^(DECL ID type 'read' 'print') -> template(type={$type.st}, name={$ID.text}) <<<type> <name>;
>>;

type:		'int' -> template() "int"
            | 'float' -> template() "float"
            | 'string' -> template() "String";

decllist:	^(DECLLIST (s+=decl)+) -> template(t={$s}) "<t>"
            | DECLLIST -> template() "";

// Ausdr�cke
expr:		^(op=('+' | '-' | '*' | '/') expr1=expr expr2=expr) -> template(o={$op.text}, e1={$expr1.st}, e2={$expr2.st}) "<e1><o><e2>"
			| ^(UMINUS z=(INTCONST | FLOATCONST)) -> template(t={$z.text}) "-<t>"
			| INTCONST -> template(t={$INTCONST.text}) "<t>"
			| FLOATCONST -> template(t={$FLOATCONST.text}) "<t>"
			| ID -> template(t={$ID.text}) "<t>"
			| STRINGCONST -> template(t={$STRINGCONST.text}) "<t>";

// Zuweisung
assignstat:	^(':=' ID expr) -> template(id={$ID.text}, e={$expr.st}) "<id> = <e>";

// Bedingungen
cond:		^(comp=('<' |'>' |'=') expr1=expr expr2=expr) -> template(c={$comp.text}, e1={$expr1.st}, e2={$expr2.st}) "<e1><c><e2>";

// Bedingte Zuweisung
condstat:	^('if' cond stat1=stat stat2=stat? ) -> template(c={$cond.st}, s1={$stat1.st}, s2={$stat2.st}) <<if (<c>) {
    <s1>} else {
    <s2>}>>;

// Schleifen
whilestat:	^('while' cond stat) -> template(c={$cond.st}, s={$stat.st}) <<while (<c>) {
    <s>}>>;

forstat:	^('for' assignstat1=assignstat cond assignstat2=assignstat stat) ->
                    template(as1={$assignstat1.st}, c={$cond.st}, as2={$assignstat2.st}, s={$stat.st}) <<for (<as1>;<c>;<as2>) {
    <s>}>>;

// Anweisungen
stat:		s=assignstat -> template(t={$s.st}) <<<t>;
>>
            | s=condstat -> template(t={$s.st}) <<<t>
>>
            | s=whilestat -> template(t={$s.st})<<<t>
>>
            | s=forstat -> template(t={$s.st})  <<<t>
>>
            | s=statlist -> template(t={$s.st}) <<<t> >>;

statlist:	^(STATLIST (s+=stat)+) -> template(t={$s}) "<t>"
            | STATLIST -> template() "";

// Programme
program:	^('program' ID decllist statlist) -> template(name={$ID.text}, d={$decllist.st}, s={$statlist.st})
<<package de.dhbw.compiler.antlrxcompiler;

public class <name> {
    public static void main (String[] args) {
        <d>
        <s>
    }
}>>;
