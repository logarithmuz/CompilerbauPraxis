/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 *
 * Vorlesung Übersetzerbau
 * Praxis X Abstiegsparser
 * - Abstiegsparser
 *
 * **********************************************
 */

package de.dhbw.compiler.xparser;

public class XParser {

	private long comparecount = 0;
	private TokenReader in;

	public long getComparecount() {
		return comparecount;
	}

	public XParser(TokenReader in) {
		this.in = in;
	}

	/**
	 * aProgram := program id ";" block "." eof
	 *
	 * @return
	 */
	public Tree parseAProgram() {
		int myPosition = in.getPosition();
		Tree program, programName, declist, block;
		if ((program = parseToken(Token.PROGRAM)) != null
				&& (programName = parseToken(Token.ID)) != null
				&& parseToken(Token.SEMICOLON) != null
				&& (declist = parseDeclist()) != null
				&& (block = parseBlock()) != null
				&& parseToken(Token.DOT) != null
				&& parseToken(Token.EOF) != null) {
			program.addLastChild(programName);
			program.addLastChild(declist);
			program.addLastChild(block);
			return program;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * declist := {declaration}
	 *
	 * @return
	 */
	private Tree parseDeclist() {
		Tree t = new Tree(new Token(Token.DECLLIST));
		Tree declaration;
		while ((declaration = parseDeclaration()) != null) {
			t.addLastChild(declaration);
		}
		return t;
	}

	/**
	 * declaration := modifier id ":" type ";"
	 *
	 * @return
	 */
	private Tree parseDeclaration() {
		int myPosition = in.getPosition();
		Tree t = new Tree(new Token(Token.DECL));
		Tree modifier, id, type;
		modifier = parseModifier();
		if ((id = parseToken(Token.ID)) != null
				&& parseToken(Token.COLON) != null
				&& (type = parseType()) != null
				&& parseToken(Token.SEMICOLON) != null) {
			t.addLastChild(id);
			t.addLastChild(type);
			for (int i = 0; i < modifier.getChildCount(); i++) {
				t.addLastChild(modifier.getChild(i));
			}
			return t;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * modifier := [read] [print]
	 *
	 * @return
	 */
	private Tree parseModifier() {
		Tree t = new Tree(new Token(Token.MODIFIER));
		Tree read, print;
		if ((read = parseToken(Token.READ)) != null) {
			t.addLastChild(read);
		}
		if ((print = parseToken(Token.PRINT)) != null) {
			t.addLastChild(print);
		}
		return t;
	}

	/**
	 * type := int | float | string
	 *
	 * @return
	 */
	private Tree parseType() {
		int myPosition = in.getPosition();
		Tree intType, floatType, stringType;
		if ((intType = parseToken(Token.INT)) != null) {
			return intType;
		}
		if ((floatType = parseToken(Token.FLOAT)) != null) {
			return floatType;
		}
		if ((stringType = parseToken(Token.STRING)) != null) {
			return stringType;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * block := begin stmtList end
	 *
	 * @return
	 */
	private Tree parseBlock() {
		int myPosition = in.getPosition();
		Tree stmtList;
		if (parseToken(Token.BEGIN) != null
				&& (stmtList = parseStmtList()) != null
				&& parseToken(Token.END) != null) {
			return stmtList;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * stmtlist := {stmtWithSemi}
	 *
	 * @return
	 */
	private Tree parseStmtList() {
		Tree t = new Tree(new Token(Token.STATLIST));
		Tree stmtWithSemi;
		while ((stmtWithSemi = parseStmtWithSemi()) != null) {
			t.addLastChild(stmtWithSemi);
		}
		return t;
	}

	/**
	 * stmtWithSemi := stmt ";"
	 *
	 * @return
	 */
	private Tree parseStmtWithSemi() {
		int myPosition = in.getPosition();
		Tree stmt;
		if ((stmt = parseStmt()) != null
				&& parseToken(Token.SEMICOLON) != null) {
			return stmt;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * stmt := assignStat | condStat | block
	 *
	 * @return
	 */
	private Tree parseStmt() {
		int myPosition = in.getPosition();
		Tree assignStmt, condStmt, whileStmt, forStmt, block;
		if (((assignStmt = parseAssignStmt()) != null)) {
			return assignStmt;
		}
		if (((condStmt = parseCondStmt()) != null)) {
			return condStmt;
		}
		if ((whileStmt = parseWhileStmt()) != null) {
			return whileStmt;
		}
		if ((forStmt = parseForStmt()) != null) {
			return forStmt;
		}
		if (((block = parseBlock()) != null)) {
			return block;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * forStmt := "for" "(" assignStmt ";" cond ";" assignStmt ")" stmt
	 *
	 * @return
	 */
	private Tree parseForStmt() {
		int myPosition = in.getPosition();
		Tree forToken, numAssign, cond, numAssign2, stmt;
		if ((forToken = parseToken(Token.FOR)) != null
				&& parseToken(Token.LBR) != null
				&& (numAssign = parseAssignStmt()) != null
				&& parseToken(Token.SEMICOLON) != null
				&& (cond = parseCond()) != null
				&& parseToken(Token.SEMICOLON) != null
				&& (numAssign2 = parseAssignStmt()) != null
				&& parseToken(Token.RBR) != null
				&& (stmt = parseStmt()) != null) {
			forToken.addLastChild(numAssign);
			forToken.addLastChild(cond);
			forToken.addLastChild(numAssign2);
			forToken.addLastChild(stmt);
			return forToken;
		}

		in.setPosition(myPosition);
		return null;
	}

	/**
	 * whileStmt := "while" "(" cond ")" stmt
	 *
	 * @return
	 */
	private Tree parseWhileStmt() {
		int myPosition = in.getPosition();
		Tree whileToken, cond, stmt;
		if ((whileToken = parseToken(Token.WHILE)) != null
				&& parseToken(Token.LBR) != null
				&& (cond = parseCond()) != null
				&& parseToken(Token.RBR) != null
				&& (stmt = parseStmt()) != null) {
			whileToken.addLastChild(cond);
			whileToken.addLastChild(stmt);
			return whileToken;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * condStmt := "if" cond "then" stat ["else" stat]
	 *
	 * @return
	 */
	private Tree parseCondStmt() {
		int myPosition = in.getPosition();
		Tree ifToken, cond, stmt1, stmt2;
		if ((ifToken = parseToken(Token.IF)) != null
				&& (cond = parseCond()) != null
				&& parseToken(Token.THEN) != null
				&& (stmt1 = parseStmt()) != null) {
			int myPositionAfterIfBlock = in.getPosition();
			ifToken.addLastChild(cond);
			ifToken.addLastChild(stmt1);
			if (parseToken(Token.ELSE) != null
					&& (stmt2 = parseStmt()) != null) {
				ifToken.addLastChild(stmt2);
				return ifToken;
			}
			in.setPosition(myPositionAfterIfBlock);
			return ifToken;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * cond := numExpr comperator numExpr
	 *
	 * @return
	 */
	private Tree parseCond() {
		int myPosition = in.getPosition();
		Tree numExpr1, numExpr2, comp;
		if ((numExpr1 = parseNumExpr(null)) != null
				&& (comp = parseComp()) != null
				&& (numExpr2 = parseNumExpr(null)) != null) {
			comp.addLastChild(numExpr1);
			comp.addLastChild(numExpr2);
			return comp;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * comp := < | > | =
	 *
	 * @return
	 */
	private Tree parseComp() {
		int myPosition = in.getPosition();
		Tree t;
		if ((t = parseToken(Token.LESS)) != null) {
			return t;
		}
		if ((t = parseToken(Token.EQUALS)) != null) {
			return t;
		}
		if ((t = parseToken(Token.MORE)) != null) {
			return t;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * assignStmt := id ":=" numExpr
	 *
	 * @return
	 */
	private Tree parseAssignStmt() {
		int myPosition = in.getPosition();
		Tree id, assign, numExpr;
		if ((id = parseToken(Token.ID)) != null
				&& (assign = parseToken(Token.ASSIGN)) != null
				&& (numExpr = parseNumExpr(null)) != null) {
			assign.addLastChild(id);
			assign.addLastChild(numExpr);
			return assign;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * builds a leave from a previous leftTree and a numExpr that should be appended
	 *
	 * @param leftTree the previous leftTree. Can be null if there is no previous left tree
	 * @param numExpr  the numExpr that should be appended
	 * @return
	 */
	private Tree buildLeave(Tree leftTree, Tree numExpr) {
		Tree leave;
		if (leftTree == null) {
			leave = numExpr;
		} else {
			leave = leftTree;
			leave.addLastChild(numExpr);
		}
		return leave;
	}

	/**
	 * numExpr := numExpr2 "+" numExpr | numExpr2 "-" numExpr | numExpr2
	 *
	 * @return
	 */
	private Tree parseNumExpr(Tree leftTree) {
		int myPosition = in.getPosition();
		Tree numExpr1, numExpr2, operator;

		// numExpr2 + numExpr
		if ((numExpr1 = parseNumExpr2(null)) != null
				&& (operator = parseToken(Token.PLUS)) != null) {
			leftTree = buildLeave(leftTree, numExpr1);
			operator.addLastChild(leftTree);
			if ((numExpr2 = parseNumExpr(operator)) != null) {
				return numExpr2;
			}
		}
		in.setPosition(myPosition);

		// numExpr2 - numExpr
		if ((numExpr1 = parseNumExpr2(null)) != null
				&& (operator = parseToken(Token.MINUS)) != null) {
			leftTree = buildLeave(leftTree, numExpr1);
			operator.addLastChild(leftTree);
			if ((numExpr2 = parseNumExpr(operator)) != null) {
				return numExpr2;
			}
		}
		in.setPosition(myPosition);

		// numExpr2
		if ((numExpr1 = parseNumExpr2(null)) != null) {
			leftTree = buildLeave(leftTree, numExpr1);
			return leftTree;
		}
		in.setPosition(myPosition);
		return null;
	}


	/**
	 * numExpr2 := numExpr3 "*" numExpr2 | numExpr3 "/" numExpr2
	 *
	 * @return
	 */
	private Tree parseNumExpr2(Tree leftTree) {
		int myPosition = in.getPosition();
		Tree numExpr1, numExpr2, operator;

		// numExpr3 * numExpr2
		if ((numExpr1 = parseNumExpr3()) != null
				&& (operator = parseToken(Token.MULT)) != null) {
			leftTree = buildLeave(leftTree, numExpr1);
			operator.addLastChild(leftTree);
			if ((numExpr2 = parseNumExpr2(operator)) != null) {
				return numExpr2;
			}
		}
		in.setPosition(myPosition);

		// numExpr3 / numExpr2
		if ((numExpr1 = parseNumExpr3()) != null
				&& (operator = parseToken(Token.DIV)) != null) {
			leftTree = buildLeave(leftTree, numExpr1);
			operator.addLastChild(leftTree);
			if ((numExpr2 = parseNumExpr2(operator)) != null) {
				return numExpr2;
			}
		}
		in.setPosition(myPosition);

		// numExpr3
		if ((numExpr1 = parseNumExpr3()) != null) {
			leftTree = buildLeave(leftTree, numExpr1);
			return leftTree;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * numExpr3 := intConst | id | "(" numExpr ")"
	 *
	 * @return
	 */
	private Tree parseNumExpr3() {
		int myPosition = in.getPosition();
		Tree intConst, floatConst, stringConst, minus, id, numExpr1;

		// intConst
		if ((intConst = parseToken(Token.INTCONST)) != null) {
			return intConst;
		}

		// "-" intConst
		if ((minus = parseToken(Token.MINUS)) != null
				&& (intConst = parseToken(Token.INTCONST)) != null) {
			minus.addLastChild(intConst);
			return minus;
		}
		in.setPosition(myPosition);

		// floatconst
		if ((floatConst = parseToken(Token.FLOATCONST)) != null) {
			return floatConst;
		}

		// "-" floatConst
		if ((minus = parseToken(Token.MINUS)) != null
				&& (floatConst = parseToken(Token.FLOATCONST)) != null) {
			minus.addLastChild(floatConst);
			return minus;
		}
		in.setPosition(myPosition);

		// stringconst
		if ((stringConst = parseToken(Token.STRINGCONST)) != null) {
			return stringConst;
		}

		// id
		if ((id = parseToken(Token.ID)) != null) {
			return id;
		}

		// ( numExpr )
		if (parseToken(Token.LBR) != null
				&& (numExpr1 = parseNumExpr(null)) != null
				&& parseToken(Token.RBR) != null) {
			return numExpr1;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * parse any Terminal
	 *
	 * @param tokenType
	 * @return
	 */
	Tree parseToken(int tokenType) {
		comparecount++;
		int myPosition = in.getPosition();
		Token token = in.nextToken();
		if (token.getType() == tokenType) {
			Tree t = new Tree(new Token(tokenType, token.getText()));
			return t;
		}
		in.setPosition(myPosition);
		return null;
	}
}