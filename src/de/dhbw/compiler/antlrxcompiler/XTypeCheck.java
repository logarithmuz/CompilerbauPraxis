// $ANTLR 3.5.2 gfiles/XTypeCheck.g 2019-05-23 18:55:47

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
		"'int'", "'print'", "'program'", "'read'", "'string'", "'then'", "'while'"
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
	public static final int PLUS=23;

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
	// gfiles/XTypeCheck.g:28:1: decl : ( ^( DECL ID type ) | ^( DECL ID type 'read' ) | ^( DECL ID type 'print' ) | ^( DECL ID type 'read' 'print' ) );
	public final XTypeCheck.decl_return decl() throws RecognitionException {
		XTypeCheck.decl_return retval = new XTypeCheck.decl_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree DECL1=null;
		XTree ID2=null;
		XTree DECL4=null;
		XTree ID5=null;
		XTree string_literal7=null;
		XTree DECL8=null;
		XTree ID9=null;
		XTree string_literal11=null;
		XTree DECL12=null;
		XTree ID13=null;
		XTree string_literal15=null;
		XTree string_literal16=null;
		TreeRuleReturnScope type3 =null;
		TreeRuleReturnScope type6 =null;
		TreeRuleReturnScope type10 =null;
		TreeRuleReturnScope type14 =null;

		XTree DECL1_tree=null;
		XTree ID2_tree=null;
		XTree DECL4_tree=null;
		XTree ID5_tree=null;
		XTree string_literal7_tree=null;
		XTree DECL8_tree=null;
		XTree ID9_tree=null;
		XTree string_literal11_tree=null;
		XTree DECL12_tree=null;
		XTree ID13_tree=null;
		XTree string_literal15_tree=null;
		XTree string_literal16_tree=null;

		try {
			// gfiles/XTypeCheck.g:28:5: ( ^( DECL ID type ) | ^( DECL ID type 'read' ) | ^( DECL ID type 'print' ) | ^( DECL ID type 'read' 'print' ) )
			int alt1=4;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DECL) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==DOWN) ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2==ID) ) {
						int LA1_3 = input.LA(4);
						if ( (LA1_3==36||LA1_3==39||LA1_3==43) ) {
							switch ( input.LA(5) ) {
							case UP:
								{
								alt1=1;
								}
								break;
							case 42:
								{
								int LA1_6 = input.LA(6);
								if ( (LA1_6==UP) ) {
									alt1=2;
								}
								else if ( (LA1_6==40) ) {
									alt1=4;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 1, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case 40:
								{
								alt1=3;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 2, input);
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
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// gfiles/XTypeCheck.g:28:8: ^( DECL ID type )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					DECL1=(XTree)match(input,DECL,FOLLOW_DECL_in_decl80); 
					DECL1_tree = (XTree)adaptor.dupNode(DECL1);


					root_1 = (XTree)adaptor.becomeRoot(DECL1_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					ID2=(XTree)match(input,ID,FOLLOW_ID_in_decl82); 
					ID2_tree = (XTree)adaptor.dupNode(ID2);


					adaptor.addChild(root_1, ID2_tree);

					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl84);
					type3=type();
					state._fsp--;

					adaptor.addChild(root_1, type3.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// gfiles/XTypeCheck.g:29:6: ^( DECL ID type 'read' )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					DECL4=(XTree)match(input,DECL,FOLLOW_DECL_in_decl93); 
					DECL4_tree = (XTree)adaptor.dupNode(DECL4);


					root_1 = (XTree)adaptor.becomeRoot(DECL4_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					ID5=(XTree)match(input,ID,FOLLOW_ID_in_decl95); 
					ID5_tree = (XTree)adaptor.dupNode(ID5);


					adaptor.addChild(root_1, ID5_tree);

					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl97);
					type6=type();
					state._fsp--;

					adaptor.addChild(root_1, type6.getTree());

					_last = (XTree)input.LT(1);
					string_literal7=(XTree)match(input,42,FOLLOW_42_in_decl99); 
					string_literal7_tree = (XTree)adaptor.dupNode(string_literal7);


					adaptor.addChild(root_1, string_literal7_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// gfiles/XTypeCheck.g:30:6: ^( DECL ID type 'print' )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					DECL8=(XTree)match(input,DECL,FOLLOW_DECL_in_decl108); 
					DECL8_tree = (XTree)adaptor.dupNode(DECL8);


					root_1 = (XTree)adaptor.becomeRoot(DECL8_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					ID9=(XTree)match(input,ID,FOLLOW_ID_in_decl110); 
					ID9_tree = (XTree)adaptor.dupNode(ID9);


					adaptor.addChild(root_1, ID9_tree);

					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl112);
					type10=type();
					state._fsp--;

					adaptor.addChild(root_1, type10.getTree());

					_last = (XTree)input.LT(1);
					string_literal11=(XTree)match(input,40,FOLLOW_40_in_decl114); 
					string_literal11_tree = (XTree)adaptor.dupNode(string_literal11);


					adaptor.addChild(root_1, string_literal11_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// gfiles/XTypeCheck.g:31:6: ^( DECL ID type 'read' 'print' )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					DECL12=(XTree)match(input,DECL,FOLLOW_DECL_in_decl123); 
					DECL12_tree = (XTree)adaptor.dupNode(DECL12);


					root_1 = (XTree)adaptor.becomeRoot(DECL12_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					ID13=(XTree)match(input,ID,FOLLOW_ID_in_decl125); 
					ID13_tree = (XTree)adaptor.dupNode(ID13);


					adaptor.addChild(root_1, ID13_tree);

					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl127);
					type14=type();
					state._fsp--;

					adaptor.addChild(root_1, type14.getTree());

					_last = (XTree)input.LT(1);
					string_literal15=(XTree)match(input,42,FOLLOW_42_in_decl129); 
					string_literal15_tree = (XTree)adaptor.dupNode(string_literal15);


					adaptor.addChild(root_1, string_literal15_tree);

					_last = (XTree)input.LT(1);
					string_literal16=(XTree)match(input,40,FOLLOW_40_in_decl131); 
					string_literal16_tree = (XTree)adaptor.dupNode(string_literal16);


					adaptor.addChild(root_1, string_literal16_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


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
	// $ANTLR end "decl"


	public static class type_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// gfiles/XTypeCheck.g:33:1: type : ( 'int' | 'float' | 'string' );
	public final XTypeCheck.type_return type() throws RecognitionException {
		XTypeCheck.type_return retval = new XTypeCheck.type_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree set17=null;

		XTree set17_tree=null;

		try {
			// gfiles/XTypeCheck.g:33:5: ( 'int' | 'float' | 'string' )
			// gfiles/XTypeCheck.g:
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			set17=(XTree)input.LT(1);
			if ( input.LA(1)==36||input.LA(1)==39||input.LA(1)==43 ) {
				input.consume();
				set17_tree = (XTree)adaptor.dupNode(set17);


				adaptor.addChild(root_0, set17_tree);

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
	// $ANTLR end "type"


	public static class decllist_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "decllist"
	// gfiles/XTypeCheck.g:35:1: decllist : ^( DECLLIST ( decl )* ) ;
	public final XTypeCheck.decllist_return decllist() throws RecognitionException {
		XTypeCheck.decllist_return retval = new XTypeCheck.decllist_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree DECLLIST18=null;
		TreeRuleReturnScope decl19 =null;

		XTree DECLLIST18_tree=null;

		try {
			// gfiles/XTypeCheck.g:35:9: ( ^( DECLLIST ( decl )* ) )
			// gfiles/XTypeCheck.g:35:11: ^( DECLLIST ( decl )* )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			DECLLIST18=(XTree)match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist156); 
			DECLLIST18_tree = (XTree)adaptor.dupNode(DECLLIST18);


			root_1 = (XTree)adaptor.becomeRoot(DECLLIST18_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// gfiles/XTypeCheck.g:35:22: ( decl )*
				loop2:
				while (true) {
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==DECL) ) {
						alt2=1;
					}

					switch (alt2) {
					case 1 :
						// gfiles/XTypeCheck.g:35:22: decl
						{
						_last = (XTree)input.LT(1);
						pushFollow(FOLLOW_decl_in_decllist158);
						decl19=decl();
						state._fsp--;

						adaptor.addChild(root_1, decl19.getTree());

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
	// gfiles/XTypeCheck.g:38:1: expr : ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | INTCONST | ^( UMINUS INTCONST ) | FLOATCONST | ^( UMINUS FLOATCONST ) | ID | STRINGCONST );
	public final XTypeCheck.expr_return expr() throws RecognitionException {
		XTypeCheck.expr_return retval = new XTypeCheck.expr_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree set20=null;
		XTree INTCONST23=null;
		XTree UMINUS24=null;
		XTree INTCONST25=null;
		XTree FLOATCONST26=null;
		XTree UMINUS27=null;
		XTree FLOATCONST28=null;
		XTree ID29=null;
		XTree STRINGCONST30=null;
		TreeRuleReturnScope expr21 =null;
		TreeRuleReturnScope expr22 =null;

		XTree set20_tree=null;
		XTree INTCONST23_tree=null;
		XTree UMINUS24_tree=null;
		XTree INTCONST25_tree=null;
		XTree FLOATCONST26_tree=null;
		XTree UMINUS27_tree=null;
		XTree FLOATCONST28_tree=null;
		XTree ID29_tree=null;
		XTree STRINGCONST30_tree=null;

		try {
			// gfiles/XTypeCheck.g:38:5: ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | INTCONST | ^( UMINUS INTCONST ) | FLOATCONST | ^( UMINUS FLOATCONST ) | ID | STRINGCONST )
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
					// gfiles/XTypeCheck.g:38:8: ^( ( '+' | '-' | '*' | '/' ) expr expr )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					set20=(XTree)input.LT(1);
					if ( (input.LA(1) >= 22 && input.LA(1) <= 24)||input.LA(1)==26 ) {
						input.consume();
						set20_tree = (XTree)adaptor.dupNode(set20);


						root_1 = (XTree)adaptor.becomeRoot(set20_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr186);
					expr21=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr21.getTree());

					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr188);
					expr22=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr22.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// gfiles/XTypeCheck.g:39:6: INTCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					INTCONST23=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr196); 
					INTCONST23_tree = (XTree)adaptor.dupNode(INTCONST23);


					adaptor.addChild(root_0, INTCONST23_tree);

					}
					break;
				case 3 :
					// gfiles/XTypeCheck.g:39:17: ^( UMINUS INTCONST )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					UMINUS24=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_expr201); 
					UMINUS24_tree = (XTree)adaptor.dupNode(UMINUS24);


					root_1 = (XTree)adaptor.becomeRoot(UMINUS24_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					INTCONST25=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr203); 
					INTCONST25_tree = (XTree)adaptor.dupNode(INTCONST25);


					adaptor.addChild(root_1, INTCONST25_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// gfiles/XTypeCheck.g:40:6: FLOATCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					FLOATCONST26=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr211); 
					FLOATCONST26_tree = (XTree)adaptor.dupNode(FLOATCONST26);


					adaptor.addChild(root_0, FLOATCONST26_tree);

					}
					break;
				case 5 :
					// gfiles/XTypeCheck.g:40:19: ^( UMINUS FLOATCONST )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					UMINUS27=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_expr216); 
					UMINUS27_tree = (XTree)adaptor.dupNode(UMINUS27);


					root_1 = (XTree)adaptor.becomeRoot(UMINUS27_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					FLOATCONST28=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr218); 
					FLOATCONST28_tree = (XTree)adaptor.dupNode(FLOATCONST28);


					adaptor.addChild(root_1, FLOATCONST28_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 6 :
					// gfiles/XTypeCheck.g:41:6: ID
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					ID29=(XTree)match(input,ID,FOLLOW_ID_in_expr226); 
					ID29_tree = (XTree)adaptor.dupNode(ID29);


					adaptor.addChild(root_0, ID29_tree);

					}
					break;
				case 7 :
					// gfiles/XTypeCheck.g:41:11: STRINGCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					STRINGCONST30=(XTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_expr230); 
					STRINGCONST30_tree = (XTree)adaptor.dupNode(STRINGCONST30);


					adaptor.addChild(root_0, STRINGCONST30_tree);

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
	// gfiles/XTypeCheck.g:44:1: assignstat : ^( ':=' ID expr ) ;
	public final XTypeCheck.assignstat_return assignstat() throws RecognitionException {
		XTypeCheck.assignstat_return retval = new XTypeCheck.assignstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal31=null;
		XTree ID32=null;
		TreeRuleReturnScope expr33 =null;

		XTree string_literal31_tree=null;
		XTree ID32_tree=null;

		try {
			// gfiles/XTypeCheck.g:44:11: ( ^( ':=' ID expr ) )
			// gfiles/XTypeCheck.g:44:13: ^( ':=' ID expr )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal31=(XTree)match(input,28,FOLLOW_28_in_assignstat239); 
			string_literal31_tree = (XTree)adaptor.dupNode(string_literal31);


			root_1 = (XTree)adaptor.becomeRoot(string_literal31_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			ID32=(XTree)match(input,ID,FOLLOW_ID_in_assignstat241); 
			ID32_tree = (XTree)adaptor.dupNode(ID32);


			adaptor.addChild(root_1, ID32_tree);

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_assignstat243);
			expr33=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr33.getTree());

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
	// $ANTLR end "assignstat"


	public static class cond_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// gfiles/XTypeCheck.g:47:1: cond : ^( comp expr expr ) ;
	public final XTypeCheck.cond_return cond() throws RecognitionException {
		XTypeCheck.cond_return retval = new XTypeCheck.cond_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		TreeRuleReturnScope comp34 =null;
		TreeRuleReturnScope expr35 =null;
		TreeRuleReturnScope expr36 =null;


		try {
			// gfiles/XTypeCheck.g:47:5: ( ^( comp expr expr ) )
			// gfiles/XTypeCheck.g:47:8: ^( comp expr expr )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_comp_in_cond254);
			comp34=comp();
			state._fsp--;

			root_1 = (XTree)adaptor.becomeRoot(comp34.getTree(), root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond256);
			expr35=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr35.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond258);
			expr36=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr36.getTree());

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
	// gfiles/XTypeCheck.g:48:1: comp : ( '<' | '>' | '=' );
	public final XTypeCheck.comp_return comp() throws RecognitionException {
		XTypeCheck.comp_return retval = new XTypeCheck.comp_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree set37=null;

		XTree set37_tree=null;

		try {
			// gfiles/XTypeCheck.g:48:5: ( '<' | '>' | '=' )
			// gfiles/XTypeCheck.g:
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			set37=(XTree)input.LT(1);
			if ( (input.LA(1) >= 30 && input.LA(1) <= 32) ) {
				input.consume();
				set37_tree = (XTree)adaptor.dupNode(set37);


				adaptor.addChild(root_0, set37_tree);

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
	// gfiles/XTypeCheck.g:51:1: condstat : ^( 'if' cond stat ( stat )? ) ;
	public final XTypeCheck.condstat_return condstat() throws RecognitionException {
		XTypeCheck.condstat_return retval = new XTypeCheck.condstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal38=null;
		TreeRuleReturnScope cond39 =null;
		TreeRuleReturnScope stat40 =null;
		TreeRuleReturnScope stat41 =null;

		XTree string_literal38_tree=null;

		try {
			// gfiles/XTypeCheck.g:51:9: ( ^( 'if' cond stat ( stat )? ) )
			// gfiles/XTypeCheck.g:51:11: ^( 'if' cond stat ( stat )? )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal38=(XTree)match(input,38,FOLLOW_38_in_condstat281); 
			string_literal38_tree = (XTree)adaptor.dupNode(string_literal38);


			root_1 = (XTree)adaptor.becomeRoot(string_literal38_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_condstat283);
			cond39=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond39.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_condstat285);
			stat40=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat40.getTree());

			// gfiles/XTypeCheck.g:51:28: ( stat )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==STATLIST||LA4_0==28||(LA4_0 >= 37 && LA4_0 <= 38)||LA4_0==45) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// gfiles/XTypeCheck.g:51:28: stat
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_stat_in_condstat287);
					stat41=stat();
					state._fsp--;

					adaptor.addChild(root_1, stat41.getTree());

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
	// gfiles/XTypeCheck.g:54:1: whilestat : ^( 'while' cond stat ) ;
	public final XTypeCheck.whilestat_return whilestat() throws RecognitionException {
		XTypeCheck.whilestat_return retval = new XTypeCheck.whilestat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal42=null;
		TreeRuleReturnScope cond43 =null;
		TreeRuleReturnScope stat44 =null;

		XTree string_literal42_tree=null;

		try {
			// gfiles/XTypeCheck.g:54:10: ( ^( 'while' cond stat ) )
			// gfiles/XTypeCheck.g:54:12: ^( 'while' cond stat )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal42=(XTree)match(input,45,FOLLOW_45_in_whilestat299); 
			string_literal42_tree = (XTree)adaptor.dupNode(string_literal42);


			root_1 = (XTree)adaptor.becomeRoot(string_literal42_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_whilestat301);
			cond43=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond43.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_whilestat303);
			stat44=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat44.getTree());

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
	// gfiles/XTypeCheck.g:55:1: forstat : ^( 'for' assignstat cond assignstat stat ) ;
	public final XTypeCheck.forstat_return forstat() throws RecognitionException {
		XTypeCheck.forstat_return retval = new XTypeCheck.forstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal45=null;
		TreeRuleReturnScope assignstat46 =null;
		TreeRuleReturnScope cond47 =null;
		TreeRuleReturnScope assignstat48 =null;
		TreeRuleReturnScope stat49 =null;

		XTree string_literal45_tree=null;

		try {
			// gfiles/XTypeCheck.g:55:8: ( ^( 'for' assignstat cond assignstat stat ) )
			// gfiles/XTypeCheck.g:55:10: ^( 'for' assignstat cond assignstat stat )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal45=(XTree)match(input,37,FOLLOW_37_in_forstat311); 
			string_literal45_tree = (XTree)adaptor.dupNode(string_literal45);


			root_1 = (XTree)adaptor.becomeRoot(string_literal45_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat313);
			assignstat46=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat46.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_forstat315);
			cond47=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond47.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat317);
			assignstat48=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat48.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_forstat319);
			stat49=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat49.getTree());

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
	// gfiles/XTypeCheck.g:58:1: stat : ( assignstat | condstat | whilestat | forstat | statlist );
	public final XTypeCheck.stat_return stat() throws RecognitionException {
		XTypeCheck.stat_return retval = new XTypeCheck.stat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		TreeRuleReturnScope assignstat50 =null;
		TreeRuleReturnScope condstat51 =null;
		TreeRuleReturnScope whilestat52 =null;
		TreeRuleReturnScope forstat53 =null;
		TreeRuleReturnScope statlist54 =null;


		try {
			// gfiles/XTypeCheck.g:58:5: ( assignstat | condstat | whilestat | forstat | statlist )
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
					// gfiles/XTypeCheck.g:58:8: assignstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_assignstat_in_stat329);
					assignstat50=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat50.getTree());

					}
					break;
				case 2 :
					// gfiles/XTypeCheck.g:58:21: condstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_condstat_in_stat333);
					condstat51=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat51.getTree());

					}
					break;
				case 3 :
					// gfiles/XTypeCheck.g:58:32: whilestat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_whilestat_in_stat337);
					whilestat52=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat52.getTree());

					}
					break;
				case 4 :
					// gfiles/XTypeCheck.g:58:44: forstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_forstat_in_stat341);
					forstat53=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat53.getTree());

					}
					break;
				case 5 :
					// gfiles/XTypeCheck.g:58:54: statlist
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_statlist_in_stat345);
					statlist54=statlist();
					state._fsp--;

					adaptor.addChild(root_0, statlist54.getTree());

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
	// gfiles/XTypeCheck.g:60:1: statlist : ^( STATLIST ( stat )* ) ;
	public final XTypeCheck.statlist_return statlist() throws RecognitionException {
		XTypeCheck.statlist_return retval = new XTypeCheck.statlist_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree STATLIST55=null;
		TreeRuleReturnScope stat56 =null;

		XTree STATLIST55_tree=null;

		try {
			// gfiles/XTypeCheck.g:60:9: ( ^( STATLIST ( stat )* ) )
			// gfiles/XTypeCheck.g:60:11: ^( STATLIST ( stat )* )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			STATLIST55=(XTree)match(input,STATLIST,FOLLOW_STATLIST_in_statlist353); 
			STATLIST55_tree = (XTree)adaptor.dupNode(STATLIST55);


			root_1 = (XTree)adaptor.becomeRoot(STATLIST55_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// gfiles/XTypeCheck.g:60:22: ( stat )*
				loop6:
				while (true) {
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==STATLIST||LA6_0==28||(LA6_0 >= 37 && LA6_0 <= 38)||LA6_0==45) ) {
						alt6=1;
					}

					switch (alt6) {
					case 1 :
						// gfiles/XTypeCheck.g:60:22: stat
						{
						_last = (XTree)input.LT(1);
						pushFollow(FOLLOW_stat_in_statlist355);
						stat56=stat();
						state._fsp--;

						adaptor.addChild(root_1, stat56.getTree());

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
	// gfiles/XTypeCheck.g:63:1: program : ^( 'program' ID decllist statlist ) ;
	public final XTypeCheck.program_return program() throws RecognitionException {
		XTypeCheck.program_return retval = new XTypeCheck.program_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal57=null;
		XTree ID58=null;
		TreeRuleReturnScope decllist59 =null;
		TreeRuleReturnScope statlist60 =null;

		XTree string_literal57_tree=null;
		XTree ID58_tree=null;

		try {
			// gfiles/XTypeCheck.g:63:8: ( ^( 'program' ID decllist statlist ) )
			// gfiles/XTypeCheck.g:63:10: ^( 'program' ID decllist statlist )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal57=(XTree)match(input,41,FOLLOW_41_in_program366); 
			string_literal57_tree = (XTree)adaptor.dupNode(string_literal57);


			root_1 = (XTree)adaptor.becomeRoot(string_literal57_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			ID58=(XTree)match(input,ID,FOLLOW_ID_in_program368); 
			ID58_tree = (XTree)adaptor.dupNode(ID58);


			adaptor.addChild(root_1, ID58_tree);

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_decllist_in_program370);
			decllist59=decllist();
			state._fsp--;

			adaptor.addChild(root_1, decllist59.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_statlist_in_program372);
			statlist60=statlist();
			state._fsp--;

			adaptor.addChild(root_1, statlist60.getTree());

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



	public static final BitSet FOLLOW_DECL_in_decl80 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl82 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl84 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl93 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl95 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl97 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_decl99 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl108 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl110 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl112 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_decl114 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl123 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl125 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl127 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_decl129 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_decl131 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist158 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_set_in_expr170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr186 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_expr188 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTCONST_in_expr196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_expr201 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_expr203 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_expr216 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr218 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_expr226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_expr230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignstat239 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat241 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_assignstat243 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_comp_in_cond254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond256 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_cond258 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_condstat281 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat283 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat285 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_stat_in_condstat287 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_45_in_whilestat299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat301 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_whilestat303 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_forstat311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat313 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat315 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_assignstat_in_forstat317 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_forstat319 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignstat_in_stat329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATLIST_in_statlist353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_statlist355 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_41_in_program366 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program368 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program370 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program372 = new BitSet(new long[]{0x0000000000000008L});
}
