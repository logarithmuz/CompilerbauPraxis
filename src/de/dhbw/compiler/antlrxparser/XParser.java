// $ANTLR 3.5.2 gfiles/X.g 2019-05-23 18:48:27
package de.dhbw.compiler.antlrxparser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class XParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECL", "DECLLIST", "DIGIT", "DIGIT0", 
		"FLOATCONST", "ID", "INTCONST", "INVALID", "LETTER", "STATLIST", "STRINGCONST", 
		"SYMBOL", "UMINUS", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'.'", "'/'", 
		"':'", "':='", "';'", "'<'", "'='", "'>'", "'begin'", "'else'", "'end'", 
		"'float'", "'for'", "'if'", "'int'", "'print'", "'program'", "'read'", 
		"'string'", "'then'", "'while'"
	};
	public static final int EOF=-1;
	public static final int T__18=18;
	public static final int T__19=19;
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
	public static final int DECL=4;
	public static final int DECLLIST=5;
	public static final int DIGIT=6;
	public static final int DIGIT0=7;
	public static final int FLOATCONST=8;
	public static final int ID=9;
	public static final int INTCONST=10;
	public static final int INVALID=11;
	public static final int LETTER=12;
	public static final int STATLIST=13;
	public static final int STRINGCONST=14;
	public static final int SYMBOL=15;
	public static final int UMINUS=16;
	public static final int WS=17;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public XParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public XParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XParser.tokenNames; }
	@Override public String getGrammarFileName() { return "gfiles/X.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// gfiles/X.g:44:1: program : 'program' ID ';' declist block '.' EOF -> ^( 'program' ID ^( DECLLIST ( declist )? ) block ) ;
	public final XParser.program_return program() throws RecognitionException {
		XParser.program_return retval = new XParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token ID2=null;
		Token char_literal3=null;
		Token char_literal6=null;
		Token EOF7=null;
		ParserRuleReturnScope declist4 =null;
		ParserRuleReturnScope block5 =null;

		Object string_literal1_tree=null;
		Object ID2_tree=null;
		Object char_literal3_tree=null;
		Object char_literal6_tree=null;
		Object EOF7_tree=null;
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_declist=new RewriteRuleSubtreeStream(adaptor,"rule declist");

		try {
			// gfiles/X.g:44:8: ( 'program' ID ';' declist block '.' EOF -> ^( 'program' ID ^( DECLLIST ( declist )? ) block ) )
			// gfiles/X.g:44:11: 'program' ID ';' declist block '.' EOF
			{
			string_literal1=(Token)match(input,39,FOLLOW_39_in_program307);  
			stream_39.add(string_literal1);

			ID2=(Token)match(input,ID,FOLLOW_ID_in_program309);  
			stream_ID.add(ID2);

			char_literal3=(Token)match(input,27,FOLLOW_27_in_program311);  
			stream_27.add(char_literal3);

			pushFollow(FOLLOW_declist_in_program313);
			declist4=declist();
			state._fsp--;

			stream_declist.add(declist4.getTree());
			pushFollow(FOLLOW_block_in_program315);
			block5=block();
			state._fsp--;

			stream_block.add(block5.getTree());
			char_literal6=(Token)match(input,23,FOLLOW_23_in_program317);  
			stream_23.add(char_literal6);

			EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_program319);  
			stream_EOF.add(EOF7);

			// AST REWRITE
			// elements: declist, ID, block, 39
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 44:50: -> ^( 'program' ID ^( DECLLIST ( declist )? ) block )
			{
				// gfiles/X.g:44:53: ^( 'program' ID ^( DECLLIST ( declist )? ) block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_39.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// gfiles/X.g:44:68: ^( DECLLIST ( declist )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLLIST, "DECLLIST"), root_2);
				// gfiles/X.g:44:79: ( declist )?
				if ( stream_declist.hasNext() ) {
					adaptor.addChild(root_2, stream_declist.nextTree());
				}
				stream_declist.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declist"
	// gfiles/X.g:45:1: declist : ( declaration )* ;
	public final XParser.declist_return declist() throws RecognitionException {
		XParser.declist_return retval = new XParser.declist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declaration8 =null;


		try {
			// gfiles/X.g:45:8: ( ( declaration )* )
			// gfiles/X.g:45:11: ( declaration )*
			{
			root_0 = (Object)adaptor.nil();


			// gfiles/X.g:45:11: ( declaration )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==38||LA1_0==40) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// gfiles/X.g:45:11: declaration
					{
					pushFollow(FOLLOW_declaration_in_declist343);
					declaration8=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration8.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declist"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// gfiles/X.g:46:1: block : 'begin' stmtlist 'end' -> ^( STATLIST ( stmtlist )? ) ;
	public final XParser.block_return block() throws RecognitionException {
		XParser.block_return retval = new XParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal9=null;
		Token string_literal11=null;
		ParserRuleReturnScope stmtlist10 =null;

		Object string_literal9_tree=null;
		Object string_literal11_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_stmtlist=new RewriteRuleSubtreeStream(adaptor,"rule stmtlist");

		try {
			// gfiles/X.g:46:6: ( 'begin' stmtlist 'end' -> ^( STATLIST ( stmtlist )? ) )
			// gfiles/X.g:46:11: 'begin' stmtlist 'end'
			{
			string_literal9=(Token)match(input,31,FOLLOW_31_in_block353);  
			stream_31.add(string_literal9);

			pushFollow(FOLLOW_stmtlist_in_block355);
			stmtlist10=stmtlist();
			state._fsp--;

			stream_stmtlist.add(stmtlist10.getTree());
			string_literal11=(Token)match(input,33,FOLLOW_33_in_block357);  
			stream_33.add(string_literal11);

			// AST REWRITE
			// elements: stmtlist
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 46:34: -> ^( STATLIST ( stmtlist )? )
			{
				// gfiles/X.g:46:37: ^( STATLIST ( stmtlist )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATLIST, "STATLIST"), root_1);
				// gfiles/X.g:46:48: ( stmtlist )?
				if ( stream_stmtlist.hasNext() ) {
					adaptor.addChild(root_1, stream_stmtlist.nextTree());
				}
				stream_stmtlist.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class stmtlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stmtlist"
	// gfiles/X.g:47:1: stmtlist : ( stmtWithSemi )* ;
	public final XParser.stmtlist_return stmtlist() throws RecognitionException {
		XParser.stmtlist_return retval = new XParser.stmtlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stmtWithSemi12 =null;


		try {
			// gfiles/X.g:47:9: ( ( stmtWithSemi )* )
			// gfiles/X.g:47:12: ( stmtWithSemi )*
			{
			root_0 = (Object)adaptor.nil();


			// gfiles/X.g:47:12: ( stmtWithSemi )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID||LA2_0==31||(LA2_0 >= 35 && LA2_0 <= 36)||LA2_0==43) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// gfiles/X.g:47:12: stmtWithSemi
					{
					pushFollow(FOLLOW_stmtWithSemi_in_stmtlist373);
					stmtWithSemi12=stmtWithSemi();
					state._fsp--;

					adaptor.addChild(root_0, stmtWithSemi12.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stmtlist"


	public static class stmtWithSemi_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stmtWithSemi"
	// gfiles/X.g:49:1: stmtWithSemi : stmt ';' -> stmt ;
	public final XParser.stmtWithSemi_return stmtWithSemi() throws RecognitionException {
		XParser.stmtWithSemi_return retval = new XParser.stmtWithSemi_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal14=null;
		ParserRuleReturnScope stmt13 =null;

		Object char_literal14_tree=null;
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");

		try {
			// gfiles/X.g:49:13: ( stmt ';' -> stmt )
			// gfiles/X.g:49:15: stmt ';'
			{
			pushFollow(FOLLOW_stmt_in_stmtWithSemi381);
			stmt13=stmt();
			state._fsp--;

			stream_stmt.add(stmt13.getTree());
			char_literal14=(Token)match(input,27,FOLLOW_27_in_stmtWithSemi383);  
			stream_27.add(char_literal14);

			// AST REWRITE
			// elements: stmt
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 49:24: -> stmt
			{
				adaptor.addChild(root_0, stream_stmt.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stmtWithSemi"


	public static class stmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stmt"
	// gfiles/X.g:50:1: stmt : ( assignStmt | condStmt | whileStmt | forStmt | block );
	public final XParser.stmt_return stmt() throws RecognitionException {
		XParser.stmt_return retval = new XParser.stmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignStmt15 =null;
		ParserRuleReturnScope condStmt16 =null;
		ParserRuleReturnScope whileStmt17 =null;
		ParserRuleReturnScope forStmt18 =null;
		ParserRuleReturnScope block19 =null;


		try {
			// gfiles/X.g:50:5: ( assignStmt | condStmt | whileStmt | forStmt | block )
			int alt3=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt3=1;
				}
				break;
			case 36:
				{
				alt3=2;
				}
				break;
			case 43:
				{
				alt3=3;
				}
				break;
			case 35:
				{
				alt3=4;
				}
				break;
			case 31:
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// gfiles/X.g:50:9: assignStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignStmt_in_stmt395);
					assignStmt15=assignStmt();
					state._fsp--;

					adaptor.addChild(root_0, assignStmt15.getTree());

					}
					break;
				case 2 :
					// gfiles/X.g:50:22: condStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condStmt_in_stmt399);
					condStmt16=condStmt();
					state._fsp--;

					adaptor.addChild(root_0, condStmt16.getTree());

					}
					break;
				case 3 :
					// gfiles/X.g:50:33: whileStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStmt_in_stmt403);
					whileStmt17=whileStmt();
					state._fsp--;

					adaptor.addChild(root_0, whileStmt17.getTree());

					}
					break;
				case 4 :
					// gfiles/X.g:50:45: forStmt
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStmt_in_stmt407);
					forStmt18=forStmt();
					state._fsp--;

					adaptor.addChild(root_0, forStmt18.getTree());

					}
					break;
				case 5 :
					// gfiles/X.g:50:55: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stmt411);
					block19=block();
					state._fsp--;

					adaptor.addChild(root_0, block19.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stmt"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// gfiles/X.g:51:1: declaration : ( modifier )? ID ':' type ';' -> ^( DECL ID type ( modifier )? ) ;
	public final XParser.declaration_return declaration() throws RecognitionException {
		XParser.declaration_return retval = new XParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID21=null;
		Token char_literal22=null;
		Token char_literal24=null;
		ParserRuleReturnScope modifier20 =null;
		ParserRuleReturnScope type23 =null;

		Object ID21_tree=null;
		Object char_literal22_tree=null;
		Object char_literal24_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// gfiles/X.g:51:12: ( ( modifier )? ID ':' type ';' -> ^( DECL ID type ( modifier )? ) )
			// gfiles/X.g:51:14: ( modifier )? ID ':' type ';'
			{
			// gfiles/X.g:51:14: ( modifier )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==38||LA4_0==40) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// gfiles/X.g:51:14: modifier
					{
					pushFollow(FOLLOW_modifier_in_declaration417);
					modifier20=modifier();
					state._fsp--;

					stream_modifier.add(modifier20.getTree());
					}
					break;

			}

			ID21=(Token)match(input,ID,FOLLOW_ID_in_declaration420);  
			stream_ID.add(ID21);

			char_literal22=(Token)match(input,25,FOLLOW_25_in_declaration422);  
			stream_25.add(char_literal22);

			pushFollow(FOLLOW_type_in_declaration424);
			type23=type();
			state._fsp--;

			stream_type.add(type23.getTree());
			char_literal24=(Token)match(input,27,FOLLOW_27_in_declaration426);  
			stream_27.add(char_literal24);

			// AST REWRITE
			// elements: type, ID, modifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 51:40: -> ^( DECL ID type ( modifier )? )
			{
				// gfiles/X.g:51:43: ^( DECL ID type ( modifier )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_type.nextTree());
				// gfiles/X.g:51:58: ( modifier )?
				if ( stream_modifier.hasNext() ) {
					adaptor.addChild(root_1, stream_modifier.nextTree());
				}
				stream_modifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class assignStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignStmt"
	// gfiles/X.g:53:1: assignStmt : ID ':=' numExpr -> ^( ':=' ID numExpr ) ;
	public final XParser.assignStmt_return assignStmt() throws RecognitionException {
		XParser.assignStmt_return retval = new XParser.assignStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID25=null;
		Token string_literal26=null;
		ParserRuleReturnScope numExpr27 =null;

		Object ID25_tree=null;
		Object string_literal26_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_numExpr=new RewriteRuleSubtreeStream(adaptor,"rule numExpr");

		try {
			// gfiles/X.g:53:11: ( ID ':=' numExpr -> ^( ':=' ID numExpr ) )
			// gfiles/X.g:53:14: ID ':=' numExpr
			{
			ID25=(Token)match(input,ID,FOLLOW_ID_in_assignStmt447);  
			stream_ID.add(ID25);

			string_literal26=(Token)match(input,26,FOLLOW_26_in_assignStmt449);  
			stream_26.add(string_literal26);

			pushFollow(FOLLOW_numExpr_in_assignStmt451);
			numExpr27=numExpr();
			state._fsp--;

			stream_numExpr.add(numExpr27.getTree());
			// AST REWRITE
			// elements: 26, ID, numExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 53:30: -> ^( ':=' ID numExpr )
			{
				// gfiles/X.g:53:33: ^( ':=' ID numExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_26.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_numExpr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignStmt"


	public static class condStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condStmt"
	// gfiles/X.g:54:1: condStmt : 'if' ^ cond 'then' ! stmt ( options {greedy=true; } : 'else' ! stmt )? ;
	public final XParser.condStmt_return condStmt() throws RecognitionException {
		XParser.condStmt_return retval = new XParser.condStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal28=null;
		Token string_literal30=null;
		Token string_literal32=null;
		ParserRuleReturnScope cond29 =null;
		ParserRuleReturnScope stmt31 =null;
		ParserRuleReturnScope stmt33 =null;

		Object string_literal28_tree=null;
		Object string_literal30_tree=null;
		Object string_literal32_tree=null;

		try {
			// gfiles/X.g:54:9: ( 'if' ^ cond 'then' ! stmt ( options {greedy=true; } : 'else' ! stmt )? )
			// gfiles/X.g:54:13: 'if' ^ cond 'then' ! stmt ( options {greedy=true; } : 'else' ! stmt )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal28=(Token)match(input,36,FOLLOW_36_in_condStmt469); 
			string_literal28_tree = (Object)adaptor.create(string_literal28);
			root_0 = (Object)adaptor.becomeRoot(string_literal28_tree, root_0);

			pushFollow(FOLLOW_cond_in_condStmt472);
			cond29=cond();
			state._fsp--;

			adaptor.addChild(root_0, cond29.getTree());

			string_literal30=(Token)match(input,42,FOLLOW_42_in_condStmt474); 
			pushFollow(FOLLOW_stmt_in_condStmt477);
			stmt31=stmt();
			state._fsp--;

			adaptor.addChild(root_0, stmt31.getTree());

			// gfiles/X.g:54:37: ( options {greedy=true; } : 'else' ! stmt )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==32) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// gfiles/X.g:54:61: 'else' ! stmt
					{
					string_literal32=(Token)match(input,32,FOLLOW_32_in_condStmt488); 
					pushFollow(FOLLOW_stmt_in_condStmt491);
					stmt33=stmt();
					state._fsp--;

					adaptor.addChild(root_0, stmt33.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condStmt"


	public static class whileStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStmt"
	// gfiles/X.g:55:1: whileStmt : 'while' '(' cond ')' stmt -> ^( 'while' cond stmt ) ;
	public final XParser.whileStmt_return whileStmt() throws RecognitionException {
		XParser.whileStmt_return retval = new XParser.whileStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal34=null;
		Token char_literal35=null;
		Token char_literal37=null;
		ParserRuleReturnScope cond36 =null;
		ParserRuleReturnScope stmt38 =null;

		Object string_literal34_tree=null;
		Object char_literal35_tree=null;
		Object char_literal37_tree=null;
		RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
		RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
		RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");

		try {
			// gfiles/X.g:55:10: ( 'while' '(' cond ')' stmt -> ^( 'while' cond stmt ) )
			// gfiles/X.g:55:13: 'while' '(' cond ')' stmt
			{
			string_literal34=(Token)match(input,43,FOLLOW_43_in_whileStmt500);  
			stream_43.add(string_literal34);

			char_literal35=(Token)match(input,18,FOLLOW_18_in_whileStmt502);  
			stream_18.add(char_literal35);

			pushFollow(FOLLOW_cond_in_whileStmt504);
			cond36=cond();
			state._fsp--;

			stream_cond.add(cond36.getTree());
			char_literal37=(Token)match(input,19,FOLLOW_19_in_whileStmt506);  
			stream_19.add(char_literal37);

			pushFollow(FOLLOW_stmt_in_whileStmt508);
			stmt38=stmt();
			state._fsp--;

			stream_stmt.add(stmt38.getTree());
			// AST REWRITE
			// elements: cond, stmt, 43
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 55:39: -> ^( 'while' cond stmt )
			{
				// gfiles/X.g:55:42: ^( 'while' cond stmt )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_43.nextNode(), root_1);
				adaptor.addChild(root_1, stream_cond.nextTree());
				adaptor.addChild(root_1, stream_stmt.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStmt"


	public static class forStmt_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forStmt"
	// gfiles/X.g:56:1: forStmt : 'for' '(' assignStmt ';' cond ';' assignStmt ')' stmt -> ^( 'for' assignStmt cond assignStmt stmt ) ;
	public final XParser.forStmt_return forStmt() throws RecognitionException {
		XParser.forStmt_return retval = new XParser.forStmt_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal39=null;
		Token char_literal40=null;
		Token char_literal42=null;
		Token char_literal44=null;
		Token char_literal46=null;
		ParserRuleReturnScope assignStmt41 =null;
		ParserRuleReturnScope cond43 =null;
		ParserRuleReturnScope assignStmt45 =null;
		ParserRuleReturnScope stmt47 =null;

		Object string_literal39_tree=null;
		Object char_literal40_tree=null;
		Object char_literal42_tree=null;
		Object char_literal44_tree=null;
		Object char_literal46_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
		RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
		RewriteRuleSubtreeStream stream_assignStmt=new RewriteRuleSubtreeStream(adaptor,"rule assignStmt");
		RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
		RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");

		try {
			// gfiles/X.g:56:8: ( 'for' '(' assignStmt ';' cond ';' assignStmt ')' stmt -> ^( 'for' assignStmt cond assignStmt stmt ) )
			// gfiles/X.g:56:11: 'for' '(' assignStmt ';' cond ';' assignStmt ')' stmt
			{
			string_literal39=(Token)match(input,35,FOLLOW_35_in_forStmt525);  
			stream_35.add(string_literal39);

			char_literal40=(Token)match(input,18,FOLLOW_18_in_forStmt527);  
			stream_18.add(char_literal40);

			pushFollow(FOLLOW_assignStmt_in_forStmt529);
			assignStmt41=assignStmt();
			state._fsp--;

			stream_assignStmt.add(assignStmt41.getTree());
			char_literal42=(Token)match(input,27,FOLLOW_27_in_forStmt531);  
			stream_27.add(char_literal42);

			pushFollow(FOLLOW_cond_in_forStmt533);
			cond43=cond();
			state._fsp--;

			stream_cond.add(cond43.getTree());
			char_literal44=(Token)match(input,27,FOLLOW_27_in_forStmt535);  
			stream_27.add(char_literal44);

			pushFollow(FOLLOW_assignStmt_in_forStmt537);
			assignStmt45=assignStmt();
			state._fsp--;

			stream_assignStmt.add(assignStmt45.getTree());
			char_literal46=(Token)match(input,19,FOLLOW_19_in_forStmt539);  
			stream_19.add(char_literal46);

			pushFollow(FOLLOW_stmt_in_forStmt541);
			stmt47=stmt();
			state._fsp--;

			stream_stmt.add(stmt47.getTree());
			// AST REWRITE
			// elements: assignStmt, stmt, assignStmt, cond, 35
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 56:65: -> ^( 'for' assignStmt cond assignStmt stmt )
			{
				// gfiles/X.g:56:68: ^( 'for' assignStmt cond assignStmt stmt )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_35.nextNode(), root_1);
				adaptor.addChild(root_1, stream_assignStmt.nextTree());
				adaptor.addChild(root_1, stream_cond.nextTree());
				adaptor.addChild(root_1, stream_assignStmt.nextTree());
				adaptor.addChild(root_1, stream_stmt.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forStmt"


	public static class cond_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// gfiles/X.g:58:1: cond : numExpr comperator ^ numExpr ;
	public final XParser.cond_return cond() throws RecognitionException {
		XParser.cond_return retval = new XParser.cond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope numExpr48 =null;
		ParserRuleReturnScope comperator49 =null;
		ParserRuleReturnScope numExpr50 =null;


		try {
			// gfiles/X.g:58:5: ( numExpr comperator ^ numExpr )
			// gfiles/X.g:58:9: numExpr comperator ^ numExpr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_numExpr_in_cond564);
			numExpr48=numExpr();
			state._fsp--;

			adaptor.addChild(root_0, numExpr48.getTree());

			pushFollow(FOLLOW_comperator_in_cond566);
			comperator49=comperator();
			state._fsp--;

			root_0 = (Object)adaptor.becomeRoot(comperator49.getTree(), root_0);
			pushFollow(FOLLOW_numExpr_in_cond569);
			numExpr50=numExpr();
			state._fsp--;

			adaptor.addChild(root_0, numExpr50.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cond"


	public static class comperator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comperator"
	// gfiles/X.g:59:1: comperator : ( '<' | '=' | '>' );
	public final XParser.comperator_return comperator() throws RecognitionException {
		XParser.comperator_return retval = new XParser.comperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set51=null;

		Object set51_tree=null;

		try {
			// gfiles/X.g:59:11: ( '<' | '=' | '>' )
			// gfiles/X.g:
			{
			root_0 = (Object)adaptor.nil();


			set51=input.LT(1);
			if ( (input.LA(1) >= 28 && input.LA(1) <= 30) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set51));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comperator"


	public static class modifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "modifier"
	// gfiles/X.g:60:1: modifier : ( 'read' 'print' | 'read' | 'print' );
	public final XParser.modifier_return modifier() throws RecognitionException {
		XParser.modifier_return retval = new XParser.modifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal52=null;
		Token string_literal53=null;
		Token string_literal54=null;
		Token string_literal55=null;

		Object string_literal52_tree=null;
		Object string_literal53_tree=null;
		Object string_literal54_tree=null;
		Object string_literal55_tree=null;

		try {
			// gfiles/X.g:60:9: ( 'read' 'print' | 'read' | 'print' )
			int alt6=3;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==40) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==38) ) {
					alt6=1;
				}
				else if ( (LA6_1==ID) ) {
					alt6=2;
				}

				else {
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
			else if ( (LA6_0==38) ) {
				alt6=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// gfiles/X.g:60:12: 'read' 'print'
					{
					root_0 = (Object)adaptor.nil();


					string_literal52=(Token)match(input,40,FOLLOW_40_in_modifier591); 
					string_literal52_tree = (Object)adaptor.create(string_literal52);
					adaptor.addChild(root_0, string_literal52_tree);

					string_literal53=(Token)match(input,38,FOLLOW_38_in_modifier593); 
					string_literal53_tree = (Object)adaptor.create(string_literal53);
					adaptor.addChild(root_0, string_literal53_tree);

					}
					break;
				case 2 :
					// gfiles/X.g:60:29: 'read'
					{
					root_0 = (Object)adaptor.nil();


					string_literal54=(Token)match(input,40,FOLLOW_40_in_modifier597); 
					string_literal54_tree = (Object)adaptor.create(string_literal54);
					adaptor.addChild(root_0, string_literal54_tree);

					}
					break;
				case 3 :
					// gfiles/X.g:60:38: 'print'
					{
					root_0 = (Object)adaptor.nil();


					string_literal55=(Token)match(input,38,FOLLOW_38_in_modifier601); 
					string_literal55_tree = (Object)adaptor.create(string_literal55);
					adaptor.addChild(root_0, string_literal55_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modifier"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// gfiles/X.g:61:1: type : ( 'int' | 'float' | 'string' );
	public final XParser.type_return type() throws RecognitionException {
		XParser.type_return retval = new XParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set56=null;

		Object set56_tree=null;

		try {
			// gfiles/X.g:61:5: ( 'int' | 'float' | 'string' )
			// gfiles/X.g:
			{
			root_0 = (Object)adaptor.nil();


			set56=input.LT(1);
			if ( input.LA(1)==34||input.LA(1)==37||input.LA(1)==41 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set56));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class numExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numExpr"
	// gfiles/X.g:63:1: numExpr : numExpr2 ( ( '+' ^| '-' ^) numExpr2 )* ;
	public final XParser.numExpr_return numExpr() throws RecognitionException {
		XParser.numExpr_return retval = new XParser.numExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal58=null;
		Token char_literal59=null;
		ParserRuleReturnScope numExpr257 =null;
		ParserRuleReturnScope numExpr260 =null;

		Object char_literal58_tree=null;
		Object char_literal59_tree=null;

		try {
			// gfiles/X.g:63:8: ( numExpr2 ( ( '+' ^| '-' ^) numExpr2 )* )
			// gfiles/X.g:63:12: numExpr2 ( ( '+' ^| '-' ^) numExpr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_numExpr2_in_numExpr626);
			numExpr257=numExpr2();
			state._fsp--;

			adaptor.addChild(root_0, numExpr257.getTree());

			// gfiles/X.g:63:21: ( ( '+' ^| '-' ^) numExpr2 )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= 21 && LA8_0 <= 22)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// gfiles/X.g:63:22: ( '+' ^| '-' ^) numExpr2
					{
					// gfiles/X.g:63:22: ( '+' ^| '-' ^)
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==21) ) {
						alt7=1;
					}
					else if ( (LA7_0==22) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// gfiles/X.g:63:23: '+' ^
							{
							char_literal58=(Token)match(input,21,FOLLOW_21_in_numExpr630); 
							char_literal58_tree = (Object)adaptor.create(char_literal58);
							root_0 = (Object)adaptor.becomeRoot(char_literal58_tree, root_0);

							}
							break;
						case 2 :
							// gfiles/X.g:63:30: '-' ^
							{
							char_literal59=(Token)match(input,22,FOLLOW_22_in_numExpr635); 
							char_literal59_tree = (Object)adaptor.create(char_literal59);
							root_0 = (Object)adaptor.becomeRoot(char_literal59_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_numExpr2_in_numExpr639);
					numExpr260=numExpr2();
					state._fsp--;

					adaptor.addChild(root_0, numExpr260.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numExpr"


	public static class numExpr2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numExpr2"
	// gfiles/X.g:64:1: numExpr2 : numExpr3 ( ( '*' ^| '/' ^) numExpr3 )* ;
	public final XParser.numExpr2_return numExpr2() throws RecognitionException {
		XParser.numExpr2_return retval = new XParser.numExpr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal62=null;
		Token char_literal63=null;
		ParserRuleReturnScope numExpr361 =null;
		ParserRuleReturnScope numExpr364 =null;

		Object char_literal62_tree=null;
		Object char_literal63_tree=null;

		try {
			// gfiles/X.g:64:9: ( numExpr3 ( ( '*' ^| '/' ^) numExpr3 )* )
			// gfiles/X.g:64:12: numExpr3 ( ( '*' ^| '/' ^) numExpr3 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_numExpr3_in_numExpr2649);
			numExpr361=numExpr3();
			state._fsp--;

			adaptor.addChild(root_0, numExpr361.getTree());

			// gfiles/X.g:64:21: ( ( '*' ^| '/' ^) numExpr3 )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==20||LA10_0==24) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// gfiles/X.g:64:22: ( '*' ^| '/' ^) numExpr3
					{
					// gfiles/X.g:64:22: ( '*' ^| '/' ^)
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==20) ) {
						alt9=1;
					}
					else if ( (LA9_0==24) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// gfiles/X.g:64:23: '*' ^
							{
							char_literal62=(Token)match(input,20,FOLLOW_20_in_numExpr2653); 
							char_literal62_tree = (Object)adaptor.create(char_literal62);
							root_0 = (Object)adaptor.becomeRoot(char_literal62_tree, root_0);

							}
							break;
						case 2 :
							// gfiles/X.g:64:30: '/' ^
							{
							char_literal63=(Token)match(input,24,FOLLOW_24_in_numExpr2658); 
							char_literal63_tree = (Object)adaptor.create(char_literal63);
							root_0 = (Object)adaptor.becomeRoot(char_literal63_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_numExpr3_in_numExpr2662);
					numExpr364=numExpr3();
					state._fsp--;

					adaptor.addChild(root_0, numExpr364.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numExpr2"


	public static class numExpr3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numExpr3"
	// gfiles/X.g:65:1: numExpr3 : ( INTCONST | FLOATCONST | STRINGCONST | ID | '(' numExpr ')' -> numExpr |op= '-' number -> ^( UMINUS[op, \"UMINUS\"] number ) );
	public final XParser.numExpr3_return numExpr3() throws RecognitionException {
		XParser.numExpr3_return retval = new XParser.numExpr3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		Token INTCONST65=null;
		Token FLOATCONST66=null;
		Token STRINGCONST67=null;
		Token ID68=null;
		Token char_literal69=null;
		Token char_literal71=null;
		ParserRuleReturnScope numExpr70 =null;
		ParserRuleReturnScope number72 =null;

		Object op_tree=null;
		Object INTCONST65_tree=null;
		Object FLOATCONST66_tree=null;
		Object STRINGCONST67_tree=null;
		Object ID68_tree=null;
		Object char_literal69_tree=null;
		Object char_literal71_tree=null;
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
		RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
		RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number");
		RewriteRuleSubtreeStream stream_numExpr=new RewriteRuleSubtreeStream(adaptor,"rule numExpr");

		try {
			// gfiles/X.g:65:9: ( INTCONST | FLOATCONST | STRINGCONST | ID | '(' numExpr ')' -> numExpr |op= '-' number -> ^( UMINUS[op, \"UMINUS\"] number ) )
			int alt11=6;
			switch ( input.LA(1) ) {
			case INTCONST:
				{
				alt11=1;
				}
				break;
			case FLOATCONST:
				{
				alt11=2;
				}
				break;
			case STRINGCONST:
				{
				alt11=3;
				}
				break;
			case ID:
				{
				alt11=4;
				}
				break;
			case 18:
				{
				alt11=5;
				}
				break;
			case 22:
				{
				alt11=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// gfiles/X.g:65:12: INTCONST
					{
					root_0 = (Object)adaptor.nil();


					INTCONST65=(Token)match(input,INTCONST,FOLLOW_INTCONST_in_numExpr3672); 
					INTCONST65_tree = (Object)adaptor.create(INTCONST65);
					adaptor.addChild(root_0, INTCONST65_tree);

					}
					break;
				case 2 :
					// gfiles/X.g:65:23: FLOATCONST
					{
					root_0 = (Object)adaptor.nil();


					FLOATCONST66=(Token)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_numExpr3676); 
					FLOATCONST66_tree = (Object)adaptor.create(FLOATCONST66);
					adaptor.addChild(root_0, FLOATCONST66_tree);

					}
					break;
				case 3 :
					// gfiles/X.g:65:36: STRINGCONST
					{
					root_0 = (Object)adaptor.nil();


					STRINGCONST67=(Token)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_numExpr3680); 
					STRINGCONST67_tree = (Object)adaptor.create(STRINGCONST67);
					adaptor.addChild(root_0, STRINGCONST67_tree);

					}
					break;
				case 4 :
					// gfiles/X.g:65:50: ID
					{
					root_0 = (Object)adaptor.nil();


					ID68=(Token)match(input,ID,FOLLOW_ID_in_numExpr3684); 
					ID68_tree = (Object)adaptor.create(ID68);
					adaptor.addChild(root_0, ID68_tree);

					}
					break;
				case 5 :
					// gfiles/X.g:65:55: '(' numExpr ')'
					{
					char_literal69=(Token)match(input,18,FOLLOW_18_in_numExpr3688);  
					stream_18.add(char_literal69);

					pushFollow(FOLLOW_numExpr_in_numExpr3690);
					numExpr70=numExpr();
					state._fsp--;

					stream_numExpr.add(numExpr70.getTree());
					char_literal71=(Token)match(input,19,FOLLOW_19_in_numExpr3692);  
					stream_19.add(char_literal71);

					// AST REWRITE
					// elements: numExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 65:71: -> numExpr
					{
						adaptor.addChild(root_0, stream_numExpr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// gfiles/X.g:65:83: op= '-' number
					{
					op=(Token)match(input,22,FOLLOW_22_in_numExpr3701);  
					stream_22.add(op);

					pushFollow(FOLLOW_number_in_numExpr3703);
					number72=number();
					state._fsp--;

					stream_number.add(number72.getTree());
					// AST REWRITE
					// elements: number
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 65:97: -> ^( UMINUS[op, \"UMINUS\"] number )
					{
						// gfiles/X.g:65:100: ^( UMINUS[op, \"UMINUS\"] number )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UMINUS, op, "UMINUS"), root_1);
						adaptor.addChild(root_1, stream_number.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numExpr3"


	public static class number_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "number"
	// gfiles/X.g:66:1: number : ( INTCONST | FLOATCONST );
	public final XParser.number_return number() throws RecognitionException {
		XParser.number_return retval = new XParser.number_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set73=null;

		Object set73_tree=null;

		try {
			// gfiles/X.g:66:7: ( INTCONST | FLOATCONST )
			// gfiles/X.g:
			{
			root_0 = (Object)adaptor.nil();


			set73=input.LT(1);
			if ( input.LA(1)==FLOATCONST||input.LA(1)==INTCONST ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set73));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "number"

	// Delegated rules



	public static final BitSet FOLLOW_39_in_program307 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_program309 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_program311 = new BitSet(new long[]{0x0000014080000200L});
	public static final BitSet FOLLOW_declist_in_program313 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_program315 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_program317 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declist343 = new BitSet(new long[]{0x0000014000000202L});
	public static final BitSet FOLLOW_31_in_block353 = new BitSet(new long[]{0x0000081A80000200L});
	public static final BitSet FOLLOW_stmtlist_in_block355 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_block357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stmtWithSemi_in_stmtlist373 = new BitSet(new long[]{0x0000081880000202L});
	public static final BitSet FOLLOW_stmt_in_stmtWithSemi381 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_stmtWithSemi383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStmt_in_stmt395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condStmt_in_stmt399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStmt_in_stmt403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStmt_in_stmt407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stmt411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_declaration417 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_declaration420 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_declaration422 = new BitSet(new long[]{0x0000022400000000L});
	public static final BitSet FOLLOW_type_in_declaration424 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_declaration426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignStmt447 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_assignStmt449 = new BitSet(new long[]{0x0000000000444700L});
	public static final BitSet FOLLOW_numExpr_in_assignStmt451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_condStmt469 = new BitSet(new long[]{0x0000000000444700L});
	public static final BitSet FOLLOW_cond_in_condStmt472 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_condStmt474 = new BitSet(new long[]{0x0000081880000200L});
	public static final BitSet FOLLOW_stmt_in_condStmt477 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_condStmt488 = new BitSet(new long[]{0x0000081880000200L});
	public static final BitSet FOLLOW_stmt_in_condStmt491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_whileStmt500 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_whileStmt502 = new BitSet(new long[]{0x0000000000444700L});
	public static final BitSet FOLLOW_cond_in_whileStmt504 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_whileStmt506 = new BitSet(new long[]{0x0000081880000200L});
	public static final BitSet FOLLOW_stmt_in_whileStmt508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_forStmt525 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_forStmt527 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_assignStmt_in_forStmt529 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_forStmt531 = new BitSet(new long[]{0x0000000000444700L});
	public static final BitSet FOLLOW_cond_in_forStmt533 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_forStmt535 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_assignStmt_in_forStmt537 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_forStmt539 = new BitSet(new long[]{0x0000081880000200L});
	public static final BitSet FOLLOW_stmt_in_forStmt541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numExpr_in_cond564 = new BitSet(new long[]{0x0000000070000000L});
	public static final BitSet FOLLOW_comperator_in_cond566 = new BitSet(new long[]{0x0000000000444700L});
	public static final BitSet FOLLOW_numExpr_in_cond569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_modifier591 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_modifier593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_modifier597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_modifier601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numExpr2_in_numExpr626 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_21_in_numExpr630 = new BitSet(new long[]{0x0000000000444700L});
	public static final BitSet FOLLOW_22_in_numExpr635 = new BitSet(new long[]{0x0000000000444700L});
	public static final BitSet FOLLOW_numExpr2_in_numExpr639 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_numExpr3_in_numExpr2649 = new BitSet(new long[]{0x0000000001100002L});
	public static final BitSet FOLLOW_20_in_numExpr2653 = new BitSet(new long[]{0x0000000000444700L});
	public static final BitSet FOLLOW_24_in_numExpr2658 = new BitSet(new long[]{0x0000000000444700L});
	public static final BitSet FOLLOW_numExpr3_in_numExpr2662 = new BitSet(new long[]{0x0000000001100002L});
	public static final BitSet FOLLOW_INTCONST_in_numExpr3672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONST_in_numExpr3676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_numExpr3680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_numExpr3684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_numExpr3688 = new BitSet(new long[]{0x0000000000444700L});
	public static final BitSet FOLLOW_numExpr_in_numExpr3690 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_numExpr3692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_numExpr3701 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_number_in_numExpr3703 = new BitSet(new long[]{0x0000000000000002L});
}
