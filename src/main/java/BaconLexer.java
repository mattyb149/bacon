// Generated from /Users/mburgess/git/bacon/src/main/antlr/Bacon.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BaconLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START_BLOCK=1, END_BLOCK=2, START_HOP=3, END_HOP=4, HEX=5, INT=6, FLOAT=7, 
		DQUOTE=8, Identifier=9, CHAR=10, END_STAT=11, NL=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"START_BLOCK", "END_BLOCK", "START_HOP", "END_HOP", "HEX", "INT", "HEXDIGIT", 
		"FLOAT", "DIGIT", "EXP", "DQUOTE", "ESC", "UNICODE_ESCAPE", "OCTAL_ESCAPE", 
		"HEX_ESCAPE", "Identifier", "LETTER", "CHAR", "COMMENT", "END_STAT", "NL", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'-['", "']->'", null, null, null, "'\"'", null, null, 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "START_BLOCK", "END_BLOCK", "START_HOP", "END_HOP", "HEX", "INT", 
		"FLOAT", "DQUOTE", "Identifier", "CHAR", "END_STAT", "NL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public BaconLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bacon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17\u00d4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\6\6>\n\6\r\6\16\6?\3\6\5\6"+
		"C\n\6\3\7\6\7F\n\7\r\7\16\7G\3\7\5\7K\n\7\3\b\3\b\3\t\6\tP\n\t\r\t\16"+
		"\tQ\3\t\3\t\7\tV\n\t\f\t\16\tY\13\t\3\t\5\t\\\n\t\3\t\5\t_\n\t\3\t\6\t"+
		"b\n\t\r\t\16\tc\3\t\5\tg\n\t\3\t\5\tj\n\t\3\t\3\t\6\tn\n\t\r\t\16\to\3"+
		"\t\5\ts\n\t\3\t\5\tv\n\t\5\tx\n\t\3\n\3\n\3\13\3\13\5\13~\n\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0089\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009b\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a6\n\17\3\20\3\20"+
		"\3\20\5\20\u00ab\n\20\3\21\3\21\7\21\u00af\n\21\f\21\16\21\u00b2\13\21"+
		"\3\22\3\22\3\23\5\23\u00b7\n\23\3\24\3\24\7\24\u00bb\n\24\f\24\16\24\u00be"+
		"\13\24\3\24\5\24\u00c1\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\5\26\u00ca"+
		"\n\26\3\26\3\26\3\27\6\27\u00cf\n\27\r\27\16\27\u00d0\3\27\3\27\3\u00bc"+
		"\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\t\23\2\25\2\27\n\31\2\33\2\35\2"+
		"\37\2!\13#\2%\f\'\2)\r+\16-\17\3\2\16\4\2ZZzz\4\2NNnn\5\2\62;CHch\4\2"+
		"GGgg\4\2--//\13\2$$))^^cdhhppttvvxx\3\2\62\65\3\2\629\4\2C\\c|\6\2\62"+
		";C\\aac|\5\2\2\13\r\16%\1\t\2\13\f\17\17\"\"\62\62^^eezz\u00e8\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21"+
		"\3\2\2\2\2\27\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+"+
		"\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\66\3\2\2\2"+
		"\13:\3\2\2\2\rE\3\2\2\2\17L\3\2\2\2\21w\3\2\2\2\23y\3\2\2\2\25{\3\2\2"+
		"\2\27\u0081\3\2\2\2\31\u0088\3\2\2\2\33\u009a\3\2\2\2\35\u00a5\3\2\2\2"+
		"\37\u00a7\3\2\2\2!\u00ac\3\2\2\2#\u00b3\3\2\2\2%\u00b6\3\2\2\2\'\u00b8"+
		"\3\2\2\2)\u00c6\3\2\2\2+\u00c9\3\2\2\2-\u00ce\3\2\2\2/\60\7}\2\2\60\4"+
		"\3\2\2\2\61\62\7\177\2\2\62\6\3\2\2\2\63\64\7/\2\2\64\65\7]\2\2\65\b\3"+
		"\2\2\2\66\67\7_\2\2\678\7/\2\289\7@\2\29\n\3\2\2\2:;\7\62\2\2;=\t\2\2"+
		"\2<>\5\17\b\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2AC\t\3"+
		"\2\2BA\3\2\2\2BC\3\2\2\2C\f\3\2\2\2DF\5\23\n\2ED\3\2\2\2FG\3\2\2\2GE\3"+
		"\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\t\3\2\2JI\3\2\2\2JK\3\2\2\2K\16\3\2\2\2L"+
		"M\t\4\2\2M\20\3\2\2\2NP\5\23\n\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2"+
		"\2RS\3\2\2\2SW\7\60\2\2TV\5\23\n\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2X[\3\2\2\2YW\3\2\2\2Z\\\5\25\13\2[Z\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2"+
		"]_\t\3\2\2^]\3\2\2\2^_\3\2\2\2_x\3\2\2\2`b\5\23\n\2a`\3\2\2\2bc\3\2\2"+
		"\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2eg\5\25\13\2fe\3\2\2\2fg\3\2\2\2gi\3\2"+
		"\2\2hj\t\3\2\2ih\3\2\2\2ij\3\2\2\2jx\3\2\2\2km\7\60\2\2ln\5\23\n\2ml\3"+
		"\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qs\5\25\13\2rq\3\2\2\2r"+
		"s\3\2\2\2su\3\2\2\2tv\t\3\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wO\3\2\2\2"+
		"wa\3\2\2\2wk\3\2\2\2x\22\3\2\2\2yz\4\62;\2z\24\3\2\2\2{}\t\5\2\2|~\t\6"+
		"\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\5\r\7\2\u0080\26\3\2\2"+
		"\2\u0081\u0082\7$\2\2\u0082\30\3\2\2\2\u0083\u0084\7^\2\2\u0084\u0089"+
		"\t\7\2\2\u0085\u0089\5\33\16\2\u0086\u0089\5\37\20\2\u0087\u0089\5\35"+
		"\17\2\u0088\u0083\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\32\3\2\2\2\u008a\u008b\7^\2\2\u008b\u008c\7w\2\2"+
		"\u008c\u008d\5\17\b\2\u008d\u008e\5\17\b\2\u008e\u008f\5\17\b\2\u008f"+
		"\u0090\5\17\b\2\u0090\u009b\3\2\2\2\u0091\u0092\7^\2\2\u0092\u0093\7w"+
		"\2\2\u0093\u0094\7}\2\2\u0094\u0095\5\17\b\2\u0095\u0096\5\17\b\2\u0096"+
		"\u0097\5\17\b\2\u0097\u0098\5\17\b\2\u0098\u0099\7\177\2\2\u0099\u009b"+
		"\3\2\2\2\u009a\u008a\3\2\2\2\u009a\u0091\3\2\2\2\u009b\34\3\2\2\2\u009c"+
		"\u009d\7^\2\2\u009d\u009e\t\b\2\2\u009e\u009f\t\t\2\2\u009f\u00a6\t\t"+
		"\2\2\u00a0\u00a1\7^\2\2\u00a1\u00a2\t\t\2\2\u00a2\u00a6\t\t\2\2\u00a3"+
		"\u00a4\7^\2\2\u00a4\u00a6\t\t\2\2\u00a5\u009c\3\2\2\2\u00a5\u00a0\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7^\2\2\u00a8\u00aa"+
		"\5\17\b\2\u00a9\u00ab\5\17\b\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab \3\2\2\2\u00ac\u00b0\t\n\2\2\u00ad\u00af\t\13\2\2\u00ae\u00ad\3"+
		"\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\t\n\2\2\u00b4$\3\2\2\2\u00b5"+
		"\u00b7\t\f\2\2\u00b6\u00b5\3\2\2\2\u00b7&\3\2\2\2\u00b8\u00bc\7%\2\2\u00b9"+
		"\u00bb\13\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00bd\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c1\7\17\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\24\2\2\u00c5"+
		"(\3\2\2\2\u00c6\u00c7\7=\2\2\u00c7*\3\2\2\2\u00c8\u00ca\7\17\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\f"+
		"\2\2\u00cc,\3\2\2\2\u00cd\u00cf\t\r\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\b\27\3\2\u00d3.\3\2\2\2\35\2?BGJQW[^cfioruw}\u0088\u009a\u00a5"+
		"\u00aa\u00b0\u00b6\u00bc\u00c0\u00c9\u00d0\4\t\16\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}