// Generated from /Users/mac/Desktop/agh/4/tk/projects/jcp/jcp-compiler/attempt2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class attempt2 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Start=1, PackageDec=2, ImportDec=3, ClassDec=4, Modifier=5, Extends=6, 
		Body=7, PACKAGE=8, IMPORT=9, CLASS=10, PUBLIC=11, PRIVATE=12, PROTECTED=13, 
		EXTENDS=14, DOT=15, SEMI=16, LCUR=17, RCUR=18, IDENTIFIER=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Start", "PackageDec", "ImportDec", "ClassDec", "Modifier", "Extends", 
			"Body", "PACKAGE", "IMPORT", "CLASS", "PUBLIC", "PRIVATE", "PROTECTED", 
			"EXTENDS", "DOT", "SEMI", "LCUR", "RCUR", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'package'", "'import'", 
			"'class'", "'public'", "'private'", "'protected'", "'extends'", "'.'", 
			"';'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Start", "PackageDec", "ImportDec", "ClassDec", "Modifier", "Extends", 
			"Body", "PACKAGE", "IMPORT", "CLASS", "PUBLIC", "PRIVATE", "PROTECTED", 
			"EXTENDS", "DOT", "SEMI", "LCUR", "RCUR", "IDENTIFIER"
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


	public attempt2(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "attempt2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5P\n\5\3\5"+
		"\3\5\3\6\3\6\3\6\5\6W\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24\u00a0"+
		"\n\24\r\24\16\24\u00a1\3\24\7\24\u00a5\n\24\f\24\16\24\u00a8\13\24\2\2"+
		"\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25\3\2\4\5\2C\\aac|\6\2\62;C\\aac|\2\u00b0\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\3,\3\2\2\2\5=\3\2\2\2\7D\3\2\2\2\tK\3\2\2\2\13"+
		"V\3\2\2\2\rX\3\2\2\2\17]\3\2\2\2\21`\3\2\2\2\23h\3\2\2\2\25o\3\2\2\2\27"+
		"u\3\2\2\2\31|\3\2\2\2\33\u0084\3\2\2\2\35\u008e\3\2\2\2\37\u0096\3\2\2"+
		"\2!\u0098\3\2\2\2#\u009a\3\2\2\2%\u009c\3\2\2\2\'\u009f\3\2\2\2)+\5\5"+
		"\3\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\62\3\2\2\2.,\3\2\2\2/\61"+
		"\5\7\4\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\638\3\2"+
		"\2\2\64\62\3\2\2\2\65\67\5\t\5\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\2"+
		"89\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\2\2\3<\4\3\2\2\2=>\5\21\t\2>?\5\'\24"+
		"\2?@\5\37\20\2@A\5\'\24\2AB\3\2\2\2BC\5!\21\2C\6\3\2\2\2DE\5\23\n\2EF"+
		"\5\'\24\2FG\5\37\20\2GH\5\'\24\2HI\3\2\2\2IJ\5!\21\2J\b\3\2\2\2KL\5\13"+
		"\6\2LM\5\25\13\2MO\5\'\24\2NP\5\r\7\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR"+
		"\5\17\b\2R\n\3\2\2\2SW\5\27\f\2TW\5\31\r\2UW\5\33\16\2VS\3\2\2\2VT\3\2"+
		"\2\2VU\3\2\2\2W\f\3\2\2\2XY\5\35\17\2YZ\5\'\24\2Z[\5\37\20\2[\\\5\'\24"+
		"\2\\\16\3\2\2\2]^\5#\22\2^_\5%\23\2_\20\3\2\2\2`a\7r\2\2ab\7c\2\2bc\7"+
		"e\2\2cd\7m\2\2de\7c\2\2ef\7i\2\2fg\7g\2\2g\22\3\2\2\2hi\7k\2\2ij\7o\2"+
		"\2jk\7r\2\2kl\7q\2\2lm\7t\2\2mn\7v\2\2n\24\3\2\2\2op\7e\2\2pq\7n\2\2q"+
		"r\7c\2\2rs\7u\2\2st\7u\2\2t\26\3\2\2\2uv\7r\2\2vw\7w\2\2wx\7d\2\2xy\7"+
		"n\2\2yz\7k\2\2z{\7e\2\2{\30\3\2\2\2|}\7r\2\2}~\7t\2\2~\177\7k\2\2\177"+
		"\u0080\7x\2\2\u0080\u0081\7c\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2"+
		"\u0083\32\3\2\2\2\u0084\u0085\7r\2\2\u0085\u0086\7t\2\2\u0086\u0087\7"+
		"q\2\2\u0087\u0088\7v\2\2\u0088\u0089\7g\2\2\u0089\u008a\7e\2\2\u008a\u008b"+
		"\7v\2\2\u008b\u008c\7g\2\2\u008c\u008d\7f\2\2\u008d\34\3\2\2\2\u008e\u008f"+
		"\7g\2\2\u008f\u0090\7z\2\2\u0090\u0091\7v\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7p\2\2\u0093\u0094\7f\2\2\u0094\u0095\7u\2\2\u0095\36\3\2\2\2\u0096"+
		"\u0097\7\60\2\2\u0097 \3\2\2\2\u0098\u0099\7=\2\2\u0099\"\3\2\2\2\u009a"+
		"\u009b\7}\2\2\u009b$\3\2\2\2\u009c\u009d\7\177\2\2\u009d&\3\2\2\2\u009e"+
		"\u00a0\t\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\t\3\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7(\3\2\2\2\u00a8\u00a6\3\2\2\2\n\2,\628OV\u00a1\u00a6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}