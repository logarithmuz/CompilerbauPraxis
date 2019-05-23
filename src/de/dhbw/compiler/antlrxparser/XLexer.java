// $ANTLR 3.5.2 gfiles/X.g 2019-05-23 18:48:27
package de.dhbw.compiler.antlrxparser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class XLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public XLexer() {} 
	public XLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public XLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "gfiles/X.g"; }

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:9:7: ( '(' )
			// gfiles/X.g:9:9: '('
			{
			match('('); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:10:7: ( ')' )
			// gfiles/X.g:10:9: ')'
			{
			match(')'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:11:7: ( '*' )
			// gfiles/X.g:11:9: '*'
			{
			match('*'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:12:7: ( '+' )
			// gfiles/X.g:12:9: '+'
			{
			match('+'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:13:7: ( '-' )
			// gfiles/X.g:13:9: '-'
			{
			match('-'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:14:7: ( '.' )
			// gfiles/X.g:14:9: '.'
			{
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:15:7: ( '/' )
			// gfiles/X.g:15:9: '/'
			{
			match('/'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:16:7: ( ':' )
			// gfiles/X.g:16:9: ':'
			{
			match(':'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:17:7: ( ':=' )
			// gfiles/X.g:17:9: ':='
			{
			match(":="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:18:7: ( ';' )
			// gfiles/X.g:18:9: ';'
			{
			match(';'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:19:7: ( '<' )
			// gfiles/X.g:19:9: '<'
			{
			match('<'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:20:7: ( '=' )
			// gfiles/X.g:20:9: '='
			{
			match('='); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:21:7: ( '>' )
			// gfiles/X.g:21:9: '>'
			{
			match('>'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:22:7: ( 'begin' )
			// gfiles/X.g:22:9: 'begin'
			{
			match("begin"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:23:7: ( 'else' )
			// gfiles/X.g:23:9: 'else'
			{
			match("else"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:24:7: ( 'end' )
			// gfiles/X.g:24:9: 'end'
			{
			match("end"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:25:7: ( 'float' )
			// gfiles/X.g:25:9: 'float'
			{
			match("float"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:26:7: ( 'for' )
			// gfiles/X.g:26:9: 'for'
			{
			match("for"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:27:7: ( 'if' )
			// gfiles/X.g:27:9: 'if'
			{
			match("if"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:28:7: ( 'int' )
			// gfiles/X.g:28:9: 'int'
			{
			match("int"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:29:7: ( 'print' )
			// gfiles/X.g:29:9: 'print'
			{
			match("print"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:30:7: ( 'program' )
			// gfiles/X.g:30:9: 'program'
			{
			match("program"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:31:7: ( 'read' )
			// gfiles/X.g:31:9: 'read'
			{
			match("read"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:32:7: ( 'string' )
			// gfiles/X.g:32:9: 'string'
			{
			match("string"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:33:7: ( 'then' )
			// gfiles/X.g:33:9: 'then'
			{
			match("then"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:34:7: ( 'while' )
			// gfiles/X.g:34:9: 'while'
			{
			match("while"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "DIGIT0"
	public final void mDIGIT0() throws RecognitionException {
		try {
			// gfiles/X.g:30:16: ( '0' .. '9' )
			// gfiles/X.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT0"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// gfiles/X.g:31:15: ( '1' .. '9' )
			// gfiles/X.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// gfiles/X.g:32:16: ( 'a' .. 'z' | 'A' .. 'Z' )
			// gfiles/X.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			// gfiles/X.g:33:16: ( '\\\\\"' | '.' | ':' | ' ' )
			int alt1=4;
			switch ( input.LA(1) ) {
			case '\\':
				{
				alt1=1;
				}
				break;
			case '.':
				{
				alt1=2;
				}
				break;
			case ':':
				{
				alt1=3;
				}
				break;
			case ' ':
				{
				alt1=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// gfiles/X.g:33:18: '\\\\\"'
					{
					match("\\\""); if (state.failed) return;

					}
					break;
				case 2 :
					// gfiles/X.g:33:26: '.'
					{
					match('.'); if (state.failed) return;
					}
					break;
				case 3 :
					// gfiles/X.g:33:32: ':'
					{
					match(':'); if (state.failed) return;
					}
					break;
				case 4 :
					// gfiles/X.g:33:38: ' '
					{
					match(' '); if (state.failed) return;
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:35:3: ( LETTER ( LETTER | DIGIT0 )* )
			// gfiles/X.g:35:8: LETTER ( LETTER | DIGIT0 )*
			{
			mLETTER(); if (state.failed) return;

			// gfiles/X.g:35:15: ( LETTER | DIGIT0 )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// gfiles/X.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INTCONST"
	public final void mINTCONST() throws RecognitionException {
		try {
			int _type = INTCONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:36:9: ( DIGIT ( DIGIT0 )* | '0' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
				alt4=1;
			}
			else if ( (LA4_0=='0') ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// gfiles/X.g:36:12: DIGIT ( DIGIT0 )*
					{
					mDIGIT(); if (state.failed) return;

					// gfiles/X.g:36:18: ( DIGIT0 )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// gfiles/X.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;
				case 2 :
					// gfiles/X.g:36:28: '0'
					{
					match('0'); if (state.failed) return;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTCONST"

	// $ANTLR start "FLOATCONST"
	public final void mFLOATCONST() throws RecognitionException {
		try {
			int _type = FLOATCONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:37:11: ( ( INTCONST ( '.' ( DIGIT0 )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )=> INTCONST ( '.' ( DIGIT0 )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST | INTCONST ( '.' ( DIGIT0 )* )? )
			int alt10=2;
			alt10 = dfa10.predict(input);
			switch (alt10) {
				case 1 :
					// gfiles/X.g:37:14: ( INTCONST ( '.' ( DIGIT0 )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )=> INTCONST ( '.' ( DIGIT0 )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST
					{
					mINTCONST(); if (state.failed) return;

					// gfiles/X.g:37:83: ( '.' ( DIGIT0 )* )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='.') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// gfiles/X.g:37:84: '.' ( DIGIT0 )*
							{
							match('.'); if (state.failed) return;
							// gfiles/X.g:37:88: ( DIGIT0 )*
							loop5:
							while (true) {
								int alt5=2;
								int LA5_0 = input.LA(1);
								if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
									alt5=1;
								}

								switch (alt5) {
								case 1 :
									// gfiles/X.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop5;
								}
							}

							}
							break;

					}

					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// gfiles/X.g:37:107: ( '+' | '-' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='+'||LA7_0=='-') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// gfiles/X.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					mINTCONST(); if (state.failed) return;

					}
					break;
				case 2 :
					// gfiles/X.g:37:133: INTCONST ( '.' ( DIGIT0 )* )?
					{
					mINTCONST(); if (state.failed) return;

					// gfiles/X.g:37:142: ( '.' ( DIGIT0 )* )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='.') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// gfiles/X.g:37:143: '.' ( DIGIT0 )*
							{
							match('.'); if (state.failed) return;
							// gfiles/X.g:37:147: ( DIGIT0 )*
							loop8:
							while (true) {
								int alt8=2;
								int LA8_0 = input.LA(1);
								if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
									alt8=1;
								}

								switch (alt8) {
								case 1 :
									// gfiles/X.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop8;
								}
							}

							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATCONST"

	// $ANTLR start "STRINGCONST"
	public final void mSTRINGCONST() throws RecognitionException {
		try {
			int _type = STRINGCONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:38:12: ( '\\\"' ( LETTER | SYMBOL )* '\\\"' )
			// gfiles/X.g:38:14: '\\\"' ( LETTER | SYMBOL )* '\\\"'
			{
			match('\"'); if (state.failed) return;
			// gfiles/X.g:38:19: ( LETTER | SYMBOL )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= 'A' && LA11_0 <= 'Z')||(LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
					alt11=1;
				}
				else if ( (LA11_0==' '||LA11_0=='.'||LA11_0==':'||LA11_0=='\\') ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// gfiles/X.g:38:21: LETTER
					{
					mLETTER(); if (state.failed) return;

					}
					break;
				case 2 :
					// gfiles/X.g:38:30: SYMBOL
					{
					mSYMBOL(); if (state.failed) return;

					}
					break;

				default :
					break loop11;
				}
			}

			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGCONST"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:39:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+ )
			// gfiles/X.g:39:9: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
			{
			// gfiles/X.g:39:9: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||(LA12_0 >= '\f' && LA12_0 <= '\r')||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// gfiles/X.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			if ( state.backtracking==0 ) {skip();}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "INVALID"
	public final void mINVALID() throws RecognitionException {
		try {
			int _type = INVALID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// gfiles/X.g:40:8: ( . )
			// gfiles/X.g:40:13: .
			{
			matchAny(); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INVALID"

	@Override
	public void mTokens() throws RecognitionException {
		// gfiles/X.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | ID | INTCONST | FLOATCONST | STRINGCONST | WS | INVALID )
		int alt13=32;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// gfiles/X.g:1:10: T__18
				{
				mT__18(); if (state.failed) return;

				}
				break;
			case 2 :
				// gfiles/X.g:1:16: T__19
				{
				mT__19(); if (state.failed) return;

				}
				break;
			case 3 :
				// gfiles/X.g:1:22: T__20
				{
				mT__20(); if (state.failed) return;

				}
				break;
			case 4 :
				// gfiles/X.g:1:28: T__21
				{
				mT__21(); if (state.failed) return;

				}
				break;
			case 5 :
				// gfiles/X.g:1:34: T__22
				{
				mT__22(); if (state.failed) return;

				}
				break;
			case 6 :
				// gfiles/X.g:1:40: T__23
				{
				mT__23(); if (state.failed) return;

				}
				break;
			case 7 :
				// gfiles/X.g:1:46: T__24
				{
				mT__24(); if (state.failed) return;

				}
				break;
			case 8 :
				// gfiles/X.g:1:52: T__25
				{
				mT__25(); if (state.failed) return;

				}
				break;
			case 9 :
				// gfiles/X.g:1:58: T__26
				{
				mT__26(); if (state.failed) return;

				}
				break;
			case 10 :
				// gfiles/X.g:1:64: T__27
				{
				mT__27(); if (state.failed) return;

				}
				break;
			case 11 :
				// gfiles/X.g:1:70: T__28
				{
				mT__28(); if (state.failed) return;

				}
				break;
			case 12 :
				// gfiles/X.g:1:76: T__29
				{
				mT__29(); if (state.failed) return;

				}
				break;
			case 13 :
				// gfiles/X.g:1:82: T__30
				{
				mT__30(); if (state.failed) return;

				}
				break;
			case 14 :
				// gfiles/X.g:1:88: T__31
				{
				mT__31(); if (state.failed) return;

				}
				break;
			case 15 :
				// gfiles/X.g:1:94: T__32
				{
				mT__32(); if (state.failed) return;

				}
				break;
			case 16 :
				// gfiles/X.g:1:100: T__33
				{
				mT__33(); if (state.failed) return;

				}
				break;
			case 17 :
				// gfiles/X.g:1:106: T__34
				{
				mT__34(); if (state.failed) return;

				}
				break;
			case 18 :
				// gfiles/X.g:1:112: T__35
				{
				mT__35(); if (state.failed) return;

				}
				break;
			case 19 :
				// gfiles/X.g:1:118: T__36
				{
				mT__36(); if (state.failed) return;

				}
				break;
			case 20 :
				// gfiles/X.g:1:124: T__37
				{
				mT__37(); if (state.failed) return;

				}
				break;
			case 21 :
				// gfiles/X.g:1:130: T__38
				{
				mT__38(); if (state.failed) return;

				}
				break;
			case 22 :
				// gfiles/X.g:1:136: T__39
				{
				mT__39(); if (state.failed) return;

				}
				break;
			case 23 :
				// gfiles/X.g:1:142: T__40
				{
				mT__40(); if (state.failed) return;

				}
				break;
			case 24 :
				// gfiles/X.g:1:148: T__41
				{
				mT__41(); if (state.failed) return;

				}
				break;
			case 25 :
				// gfiles/X.g:1:154: T__42
				{
				mT__42(); if (state.failed) return;

				}
				break;
			case 26 :
				// gfiles/X.g:1:160: T__43
				{
				mT__43(); if (state.failed) return;

				}
				break;
			case 27 :
				// gfiles/X.g:1:166: ID
				{
				mID(); if (state.failed) return;

				}
				break;
			case 28 :
				// gfiles/X.g:1:169: INTCONST
				{
				mINTCONST(); if (state.failed) return;

				}
				break;
			case 29 :
				// gfiles/X.g:1:178: FLOATCONST
				{
				mFLOATCONST(); if (state.failed) return;

				}
				break;
			case 30 :
				// gfiles/X.g:1:189: STRINGCONST
				{
				mSTRINGCONST(); if (state.failed) return;

				}
				break;
			case 31 :
				// gfiles/X.g:1:201: WS
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 32 :
				// gfiles/X.g:1:204: INVALID
				{
				mINVALID(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_X
	public final void synpred1_X_fragment() throws RecognitionException {
		// gfiles/X.g:37:14: ( INTCONST ( '.' ( DIGIT0 )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )
		// gfiles/X.g:37:15: INTCONST ( '.' ( DIGIT0 )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST
		{
		mINTCONST(); if (state.failed) return;

		// gfiles/X.g:37:24: ( '.' ( DIGIT0 )* )?
		int alt15=2;
		int LA15_0 = input.LA(1);
		if ( (LA15_0=='.') ) {
			alt15=1;
		}
		switch (alt15) {
			case 1 :
				// gfiles/X.g:37:25: '.' ( DIGIT0 )*
				{
				match('.'); if (state.failed) return;
				// gfiles/X.g:37:29: ( DIGIT0 )*
				loop14:
				while (true) {
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
						alt14=1;
					}

					switch (alt14) {
					case 1 :
						// gfiles/X.g:
						{
						if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
							input.consume();
							state.failed=false;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return;}
							MismatchedSetException mse = new MismatchedSetException(null,input);
							recover(mse);
							throw mse;
						}
						}
						break;

					default :
						break loop14;
					}
				}

				}
				break;

		}

		if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
			input.consume();
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			recover(mse);
			throw mse;
		}
		// gfiles/X.g:37:48: ( '+' | '-' )?
		int alt16=2;
		int LA16_0 = input.LA(1);
		if ( (LA16_0=='+'||LA16_0=='-') ) {
			alt16=1;
		}
		switch (alt16) {
			case 1 :
				// gfiles/X.g:
				{
				if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
					input.consume();
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					recover(mse);
					throw mse;
				}
				}
				break;

		}

		mINTCONST(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_X

	public final boolean synpred1_X() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_X_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA10 dfa10 = new DFA10(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA10_eotS =
		"\1\uffff\2\3\1\uffff\2\3\1\uffff\1\3";
	static final String DFA10_eofS =
		"\10\uffff";
	static final String DFA10_minS =
		"\1\60\2\56\1\uffff\1\56\1\60\1\uffff\1\60";
	static final String DFA10_maxS =
		"\1\71\2\145\1\uffff\2\145\1\uffff\1\145";
	static final String DFA10_acceptS =
		"\3\uffff\1\2\2\uffff\1\1\1\uffff";
	static final String DFA10_specialS =
		"\1\uffff\1\4\1\3\1\uffff\1\0\1\1\1\uffff\1\2}>";
	static final String[] DFA10_transitionS = {
			"\1\2\11\1",
			"\1\5\1\uffff\12\4\13\uffff\1\6\37\uffff\1\6",
			"\1\5\26\uffff\1\6\37\uffff\1\6",
			"",
			"\1\5\1\uffff\12\4\13\uffff\1\6\37\uffff\1\6",
			"\12\7\13\uffff\1\6\37\uffff\1\6",
			"",
			"\12\7\13\uffff\1\6\37\uffff\1\6"
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "37:1: FLOATCONST : ( ( INTCONST ( '.' ( DIGIT0 )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )=> INTCONST ( '.' ( DIGIT0 )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST | INTCONST ( '.' ( DIGIT0 )* )? );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA10_4 = input.LA(1);
						 
						int index10_4 = input.index();
						input.rewind();
						s = -1;
						if ( (LA10_4=='.') ) {s = 5;}
						else if ( (LA10_4=='E'||LA10_4=='e') && (synpred1_X())) {s = 6;}
						else if ( ((LA10_4 >= '0' && LA10_4 <= '9')) ) {s = 4;}
						else s = 3;
						 
						input.seek(index10_4);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA10_5 = input.LA(1);
						 
						int index10_5 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA10_5 >= '0' && LA10_5 <= '9')) ) {s = 7;}
						else if ( (LA10_5=='E'||LA10_5=='e') && (synpred1_X())) {s = 6;}
						else s = 3;
						 
						input.seek(index10_5);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA10_7 = input.LA(1);
						 
						int index10_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA10_7=='E'||LA10_7=='e') && (synpred1_X())) {s = 6;}
						else if ( ((LA10_7 >= '0' && LA10_7 <= '9')) ) {s = 7;}
						else s = 3;
						 
						input.seek(index10_7);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA10_2 = input.LA(1);
						 
						int index10_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA10_2=='.') ) {s = 5;}
						else if ( (LA10_2=='E'||LA10_2=='e') && (synpred1_X())) {s = 6;}
						else s = 3;
						 
						input.seek(index10_2);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA10_1 = input.LA(1);
						 
						int index10_1 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA10_1 >= '0' && LA10_1 <= '9')) ) {s = 4;}
						else if ( (LA10_1=='.') ) {s = 5;}
						else if ( (LA10_1=='E'||LA10_1=='e') && (synpred1_X())) {s = 6;}
						else s = 3;
						 
						input.seek(index10_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 10, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA13_eotS =
		"\10\uffff\1\44\4\uffff\11\52\1\uffff\2\66\1\33\17\uffff\1\52\1\uffff\4"+
		"\52\1\100\6\52\1\uffff\1\66\3\uffff\2\52\1\112\1\52\1\114\1\uffff\1\115"+
		"\7\52\1\125\1\uffff\1\52\2\uffff\2\52\1\131\1\52\1\133\1\52\1\135\1\uffff"+
		"\1\136\1\137\1\52\1\uffff\1\52\1\uffff\1\142\3\uffff\1\52\1\144\1\uffff"+
		"\1\145\2\uffff";
	static final String DFA13_eofS =
		"\146\uffff";
	static final String DFA13_minS =
		"\1\0\7\uffff\1\75\4\uffff\1\145\2\154\1\146\1\162\1\145\1\164\2\150\1"+
		"\uffff\2\56\1\40\17\uffff\1\147\1\uffff\1\163\1\144\1\157\1\162\1\60\1"+
		"\164\1\151\1\141\1\162\1\145\1\151\1\uffff\1\56\3\uffff\1\151\1\145\1"+
		"\60\1\141\1\60\1\uffff\1\60\1\156\1\147\1\144\1\151\1\156\1\154\1\156"+
		"\1\60\1\uffff\1\164\2\uffff\1\164\1\162\1\60\1\156\1\60\1\145\1\60\1\uffff"+
		"\2\60\1\141\1\uffff\1\147\1\uffff\1\60\3\uffff\1\155\1\60\1\uffff\1\60"+
		"\2\uffff";
	static final String DFA13_maxS =
		"\1\uffff\7\uffff\1\75\4\uffff\1\145\1\156\1\157\1\156\1\162\1\145\1\164"+
		"\2\150\1\uffff\2\145\1\172\17\uffff\1\147\1\uffff\1\163\1\144\1\157\1"+
		"\162\1\172\1\164\1\157\1\141\1\162\1\145\1\151\1\uffff\1\145\3\uffff\1"+
		"\151\1\145\1\172\1\141\1\172\1\uffff\1\172\1\156\1\147\1\144\1\151\1\156"+
		"\1\154\1\156\1\172\1\uffff\1\164\2\uffff\1\164\1\162\1\172\1\156\1\172"+
		"\1\145\1\172\1\uffff\2\172\1\141\1\uffff\1\147\1\uffff\1\172\3\uffff\1"+
		"\155\1\172\1\uffff\1\172\2\uffff";
	static final String DFA13_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14\1\15\11\uffff"+
		"\1\33\3\uffff\1\37\1\40\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\10\1\12\1\13"+
		"\1\14\1\15\1\uffff\1\33\13\uffff\1\34\1\uffff\1\35\1\36\1\37\5\uffff\1"+
		"\23\11\uffff\1\20\1\uffff\1\22\1\24\7\uffff\1\17\3\uffff\1\27\1\uffff"+
		"\1\31\1\uffff\1\16\1\21\1\25\2\uffff\1\32\1\uffff\1\30\1\26";
	static final String DFA13_specialS =
		"\1\0\145\uffff}>";
	static final String[] DFA13_transitionS = {
			"\11\33\2\32\1\33\2\32\22\33\1\32\1\33\1\31\5\33\1\1\1\2\1\3\1\4\1\33"+
			"\1\5\1\6\1\7\1\30\11\27\1\10\1\11\1\12\1\13\1\14\2\33\32\26\6\33\1\26"+
			"\1\15\2\26\1\16\1\17\2\26\1\20\6\26\1\21\1\26\1\22\1\23\1\24\2\26\1\25"+
			"\3\26\uff85\33",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\43",
			"",
			"",
			"",
			"",
			"\1\51",
			"\1\53\1\uffff\1\54",
			"\1\55\2\uffff\1\56",
			"\1\57\7\uffff\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"",
			"\1\70\1\uffff\12\67\13\uffff\1\70\37\uffff\1\70",
			"\1\70\26\uffff\1\70\37\uffff\1\70",
			"\1\71\1\uffff\1\71\13\uffff\1\71\13\uffff\1\71\6\uffff\32\71\1\uffff"+
			"\1\71\4\uffff\32\71",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\73",
			"",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"\1\101",
			"\1\102\5\uffff\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"",
			"\1\70\1\uffff\12\67\13\uffff\1\70\37\uffff\1\70",
			"",
			"",
			"",
			"\1\110",
			"\1\111",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"\1\113",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"",
			"\1\126",
			"",
			"",
			"\1\127",
			"\1\130",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"\1\132",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"\1\134",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"\1\140",
			"",
			"\1\141",
			"",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"",
			"",
			"",
			"\1\143",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"",
			"\12\52\7\uffff\32\52\6\uffff\32\52",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | ID | INTCONST | FLOATCONST | STRINGCONST | WS | INVALID );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_0 = input.LA(1);
						s = -1;
						if ( (LA13_0=='(') ) {s = 1;}
						else if ( (LA13_0==')') ) {s = 2;}
						else if ( (LA13_0=='*') ) {s = 3;}
						else if ( (LA13_0=='+') ) {s = 4;}
						else if ( (LA13_0=='-') ) {s = 5;}
						else if ( (LA13_0=='.') ) {s = 6;}
						else if ( (LA13_0=='/') ) {s = 7;}
						else if ( (LA13_0==':') ) {s = 8;}
						else if ( (LA13_0==';') ) {s = 9;}
						else if ( (LA13_0=='<') ) {s = 10;}
						else if ( (LA13_0=='=') ) {s = 11;}
						else if ( (LA13_0=='>') ) {s = 12;}
						else if ( (LA13_0=='b') ) {s = 13;}
						else if ( (LA13_0=='e') ) {s = 14;}
						else if ( (LA13_0=='f') ) {s = 15;}
						else if ( (LA13_0=='i') ) {s = 16;}
						else if ( (LA13_0=='p') ) {s = 17;}
						else if ( (LA13_0=='r') ) {s = 18;}
						else if ( (LA13_0=='s') ) {s = 19;}
						else if ( (LA13_0=='t') ) {s = 20;}
						else if ( (LA13_0=='w') ) {s = 21;}
						else if ( ((LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='a'||(LA13_0 >= 'c' && LA13_0 <= 'd')||(LA13_0 >= 'g' && LA13_0 <= 'h')||(LA13_0 >= 'j' && LA13_0 <= 'o')||LA13_0=='q'||(LA13_0 >= 'u' && LA13_0 <= 'v')||(LA13_0 >= 'x' && LA13_0 <= 'z')) ) {s = 22;}
						else if ( ((LA13_0 >= '1' && LA13_0 <= '9')) ) {s = 23;}
						else if ( (LA13_0=='0') ) {s = 24;}
						else if ( (LA13_0=='\"') ) {s = 25;}
						else if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||(LA13_0 >= '\f' && LA13_0 <= '\r')||LA13_0==' ') ) {s = 26;}
						else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\b')||LA13_0=='\u000B'||(LA13_0 >= '\u000E' && LA13_0 <= '\u001F')||LA13_0=='!'||(LA13_0 >= '#' && LA13_0 <= '\'')||LA13_0==','||(LA13_0 >= '?' && LA13_0 <= '@')||(LA13_0 >= '[' && LA13_0 <= '`')||(LA13_0 >= '{' && LA13_0 <= '\uFFFF')) ) {s = 27;}
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
