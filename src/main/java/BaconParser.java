// Generated from /Users/mburgess/git/bacon/src/main/antlr/Bacon.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BaconParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START_BLOCK=1, END_BLOCK=2, START_HOP=3, END_HOP=4, HEX=5, INT=6, FLOAT=7, 
		DQUOTE=8, Identifier=9, CHAR=10, END_STAT=11, NL=12, WS=13;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_block = 2, RULE_identifier = 3, RULE_quotedString = 4, 
		RULE_unquotedString = 5;
	public static final String[] ruleNames = {
		"prog", "stat", "block", "identifier", "quotedString", "unquotedString"
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

	@Override
	public String getGrammarFileName() { return "Bacon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BaconParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode EOF() { return getToken(BaconParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaconVisitor ) return ((BaconVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(19);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DQUOTE || _la==Identifier) {
					{
					{
					setState(12);
					stat();
					}
					}
					setState(17);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QuotedStringContext quotedString() {
			return getRuleContext(QuotedStringContext.class,0);
		}
		public List<TerminalNode> END_STAT() { return getTokens(BaconParser.END_STAT); }
		public TerminalNode END_STAT(int i) {
			return getToken(BaconParser.END_STAT, i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaconVisitor ) return ((BaconVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(21);
				identifier();
				}
				break;
			case DQUOTE:
				{
				setState(22);
				quotedString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==END_STAT) {
				{
				{
				setState(25);
				match(END_STAT);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode START_BLOCK() { return getToken(BaconParser.START_BLOCK, 0); }
		public TerminalNode END_BLOCK() { return getToken(BaconParser.END_BLOCK, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(BaconParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(BaconParser.NL, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaconVisitor ) return ((BaconVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(START_BLOCK);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DQUOTE || _la==Identifier) {
				{
				{
				setState(32);
				stat();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(END_BLOCK);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(39);
				match(NL);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BaconParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaconVisitor ) return ((BaconVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedStringContext extends ParserRuleContext {
		public List<TerminalNode> DQUOTE() { return getTokens(BaconParser.DQUOTE); }
		public TerminalNode DQUOTE(int i) {
			return getToken(BaconParser.DQUOTE, i);
		}
		public UnquotedStringContext unquotedString() {
			return getRuleContext(UnquotedStringContext.class,0);
		}
		public QuotedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).enterQuotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).exitQuotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaconVisitor ) return ((BaconVisitor<? extends T>)visitor).visitQuotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedStringContext quotedString() throws RecognitionException {
		QuotedStringContext _localctx = new QuotedStringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quotedString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(DQUOTE);
			setState(48);
			unquotedString();
			setState(49);
			match(DQUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnquotedStringContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(BaconParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(BaconParser.CHAR, i);
		}
		public UnquotedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquotedString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).enterUnquotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaconListener ) ((BaconListener)listener).exitUnquotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaconVisitor ) return ((BaconVisitor<? extends T>)visitor).visitUnquotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnquotedStringContext unquotedString() throws RecognitionException {
		UnquotedStringContext _localctx = new UnquotedStringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unquotedString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHAR) {
				{
				{
				setState(51);
				match(CHAR);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\5\2\26\n\2\3\3\3\3\5\3\32\n\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\7"+
		"\4$\n\4\f\4\16\4\'\13\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\7\7\67\n\7\f\7\16\7:\13\7\3\7\2\2\b\2\4\6\b\n\f\2\2<\2"+
		"\25\3\2\2\2\4\31\3\2\2\2\6!\3\2\2\2\b/\3\2\2\2\n\61\3\2\2\2\f8\3\2\2\2"+
		"\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2"+
		"\22\26\3\2\2\2\23\21\3\2\2\2\24\26\7\2\2\3\25\21\3\2\2\2\25\24\3\2\2\2"+
		"\26\3\3\2\2\2\27\32\5\b\5\2\30\32\5\n\6\2\31\27\3\2\2\2\31\30\3\2\2\2"+
		"\32\36\3\2\2\2\33\35\7\r\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36"+
		"\37\3\2\2\2\37\5\3\2\2\2 \36\3\2\2\2!%\7\3\2\2\"$\5\4\3\2#\"\3\2\2\2$"+
		"\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(,\7\4\2\2)+\7\16\2"+
		"\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2\2/\60\7"+
		"\13\2\2\60\t\3\2\2\2\61\62\7\n\2\2\62\63\5\f\7\2\63\64\7\n\2\2\64\13\3"+
		"\2\2\2\65\67\7\f\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29"+
		"\r\3\2\2\2:8\3\2\2\2\t\21\25\31\36%,8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}