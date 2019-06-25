// $ANTLR 3.5.2 gfiles/XOptimizer.g 2019-06-25 16:27:58

    package de.dhbw.compiler.antlrxcompiler;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class XOptimizer extends TreeRewriter {
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
	public TreeRewriter[] getDelegates() {
		return new TreeRewriter[] {};
	}

	// delegators


	public XOptimizer(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XOptimizer(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XOptimizer.tokenNames; }
	@Override public String getGrammarFileName() { return "gfiles/XOptimizer.g"; }



	    private int intValue;
	    private float floatValue;

	    private String addString(String first, String last) {
	      return first.substring(0, first.length()-1)+last.substring(1);
	    }
	    
	    private String opInt(String first, String last, char op) {
	      int firstValue = 0;
	      int lastValue = 0;
	      try {
	        firstValue = Integer.parseInt(first);
	        lastValue = Integer.parseInt(last);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	      switch (op) {
	        case '+': return Integer.toString(firstValue+lastValue);
	        case '-': return Integer.toString(firstValue-lastValue);
	        case '*': return Integer.toString(firstValue*lastValue);
	        case '/': return Integer.toString(firstValue/lastValue);
	        default: return "";
	      }
	     }
	      
	    private String opFloat(String first, String last, char op) {
	      double firstValue = 0.0;
	      double lastValue = 0.0;
	      try {
		      firstValue = Double.parseDouble(first);
		      lastValue = Double.parseDouble(last);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	      switch (op) {
	        case '+': return Double.toString(firstValue+lastValue);
	        case '-': return Double.toString(firstValue-lastValue);
	        case '*': return Double.toString(firstValue*lastValue);
	        case '/': return Double.toString(firstValue/lastValue);
	        default: return "";
	      }
	     }
	      
	 

	public static class bottomup_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "bottomup"
	// gfiles/XOptimizer.g:64:1: bottomup : ( combineConst | multZeroOne | addZero | subZero );
	@Override
	public final XOptimizer.bottomup_return bottomup() throws RecognitionException {
		XOptimizer.bottomup_return retval = new XOptimizer.bottomup_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		TreeRuleReturnScope combineConst1 =null;
		TreeRuleReturnScope multZeroOne2 =null;
		TreeRuleReturnScope addZero3 =null;
		TreeRuleReturnScope subZero4 =null;


		try {
			// gfiles/XOptimizer.g:64:9: ( combineConst | multZeroOne | addZero | subZero )
			int alt1=4;
			switch ( input.LA(1) ) {
			case 23:
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case FLOATCONST:
					case STRINGCONST:
						{
						alt1=1;
						}
						break;
					case INTCONST:
						{
						int LA1_8 = input.LA(4);
						if ( (LA1_8==FLOATCONST||LA1_8==INTCONST) ) {
							alt1=1;
						}
						else if ( (LA1_8==ID||(LA1_8 >= 22 && LA1_8 <= 24)||LA1_8==26) ) {
							alt1=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
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
					case ID:
					case 22:
					case 23:
					case 24:
					case 26:
						{
						alt1=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
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

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				break;
			case 24:
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2==DOWN) ) {
					int LA1_6 = input.LA(3);
					if ( (LA1_6==FLOATCONST||LA1_6==INTCONST) ) {
						alt1=1;
					}
					else if ( (LA1_6==ID||(LA1_6 >= 22 && LA1_6 <= 24)||LA1_6==26) ) {
						alt1=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
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

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 22:
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3==DOWN) ) {
					switch ( input.LA(3) ) {
					case INTCONST:
						{
						int LA1_11 = input.LA(4);
						if ( (LA1_11==FLOATCONST||LA1_11==INTCONST) ) {
							alt1=1;
						}
						else if ( (LA1_11==ID||(LA1_11 >= 22 && LA1_11 <= 24)||LA1_11==26) ) {
							alt1=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case FLOATCONST:
						{
						alt1=1;
						}
						break;
					case ID:
					case 22:
					case 23:
					case 24:
					case 26:
						{
						alt1=2;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UMINUS:
			case 26:
				{
				alt1=1;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// gfiles/XOptimizer.g:64:11: combineConst
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_combineConst_in_bottomup73);
					combineConst1=combineConst();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)combineConst1.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 2 :
					// gfiles/XOptimizer.g:64:26: multZeroOne
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_multZeroOne_in_bottomup77);
					multZeroOne2=multZeroOne();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)multZeroOne2.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 3 :
					// gfiles/XOptimizer.g:64:40: addZero
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_addZero_in_bottomup81);
					addZero3=addZero();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)addZero3.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 4 :
					// gfiles/XOptimizer.g:64:50: subZero
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_subZero_in_bottomup85);
					subZero4=subZero();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)subZero4.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
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
	// $ANTLR end "bottomup"


	public static class combineConst_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "combineConst"
	// gfiles/XOptimizer.g:67:1: combineConst : ( ^( '+' x= STRINGCONST y= STRINGCONST ) -> STRINGCONST[addString($x.text,$y.text)] | ^( '+' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'+')] | ^( '-' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'-')] | ^( '*' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'*')] | ^( '/' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'/')] | ^( '+' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'+')] | ^( '-' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'-')] | ^( '*' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'*')] | ^( '/' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'/')] | ^( '+' (x= INTCONST ) (y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'+')] | ^( '-' (x= INTCONST ) (y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'-')] | ^( '*' (x= INTCONST ) (y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'*')] | ^( '/' (x= INTCONST ) (y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'/')] | ^( UMINUS x= INTCONST ) -> INTCONST[\"-\"+$x.text] | ^( UMINUS x= FLOATCONST ) -> FLOATCONST[\"-\"+$x.text] );
	public final XOptimizer.combineConst_return combineConst() throws RecognitionException {
		XOptimizer.combineConst_return retval = new XOptimizer.combineConst_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree y=null;
		XTree char_literal5=null;
		XTree char_literal6=null;
		XTree char_literal7=null;
		XTree char_literal8=null;
		XTree char_literal9=null;
		XTree char_literal10=null;
		XTree char_literal11=null;
		XTree char_literal12=null;
		XTree char_literal13=null;
		XTree char_literal14=null;
		XTree char_literal15=null;
		XTree char_literal16=null;
		XTree char_literal17=null;
		XTree UMINUS18=null;
		XTree UMINUS19=null;

		XTree x_tree=null;
		XTree y_tree=null;
		XTree char_literal5_tree=null;
		XTree char_literal6_tree=null;
		XTree char_literal7_tree=null;
		XTree char_literal8_tree=null;
		XTree char_literal9_tree=null;
		XTree char_literal10_tree=null;
		XTree char_literal11_tree=null;
		XTree char_literal12_tree=null;
		XTree char_literal13_tree=null;
		XTree char_literal14_tree=null;
		XTree char_literal15_tree=null;
		XTree char_literal16_tree=null;
		XTree char_literal17_tree=null;
		XTree UMINUS18_tree=null;
		XTree UMINUS19_tree=null;
		RewriteRuleNodeStream stream_22=new RewriteRuleNodeStream(adaptor,"token 22");
		RewriteRuleNodeStream stream_UMINUS=new RewriteRuleNodeStream(adaptor,"token UMINUS");
		RewriteRuleNodeStream stream_STRINGCONST=new RewriteRuleNodeStream(adaptor,"token STRINGCONST");
		RewriteRuleNodeStream stream_23=new RewriteRuleNodeStream(adaptor,"token 23");
		RewriteRuleNodeStream stream_24=new RewriteRuleNodeStream(adaptor,"token 24");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_26=new RewriteRuleNodeStream(adaptor,"token 26");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// gfiles/XOptimizer.g:67:13: ( ^( '+' x= STRINGCONST y= STRINGCONST ) -> STRINGCONST[addString($x.text,$y.text)] | ^( '+' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'+')] | ^( '-' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'-')] | ^( '*' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'*')] | ^( '/' x= INTCONST y= INTCONST ) -> INTCONST[opInt($x.text,$y.text,'/')] | ^( '+' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'+')] | ^( '-' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'-')] | ^( '*' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'*')] | ^( '/' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'/')] | ^( '+' (x= INTCONST ) (y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'+')] | ^( '-' (x= INTCONST ) (y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'-')] | ^( '*' (x= INTCONST ) (y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'*')] | ^( '/' (x= INTCONST ) (y= FLOATCONST ) ) -> FLOATCONST[opFloat($x.text,$y.text,'/')] | ^( UMINUS x= INTCONST ) -> INTCONST[\"-\"+$x.text] | ^( UMINUS x= FLOATCONST ) -> FLOATCONST[\"-\"+$x.text] )
			int alt6=15;
			switch ( input.LA(1) ) {
			case 23:
				{
				int LA6_1 = input.LA(2);
				if ( (LA6_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case STRINGCONST:
						{
						alt6=1;
						}
						break;
					case INTCONST:
						{
						int LA6_12 = input.LA(4);
						if ( (LA6_12==INTCONST) ) {
							alt6=2;
						}
						else if ( (LA6_12==FLOATCONST) ) {
							alt6=10;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case FLOATCONST:
						{
						alt6=6;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 24:
				{
				int LA6_2 = input.LA(2);
				if ( (LA6_2==DOWN) ) {
					int LA6_7 = input.LA(3);
					if ( (LA6_7==INTCONST) ) {
						int LA6_14 = input.LA(4);
						if ( (LA6_14==INTCONST) ) {
							alt6=3;
						}
						else if ( (LA6_14==FLOATCONST) ) {
							alt6=11;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA6_7==FLOATCONST) ) {
						alt6=7;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 22:
				{
				int LA6_3 = input.LA(2);
				if ( (LA6_3==DOWN) ) {
					int LA6_8 = input.LA(3);
					if ( (LA6_8==INTCONST) ) {
						int LA6_16 = input.LA(4);
						if ( (LA6_16==INTCONST) ) {
							alt6=4;
						}
						else if ( (LA6_16==FLOATCONST) ) {
							alt6=12;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 16, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA6_8==FLOATCONST) ) {
						alt6=8;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 26:
				{
				int LA6_4 = input.LA(2);
				if ( (LA6_4==DOWN) ) {
					int LA6_9 = input.LA(3);
					if ( (LA6_9==INTCONST) ) {
						int LA6_18 = input.LA(4);
						if ( (LA6_18==INTCONST) ) {
							alt6=5;
						}
						else if ( (LA6_18==FLOATCONST) ) {
							alt6=13;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 18, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA6_9==FLOATCONST) ) {
						alt6=9;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UMINUS:
				{
				int LA6_5 = input.LA(2);
				if ( (LA6_5==DOWN) ) {
					int LA6_10 = input.LA(3);
					if ( (LA6_10==INTCONST) ) {
						alt6=14;
					}
					else if ( (LA6_10==FLOATCONST) ) {
						alt6=15;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// gfiles/XOptimizer.g:67:19: ^( '+' x= STRINGCONST y= STRINGCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal5=(XTree)match(input,23,FOLLOW_23_in_combineConst98); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal5);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal5;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_combineConst102); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_STRINGCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_combineConst106); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_STRINGCONST.add(y);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: STRINGCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 68:19: -> STRINGCONST[addString($x.text,$y.text)]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(STRINGCONST, addString((x!=null?x.getText():null),(y!=null?y.getText():null))));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// gfiles/XOptimizer.g:69:19: ^( '+' x= INTCONST y= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal6=(XTree)match(input,23,FOLLOW_23_in_combineConst151); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal6);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal6;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst155); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst159); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(y);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 69:48: -> INTCONST[opInt($x.text,$y.text,'+')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((x!=null?x.getText():null),(y!=null?y.getText():null),'+')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// gfiles/XOptimizer.g:70:19: ^( '-' x= INTCONST y= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal7=(XTree)match(input,24,FOLLOW_24_in_combineConst186); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(char_literal7);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal7;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst190); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst194); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(y);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 70:48: -> INTCONST[opInt($x.text,$y.text,'-')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((x!=null?x.getText():null),(y!=null?y.getText():null),'-')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// gfiles/XOptimizer.g:71:19: ^( '*' x= INTCONST y= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal8=(XTree)match(input,22,FOLLOW_22_in_combineConst221); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal8);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal8;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst225); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst229); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(y);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 71:48: -> INTCONST[opInt($x.text,$y.text,'*')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((x!=null?x.getText():null),(y!=null?y.getText():null),'*')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// gfiles/XOptimizer.g:72:19: ^( '/' x= INTCONST y= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal9=(XTree)match(input,26,FOLLOW_26_in_combineConst256); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_26.add(char_literal9);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal9;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst260); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					_last = (XTree)input.LT(1);
					y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst264); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(y);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 72:48: -> INTCONST[opInt($x.text,$y.text,'/')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((x!=null?x.getText():null),(y!=null?y.getText():null),'/')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// gfiles/XOptimizer.g:73:19: ^( '+' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal10=(XTree)match(input,23,FOLLOW_23_in_combineConst291); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal10);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal10;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// gfiles/XOptimizer.g:73:25: (x= FLOATCONST )
					// gfiles/XOptimizer.g:73:26: x= FLOATCONST
					{
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst296); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(x);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					// gfiles/XOptimizer.g:73:40: (y= INTCONST |y= FLOATCONST )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==INTCONST) ) {
						alt2=1;
					}
					else if ( (LA2_0==FLOATCONST) ) {
						alt2=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// gfiles/XOptimizer.g:73:41: y= INTCONST
							{
							_last = (XTree)input.LT(1);
							y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst302); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_INTCONST.add(y);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 2 :
							// gfiles/XOptimizer.g:73:54: y= FLOATCONST
							{
							_last = (XTree)input.LT(1);
							y=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst308); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_FLOATCONST.add(y);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 73:69: -> FLOATCONST[opFloat($x.text,$y.text,'+')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((x!=null?x.getText():null),(y!=null?y.getText():null),'+')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 7 :
					// gfiles/XOptimizer.g:74:19: ^( '-' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal11=(XTree)match(input,24,FOLLOW_24_in_combineConst336); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(char_literal11);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal11;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// gfiles/XOptimizer.g:74:25: (x= FLOATCONST )
					// gfiles/XOptimizer.g:74:26: x= FLOATCONST
					{
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst341); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(x);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					// gfiles/XOptimizer.g:74:40: (y= INTCONST |y= FLOATCONST )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==INTCONST) ) {
						alt3=1;
					}
					else if ( (LA3_0==FLOATCONST) ) {
						alt3=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// gfiles/XOptimizer.g:74:41: y= INTCONST
							{
							_last = (XTree)input.LT(1);
							y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst347); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_INTCONST.add(y);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 2 :
							// gfiles/XOptimizer.g:74:54: y= FLOATCONST
							{
							_last = (XTree)input.LT(1);
							y=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst353); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_FLOATCONST.add(y);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 74:69: -> FLOATCONST[opFloat($x.text,$y.text,'-')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((x!=null?x.getText():null),(y!=null?y.getText():null),'-')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 8 :
					// gfiles/XOptimizer.g:75:19: ^( '*' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal12=(XTree)match(input,22,FOLLOW_22_in_combineConst381); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal12);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal12;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// gfiles/XOptimizer.g:75:25: (x= FLOATCONST )
					// gfiles/XOptimizer.g:75:26: x= FLOATCONST
					{
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst386); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(x);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					// gfiles/XOptimizer.g:75:40: (y= INTCONST |y= FLOATCONST )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==INTCONST) ) {
						alt4=1;
					}
					else if ( (LA4_0==FLOATCONST) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// gfiles/XOptimizer.g:75:41: y= INTCONST
							{
							_last = (XTree)input.LT(1);
							y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst392); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_INTCONST.add(y);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 2 :
							// gfiles/XOptimizer.g:75:54: y= FLOATCONST
							{
							_last = (XTree)input.LT(1);
							y=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst398); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_FLOATCONST.add(y);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 75:69: -> FLOATCONST[opFloat($x.text,$y.text,'*')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((x!=null?x.getText():null),(y!=null?y.getText():null),'*')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 9 :
					// gfiles/XOptimizer.g:76:19: ^( '/' (x= FLOATCONST ) (y= INTCONST |y= FLOATCONST ) )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal13=(XTree)match(input,26,FOLLOW_26_in_combineConst426); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_26.add(char_literal13);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal13;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// gfiles/XOptimizer.g:76:25: (x= FLOATCONST )
					// gfiles/XOptimizer.g:76:26: x= FLOATCONST
					{
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst431); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(x);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					// gfiles/XOptimizer.g:76:40: (y= INTCONST |y= FLOATCONST )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==INTCONST) ) {
						alt5=1;
					}
					else if ( (LA5_0==FLOATCONST) ) {
						alt5=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// gfiles/XOptimizer.g:76:41: y= INTCONST
							{
							_last = (XTree)input.LT(1);
							y=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst437); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_INTCONST.add(y);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 2 :
							// gfiles/XOptimizer.g:76:54: y= FLOATCONST
							{
							_last = (XTree)input.LT(1);
							y=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst443); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_FLOATCONST.add(y);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 76:69: -> FLOATCONST[opFloat($x.text,$y.text,'/')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((x!=null?x.getText():null),(y!=null?y.getText():null),'/')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 10 :
					// gfiles/XOptimizer.g:77:19: ^( '+' (x= INTCONST ) (y= FLOATCONST ) )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal14=(XTree)match(input,23,FOLLOW_23_in_combineConst471); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal14);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal14;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// gfiles/XOptimizer.g:77:25: (x= INTCONST )
					// gfiles/XOptimizer.g:77:26: x= INTCONST
					{
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst476); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					// gfiles/XOptimizer.g:77:38: (y= FLOATCONST )
					// gfiles/XOptimizer.g:77:39: y= FLOATCONST
					{
					_last = (XTree)input.LT(1);
					y=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst482); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(y);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 77:54: -> FLOATCONST[opFloat($x.text,$y.text,'+')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((x!=null?x.getText():null),(y!=null?y.getText():null),'+')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 11 :
					// gfiles/XOptimizer.g:78:19: ^( '-' (x= INTCONST ) (y= FLOATCONST ) )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal15=(XTree)match(input,24,FOLLOW_24_in_combineConst510); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(char_literal15);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal15;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// gfiles/XOptimizer.g:78:25: (x= INTCONST )
					// gfiles/XOptimizer.g:78:26: x= INTCONST
					{
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst515); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					// gfiles/XOptimizer.g:78:38: (y= FLOATCONST )
					// gfiles/XOptimizer.g:78:39: y= FLOATCONST
					{
					_last = (XTree)input.LT(1);
					y=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst521); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(y);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 78:54: -> FLOATCONST[opFloat($x.text,$y.text,'-')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((x!=null?x.getText():null),(y!=null?y.getText():null),'-')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 12 :
					// gfiles/XOptimizer.g:79:19: ^( '*' (x= INTCONST ) (y= FLOATCONST ) )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal16=(XTree)match(input,22,FOLLOW_22_in_combineConst549); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal16);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal16;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// gfiles/XOptimizer.g:79:25: (x= INTCONST )
					// gfiles/XOptimizer.g:79:26: x= INTCONST
					{
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst554); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					// gfiles/XOptimizer.g:79:38: (y= FLOATCONST )
					// gfiles/XOptimizer.g:79:39: y= FLOATCONST
					{
					_last = (XTree)input.LT(1);
					y=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst560); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(y);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 79:54: -> FLOATCONST[opFloat($x.text,$y.text,'*')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((x!=null?x.getText():null),(y!=null?y.getText():null),'*')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 13 :
					// gfiles/XOptimizer.g:80:19: ^( '/' (x= INTCONST ) (y= FLOATCONST ) )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal17=(XTree)match(input,26,FOLLOW_26_in_combineConst588); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_26.add(char_literal17);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal17;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// gfiles/XOptimizer.g:80:25: (x= INTCONST )
					// gfiles/XOptimizer.g:80:26: x= INTCONST
					{
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst593); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					// gfiles/XOptimizer.g:80:38: (y= FLOATCONST )
					// gfiles/XOptimizer.g:80:39: y= FLOATCONST
					{
					_last = (XTree)input.LT(1);
					y=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst599); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(y);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 80:54: -> FLOATCONST[opFloat($x.text,$y.text,'/')]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((x!=null?x.getText():null),(y!=null?y.getText():null),'/')));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 14 :
					// gfiles/XOptimizer.g:81:19: ^( UMINUS x= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					UMINUS18=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_combineConst627); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_UMINUS.add(UMINUS18);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = UMINUS18;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_combineConst631); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 81:40: -> INTCONST[\"-\"+$x.text]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, "-"+(x!=null?x.getText():null)));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 15 :
					// gfiles/XOptimizer.g:82:19: ^( UMINUS x= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					UMINUS19=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_combineConst658); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_UMINUS.add(UMINUS19);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = UMINUS19;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_combineConst662); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(x);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 82:42: -> FLOATCONST[\"-\"+$x.text]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, "-"+(x!=null?x.getText():null)));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
	// $ANTLR end "combineConst"


	public static class addZero_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "addZero"
	// gfiles/XOptimizer.g:84:1: addZero : ( ^( '+' x= INTCONST {...}? ( ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) ) ) -> ^( $op ( $y)* ) | ^( '+' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?) -> ^( $op ( $y)* ) );
	public final XOptimizer.addZero_return addZero() throws RecognitionException {
		XOptimizer.addZero_return retval = new XOptimizer.addZero_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree op=null;
		XTree char_literal20=null;
		XTree char_literal21=null;
		XTree y=null;

		XTree x_tree=null;
		XTree op_tree=null;
		XTree char_literal20_tree=null;
		XTree char_literal21_tree=null;
		XTree y_tree=null;
		RewriteRuleNodeStream stream_22=new RewriteRuleNodeStream(adaptor,"token 22");
		RewriteRuleNodeStream stream_23=new RewriteRuleNodeStream(adaptor,"token 23");
		RewriteRuleNodeStream stream_24=new RewriteRuleNodeStream(adaptor,"token 24");
		RewriteRuleNodeStream stream_26=new RewriteRuleNodeStream(adaptor,"token 26");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// gfiles/XOptimizer.g:84:8: ( ^( '+' x= INTCONST {...}? ( ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) ) ) -> ^( $op ( $y)* ) | ^( '+' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?) -> ^( $op ( $y)* ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==23) ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1==DOWN) ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2==INTCONST) ) {
						alt11=1;
					}
					else if ( (LA11_2==ID||(LA11_2 >= 22 && LA11_2 <= 24)||LA11_2==26) ) {
						alt11=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// gfiles/XOptimizer.g:84:19: ^( '+' x= INTCONST {...}? ( ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) ) )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal20=(XTree)match(input,23,FOLLOW_23_in_addZero685); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal20);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal20;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_addZero689); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					if ( !(((x!=null?x.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "addZero", "$x.text.equals(\"0\")");
					}
					// gfiles/XOptimizer.g:84:59: ( ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) )
					// gfiles/XOptimizer.g:84:60: ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_2 = _last;
					XTree _first_2 = null;
					// gfiles/XOptimizer.g:84:65: ( '+' | '-' | '*' | '/' | ID )
					int alt7=5;
					switch ( input.LA(1) ) {
					case 23:
						{
						alt7=1;
						}
						break;
					case 24:
						{
						alt7=2;
						}
						break;
					case 22:
						{
						alt7=3;
						}
						break;
					case 26:
						{
						alt7=4;
						}
						break;
					case ID:
						{
						alt7=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// gfiles/XOptimizer.g:84:66: '+'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,23,FOLLOW_23_in_addZero698); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_23.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 2 :
							// gfiles/XOptimizer.g:84:72: '-'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,24,FOLLOW_24_in_addZero702); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_24.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 3 :
							// gfiles/XOptimizer.g:84:78: '*'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,22,FOLLOW_22_in_addZero706); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_22.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 4 :
							// gfiles/XOptimizer.g:84:84: '/'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,26,FOLLOW_26_in_addZero710); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_26.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 5 :
							// gfiles/XOptimizer.g:84:90: ID
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,ID,FOLLOW_ID_in_addZero714); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_ID.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;

					}

					if ( state.backtracking==1 )
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// gfiles/XOptimizer.g:84:95: (y= . )*
						loop8:
						while (true) {
							int alt8=2;
							int LA8_0 = input.LA(1);
							if ( ((LA8_0 >= COMMENT && LA8_0 <= 45)) ) {
								alt8=1;
							}

							switch (alt8) {
							case 1 :
								// gfiles/XOptimizer.g:84:95: y= .
								{
								_last = (XTree)input.LT(1);
								y=(XTree)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								 
								if ( state.backtracking==1 )
								if ( _first_2==null ) _first_2 = y;

								if ( state.backtracking==1 ) {
								retval.tree = _first_0;
								if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
									retval.tree = (XTree)adaptor.getParent(retval.tree);
								}

								}
								break;

							default :
								break loop8;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					_last = _save_last_2;
					}


					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: op, y
					// token labels: op
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_op=new RewriteRuleNodeStream(adaptor,"token op",op);
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 85:21: -> ^( $op ( $y)* )
					{
						// gfiles/XOptimizer.g:85:24: ^( $op ( $y)* )
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);
						// gfiles/XOptimizer.g:85:31: ( $y)*
						while ( stream_y.hasNext() ) {
							adaptor.addChild(root_1, stream_y.nextTree());
						}
						stream_y.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// gfiles/XOptimizer.g:86:19: ^( '+' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?)
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal21=(XTree)match(input,23,FOLLOW_23_in_addZero776); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(char_literal21);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal21;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_2 = _last;
					XTree _first_2 = null;
					// gfiles/XOptimizer.g:86:30: ( '+' | '-' | '*' | '/' | ID )
					int alt9=5;
					switch ( input.LA(1) ) {
					case 23:
						{
						alt9=1;
						}
						break;
					case 24:
						{
						alt9=2;
						}
						break;
					case 22:
						{
						alt9=3;
						}
						break;
					case 26:
						{
						alt9=4;
						}
						break;
					case ID:
						{
						alt9=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}
					switch (alt9) {
						case 1 :
							// gfiles/XOptimizer.g:86:31: '+'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,23,FOLLOW_23_in_addZero782); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_23.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 2 :
							// gfiles/XOptimizer.g:86:37: '-'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,24,FOLLOW_24_in_addZero786); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_24.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 3 :
							// gfiles/XOptimizer.g:86:43: '*'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,22,FOLLOW_22_in_addZero790); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_22.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 4 :
							// gfiles/XOptimizer.g:86:49: '/'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,26,FOLLOW_26_in_addZero794); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_26.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 5 :
							// gfiles/XOptimizer.g:86:55: ID
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,ID,FOLLOW_ID_in_addZero798); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_ID.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;

					}

					if ( state.backtracking==1 )
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// gfiles/XOptimizer.g:86:60: (y= . )*
						loop10:
						while (true) {
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( ((LA10_0 >= COMMENT && LA10_0 <= 45)) ) {
								alt10=1;
							}

							switch (alt10) {
							case 1 :
								// gfiles/XOptimizer.g:86:60: y= .
								{
								_last = (XTree)input.LT(1);
								y=(XTree)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								 
								if ( state.backtracking==1 )
								if ( _first_2==null ) _first_2 = y;

								if ( state.backtracking==1 ) {
								retval.tree = _first_0;
								if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
									retval.tree = (XTree)adaptor.getParent(retval.tree);
								}

								}
								break;

							default :
								break loop10;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					_last = _save_last_2;
					}


					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_addZero809); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					if ( !(((x!=null?x.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "addZero", "$x.text.equals(\"0\")");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: op, y
					// token labels: op
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_op=new RewriteRuleNodeStream(adaptor,"token op",op);
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 87:21: -> ^( $op ( $y)* )
					{
						// gfiles/XOptimizer.g:87:24: ^( $op ( $y)* )
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);
						// gfiles/XOptimizer.g:87:31: ( $y)*
						while ( stream_y.hasNext() ) {
							adaptor.addChild(root_1, stream_y.nextTree());
						}
						stream_y.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
	// $ANTLR end "addZero"


	public static class subZero_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "subZero"
	// gfiles/XOptimizer.g:89:1: subZero : ^( '-' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?) -> ^( $op ( $y)* ) ;
	public final XOptimizer.subZero_return subZero() throws RecognitionException {
		XOptimizer.subZero_return retval = new XOptimizer.subZero_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree op=null;
		XTree x=null;
		XTree char_literal22=null;
		XTree y=null;

		XTree op_tree=null;
		XTree x_tree=null;
		XTree char_literal22_tree=null;
		XTree y_tree=null;
		RewriteRuleNodeStream stream_22=new RewriteRuleNodeStream(adaptor,"token 22");
		RewriteRuleNodeStream stream_23=new RewriteRuleNodeStream(adaptor,"token 23");
		RewriteRuleNodeStream stream_24=new RewriteRuleNodeStream(adaptor,"token 24");
		RewriteRuleNodeStream stream_26=new RewriteRuleNodeStream(adaptor,"token 26");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// gfiles/XOptimizer.g:89:8: ( ^( '-' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?) -> ^( $op ( $y)* ) )
			// gfiles/XOptimizer.g:89:19: ^( '-' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?)
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal22=(XTree)match(input,24,FOLLOW_24_in_subZero860); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_24.add(char_literal22);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal22;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_2 = _last;
			XTree _first_2 = null;
			// gfiles/XOptimizer.g:89:30: ( '+' | '-' | '*' | '/' | ID )
			int alt12=5;
			switch ( input.LA(1) ) {
			case 23:
				{
				alt12=1;
				}
				break;
			case 24:
				{
				alt12=2;
				}
				break;
			case 22:
				{
				alt12=3;
				}
				break;
			case 26:
				{
				alt12=4;
				}
				break;
			case ID:
				{
				alt12=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// gfiles/XOptimizer.g:89:31: '+'
					{
					_last = (XTree)input.LT(1);
					op=(XTree)match(input,23,FOLLOW_23_in_subZero866); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_23.add(op);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 2 :
					// gfiles/XOptimizer.g:89:37: '-'
					{
					_last = (XTree)input.LT(1);
					op=(XTree)match(input,24,FOLLOW_24_in_subZero870); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_24.add(op);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 3 :
					// gfiles/XOptimizer.g:89:43: '*'
					{
					_last = (XTree)input.LT(1);
					op=(XTree)match(input,22,FOLLOW_22_in_subZero874); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(op);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 4 :
					// gfiles/XOptimizer.g:89:49: '/'
					{
					_last = (XTree)input.LT(1);
					op=(XTree)match(input,26,FOLLOW_26_in_subZero878); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_26.add(op);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 5 :
					// gfiles/XOptimizer.g:89:55: ID
					{
					_last = (XTree)input.LT(1);
					op=(XTree)match(input,ID,FOLLOW_ID_in_subZero882); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ID.add(op);

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;

			}

			if ( state.backtracking==1 )
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// gfiles/XOptimizer.g:89:60: (y= . )*
				loop13:
				while (true) {
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( ((LA13_0 >= COMMENT && LA13_0 <= 45)) ) {
						alt13=1;
					}

					switch (alt13) {
					case 1 :
						// gfiles/XOptimizer.g:89:60: y= .
						{
						_last = (XTree)input.LT(1);
						y=(XTree)input.LT(1);
						matchAny(input); if (state.failed) return retval;
						 
						if ( state.backtracking==1 )
						if ( _first_2==null ) _first_2 = y;

						if ( state.backtracking==1 ) {
						retval.tree = _first_0;
						if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
							retval.tree = (XTree)adaptor.getParent(retval.tree);
						}

						}
						break;

					default :
						break loop13;
					}
				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}
			_last = _save_last_2;
			}


			_last = (XTree)input.LT(1);
			x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_subZero893); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(x);

			if ( !(((x!=null?x.getText():null).equals("0"))) ) {
				if (state.backtracking>0) {state.failed=true; return retval;}
				throw new FailedPredicateException(input, "subZero", "$x.text.equals(\"0\")");
			}
			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: op, y
			// token labels: op
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: y
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleNodeStream stream_op=new RewriteRuleNodeStream(adaptor,"token op",op);
			RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 90:21: -> ^( $op ( $y)* )
			{
				// gfiles/XOptimizer.g:90:24: ^( $op ( $y)* )
				{
				XTree root_1 = (XTree)adaptor.nil();
				root_1 = (XTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);
				// gfiles/XOptimizer.g:90:31: ( $y)*
				while ( stream_y.hasNext() ) {
					adaptor.addChild(root_1, stream_y.nextTree());
				}
				stream_y.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
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
	// $ANTLR end "subZero"


	public static class multZeroOne_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "multZeroOne"
	// gfiles/XOptimizer.g:92:1: multZeroOne : ( ^( '*' x= INTCONST {...}? ( ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) ) ) -> {$x.text.equals(\"0\") }? $x -> ^( $op ( $y)* ) | ^( '*' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?) -> {$x.text.equals(\"0\") }? $x -> ^( $op ( $y)* ) );
	public final XOptimizer.multZeroOne_return multZeroOne() throws RecognitionException {
		XOptimizer.multZeroOne_return retval = new XOptimizer.multZeroOne_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree op=null;
		XTree char_literal23=null;
		XTree char_literal24=null;
		XTree y=null;

		XTree x_tree=null;
		XTree op_tree=null;
		XTree char_literal23_tree=null;
		XTree char_literal24_tree=null;
		XTree y_tree=null;
		RewriteRuleNodeStream stream_22=new RewriteRuleNodeStream(adaptor,"token 22");
		RewriteRuleNodeStream stream_23=new RewriteRuleNodeStream(adaptor,"token 23");
		RewriteRuleNodeStream stream_24=new RewriteRuleNodeStream(adaptor,"token 24");
		RewriteRuleNodeStream stream_26=new RewriteRuleNodeStream(adaptor,"token 26");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// gfiles/XOptimizer.g:92:12: ( ^( '*' x= INTCONST {...}? ( ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) ) ) -> {$x.text.equals(\"0\") }? $x -> ^( $op ( $y)* ) | ^( '*' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?) -> {$x.text.equals(\"0\") }? $x -> ^( $op ( $y)* ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==22) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==DOWN) ) {
					int LA18_2 = input.LA(3);
					if ( (LA18_2==INTCONST) ) {
						alt18=1;
					}
					else if ( (LA18_2==ID||(LA18_2 >= 22 && LA18_2 <= 24)||LA18_2==26) ) {
						alt18=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// gfiles/XOptimizer.g:92:19: ^( '*' x= INTCONST {...}? ( ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) ) )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal23=(XTree)match(input,22,FOLLOW_22_in_multZeroOne940); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal23);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal23;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_multZeroOne944); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					if ( !(((x!=null?x.getText():null).equals("0")||(x!=null?x.getText():null).equals("1") )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "multZeroOne", "$x.text.equals(\"0\")||$x.text.equals(\"1\") ");
					}
					// gfiles/XOptimizer.g:92:81: ( ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) )
					// gfiles/XOptimizer.g:92:82: ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_2 = _last;
					XTree _first_2 = null;
					// gfiles/XOptimizer.g:92:87: ( '+' | '-' | '*' | '/' | ID )
					int alt14=5;
					switch ( input.LA(1) ) {
					case 23:
						{
						alt14=1;
						}
						break;
					case 24:
						{
						alt14=2;
						}
						break;
					case 22:
						{
						alt14=3;
						}
						break;
					case 26:
						{
						alt14=4;
						}
						break;
					case ID:
						{
						alt14=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}
					switch (alt14) {
						case 1 :
							// gfiles/XOptimizer.g:92:88: '+'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,23,FOLLOW_23_in_multZeroOne953); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_23.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 2 :
							// gfiles/XOptimizer.g:92:94: '-'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,24,FOLLOW_24_in_multZeroOne957); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_24.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 3 :
							// gfiles/XOptimizer.g:92:100: '*'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,22,FOLLOW_22_in_multZeroOne961); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_22.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 4 :
							// gfiles/XOptimizer.g:92:106: '/'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,26,FOLLOW_26_in_multZeroOne965); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_26.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 5 :
							// gfiles/XOptimizer.g:92:112: ID
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,ID,FOLLOW_ID_in_multZeroOne969); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_ID.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;

					}

					if ( state.backtracking==1 )
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// gfiles/XOptimizer.g:92:117: (y= . )*
						loop15:
						while (true) {
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( ((LA15_0 >= COMMENT && LA15_0 <= 45)) ) {
								alt15=1;
							}

							switch (alt15) {
							case 1 :
								// gfiles/XOptimizer.g:92:117: y= .
								{
								_last = (XTree)input.LT(1);
								y=(XTree)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								 
								if ( state.backtracking==1 )
								if ( _first_2==null ) _first_2 = y;

								if ( state.backtracking==1 ) {
								retval.tree = _first_0;
								if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
									retval.tree = (XTree)adaptor.getParent(retval.tree);
								}

								}
								break;

							default :
								break loop15;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					_last = _save_last_2;
					}


					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: op, y, x
					// token labels: op, x
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_op=new RewriteRuleNodeStream(adaptor,"token op",op);
					RewriteRuleNodeStream stream_x=new RewriteRuleNodeStream(adaptor,"token x",x);
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 93:21: -> {$x.text.equals(\"0\") }? $x
					if ((x!=null?x.getText():null).equals("0") ) {
						adaptor.addChild(root_0, stream_x.nextNode());
					}

					else // 94:21: -> ^( $op ( $y)* )
					{
						// gfiles/XOptimizer.g:94:24: ^( $op ( $y)* )
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);
						// gfiles/XOptimizer.g:94:31: ( $y)*
						while ( stream_y.hasNext() ) {
							adaptor.addChild(root_1, stream_y.nextTree());
						}
						stream_y.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// gfiles/XOptimizer.g:95:19: ^( '*' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?)
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal24=(XTree)match(input,22,FOLLOW_22_in_multZeroOne1058); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal24);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal24;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_2 = _last;
					XTree _first_2 = null;
					// gfiles/XOptimizer.g:95:30: ( '+' | '-' | '*' | '/' | ID )
					int alt16=5;
					switch ( input.LA(1) ) {
					case 23:
						{
						alt16=1;
						}
						break;
					case 24:
						{
						alt16=2;
						}
						break;
					case 22:
						{
						alt16=3;
						}
						break;
					case 26:
						{
						alt16=4;
						}
						break;
					case ID:
						{
						alt16=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}
					switch (alt16) {
						case 1 :
							// gfiles/XOptimizer.g:95:31: '+'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,23,FOLLOW_23_in_multZeroOne1064); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_23.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 2 :
							// gfiles/XOptimizer.g:95:37: '-'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,24,FOLLOW_24_in_multZeroOne1068); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_24.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 3 :
							// gfiles/XOptimizer.g:95:43: '*'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,22,FOLLOW_22_in_multZeroOne1072); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_22.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 4 :
							// gfiles/XOptimizer.g:95:49: '/'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,26,FOLLOW_26_in_multZeroOne1076); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_26.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 5 :
							// gfiles/XOptimizer.g:95:55: ID
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,ID,FOLLOW_ID_in_multZeroOne1080); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_ID.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;

					}

					if ( state.backtracking==1 )
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// gfiles/XOptimizer.g:95:60: (y= . )*
						loop17:
						while (true) {
							int alt17=2;
							int LA17_0 = input.LA(1);
							if ( ((LA17_0 >= COMMENT && LA17_0 <= 45)) ) {
								alt17=1;
							}

							switch (alt17) {
							case 1 :
								// gfiles/XOptimizer.g:95:60: y= .
								{
								_last = (XTree)input.LT(1);
								y=(XTree)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								 
								if ( state.backtracking==1 )
								if ( _first_2==null ) _first_2 = y;

								if ( state.backtracking==1 ) {
								retval.tree = _first_0;
								if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
									retval.tree = (XTree)adaptor.getParent(retval.tree);
								}

								}
								break;

							default :
								break loop17;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					_last = _save_last_2;
					}


					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_multZeroOne1091); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					if ( !(((x!=null?x.getText():null).equals("0")||(x!=null?x.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "multZeroOne", "$x.text.equals(\"0\")||$x.text.equals(\"0\")");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: y, x, op
					// token labels: op, x
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_op=new RewriteRuleNodeStream(adaptor,"token op",op);
					RewriteRuleNodeStream stream_x=new RewriteRuleNodeStream(adaptor,"token x",x);
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 96:21: -> {$x.text.equals(\"0\") }? $x
					if ((x!=null?x.getText():null).equals("0") ) {
						adaptor.addChild(root_0, stream_x.nextNode());
					}

					else // 97:21: -> ^( $op ( $y)* )
					{
						// gfiles/XOptimizer.g:97:24: ^( $op ( $y)* )
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);
						// gfiles/XOptimizer.g:97:31: ( $y)*
						while ( stream_y.hasNext() ) {
							adaptor.addChild(root_1, stream_y.nextTree());
						}
						stream_y.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
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
	// $ANTLR end "multZeroOne"

	// Delegated rules



	public static final BitSet FOLLOW_combineConst_in_bottomup73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multZeroOne_in_bottomup77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addZero_in_bottomup81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subZero_in_bottomup85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_combineConst98 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGCONST_in_combineConst102 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_STRINGCONST_in_combineConst106 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_combineConst151 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst155 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst159 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_combineConst186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst190 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst194 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_combineConst221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst225 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_combineConst256 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst260 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst264 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_combineConst291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst296 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst302 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_combineConst336 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst341 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst347 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst353 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_combineConst381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst386 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst392 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst398 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_combineConst426 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst431 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst437 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst443 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_combineConst471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst476 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst482 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_combineConst510 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst515 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst521 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_combineConst549 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst554 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst560 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_combineConst588 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst593 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UMINUS_in_combineConst627 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_combineConst631 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UMINUS_in_combineConst658 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_combineConst662 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_addZero685 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_addZero689 = new BitSet(new long[]{0x0000000005C00200L});
	public static final BitSet FOLLOW_23_in_addZero698 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_24_in_addZero702 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_addZero706 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_26_in_addZero710 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_addZero714 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_23_in_addZero776 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_23_in_addZero782 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_24_in_addZero786 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_addZero790 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_26_in_addZero794 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_addZero798 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_addZero809 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_subZero860 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_23_in_subZero866 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_24_in_subZero870 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_subZero874 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_26_in_subZero878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_subZero882 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_subZero893 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_multZeroOne940 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_multZeroOne944 = new BitSet(new long[]{0x0000000005C00200L});
	public static final BitSet FOLLOW_23_in_multZeroOne953 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_24_in_multZeroOne957 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_multZeroOne961 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_26_in_multZeroOne965 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_multZeroOne969 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_multZeroOne1058 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_23_in_multZeroOne1064 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_24_in_multZeroOne1068 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_multZeroOne1072 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_26_in_multZeroOne1076 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_multZeroOne1080 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_multZeroOne1091 = new BitSet(new long[]{0x0000000000000008L});
}
