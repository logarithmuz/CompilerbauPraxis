/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Main-Klasse
 * 
 * **********************************************
 */

package de.dhbw.compiler.antlrxcompiler;

import java.io.*;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplate;

import static org.junit.Assert.assertEquals;

public class AntlrXCompiler {

	public static void saveToGrapvizDOT(Tree tree, String name) throws FileNotFoundException {
		StringTemplate dot = (new DOTTreeGenerator()).toDOT(tree);
		PrintWriter out = new PrintWriter(name);
		out.println(dot.toString());
		out.close();
	}
	
	public static void saveToJavaFile(StringTemplate template, String name) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(name);
		out.println(template.toString());
		out.close();
	}
	
	private static final String TEST = 
			"program test2;\n"+
			"	x : int;\n"+
			"	y : float;\n"+
			"	z : string;\n"+
			"begin\n"+
			"	x := 4+5+6.2;\n"+
			"	y := 3.56+1.2e3+45.e-67+4e34+3E-1;\n"+
			"	z := \"Hello \\\"World\\\"\" + \":\";\n"+
			"	z := \"Peter\" + 4;\n"+
			"   if 2<3 then abc := 5 else abc := 7;\n"+
			"   while (x>y) y := y+1;\n"+
			"   begin\n"+
			"      for (x:=1; x<6; x:=x+1) y:=y+2;\n"+
			"   end;\n"+
			"end.";
	
	private static final String TEST2 = 
			"program test2;\n"+
			"begin\n"+
			"	x := 4-5*6*7+8/9;\n"+
			"	y := 0*x;\n"+
			"end.";

	private static final String BEISPIELFOLIEN = 
			"program test5;\n"+
			"	read  x : int;\n"+
			"	print y : float;\n"+
			"	z : int;\n"+
			"begin\n"+
			"	while (x<4) begin\n"+
			"		for (z:=0; z<4; z:=z+1) x:=x+2;\n"+
			"		if x=4 then begin\n"+
			"			x:=z*(x+2);\n"+
			"			x:=x+10;\n"+
			"		end else y:=100.e-3;\n"+
			"	end;\n"+
			"end.\n";
	
	public static void main(String[] args) throws Exception {

		String test =	"program exprAll;\n"+
				"  x: int;"+
				"  y: int;"+
				"  z: int;"+
				"begin\n"+
				"	x :=0*x+y;"+
				"end.";

		XTreeAdaptor xTreeAdaptor = new XTreeAdaptor();
		ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(TEST.getBytes()));
		XLexer lexer = new XLexer(input);
		XParser parser = new XParser(new CommonTokenStream(lexer));
		parser.setTreeAdaptor(xTreeAdaptor);
		XTree out = parser.program().getTree();

		XtoJava xToJava = new XtoJava(new CommonTreeNodeStream(xTreeAdaptor, out));
		StringTemplate template = (StringTemplate) xToJava.program().getTemplate();
		System.out.println(template.toString());

		FileWriter fw = new FileWriter(new File("src/de/dhbw/compiler/antlrxcompiler/test2.java"));
		fw.write(template.toString());
		fw.flush();
		fw.close();
	}
}
