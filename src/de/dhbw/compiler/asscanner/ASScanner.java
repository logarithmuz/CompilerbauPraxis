/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 *
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner tabellengesteuert
 * - Scanner-Klasse
 *
 * **********************************************
 */

package de.dhbw.compiler.asscanner;

import java.io.Reader;

public class ASScanner {

  private final int ignore = -2;

  private Reader in = null;
  private StringBuffer text = new StringBuffer();

  public enum ASState {WS, LBR, RBR, NAME, Z, FRAC, FRAC_POINT, FRAC_HIGH, K, N, NU, NUL, NULL, EOF}

  private ASState state = ASState.WS;
  private int tokentype = Token.INVALID;

  public ASScanner(Reader input) {
    this.in = input;
  }

  public Token nextToken() throws Exception {

    Token token = null;

    while (token == null) {
      int c = in.read();
      switch (state) {
        case WS:
          switch (c) {
            case ' ':
            case '\t':
            case '\n':
            case '\r':
              token = step(ignore, ASState.WS, false, Token.INVALID);
              break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
              token = step(c, ASState.Z, false, Token.NUM);
              break;
            case '[':
              token = step(c, ASState.LBR, false, Token.LSBR);
              break;
            case ']':
              token = step(c, ASState.RBR, false, Token.RSBR);
              break;
            case ',':
              token = step(c, ASState.K, false, Token.COMMA);
              break;
            case 'n':
              token = step(c, ASState.N, false, Token.ID);
              break;
            case -1:
              token = step(ignore, ASState.EOF, false, Token.EOF);
            default:
              token = getLetterToken(c, false);
          }
          break;
        case Z:
          switch (c) {
            case ' ':
            case '\t':
            case '\n':
            case '\r':
              token = step(ignore, ASState.WS, true, Token.INVALID);
              break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
              token = step(c, ASState.Z, false, Token.NUM);
              break;
            case '.':
              token = step(c, ASState.FRAC, false, Token.FRAC);
              break;
            case '[':
              token = step(c, ASState.LBR, true, Token.LSBR);
              break;
            case ']':
              token = step(c, ASState.RBR, true, Token.RSBR);
              break;
            case ',':
              token = step(c, ASState.K, true, Token.COMMA);
              break;
            case -1:
              token = step(ignore, ASState.EOF, true, Token.EOF);
              break;
            default:
              token = getLetterToken(c, false);
              break;
          }
          break;
        case FRAC:
          switch (c) {
            case ' ':
            case '\t':
            case '\n':
            case '\r':
              token = step(ignore, ASState.WS, true, Token.INVALID);
              break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
              token = step(c, ASState.FRAC, false, Token.FRAC);
              break;
            case '[':
              token = step(c, ASState.LBR, true, Token.LSBR);
              break;
            case ']':
              token = step(c, ASState.RBR, true, Token.RSBR);
              break;
            case ',':
              token = step(c, ASState.K, true, Token.COMMA);
              break;
            case 'n':
              token = step(c, ASState.N, false, Token.ID);
              break;
            case '^':
              token = step(c, ASState.FRAC_POINT, false, Token.FRAC);
              break;
            case -1:
              token = step(ignore, ASState.EOF, true, Token.EOF);
              break;
            default:
              token = getLetterToken(c, true);
          }
          break;
        case FRAC_POINT: // '^' gelesen
          switch (c){
              case ' ':
              case '\t':
              case '\n':
              case '\r':
                token = step(ignore, ASState.WS, true, Token.INVALID);
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
              token = step(c, ASState.FRAC_HIGH, false, Token.FRAC);
              break;
            case '[':
              token = step(c, ASState.LBR, true, Token.LSBR);
              break;
            case ']':
              token = step(c, ASState.RBR, true, Token.RSBR);
              break;
            case ',':
              token = step(c, ASState.K, true, Token.COMMA);
              break;
            case 'n':
              token = step(c, ASState.N, false, Token.ID);
              break;
            case -1:
              token = step(ignore, ASState.EOF, true, Token.EOF);
              break;
            default:
              token = getLetterToken(c, true);
          }
          break;
        case FRAC_HIGH:
          switch (c) {
            case ' ':
            case '\t':
            case '\n':
            case '\r':
              token = step(ignore, ASState.WS, true, Token.INVALID);
              break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
              token = step(c, ASState.FRAC, false, Token.FRAC);
              break;
            case '[':
              token = step(c, ASState.LBR, true, Token.LSBR);
              break;
            case ']':
              token = step(c, ASState.RBR, true, Token.RSBR);
              break;
            case ',':
              token = step(c, ASState.K, true, Token.COMMA);
              break;
            case 'n':
              token = step(c, ASState.N, false, Token.ID);
              break;
            case -1:
              token = step(ignore, ASState.EOF, true, Token.EOF);
              break;
            default:
              token = getLetterToken(c, true);
          }
          break;
        case NAME:
        case NULL:
          switch (c) {
            case ' ':
            case '\t':
            case '\n':
            case '\r':
              token = step(ignore, ASState.WS, true, Token.INVALID);
              break;
            case '[':
              token = step(c, ASState.LBR, true, Token.LSBR);
              break;
            case ']':
              token = step(c, ASState.RBR, true, Token.RSBR);
              break;
            case ',':
              token = step(c, ASState.K, true, Token.COMMA);
              break;
            case -1:
              token = step(ignore, ASState.EOF, true, Token.EOF);
              break;
            default:
              token = getLetterToken(c, false);
          }
          break;
        case LBR:
        case RBR:
        case K:
          switch (c) {
            case ' ':
            case '\t':
            case '\n':
            case '\r':
              token = step(ignore, ASState.WS, true, Token.INVALID);
              break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
              token = step(c, ASState.Z, true, Token.NUM);
              break;
            case '[':
              token = step(c, ASState.LBR, true, Token.LSBR);
              break;
            case ']':
              token = step(c, ASState.RBR, true, Token.RSBR);
              break;
            case ',':
              token = step(c, ASState.K, true, Token.COMMA);
              break;
            case 'n':
              token = step(c, ASState.N, true, Token.ID);
              break;
            default:
              token = getLetterToken(c, true);
          }
          break;
        case N:
          switch (c) {
            case ' ':
            case '\t':
            case '\n':
            case '\r':
              token = step(ignore, ASState.WS, true, Token.INVALID);
              break;
            case '[':
              token = step(c, ASState.LBR, true, Token.LSBR);
              break;
            case ']':
              token = step(c, ASState.RBR, true, Token.RSBR);
              break;
            case ',':
              token = step(c, ASState.K, true, Token.COMMA);
              break;
            case 'u':
              token = step(c, ASState.NU, false, Token.ID);
              break;
            default:
              token = getLetterToken(c, false);
          }
          break;
        case NU:
          switch (c) {
            case ' ':
            case '\t':
            case '\n':
            case '\r':
              token = step(ignore, ASState.WS, true, Token.INVALID);
              break;
            case '[':
              token = step(c, ASState.LBR, true, Token.LSBR);
              break;
            case ']':
              token = step(c, ASState.RBR, true, Token.RSBR);
              break;
            case ',':
              token = step(c, ASState.K, true, Token.COMMA);
              break;
            case 'l':
              token = step(c, ASState.NUL, false, Token.ID);
              break;
            default:
              token = getLetterToken(c, false);
          }
          break;
        case NUL:
          switch (c) {
            case ' ':
            case '\t':
            case '\n':
            case '\r':
              token = step(ignore, ASState.WS, true, Token.INVALID);
              break;
            case '[':
              token = step(c, ASState.LBR, true, Token.LSBR);
              break;
            case ']':
              token = step(c, ASState.RBR, true, Token.RSBR);
              break;
            case ',':
              token = step(c, ASState.K, true, Token.COMMA);
              break;
            case 'l':
              token = step(c, ASState.NULL, false, Token.NULL);
              break;
            default:
              token = getLetterToken(c, false);
          }
          break;
        case EOF:
          token = step(ignore, ASState.EOF, true, Token.EOF);
          break;
        default:
          throw new Exception("Unexpected state: " + state);
      }
    }
    return token;
  }

  private Token getLetterToken(int c, boolean create) throws Exception {
    Token token;
    if (c == -1) {
      token = step(ignore, ASState.EOF, create, Token.EOF);
    } else if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
      token = step(c, ASState.NAME, create, Token.ID);
    } else {
      throw new Exception("Unexpected character: '" + (char) c + "' (" + c + ")");
    }
    return token;
  }

  private Token step(int c, ASState newState, boolean create, int newTokenType) {
    Token out = null;
    if (create) {
      out = new Token(tokentype, text.toString());
      text = new StringBuffer();
    }
    if (c != ignore) {
      text.append((char) c);
    }
    state = newState;
    tokentype = newTokenType;
    return out;
  }
}
