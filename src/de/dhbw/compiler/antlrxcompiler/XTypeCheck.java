// $ANTLR 3.5.2 gfiles/XTypeCheck.g 2019-05-24 16:06:24

package de.dhbw.compiler.antlrxcompiler;
   
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class XTypeCheck extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DECL", "DECLLIST", 
		"DIGIT", "FLOATCONST", "ID", "INTCONST", "INVALID", "LETTER", "OTHER", 
		"POSDIGIT", "STATLIST", "STRINGCONST", "UMINUS", "WS", "ZERO", "'('", 
		"')'", "'*'", "'+'", "'-'", "'.'", "'/'", "':'", "':='", "';'", "'<'", 
		"'='", "'>'", "'begin'", "'else'", "'end'", "'float'", "'for'", "'if'", 
		"'int'", "'print'", "'program'", "'read'", "'string'", "'then'", "'while'", 
		"STRING"
	};
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int COMMENT=4;
	public static final int DECL=5;
	public static final int DECLLIST=6;
	public static final int DIGIT=7;
	public static final int FLOATCONST=8;
	public static final int ID=9;
	public static final int INTCONST=10;
	public static final int INVALID=11;
	public static final int LETTER=12;
	public static final int OTHER=13;
	public static final int POSDIGIT=14;
	public static final int STATLIST=15;
	public static final int STRINGCONST=16;
	public static final int UMINUS=17;
	public static final int WS=18;
	public static final int ZERO=19;
	public static final int ASSIGN=28;
	public static final int DIV=26;
	public static final int FLOAT=36;
	public static final int INT=39;
	public static final int MINUS=24;
	public static final int MULT=22;
	public static final int PLUS=23;
	public static final int STRING=46;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public XTypeCheck(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XTypeCheck(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XTypeCheck.tokenNames; }
	@Override public String getGrammarFileName() { return "gfiles/XTypeCheck.g"; }



	   private SymbolTable  symbols = SymbolTable.getInstance();



	public static class decl_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// gfiles/XTypeCheck.g:37:1: decl : ^( DECL ID t= ( 'int' | 'float' | 'string' ) modifier ) ;
	public final XTypeCheck.decl_return decl() throws RecognitionException {
		XTypeCheck.decl_return retval = new XTypeCheck.decl_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree t=null;
		XTree DECL1=null;
		XTree ID2=null;
		TreeRuleReturnScope modifier3 =null;

		XTree t_tree=null;
		XTree DECL1_tree=null;
		XTree ID2_tree=null;

		try {
			// gfiles/XTypeCheck.g:37:5: ( ^( DECL ID t= ( 'int' | 'float' | 'string' ) modifier ) )
			// gfiles/XTypeCheck.g:37:8: ^( DECL ID t= ( 'int' | 'float' | 'string' ) modifier )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			DECL1=(XTree)match(input,DECL,FOLLOW_DECL_in_decl147); 
			DECL1_tree = (XTree)adaptor.dupNode(DECL1);


			root_1 = (XTree)adaptor.becomeRoot(DECL1_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			ID2=(XTree)match(input,ID,FOLLOW_ID_in_decl149); 
			ID2_tree = (XTree)adaptor.dupNode(ID2);


			adaptor.addChild(root_1, ID2_tree);

			_last = (XTree)input.LT(1);
			t=(XTree)input.LT(1);
			if ( input.LA(1)==36||input.LA(1)==39||input.LA(1)==43 ) {
				input.consume();
				t_tree = (XTree)adaptor.dupNode(t);


				adaptor.addChild(root_1, t_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_modifier_in_decl164);
			modifier3=modifier();
			state._fsp--;

			adaptor.addChild(root_1, modifier3.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			                if (t.token.getType() == INT)
			                    symbols.put(ID2.getText(), new Symbol(ID2.getText(), XType.IntType));
			                if (t.token.getType() == FLOAT)
			                    symbols.put(ID2.getText(), new Symbol(ID2.getText(), XType.FloatType));
			                if (t.token.getType() == STRING)
			                    symbols.put(ID2.getText(), new Symbol(ID2.getText(), XType.StringType));
			                
			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class modifier_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "modifier"
	// gfiles/XTypeCheck.g:46:1: modifier : ( 'read' | 'print' | 'read' 'print' );
	public final XTypeCheck.modifier_return modifier() throws RecognitionException {
		XTypeCheck.modifier_return retval = new XTypeCheck.modifier_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal4=null;
		XTree string_literal5=null;
		XTree string_literal6=null;
		XTree string_literal7=null;

		XTree string_literal4_tree=null;
		XTree string_literal5_tree=null;
		XTree string_literal6_tree=null;
		XTree string_literal7_tree=null;

		try {
			// gfiles/XTypeCheck.g:46:9: ( 'read' | 'print' | 'read' 'print' )
			int alt1=3;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==42) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==40) ) {
					alt1=3;
				}
				else if ( (LA1_1==UP) ) {
					alt1=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA1_0==40) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// gfiles/XTypeCheck.g:46:13: 'read'
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					string_literal4=(XTree)match(input,42,FOLLOW_42_in_modifier175); 
					string_literal4_tree = (XTree)adaptor.dupNode(string_literal4);


					adaptor.addChild(root_0, string_literal4_tree);

					}
					break;
				case 2 :
					// gfiles/XTypeCheck.g:46:22: 'print'
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					string_literal5=(XTree)match(input,40,FOLLOW_40_in_modifier179); 
					string_literal5_tree = (XTree)adaptor.dupNode(string_literal5);


					adaptor.addChild(root_0, string_literal5_tree);

					}
					break;
				case 3 :
					// gfiles/XTypeCheck.g:46:32: 'read' 'print'
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					string_literal6=(XTree)match(input,42,FOLLOW_42_in_modifier183); 
					string_literal6_tree = (XTree)adaptor.dupNode(string_literal6);


					adaptor.addChild(root_0, string_literal6_tree);

					_last = (XTree)input.LT(1);
					string_literal7=(XTree)match(input,40,FOLLOW_40_in_modifier185); 
					string_literal7_tree = (XTree)adaptor.dupNode(string_literal7);


					adaptor.addChild(root_0, string_literal7_tree);

					}
					break;

			}
			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modifier"


	public static class decllist_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "decllist"
	// gfiles/XTypeCheck.g:48:1: decllist : ^( DECLLIST ( decl )* ) ;
	public final XTypeCheck.decllist_return decllist() throws RecognitionException {
		XTypeCheck.decllist_return retval = new XTypeCheck.decllist_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree DECLLIST8=null;
		TreeRuleReturnScope decl9 =null;

		XTree DECLLIST8_tree=null;

		try {
			// gfiles/XTypeCheck.g:48:9: ( ^( DECLLIST ( decl )* ) )
			// gfiles/XTypeCheck.g:48:11: ^( DECLLIST ( decl )* )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			DECLLIST8=(XTree)match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist193); 
			DECLLIST8_tree = (XTree)adaptor.dupNode(DECLLIST8);


			root_1 = (XTree)adaptor.becomeRoot(DECLLIST8_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// gfiles/XTypeCheck.g:48:22: ( decl )*
				loop2:
				while (true) {
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==DECL) ) {
						alt2=1;
					}

					switch (alt2) {
					case 1 :
						// gfiles/XTypeCheck.g:48:22: decl
						{
						_last = (XTree)input.LT(1);
						pushFollow(FOLLOW_decl_in_decllist195);
						decl9=decl();
						state._fsp--;

						adaptor.addChild(root_1, decl9.getTree());

						}
						break;

					default :
						break loop2;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decllist"


	public static class expr_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// gfiles/XTypeCheck.g:51:1: expr : ( ^(op= ( '+' | '-' | '*' | '/' ) r= expr l= expr ) | INTCONST | ^( UMINUS INTCONST ) | FLOATCONST | ^( UMINUS FLOATCONST ) | ID | STRINGCONST );
	public final XTypeCheck.expr_return expr() throws RecognitionException {
		XTypeCheck.expr_return retval = new XTypeCheck.expr_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree op=null;
		XTree INTCONST10=null;
		XTree UMINUS11=null;
		XTree INTCONST12=null;
		XTree FLOATCONST13=null;
		XTree UMINUS14=null;
		XTree FLOATCONST15=null;
		XTree ID16=null;
		XTree STRINGCONST17=null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope l =null;

		XTree op_tree=null;
		XTree INTCONST10_tree=null;
		XTree UMINUS11_tree=null;
		XTree INTCONST12_tree=null;
		XTree FLOATCONST13_tree=null;
		XTree UMINUS14_tree=null;
		XTree FLOATCONST15_tree=null;
		XTree ID16_tree=null;
		XTree STRINGCONST17_tree=null;

		try {
			// gfiles/XTypeCheck.g:51:5: ( ^(op= ( '+' | '-' | '*' | '/' ) r= expr l= expr ) | INTCONST | ^( UMINUS INTCONST ) | FLOATCONST | ^( UMINUS FLOATCONST ) | ID | STRINGCONST )
			int alt3=7;
			switch ( input.LA(1) ) {
			case 22:
			case 23:
			case 24:
			case 26:
				{
				alt3=1;
				}
				break;
			case INTCONST:
				{
				alt3=2;
				}
				break;
			case UMINUS:
				{
				int LA3_3 = input.LA(2);
				if ( (LA3_3==DOWN) ) {
					int LA3_7 = input.LA(3);
					if ( (LA3_7==INTCONST) ) {
						alt3=3;
					}
					else if ( (LA3_7==FLOATCONST) ) {
						alt3=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOATCONST:
				{
				alt3=4;
				}
				break;
			case ID:
				{
				alt3=6;
				}
				break;
			case STRINGCONST:
				{
				alt3=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// gfiles/XTypeCheck.g:51:8: ^(op= ( '+' | '-' | '*' | '/' ) r= expr l= expr )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					op=(XTree)input.LT(1);
					if ( (input.LA(1) >= 22 && input.LA(1) <= 24)||input.LA(1)==26 ) {
						input.consume();
						op_tree = (XTree)adaptor.dupNode(op);


						root_1 = (XTree)adaptor.becomeRoot(op_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr227);
					r=expr();
					state._fsp--;

					adaptor.addChild(root_1, r.getTree());

					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr231);
					l=expr();
					state._fsp--;

					adaptor.addChild(root_1, l.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					                                    if ((r!=null?((XTree)r.getTree()):null).exprType == XType.IntType && (l!=null?((XTree)l.getTree()):null).exprType == XType.IntType)
					                                        op_tree.exprType = XType.IntType;
					                                    if ((r!=null?((XTree)r.getTree()):null).exprType == XType.FloatType && (l!=null?((XTree)l.getTree()):null).exprType == XType.IntType
					                                      ||(r!=null?((XTree)r.getTree()):null).exprType == XType.IntType && (l!=null?((XTree)l.getTree()):null).exprType == XType.FloatType
					                                      ||(r!=null?((XTree)r.getTree()):null).exprType == XType.FloatType && (l!=null?((XTree)l.getTree()):null).exprType == XType.FloatType)
					                                        op_tree.exprType = XType.FloatType;
					                                    
					}
					break;
				case 2 :
					// gfiles/XTypeCheck.g:59:6: INTCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					INTCONST10=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr241); 
					INTCONST10_tree = (XTree)adaptor.dupNode(INTCONST10);


					adaptor.addChild(root_0, INTCONST10_tree);

					 INTCONST10_tree.exprType = XType.IntType; 
					}
					break;
				case 3 :
					// gfiles/XTypeCheck.g:60:6: ^( UMINUS INTCONST )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					UMINUS11=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_expr264); 
					UMINUS11_tree = (XTree)adaptor.dupNode(UMINUS11);


					root_1 = (XTree)adaptor.becomeRoot(UMINUS11_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					INTCONST12=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr266); 
					INTCONST12_tree = (XTree)adaptor.dupNode(INTCONST12);


					adaptor.addChild(root_1, INTCONST12_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 INTCONST12_tree.exprType = XType.IntType; UMINUS11_tree.exprType = XType.IntType; 
					}
					break;
				case 4 :
					// gfiles/XTypeCheck.g:61:6: FLOATCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					FLOATCONST13=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr279); 
					FLOATCONST13_tree = (XTree)adaptor.dupNode(FLOATCONST13);


					adaptor.addChild(root_0, FLOATCONST13_tree);

					 FLOATCONST13_tree.exprType = XType.FloatType; 
					}
					break;
				case 5 :
					// gfiles/XTypeCheck.g:62:6: ^( UMINUS FLOATCONST )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					UMINUS14=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_expr300); 
					UMINUS14_tree = (XTree)adaptor.dupNode(UMINUS14);


					root_1 = (XTree)adaptor.becomeRoot(UMINUS14_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					FLOATCONST15=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr302); 
					FLOATCONST15_tree = (XTree)adaptor.dupNode(FLOATCONST15);


					adaptor.addChild(root_1, FLOATCONST15_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 FLOATCONST15_tree.exprType = XType.FloatType; UMINUS14_tree.exprType = XType.FloatType; 
					}
					break;
				case 6 :
					// gfiles/XTypeCheck.g:63:6: ID
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					ID16=(XTree)match(input,ID,FOLLOW_ID_in_expr313); 
					ID16_tree = (XTree)adaptor.dupNode(ID16);


					adaptor.addChild(root_0, ID16_tree);

					 ID16_tree.exprType = symbols.get(ID16.getText()).type; 
					}
					break;
				case 7 :
					// gfiles/XTypeCheck.g:64:6: STRINGCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					STRINGCONST17=(XTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_expr341); 
					STRINGCONST17_tree = (XTree)adaptor.dupNode(STRINGCONST17);


					adaptor.addChild(root_0, STRINGCONST17_tree);

					 STRINGCONST17_tree.exprType = XType.StringType; 
					}
					break;

			}
			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class assignstat_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "assignstat"
	// gfiles/XTypeCheck.g:67:1: assignstat : ^(assign= ':=' ID expr ) ;
	public final XTypeCheck.assignstat_return assignstat() throws RecognitionException {
		XTypeCheck.assignstat_return retval = new XTypeCheck.assignstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree assign=null;
		XTree ID18=null;
		TreeRuleReturnScope expr19 =null;

		XTree assign_tree=null;
		XTree ID18_tree=null;

		try {
			// gfiles/XTypeCheck.g:67:11: ( ^(assign= ':=' ID expr ) )
			// gfiles/XTypeCheck.g:67:13: ^(assign= ':=' ID expr )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			assign=(XTree)match(input,28,FOLLOW_28_in_assignstat365); 
			assign_tree = (XTree)adaptor.dupNode(assign);


			root_1 = (XTree)adaptor.becomeRoot(assign_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			ID18=(XTree)match(input,ID,FOLLOW_ID_in_assignstat367); 
			ID18_tree = (XTree)adaptor.dupNode(ID18);


			adaptor.addChild(root_1, ID18_tree);

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_assignstat369);
			expr19=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr19.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			                ID18_tree.exprType = symbols.get(ID18.getText()).type;
			                assign_tree.exprType = ID18_tree.exprType;
			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignstat"


	public static class cond_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// gfiles/XTypeCheck.g:72:1: cond : ^( comp expr expr ) ;
	public final XTypeCheck.cond_return cond() throws RecognitionException {
		XTypeCheck.cond_return retval = new XTypeCheck.cond_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		TreeRuleReturnScope comp20 =null;
		TreeRuleReturnScope expr21 =null;
		TreeRuleReturnScope expr22 =null;


		try {
			// gfiles/XTypeCheck.g:72:5: ( ^( comp expr expr ) )
			// gfiles/XTypeCheck.g:72:8: ^( comp expr expr )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_comp_in_cond382);
			comp20=comp();
			state._fsp--;

			root_1 = (XTree)adaptor.becomeRoot(comp20.getTree(), root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond384);
			expr21=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr21.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond386);
			expr22=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr22.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cond"


	public static class comp_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "comp"
	// gfiles/XTypeCheck.g:73:1: comp : ( '<' | '>' | '=' );
	public final XTypeCheck.comp_return comp() throws RecognitionException {
		XTypeCheck.comp_return retval = new XTypeCheck.comp_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree set23=null;

		XTree set23_tree=null;

		try {
			// gfiles/XTypeCheck.g:73:5: ( '<' | '>' | '=' )
			// gfiles/XTypeCheck.g:
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			set23=(XTree)input.LT(1);
			if ( (input.LA(1) >= 30 && input.LA(1) <= 32) ) {
				input.consume();
				set23_tree = (XTree)adaptor.dupNode(set23);


				adaptor.addChild(root_0, set23_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comp"


	public static class condstat_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "condstat"
	// gfiles/XTypeCheck.g:76:1: condstat : ^( 'if' cond stat ( stat )? ) ;
	public final XTypeCheck.condstat_return condstat() throws RecognitionException {
		XTypeCheck.condstat_return retval = new XTypeCheck.condstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal24=null;
		TreeRuleReturnScope cond25 =null;
		TreeRuleReturnScope stat26 =null;
		TreeRuleReturnScope stat27 =null;

		XTree string_literal24_tree=null;

		try {
			// gfiles/XTypeCheck.g:76:9: ( ^( 'if' cond stat ( stat )? ) )
			// gfiles/XTypeCheck.g:76:11: ^( 'if' cond stat ( stat )? )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal24=(XTree)match(input,38,FOLLOW_38_in_condstat409); 
			string_literal24_tree = (XTree)adaptor.dupNode(string_literal24);


			root_1 = (XTree)adaptor.becomeRoot(string_literal24_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_condstat411);
			cond25=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond25.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_condstat413);
			stat26=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat26.getTree());

			// gfiles/XTypeCheck.g:76:28: ( stat )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==STATLIST||LA4_0==28||(LA4_0 >= 37 && LA4_0 <= 38)||LA4_0==45) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// gfiles/XTypeCheck.g:76:28: stat
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_stat_in_condstat415);
					stat27=stat();
					state._fsp--;

					adaptor.addChild(root_1, stat27.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condstat"


	public static class whilestat_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "whilestat"
	// gfiles/XTypeCheck.g:79:1: whilestat : ^( 'while' cond stat ) ;
	public final XTypeCheck.whilestat_return whilestat() throws RecognitionException {
		XTypeCheck.whilestat_return retval = new XTypeCheck.whilestat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal28=null;
		TreeRuleReturnScope cond29 =null;
		TreeRuleReturnScope stat30 =null;

		XTree string_literal28_tree=null;

		try {
			// gfiles/XTypeCheck.g:79:10: ( ^( 'while' cond stat ) )
			// gfiles/XTypeCheck.g:79:12: ^( 'while' cond stat )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal28=(XTree)match(input,45,FOLLOW_45_in_whilestat427); 
			string_literal28_tree = (XTree)adaptor.dupNode(string_literal28);


			root_1 = (XTree)adaptor.becomeRoot(string_literal28_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_whilestat429);
			cond29=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond29.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_whilestat431);
			stat30=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat30.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whilestat"


	public static class forstat_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// gfiles/XTypeCheck.g:80:1: forstat : ^( 'for' assignstat cond assignstat stat ) ;
	public final XTypeCheck.forstat_return forstat() throws RecognitionException {
		XTypeCheck.forstat_return retval = new XTypeCheck.forstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal31=null;
		TreeRuleReturnScope assignstat32 =null;
		TreeRuleReturnScope cond33 =null;
		TreeRuleReturnScope assignstat34 =null;
		TreeRuleReturnScope stat35 =null;

		XTree string_literal31_tree=null;

		try {
			// gfiles/XTypeCheck.g:80:8: ( ^( 'for' assignstat cond assignstat stat ) )
			// gfiles/XTypeCheck.g:80:10: ^( 'for' assignstat cond assignstat stat )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal31=(XTree)match(input,37,FOLLOW_37_in_forstat439); 
			string_literal31_tree = (XTree)adaptor.dupNode(string_literal31);


			root_1 = (XTree)adaptor.becomeRoot(string_literal31_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat441);
			assignstat32=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat32.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_forstat443);
			cond33=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond33.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat445);
			assignstat34=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat34.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_forstat447);
			stat35=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat35.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forstat"


	public static class stat_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// gfiles/XTypeCheck.g:83:1: stat : ( assignstat | condstat | whilestat | forstat | statlist );
	public final XTypeCheck.stat_return stat() throws RecognitionException {
		XTypeCheck.stat_return retval = new XTypeCheck.stat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		TreeRuleReturnScope assignstat36 =null;
		TreeRuleReturnScope condstat37 =null;
		TreeRuleReturnScope whilestat38 =null;
		TreeRuleReturnScope forstat39 =null;
		TreeRuleReturnScope statlist40 =null;


		try {
			// gfiles/XTypeCheck.g:83:5: ( assignstat | condstat | whilestat | forstat | statlist )
			int alt5=5;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt5=1;
				}
				break;
			case 38:
				{
				alt5=2;
				}
				break;
			case 45:
				{
				alt5=3;
				}
				break;
			case 37:
				{
				alt5=4;
				}
				break;
			case STATLIST:
				{
				alt5=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// gfiles/XTypeCheck.g:83:8: assignstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_assignstat_in_stat457);
					assignstat36=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat36.getTree());

					}
					break;
				case 2 :
					// gfiles/XTypeCheck.g:83:21: condstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_condstat_in_stat461);
					condstat37=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat37.getTree());

					}
					break;
				case 3 :
					// gfiles/XTypeCheck.g:83:32: whilestat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_whilestat_in_stat465);
					whilestat38=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat38.getTree());

					}
					break;
				case 4 :
					// gfiles/XTypeCheck.g:83:44: forstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_forstat_in_stat469);
					forstat39=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat39.getTree());

					}
					break;
				case 5 :
					// gfiles/XTypeCheck.g:83:54: statlist
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_statlist_in_stat473);
					statlist40=statlist();
					state._fsp--;

					adaptor.addChild(root_0, statlist40.getTree());

					}
					break;

			}
			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class statlist_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "statlist"
	// gfiles/XTypeCheck.g:85:1: statlist : ^( STATLIST ( stat )* ) ;
	public final XTypeCheck.statlist_return statlist() throws RecognitionException {
		XTypeCheck.statlist_return retval = new XTypeCheck.statlist_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree STATLIST41=null;
		TreeRuleReturnScope stat42 =null;

		XTree STATLIST41_tree=null;

		try {
			// gfiles/XTypeCheck.g:85:9: ( ^( STATLIST ( stat )* ) )
			// gfiles/XTypeCheck.g:85:11: ^( STATLIST ( stat )* )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			STATLIST41=(XTree)match(input,STATLIST,FOLLOW_STATLIST_in_statlist481); 
			STATLIST41_tree = (XTree)adaptor.dupNode(STATLIST41);


			root_1 = (XTree)adaptor.becomeRoot(STATLIST41_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// gfiles/XTypeCheck.g:85:22: ( stat )*
				loop6:
				while (true) {
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==STATLIST||LA6_0==28||(LA6_0 >= 37 && LA6_0 <= 38)||LA6_0==45) ) {
						alt6=1;
					}

					switch (alt6) {
					case 1 :
						// gfiles/XTypeCheck.g:85:22: stat
						{
						_last = (XTree)input.LT(1);
						pushFollow(FOLLOW_stat_in_statlist483);
						stat42=stat();
						state._fsp--;

						adaptor.addChild(root_1, stat42.getTree());

						}
						break;

					default :
						break loop6;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statlist"


	public static class program_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// gfiles/XTypeCheck.g:88:1: program : ^( 'program' ID decllist statlist ) ;
	public final XTypeCheck.program_return program() throws RecognitionException {
		XTypeCheck.program_return retval = new XTypeCheck.program_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal43=null;
		XTree ID44=null;
		TreeRuleReturnScope decllist45 =null;
		TreeRuleReturnScope statlist46 =null;

		XTree string_literal43_tree=null;
		XTree ID44_tree=null;

		try {
			// gfiles/XTypeCheck.g:88:8: ( ^( 'program' ID decllist statlist ) )
			// gfiles/XTypeCheck.g:88:10: ^( 'program' ID decllist statlist )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal43=(XTree)match(input,41,FOLLOW_41_in_program494); 
			string_literal43_tree = (XTree)adaptor.dupNode(string_literal43);


			root_1 = (XTree)adaptor.becomeRoot(string_literal43_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			ID44=(XTree)match(input,ID,FOLLOW_ID_in_program496); 
			ID44_tree = (XTree)adaptor.dupNode(ID44);


			adaptor.addChild(root_1, ID44_tree);

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_decllist_in_program498);
			decllist45=decllist();
			state._fsp--;

			adaptor.addChild(root_1, decllist45.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_statlist_in_program500);
			statlist46=statlist();
			state._fsp--;

			adaptor.addChild(root_1, statlist46.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"

	// Delegated rules



	public static final BitSet FOLLOW_DECL_in_decl147 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl149 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_set_in_decl153 = new BitSet(new long[]{0x0000050000000000L});
	public static final BitSet FOLLOW_modifier_in_decl164 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_42_in_modifier175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_modifier179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_modifier183 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_modifier185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist195 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_set_in_expr209 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr227 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_expr231 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTCONST_in_expr241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_expr264 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_expr266 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_expr300 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr302 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_expr313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_expr341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignstat365 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat367 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_assignstat369 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_comp_in_cond382 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond384 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_cond386 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_condstat409 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat411 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat413 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_stat_in_condstat415 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_45_in_whilestat427 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat429 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_whilestat431 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_forstat439 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat441 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat443 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_assignstat_in_forstat445 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_forstat447 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignstat_in_stat457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATLIST_in_statlist481 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_statlist483 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_41_in_program494 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program496 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program498 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program500 = new BitSet(new long[]{0x0000000000000008L});
}
