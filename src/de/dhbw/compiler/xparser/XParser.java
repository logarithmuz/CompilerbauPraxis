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

	TokenReader in;

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
		Tree program, programName, semi, declist, block, dot, eof;
		if (((program = parseToken(Token.PROGRAM)) != null)
				&& ((programName = parseToken(Token.ID)) != null)
				&& ((semi = parseToken(Token.SEMICOLON)) != null)
				&& ((declist = parseDeclist()) != null)
				&& ((block = parseBlock()) != null)
				&& ((dot = parseToken(Token.DOT)) != null)
				&& ((eof = parseToken(Token.EOF)) != null)) {
			Tree t = new Tree(new Token(Token.APROGRAM));
			t.addLastChild(program);
			t.addLastChild(programName);
			t.addLastChild(semi);
			t.addLastChild(declist);
			t.addLastChild(block);
			t.addLastChild(dot);
			t.addLastChild(eof);
			return t;
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
	 * declaration := todo
	 *
	 * @return
	 */
	private Tree parseDeclaration() {
		int myPosition = in.getPosition();
		Tree t = new Tree(new Token(Token.DECL));
		Tree modifier, id, colon, type, semi;
		if ((modifier = parseModifier()) != null) {
			t.addLastChild(modifier);
		}
		if ((id = parseToken(Token.ID)) != null
				&& (colon = parseToken(Token.COLON)) != null
				&& (type = parseType()) != null
				&& (semi = parseToken(Token.SEMICOLON)) != null) {
			t.addLastChild(id);
			t.addLastChild(colon);
			t.addLastChild(type);
			t.addLastChild(semi);
			return t;
		}
		in.setPosition(myPosition);
		return null;
	}

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

	private Tree parseType() {
		int myPosition = in.getPosition();
		Tree t = new Tree(new Token(Token.TYPE));
		Tree intType, floatType, stringType;
		if ((intType = parseToken(Token.INT)) != null) {
			t.addLastChild(intType);
			return t;
		}
		if ((floatType = parseToken(Token.FLOAT)) != null) {
			t.addLastChild(floatType);
			return t;
		}
		if ((stringType = parseToken(Token.STRING)) != null) {
			t.addLastChild(stringType);
			return t;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * block := begin statlist end
	 *
	 * @return
	 */
	private Tree parseBlock() {
		int myPosition = in.getPosition();
		Tree begin, statList, end;
		if (((begin = parseToken(Token.BEGIN)) != null)
				&& ((statList = parseStatList()) != null)
				&& ((end = parseToken(Token.END)) != null)) {
			Tree t = new Tree(new Token(Token.BLOCK));
			t.addLastChild(begin);
			t.addLastChild(statList);
			t.addLastChild(end);
			return t;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * statlist := {statWithSemi}
	 *
	 * @return
	 */
	private Tree parseStatList() {
		Tree t = new Tree(new Token(Token.STATLIST));
		Tree statWithSemi;
		while ((statWithSemi = parseStatWithSemi()) != null) {
			t.addLastChild(statWithSemi);
		}
		return t;
	}

	/**
	 * statWithSemi := stat ";"
	 *
	 * @return
	 */
	private Tree parseStatWithSemi() {
		int myPosition = in.getPosition();
		Tree statement, semi;
		if ((statement = parseStat()) != null
				&& (semi = parseToken(Token.SEMICOLON)) != null) {
			Tree t = new Tree(new Token(Token.STATWITHSEMI));
			t.addLastChild(statement);
			t.addLastChild(semi);
			return t;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * stat := assignStat | condStat | block
	 *
	 * @return
	 */
	private Tree parseStat() {
		int myPosition = in.getPosition();
		Tree t = new Tree(new Token(Token.STAT));
		Tree assignStat, condStat, whileStat, forStat, block;
		if (((assignStat = parseAssignStat()) != null)) {
			t.addLastChild(assignStat);
			return t;
		}
		if (((condStat = parseCondStatement()) != null)) {
			t.addLastChild(condStat);
			return t;
		}
		if ((whileStat = parseWhileStat()) != null) {
			t.addLastChild(whileStat);
			return t;
		}
		if ((forStat = parseForStat()) != null) {
			t.addLastChild(forStat);
			return t;
		}
		if (((block = parseBlock()) != null)) {
			t.addLastChild(block);
			return t;
		}
		in.setPosition(myPosition);
		return null;
	}

	private Tree parseForStat() {
		int myPosition = in.getPosition();
		Tree t = new Tree(new Token(Token.FORSTAT));
		Tree forToken, leftBracket, numAssign, semi, cond, semi2, numAssign2, rightBracket, stmt;
		if ((forToken = parseToken(Token.FOR)) != null
				&& (leftBracket = parseToken(Token.LBR)) != null
				&& (numAssign = parseAssignStat()) != null
				&& (semi = parseToken(Token.SEMICOLON)) != null
				&& (cond = parseCond()) != null
				&& (semi2 = parseToken(Token.SEMICOLON)) != null
				&& (numAssign2 = parseAssignStat()) != null
				&& (rightBracket = parseToken(Token.RBR)) != null
				&& (stmt = parseStat()) != null) {
			t.addLastChild(forToken);
			t.addLastChild(leftBracket);
			t.addLastChild(numAssign);
			t.addLastChild(semi);
			t.addLastChild(cond);
			t.addLastChild(semi2);
			t.addLastChild(numAssign2);
			t.addLastChild(rightBracket);
			t.addLastChild(stmt);
			return t;
		}

		in.setPosition(myPosition);
		return null;
	}

	private Tree parseWhileStat() {
		int myPosition = in.getPosition();
		Tree t = new Tree(new Token(Token.WHILESTAT));
		Tree whileToken, leftBracket, cond, rightBracket, stmt;
		if ((whileToken = parseToken(Token.WHILE)) != null
				&& (leftBracket = parseToken(Token.LBR)) != null
				&& (cond = parseCond()) != null
				&& (rightBracket = parseToken(Token.RBR)) != null
				&& (stmt = parseStat()) != null) {
			t.addLastChild(whileToken);
			t.addLastChild(leftBracket);
			t.addLastChild(cond);
			t.addLastChild(rightBracket);
			t.addLastChild(stmt);
			return t;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * condStat := "if" cond "then" stat ["else" stat]
	 *
	 * @return
	 */
	private Tree parseCondStatement() {
		int myPosition = in.getPosition();
		Tree t = new Tree(new Token(Token.CONDSTAT));
		Tree ifToken, cond, thenToken, stat1, elseToken, stat2;
		if ((ifToken = parseToken(Token.IF)) != null
				&& (cond = parseCond()) != null
				&& (thenToken = parseToken(Token.THEN)) != null
				&& (stat1 = parseStat()) != null) {
			int myPositionAfterIfBlock = in.getPosition();
			t.addLastChild(ifToken);
			t.addLastChild(cond);
			t.addLastChild(thenToken);
			t.addLastChild(stat1);
			if ((elseToken = parseToken(Token.ELSE)) != null
					&& (stat2 = parseStat()) != null) {
				t.addLastChild(elseToken);
				t.addLastChild(stat2);
				return t;
			}
			in.setPosition(myPositionAfterIfBlock);
			return t;
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
		Tree t = new Tree(new Token(Token.COND));
		Tree numExpr1, numExpr2, operator;
		if ((numExpr1 = parseNumExpr()) != null
				&& (operator = parseComperator()) != null
				&& (numExpr2 = parseNumExpr()) != null) {
			t.addLastChild(numExpr1);
			t.addLastChild(operator);
			t.addLastChild(numExpr2);
			return t;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * compreator := < | > | =
	 *
	 * @return
	 */
	private Tree parseComperator() {
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
	 * assignStat := id ":=" numExpr
	 *
	 * @return
	 */
	private Tree parseAssignStat() {
		int myPostition = in.getPosition();
		Tree id, assign, numExpr;
		if ((id = parseToken(Token.ID)) != null
				&& (assign = parseToken(Token.ASSIGN)) != null
				&& (numExpr = parseNumExpr()) != null) {
			Tree t = new Tree(new Token(Token.ASSIGNSTAT));
			t.addLastChild(id);
			t.addLastChild(assign);
			t.addLastChild(numExpr);
			return t;
		}
		in.setPosition(myPostition);
		return null;
	}

	/**
	 * numExpr := numExpr2 "+" numExpr | numExpr2 "-" numExpr | numExpr2
	 *
	 * @return
	 */
	private Tree parseNumExpr() {
		int myPosition = in.getPosition();
		Tree t = new Tree(new Token(Token.EXPR));
		Tree numExpr1, numExpr2, operator, expr2;

		// numExpr2 + numExpr
		if ((numExpr1 = parseNumExpr2()) != null
				&& (operator = parseToken(Token.PLUS)) != null
				&& (numExpr2 = parseNumExpr()) != null) {
			t.addLastChild(numExpr1);
			t.addLastChild(operator);
			t.addLastChild(numExpr2);
			return t;
		}
		in.setPosition(myPosition);

		// numExpr2 - numExpr
		if ((numExpr1 = parseNumExpr2()) != null
				&& (operator = parseToken(Token.MINUS)) != null
				&& (numExpr2 = parseNumExpr()) != null) {
			t.addLastChild(numExpr1);
			t.addLastChild(operator);
			t.addLastChild(numExpr2);
			return t;
		}
		in.setPosition(myPosition);

		// numExpr2
		if ((expr2 = parseNumExpr2()) != null) {
			t.addLastChild(expr2);
			return t;
		}
		in.setPosition(myPosition);
		return null;
	}

	/**
	 * numExpr2 := numExpr3 "*" numExpr2 | numExpr3 "/" numExpr2
	 *
	 * @return
	 */
	private Tree parseNumExpr2() {
		int myPosition = in.getPosition();
		Tree t = new Tree(new Token(Token.EXPR2));
		Tree numExpr1, numExpr2, operator, expr3;

		// numExpr3 * numExpr2
		if ((numExpr1 = parseNumExpr3()) != null
				&& (operator = parseToken(Token.MULT)) != null
				&& (numExpr2 = parseNumExpr2()) != null) {
			t.addLastChild(numExpr1);
			t.addLastChild(operator);
			t.addLastChild(numExpr2);
			return t;
		}
		in.setPosition(myPosition);

		// numExpr3 / numExpr2
		if ((numExpr1 = parseNumExpr3()) != null
				&& (operator = parseToken(Token.DIV)) != null
				&& (numExpr2 = parseNumExpr2()) != null) {
			t.addLastChild(numExpr1);
			t.addLastChild(operator);
			t.addLastChild(numExpr2);
			return t;
		}
		in.setPosition(myPosition);

		// numExpr3
		if ((expr3 = parseNumExpr3()) != null) {
			t.addLastChild(expr3);
			return t;
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
		Tree t = new Tree(new Token(Token.EXPR3));
		Tree intConst, floatConst, stringConst, minus, id, leftBracket, numExpr1, rightBracket;

		// intConst
		if ((intConst = parseToken(Token.INTCONST)) != null) {
			t.addLastChild(intConst);
			return t;
		}

		// "-" intConst
		if ((minus = parseToken(Token.MINUS)) != null
				&& (intConst = parseToken(Token.INTCONST)) != null) {
			t.addLastChild(minus);
			t.addLastChild(intConst);
			return t;
		}
		in.setPosition(myPosition);

		// floatconst
		if ((floatConst = parseToken(Token.FLOATCONST)) != null) {
			t.addLastChild(floatConst);
			return t;
		}

		// "-" floatConst
		if ((minus = parseToken(Token.MINUS)) != null
				&& (floatConst = parseToken(Token.FLOATCONST)) != null) {
			t.addLastChild(minus);
			t.addLastChild(floatConst);
			return t;
		}

		// stringconst
		if ((stringConst = parseToken(Token.STRINGCONST)) != null) {
			t.addLastChild(stringConst);
			return t;
		}


		// id
		if ((id = parseToken(Token.ID)) != null) {
			t.addLastChild(id);
			return t;
		}

		// ( numExpr )
		if ((leftBracket = parseToken(Token.LBR)) != null
				&& (numExpr1 = parseNumExpr()) != null
				&& (rightBracket = parseToken(Token.RBR)) != null) {
			t.addLastChild(leftBracket);
			t.addLastChild(numExpr1);
			t.addLastChild(rightBracket);
			return t;
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