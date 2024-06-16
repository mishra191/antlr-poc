// Generated from HomeAutomationRules.g4 by ANTLR 4.9.2

package generated.antlr4;

import generated.antlr4.HomeAutomationRulesListener;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HomeAutomationRulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TIME=11, STRING=12, WS=13;
	public static final int
		RULE_rules = 0, RULE_homeRule = 1, RULE_ifCondition = 2, RULE_condition1 = 3, 
		RULE_condition2 = 4, RULE_thenCondition = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"rules", "homeRule", "ifCondition", "condition1", "condition2", "thenCondition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IF'", "'time is'", "'and'", "'day is'", "'weather is'", "'THEN'", 
			"'turn on lights'", "'turn off alarm'", "'go to gym'", "'don't go to office'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "TIME", 
			"STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "HomeAutomationRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HomeAutomationRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RulesContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HomeAutomationRulesParser.EOF, 0); }
		public List<HomeRuleContext> homeRule() {
			return getRuleContexts(HomeRuleContext.class);
		}
		public HomeRuleContext homeRule(int i) {
			return getRuleContext(HomeRuleContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HomeAutomationRulesVisitor ) return ((HomeAutomationRulesVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				homeRule();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(17);
			match(EOF);
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

	public static class HomeRuleContext extends ParserRuleContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public ThenConditionContext thenCondition() {
			return getRuleContext(ThenConditionContext.class,0);
		}
		public HomeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_homeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).enterHomeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).exitHomeRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HomeAutomationRulesVisitor ) return ((HomeAutomationRulesVisitor<? extends T>)visitor).visitHomeRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HomeRuleContext homeRule() throws RecognitionException {
		HomeRuleContext _localctx = new HomeRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_homeRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			ifCondition();
			setState(20);
			thenCondition();
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

	public static class IfConditionContext extends ParserRuleContext {
		public Token time;
		public Token day;
		public Condition1Context condition1() {
			return getRuleContext(Condition1Context.class,0);
		}
		public TerminalNode TIME() { return getToken(HomeAutomationRulesParser.TIME, 0); }
		public Condition2Context condition2() {
			return getRuleContext(Condition2Context.class,0);
		}
		public TerminalNode STRING() { return getToken(HomeAutomationRulesParser.STRING, 0); }
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HomeAutomationRulesVisitor ) return ((HomeAutomationRulesVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifCondition);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(T__0);
				setState(23);
				match(T__1);
				setState(24);
				((IfConditionContext)_localctx).time = match(TIME);
				setState(25);
				match(T__2);
				setState(26);
				condition1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(T__0);
				setState(28);
				match(T__1);
				setState(29);
				((IfConditionContext)_localctx).time = match(TIME);
				setState(30);
				match(T__2);
				setState(31);
				condition2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(T__0);
				setState(33);
				match(T__3);
				setState(34);
				((IfConditionContext)_localctx).day = match(STRING);
				setState(35);
				match(T__2);
				setState(36);
				condition1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				match(T__0);
				setState(38);
				match(T__3);
				setState(39);
				((IfConditionContext)_localctx).day = match(STRING);
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

	public static class Condition1Context extends ParserRuleContext {
		public Token weather;
		public TerminalNode STRING() { return getToken(HomeAutomationRulesParser.STRING, 0); }
		public Condition1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).enterCondition1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).exitCondition1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HomeAutomationRulesVisitor ) return ((HomeAutomationRulesVisitor<? extends T>)visitor).visitCondition1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition1Context condition1() throws RecognitionException {
		Condition1Context _localctx = new Condition1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__4);
			setState(43);
			((Condition1Context)_localctx).weather = match(STRING);
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

	public static class Condition2Context extends ParserRuleContext {
		public Token day;
		public TerminalNode STRING() { return getToken(HomeAutomationRulesParser.STRING, 0); }
		public Condition2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).enterCondition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).exitCondition2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HomeAutomationRulesVisitor ) return ((HomeAutomationRulesVisitor<? extends T>)visitor).visitCondition2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition2Context condition2() throws RecognitionException {
		Condition2Context _localctx = new Condition2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__3);
			setState(46);
			((Condition2Context)_localctx).day = match(STRING);
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

	public static class ThenConditionContext extends ParserRuleContext {
		public ThenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).enterThenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HomeAutomationRulesListener ) ((HomeAutomationRulesListener)listener).exitThenCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HomeAutomationRulesVisitor ) return ((HomeAutomationRulesVisitor<? extends T>)visitor).visitThenCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenConditionContext thenCondition() throws RecognitionException {
		ThenConditionContext _localctx = new ThenConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_thenCondition);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T__5);
				setState(49);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__5);
				setState(51);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(T__5);
				setState(53);
				match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				match(T__5);
				setState(55);
				match(T__9);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7;\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2=\2\17\3\2\2\2\4\25\3\2"+
		"\2\2\6*\3\2\2\2\b,\3\2\2\2\n/\3\2\2\2\f:\3\2\2\2\16\20\5\4\3\2\17\16\3"+
		"\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7"+
		"\2\2\3\24\3\3\2\2\2\25\26\5\6\4\2\26\27\5\f\7\2\27\5\3\2\2\2\30\31\7\3"+
		"\2\2\31\32\7\4\2\2\32\33\7\r\2\2\33\34\7\5\2\2\34+\5\b\5\2\35\36\7\3\2"+
		"\2\36\37\7\4\2\2\37 \7\r\2\2 !\7\5\2\2!+\5\n\6\2\"#\7\3\2\2#$\7\6\2\2"+
		"$%\7\16\2\2%&\7\5\2\2&+\5\b\5\2\'(\7\3\2\2()\7\6\2\2)+\7\16\2\2*\30\3"+
		"\2\2\2*\35\3\2\2\2*\"\3\2\2\2*\'\3\2\2\2+\7\3\2\2\2,-\7\7\2\2-.\7\16\2"+
		"\2.\t\3\2\2\2/\60\7\6\2\2\60\61\7\16\2\2\61\13\3\2\2\2\62\63\7\b\2\2\63"+
		";\7\t\2\2\64\65\7\b\2\2\65;\7\n\2\2\66\67\7\b\2\2\67;\7\13\2\289\7\b\2"+
		"\29;\7\f\2\2:\62\3\2\2\2:\64\3\2\2\2:\66\3\2\2\2:8\3\2\2\2;\r\3\2\2\2"+
		"\5\21*:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}