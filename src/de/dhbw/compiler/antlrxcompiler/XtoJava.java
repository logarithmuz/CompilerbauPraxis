// $ANTLR 3.5.2 gfiles/XtoJava.g 2019-06-02 17:32:59

    package de.dhbw.compiler.antlrxcompiler;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class XtoJava extends TreeParser {
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
	public static final int ASSIGN=28;
	public static final int DIV=26;
	public static final int FLOAT=36;
	public static final int INT=39;
	public static final int MINUS=24;
	public static final int MULT=22;
	public static final int PLUS=23;
	public static final int STRING=43;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public XtoJava(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XtoJava(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("XtoJavaTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return XtoJava.tokenNames; }
	@Override public String getGrammarFileName() { return "gfiles/XtoJava.g"; }



	  private SymbolTable  symbols = SymbolTable.getInstance();  
	     


	public static class decl_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "decl"
	// gfiles/XtoJava.g:21:1: decl : ( ^( DECL ID type ) -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>| ^( DECL ID type 'read' ) -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>| ^( DECL ID type 'print' ) -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>| ^( DECL ID type 'read' 'print' ) -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>);
	public final XtoJava.decl_return decl() throws RecognitionException {
		XtoJava.decl_return retval = new XtoJava.decl_return();
		retval.start = input.LT(1);

		XTree ID2=null;
		XTree ID4=null;
		XTree ID6=null;
		XTree ID8=null;
		TreeRuleReturnScope type1 =null;
		TreeRuleReturnScope type3 =null;
		TreeRuleReturnScope type5 =null;
		TreeRuleReturnScope type7 =null;

		try {
			// gfiles/XtoJava.g:21:5: ( ^( DECL ID type ) -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>| ^( DECL ID type 'read' ) -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>| ^( DECL ID type 'print' ) -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>| ^( DECL ID type 'read' 'print' ) -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>)
			int alt1=4;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DECL) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==DOWN) ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2==ID) ) {
						switch ( input.LA(4) ) {
						case 39:
							{
							switch ( input.LA(5) ) {
							case UP:
								{
								alt1=1;
								}
								break;
							case 42:
								{
								int LA1_8 = input.LA(6);
								if ( (LA1_8==UP) ) {
									alt1=2;
								}
								else if ( (LA1_8==40) ) {
									alt1=4;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 1, 8, input);
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
							break;
						case 36:
							{
							switch ( input.LA(5) ) {
							case UP:
								{
								alt1=1;
								}
								break;
							case 42:
								{
								int LA1_8 = input.LA(6);
								if ( (LA1_8==UP) ) {
									alt1=2;
								}
								else if ( (LA1_8==40) ) {
									alt1=4;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 1, 8, input);
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
										new NoViableAltException("", 1, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case 43:
							{
							switch ( input.LA(5) ) {
							case UP:
								{
								alt1=1;
								}
								break;
							case 42:
								{
								int LA1_8 = input.LA(6);
								if ( (LA1_8==UP) ) {
									alt1=2;
								}
								else if ( (LA1_8==40) ) {
									alt1=4;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 1, 8, input);
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
										new NoViableAltException("", 1, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						default:
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
					// gfiles/XtoJava.g:21:8: ^( DECL ID type )
					{
					match(input,DECL,FOLLOW_DECL_in_decl67); 
					match(input, Token.DOWN, null); 
					ID2=(XTree)match(input,ID,FOLLOW_ID_in_decl69); 
					pushFollow(FOLLOW_type_in_decl71);
					type1=type();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 21:24: -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>
					{
						retval.st = new StringTemplate(templateLib, "<type> <name>;\r\n",new STAttrMap().put("type", (type1!=null?((StringTemplate)type1.getTemplate()):null)).put("name", (ID2!=null?ID2.getText():null)));
					}



					}
					break;
				case 2 :
					// gfiles/XtoJava.g:23:6: ^( DECL ID type 'read' )
					{
					match(input,DECL,FOLLOW_DECL_in_decl96); 
					match(input, Token.DOWN, null); 
					ID4=(XTree)match(input,ID,FOLLOW_ID_in_decl98); 
					pushFollow(FOLLOW_type_in_decl100);
					type3=type();
					state._fsp--;

					match(input,42,FOLLOW_42_in_decl102); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 23:29: -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>
					{
						retval.st = new StringTemplate(templateLib, "<type> <name>;\r\n",new STAttrMap().put("type", (type3!=null?((StringTemplate)type3.getTemplate()):null)).put("name", (ID4!=null?ID4.getText():null)));
					}



					}
					break;
				case 3 :
					// gfiles/XtoJava.g:25:6: ^( DECL ID type 'print' )
					{
					match(input,DECL,FOLLOW_DECL_in_decl127); 
					match(input, Token.DOWN, null); 
					ID6=(XTree)match(input,ID,FOLLOW_ID_in_decl129); 
					pushFollow(FOLLOW_type_in_decl131);
					type5=type();
					state._fsp--;

					match(input,40,FOLLOW_40_in_decl133); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 25:30: -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>
					{
						retval.st = new StringTemplate(templateLib, "<type> <name>;\r\n",new STAttrMap().put("type", (type5!=null?((StringTemplate)type5.getTemplate()):null)).put("name", (ID6!=null?ID6.getText():null)));
					}



					}
					break;
				case 4 :
					// gfiles/XtoJava.g:27:6: ^( DECL ID type 'read' 'print' )
					{
					match(input,DECL,FOLLOW_DECL_in_decl158); 
					match(input, Token.DOWN, null); 
					ID8=(XTree)match(input,ID,FOLLOW_ID_in_decl160); 
					pushFollow(FOLLOW_type_in_decl162);
					type7=type();
					state._fsp--;

					match(input,42,FOLLOW_42_in_decl164); 
					match(input,40,FOLLOW_40_in_decl166); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 27:37: -> template(type=$type.stname=$ID.text) <<<type> <name>;\r\n>>
					{
						retval.st = new StringTemplate(templateLib, "<type> <name>;\r\n",new STAttrMap().put("type", (type7!=null?((StringTemplate)type7.getTemplate()):null)).put("name", (ID8!=null?ID8.getText():null)));
					}



					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type"
	// gfiles/XtoJava.g:30:1: type : ( 'int' -> template( \"int\"| 'float' -> template( \"float\"| 'string' -> template( \"String\");
	public final XtoJava.type_return type() throws RecognitionException {
		XtoJava.type_return retval = new XtoJava.type_return();
		retval.start = input.LT(1);

		try {
			// gfiles/XtoJava.g:30:5: ( 'int' -> template( \"int\"| 'float' -> template( \"float\"| 'string' -> template( \"String\")
			int alt2=3;
			switch ( input.LA(1) ) {
			case 39:
				{
				alt2=1;
				}
				break;
			case 36:
				{
				alt2=2;
				}
				break;
			case 43:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// gfiles/XtoJava.g:30:8: 'int'
					{
					match(input,39,FOLLOW_39_in_type191); 
					// TEMPLATE REWRITE
					// 30:14: -> template( \"int\"
					{
						retval.st = new StringTemplate(templateLib, "int");
					}



					}
					break;
				case 2 :
					// gfiles/XtoJava.g:31:15: 'float'
					{
					match(input,36,FOLLOW_36_in_type215); 
					// TEMPLATE REWRITE
					// 31:23: -> template( \"float\"
					{
						retval.st = new StringTemplate(templateLib, "float");
					}



					}
					break;
				case 3 :
					// gfiles/XtoJava.g:32:15: 'string'
					{
					match(input,43,FOLLOW_43_in_type239); 
					// TEMPLATE REWRITE
					// 32:24: -> template( \"String\"
					{
						retval.st = new StringTemplate(templateLib, "String");
					}



					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "decllist"
	// gfiles/XtoJava.g:34:1: decllist : ( ^( DECLLIST (s+= decl )+ ) -> template(t=$s) \"<t>\"| DECLLIST -> template( \"\");
	public final XtoJava.decllist_return decllist() throws RecognitionException {
		XtoJava.decllist_return retval = new XtoJava.decllist_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// gfiles/XtoJava.g:34:9: ( ^( DECLLIST (s+= decl )+ ) -> template(t=$s) \"<t>\"| DECLLIST -> template( \"\")
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DECLLIST) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==DOWN) ) {
					alt4=1;
				}
				else if ( (LA4_1==STATLIST) ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// gfiles/XtoJava.g:34:11: ^( DECLLIST (s+= decl )+ )
					{
					match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist255); 
					match(input, Token.DOWN, null); 
					// gfiles/XtoJava.g:34:22: (s+= decl )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==DECL) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// gfiles/XtoJava.g:34:23: s+= decl
							{
							pushFollow(FOLLOW_decl_in_decllist260);
							s=decl();
							state._fsp--;

							if (list_s==null) list_s=new ArrayList<Object>();
							list_s.add(s.getTemplate());
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 34:34: -> template(t=$s) \"<t>\"
					{
						retval.st = new StringTemplate(templateLib, "<t>",new STAttrMap().put("t", list_s));
					}



					}
					break;
				case 2 :
					// gfiles/XtoJava.g:35:15: DECLLIST
					{
					match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist290); 
					// TEMPLATE REWRITE
					// 35:24: -> template( \"\"
					{
						retval.st = new StringTemplate(templateLib, "");
					}



					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// gfiles/XtoJava.g:38:1: expr : ( ^(op= ( '+' | '-' | '*' | '/' ) expr1= expr expr2= expr ) -> template(o=$op.texte1=$expr1.ste2=$expr2.st) \"<e1><o><e2>\"| ^( UMINUS z= ( INTCONST | FLOATCONST ) ) -> template(t=$z.text) \"-<t>\"| INTCONST -> template(t=$INTCONST.text) \"<t>\"| FLOATCONST -> template(t=$FLOATCONST.text) \"<t>\"| ID -> template(t=$ID.text) \"<t>\"| STRINGCONST -> template(t=$STRINGCONST.text) \"<t>\");
	public final XtoJava.expr_return expr() throws RecognitionException {
		XtoJava.expr_return retval = new XtoJava.expr_return();
		retval.start = input.LT(1);

		XTree op=null;
		XTree z=null;
		XTree INTCONST9=null;
		XTree FLOATCONST10=null;
		XTree ID11=null;
		XTree STRINGCONST12=null;
		TreeRuleReturnScope expr1 =null;
		TreeRuleReturnScope expr2 =null;

		try {
			// gfiles/XtoJava.g:38:5: ( ^(op= ( '+' | '-' | '*' | '/' ) expr1= expr expr2= expr ) -> template(o=$op.texte1=$expr1.ste2=$expr2.st) \"<e1><o><e2>\"| ^( UMINUS z= ( INTCONST | FLOATCONST ) ) -> template(t=$z.text) \"-<t>\"| INTCONST -> template(t=$INTCONST.text) \"<t>\"| FLOATCONST -> template(t=$FLOATCONST.text) \"<t>\"| ID -> template(t=$ID.text) \"<t>\"| STRINGCONST -> template(t=$STRINGCONST.text) \"<t>\")
			int alt7=6;
			switch ( input.LA(1) ) {
			case 22:
			case 23:
			case 24:
			case 26:
				{
				alt7=1;
				}
				break;
			case UMINUS:
				{
				alt7=2;
				}
				break;
			case INTCONST:
				{
				alt7=3;
				}
				break;
			case FLOATCONST:
				{
				alt7=4;
				}
				break;
			case ID:
				{
				alt7=5;
				}
				break;
			case STRINGCONST:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// gfiles/XtoJava.g:38:8: ^(op= ( '+' | '-' | '*' | '/' ) expr1= expr expr2= expr )
					{
					// gfiles/XtoJava.g:38:13: ( '+' | '-' | '*' | '/' )
					int alt5=4;
					switch ( input.LA(1) ) {
					case 23:
						{
						alt5=1;
						}
						break;
					case 24:
						{
						alt5=2;
						}
						break;
					case 22:
						{
						alt5=3;
						}
						break;
					case 26:
						{
						alt5=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// gfiles/XtoJava.g:38:14: '+'
							{
							op=(XTree)match(input,23,FOLLOW_23_in_expr311); 
							}
							break;
						case 2 :
							// gfiles/XtoJava.g:38:20: '-'
							{
							op=(XTree)match(input,24,FOLLOW_24_in_expr315); 
							}
							break;
						case 3 :
							// gfiles/XtoJava.g:38:26: '*'
							{
							op=(XTree)match(input,22,FOLLOW_22_in_expr319); 
							}
							break;
						case 4 :
							// gfiles/XtoJava.g:38:32: '/'
							{
							op=(XTree)match(input,26,FOLLOW_26_in_expr323); 
							}
							break;

					}

					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr328);
					expr1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr332);
					expr2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 38:60: -> template(o=$op.texte1=$expr1.ste2=$expr2.st) \"<e1><o><e2>\"
					{
						retval.st = new StringTemplate(templateLib, "<e1><o><e2>",new STAttrMap().put("o", (op!=null?op.getText():null)).put("e1", (expr1!=null?((StringTemplate)expr1.getTemplate()):null)).put("e2", (expr2!=null?((StringTemplate)expr2.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// gfiles/XtoJava.g:39:6: ^( UMINUS z= ( INTCONST | FLOATCONST ) )
					{
					match(input,UMINUS,FOLLOW_UMINUS_in_expr362); 
					match(input, Token.DOWN, null); 
					// gfiles/XtoJava.g:39:17: ( INTCONST | FLOATCONST )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==INTCONST) ) {
						alt6=1;
					}
					else if ( (LA6_0==FLOATCONST) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// gfiles/XtoJava.g:39:18: INTCONST
							{
							z=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr367); 
							}
							break;
						case 2 :
							// gfiles/XtoJava.g:39:29: FLOATCONST
							{
							z=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr371); 
							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 39:42: -> template(t=$z.text) \"-<t>\"
					{
						retval.st = new StringTemplate(templateLib, "-<t>",new STAttrMap().put("t", (z!=null?z.getText():null)));
					}



					}
					break;
				case 3 :
					// gfiles/XtoJava.g:40:6: INTCONST
					{
					INTCONST9=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr391); 
					// TEMPLATE REWRITE
					// 40:15: -> template(t=$INTCONST.text) \"<t>\"
					{
						retval.st = new StringTemplate(templateLib, "<t>",new STAttrMap().put("t", (INTCONST9!=null?INTCONST9.getText():null)));
					}



					}
					break;
				case 4 :
					// gfiles/XtoJava.g:41:6: FLOATCONST
					{
					FLOATCONST10=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr409); 
					// TEMPLATE REWRITE
					// 41:17: -> template(t=$FLOATCONST.text) \"<t>\"
					{
						retval.st = new StringTemplate(templateLib, "<t>",new STAttrMap().put("t", (FLOATCONST10!=null?FLOATCONST10.getText():null)));
					}



					}
					break;
				case 5 :
					// gfiles/XtoJava.g:42:6: ID
					{
					ID11=(XTree)match(input,ID,FOLLOW_ID_in_expr427); 
					// TEMPLATE REWRITE
					// 42:9: -> template(t=$ID.text) \"<t>\"
					{
						retval.st = new StringTemplate(templateLib, "<t>",new STAttrMap().put("t", (ID11!=null?ID11.getText():null)));
					}



					}
					break;
				case 6 :
					// gfiles/XtoJava.g:43:6: STRINGCONST
					{
					STRINGCONST12=(XTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_expr445); 
					// TEMPLATE REWRITE
					// 43:18: -> template(t=$STRINGCONST.text) \"<t>\"
					{
						retval.st = new StringTemplate(templateLib, "<t>",new STAttrMap().put("t", (STRINGCONST12!=null?STRINGCONST12.getText():null)));
					}



					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignstat"
	// gfiles/XtoJava.g:46:1: assignstat : ^( ':=' ID expr ) -> template(id=$ID.texte=$expr.st) \"<id> = <e>\";
	public final XtoJava.assignstat_return assignstat() throws RecognitionException {
		XtoJava.assignstat_return retval = new XtoJava.assignstat_return();
		retval.start = input.LT(1);

		XTree ID13=null;
		TreeRuleReturnScope expr14 =null;

		try {
			// gfiles/XtoJava.g:46:11: ( ^( ':=' ID expr ) -> template(id=$ID.texte=$expr.st) \"<id> = <e>\")
			// gfiles/XtoJava.g:46:13: ^( ':=' ID expr )
			{
			match(input,28,FOLLOW_28_in_assignstat465); 
			match(input, Token.DOWN, null); 
			ID13=(XTree)match(input,ID,FOLLOW_ID_in_assignstat467); 
			pushFollow(FOLLOW_expr_in_assignstat469);
			expr14=expr();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 46:29: -> template(id=$ID.texte=$expr.st) \"<id> = <e>\"
			{
				retval.st = new StringTemplate(templateLib, "<id> = <e>",new STAttrMap().put("id", (ID13!=null?ID13.getText():null)).put("e", (expr14!=null?((StringTemplate)expr14.getTemplate()):null)));
			}



			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "cond"
	// gfiles/XtoJava.g:49:1: cond : ^(comp= ( '<' | '>' | '=' ) expr1= expr expr2= expr ) -> template(c=$comp.texte1=$expr1.ste2=$expr2.st) \"<e1><c><e2>\";
	public final XtoJava.cond_return cond() throws RecognitionException {
		XtoJava.cond_return retval = new XtoJava.cond_return();
		retval.start = input.LT(1);

		XTree comp=null;
		TreeRuleReturnScope expr1 =null;
		TreeRuleReturnScope expr2 =null;

		try {
			// gfiles/XtoJava.g:49:5: ( ^(comp= ( '<' | '>' | '=' ) expr1= expr expr2= expr ) -> template(c=$comp.texte1=$expr1.ste2=$expr2.st) \"<e1><c><e2>\")
			// gfiles/XtoJava.g:49:8: ^(comp= ( '<' | '>' | '=' ) expr1= expr expr2= expr )
			{
			// gfiles/XtoJava.g:49:15: ( '<' | '>' | '=' )
			int alt8=3;
			switch ( input.LA(1) ) {
			case 30:
				{
				alt8=1;
				}
				break;
			case 32:
				{
				alt8=2;
				}
				break;
			case 31:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// gfiles/XtoJava.g:49:16: '<'
					{
					comp=(XTree)match(input,30,FOLLOW_30_in_cond499); 
					}
					break;
				case 2 :
					// gfiles/XtoJava.g:49:21: '>'
					{
					comp=(XTree)match(input,32,FOLLOW_32_in_cond502); 
					}
					break;
				case 3 :
					// gfiles/XtoJava.g:49:26: '='
					{
					comp=(XTree)match(input,31,FOLLOW_31_in_cond505); 
					}
					break;

			}

			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_cond510);
			expr1=expr();
			state._fsp--;

			pushFollow(FOLLOW_expr_in_cond514);
			expr2=expr();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 49:54: -> template(c=$comp.texte1=$expr1.ste2=$expr2.st) \"<e1><c><e2>\"
			{
				retval.st = new StringTemplate(templateLib, "<e1><c><e2>",new STAttrMap().put("c", (comp!=null?comp.getText():null)).put("e1", (expr1!=null?((StringTemplate)expr1.getTemplate()):null)).put("e2", (expr2!=null?((StringTemplate)expr2.getTemplate()):null)));
			}



			}

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


	public static class condstat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "condstat"
	// gfiles/XtoJava.g:52:1: condstat : ^( 'if' cond stat1= stat (stat2= stat )? ) -> template(c=$cond.sts1=$stat1.sts2=$stat2.st) <<if (<c>) {\r\n <s1>} else {\r\n <s2>}>>;
	public final XtoJava.condstat_return condstat() throws RecognitionException {
		XtoJava.condstat_return retval = new XtoJava.condstat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope stat1 =null;
		TreeRuleReturnScope stat2 =null;
		TreeRuleReturnScope cond15 =null;

		try {
			// gfiles/XtoJava.g:52:9: ( ^( 'if' cond stat1= stat (stat2= stat )? ) -> template(c=$cond.sts1=$stat1.sts2=$stat2.st) <<if (<c>) {\r\n <s1>} else {\r\n <s2>}>>)
			// gfiles/XtoJava.g:52:11: ^( 'if' cond stat1= stat (stat2= stat )? )
			{
			match(input,38,FOLLOW_38_in_condstat545); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_cond_in_condstat547);
			cond15=cond();
			state._fsp--;

			pushFollow(FOLLOW_stat_in_condstat551);
			stat1=stat();
			state._fsp--;

			// gfiles/XtoJava.g:52:39: (stat2= stat )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==STATLIST||LA9_0==28||(LA9_0 >= 37 && LA9_0 <= 38)||LA9_0==45) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// gfiles/XtoJava.g:52:39: stat2= stat
					{
					pushFollow(FOLLOW_stat_in_condstat555);
					stat2=stat();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 52:48: -> template(c=$cond.sts1=$stat1.sts2=$stat2.st) <<if (<c>) {\r\n <s1>} else {\r\n <s2>}>>
			{
				retval.st = new StringTemplate(templateLib, "if (<c>) {\r\n    <s1>} else {\r\n    <s2>}",new STAttrMap().put("c", (cond15!=null?((StringTemplate)cond15.getTemplate()):null)).put("s1", (stat1!=null?((StringTemplate)stat1.getTemplate()):null)).put("s2", (stat2!=null?((StringTemplate)stat2.getTemplate()):null)));
			}



			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whilestat"
	// gfiles/XtoJava.g:57:1: whilestat : ^( 'while' cond stat ) -> template(c=$cond.sts=$stat.st) <<while (<c>) {\r\n <s>}>>;
	public final XtoJava.whilestat_return whilestat() throws RecognitionException {
		XtoJava.whilestat_return retval = new XtoJava.whilestat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope cond16 =null;
		TreeRuleReturnScope stat17 =null;

		try {
			// gfiles/XtoJava.g:57:10: ( ^( 'while' cond stat ) -> template(c=$cond.sts=$stat.st) <<while (<c>) {\r\n <s>}>>)
			// gfiles/XtoJava.g:57:12: ^( 'while' cond stat )
			{
			match(input,45,FOLLOW_45_in_whilestat588); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_cond_in_whilestat590);
			cond16=cond();
			state._fsp--;

			pushFollow(FOLLOW_stat_in_whilestat592);
			stat17=stat();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 57:33: -> template(c=$cond.sts=$stat.st) <<while (<c>) {\r\n <s>}>>
			{
				retval.st = new StringTemplate(templateLib, "while (<c>) {\r\n    <s>}",new STAttrMap().put("c", (cond16!=null?((StringTemplate)cond16.getTemplate()):null)).put("s", (stat17!=null?((StringTemplate)stat17.getTemplate()):null)));
			}



			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forstat"
	// gfiles/XtoJava.g:60:1: forstat : ^( 'for' assignstat1= assignstat cond assignstat2= assignstat stat ) -> template(as1=$assignstat1.stc=$cond.stas2=$assignstat2.sts=$stat.st) <<for (<as1>;<c>;<as2>) {\r\n <s>}>>;
	public final XtoJava.forstat_return forstat() throws RecognitionException {
		XtoJava.forstat_return retval = new XtoJava.forstat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope assignstat1 =null;
		TreeRuleReturnScope assignstat2 =null;
		TreeRuleReturnScope cond18 =null;
		TreeRuleReturnScope stat19 =null;

		try {
			// gfiles/XtoJava.g:60:8: ( ^( 'for' assignstat1= assignstat cond assignstat2= assignstat stat ) -> template(as1=$assignstat1.stc=$cond.stas2=$assignstat2.sts=$stat.st) <<for (<as1>;<c>;<as2>) {\r\n <s>}>>)
			// gfiles/XtoJava.g:60:10: ^( 'for' assignstat1= assignstat cond assignstat2= assignstat stat )
			{
			match(input,37,FOLLOW_37_in_forstat617); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assignstat_in_forstat621);
			assignstat1=assignstat();
			state._fsp--;

			pushFollow(FOLLOW_cond_in_forstat623);
			cond18=cond();
			state._fsp--;

			pushFollow(FOLLOW_assignstat_in_forstat627);
			assignstat2=assignstat();
			state._fsp--;

			pushFollow(FOLLOW_stat_in_forstat629);
			stat19=stat();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 60:75: -> template(as1=$assignstat1.stc=$cond.stas2=$assignstat2.sts=$stat.st) <<for (<as1>;<c>;<as2>) {\r\n <s>}>>
			{
				retval.st = new StringTemplate(templateLib, "for (<as1>;<c>;<as2>) {\r\n    <s>}",new STAttrMap().put("as1", (assignstat1!=null?((StringTemplate)assignstat1.getTemplate()):null)).put("c", (cond18!=null?((StringTemplate)cond18.getTemplate()):null)).put("as2", (assignstat2!=null?((StringTemplate)assignstat2.getTemplate()):null)).put("s", (stat19!=null?((StringTemplate)stat19.getTemplate()):null)));
			}



			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "stat"
	// gfiles/XtoJava.g:65:1: stat : (s= assignstat -> template(t=$s.st) <<<t>;\r\n>>|s= condstat -> template(t=$s.st) <<<t>\r\n>>|s= whilestat -> template(t=$s.st) <<<t>\r\n>>|s= forstat -> template(t=$s.st) <<<t>\r\n>>|s= statlist -> template(t=$s.st) <<<t> >>);
	public final XtoJava.stat_return stat() throws RecognitionException {
		XtoJava.stat_return retval = new XtoJava.stat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s =null;

		try {
			// gfiles/XtoJava.g:65:5: (s= assignstat -> template(t=$s.st) <<<t>;\r\n>>|s= condstat -> template(t=$s.st) <<<t>\r\n>>|s= whilestat -> template(t=$s.st) <<<t>\r\n>>|s= forstat -> template(t=$s.st) <<<t>\r\n>>|s= statlist -> template(t=$s.st) <<<t> >>)
			int alt10=5;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt10=1;
				}
				break;
			case 38:
				{
				alt10=2;
				}
				break;
			case 45:
				{
				alt10=3;
				}
				break;
			case 37:
				{
				alt10=4;
				}
				break;
			case STATLIST:
				{
				alt10=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// gfiles/XtoJava.g:65:8: s= assignstat
					{
					pushFollow(FOLLOW_assignstat_in_stat687);
					s=assignstat();
					state._fsp--;

					// TEMPLATE REWRITE
					// 65:21: -> template(t=$s.st) <<<t>;\r\n>>
					{
						retval.st = new StringTemplate(templateLib, "<t>;\r\n",new STAttrMap().put("t", (s!=null?((StringTemplate)s.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// gfiles/XtoJava.g:67:15: s= condstat
					{
					pushFollow(FOLLOW_condstat_in_stat716);
					s=condstat();
					state._fsp--;

					// TEMPLATE REWRITE
					// 67:26: -> template(t=$s.st) <<<t>\r\n>>
					{
						retval.st = new StringTemplate(templateLib, "<t>\r\n",new STAttrMap().put("t", (s!=null?((StringTemplate)s.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// gfiles/XtoJava.g:69:15: s= whilestat
					{
					pushFollow(FOLLOW_whilestat_in_stat745);
					s=whilestat();
					state._fsp--;

					// TEMPLATE REWRITE
					// 69:27: -> template(t=$s.st) <<<t>\r\n>>
					{
						retval.st = new StringTemplate(templateLib, "<t>\r\n",new STAttrMap().put("t", (s!=null?((StringTemplate)s.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// gfiles/XtoJava.g:71:15: s= forstat
					{
					pushFollow(FOLLOW_forstat_in_stat773);
					s=forstat();
					state._fsp--;

					// TEMPLATE REWRITE
					// 71:25: -> template(t=$s.st) <<<t>\r\n>>
					{
						retval.st = new StringTemplate(templateLib, "<t>\r\n",new STAttrMap().put("t", (s!=null?((StringTemplate)s.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// gfiles/XtoJava.g:73:15: s= statlist
					{
					pushFollow(FOLLOW_statlist_in_stat803);
					s=statlist();
					state._fsp--;

					// TEMPLATE REWRITE
					// 73:26: -> template(t=$s.st) <<<t> >>
					{
						retval.st = new StringTemplate(templateLib, "<t> ",new STAttrMap().put("t", (s!=null?((StringTemplate)s.getTemplate()):null)));
					}



					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statlist"
	// gfiles/XtoJava.g:75:1: statlist : ( ^( STATLIST (s+= stat )+ ) -> template(t=$s) \"<t>\"| STATLIST -> template( \"\");
	public final XtoJava.statlist_return statlist() throws RecognitionException {
		XtoJava.statlist_return retval = new XtoJava.statlist_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// gfiles/XtoJava.g:75:9: ( ^( STATLIST (s+= stat )+ ) -> template(t=$s) \"<t>\"| STATLIST -> template( \"\")
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==STATLIST) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==DOWN) ) {
					alt12=1;
				}
				else if ( (LA12_1==UP||LA12_1==STATLIST||LA12_1==28||(LA12_1 >= 37 && LA12_1 <= 38)||LA12_1==45) ) {
					alt12=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// gfiles/XtoJava.g:75:11: ^( STATLIST (s+= stat )+ )
					{
					match(input,STATLIST,FOLLOW_STATLIST_in_statlist822); 
					match(input, Token.DOWN, null); 
					// gfiles/XtoJava.g:75:22: (s+= stat )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==STATLIST||LA11_0==28||(LA11_0 >= 37 && LA11_0 <= 38)||LA11_0==45) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// gfiles/XtoJava.g:75:23: s+= stat
							{
							pushFollow(FOLLOW_stat_in_statlist827);
							s=stat();
							state._fsp--;

							if (list_s==null) list_s=new ArrayList<Object>();
							list_s.add(s.getTemplate());
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 75:34: -> template(t=$s) \"<t>\"
					{
						retval.st = new StringTemplate(templateLib, "<t>",new STAttrMap().put("t", list_s));
					}



					}
					break;
				case 2 :
					// gfiles/XtoJava.g:76:15: STATLIST
					{
					match(input,STATLIST,FOLLOW_STATLIST_in_statlist857); 
					// TEMPLATE REWRITE
					// 76:24: -> template( \"\"
					{
						retval.st = new StringTemplate(templateLib, "");
					}



					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// gfiles/XtoJava.g:79:1: program : ^( 'program' ID decllist statlist ) -> template(name=$ID.textd=$decllist.sts=$statlist.st) <<package de.dhbw.compiler.antlrxcompiler;\r\n\r\npublic class <name> {\r\n public static void main (String[] args) {\r\n <d>\r\n <s>\r\n }\r\n}>>;
	public final XtoJava.program_return program() throws RecognitionException {
		XtoJava.program_return retval = new XtoJava.program_return();
		retval.start = input.LT(1);

		XTree ID20=null;
		TreeRuleReturnScope decllist21 =null;
		TreeRuleReturnScope statlist22 =null;

		try {
			// gfiles/XtoJava.g:79:8: ( ^( 'program' ID decllist statlist ) -> template(name=$ID.textd=$decllist.sts=$statlist.st) <<package de.dhbw.compiler.antlrxcompiler;\r\n\r\npublic class <name> {\r\n public static void main (String[] args) {\r\n <d>\r\n <s>\r\n }\r\n}>>)
			// gfiles/XtoJava.g:79:10: ^( 'program' ID decllist statlist )
			{
			match(input,41,FOLLOW_41_in_program874); 
			match(input, Token.DOWN, null); 
			ID20=(XTree)match(input,ID,FOLLOW_ID_in_program876); 
			pushFollow(FOLLOW_decllist_in_program878);
			decllist21=decllist();
			state._fsp--;

			pushFollow(FOLLOW_statlist_in_program880);
			statlist22=statlist();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 79:44: -> template(name=$ID.textd=$decllist.sts=$statlist.st) <<package de.dhbw.compiler.antlrxcompiler;\r\n\r\npublic class <name> {\r\n public static void main (String[] args) {\r\n <d>\r\n <s>\r\n }\r\n}>>
			{
				retval.st = new StringTemplate(templateLib, "package de.dhbw.compiler.antlrxcompiler;\r\n\r\npublic class <name> {\r\n    public static void main (String[] args) {\r\n        <d>\r\n        <s>\r\n    }\r\n}",new STAttrMap().put("name", (ID20!=null?ID20.getText():null)).put("d", (decllist21!=null?((StringTemplate)decllist21.getTemplate()):null)).put("s", (statlist22!=null?((StringTemplate)statlist22.getTemplate()):null)));
			}



			}

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



	public static final BitSet FOLLOW_DECL_in_decl67 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl69 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl71 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl96 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl98 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl100 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_decl102 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl129 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl131 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_decl133 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl158 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl160 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_type_in_decl162 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_decl164 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_decl166 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_39_in_type191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_type215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_type239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist255 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist260 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_expr311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_24_in_expr315 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_expr319 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_26_in_expr323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr328 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_expr332 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UMINUS_in_expr362 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_expr367 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr371 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTCONST_in_expr391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_expr445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignstat465 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat467 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_assignstat469 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_30_in_cond499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_32_in_cond502 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_31_in_cond505 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond510 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_cond514 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_condstat545 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat547 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat551 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_stat_in_condstat555 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_45_in_whilestat588 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat590 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_whilestat592 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_forstat617 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat621 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat623 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_assignstat_in_forstat627 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_forstat629 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignstat_in_stat687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATLIST_in_statlist822 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_statlist827 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_STATLIST_in_statlist857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_program874 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program876 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program878 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program880 = new BitSet(new long[]{0x0000000000000008L});
}
