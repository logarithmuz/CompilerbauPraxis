// $ANTLR 3.5.2 gfiles/XTreeGrammar.g 2019-05-27 13:13:03
package de.dhbw.compiler.antlrxtreegrammar;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class XTreeGrammar extends TreeParser {
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

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public XTreeGrammar(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XTreeGrammar(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XTreeGrammar.tokenNames; }
	@Override public String getGrammarFileName() { return "gfiles/XTreeGrammar.g"; }


	public static class decl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// gfiles/XTreeGrammar.g:24:1: decl : ( ^( DECL ID type ) | ^( DECL ID type 'read' ) | ^( DECL ID type 'print' ) | ^( DECL ID type 'read' 'print' ) );
	public final XTreeGrammar.decl_return decl() throws RecognitionException {
		XTreeGrammar.decl_return retval = new XTreeGrammar.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DECL1=null;
		CommonTree ID2=null;
		CommonTree DECL4=null;
		CommonTree ID5=null;
		CommonTree string_literal7=null;
		CommonTree DECL8=null;
		CommonTree ID9=null;
		CommonTree string_literal11=null;
		CommonTree DECL12=null;
		CommonTree ID13=null;
		CommonTree string_literal15=null;
		CommonTree string_literal16=null;
		TreeRuleReturnScope type3 =null;
		TreeRuleReturnScope type6 =null;
		TreeRuleReturnScope type10 =null;
		TreeRuleReturnScope type14 =null;

		CommonTree DECL1_tree=null;
		CommonTree ID2_tree=null;
		CommonTree DECL4_tree=null;
		CommonTree ID5_tree=null;
		CommonTree string_literal7_tree=null;
		CommonTree DECL8_tree=null;
		CommonTree ID9_tree=null;
		CommonTree string_literal11_tree=null;
		CommonTree DECL12_tree=null;
		CommonTree ID13_tree=null;
		CommonTree string_literal15_tree=null;
		CommonTree string_literal16_tree=null;

		try {
			// gfiles/XTreeGrammar.g:24:5: ( ^( DECL ID type ) | ^( DECL ID type 'read' ) | ^( DECL ID type 'print' ) | ^( DECL ID type 'read' 'print' ) )
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
					// gfiles/XTreeGrammar.g:24:8: ^( DECL ID type )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DECL1=(CommonTree)match(input,DECL,FOLLOW_DECL_in_decl64); 
					DECL1_tree = (CommonTree)adaptor.dupNode(DECL1);


					root_1 = (CommonTree)adaptor.becomeRoot(DECL1_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_decl66); 
					ID2_tree = (CommonTree)adaptor.dupNode(ID2);


					adaptor.addChild(root_1, ID2_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl68);
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
					// gfiles/XTreeGrammar.g:25:6: ^( DECL ID type 'read' )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DECL4=(CommonTree)match(input,DECL,FOLLOW_DECL_in_decl77); 
					DECL4_tree = (CommonTree)adaptor.dupNode(DECL4);


					root_1 = (CommonTree)adaptor.becomeRoot(DECL4_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_decl79); 
					ID5_tree = (CommonTree)adaptor.dupNode(ID5);


					adaptor.addChild(root_1, ID5_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl81);
					type6=type();
					state._fsp--;

					adaptor.addChild(root_1, type6.getTree());

					_last = (CommonTree)input.LT(1);
					string_literal7=(CommonTree)match(input,42,FOLLOW_42_in_decl83); 
					string_literal7_tree = (CommonTree)adaptor.dupNode(string_literal7);


					adaptor.addChild(root_1, string_literal7_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// gfiles/XTreeGrammar.g:26:6: ^( DECL ID type 'print' )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DECL8=(CommonTree)match(input,DECL,FOLLOW_DECL_in_decl92); 
					DECL8_tree = (CommonTree)adaptor.dupNode(DECL8);


					root_1 = (CommonTree)adaptor.becomeRoot(DECL8_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_decl94); 
					ID9_tree = (CommonTree)adaptor.dupNode(ID9);


					adaptor.addChild(root_1, ID9_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl96);
					type10=type();
					state._fsp--;

					adaptor.addChild(root_1, type10.getTree());

					_last = (CommonTree)input.LT(1);
					string_literal11=(CommonTree)match(input,40,FOLLOW_40_in_decl98); 
					string_literal11_tree = (CommonTree)adaptor.dupNode(string_literal11);


					adaptor.addChild(root_1, string_literal11_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// gfiles/XTreeGrammar.g:27:6: ^( DECL ID type 'read' 'print' )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DECL12=(CommonTree)match(input,DECL,FOLLOW_DECL_in_decl107); 
					DECL12_tree = (CommonTree)adaptor.dupNode(DECL12);


					root_1 = (CommonTree)adaptor.becomeRoot(DECL12_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID13=(CommonTree)match(input,ID,FOLLOW_ID_in_decl109); 
					ID13_tree = (CommonTree)adaptor.dupNode(ID13);


					adaptor.addChild(root_1, ID13_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_in_decl111);
					type14=type();
					state._fsp--;

					adaptor.addChild(root_1, type14.getTree());

					_last = (CommonTree)input.LT(1);
					string_literal15=(CommonTree)match(input,42,FOLLOW_42_in_decl113); 
					string_literal15_tree = (CommonTree)adaptor.dupNode(string_literal15);


					adaptor.addChild(root_1, string_literal15_tree);

					_last = (CommonTree)input.LT(1);
					string_literal16=(CommonTree)match(input,40,FOLLOW_40_in_decl115); 
					string_literal16_tree = (CommonTree)adaptor.dupNode(string_literal16);


					adaptor.addChild(root_1, string_literal16_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// gfiles/XTreeGrammar.g:29:1: type : ( 'int' | 'float' | 'string' );
	public final XTreeGrammar.type_return type() throws RecognitionException {
		XTreeGrammar.type_return retval = new XTreeGrammar.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set17=null;

		CommonTree set17_tree=null;

		try {
			// gfiles/XTreeGrammar.g:29:5: ( 'int' | 'float' | 'string' )
			// gfiles/XTreeGrammar.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set17=(CommonTree)input.LT(1);
			if ( input.LA(1)==36||input.LA(1)==39||input.LA(1)==43 ) {
				input.consume();
				set17_tree = (CommonTree)adaptor.dupNode(set17);


				adaptor.addChild(root_0, set17_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decllist"
	// gfiles/XTreeGrammar.g:31:1: decllist : ^( DECLLIST ( decl )* ) ;
	public final XTreeGrammar.decllist_return decllist() throws RecognitionException {
		XTreeGrammar.decllist_return retval = new XTreeGrammar.decllist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DECLLIST18=null;
		TreeRuleReturnScope decl19 =null;

		CommonTree DECLLIST18_tree=null;

		try {
			// gfiles/XTreeGrammar.g:31:9: ( ^( DECLLIST ( decl )* ) )
			// gfiles/XTreeGrammar.g:31:11: ^( DECLLIST ( decl )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DECLLIST18=(CommonTree)match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist140); 
			DECLLIST18_tree = (CommonTree)adaptor.dupNode(DECLLIST18);


			root_1 = (CommonTree)adaptor.becomeRoot(DECLLIST18_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// gfiles/XTreeGrammar.g:31:22: ( decl )*
				loop2:
				while (true) {
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==DECL) ) {
						alt2=1;
					}

					switch (alt2) {
					case 1 :
						// gfiles/XTreeGrammar.g:31:22: decl
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_decl_in_decllist142);
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

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// gfiles/XTreeGrammar.g:34:1: expr : ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | ^( UMINUS ( INTCONST | FLOATCONST ) ) | INTCONST | FLOATCONST | ID | STRINGCONST );
	public final XTreeGrammar.expr_return expr() throws RecognitionException {
		XTreeGrammar.expr_return retval = new XTreeGrammar.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set20=null;
		CommonTree UMINUS23=null;
		CommonTree set24=null;
		CommonTree INTCONST25=null;
		CommonTree FLOATCONST26=null;
		CommonTree ID27=null;
		CommonTree STRINGCONST28=null;
		TreeRuleReturnScope expr21 =null;
		TreeRuleReturnScope expr22 =null;

		CommonTree set20_tree=null;
		CommonTree UMINUS23_tree=null;
		CommonTree set24_tree=null;
		CommonTree INTCONST25_tree=null;
		CommonTree FLOATCONST26_tree=null;
		CommonTree ID27_tree=null;
		CommonTree STRINGCONST28_tree=null;

		try {
			// gfiles/XTreeGrammar.g:34:5: ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | ^( UMINUS ( INTCONST | FLOATCONST ) ) | INTCONST | FLOATCONST | ID | STRINGCONST )
			int alt3=6;
			switch ( input.LA(1) ) {
			case 22:
			case 23:
			case 24:
			case 26:
				{
				alt3=1;
				}
				break;
			case UMINUS:
				{
				alt3=2;
				}
				break;
			case INTCONST:
				{
				alt3=3;
				}
				break;
			case FLOATCONST:
				{
				alt3=4;
				}
				break;
			case ID:
				{
				alt3=5;
				}
				break;
			case STRINGCONST:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// gfiles/XTreeGrammar.g:34:8: ^( ( '+' | '-' | '*' | '/' ) expr expr )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					set20=(CommonTree)input.LT(1);
					if ( (input.LA(1) >= 22 && input.LA(1) <= 24)||input.LA(1)==26 ) {
						input.consume();
						set20_tree = (CommonTree)adaptor.dupNode(set20);


						root_1 = (CommonTree)adaptor.becomeRoot(set20_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr170);
					expr21=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr21.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr172);
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
					// gfiles/XTreeGrammar.g:35:6: ^( UMINUS ( INTCONST | FLOATCONST ) )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					UMINUS23=(CommonTree)match(input,UMINUS,FOLLOW_UMINUS_in_expr182); 
					UMINUS23_tree = (CommonTree)adaptor.dupNode(UMINUS23);


					root_1 = (CommonTree)adaptor.becomeRoot(UMINUS23_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					set24=(CommonTree)input.LT(1);
					if ( input.LA(1)==FLOATCONST||input.LA(1)==INTCONST ) {
						input.consume();
						set24_tree = (CommonTree)adaptor.dupNode(set24);


						adaptor.addChild(root_1, set24_tree);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// gfiles/XTreeGrammar.g:36:6: INTCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INTCONST25=(CommonTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr198); 
					INTCONST25_tree = (CommonTree)adaptor.dupNode(INTCONST25);


					adaptor.addChild(root_0, INTCONST25_tree);

					}
					break;
				case 4 :
					// gfiles/XTreeGrammar.g:37:6: FLOATCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					FLOATCONST26=(CommonTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr205); 
					FLOATCONST26_tree = (CommonTree)adaptor.dupNode(FLOATCONST26);


					adaptor.addChild(root_0, FLOATCONST26_tree);

					}
					break;
				case 5 :
					// gfiles/XTreeGrammar.g:38:6: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					ID27=(CommonTree)match(input,ID,FOLLOW_ID_in_expr212); 
					ID27_tree = (CommonTree)adaptor.dupNode(ID27);


					adaptor.addChild(root_0, ID27_tree);

					}
					break;
				case 6 :
					// gfiles/XTreeGrammar.g:39:6: STRINGCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					STRINGCONST28=(CommonTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_expr219); 
					STRINGCONST28_tree = (CommonTree)adaptor.dupNode(STRINGCONST28);


					adaptor.addChild(root_0, STRINGCONST28_tree);

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignstat"
	// gfiles/XTreeGrammar.g:42:1: assignstat : ^( ':=' ID expr ) ;
	public final XTreeGrammar.assignstat_return assignstat() throws RecognitionException {
		XTreeGrammar.assignstat_return retval = new XTreeGrammar.assignstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal29=null;
		CommonTree ID30=null;
		TreeRuleReturnScope expr31 =null;

		CommonTree string_literal29_tree=null;
		CommonTree ID30_tree=null;

		try {
			// gfiles/XTreeGrammar.g:42:11: ( ^( ':=' ID expr ) )
			// gfiles/XTreeGrammar.g:42:13: ^( ':=' ID expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal29=(CommonTree)match(input,28,FOLLOW_28_in_assignstat228); 
			string_literal29_tree = (CommonTree)adaptor.dupNode(string_literal29);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal29_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID30=(CommonTree)match(input,ID,FOLLOW_ID_in_assignstat230); 
			ID30_tree = (CommonTree)adaptor.dupNode(ID30);


			adaptor.addChild(root_1, ID30_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_assignstat232);
			expr31=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr31.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// gfiles/XTreeGrammar.g:45:1: cond : ^( comp expr expr ) ;
	public final XTreeGrammar.cond_return cond() throws RecognitionException {
		XTreeGrammar.cond_return retval = new XTreeGrammar.cond_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope comp32 =null;
		TreeRuleReturnScope expr33 =null;
		TreeRuleReturnScope expr34 =null;


		try {
			// gfiles/XTreeGrammar.g:45:5: ( ^( comp expr expr ) )
			// gfiles/XTreeGrammar.g:45:8: ^( comp expr expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_comp_in_cond243);
			comp32=comp();
			state._fsp--;

			root_1 = (CommonTree)adaptor.becomeRoot(comp32.getTree(), root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond245);
			expr33=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr33.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond247);
			expr34=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr34.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "comp"
	// gfiles/XTreeGrammar.g:46:1: comp : ( '<' | '>' | '=' );
	public final XTreeGrammar.comp_return comp() throws RecognitionException {
		XTreeGrammar.comp_return retval = new XTreeGrammar.comp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set35=null;

		CommonTree set35_tree=null;

		try {
			// gfiles/XTreeGrammar.g:46:5: ( '<' | '>' | '=' )
			// gfiles/XTreeGrammar.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set35=(CommonTree)input.LT(1);
			if ( (input.LA(1) >= 30 && input.LA(1) <= 32) ) {
				input.consume();
				set35_tree = (CommonTree)adaptor.dupNode(set35);


				adaptor.addChild(root_0, set35_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "condstat"
	// gfiles/XTreeGrammar.g:49:1: condstat : ^( 'if' cond stat ( stat )? ) ;
	public final XTreeGrammar.condstat_return condstat() throws RecognitionException {
		XTreeGrammar.condstat_return retval = new XTreeGrammar.condstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal36=null;
		TreeRuleReturnScope cond37 =null;
		TreeRuleReturnScope stat38 =null;
		TreeRuleReturnScope stat39 =null;

		CommonTree string_literal36_tree=null;

		try {
			// gfiles/XTreeGrammar.g:49:9: ( ^( 'if' cond stat ( stat )? ) )
			// gfiles/XTreeGrammar.g:49:11: ^( 'if' cond stat ( stat )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal36=(CommonTree)match(input,38,FOLLOW_38_in_condstat270); 
			string_literal36_tree = (CommonTree)adaptor.dupNode(string_literal36);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal36_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_condstat272);
			cond37=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond37.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_condstat274);
			stat38=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat38.getTree());

			// gfiles/XTreeGrammar.g:49:28: ( stat )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==STATLIST||LA4_0==28||(LA4_0 >= 37 && LA4_0 <= 38)||LA4_0==45) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// gfiles/XTreeGrammar.g:49:28: stat
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_stat_in_condstat276);
					stat39=stat();
					state._fsp--;

					adaptor.addChild(root_1, stat39.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whilestat"
	// gfiles/XTreeGrammar.g:52:1: whilestat : ^( 'while' cond stat ) ;
	public final XTreeGrammar.whilestat_return whilestat() throws RecognitionException {
		XTreeGrammar.whilestat_return retval = new XTreeGrammar.whilestat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal40=null;
		TreeRuleReturnScope cond41 =null;
		TreeRuleReturnScope stat42 =null;

		CommonTree string_literal40_tree=null;

		try {
			// gfiles/XTreeGrammar.g:52:10: ( ^( 'while' cond stat ) )
			// gfiles/XTreeGrammar.g:52:12: ^( 'while' cond stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal40=(CommonTree)match(input,45,FOLLOW_45_in_whilestat288); 
			string_literal40_tree = (CommonTree)adaptor.dupNode(string_literal40);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal40_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_whilestat290);
			cond41=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond41.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_whilestat292);
			stat42=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat42.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// gfiles/XTreeGrammar.g:53:1: forstat : ^( 'for' assignstat cond assignstat stat ) ;
	public final XTreeGrammar.forstat_return forstat() throws RecognitionException {
		XTreeGrammar.forstat_return retval = new XTreeGrammar.forstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal43=null;
		TreeRuleReturnScope assignstat44 =null;
		TreeRuleReturnScope cond45 =null;
		TreeRuleReturnScope assignstat46 =null;
		TreeRuleReturnScope stat47 =null;

		CommonTree string_literal43_tree=null;

		try {
			// gfiles/XTreeGrammar.g:53:8: ( ^( 'for' assignstat cond assignstat stat ) )
			// gfiles/XTreeGrammar.g:53:10: ^( 'for' assignstat cond assignstat stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal43=(CommonTree)match(input,37,FOLLOW_37_in_forstat300); 
			string_literal43_tree = (CommonTree)adaptor.dupNode(string_literal43);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal43_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat302);
			assignstat44=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat44.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_forstat304);
			cond45=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond45.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat306);
			assignstat46=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat46.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_forstat308);
			stat47=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat47.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// gfiles/XTreeGrammar.g:56:1: stat : ( assignstat | condstat | whilestat | forstat | statlist );
	public final XTreeGrammar.stat_return stat() throws RecognitionException {
		XTreeGrammar.stat_return retval = new XTreeGrammar.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope assignstat48 =null;
		TreeRuleReturnScope condstat49 =null;
		TreeRuleReturnScope whilestat50 =null;
		TreeRuleReturnScope forstat51 =null;
		TreeRuleReturnScope statlist52 =null;


		try {
			// gfiles/XTreeGrammar.g:56:5: ( assignstat | condstat | whilestat | forstat | statlist )
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
					// gfiles/XTreeGrammar.g:56:8: assignstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_assignstat_in_stat319);
					assignstat48=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat48.getTree());

					}
					break;
				case 2 :
					// gfiles/XTreeGrammar.g:56:21: condstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_condstat_in_stat323);
					condstat49=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat49.getTree());

					}
					break;
				case 3 :
					// gfiles/XTreeGrammar.g:56:32: whilestat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_whilestat_in_stat327);
					whilestat50=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat50.getTree());

					}
					break;
				case 4 :
					// gfiles/XTreeGrammar.g:56:44: forstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_forstat_in_stat331);
					forstat51=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat51.getTree());

					}
					break;
				case 5 :
					// gfiles/XTreeGrammar.g:56:54: statlist
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statlist_in_stat335);
					statlist52=statlist();
					state._fsp--;

					adaptor.addChild(root_0, statlist52.getTree());

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statlist"
	// gfiles/XTreeGrammar.g:58:1: statlist : ^( STATLIST ( stat )* ) ;
	public final XTreeGrammar.statlist_return statlist() throws RecognitionException {
		XTreeGrammar.statlist_return retval = new XTreeGrammar.statlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree STATLIST53=null;
		TreeRuleReturnScope stat54 =null;

		CommonTree STATLIST53_tree=null;

		try {
			// gfiles/XTreeGrammar.g:58:9: ( ^( STATLIST ( stat )* ) )
			// gfiles/XTreeGrammar.g:58:11: ^( STATLIST ( stat )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			STATLIST53=(CommonTree)match(input,STATLIST,FOLLOW_STATLIST_in_statlist343); 
			STATLIST53_tree = (CommonTree)adaptor.dupNode(STATLIST53);


			root_1 = (CommonTree)adaptor.becomeRoot(STATLIST53_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// gfiles/XTreeGrammar.g:58:22: ( stat )*
				loop6:
				while (true) {
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==STATLIST||LA6_0==28||(LA6_0 >= 37 && LA6_0 <= 38)||LA6_0==45) ) {
						alt6=1;
					}

					switch (alt6) {
					case 1 :
						// gfiles/XTreeGrammar.g:58:22: stat
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_stat_in_statlist345);
						stat54=stat();
						state._fsp--;

						adaptor.addChild(root_1, stat54.getTree());

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

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// gfiles/XTreeGrammar.g:61:1: program : ^( 'program' ID decllist statlist ) ;
	public final XTreeGrammar.program_return program() throws RecognitionException {
		XTreeGrammar.program_return retval = new XTreeGrammar.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal55=null;
		CommonTree ID56=null;
		TreeRuleReturnScope decllist57 =null;
		TreeRuleReturnScope statlist58 =null;

		CommonTree string_literal55_tree=null;
		CommonTree ID56_tree=null;

		try {
			// gfiles/XTreeGrammar.g:61:8: ( ^( 'program' ID decllist statlist ) )
			// gfiles/XTreeGrammar.g:61:10: ^( 'program' ID decllist statlist )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal55=(CommonTree)match(input,41,FOLLOW_41_in_program356); 
			string_literal55_tree = (CommonTree)adaptor.dupNode(string_literal55);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal55_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID56=(CommonTree)match(input,ID,FOLLOW_ID_in_program358); 
			ID56_tree = (CommonTree)adaptor.dupNode(ID56);


			adaptor.addChild(root_1, ID56_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_decllist_in_program360);
			decllist57=decllist();
			state._fsp--;

			adaptor.addChild(root_1, decllist57.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_statlist_in_program362);
			statlist58=statlist();
			state._fsp--;

			adaptor.addChild(root_1, statlist58.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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



	public static final BitSet FOLLOW_DECL_in_decl64 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl66 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl68 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl77 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl79 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl81 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_decl83 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl92 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl94 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl96 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_decl98 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl107 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl109 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl111 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_decl113 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_decl115 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist140 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist142 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_set_in_expr154 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr170 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_expr172 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UMINUS_in_expr182 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_expr184 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTCONST_in_expr198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_expr219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignstat228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat230 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_assignstat232 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_comp_in_cond243 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond245 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_cond247 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_condstat270 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat272 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat274 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_stat_in_condstat276 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_45_in_whilestat288 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat290 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_whilestat292 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_forstat300 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat302 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat304 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_assignstat_in_forstat306 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_forstat308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignstat_in_stat319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATLIST_in_statlist343 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_statlist345 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_41_in_program356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program358 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program360 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program362 = new BitSet(new long[]{0x0000000000000008L});
}
