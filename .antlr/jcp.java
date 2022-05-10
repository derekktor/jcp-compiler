// Generated from /Users/mac/Desktop/agh/4/tk/jcp/jcp-compiler/jcp.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jcp extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, Num=2, FlPoint=3, Bool=4, Letter=5, CharLiteral=6, StrLiteral=7, 
		COMMA=8, DOT=9, SEMICOL=10, LPAR=11, RPAR=12, LBRACE=13, RBRACE=14, LBRACK=15, 
		RBRACK=16, ASSIGN=17, ADDAS=18, SUBAS=19, MULAS=20, DIVAS=21, MODAS=22, 
		EQUAL=23, GT=24, LT=25, LE=26, GE=27, NOTEQ=28, AND=29, OR=30, INC=31, 
		DEC=32, ADD=33, SUB=34, MUL=35, DIV=36, MOD=37, BITAND=38, BITOR=39, CHAR=40, 
		DOUBLE=41, FLOAT=42, INT=43, SHORT=44, LONG=45, BOOLEAN=46, BYTE=47, CONST=48, 
		IF=49, ELSE=50, SWITCH=51, CASE=52, DEFAULT=53, DO=54, WHILE=55, CONTINUE=56, 
		BREAK=57, FOR=58, PUBLIC=59, PRIVATE=60, PROTECTED=61, CLASS=62, ENUM=63, 
		EXTENDS=64, IMPLEMENTS=65, INTERFACE=66, PACKAGE=67, THIS=68, ABSTRACT=69, 
		FINAL=70, SUPER=71, IMPORT=72, ASSERT=73, CATCH=74, THROW=75, THROWS=76, 
		TRY=77, FINALLY=78, NEW=79, RETURN=80, STATIC=81, VOID=82, SinComment=83, 
		MulComment=84;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "Num", "FlPoint", "Bool", "Letter", "CharLiteral", "StrLiteral", 
			"COMMA", "DOT", "SEMICOL", "LPAR", "RPAR", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "ASSIGN", "ADDAS", "SUBAS", "MULAS", "DIVAS", "MODAS", "EQUAL", 
			"GT", "LT", "LE", "GE", "NOTEQ", "AND", "OR", "INC", "DEC", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "BITAND", "BITOR", "CHAR", "DOUBLE", "FLOAT", "INT", 
			"SHORT", "LONG", "BOOLEAN", "BYTE", "CONST", "IF", "ELSE", "SWITCH", 
			"CASE", "DEFAULT", "DO", "WHILE", "CONTINUE", "BREAK", "FOR", "PUBLIC", 
			"PRIVATE", "PROTECTED", "CLASS", "ENUM", "EXTENDS", "IMPLEMENTS", "INTERFACE", 
			"PACKAGE", "THIS", "ABSTRACT", "FINAL", "SUPER", "IMPORT", "ASSERT", 
			"CATCH", "THROW", "THROWS", "TRY", "FINALLY", "NEW", "RETURN", "STATIC", 
			"VOID", "SinComment", "MulComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "','", "'.'", "';'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'=='", "'>'", "'<'", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", 
			"'char'", "'double'", "'float'", "'int'", "'short'", "'long'", "'boolean'", 
			"'byte'", "'const'", "'if'", "'else'", "'switch'", "'case'", "'default'", 
			"'do'", "'while'", "'continue'", "'break'", "'for'", "'public'", "'private'", 
			"'protected'", "'class'", "'enum'", "'extends'", "'implements'", "'interface'", 
			"'package'", "'this'", "'abstract'", "'final'", "'super'", "'import'", 
			"'assert'", "'catch'", "'throw'", "'throws'", "'try'", "'finally'", "'new'", 
			"'return'", "'static'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "Num", "FlPoint", "Bool", "Letter", "CharLiteral", "StrLiteral", 
			"COMMA", "DOT", "SEMICOL", "LPAR", "RPAR", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "ASSIGN", "ADDAS", "SUBAS", "MULAS", "DIVAS", "MODAS", "EQUAL", 
			"GT", "LT", "LE", "GE", "NOTEQ", "AND", "OR", "INC", "DEC", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "BITAND", "BITOR", "CHAR", "DOUBLE", "FLOAT", "INT", 
			"SHORT", "LONG", "BOOLEAN", "BYTE", "CONST", "IF", "ELSE", "SWITCH", 
			"CASE", "DEFAULT", "DO", "WHILE", "CONTINUE", "BREAK", "FOR", "PUBLIC", 
			"PRIVATE", "PROTECTED", "CLASS", "ENUM", "EXTENDS", "IMPLEMENTS", "INTERFACE", 
			"PACKAGE", "THIS", "ABSTRACT", "FINAL", "SUPER", "IMPORT", "ASSERT", 
			"CATCH", "THROW", "THROWS", "TRY", "FINALLY", "NEW", "RETURN", "STATIC", 
			"VOID", "SinComment", "MulComment"
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


	public jcp(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jcp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u0251\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\6\2\u00ad\n\2\r\2\16\2\u00ae\3\2\3\2\3\3\6\3\u00b4\n\3\r\3"+
		"\16\3\u00b5\3\4\3\4\3\4\5\4\u00bb\n\4\3\4\3\4\5\4\u00bf\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ca\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\6\b\u00d4\n\b\r\b\16\b\u00d5\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3:\3"+
		":\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3"+
		"J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3"+
		"M\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\7T\u023d\nT\fT\16T\u0240"+
		"\13T\3T\3T\3U\3U\3U\3U\7U\u0248\nU\fU\16U\u024b\13U\3U\3U\3U\3U\3U\2\2"+
		"V\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH"+
		"\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\3\2\5\5\2\13\f\17\17\"\"\3\2\62;\4\2C\\"+
		"c|\2\u0258\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\3\u00ac\3\2\2\2\5\u00b3\3\2\2\2\7\u00be\3\2\2"+
		"\2\t\u00c9\3\2\2\2\13\u00cb\3\2\2\2\r\u00cd\3\2\2\2\17\u00d1\3\2\2\2\21"+
		"\u00d8\3\2\2\2\23\u00da\3\2\2\2\25\u00dc\3\2\2\2\27\u00de\3\2\2\2\31\u00e0"+
		"\3\2\2\2\33\u00e2\3\2\2\2\35\u00e4\3\2\2\2\37\u00e6\3\2\2\2!\u00e8\3\2"+
		"\2\2#\u00ea\3\2\2\2%\u00ec\3\2\2\2\'\u00ef\3\2\2\2)\u00f2\3\2\2\2+\u00f5"+
		"\3\2\2\2-\u00f8\3\2\2\2/\u00fb\3\2\2\2\61\u00fe\3\2\2\2\63\u0100\3\2\2"+
		"\2\65\u0102\3\2\2\2\67\u0105\3\2\2\29\u0108\3\2\2\2;\u010b\3\2\2\2=\u010e"+
		"\3\2\2\2?\u0111\3\2\2\2A\u0114\3\2\2\2C\u0117\3\2\2\2E\u0119\3\2\2\2G"+
		"\u011b\3\2\2\2I\u011d\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2\2\2O\u0123\3\2"+
		"\2\2Q\u0125\3\2\2\2S\u012a\3\2\2\2U\u0131\3\2\2\2W\u0137\3\2\2\2Y\u013b"+
		"\3\2\2\2[\u0141\3\2\2\2]\u0146\3\2\2\2_\u014e\3\2\2\2a\u0153\3\2\2\2c"+
		"\u0159\3\2\2\2e\u015c\3\2\2\2g\u0161\3\2\2\2i\u0168\3\2\2\2k\u016d\3\2"+
		"\2\2m\u0175\3\2\2\2o\u0178\3\2\2\2q\u017e\3\2\2\2s\u0187\3\2\2\2u\u018d"+
		"\3\2\2\2w\u0191\3\2\2\2y\u0198\3\2\2\2{\u01a0\3\2\2\2}\u01aa\3\2\2\2\177"+
		"\u01b0\3\2\2\2\u0081\u01b5\3\2\2\2\u0083\u01bd\3\2\2\2\u0085\u01c8\3\2"+
		"\2\2\u0087\u01d2\3\2\2\2\u0089\u01da\3\2\2\2\u008b\u01df\3\2\2\2\u008d"+
		"\u01e8\3\2\2\2\u008f\u01ee\3\2\2\2\u0091\u01f4\3\2\2\2\u0093\u01fb\3\2"+
		"\2\2\u0095\u0202\3\2\2\2\u0097\u0208\3\2\2\2\u0099\u020e\3\2\2\2\u009b"+
		"\u0215\3\2\2\2\u009d\u0219\3\2\2\2\u009f\u0221\3\2\2\2\u00a1\u0225\3\2"+
		"\2\2\u00a3\u022c\3\2\2\2\u00a5\u0233\3\2\2\2\u00a7\u0238\3\2\2\2\u00a9"+
		"\u0243\3\2\2\2\u00ab\u00ad\t\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\b\2\2\2\u00b1\4\3\2\2\2\u00b2\u00b4\t\3\2\2\u00b3\u00b2\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\6\3"+
		"\2\2\2\u00b7\u00b8\5\5\3\2\u00b8\u00ba\7\60\2\2\u00b9\u00bb\5\5\3\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bf\3\2\2\2\u00bc\u00bd\7\60"+
		"\2\2\u00bd\u00bf\5\5\3\2\u00be\u00b7\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\b\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7w\2\2\u00c3"+
		"\u00ca\7g\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2"+
		"\u00c7\u00c8\7u\2\2\u00c8\u00ca\7g\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c4"+
		"\3\2\2\2\u00ca\n\3\2\2\2\u00cb\u00cc\t\4\2\2\u00cc\f\3\2\2\2\u00cd\u00ce"+
		"\7)\2\2\u00ce\u00cf\5\13\6\2\u00cf\u00d0\7)\2\2\u00d0\16\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d4\5\13\6\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\20\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9\22\3\2\2\2\u00da\u00db\7\60\2\2\u00db"+
		"\24\3\2\2\2\u00dc\u00dd\7=\2\2\u00dd\26\3\2\2\2\u00de\u00df\7*\2\2\u00df"+
		"\30\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1\32\3\2\2\2\u00e2\u00e3\7}\2\2\u00e3"+
		"\34\3\2\2\2\u00e4\u00e5\7\177\2\2\u00e5\36\3\2\2\2\u00e6\u00e7\7]\2\2"+
		"\u00e7 \3\2\2\2\u00e8\u00e9\7_\2\2\u00e9\"\3\2\2\2\u00ea\u00eb\7?\2\2"+
		"\u00eb$\3\2\2\2\u00ec\u00ed\7-\2\2\u00ed\u00ee\7?\2\2\u00ee&\3\2\2\2\u00ef"+
		"\u00f0\7/\2\2\u00f0\u00f1\7?\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7,\2\2\u00f3"+
		"\u00f4\7?\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\7?\2\2\u00f7"+
		",\3\2\2\2\u00f8\u00f9\7\'\2\2\u00f9\u00fa\7?\2\2\u00fa.\3\2\2\2\u00fb"+
		"\u00fc\7?\2\2\u00fc\u00fd\7?\2\2\u00fd\60\3\2\2\2\u00fe\u00ff\7@\2\2\u00ff"+
		"\62\3\2\2\2\u0100\u0101\7>\2\2\u0101\64\3\2\2\2\u0102\u0103\7>\2\2\u0103"+
		"\u0104\7?\2\2\u0104\66\3\2\2\2\u0105\u0106\7@\2\2\u0106\u0107\7?\2\2\u0107"+
		"8\3\2\2\2\u0108\u0109\7#\2\2\u0109\u010a\7?\2\2\u010a:\3\2\2\2\u010b\u010c"+
		"\7(\2\2\u010c\u010d\7(\2\2\u010d<\3\2\2\2\u010e\u010f\7~\2\2\u010f\u0110"+
		"\7~\2\2\u0110>\3\2\2\2\u0111\u0112\7-\2\2\u0112\u0113\7-\2\2\u0113@\3"+
		"\2\2\2\u0114\u0115\7/\2\2\u0115\u0116\7/\2\2\u0116B\3\2\2\2\u0117\u0118"+
		"\7-\2\2\u0118D\3\2\2\2\u0119\u011a\7/\2\2\u011aF\3\2\2\2\u011b\u011c\7"+
		",\2\2\u011cH\3\2\2\2\u011d\u011e\7\61\2\2\u011eJ\3\2\2\2\u011f\u0120\7"+
		"\'\2\2\u0120L\3\2\2\2\u0121\u0122\7(\2\2\u0122N\3\2\2\2\u0123\u0124\7"+
		"~\2\2\u0124P\3\2\2\2\u0125\u0126\7e\2\2\u0126\u0127\7j\2\2\u0127\u0128"+
		"\7c\2\2\u0128\u0129\7t\2\2\u0129R\3\2\2\2\u012a\u012b\7f\2\2\u012b\u012c"+
		"\7q\2\2\u012c\u012d\7w\2\2\u012d\u012e\7d\2\2\u012e\u012f\7n\2\2\u012f"+
		"\u0130\7g\2\2\u0130T\3\2\2\2\u0131\u0132\7h\2\2\u0132\u0133\7n\2\2\u0133"+
		"\u0134\7q\2\2\u0134\u0135\7c\2\2\u0135\u0136\7v\2\2\u0136V\3\2\2\2\u0137"+
		"\u0138\7k\2\2\u0138\u0139\7p\2\2\u0139\u013a\7v\2\2\u013aX\3\2\2\2\u013b"+
		"\u013c\7u\2\2\u013c\u013d\7j\2\2\u013d\u013e\7q\2\2\u013e\u013f\7t\2\2"+
		"\u013f\u0140\7v\2\2\u0140Z\3\2\2\2\u0141\u0142\7n\2\2\u0142\u0143\7q\2"+
		"\2\u0143\u0144\7p\2\2\u0144\u0145\7i\2\2\u0145\\\3\2\2\2\u0146\u0147\7"+
		"d\2\2\u0147\u0148\7q\2\2\u0148\u0149\7q\2\2\u0149\u014a\7n\2\2\u014a\u014b"+
		"\7g\2\2\u014b\u014c\7c\2\2\u014c\u014d\7p\2\2\u014d^\3\2\2\2\u014e\u014f"+
		"\7d\2\2\u014f\u0150\7{\2\2\u0150\u0151\7v\2\2\u0151\u0152\7g\2\2\u0152"+
		"`\3\2\2\2\u0153\u0154\7e\2\2\u0154\u0155\7q\2\2\u0155\u0156\7p\2\2\u0156"+
		"\u0157\7u\2\2\u0157\u0158\7v\2\2\u0158b\3\2\2\2\u0159\u015a\7k\2\2\u015a"+
		"\u015b\7h\2\2\u015bd\3\2\2\2\u015c\u015d\7g\2\2\u015d\u015e\7n\2\2\u015e"+
		"\u015f\7u\2\2\u015f\u0160\7g\2\2\u0160f\3\2\2\2\u0161\u0162\7u\2\2\u0162"+
		"\u0163\7y\2\2\u0163\u0164\7k\2\2\u0164\u0165\7v\2\2\u0165\u0166\7e\2\2"+
		"\u0166\u0167\7j\2\2\u0167h\3\2\2\2\u0168\u0169\7e\2\2\u0169\u016a\7c\2"+
		"\2\u016a\u016b\7u\2\2\u016b\u016c\7g\2\2\u016cj\3\2\2\2\u016d\u016e\7"+
		"f\2\2\u016e\u016f\7g\2\2\u016f\u0170\7h\2\2\u0170\u0171\7c\2\2\u0171\u0172"+
		"\7w\2\2\u0172\u0173\7n\2\2\u0173\u0174\7v\2\2\u0174l\3\2\2\2\u0175\u0176"+
		"\7f\2\2\u0176\u0177\7q\2\2\u0177n\3\2\2\2\u0178\u0179\7y\2\2\u0179\u017a"+
		"\7j\2\2\u017a\u017b\7k\2\2\u017b\u017c\7n\2\2\u017c\u017d\7g\2\2\u017d"+
		"p\3\2\2\2\u017e\u017f\7e\2\2\u017f\u0180\7q\2\2\u0180\u0181\7p\2\2\u0181"+
		"\u0182\7v\2\2\u0182\u0183\7k\2\2\u0183\u0184\7p\2\2\u0184\u0185\7w\2\2"+
		"\u0185\u0186\7g\2\2\u0186r\3\2\2\2\u0187\u0188\7d\2\2\u0188\u0189\7t\2"+
		"\2\u0189\u018a\7g\2\2\u018a\u018b\7c\2\2\u018b\u018c\7m\2\2\u018ct\3\2"+
		"\2\2\u018d\u018e\7h\2\2\u018e\u018f\7q\2\2\u018f\u0190\7t\2\2\u0190v\3"+
		"\2\2\2\u0191\u0192\7r\2\2\u0192\u0193\7w\2\2\u0193\u0194\7d\2\2\u0194"+
		"\u0195\7n\2\2\u0195\u0196\7k\2\2\u0196\u0197\7e\2\2\u0197x\3\2\2\2\u0198"+
		"\u0199\7r\2\2\u0199\u019a\7t\2\2\u019a\u019b\7k\2\2\u019b\u019c\7x\2\2"+
		"\u019c\u019d\7c\2\2\u019d\u019e\7v\2\2\u019e\u019f\7g\2\2\u019fz\3\2\2"+
		"\2\u01a0\u01a1\7r\2\2\u01a1\u01a2\7t\2\2\u01a2\u01a3\7q\2\2\u01a3\u01a4"+
		"\7v\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6\7e\2\2\u01a6\u01a7\7v\2\2\u01a7"+
		"\u01a8\7g\2\2\u01a8\u01a9\7f\2\2\u01a9|\3\2\2\2\u01aa\u01ab\7e\2\2\u01ab"+
		"\u01ac\7n\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7u\2\2\u01ae\u01af\7u\2\2"+
		"\u01af~\3\2\2\2\u01b0\u01b1\7g\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7w\2"+
		"\2\u01b3\u01b4\7o\2\2\u01b4\u0080\3\2\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7"+
		"\7z\2\2\u01b7\u01b8\7v\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7p\2\2\u01ba"+
		"\u01bb\7f\2\2\u01bb\u01bc\7u\2\2\u01bc\u0082\3\2\2\2\u01bd\u01be\7k\2"+
		"\2\u01be\u01bf\7o\2\2\u01bf\u01c0\7r\2\2\u01c0\u01c1\7n\2\2\u01c1\u01c2"+
		"\7g\2\2\u01c2\u01c3\7o\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c5\7p\2\2\u01c5"+
		"\u01c6\7v\2\2\u01c6\u01c7\7u\2\2\u01c7\u0084\3\2\2\2\u01c8\u01c9\7k\2"+
		"\2\u01c9\u01ca\7p\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd"+
		"\7t\2\2\u01cd\u01ce\7h\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d0\7e\2\2\u01d0"+
		"\u01d1\7g\2\2\u01d1\u0086\3\2\2\2\u01d2\u01d3\7r\2\2\u01d3\u01d4\7c\2"+
		"\2\u01d4\u01d5\7e\2\2\u01d5\u01d6\7m\2\2\u01d6\u01d7\7c\2\2\u01d7\u01d8"+
		"\7i\2\2\u01d8\u01d9\7g\2\2\u01d9\u0088\3\2\2\2\u01da\u01db\7v\2\2\u01db"+
		"\u01dc\7j\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de\7u\2\2\u01de\u008a\3\2\2"+
		"\2\u01df\u01e0\7c\2\2\u01e0\u01e1\7d\2\2\u01e1\u01e2\7u\2\2\u01e2\u01e3"+
		"\7v\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5\7c\2\2\u01e5\u01e6\7e\2\2\u01e6"+
		"\u01e7\7v\2\2\u01e7\u008c\3\2\2\2\u01e8\u01e9\7h\2\2\u01e9\u01ea\7k\2"+
		"\2\u01ea\u01eb\7p\2\2\u01eb\u01ec\7c\2\2\u01ec\u01ed\7n\2\2\u01ed\u008e"+
		"\3\2\2\2\u01ee\u01ef\7u\2\2\u01ef\u01f0\7w\2\2\u01f0\u01f1\7r\2\2\u01f1"+
		"\u01f2\7g\2\2\u01f2\u01f3\7t\2\2\u01f3\u0090\3\2\2\2\u01f4\u01f5\7k\2"+
		"\2\u01f5\u01f6\7o\2\2\u01f6\u01f7\7r\2\2\u01f7\u01f8\7q\2\2\u01f8\u01f9"+
		"\7t\2\2\u01f9\u01fa\7v\2\2\u01fa\u0092\3\2\2\2\u01fb\u01fc\7c\2\2\u01fc"+
		"\u01fd\7u\2\2\u01fd\u01fe\7u\2\2\u01fe\u01ff\7g\2\2\u01ff\u0200\7t\2\2"+
		"\u0200\u0201\7v\2\2\u0201\u0094\3\2\2\2\u0202\u0203\7e\2\2\u0203\u0204"+
		"\7c\2\2\u0204\u0205\7v\2\2\u0205\u0206\7e\2\2\u0206\u0207\7j\2\2\u0207"+
		"\u0096\3\2\2\2\u0208\u0209\7v\2\2\u0209\u020a\7j\2\2\u020a\u020b\7t\2"+
		"\2\u020b\u020c\7q\2\2\u020c\u020d\7y\2\2\u020d\u0098\3\2\2\2\u020e\u020f"+
		"\7v\2\2\u020f\u0210\7j\2\2\u0210\u0211\7t\2\2\u0211\u0212\7q\2\2\u0212"+
		"\u0213\7y\2\2\u0213\u0214\7u\2\2\u0214\u009a\3\2\2\2\u0215\u0216\7v\2"+
		"\2\u0216\u0217\7t\2\2\u0217\u0218\7{\2\2\u0218\u009c\3\2\2\2\u0219\u021a"+
		"\7h\2\2\u021a\u021b\7k\2\2\u021b\u021c\7p\2\2\u021c\u021d\7c\2\2\u021d"+
		"\u021e\7n\2\2\u021e\u021f\7n\2\2\u021f\u0220\7{\2\2\u0220\u009e\3\2\2"+
		"\2\u0221\u0222\7p\2\2\u0222\u0223\7g\2\2\u0223\u0224\7y\2\2\u0224\u00a0"+
		"\3\2\2\2\u0225\u0226\7t\2\2\u0226\u0227\7g\2\2\u0227\u0228\7v\2\2\u0228"+
		"\u0229\7w\2\2\u0229\u022a\7t\2\2\u022a\u022b\7p\2\2\u022b\u00a2\3\2\2"+
		"\2\u022c\u022d\7u\2\2\u022d\u022e\7v\2\2\u022e\u022f\7c\2\2\u022f\u0230"+
		"\7v\2\2\u0230\u0231\7k\2\2\u0231\u0232\7e\2\2\u0232\u00a4\3\2\2\2\u0233"+
		"\u0234\7x\2\2\u0234\u0235\7q\2\2\u0235\u0236\7k\2\2\u0236\u0237\7f\2\2"+
		"\u0237\u00a6\3\2\2\2\u0238\u0239\7\61\2\2\u0239\u023a\7\61\2\2\u023a\u023e"+
		"\3\2\2\2\u023b\u023d\13\2\2\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2"+
		"\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e"+
		"\3\2\2\2\u0241\u0242\bT\3\2\u0242\u00a8\3\2\2\2\u0243\u0244\7\61\2\2\u0244"+
		"\u0245\7,\2\2\u0245\u0249\3\2\2\2\u0246\u0248\13\2\2\2\u0247\u0246\3\2"+
		"\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7,\2\2\u024d\u024e\7\61"+
		"\2\2\u024e\u024f\3\2\2\2\u024f\u0250\bU\3\2\u0250\u00aa\3\2\2\2\13\2\u00ae"+
		"\u00b5\u00ba\u00be\u00c9\u00d5\u023e\u0249\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}