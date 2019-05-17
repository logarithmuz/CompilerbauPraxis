/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 *
 * Vorlesung Übersetzerbau
 * Praxis LL(1)-Parser für X
 * - LL1-Parser
 *
 * **********************************************
 */

package de.dhbw.compiler.xparser_ll1;

import java.io.IOException;

public class XParser {
	TokenBuffer in;
	private int compareCount = 0;

	public XParser(TokenBuffer in) {
		this.in = in;
	}

	public int getComparecount() {
		return compareCount;
	}

	private Tree parseToken(int tokenType) {
		Token nextToken;
		try {
			nextToken = in.nextToken();
			if (nextToken.getType() == tokenType) {
				return new Tree(nextToken);
			}
			compareCount++;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public Tree parseProgram() {
		return parseAProgram();
	}

	/**
	 * aProgram := program id ";" block "." eof
	 *
	 * @return
	 */
	public Tree parseAProgram() {
		Tree program, programName, declist, block;
		if ((program = parseToken(Token.PROGRAM)) != null
				&& (programName = parseToken(Token.ID)) != null
				&& parseToken(Token.SEMICOLON) != null
				&& (declist = parseDeclist(null)) != null
				&& (block = parseBlock()) != null
				&& parseToken(Token.DOT) != null
				&& parseToken(Token.EOF) != null) {
			program.addLastChild(programName);
			program.addLastChild(declist);
			program.addLastChild(block);
			return program;
		}
		return null;
	}

	/**
	 * declist := declaration declist | epsilon
	 *
	 * @return
	 */
	private Tree parseDeclist(Tree t) {
		Token nextToken = in.lookaheadToken();
		if (t == null) {
			t = new Tree(new Token(Token.DECLLIST));
		}
		Tree decl, declist;
		switch (nextToken.getType()) {
			case Token.READ:
			case Token.PRINT:
			case Token.ID:
				if ((decl = parseDeclaration()) != null
						&& (declist = parseDeclist(t)) != null) {
					declist.addFirstChild(decl);
					return declist;
				}
				break;
			case Token.BEGIN:
				return t;
			default:
				return null;
		}
		return null;
	}

	/**
	 * declaration := modifier id ":" type ";"
	 *
	 * @return
	 */
	private Tree parseDeclaration() {
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
		return null;
	}

	/**
	 * modifier := read modifier2 | modifier2
	 *
	 * @return
	 */
	private Tree parseModifier() {
		Token nextToken = in.lookaheadToken();
		Tree t = new Tree(new Token(Token.MODIFIER));
		Tree read;
		switch (nextToken.getType()) {
			case Token.READ:
				read = parseToken(Token.READ);
				t.addLastChild(read);
				return parseModifier2(t);
			case Token.PRINT:
			case Token.ID:
				return parseModifier2(t);
		}
		return null;
	}

	/**
	 * modifier2 := print | epsilon
	 *
	 * @param t
	 * @return
	 */
	private Tree parseModifier2(Tree t) {
		Token nextToken = in.lookaheadToken();
		Tree print;
		switch (nextToken.getType()) {
			case Token.PRINT:
				print = parseToken(Token.PRINT);
				t.addLastChild(print);
				return t;
			case Token.ID:
				return t;
		}
		return null;
	}

	/**
	 * type := int | float | string
	 *
	 * @return
	 */
	private Tree parseType() {
		Token nextToken = in.lookaheadToken();
		switch (nextToken.getType()) {
			case Token.INT:
				return parseToken(Token.INT);
			case Token.FLOAT:
				return parseToken(Token.FLOAT);
			case Token.STRING:
				return parseToken(Token.STRING);
		}
		return null;
	}

	/**
	 * block := begin stmtList end
	 *
	 * @return
	 */
	private Tree parseBlock() {
		Tree stmtList;
		if (parseToken(Token.BEGIN) != null
				&& (stmtList = parseStmtList(null)) != null
				&& parseToken(Token.END) != null) {
			return stmtList;
		}
		return null;
	}

	/**
	 * stmtlist := stmtWithSemi stmtlist | epsilon
	 *
	 * @return
	 */
	private Tree parseStmtList(Tree t) {
		Token nextToken = in.lookaheadToken();
		if (t == null) {
			t = new Tree(new Token(Token.STATLIST));
		}
		switch (nextToken.getType()) {
			case Token.ID:
			case Token.IF:
			case Token.WHILE:
			case Token.FOR:
			case Token.BEGIN:
				t.addFirstChild(parseStmtWithSemi());
				return parseStmtList(t);
			case Token.END:
				return t;
		}
		return null;
	}

	/**
	 * stmtWithSemi := stmt ";"
	 *
	 * @return
	 */
	private Tree parseStmtWithSemi() {
		Tree stmt;
		if ((stmt = parseStmt()) != null
				&& parseToken(Token.SEMICOLON) != null) {
			return stmt;
		}
		return null;
	}

	/**
	 * stmt := assignStat | condStat | whileStmt | forStmt | block
	 *
	 * @return
	 */
	private Tree parseStmt() {
		Token nextToken = in.lookaheadToken();
		switch (nextToken.getType()) {
			case Token.ID:
				return parseAssignStmt();
			case Token.IF:
				return parseCondStmt();
			case Token.WHILE:
				return parseWhileStmt();
			case Token.FOR:
				return parseForStmt();
			case Token.BEGIN:
				return parseBlock();
		}
		return null;
	}

	/**
	 * forStmt := "for" "(" assignStmt ";" cond ";" assignStmt ")" stmt
	 *
	 * @return
	 */
	private Tree parseForStmt() {
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
		return null;
	}

	/**
	 * whileStmt := "while" "(" cond ")" stmt
	 *
	 * @return
	 */
	private Tree parseWhileStmt() {
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
		return null;
	}

	/**
	 * condStmt := "if" cond "then" stat ["else" stat]
	 *
	 * @return
	 */
	private Tree parseCondStmt() {
		Tree ifToken, cond, stmt1, stmt2, elseBlock;


		if ((ifToken = parseToken(Token.IF)) != null
				&& (cond = parseCond()) != null
				&& parseToken(Token.THEN) != null
				&& (stmt1 = parseStmt()) != null) {
			ifToken.addLastChild(cond);
			ifToken.addLastChild(stmt1);
			Token nextToken = in.lookaheadToken();
			switch (nextToken.getType()) {
				case Token.ELSE:
					ifToken = parseElseBlock(ifToken);
					break;
				case Token.SEMICOLON:
					break;
			}
			return ifToken;
		}
		return null;
	}

	private Tree parseElseBlock(Tree t) {
		Tree stmt;
		if (parseToken(Token.ELSE) != null
				&& (stmt = parseStmt()) != null) {
			t.addLastChild(stmt);
			return t;
		}
		return null;
	}

	/**
	 * cond := numExpr comperator numExpr
	 *
	 * @return
	 */
	private Tree parseCond() {
		Tree numExpr1, numExpr2, comp;
		if ((numExpr1 = parseNumExpr()) != null
				&& (comp = parseComp()) != null
				&& (numExpr2 = parseNumExpr()) != null) {
			comp.addLastChild(numExpr1);
			comp.addLastChild(numExpr2);
			return comp;
		}
		return null;
	}

	/**
	 * comp := < | > | =
	 *
	 * @return
	 */
	private Tree parseComp() {
		Token nextToken = in.lookaheadToken();
		Tree t;
		switch (nextToken.getType()) {
			case Token.LESS:
				t = parseToken(Token.LESS);
				return t;
			case Token.EQUALS:
				t = parseToken(Token.EQUALS);
				return t;
			case Token.MORE:
				t = parseToken(Token.MORE);
				return t;
		}
		return null;
	}

	/**
	 * assignStmt := id ":=" numExpr
	 *
	 * @return
	 */
	private Tree parseAssignStmt() {
		Tree id, assign, numExpr;
		if ((id = parseToken(Token.ID)) != null
				&& (assign = parseToken(Token.ASSIGN)) != null
				&& (numExpr = parseNumExpr()) != null) {
			assign.addLastChild(id);
			assign.addLastChild(numExpr);
			return assign;
		}
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
	private Tree parseNumExpr() {
		Tree numExpr, t;

		if ((numExpr = parseNumExpr2()) != null
				&& (t = parseNumExpr$(numExpr)) != null) {
			return t;
		}
		return null;
	}

	private Tree parseNumExpr$(Tree numExpr1) {
		Token nextToken = in.lookaheadToken();
		Tree operator, numExpr2;
		switch (nextToken.getType()) {
			case Token.PLUS:
				if ((operator = parseToken(Token.PLUS)) != null
						&& (numExpr2 = parseNumExpr()) != null) {
					operator.addLastChild(numExpr1);
					operator.addLastChild(numExpr2);
					return operator;
				} else {
					return null;
				}
			case Token.MINUS:
				if ((operator = parseToken(Token.MINUS)) != null
						&& (numExpr2 = parseNumExpr()) != null) {
					operator.addLastChild(numExpr1);
					operator.addLastChild(numExpr2);
					return operator;
				}
			case Token.LESS:
			case Token.EQUALS:
			case Token.MORE:
			case Token.RBR:
			case Token.SEMICOLON:
			case Token.THEN:
			case Token.ELSE:
				return numExpr1;
			default:
				return null;
		}
	}

	private Tree parseNumExpr2() {
		Tree numExpr, t;

		if ((numExpr = parseNumExpr3()) != null
				&& (t = parseNumExpr2$(numExpr)) != null) {
			return t;
		}
		return null;
	}

	private Tree parseNumExpr2$(Tree numExpr1) {
		Token nextToken = in.lookaheadToken();
		Tree operator, numExpr2;
		switch (nextToken.getType()) {
			case Token.MULT:
				if ((operator = parseToken(Token.MULT)) != null
						&& (numExpr2 = parseNumExpr2()) != null) {
					operator.addLastChild(numExpr1);
					operator.addLastChild(numExpr2);
					return operator;
				}
			case Token.DIV:
				if ((operator = parseToken(Token.DIV)) != null
						&& (numExpr2 = parseNumExpr2()) != null) {
					operator.addLastChild(numExpr1);
					operator.addLastChild(numExpr2);
					return operator;
				}
			case Token.LESS:
			case Token.EQUALS:
			case Token.MORE:
			case Token.RBR:
			case Token.SEMICOLON:
			case Token.THEN:
			case Token.ELSE:
			case Token.PLUS:
			case Token.MINUS:
				return numExpr1;
			default:
				return null;
		}
	}

	/**
	 * numExpr3 := intConst | id | "(" numExpr ")"
	 *
	 * @return
	 */
	private Tree parseNumExpr3() {
		Token nextToken = in.lookaheadToken();
		Tree numExpr;

		switch (nextToken.getType()) {
			case Token.MINUS:
				return parseNegativeNumber();
			case Token.INTCONST:
				return parseToken(Token.INTCONST);
			case Token.FLOATCONST:
				return parseToken(Token.FLOATCONST);
			case Token.STRINGCONST:
				return parseToken(Token.STRINGCONST);
			case Token.ID:
				return parseToken(Token.ID);
			case Token.LBR:
				if (parseToken(Token.LBR) != null
						&& (numExpr = parseNumExpr()) != null
						&& parseToken(Token.RBR) != null) {
					return numExpr;
				}
			default:
				return null;
		}
	}

	private Tree parseNegativeNumber() {
		Tree minus, number;
		if ((minus = parseToken(Token.MINUS)) != null
				&& (number = parseNumber()) != null) {
			minus.addLastChild(number);
			return minus;
		}
		return null;
	}

	private Tree parseNumber() {
		Token nextToken = in.lookaheadToken();
		switch (nextToken.getType()) {
			case Token.INTCONST:
				return parseToken(Token.INTCONST);
			case Token.FLOATCONST:
				return parseToken(Token.FLOATCONST);
			default:
				return null;
		}
	}
}