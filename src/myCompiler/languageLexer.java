// $ANTLR 3.4 C:\\Antlr\\LatexBlockDiagrams\\src\\language.g 2015-01-06 09:03:09

package myCompiler;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class languageLexer extends Lexer {
	public static final int EOF = -1;
	public static final int A = 4;
	public static final int ABOVE = 5;
	public static final int ABOVE_OF = 6;
	public static final int AMP = 7;
	public static final int APICS = 8;
	public static final int ASTERISK = 9;
	public static final int AT = 10;
	public static final int B = 11;
	public static final int BACK_SLASH = 12;
	public static final int BELOW = 13;
	public static final int BELOW_OF = 14;
	public static final int C = 15;
	public static final int CLOSE_GRAPH = 16;
	public static final int CLOSE_P = 17;
	public static final int CLOSE_SB = 18;
	public static final int COL = 19;
	public static final int COMMA = 20;
	public static final int D = 21;
	public static final int DOT = 22;
	public static final int DOUBLE_QUOTE = 23;
	public static final int DRAW_ARROW = 24;
	public static final int DRAW_BLOCK = 25;
	public static final int DRAW_CURVED_ARROW = 26;
	public static final int DRAW_END = 27;
	public static final int DRAW_NODE = 28;
	public static final int DRAW_START = 29;
	public static final int E = 30;
	public static final int EQ = 31;
	public static final int F = 32;
	public static final int G = 33;
	public static final int GREATER_EQ = 34;
	public static final int GREATER_THAN = 35;
	public static final int H = 36;
	public static final int I = 37;
	public static final int J = 38;
	public static final int K = 39;
	public static final int L = 40;
	public static final int LABEL = 41;
	public static final int LABEL_NODE = 42;
	public static final int LEFT = 43;
	public static final int LEFT_OF = 44;
	public static final int LESS_EQ = 45;
	public static final int LESS_THAN = 46;
	public static final int LETTER = 47;
	public static final int M = 48;
	public static final int MINUS = 49;
	public static final int N = 50;
	public static final int NAME = 51;
	public static final int NOT_EQ = 52;
	public static final int NUM_FLOAT = 53;
	public static final int NUM_INT = 54;
	public static final int O = 55;
	public static final int OPEN_GRAPH = 56;
	public static final int OPEN_P = 57;
	public static final int OPEN_SB = 58;
	public static final int OVER = 59;
	public static final int P = 60;
	public static final int PERCENT = 61;
	public static final int PLUS = 62;
	public static final int Q = 63;
	public static final int QUEST = 64;
	public static final int R = 65;
	public static final int RIGHT = 66;
	public static final int RIGHT_OF = 67;
	public static final int S = 68;
	public static final int SCAN_ERROR = 69;
	public static final int SEMICOL = 70;
	public static final int SINGLE_QUOTE = 71;
	public static final int SLASH = 72;
	public static final int T = 73;
	public static final int U = 74;
	public static final int UNDER = 75;
	public static final int UNDERSCORE = 76;
	public static final int V = 77;
	public static final int VERT_BAR = 78;
	public static final int W = 79;
	public static final int WS = 80;
	public static final int X = 81;
	public static final int Y = 82;
	public static final int Z = 83;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public languageLexer() {
	}

	public languageLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public languageLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public String getGrammarFileName() {
		return "C:\\Antlr\\LatexBlockDiagrams\\src\\language.g";
	}

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:257:12: ( 'A' |
			// 'a' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'A' || input.LA(1) == 'a') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "A"

	// $ANTLR start "B"
	public final void mB() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:258:12: ( 'B' |
			// 'b' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'B' || input.LA(1) == 'b') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "B"

	// $ANTLR start "C"
	public final void mC() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:259:12: ( 'C' |
			// 'c' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'C' || input.LA(1) == 'c') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "C"

	// $ANTLR start "D"
	public final void mD() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:260:12: ( 'D' |
			// 'd' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'D' || input.LA(1) == 'd') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "D"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:261:12: ( 'E' |
			// 'e' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'E' || input.LA(1) == 'e') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:262:12: ( 'F' |
			// 'f' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'F' || input.LA(1) == 'f') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "F"

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:263:12: ( 'G' |
			// 'g' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'G' || input.LA(1) == 'g') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "G"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:264:12: ( 'H' |
			// 'h' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'H' || input.LA(1) == 'h') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "H"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:265:12: ( 'I' |
			// 'i' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'I' || input.LA(1) == 'i') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "I"

	// $ANTLR start "J"
	public final void mJ() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:266:12: ( 'J' |
			// 'j' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'J' || input.LA(1) == 'j') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "J"

	// $ANTLR start "K"
	public final void mK() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:267:12: ( 'K' |
			// 'k' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'K' || input.LA(1) == 'k') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "K"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:268:12: ( 'L' |
			// 'l' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'L' || input.LA(1) == 'l') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "L"

	// $ANTLR start "M"
	public final void mM() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:269:12: ( 'M' |
			// 'm' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'M' || input.LA(1) == 'm') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "M"

	// $ANTLR start "N"
	public final void mN() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:270:12: ( 'N' |
			// 'n' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'N' || input.LA(1) == 'n') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "N"

	// $ANTLR start "O"
	public final void mO() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:271:12: ( 'O' |
			// 'o' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'O' || input.LA(1) == 'o') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "O"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:272:12: ( 'P' |
			// 'p' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'P' || input.LA(1) == 'p') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "P"

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:273:12: ( 'Q' |
			// 'q' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'Q' || input.LA(1) == 'q') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "Q"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:274:12: ( 'R' |
			// 'r' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'R' || input.LA(1) == 'r') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "R"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:275:12: ( 'S' |
			// 's' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'S' || input.LA(1) == 's') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:276:12: ( 'T' |
			// 't' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'T' || input.LA(1) == 't') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "T"

	// $ANTLR start "U"
	public final void mU() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:277:12: ( 'U' |
			// 'u' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'U' || input.LA(1) == 'u') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "U"

	// $ANTLR start "V"
	public final void mV() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:278:12: ( 'V' |
			// 'v' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'V' || input.LA(1) == 'v') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "V"

	// $ANTLR start "W"
	public final void mW() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:279:12: ( 'W' |
			// 'w' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'W' || input.LA(1) == 'w') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "W"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:280:12: ( 'X' |
			// 'x' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'X' || input.LA(1) == 'x') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:281:12: ( 'Y' |
			// 'y' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'Y' || input.LA(1) == 'y') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:282:12: ( 'Z' |
			// 'z' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if (input.LA(1) == 'Z' || input.LA(1) == 'z') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "Z"

	// $ANTLR start "LABEL_NODE"
	public final void mLABEL_NODE() throws RecognitionException {
		try {
			int _type = LABEL_NODE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:451:11: ( (
			// DOUBLE_QUOTE ( PLUS | MINUS | QUEST | ' ' ) DOUBLE_QUOTE ) )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:452:11: (
			// DOUBLE_QUOTE ( PLUS | MINUS | QUEST | ' ' ) DOUBLE_QUOTE )
			{
				// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:452:11: (
				// DOUBLE_QUOTE ( PLUS | MINUS | QUEST | ' ' ) DOUBLE_QUOTE )
				// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:452:12:
				// DOUBLE_QUOTE ( PLUS | MINUS | QUEST | ' ' ) DOUBLE_QUOTE
				{
					mDOUBLE_QUOTE();

					if (input.LA(1) == ' ' || input.LA(1) == '+'
							|| input.LA(1) == '-' || input.LA(1) == '?') {
						input.consume();
					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, input);
						recover(mse);
						throw mse;
					}

					mDOUBLE_QUOTE();

				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LABEL_NODE"

	// $ANTLR start "DRAW_START"
	public final void mDRAW_START() throws RecognitionException {
		try {
			int _type = DRAW_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:611:11: ( D R A W
			// UNDERSCORE S T A R T )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:611:13: D R A W
			// UNDERSCORE S T A R T
			{
				mD();

				mR();

				mA();

				mW();

				mUNDERSCORE();

				mS();

				mT();

				mA();

				mR();

				mT();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DRAW_START"

	// $ANTLR start "DRAW_BLOCK"
	public final void mDRAW_BLOCK() throws RecognitionException {
		try {
			int _type = DRAW_BLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:615:11: ( D R A W
			// UNDERSCORE B L O C K )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:615:13: D R A W
			// UNDERSCORE B L O C K
			{
				mD();

				mR();

				mA();

				mW();

				mUNDERSCORE();

				mB();

				mL();

				mO();

				mC();

				mK();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DRAW_BLOCK"

	// $ANTLR start "DRAW_ARROW"
	public final void mDRAW_ARROW() throws RecognitionException {
		try {
			int _type = DRAW_ARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:619:11: ( D R A W
			// UNDERSCORE A R R O W )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:619:13: D R A W
			// UNDERSCORE A R R O W
			{
				mD();

				mR();

				mA();

				mW();

				mUNDERSCORE();

				mA();

				mR();

				mR();

				mO();

				mW();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DRAW_ARROW"

	// $ANTLR start "DRAW_CURVED_ARROW"
	public final void mDRAW_CURVED_ARROW() throws RecognitionException {
		try {
			int _type = DRAW_CURVED_ARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:623:18: ( D R A W
			// UNDERSCORE C U R V E D UNDERSCORE A R R O W )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:623:21: D R A W
			// UNDERSCORE C U R V E D UNDERSCORE A R R O W
			{
				mD();

				mR();

				mA();

				mW();

				mUNDERSCORE();

				mC();

				mU();

				mR();

				mV();

				mE();

				mD();

				mUNDERSCORE();

				mA();

				mR();

				mR();

				mO();

				mW();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DRAW_CURVED_ARROW"

	// $ANTLR start "DRAW_END"
	public final void mDRAW_END() throws RecognitionException {
		try {
			int _type = DRAW_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:627:9: ( D R A W
			// UNDERSCORE E N D )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:627:12: D R A W
			// UNDERSCORE E N D
			{
				mD();

				mR();

				mA();

				mW();

				mUNDERSCORE();

				mE();

				mN();

				mD();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DRAW_END"

	// $ANTLR start "DRAW_NODE"
	public final void mDRAW_NODE() throws RecognitionException {
		try {
			int _type = DRAW_NODE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:631:10: ( D R A W
			// UNDERSCORE N O D E )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:631:13: D R A W
			// UNDERSCORE N O D E
			{
				mD();

				mR();

				mA();

				mW();

				mUNDERSCORE();

				mN();

				mO();

				mD();

				mE();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DRAW_NODE"

	// $ANTLR start "LEFT_OF"
	public final void mLEFT_OF() throws RecognitionException {
		try {
			int _type = LEFT_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:635:8: ( L E F T
			// UNDERSCORE O F )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:635:10: L E F T
			// UNDERSCORE O F
			{
				mL();

				mE();

				mF();

				mT();

				mUNDERSCORE();

				mO();

				mF();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LEFT_OF"

	// $ANTLR start "RIGHT_OF"
	public final void mRIGHT_OF() throws RecognitionException {
		try {
			int _type = RIGHT_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:639:9: ( R I G H T
			// UNDERSCORE O F )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:639:11: R I G H T
			// UNDERSCORE O F
			{
				mR();

				mI();

				mG();

				mH();

				mT();

				mUNDERSCORE();

				mO();

				mF();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "RIGHT_OF"

	// $ANTLR start "ABOVE_OF"
	public final void mABOVE_OF() throws RecognitionException {
		try {
			int _type = ABOVE_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:643:9: ( A B O V E
			// UNDERSCORE O F )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:643:11: A B O V E
			// UNDERSCORE O F
			{
				mA();

				mB();

				mO();

				mV();

				mE();

				mUNDERSCORE();

				mO();

				mF();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "ABOVE_OF"

	// $ANTLR start "BELOW_OF"
	public final void mBELOW_OF() throws RecognitionException {
		try {
			int _type = BELOW_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:647:9: ( B E L O W
			// UNDERSCORE O F )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:647:11: B E L O W
			// UNDERSCORE O F
			{
				mB();

				mE();

				mL();

				mO();

				mW();

				mUNDERSCORE();

				mO();

				mF();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "BELOW_OF"

	// $ANTLR start "LEFT"
	public final void mLEFT() throws RecognitionException {
		try {
			int _type = LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:651:5: ( L E F T )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:651:7: L E F T
			{
				mL();

				mE();

				mF();

				mT();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LEFT"

	// $ANTLR start "RIGHT"
	public final void mRIGHT() throws RecognitionException {
		try {
			int _type = RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:655:6: ( R I G H T
			// )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:655:8: R I G H T
			{
				mR();

				mI();

				mG();

				mH();

				mT();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "RIGHT"

	// $ANTLR start "ABOVE"
	public final void mABOVE() throws RecognitionException {
		try {
			int _type = ABOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:659:6: ( A B O V E
			// )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:659:8: A B O V E
			{
				mA();

				mB();

				mO();

				mV();

				mE();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "ABOVE"

	// $ANTLR start "BELOW"
	public final void mBELOW() throws RecognitionException {
		try {
			int _type = BELOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:663:6: ( B E L O W
			// )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:663:8: B E L O W
			{
				mB();

				mE();

				mL();

				mO();

				mW();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "BELOW"

	// $ANTLR start "OVER"
	public final void mOVER() throws RecognitionException {
		try {
			int _type = OVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:667:5: ( O V E R )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:667:7: O V E R
			{
				mO();

				mV();

				mE();

				mR();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "OVER"

	// $ANTLR start "UNDER"
	public final void mUNDER() throws RecognitionException {
		try {
			int _type = UNDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:671:6: ( U N D E R
			// )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:671:8: U N D E R
			{
				mU();

				mN();

				mD();

				mE();

				mR();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "UNDER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:676:16: ( ( 'a' ..
			// 'z' | 'A' .. 'Z' ) )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LETTER"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:684:14: ( '@' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:684:16: '@'
			{
				match('@');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "AT"

	// $ANTLR start "DOUBLE_QUOTE"
	public final void mDOUBLE_QUOTE() throws RecognitionException {
		try {
			int _type = DOUBLE_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:685:14: ( '\"' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:685:16: '\"'
			{
				match('\"');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DOUBLE_QUOTE"

	// $ANTLR start "PERCENT"
	public final void mPERCENT() throws RecognitionException {
		try {
			int _type = PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:686:14: ( '%' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:686:16: '%'
			{
				match('%');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "PERCENT"

	// $ANTLR start "AMP"
	public final void mAMP() throws RecognitionException {
		try {
			int _type = AMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:687:14: ( '&' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:687:16: '&'
			{
				match('&');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "AMP"

	// $ANTLR start "SINGLE_QUOTE"
	public final void mSINGLE_QUOTE() throws RecognitionException {
		try {
			int _type = SINGLE_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:688:14: ( '\\'' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:688:16: '\\''
			{
				match('\'');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SINGLE_QUOTE"

	// $ANTLR start "OPEN_P"
	public final void mOPEN_P() throws RecognitionException {
		try {
			int _type = OPEN_P;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:689:14: ( '(' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:689:16: '('
			{
				match('(');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "OPEN_P"

	// $ANTLR start "CLOSE_P"
	public final void mCLOSE_P() throws RecognitionException {
		try {
			int _type = CLOSE_P;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:690:14: ( ')' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:690:16: ')'
			{
				match(')');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "CLOSE_P"

	// $ANTLR start "OPEN_SB"
	public final void mOPEN_SB() throws RecognitionException {
		try {
			int _type = OPEN_SB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:691:14: ( '[' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:691:16: '['
			{
				match('[');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "OPEN_SB"

	// $ANTLR start "OPEN_GRAPH"
	public final void mOPEN_GRAPH() throws RecognitionException {
		try {
			int _type = OPEN_GRAPH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:692:14: ( '{' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:692:16: '{'
			{
				match('{');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "OPEN_GRAPH"

	// $ANTLR start "CLOSE_GRAPH"
	public final void mCLOSE_GRAPH() throws RecognitionException {
		try {
			int _type = CLOSE_GRAPH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:693:14: ( '}' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:693:16: '}'
			{
				match('}');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "CLOSE_GRAPH"

	// $ANTLR start "CLOSE_SB"
	public final void mCLOSE_SB() throws RecognitionException {
		try {
			int _type = CLOSE_SB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:694:14: ( ']' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:694:16: ']'
			{
				match(']');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "CLOSE_SB"

	// $ANTLR start "ASTERISK"
	public final void mASTERISK() throws RecognitionException {
		try {
			int _type = ASTERISK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:695:14: ( '*' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:695:16: '*'
			{
				match('*');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "ASTERISK"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:696:14: ( '+' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:696:16: '+'
			{
				match('+');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:697:14: ( '-' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:697:16: '-'
			{
				match('-');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "MINUS"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:698:14: ( '.' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:698:16: '.'
			{
				match('.');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DOT"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:699:14: ( ',' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:699:16: ','
			{
				match(',');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "COMMA"

	// $ANTLR start "COL"
	public final void mCOL() throws RecognitionException {
		try {
			int _type = COL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:700:14: ( ':' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:700:16: ':'
			{
				match(':');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "COL"

	// $ANTLR start "SEMICOL"
	public final void mSEMICOL() throws RecognitionException {
		try {
			int _type = SEMICOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:701:14: ( ';' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:701:16: ';'
			{
				match(';');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SEMICOL"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:702:14: ( '/' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:702:16: '/'
			{
				match('/');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SLASH"

	// $ANTLR start "BACK_SLASH"
	public final void mBACK_SLASH() throws RecognitionException {
		try {
			int _type = BACK_SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:703:14: ( '\\\\' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:703:16: '\\\\'
			{
				match('\\');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "BACK_SLASH"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:704:14: ( '=' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:704:16: '='
			{
				match('=');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "EQ"

	// $ANTLR start "NOT_EQ"
	public final void mNOT_EQ() throws RecognitionException {
		try {
			int _type = NOT_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:705:14: ( '<>' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:705:16: '<>'
			{
				match("<>");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "NOT_EQ"

	// $ANTLR start "LESS_THAN"
	public final void mLESS_THAN() throws RecognitionException {
		try {
			int _type = LESS_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:706:14: ( '<' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:706:16: '<'
			{
				match('<');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LESS_THAN"

	// $ANTLR start "GREATER_THAN"
	public final void mGREATER_THAN() throws RecognitionException {
		try {
			int _type = GREATER_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:707:14: ( '>' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:707:16: '>'
			{
				match('>');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "GREATER_THAN"

	// $ANTLR start "LESS_EQ"
	public final void mLESS_EQ() throws RecognitionException {
		try {
			int _type = LESS_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:708:14: ( '<=' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:708:16: '<='
			{
				match("<=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LESS_EQ"

	// $ANTLR start "GREATER_EQ"
	public final void mGREATER_EQ() throws RecognitionException {
		try {
			int _type = GREATER_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:709:14: ( '>=' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:709:16: '>='
			{
				match(">=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "GREATER_EQ"

	// $ANTLR start "QUEST"
	public final void mQUEST() throws RecognitionException {
		try {
			int _type = QUEST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:710:14: ( '?' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:710:16: '?'
			{
				match('?');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "QUEST"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			int _type = UNDERSCORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:711:14: ( '_' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:711:16: '_'
			{
				match('_');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "UNDERSCORE"

	// $ANTLR start "VERT_BAR"
	public final void mVERT_BAR() throws RecognitionException {
		try {
			int _type = VERT_BAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:712:14: ( '|' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:712:16: '|'
			{
				match('|');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "VERT_BAR"

	// $ANTLR start "APICS"
	public final void mAPICS() throws RecognitionException {
		try {
			int _type = APICS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:713:14: ( '^' )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:713:16: '^'
			{
				match('^');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "APICS"

	// $ANTLR start "NUM_INT"
	public final void mNUM_INT() throws RecognitionException {
		try {
			int _type = NUM_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:718:8: ( '0' | ( (
			// '1' .. '9' ) ( '0' .. '9' )* ) )
			int alt2 = 2;
			int LA2_0 = input.LA(1);

			if ((LA2_0 == '0')) {
				alt2 = 1;
			} else if (((LA2_0 >= '1' && LA2_0 <= '9'))) {
				alt2 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 2, 0,
						input);

				throw nvae;

			}
			switch (alt2) {
			case 1:
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:718:10: '0'
			{
				match('0');

			}
				break;
			case 2:
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:719:11: ( ( '1' ..
			// '9' ) ( '0' .. '9' )* )
			{
				// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:719:11: ( (
				// '1' .. '9' ) ( '0' .. '9' )* )
				// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:719:12: ( '1'
				// .. '9' ) ( '0' .. '9' )*
				{
					if ((input.LA(1) >= '1' && input.LA(1) <= '9')) {
						input.consume();
					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, input);
						recover(mse);
						throw mse;
					}

					// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:719:22: (
					// '0' .. '9' )*
					loop1: do {
						int alt1 = 2;
						int LA1_0 = input.LA(1);

						if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
							alt1 = 1;
						}

						switch (alt1) {
						case 1:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:
						{
							if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
								input.consume();
							} else {
								MismatchedSetException mse = new MismatchedSetException(
										null, input);
								recover(mse);
								throw mse;
							}

						}
							break;

						default:
							break loop1;
						}
					} while (true);

				}

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "NUM_INT"

	// $ANTLR start "NUM_FLOAT"
	public final void mNUM_FLOAT() throws RecognitionException {
		try {
			int _type = NUM_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:722:11: ( NUM_INT
			// | ( NUM_INT DOT ( NUM_INT )+ ) | ( DOT ( NUM_INT )+ ) )
			int alt5 = 3;
			alt5 = dfa5.predict(input);
			switch (alt5) {
			case 1:
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:722:13: NUM_INT
			{
				mNUM_INT();

			}
				break;
			case 2:
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:723:14: ( NUM_INT
			// DOT ( NUM_INT )+ )
			{
				// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:723:14: (
				// NUM_INT DOT ( NUM_INT )+ )
				// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:723:15:
				// NUM_INT DOT ( NUM_INT )+
				{
					mNUM_INT();

					mDOT();

					// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:723:27: (
					// NUM_INT )+
					int cnt3 = 0;
					loop3: do {
						int alt3 = 2;
						int LA3_0 = input.LA(1);

						if (((LA3_0 >= '0' && LA3_0 <= '9'))) {
							alt3 = 1;
						}

						switch (alt3) {
						case 1:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:723:27:
						// NUM_INT
						{
							mNUM_INT();

						}
							break;

						default:
							if (cnt3 >= 1)
								break loop3;
							EarlyExitException eee = new EarlyExitException(3,
									input);
							throw eee;
						}
						cnt3++;
					} while (true);

				}

			}
				break;
			case 3:
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:724:14: ( DOT (
			// NUM_INT )+ )
			{
				// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:724:14: ( DOT
				// ( NUM_INT )+ )
				// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:724:16: DOT (
				// NUM_INT )+
				{
					mDOT();

					// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:724:20: (
					// NUM_INT )+
					int cnt4 = 0;
					loop4: do {
						int alt4 = 2;
						int LA4_0 = input.LA(1);

						if (((LA4_0 >= '0' && LA4_0 <= '9'))) {
							alt4 = 1;
						}

						switch (alt4) {
						case 1:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:724:20:
						// NUM_INT
						{
							mNUM_INT();

						}
							break;

						default:
							if (cnt4 >= 1)
								break loop4;
							EarlyExitException eee = new EarlyExitException(4,
									input);
							throw eee;
						}
						cnt4++;
					} while (true);

				}

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "NUM_FLOAT"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:729:5: ( LETTER (
			// LETTER | NUM_INT | UNDERSCORE )* )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:730:7: LETTER (
			// LETTER | NUM_INT | UNDERSCORE )*
			{
				mLETTER();

				// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:731:7: (
				// LETTER | NUM_INT | UNDERSCORE )*
				loop6: do {
					int alt6 = 4;
					switch (input.LA(1)) {
					case 'A':
					case 'B':
					case 'C':
					case 'D':
					case 'E':
					case 'F':
					case 'G':
					case 'H':
					case 'I':
					case 'J':
					case 'K':
					case 'L':
					case 'M':
					case 'N':
					case 'O':
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
					case 'T':
					case 'U':
					case 'V':
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
					case 'a':
					case 'b':
					case 'c':
					case 'd':
					case 'e':
					case 'f':
					case 'g':
					case 'h':
					case 'i':
					case 'j':
					case 'k':
					case 'l':
					case 'm':
					case 'n':
					case 'o':
					case 'p':
					case 'q':
					case 'r':
					case 's':
					case 't':
					case 'u':
					case 'v':
					case 'w':
					case 'x':
					case 'y':
					case 'z': {
						alt6 = 1;
					}
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
					case '9': {
						alt6 = 2;
					}
						break;
					case '_': {
						alt6 = 3;
					}
						break;

					}

					switch (alt6) {
					case 1:
					// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:731:8:
					// LETTER
					{
						mLETTER();

					}
						break;
					case 2:
					// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:732:9:
					// NUM_INT
					{
						mNUM_INT();

					}
						break;
					case 3:
					// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:733:9:
					// UNDERSCORE
					{
						mUNDERSCORE();

					}
						break;

					default:
						break loop6;
					}
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "NAME"

	// $ANTLR start "LABEL"
	public final void mLABEL() throws RecognitionException {
		try {
			int _type = LABEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:739:6: ( (
			// DOUBLE_QUOTE ( LETTER | NUM_INT | UNDERSCORE | OPEN_SB | OPEN_P |
			// CLOSE_P | CLOSE_SB | APICS | ASTERISK | SLASH | MINUS | PLUS |
			// OPEN_GRAPH | CLOSE_GRAPH | ' ' )+ DOUBLE_QUOTE ) )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:740:7: (
			// DOUBLE_QUOTE ( LETTER | NUM_INT | UNDERSCORE | OPEN_SB | OPEN_P |
			// CLOSE_P | CLOSE_SB | APICS | ASTERISK | SLASH | MINUS | PLUS |
			// OPEN_GRAPH | CLOSE_GRAPH | ' ' )+ DOUBLE_QUOTE )
			{
				// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:740:7: (
				// DOUBLE_QUOTE ( LETTER | NUM_INT | UNDERSCORE | OPEN_SB |
				// OPEN_P | CLOSE_P | CLOSE_SB | APICS | ASTERISK | SLASH |
				// MINUS | PLUS | OPEN_GRAPH | CLOSE_GRAPH | ' ' )+ DOUBLE_QUOTE
				// )
				// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:740:9:
				// DOUBLE_QUOTE ( LETTER | NUM_INT | UNDERSCORE | OPEN_SB |
				// OPEN_P | CLOSE_P | CLOSE_SB | APICS | ASTERISK | SLASH |
				// MINUS | PLUS | OPEN_GRAPH | CLOSE_GRAPH | ' ' )+ DOUBLE_QUOTE
				{
					mDOUBLE_QUOTE();

					// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:741:7: (
					// LETTER | NUM_INT | UNDERSCORE | OPEN_SB | OPEN_P |
					// CLOSE_P | CLOSE_SB | APICS | ASTERISK | SLASH | MINUS |
					// PLUS | OPEN_GRAPH | CLOSE_GRAPH | ' ' )+
					int cnt7 = 0;
					loop7: do {
						int alt7 = 16;
						switch (input.LA(1)) {
						case 'A':
						case 'B':
						case 'C':
						case 'D':
						case 'E':
						case 'F':
						case 'G':
						case 'H':
						case 'I':
						case 'J':
						case 'K':
						case 'L':
						case 'M':
						case 'N':
						case 'O':
						case 'P':
						case 'Q':
						case 'R':
						case 'S':
						case 'T':
						case 'U':
						case 'V':
						case 'W':
						case 'X':
						case 'Y':
						case 'Z':
						case 'a':
						case 'b':
						case 'c':
						case 'd':
						case 'e':
						case 'f':
						case 'g':
						case 'h':
						case 'i':
						case 'j':
						case 'k':
						case 'l':
						case 'm':
						case 'n':
						case 'o':
						case 'p':
						case 'q':
						case 'r':
						case 's':
						case 't':
						case 'u':
						case 'v':
						case 'w':
						case 'x':
						case 'y':
						case 'z': {
							alt7 = 1;
						}
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
						case '9': {
							alt7 = 2;
						}
							break;
						case '_': {
							alt7 = 3;
						}
							break;
						case '[': {
							alt7 = 4;
						}
							break;
						case '(': {
							alt7 = 5;
						}
							break;
						case ')': {
							alt7 = 6;
						}
							break;
						case ']': {
							alt7 = 7;
						}
							break;
						case '^': {
							alt7 = 8;
						}
							break;
						case '*': {
							alt7 = 9;
						}
							break;
						case '/': {
							alt7 = 10;
						}
							break;
						case '-': {
							alt7 = 11;
						}
							break;
						case '+': {
							alt7 = 12;
						}
							break;
						case '{': {
							alt7 = 13;
						}
							break;
						case '}': {
							alt7 = 14;
						}
							break;
						case ' ': {
							alt7 = 15;
						}
							break;

						}

						switch (alt7) {
						case 1:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:741:9:
						// LETTER
						{
							mLETTER();

						}
							break;
						case 2:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:742:9:
						// NUM_INT
						{
							mNUM_INT();

						}
							break;
						case 3:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:743:9:
						// UNDERSCORE
						{
							mUNDERSCORE();

						}
							break;
						case 4:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:744:9:
						// OPEN_SB
						{
							mOPEN_SB();

						}
							break;
						case 5:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:745:9:
						// OPEN_P
						{
							mOPEN_P();

						}
							break;
						case 6:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:746:9:
						// CLOSE_P
						{
							mCLOSE_P();

						}
							break;
						case 7:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:747:9:
						// CLOSE_SB
						{
							mCLOSE_SB();

						}
							break;
						case 8:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:748:9:
						// APICS
						{
							mAPICS();

						}
							break;
						case 9:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:749:9:
						// ASTERISK
						{
							mASTERISK();

						}
							break;
						case 10:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:750:9:
						// SLASH
						{
							mSLASH();

						}
							break;
						case 11:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:751:9:
						// MINUS
						{
							mMINUS();

						}
							break;
						case 12:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:752:9:
						// PLUS
						{
							mPLUS();

						}
							break;
						case 13:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:753:9:
						// OPEN_GRAPH
						{
							mOPEN_GRAPH();

						}
							break;
						case 14:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:754:9:
						// CLOSE_GRAPH
						{
							mCLOSE_GRAPH();

						}
							break;
						case 15:
						// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:755:9:
						// ' '
						{
							match(' ');

						}
							break;

						default:
							if (cnt7 >= 1)
								break loop7;
							EarlyExitException eee = new EarlyExitException(7,
									input);
							throw eee;
						}
						cnt7++;
					} while (true);

					mDOUBLE_QUOTE();

				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LABEL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:767:5: ( ( ' ' |
			// '\\t' | '\\r' | '\\n' ) )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:767:7: ( ' ' |
			// '\\t' | '\\r' | '\\n' )
			{
				if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
						|| input.LA(1) == '\r' || input.LA(1) == ' ') {
					input.consume();
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

				_channel = HIDDEN;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "WS"

	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:776:3: ( . )
			// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:776:5: .
			{
				matchAny();

				System.out
						.println("\r Trovato Errore: carattere non identificato \r");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SCAN_ERROR"

	public void mTokens() throws RecognitionException {
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:8: ( LABEL_NODE |
		// DRAW_START | DRAW_BLOCK | DRAW_ARROW | DRAW_CURVED_ARROW | DRAW_END |
		// DRAW_NODE | LEFT_OF | RIGHT_OF | ABOVE_OF | BELOW_OF | LEFT | RIGHT |
		// ABOVE | BELOW | OVER | UNDER | AT | DOUBLE_QUOTE | PERCENT | AMP |
		// SINGLE_QUOTE | OPEN_P | CLOSE_P | OPEN_SB | OPEN_GRAPH | CLOSE_GRAPH
		// | CLOSE_SB | ASTERISK | PLUS | MINUS | DOT | COMMA | COL | SEMICOL |
		// SLASH | BACK_SLASH | EQ | NOT_EQ | LESS_THAN | GREATER_THAN | LESS_EQ
		// | GREATER_EQ | QUEST | UNDERSCORE | VERT_BAR | APICS | NUM_INT |
		// NUM_FLOAT | NAME | LABEL | WS | SCAN_ERROR )
		int alt8 = 53;
		alt8 = dfa8.predict(input);
		switch (alt8) {
		case 1:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:10: LABEL_NODE
		{
			mLABEL_NODE();

		}
			break;
		case 2:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:21: DRAW_START
		{
			mDRAW_START();

		}
			break;
		case 3:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:32: DRAW_BLOCK
		{
			mDRAW_BLOCK();

		}
			break;
		case 4:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:43: DRAW_ARROW
		{
			mDRAW_ARROW();

		}
			break;
		case 5:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:54:
		// DRAW_CURVED_ARROW
		{
			mDRAW_CURVED_ARROW();

		}
			break;
		case 6:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:72: DRAW_END
		{
			mDRAW_END();

		}
			break;
		case 7:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:81: DRAW_NODE
		{
			mDRAW_NODE();

		}
			break;
		case 8:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:91: LEFT_OF
		{
			mLEFT_OF();

		}
			break;
		case 9:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:99: RIGHT_OF
		{
			mRIGHT_OF();

		}
			break;
		case 10:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:108: ABOVE_OF
		{
			mABOVE_OF();

		}
			break;
		case 11:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:117: BELOW_OF
		{
			mBELOW_OF();

		}
			break;
		case 12:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:126: LEFT
		{
			mLEFT();

		}
			break;
		case 13:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:131: RIGHT
		{
			mRIGHT();

		}
			break;
		case 14:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:137: ABOVE
		{
			mABOVE();

		}
			break;
		case 15:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:143: BELOW
		{
			mBELOW();

		}
			break;
		case 16:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:149: OVER
		{
			mOVER();

		}
			break;
		case 17:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:154: UNDER
		{
			mUNDER();

		}
			break;
		case 18:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:160: AT
		{
			mAT();

		}
			break;
		case 19:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:163: DOUBLE_QUOTE
		{
			mDOUBLE_QUOTE();

		}
			break;
		case 20:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:176: PERCENT
		{
			mPERCENT();

		}
			break;
		case 21:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:184: AMP
		{
			mAMP();

		}
			break;
		case 22:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:188: SINGLE_QUOTE
		{
			mSINGLE_QUOTE();

		}
			break;
		case 23:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:201: OPEN_P
		{
			mOPEN_P();

		}
			break;
		case 24:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:208: CLOSE_P
		{
			mCLOSE_P();

		}
			break;
		case 25:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:216: OPEN_SB
		{
			mOPEN_SB();

		}
			break;
		case 26:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:224: OPEN_GRAPH
		{
			mOPEN_GRAPH();

		}
			break;
		case 27:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:235: CLOSE_GRAPH
		{
			mCLOSE_GRAPH();

		}
			break;
		case 28:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:247: CLOSE_SB
		{
			mCLOSE_SB();

		}
			break;
		case 29:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:256: ASTERISK
		{
			mASTERISK();

		}
			break;
		case 30:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:265: PLUS
		{
			mPLUS();

		}
			break;
		case 31:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:270: MINUS
		{
			mMINUS();

		}
			break;
		case 32:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:276: DOT
		{
			mDOT();

		}
			break;
		case 33:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:280: COMMA
		{
			mCOMMA();

		}
			break;
		case 34:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:286: COL
		{
			mCOL();

		}
			break;
		case 35:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:290: SEMICOL
		{
			mSEMICOL();

		}
			break;
		case 36:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:298: SLASH
		{
			mSLASH();

		}
			break;
		case 37:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:304: BACK_SLASH
		{
			mBACK_SLASH();

		}
			break;
		case 38:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:315: EQ
		{
			mEQ();

		}
			break;
		case 39:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:318: NOT_EQ
		{
			mNOT_EQ();

		}
			break;
		case 40:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:325: LESS_THAN
		{
			mLESS_THAN();

		}
			break;
		case 41:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:335: GREATER_THAN
		{
			mGREATER_THAN();

		}
			break;
		case 42:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:348: LESS_EQ
		{
			mLESS_EQ();

		}
			break;
		case 43:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:356: GREATER_EQ
		{
			mGREATER_EQ();

		}
			break;
		case 44:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:367: QUEST
		{
			mQUEST();

		}
			break;
		case 45:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:373: UNDERSCORE
		{
			mUNDERSCORE();

		}
			break;
		case 46:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:384: VERT_BAR
		{
			mVERT_BAR();

		}
			break;
		case 47:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:393: APICS
		{
			mAPICS();

		}
			break;
		case 48:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:399: NUM_INT
		{
			mNUM_INT();

		}
			break;
		case 49:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:407: NUM_FLOAT
		{
			mNUM_FLOAT();

		}
			break;
		case 50:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:417: NAME
		{
			mNAME();

		}
			break;
		case 51:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:422: LABEL
		{
			mLABEL();

		}
			break;
		case 52:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:428: WS
		{
			mWS();

		}
			break;
		case 53:
		// C:\\Antlr\\LatexBlockDiagrams\\src\\language.g:1:431: SCAN_ERROR
		{
			mSCAN_ERROR();

		}
			break;

		}

	}

	protected DFA5 dfa5 = new DFA5(this);
	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA5_eotS = "\1\uffff\2\4\3\uffff\1\4";
	static final String DFA5_eofS = "\7\uffff";
	static final String DFA5_minS = "\3\56\3\uffff\1\56";
	static final String DFA5_maxS = "\1\71\1\56\1\71\3\uffff\1\71";
	static final String DFA5_acceptS = "\3\uffff\1\3\1\1\1\2\1\uffff";
	static final String DFA5_specialS = "\7\uffff}>";
	static final String[] DFA5_transitionS = { "\1\3\1\uffff\1\1\11\2", "\1\5",
			"\1\5\1\uffff\12\6", "", "", "", "\1\5\1\uffff\12\6" };

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}

		public String getDescription() {
			return "722:1: NUM_FLOAT : ( NUM_INT | ( NUM_INT DOT ( NUM_INT )+ ) | ( DOT ( NUM_INT )+ ) );";
		}
	}

	static final String DFA8_eotS = "\1\uffff\1\50\7\56\15\uffff\1\103\6\uffff\1\115\1\117\4\uffff\2"
			+ "\124\12\uffff\7\56\37\uffff\1\124\2\uffff\10\56\1\147\3\56\1\154"
			+ "\2\56\1\uffff\1\56\1\165\1\167\1\171\1\uffff\1\173\7\56\1\uffff"
			+ "\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\6\56\1\u008c\7\56\1\u0094"
			+ "\1\56\1\uffff\1\u0096\1\u0097\1\u0098\4\56\1\uffff\1\u009d\3\uffff"
			+ "\1\u009e\1\u009f\1\u00a0\1\56\4\uffff\6\56\1\u00a8\1\uffff";
	static final String DFA8_eofS = "\u00a9\uffff";
	static final String DFA8_minS = "\1\0\1\40\1\122\1\105\1\111\1\102\1\105\1\126\1\116\15\uffff\1\60"
			+ "\6\uffff\2\75\4\uffff\2\56\4\uffff\1\40\1\uffff\2\40\2\uffff\1\101"
			+ "\1\106\1\107\1\117\1\114\1\105\1\104\37\uffff\1\56\2\uffff\1\127"
			+ "\1\124\1\110\1\126\1\117\1\122\1\105\1\137\1\60\1\124\1\105\1\127"
			+ "\1\60\1\122\1\101\1\uffff\1\117\3\60\1\uffff\1\60\1\124\1\114\1"
			+ "\122\1\125\1\116\1\117\1\106\1\uffff\1\117\1\uffff\1\117\1\uffff"
			+ "\1\117\1\uffff\1\101\1\117\2\122\2\104\1\60\3\106\1\122\1\103\1"
			+ "\117\1\126\1\60\1\105\1\uffff\3\60\1\124\1\113\1\127\1\105\1\uffff"
			+ "\1\60\3\uffff\3\60\1\104\4\uffff\1\137\1\101\2\122\1\117\1\127\1"
			+ "\60\1\uffff";
	static final String DFA8_maxS = "\1\uffff\1\175\1\162\1\145\1\151\1\142\1\145\1\166\1\156\15\uffff"
			+ "\1\71\6\uffff\1\76\1\75\4\uffff\1\56\1\71\4\uffff\1\175\1\uffff"
			+ "\2\175\2\uffff\1\141\1\146\1\147\1\157\1\154\1\145\1\144\37\uffff"
			+ "\1\71\2\uffff\1\167\1\164\1\150\1\166\1\157\1\162\1\145\1\137\1"
			+ "\172\1\164\1\145\1\167\1\172\1\162\1\163\1\uffff\1\157\3\172\1\uffff"
			+ "\1\172\1\164\1\154\1\162\1\165\1\156\1\157\1\146\1\uffff\1\157\1"
			+ "\uffff\1\157\1\uffff\1\157\1\uffff\1\141\1\157\2\162\2\144\1\172"
			+ "\3\146\1\162\1\143\1\157\1\166\1\172\1\145\1\uffff\3\172\1\164\1"
			+ "\153\1\167\1\145\1\uffff\1\172\3\uffff\3\172\1\144\4\uffff\1\137"
			+ "\1\141\2\162\1\157\1\167\1\172\1\uffff";
	static final String DFA8_acceptS = "\11\uffff\1\22\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"
			+ "\1\36\1\37\1\uffff\1\41\1\42\1\43\1\44\1\45\1\46\2\uffff\1\54\1"
			+ "\55\1\56\1\57\2\uffff\1\62\1\64\1\65\1\23\1\uffff\1\63\2\uffff\1"
			+ "\1\1\62\7\uffff\1\22\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"
			+ "\1\35\1\36\1\37\1\40\1\61\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\52"
			+ "\1\50\1\53\1\51\1\54\1\55\1\56\1\57\1\60\1\uffff\1\64\1\1\17\uffff"
			+ "\1\14\4\uffff\1\20\10\uffff\1\15\1\uffff\1\16\1\uffff\1\17\1\uffff"
			+ "\1\21\20\uffff\1\10\7\uffff\1\6\1\uffff\1\11\1\12\1\13\4\uffff\1"
			+ "\7\1\2\1\3\1\4\7\uffff\1\5";
	static final String DFA8_specialS = "\1\0\u00a8\uffff}>";
	static final String[] DFA8_transitionS = {
			"\11\47\2\46\2\47\1\46\22\47\1\46\1\47\1\1\2\47\1\12\1\13\1\14"
					+ "\1\15\1\16\1\23\1\24\1\27\1\25\1\26\1\32\1\43\11\44\1\30\1\31"
					+ "\1\35\1\34\1\36\1\37\1\11\1\5\1\6\1\45\1\2\7\45\1\3\2\45\1\7"
					+ "\2\45\1\4\2\45\1\10\5\45\1\17\1\33\1\22\1\42\1\40\1\47\1\5\1"
					+ "\6\1\45\1\2\7\45\1\3\2\45\1\7\2\45\1\4\2\45\1\10\5\45\1\20\1"
					+ "\41\1\21\uff82\47",
			"\1\54\7\uffff\3\52\1\53\1\uffff\1\51\1\uffff\13\52\5\uffff"
					+ "\1\55\1\uffff\33\52\1\uffff\3\52\1\uffff\33\52\1\uffff\1\52",
			"\1\57\37\uffff\1\57",
			"\1\60\37\uffff\1\60",
			"\1\61\37\uffff\1\61",
			"\1\62\37\uffff\1\62",
			"\1\63\37\uffff\1\63",
			"\1\64\37\uffff\1\64",
			"\1\65\37\uffff\1\65",
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
			"\12\104",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\114\1\113",
			"\1\116",
			"",
			"",
			"",
			"",
			"\1\104",
			"\1\104\1\uffff\12\125",
			"",
			"",
			"",
			"",
			"\1\52\1\uffff\1\127\5\uffff\4\52\1\uffff\1\52\1\uffff\13\52"
					+ "\7\uffff\33\52\1\uffff\3\52\1\uffff\33\52\1\uffff\1\52",
			"",
			"\1\52\1\uffff\1\127\5\uffff\4\52\1\uffff\1\52\1\uffff\13\52"
					+ "\7\uffff\33\52\1\uffff\3\52\1\uffff\33\52\1\uffff\1\52",
			"\1\52\1\uffff\1\127\5\uffff\4\52\1\uffff\1\52\1\uffff\13\52"
					+ "\7\uffff\33\52\1\uffff\3\52\1\uffff\33\52\1\uffff\1\52",
			"",
			"",
			"\1\130\37\uffff\1\130",
			"\1\131\37\uffff\1\131",
			"\1\132\37\uffff\1\132",
			"\1\133\37\uffff\1\133",
			"\1\134\37\uffff\1\134",
			"\1\135\37\uffff\1\135",
			"\1\136\37\uffff\1\136",
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
			"",
			"\1\104\1\uffff\12\125",
			"",
			"",
			"\1\137\37\uffff\1\137",
			"\1\140\37\uffff\1\140",
			"\1\141\37\uffff\1\141",
			"\1\142\37\uffff\1\142",
			"\1\143\37\uffff\1\143",
			"\1\144\37\uffff\1\144",
			"\1\145\37\uffff\1\145",
			"\1\146",
			"\12\56\7\uffff\32\56\4\uffff\1\150\1\uffff\32\56",
			"\1\151\37\uffff\1\151",
			"\1\152\37\uffff\1\152",
			"\1\153\37\uffff\1\153",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\155\37\uffff\1\155",
			"\1\160\1\157\1\161\1\uffff\1\162\10\uffff\1\163\4\uffff\1\156"
					+ "\15\uffff\1\160\1\157\1\161\1\uffff\1\162\10\uffff\1\163\4\uffff"
					+ "\1\156", "", "\1\164\37\uffff\1\164",
			"\12\56\7\uffff\32\56\4\uffff\1\166\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\170\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\172\1\uffff\32\56", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\174\37\uffff\1\174", "\1\175\37\uffff\1\175",
			"\1\176\37\uffff\1\176", "\1\177\37\uffff\1\177",
			"\1\u0080\37\uffff\1\u0080", "\1\u0081\37\uffff\1\u0081",
			"\1\u0082\37\uffff\1\u0082", "", "\1\u0083\37\uffff\1\u0083", "",
			"\1\u0084\37\uffff\1\u0084", "", "\1\u0085\37\uffff\1\u0085", "",
			"\1\u0086\37\uffff\1\u0086", "\1\u0087\37\uffff\1\u0087",
			"\1\u0088\37\uffff\1\u0088", "\1\u0089\37\uffff\1\u0089",
			"\1\u008a\37\uffff\1\u008a", "\1\u008b\37\uffff\1\u008b",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u008d\37\uffff\1\u008d", "\1\u008e\37\uffff\1\u008e",
			"\1\u008f\37\uffff\1\u008f", "\1\u0090\37\uffff\1\u0090",
			"\1\u0091\37\uffff\1\u0091", "\1\u0092\37\uffff\1\u0092",
			"\1\u0093\37\uffff\1\u0093",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0095\37\uffff\1\u0095", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u0099\37\uffff\1\u0099", "\1\u009a\37\uffff\1\u009a",
			"\1\u009b\37\uffff\1\u009b", "\1\u009c\37\uffff\1\u009c", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "", "", "",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\u00a1\37\uffff\1\u00a1", "", "", "", "", "\1\u00a2",
			"\1\u00a3\37\uffff\1\u00a3", "\1\u00a4\37\uffff\1\u00a4",
			"\1\u00a5\37\uffff\1\u00a5", "\1\u00a6\37\uffff\1\u00a6",
			"\1\u00a7\37\uffff\1\u00a7",
			"\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56", "" };

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}

		public String getDescription() {
			return "1:1: Tokens : ( LABEL_NODE | DRAW_START | DRAW_BLOCK | DRAW_ARROW | DRAW_CURVED_ARROW | DRAW_END | DRAW_NODE | LEFT_OF | RIGHT_OF | ABOVE_OF | BELOW_OF | LEFT | RIGHT | ABOVE | BELOW | OVER | UNDER | AT | DOUBLE_QUOTE | PERCENT | AMP | SINGLE_QUOTE | OPEN_P | CLOSE_P | OPEN_SB | OPEN_GRAPH | CLOSE_GRAPH | CLOSE_SB | ASTERISK | PLUS | MINUS | DOT | COMMA | COL | SEMICOL | SLASH | BACK_SLASH | EQ | NOT_EQ | LESS_THAN | GREATER_THAN | LESS_EQ | GREATER_EQ | QUEST | UNDERSCORE | VERT_BAR | APICS | NUM_INT | NUM_FLOAT | NAME | LABEL | WS | SCAN_ERROR );";
		}

		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA8_0 = input.LA(1);

				s = -1;
				if ((LA8_0 == '\"')) {
					s = 1;
				}

				else if ((LA8_0 == 'D' || LA8_0 == 'd')) {
					s = 2;
				}

				else if ((LA8_0 == 'L' || LA8_0 == 'l')) {
					s = 3;
				}

				else if ((LA8_0 == 'R' || LA8_0 == 'r')) {
					s = 4;
				}

				else if ((LA8_0 == 'A' || LA8_0 == 'a')) {
					s = 5;
				}

				else if ((LA8_0 == 'B' || LA8_0 == 'b')) {
					s = 6;
				}

				else if ((LA8_0 == 'O' || LA8_0 == 'o')) {
					s = 7;
				}

				else if ((LA8_0 == 'U' || LA8_0 == 'u')) {
					s = 8;
				}

				else if ((LA8_0 == '@')) {
					s = 9;
				}

				else if ((LA8_0 == '%')) {
					s = 10;
				}

				else if ((LA8_0 == '&')) {
					s = 11;
				}

				else if ((LA8_0 == '\'')) {
					s = 12;
				}

				else if ((LA8_0 == '(')) {
					s = 13;
				}

				else if ((LA8_0 == ')')) {
					s = 14;
				}

				else if ((LA8_0 == '[')) {
					s = 15;
				}

				else if ((LA8_0 == '{')) {
					s = 16;
				}

				else if ((LA8_0 == '}')) {
					s = 17;
				}

				else if ((LA8_0 == ']')) {
					s = 18;
				}

				else if ((LA8_0 == '*')) {
					s = 19;
				}

				else if ((LA8_0 == '+')) {
					s = 20;
				}

				else if ((LA8_0 == '-')) {
					s = 21;
				}

				else if ((LA8_0 == '.')) {
					s = 22;
				}

				else if ((LA8_0 == ',')) {
					s = 23;
				}

				else if ((LA8_0 == ':')) {
					s = 24;
				}

				else if ((LA8_0 == ';')) {
					s = 25;
				}

				else if ((LA8_0 == '/')) {
					s = 26;
				}

				else if ((LA8_0 == '\\')) {
					s = 27;
				}

				else if ((LA8_0 == '=')) {
					s = 28;
				}

				else if ((LA8_0 == '<')) {
					s = 29;
				}

				else if ((LA8_0 == '>')) {
					s = 30;
				}

				else if ((LA8_0 == '?')) {
					s = 31;
				}

				else if ((LA8_0 == '_')) {
					s = 32;
				}

				else if ((LA8_0 == '|')) {
					s = 33;
				}

				else if ((LA8_0 == '^')) {
					s = 34;
				}

				else if ((LA8_0 == '0')) {
					s = 35;
				}

				else if (((LA8_0 >= '1' && LA8_0 <= '9'))) {
					s = 36;
				}

				else if ((LA8_0 == 'C' || (LA8_0 >= 'E' && LA8_0 <= 'K')
						|| (LA8_0 >= 'M' && LA8_0 <= 'N')
						|| (LA8_0 >= 'P' && LA8_0 <= 'Q')
						|| (LA8_0 >= 'S' && LA8_0 <= 'T')
						|| (LA8_0 >= 'V' && LA8_0 <= 'Z') || LA8_0 == 'c'
						|| (LA8_0 >= 'e' && LA8_0 <= 'k')
						|| (LA8_0 >= 'm' && LA8_0 <= 'n')
						|| (LA8_0 >= 'p' && LA8_0 <= 'q')
						|| (LA8_0 >= 's' && LA8_0 <= 't') || (LA8_0 >= 'v' && LA8_0 <= 'z'))) {
					s = 37;
				}

				else if (((LA8_0 >= '\t' && LA8_0 <= '\n') || LA8_0 == '\r' || LA8_0 == ' ')) {
					s = 38;
				}

				else if (((LA8_0 >= '\u0000' && LA8_0 <= '\b')
						|| (LA8_0 >= '\u000B' && LA8_0 <= '\f')
						|| (LA8_0 >= '\u000E' && LA8_0 <= '\u001F')
						|| LA8_0 == '!' || (LA8_0 >= '#' && LA8_0 <= '$')
						|| LA8_0 == '`' || (LA8_0 >= '~' && LA8_0 <= '\uFFFF'))) {
					s = 39;
				}

				if (s >= 0)
					return s;
				break;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 8, _s, input);
			error(nvae);
			throw nvae;
		}

	}

}