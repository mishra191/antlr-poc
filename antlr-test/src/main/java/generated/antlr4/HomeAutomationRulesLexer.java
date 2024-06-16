// Generated from HomeAutomationRules.g4 by ANTLR 4.9.2
package generated.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HomeAutomationRulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TIME=11, STRING=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "TIME", "STRING", "WS"
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


	public HomeAutomationRulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HomeAutomationRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\6\r\u0086\n\r\r\r\16"+
		"\r\u0087\3\16\6\16\u008b\n\16\r\16\16\16\u008c\3\16\3\16\2\2\17\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\7\3\2\62"+
		"\64\3\2\62;\3\2\62\67\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0091\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\3\35\3\2\2\2\5 \3\2\2\2\7(\3\2\2\2\t,\3\2\2\2\13\63\3\2"+
		"\2\2\r>\3\2\2\2\17C\3\2\2\2\21R\3\2\2\2\23a\3\2\2\2\25k\3\2\2\2\27~\3"+
		"\2\2\2\31\u0085\3\2\2\2\33\u008a\3\2\2\2\35\36\7K\2\2\36\37\7H\2\2\37"+
		"\4\3\2\2\2 !\7v\2\2!\"\7k\2\2\"#\7o\2\2#$\7g\2\2$%\7\"\2\2%&\7k\2\2&\'"+
		"\7u\2\2\'\6\3\2\2\2()\7c\2\2)*\7p\2\2*+\7f\2\2+\b\3\2\2\2,-\7f\2\2-.\7"+
		"c\2\2./\7{\2\2/\60\7\"\2\2\60\61\7k\2\2\61\62\7u\2\2\62\n\3\2\2\2\63\64"+
		"\7y\2\2\64\65\7g\2\2\65\66\7c\2\2\66\67\7v\2\2\678\7j\2\289\7g\2\29:\7"+
		"t\2\2:;\7\"\2\2;<\7k\2\2<=\7u\2\2=\f\3\2\2\2>?\7V\2\2?@\7J\2\2@A\7G\2"+
		"\2AB\7P\2\2B\16\3\2\2\2CD\7v\2\2DE\7w\2\2EF\7t\2\2FG\7p\2\2GH\7\"\2\2"+
		"HI\7q\2\2IJ\7p\2\2JK\7\"\2\2KL\7n\2\2LM\7k\2\2MN\7i\2\2NO\7j\2\2OP\7v"+
		"\2\2PQ\7u\2\2Q\20\3\2\2\2RS\7v\2\2ST\7w\2\2TU\7t\2\2UV\7p\2\2VW\7\"\2"+
		"\2WX\7q\2\2XY\7h\2\2YZ\7h\2\2Z[\7\"\2\2[\\\7c\2\2\\]\7n\2\2]^\7c\2\2^"+
		"_\7t\2\2_`\7o\2\2`\22\3\2\2\2ab\7i\2\2bc\7q\2\2cd\7\"\2\2de\7v\2\2ef\7"+
		"q\2\2fg\7\"\2\2gh\7i\2\2hi\7{\2\2ij\7o\2\2j\24\3\2\2\2kl\7f\2\2lm\7q\2"+
		"\2mn\7p\2\2no\7)\2\2op\7v\2\2pq\7\"\2\2qr\7i\2\2rs\7q\2\2st\7\"\2\2tu"+
		"\7v\2\2uv\7q\2\2vw\7\"\2\2wx\7q\2\2xy\7h\2\2yz\7h\2\2z{\7k\2\2{|\7e\2"+
		"\2|}\7g\2\2}\26\3\2\2\2~\177\t\2\2\2\177\u0080\t\3\2\2\u0080\u0081\7<"+
		"\2\2\u0081\u0082\t\4\2\2\u0082\u0083\t\3\2\2\u0083\30\3\2\2\2\u0084\u0086"+
		"\t\5\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\32\3\2\2\2\u0089\u008b\t\6\2\2\u008a\u0089\3\2\2"+
		"\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\b\16\2\2\u008f\34\3\2\2\2\5\2\u0087\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}