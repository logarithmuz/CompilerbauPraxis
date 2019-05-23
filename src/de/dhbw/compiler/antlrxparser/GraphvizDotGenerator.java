package de.dhbw.compiler.antlrxparser;

import java.util.List;

import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;

public class GraphvizDotGenerator {
	
	public static String toGraphvizDot(CommonTree t) {
		StringBuffer dot = new StringBuffer();
		dot.append("digraph{ \n");
		appendNode(dot, t);
		appendEdges(dot, t);
		dot.append("}");
		return dot.toString();
	}

	private static void appendNode(StringBuffer dot, BaseTree t) {
		List<BaseTree> children = (List<BaseTree>) t.getChildren();
		dot.append("n" + t.hashCode());
		dot.append(" [label=\"" + t.getText().replace("\\", "\\\\").replace("\"", "\\\"") + "\"]\n");
		if (children != null) {
			for (BaseTree c : children) {
				appendNode(dot, c);
			}
		}
	}

	private static void appendEdges(StringBuffer dot, BaseTree t) {
		List<CommonTree> children = (List<CommonTree>) t.getChildren();
		if (children != null) {
			for (CommonTree c : children) {
				dot.append("n" + t.hashCode() + " -> n" + c.hashCode() + "\n");
			}
			for (CommonTree c : children) {
				appendEdges(dot, c);
			}
		}
	}

}
