// $ANTLR 3.5.2 C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g 2019-05-23 17:33:59
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
	@Override public String getGrammarFileName() { return "C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g"; }


	public static class decl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:24:1: decl : ( ^( DECL ID type ) | ^( DECL ID type 'read' ) | ^( DECL ID type 'print' ) | ^( DECL ID type 'read' 'print' ) );
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
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:24:5: ( ^( DECL ID type ) | ^( DECL ID type 'read' ) | ^( DECL ID type 'print' ) | ^( DECL ID type 'read' 'print' ) )
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
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:24:8: ^( DECL ID type )
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
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:25:6: ^( DECL ID type 'read' )
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
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:26:6: ^( DECL ID type 'print' )
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
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:27:6: ^( DECL ID type 'read' 'print' )
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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:29:1: type : ( 'int' | 'float' | 'string' );
	public final XTreeGrammar.type_return type() throws RecognitionException {
		XTreeGrammar.type_return retval = new XTreeGrammar.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set17=null;

		CommonTree set17_tree=null;

		try {
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:29:5: ( 'int' | 'float' | 'string' )
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:
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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:31:1: decllist : ^( DECLLIST ( decl )* ) ;
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
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:31:9: ( ^( DECLLIST ( decl )* ) )
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:31:11: ^( DECLLIST ( decl )* )
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
				// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:31:22: ( decl )*
				loop2:
				while (true) {
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==DECL) ) {
						alt2=1;
					}

					switch (alt2) {
					case 1 :
						// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:31:22: decl
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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:34:1: expr : ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | INTCONST | ^( UMINUS INTCONST ) | FLOATCONST | ^( UMINUS FLOATCONST ) | ID | STRINGCONST );
	public final XTreeGrammar.expr_return expr() throws RecognitionException {
		XTreeGrammar.expr_return retval = new XTreeGrammar.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set20=null;
		CommonTree INTCONST23=null;
		CommonTree UMINUS24=null;
		CommonTree INTCONST25=null;
		CommonTree FLOATCONST26=null;
		CommonTree UMINUS27=null;
		CommonTree FLOATCONST28=null;
		CommonTree ID29=null;
		CommonTree STRINGCONST30=null;
		TreeRuleReturnScope expr21 =null;
		TreeRuleReturnScope expr22 =null;

		CommonTree set20_tree=null;
		CommonTree INTCONST23_tree=null;
		CommonTree UMINUS24_tree=null;
		CommonTree INTCONST25_tree=null;
		CommonTree FLOATCONST26_tree=null;
		CommonTree UMINUS27_tree=null;
		CommonTree FLOATCONST28_tree=null;
		CommonTree ID29_tree=null;
		CommonTree STRINGCONST30_tree=null;

		try {
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:34:5: ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | INTCONST | ^( UMINUS INTCONST ) | FLOATCONST | ^( UMINUS FLOATCONST ) | ID | STRINGCONST )
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
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:34:8: ^( ( '+' | '-' | '*' | '/' ) expr expr )
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
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:35:6: INTCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INTCONST23=(CommonTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr181); 
					INTCONST23_tree = (CommonTree)adaptor.dupNode(INTCONST23);


					adaptor.addChild(root_0, INTCONST23_tree);

					}
					break;
				case 3 :
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:35:17: ^( UMINUS INTCONST )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					UMINUS24=(CommonTree)match(input,UMINUS,FOLLOW_UMINUS_in_expr186); 
					UMINUS24_tree = (CommonTree)adaptor.dupNode(UMINUS24);


					root_1 = (CommonTree)adaptor.becomeRoot(UMINUS24_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					INTCONST25=(CommonTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr188); 
					INTCONST25_tree = (CommonTree)adaptor.dupNode(INTCONST25);


					adaptor.addChild(root_1, INTCONST25_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:36:6: FLOATCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					FLOATCONST26=(CommonTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr196); 
					FLOATCONST26_tree = (CommonTree)adaptor.dupNode(FLOATCONST26);


					adaptor.addChild(root_0, FLOATCONST26_tree);

					}
					break;
				case 5 :
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:36:19: ^( UMINUS FLOATCONST )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					UMINUS27=(CommonTree)match(input,UMINUS,FOLLOW_UMINUS_in_expr201); 
					UMINUS27_tree = (CommonTree)adaptor.dupNode(UMINUS27);


					root_1 = (CommonTree)adaptor.becomeRoot(UMINUS27_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					FLOATCONST28=(CommonTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr203); 
					FLOATCONST28_tree = (CommonTree)adaptor.dupNode(FLOATCONST28);


					adaptor.addChild(root_1, FLOATCONST28_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 6 :
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:37:6: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					ID29=(CommonTree)match(input,ID,FOLLOW_ID_in_expr211); 
					ID29_tree = (CommonTree)adaptor.dupNode(ID29);


					adaptor.addChild(root_0, ID29_tree);

					}
					break;
				case 7 :
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:37:11: STRINGCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					STRINGCONST30=(CommonTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_expr215); 
					STRINGCONST30_tree = (CommonTree)adaptor.dupNode(STRINGCONST30);


					adaptor.addChild(root_0, STRINGCONST30_tree);

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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:40:1: assignstat : ^( ':=' ID expr ) ;
	public final XTreeGrammar.assignstat_return assignstat() throws RecognitionException {
		XTreeGrammar.assignstat_return retval = new XTreeGrammar.assignstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal31=null;
		CommonTree ID32=null;
		TreeRuleReturnScope expr33 =null;

		CommonTree string_literal31_tree=null;
		CommonTree ID32_tree=null;

		try {
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:40:11: ( ^( ':=' ID expr ) )
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:40:13: ^( ':=' ID expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal31=(CommonTree)match(input,28,FOLLOW_28_in_assignstat224); 
			string_literal31_tree = (CommonTree)adaptor.dupNode(string_literal31);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal31_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID32=(CommonTree)match(input,ID,FOLLOW_ID_in_assignstat226); 
			ID32_tree = (CommonTree)adaptor.dupNode(ID32);


			adaptor.addChild(root_1, ID32_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_assignstat228);
			expr33=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr33.getTree());

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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:43:1: cond : ^( comp expr expr ) ;
	public final XTreeGrammar.cond_return cond() throws RecognitionException {
		XTreeGrammar.cond_return retval = new XTreeGrammar.cond_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope comp34 =null;
		TreeRuleReturnScope expr35 =null;
		TreeRuleReturnScope expr36 =null;


		try {
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:43:5: ( ^( comp expr expr ) )
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:43:8: ^( comp expr expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_comp_in_cond239);
			comp34=comp();
			state._fsp--;

			root_1 = (CommonTree)adaptor.becomeRoot(comp34.getTree(), root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond241);
			expr35=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr35.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond243);
			expr36=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr36.getTree());

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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:44:1: comp : ( '<' | '>' | '=' );
	public final XTreeGrammar.comp_return comp() throws RecognitionException {
		XTreeGrammar.comp_return retval = new XTreeGrammar.comp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set37=null;

		CommonTree set37_tree=null;

		try {
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:44:5: ( '<' | '>' | '=' )
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set37=(CommonTree)input.LT(1);
			if ( (input.LA(1) >= 30 && input.LA(1) <= 32) ) {
				input.consume();
				set37_tree = (CommonTree)adaptor.dupNode(set37);


				adaptor.addChild(root_0, set37_tree);

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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:47:1: condstat : ^( 'if' cond stat ( stat )? ) ;
	public final XTreeGrammar.condstat_return condstat() throws RecognitionException {
		XTreeGrammar.condstat_return retval = new XTreeGrammar.condstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal38=null;
		TreeRuleReturnScope cond39 =null;
		TreeRuleReturnScope stat40 =null;
		TreeRuleReturnScope stat41 =null;

		CommonTree string_literal38_tree=null;

		try {
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:47:9: ( ^( 'if' cond stat ( stat )? ) )
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:47:11: ^( 'if' cond stat ( stat )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal38=(CommonTree)match(input,38,FOLLOW_38_in_condstat266); 
			string_literal38_tree = (CommonTree)adaptor.dupNode(string_literal38);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal38_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_condstat268);
			cond39=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond39.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_condstat270);
			stat40=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat40.getTree());

			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:47:28: ( stat )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==STATLIST||LA4_0==28||(LA4_0 >= 37 && LA4_0 <= 38)||LA4_0==45) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:47:28: stat
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_stat_in_condstat272);
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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:50:1: whilestat : ^( 'while' cond stat ) ;
	public final XTreeGrammar.whilestat_return whilestat() throws RecognitionException {
		XTreeGrammar.whilestat_return retval = new XTreeGrammar.whilestat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal42=null;
		TreeRuleReturnScope cond43 =null;
		TreeRuleReturnScope stat44 =null;

		CommonTree string_literal42_tree=null;

		try {
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:50:10: ( ^( 'while' cond stat ) )
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:50:12: ^( 'while' cond stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal42=(CommonTree)match(input,45,FOLLOW_45_in_whilestat284); 
			string_literal42_tree = (CommonTree)adaptor.dupNode(string_literal42);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal42_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_whilestat286);
			cond43=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond43.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_whilestat288);
			stat44=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat44.getTree());

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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:51:1: forstat : ^( 'for' assignstat cond assignstat stat ) ;
	public final XTreeGrammar.forstat_return forstat() throws RecognitionException {
		XTreeGrammar.forstat_return retval = new XTreeGrammar.forstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal45=null;
		TreeRuleReturnScope assignstat46 =null;
		TreeRuleReturnScope cond47 =null;
		TreeRuleReturnScope assignstat48 =null;
		TreeRuleReturnScope stat49 =null;

		CommonTree string_literal45_tree=null;

		try {
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:51:8: ( ^( 'for' assignstat cond assignstat stat ) )
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:51:10: ^( 'for' assignstat cond assignstat stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal45=(CommonTree)match(input,37,FOLLOW_37_in_forstat296); 
			string_literal45_tree = (CommonTree)adaptor.dupNode(string_literal45);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal45_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat298);
			assignstat46=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat46.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_forstat300);
			cond47=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond47.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat302);
			assignstat48=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat48.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_forstat304);
			stat49=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat49.getTree());

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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:54:1: stat : ( assignstat | condstat | whilestat | forstat | statlist );
	public final XTreeGrammar.stat_return stat() throws RecognitionException {
		XTreeGrammar.stat_return retval = new XTreeGrammar.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope assignstat50 =null;
		TreeRuleReturnScope condstat51 =null;
		TreeRuleReturnScope whilestat52 =null;
		TreeRuleReturnScope forstat53 =null;
		TreeRuleReturnScope statlist54 =null;


		try {
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:54:5: ( assignstat | condstat | whilestat | forstat | statlist )
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
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:54:8: assignstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_assignstat_in_stat315);
					assignstat50=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat50.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:54:21: condstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_condstat_in_stat319);
					condstat51=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat51.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:54:32: whilestat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_whilestat_in_stat323);
					whilestat52=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat52.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:54:44: forstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_forstat_in_stat327);
					forstat53=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat53.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:54:54: statlist
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statlist_in_stat331);
					statlist54=statlist();
					state._fsp--;

					adaptor.addChild(root_0, statlist54.getTree());

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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:56:1: statlist : ^( STATLIST ( stat )* ) ;
	public final XTreeGrammar.statlist_return statlist() throws RecognitionException {
		XTreeGrammar.statlist_return retval = new XTreeGrammar.statlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree STATLIST55=null;
		TreeRuleReturnScope stat56 =null;

		CommonTree STATLIST55_tree=null;

		try {
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:56:9: ( ^( STATLIST ( stat )* ) )
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:56:11: ^( STATLIST ( stat )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			STATLIST55=(CommonTree)match(input,STATLIST,FOLLOW_STATLIST_in_statlist339); 
			STATLIST55_tree = (CommonTree)adaptor.dupNode(STATLIST55);


			root_1 = (CommonTree)adaptor.becomeRoot(STATLIST55_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:56:22: ( stat )*
				loop6:
				while (true) {
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==STATLIST||LA6_0==28||(LA6_0 >= 37 && LA6_0 <= 38)||LA6_0==45) ) {
						alt6=1;
					}

					switch (alt6) {
					case 1 :
						// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:56:22: stat
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_stat_in_statlist341);
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
	// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:59:1: program : ^( 'program' ID decllist statlist ) ;
	public final XTreeGrammar.program_return program() throws RecognitionException {
		XTreeGrammar.program_return retval = new XTreeGrammar.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal57=null;
		CommonTree ID58=null;
		TreeRuleReturnScope decllist59 =null;
		TreeRuleReturnScope statlist60 =null;

		CommonTree string_literal57_tree=null;
		CommonTree ID58_tree=null;

		try {
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:59:8: ( ^( 'program' ID decllist statlist ) )
			// C:\\Users\\mahu\\OneDrive - student.dhbw-karlsruhe.de\\_Studium\\Theoriephase 4\\Compilerbau\\Übungen\\09.Antlr Baumgrammatiken\\CC-Praxis-Antlr Baumgrammatiken-Leer\\src\\de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:59:10: ^( 'program' ID decllist statlist )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal57=(CommonTree)match(input,41,FOLLOW_41_in_program352); 
			string_literal57_tree = (CommonTree)adaptor.dupNode(string_literal57);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal57_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID58=(CommonTree)match(input,ID,FOLLOW_ID_in_program354); 
			ID58_tree = (CommonTree)adaptor.dupNode(ID58);


			adaptor.addChild(root_1, ID58_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_decllist_in_program356);
			decllist59=decllist();
			state._fsp--;

			adaptor.addChild(root_1, decllist59.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_statlist_in_program358);
			statlist60=statlist();
			state._fsp--;

			adaptor.addChild(root_1, statlist60.getTree());

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
	public static final BitSet FOLLOW_INTCONST_in_expr181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_expr186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_expr188 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_expr201 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr203 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_expr211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_expr215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignstat224 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat226 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_assignstat228 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_comp_in_cond239 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond241 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_cond243 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_condstat266 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat268 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat270 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_stat_in_condstat272 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_45_in_whilestat284 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat286 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_whilestat288 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_forstat296 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat298 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat300 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_assignstat_in_forstat302 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_forstat304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignstat_in_stat315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATLIST_in_statlist339 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_statlist341 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_41_in_program352 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program354 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program356 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program358 = new BitSet(new long[]{0x0000000000000008L});
}
