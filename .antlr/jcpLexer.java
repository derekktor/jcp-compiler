// Generated from /mnt/d/Coding/tkik/jcp-compiler/JCP.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JCPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PackageDec=1, ImportDec=2, ClassDec=3, Modifier=4, Extends=5, Body=6, 
		BodyDec=7, MethodDec=8, Block=9, BlockDec=10, LocalDec=11, MemberDec=12, 
		Type=13, PrimitiveType=14, NumericType=15, IntegralType=16, FloatingPointType=17, 
		ReferenceType=18, ClassType=19, ConstructorDec=20, Parameters=21, Parameter=22, 
		ConstructorBody=23, ConstructorInvocation=24, Argument=25, Statement=26, 
		ForInit=27, ForUpdate=28, Expression=29, Assignment=30, LeftHandSide=31, 
		FieldAccess=32, ArrayAccess=33, ConditionalExpression=34, OrExpression=35, 
		AndExpression=36, EqualityExpression=37, RelationalExpression=38, AdditiveExpression=39, 
		MultiplicativeExpression=40, UnaireExpression=41, UnaryExpression=42, 
		PrimaryExpression=43, PACKAGE=44, IMPORT=45, CLASS=46, PUBLIC=47, PRIVATE=48, 
		PROTECTED=49, EXTENDS=50, SUPER=51, THIS=52, NEW=53, IF=54, ELSE=55, FOR=56, 
		WHILE=57, DO=58, BREAK=59, CONTINUE=60, RETURN=61, ASSIGN=62, PLUS=63, 
		MINUS=64, MULTIPLY=65, DIVIDE=66, MOD=67, INCREMENT=68, DECREMENT=69, 
		OR=70, AND=71, NOT=72, EQUAL=73, NOTEQUAL=74, LESS=75, LESSEQUAL=76, GREATER=77, 
		GREATEREQUAL=78, DOT=79, COMMA=80, SEMI=81, COLON=82, QUESTION=83, LCUR=84, 
		RCUR=85, LPAR=86, RPAR=87, LBRACK=88, RBRACK=89, BOOL=90, BYTE=91, SHORT=92, 
		LONG=93, INT=94, CHAR=95, FLOAT=96, DOUBLE=97, WS=98, LITERAL=99, IDENTIFIER=100;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PackageDec", "ImportDec", "ClassDec", "Modifier", "Extends", "Body", 
			"BodyDec", "MethodDec", "Block", "BlockDec", "LocalDec", "MemberDec", 
			"Type", "PrimitiveType", "NumericType", "IntegralType", "FloatingPointType", 
			"ReferenceType", "ClassType", "ConstructorDec", "Parameters", "Parameter", 
			"ConstructorBody", "ConstructorInvocation", "Argument", "Statement", 
			"ForInit", "ForUpdate", "Expression", "Assignment", "LeftHandSide", "FieldAccess", 
			"ArrayAccess", "ConditionalExpression", "OrExpression", "AndExpression", 
			"EqualityExpression", "RelationalExpression", "AdditiveExpression", "MultiplicativeExpression", 
			"UnaireExpression", "UnaryExpression", "PrimaryExpression", "PACKAGE", 
			"IMPORT", "CLASS", "PUBLIC", "PRIVATE", "PROTECTED", "EXTENDS", "SUPER", 
			"THIS", "NEW", "IF", "ELSE", "FOR", "WHILE", "DO", "BREAK", "CONTINUE", 
			"RETURN", "ASSIGN", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "INCREMENT", 
			"DECREMENT", "OR", "AND", "NOT", "EQUAL", "NOTEQUAL", "LESS", "LESSEQUAL", 
			"GREATER", "GREATEREQUAL", "DOT", "COMMA", "SEMI", "COLON", "QUESTION", 
			"LCUR", "RCUR", "LPAR", "RPAR", "LBRACK", "RBRACK", "BOOL", "BYTE", "SHORT", 
			"LONG", "INT", "CHAR", "FLOAT", "DOUBLE", "WS", "LITERAL", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'package'", "'import'", 
			"'class'", "'public'", "'private'", "'protected'", "'extends'", "'super'", 
			"'this'", "'new'", "'if'", "'else'", "'for'", "'while'", "'do'", "'break'", 
			"'continue'", "'return'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", 
			"'--'", "'||'", "'&&'", "'!'", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'.'", "','", "';'", "':'", "'?'", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "'boolean'", "'byte'", "'short'", "'long'", "'int'", "'char'", 
			"'float'", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PackageDec", "ImportDec", "ClassDec", "Modifier", "Extends", "Body", 
			"BodyDec", "MethodDec", "Block", "BlockDec", "LocalDec", "MemberDec", 
			"Type", "PrimitiveType", "NumericType", "IntegralType", "FloatingPointType", 
			"ReferenceType", "ClassType", "ConstructorDec", "Parameters", "Parameter", 
			"ConstructorBody", "ConstructorInvocation", "Argument", "Statement", 
			"ForInit", "ForUpdate", "Expression", "Assignment", "LeftHandSide", "FieldAccess", 
			"ArrayAccess", "ConditionalExpression", "OrExpression", "AndExpression", 
			"EqualityExpression", "RelationalExpression", "AdditiveExpression", "MultiplicativeExpression", 
			"UnaireExpression", "UnaryExpression", "PrimaryExpression", "PACKAGE", 
			"IMPORT", "CLASS", "PUBLIC", "PRIVATE", "PROTECTED", "EXTENDS", "SUPER", 
			"THIS", "NEW", "IF", "ELSE", "FOR", "WHILE", "DO", "BREAK", "CONTINUE", 
			"RETURN", "ASSIGN", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "INCREMENT", 
			"DECREMENT", "OR", "AND", "NOT", "EQUAL", "NOTEQUAL", "LESS", "LESSEQUAL", 
			"GREATER", "GREATEREQUAL", "DOT", "COMMA", "SEMI", "COLON", "QUESTION", 
			"LCUR", "RCUR", "LPAR", "RPAR", "LBRACK", "RBRACK", "BOOL", "BYTE", "SHORT", 
			"LONG", "INT", "CHAR", "FLOAT", "DOUBLE", "WS", "LITERAL", "IDENTIFIER"
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


	public JCPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JCP.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2f\u0347\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u00de\n\4\3\4\3\4\3\5\3\5\3\5"+
		"\5\5\u00e5\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\7\7\u00ee\n\7\f\7\16\7\u00f1"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\5\b\u00f8\n\b\3\t\5\t\u00fb\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\7\n\u0104\n\n\f\n\16\n\u0107\13\n\3\n\3\n\3\13\3\13\5"+
		"\13\u010d\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\5\16\u0118\n\16\3"+
		"\17\3\17\5\17\u011c\n\17\3\20\3\20\5\20\u0120\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0127\n\21\3\22\3\22\5\22\u012b\n\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u0138\n\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\5\30\u0144\n\30\3\30\7\30\u0147\n\30\f"+
		"\30\16\30\u014a\13\30\3\30\3\30\3\31\3\31\3\31\5\31\u0151\n\31\3\31\3"+
		"\31\3\31\7\31\u0156\n\31\f\31\16\31\u0159\13\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u016a\n\33"+
		"\3\33\3\33\3\33\5\33\u016f\n\33\3\33\3\33\5\33\u0173\n\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u018e\n\33\3\33\3\33"+
		"\3\33\3\33\7\33\u0194\n\33\f\33\16\33\u0197\13\33\3\33\3\33\5\33\u019b"+
		"\n\33\3\34\3\34\5\34\u019f\n\34\3\35\3\35\3\36\3\36\5\36\u01a5\n\36\3"+
		"\37\3\37\3\37\3\37\3 \3 \5 \u01ad\n \3!\3!\3!\3!\7!\u01b3\n!\f!\16!\u01b6"+
		"\13!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u01c3\n#\3$\3$\3$\3$\7$"+
		"\u01c9\n$\f$\16$\u01cc\13$\3%\3%\3%\3%\7%\u01d2\n%\f%\16%\u01d5\13%\3"+
		"&\3&\3&\3&\3&\3&\3&\7&\u01de\n&\f&\16&\u01e1\13&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01f0\n\'\f\'\16\'\u01f3\13\'\3(\3"+
		"(\3(\3(\3(\3(\3(\7(\u01fc\n(\f(\16(\u01ff\13(\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\7)\u020b\n)\f)\16)\u020e\13)\3*\3*\3*\3*\3*\3*\3*\7*\u0217\n*\f"+
		"*\16*\u021a\13*\3+\3+\3+\3+\3+\3+\5+\u0222\n+\3+\3+\3+\3+\3+\5+\u0229"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0237\n,\3,\3,\3,\7,\u023c"+
		"\n,\f,\16,\u023f\13,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5"+
		",\u0251\n,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\38\39\3"+
		"9\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3"+
		"E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3M\3"+
		"M\3M\3N\3N\3O\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3"+
		"X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]"+
		"\3]\3]\3]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a"+
		"\3b\3b\3b\3b\3b\3b\3b\3c\6c\u0332\nc\rc\16c\u0333\3c\3c\3d\6d\u0339\n"+
		"d\rd\16d\u033a\3e\6e\u033e\ne\re\16e\u033f\3e\7e\u0343\ne\fe\16e\u0346"+
		"\13e\2\2f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3"+
		"[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7"+
		"e\u00c9f\3\2\6\5\2\13\f\17\17\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\2"+
		"\u038e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2"+
		"\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\3\u00cb"+
		"\3\2\2\2\5\u00d2\3\2\2\2\7\u00d9\3\2\2\2\t\u00e4\3\2\2\2\13\u00e6\3\2"+
		"\2\2\r\u00eb\3\2\2\2\17\u00f7\3\2\2\2\21\u00fa\3\2\2\2\23\u0101\3\2\2"+
		"\2\25\u010c\3\2\2\2\27\u010e\3\2\2\2\31\u0112\3\2\2\2\33\u0117\3\2\2\2"+
		"\35\u011b\3\2\2\2\37\u011f\3\2\2\2!\u0126\3\2\2\2#\u012a\3\2\2\2%\u012c"+
		"\3\2\2\2\'\u012e\3\2\2\2)\u0130\3\2\2\2+\u0135\3\2\2\2-\u013e\3\2\2\2"+
		"/\u0141\3\2\2\2\61\u014d\3\2\2\2\63\u015c\3\2\2\2\65\u019a\3\2\2\2\67"+
		"\u019e\3\2\2\29\u01a0\3\2\2\2;\u01a4\3\2\2\2=\u01a6\3\2\2\2?\u01ac\3\2"+
		"\2\2A\u01ae\3\2\2\2C\u01b7\3\2\2\2E\u01bc\3\2\2\2G\u01c4\3\2\2\2I\u01cd"+
		"\3\2\2\2K\u01d6\3\2\2\2M\u01e2\3\2\2\2O\u01f4\3\2\2\2Q\u0200\3\2\2\2S"+
		"\u020f\3\2\2\2U\u0228\3\2\2\2W\u0250\3\2\2\2Y\u0252\3\2\2\2[\u025a\3\2"+
		"\2\2]\u0261\3\2\2\2_\u0267\3\2\2\2a\u026e\3\2\2\2c\u0276\3\2\2\2e\u0280"+
		"\3\2\2\2g\u0288\3\2\2\2i\u028e\3\2\2\2k\u0293\3\2\2\2m\u0297\3\2\2\2o"+
		"\u029a\3\2\2\2q\u029f\3\2\2\2s\u02a3\3\2\2\2u\u02a9\3\2\2\2w\u02ac\3\2"+
		"\2\2y\u02b2\3\2\2\2{\u02bb\3\2\2\2}\u02c2\3\2\2\2\177\u02c4\3\2\2\2\u0081"+
		"\u02c6\3\2\2\2\u0083\u02c8\3\2\2\2\u0085\u02ca\3\2\2\2\u0087\u02cc\3\2"+
		"\2\2\u0089\u02ce\3\2\2\2\u008b\u02d1\3\2\2\2\u008d\u02d4\3\2\2\2\u008f"+
		"\u02d7\3\2\2\2\u0091\u02da\3\2\2\2\u0093\u02dc\3\2\2\2\u0095\u02df\3\2"+
		"\2\2\u0097\u02e2\3\2\2\2\u0099\u02e4\3\2\2\2\u009b\u02e7\3\2\2\2\u009d"+
		"\u02e9\3\2\2\2\u009f\u02ec\3\2\2\2\u00a1\u02ee\3\2\2\2\u00a3\u02f0\3\2"+
		"\2\2\u00a5\u02f2\3\2\2\2\u00a7\u02f4\3\2\2\2\u00a9\u02f6\3\2\2\2\u00ab"+
		"\u02f8\3\2\2\2\u00ad\u02fa\3\2\2\2\u00af\u02fc\3\2\2\2\u00b1\u02fe\3\2"+
		"\2\2\u00b3\u0300\3\2\2\2\u00b5\u0302\3\2\2\2\u00b7\u030a\3\2\2\2\u00b9"+
		"\u030f\3\2\2\2\u00bb\u0315\3\2\2\2\u00bd\u031a\3\2\2\2\u00bf\u031e\3\2"+
		"\2\2\u00c1\u0323\3\2\2\2\u00c3\u0329\3\2\2\2\u00c5\u0331\3\2\2\2\u00c7"+
		"\u0338\3\2\2\2\u00c9\u033d\3\2\2\2\u00cb\u00cc\5Y-\2\u00cc\u00cd\5\u00c9"+
		"e\2\u00cd\u00ce\5\u009fP\2\u00ce\u00cf\5\u00c9e\2\u00cf\u00d0\3\2\2\2"+
		"\u00d0\u00d1\5\u00a3R\2\u00d1\4\3\2\2\2\u00d2\u00d3\5[.\2\u00d3\u00d4"+
		"\5\u00c9e\2\u00d4\u00d5\5\u009fP\2\u00d5\u00d6\5\u00c9e\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\5\u00a3R\2\u00d8\6\3\2\2\2\u00d9\u00da\5\t\5\2\u00da"+
		"\u00db\5]/\2\u00db\u00dd\5\u00c9e\2\u00dc\u00de\5\13\6\2\u00dd\u00dc\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\5\r\7\2\u00e0"+
		"\b\3\2\2\2\u00e1\u00e5\5_\60\2\u00e2\u00e5\5a\61\2\u00e3\u00e5\5c\62\2"+
		"\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\n\3"+
		"\2\2\2\u00e6\u00e7\5e\63\2\u00e7\u00e8\5\u00c9e\2\u00e8\u00e9\5\u009f"+
		"P\2\u00e9\u00ea\5\u00c9e\2\u00ea\f\3\2\2\2\u00eb\u00ef\5\u00a9U\2\u00ec"+
		"\u00ee\5\17\b\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f3\5\u00abV\2\u00f3\16\3\2\2\2\u00f4\u00f8\5\31\r\2\u00f5\u00f8\5"+
		")\25\2\u00f6\u00f8\5\21\t\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\20\3\2\2\2\u00f9\u00fb\5\t\5\2\u00fa\u00f9\3\2\2"+
		"\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\5\33\16\2\u00fd"+
		"\u00fe\5\u00c9e\2\u00fe\u00ff\5+\26\2\u00ff\u0100\5\23\n\2\u0100\22\3"+
		"\2\2\2\u0101\u0105\5\u00a9U\2\u0102\u0104\5\25\13\2\u0103\u0102\3\2\2"+
		"\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\5\u00abV\2\u0109\24\3\2\2\2\u010a"+
		"\u010d\5\27\f\2\u010b\u010d\5\65\33\2\u010c\u010a\3\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\26\3\2\2\2\u010e\u010f\5\33\16\2\u010f\u0110\5\u00c9e\2"+
		"\u0110\u0111\5\u00a3R\2\u0111\30\3\2\2\2\u0112\u0113\5\t\5\2\u0113\u0114"+
		"\5\27\f\2\u0114\32\3\2\2\2\u0115\u0118\5\35\17\2\u0116\u0118\5%\23\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\34\3\2\2\2\u0119\u011c\5\37\20"+
		"\2\u011a\u011c\5\u00b5[\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\36\3\2\2\2\u011d\u0120\5!\21\2\u011e\u0120\5#\22\2\u011f\u011d\3\2\2"+
		"\2\u011f\u011e\3\2\2\2\u0120 \3\2\2\2\u0121\u0127\5\u00b7\\\2\u0122\u0127"+
		"\5\u00b9]\2\u0123\u0127\5\u00bd_\2\u0124\u0127\5\u00bb^\2\u0125\u0127"+
		"\5\u00bf`\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2"+
		"\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\"\3\2\2\2\u0128\u012b"+
		"\5\u00c1a\2\u0129\u012b\5\u00c3b\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2"+
		"\2\2\u012b$\3\2\2\2\u012c\u012d\5\'\24\2\u012d&\3\2\2\2\u012e\u012f\5"+
		"\u00c9e\2\u012f(\3\2\2\2\u0130\u0131\5\t\5\2\u0131\u0132\5\u00c9e\2\u0132"+
		"\u0133\5+\26\2\u0133\u0134\5/\30\2\u0134*\3\2\2\2\u0135\u0137\5\u00ad"+
		"W\2\u0136\u0138\5-\27\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\5\u00a1Q\2\u013a\u013b\5-\27\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013d\5\u00afX\2\u013d,\3\2\2\2\u013e\u013f\5\33\16\2\u013f"+
		"\u0140\5\u00c9e\2\u0140.\3\2\2\2\u0141\u0143\5\u00a9U\2\u0142\u0144\5"+
		"\61\31\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0148\3\2\2\2\u0145"+
		"\u0147\5\65\33\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014c\5\u00abV\2\u014c\60\3\2\2\2\u014d\u014e\5g\64\2\u014e\u0150\5\u00ad"+
		"W\2\u014f\u0151\5\63\32\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0157\3\2\2\2\u0152\u0153\5\u00a1Q\2\u0153\u0154\5\63\32\2\u0154\u0156"+
		"\3\2\2\2\u0155\u0152\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\5\u00af"+
		"X\2\u015b\62\3\2\2\2\u015c\u015d\5\u00c9e\2\u015d\64\3\2\2\2\u015e\u015f"+
		"\5;\36\2\u015f\u0160\5\u00a3R\2\u0160\u019b\3\2\2\2\u0161\u0162\5m\67"+
		"\2\u0162\u0163\5\u00adW\2\u0163\u0164\5;\36\2\u0164\u0165\5\u00afX\2\u0165"+
		"\u0169\5\65\33\2\u0166\u0167\5o8\2\u0167\u0168\5\65\33\2\u0168\u016a\3"+
		"\2\2\2\u0169\u0166\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u019b\3\2\2\2\u016b"+
		"\u016c\5q9\2\u016c\u016e\5\u00adW\2\u016d\u016f\5\67\34\2\u016e\u016d"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\5\u00a3R"+
		"\2\u0171\u0173\59\35\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0175\5\u00afX\2\u0175\u0176\5\65\33\2\u0176\u019b\3\2"+
		"\2\2\u0177\u0178\5s:\2\u0178\u0179\5\u00adW\2\u0179\u017a\5;\36\2\u017a"+
		"\u017b\5\u00afX\2\u017b\u017c\5\65\33\2\u017c\u019b\3\2\2\2\u017d\u017e"+
		"\5u;\2\u017e\u017f\5\65\33\2\u017f\u0180\5s:\2\u0180\u0181\5\u00adW\2"+
		"\u0181\u0182\5;\36\2\u0182\u0183\5\u00afX\2\u0183\u0184\5\u00a3R\2\u0184"+
		"\u019b\3\2\2\2\u0185\u0186\5w<\2\u0186\u0187\5\u00a3R\2\u0187\u019b\3"+
		"\2\2\2\u0188\u0189\5y=\2\u0189\u018a\5\u00a3R\2\u018a\u019b\3\2\2\2\u018b"+
		"\u018d\5{>\2\u018c\u018e\5;\36\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2"+
		"\2\u018e\u018f\3\2\2\2\u018f\u0190\5\u00a3R\2\u0190\u019b\3\2\2\2\u0191"+
		"\u0195\5\u00a9U\2\u0192\u0194\5\25\13\2\u0193\u0192\3\2\2\2\u0194\u0197"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u0199\5\u00abV\2\u0199\u019b\3\2\2\2\u019a\u015e"+
		"\3\2\2\2\u019a\u0161\3\2\2\2\u019a\u016b\3\2\2\2\u019a\u0177\3\2\2\2\u019a"+
		"\u017d\3\2\2\2\u019a\u0185\3\2\2\2\u019a\u0188\3\2\2\2\u019a\u018b\3\2"+
		"\2\2\u019a\u0191\3\2\2\2\u019b\66\3\2\2\2\u019c\u019f\5\27\f\2\u019d\u019f"+
		"\5;\36\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f8\3\2\2\2\u01a0"+
		"\u01a1\5;\36\2\u01a1:\3\2\2\2\u01a2\u01a5\5=\37\2\u01a3\u01a5\5E#\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5<\3\2\2\2\u01a6\u01a7\5? \2\u01a7"+
		"\u01a8\5}?\2\u01a8\u01a9\5;\36\2\u01a9>\3\2\2\2\u01aa\u01ad\5A!\2\u01ab"+
		"\u01ad\5C\"\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad@\3\2\2\2\u01ae"+
		"\u01b4\5\u00c9e\2\u01af\u01b0\5\u009fP\2\u01b0\u01b1\5\u00c9e\2\u01b1"+
		"\u01b3\3\2\2\2\u01b2\u01af\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5B\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8"+
		"\5\u00c9e\2\u01b8\u01b9\5\u00b1Y\2\u01b9\u01ba\5\u00c7d\2\u01ba\u01bb"+
		"\5\u00b3Z\2\u01bbD\3\2\2\2\u01bc\u01c2\5G$\2\u01bd\u01be\5\u00a7T\2\u01be"+
		"\u01bf\5;\36\2\u01bf\u01c0\5\u00a5S\2\u01c0\u01c1\5;\36\2\u01c1\u01c3"+
		"\3\2\2\2\u01c2\u01bd\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3F\3\2\2\2\u01c4"+
		"\u01ca\5I%\2\u01c5\u01c6\5\u008dG\2\u01c6\u01c7\5I%\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01c5\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cbH\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d3\5K&\2\u01ce"+
		"\u01cf\5\u008fH\2\u01cf\u01d0\5K&\2\u01d0\u01d2\3\2\2\2\u01d1\u01ce\3"+
		"\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"J\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01df\5M\'\2\u01d7\u01d8\5\u0093J"+
		"\2\u01d8\u01d9\5M\'\2\u01d9\u01de\3\2\2\2\u01da\u01db\5\u0095K\2\u01db"+
		"\u01dc\5M\'\2\u01dc\u01de\3\2\2\2\u01dd\u01d7\3\2\2\2\u01dd\u01da\3\2"+
		"\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"L\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01f1\5O(\2\u01e3\u01e4\5\u0097L\2"+
		"\u01e4\u01e5\5O(\2\u01e5\u01f0\3\2\2\2\u01e6\u01e7\5\u0099M\2\u01e7\u01e8"+
		"\5O(\2\u01e8\u01f0\3\2\2\2\u01e9\u01ea\5\u009bN\2\u01ea\u01eb\5O(\2\u01eb"+
		"\u01f0\3\2\2\2\u01ec\u01ed\5\u009dO\2\u01ed\u01ee\5O(\2\u01ee\u01f0\3"+
		"\2\2\2\u01ef\u01e3\3\2\2\2\u01ef\u01e6\3\2\2\2\u01ef\u01e9\3\2\2\2\u01ef"+
		"\u01ec\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2N\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01fd\5Q)\2\u01f5\u01f6"+
		"\5\177@\2\u01f6\u01f7\5Q)\2\u01f7\u01fc\3\2\2\2\u01f8\u01f9\5\u0081A\2"+
		"\u01f9\u01fa\5Q)\2\u01fa\u01fc\3\2\2\2\u01fb\u01f5\3\2\2\2\u01fb\u01f8"+
		"\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"P\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u020c\5U+\2\u0201\u0202\5\u0083B\2"+
		"\u0202\u0203\5U+\2\u0203\u020b\3\2\2\2\u0204\u0205\5\u0085C\2\u0205\u0206"+
		"\5U+\2\u0206\u020b\3\2\2\2\u0207\u0208\5\u0087D\2\u0208\u0209\5U+\2\u0209"+
		"\u020b\3\2\2\2\u020a\u0201\3\2\2\2\u020a\u0204\3\2\2\2\u020a\u0207\3\2"+
		"\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"R\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0218\5W,\2\u0210\u0211\5\177@\2\u0211"+
		"\u0212\5U+\2\u0212\u0217\3\2\2\2\u0213\u0214\5\u0081A\2\u0214\u0215\5"+
		"U+\2\u0215\u0217\3\2\2\2\u0216\u0210\3\2\2\2\u0216\u0213\3\2\2\2\u0217"+
		"\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219T\3\2\2\2"+
		"\u021a\u0218\3\2\2\2\u021b\u021c\5\177@\2\u021c\u021d\5U+\2\u021d\u0222"+
		"\3\2\2\2\u021e\u021f\5\u0081A\2\u021f\u0220\5U+\2\u0220\u0222\3\2\2\2"+
		"\u0221\u021b\3\2\2\2\u0221\u021e\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224"+
		"\5U+\2\u0224\u0229\3\2\2\2\u0225\u0226\5\u0091I\2\u0226\u0227\5U+\2\u0227"+
		"\u0229\3\2\2\2\u0228\u0221\3\2\2\2\u0228\u0225\3\2\2\2\u0229V\3\2\2\2"+
		"\u022a\u0251\5\u00c7d\2\u022b\u0251\5\u00c9e\2\u022c\u0251\5i\65\2\u022d"+
		"\u0251\5g\64\2\u022e\u022f\5\u00adW\2\u022f\u0230\5;\36\2\u0230\u0231"+
		"\5\u00afX\2\u0231\u0251\3\2\2\2\u0232\u0233\5k\66\2\u0233\u0234\5\'\24"+
		"\2\u0234\u0236\5\u00adW\2\u0235\u0237\5\63\32\2\u0236\u0235\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u023d\3\2\2\2\u0238\u0239\5\u00a1Q\2\u0239\u023a"+
		"\5\63\32\2\u023a\u023c\3\2\2\2\u023b\u0238\3\2\2\2\u023c\u023f\3\2\2\2"+
		"\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d"+
		"\3\2\2\2\u0240\u0241\5\u00afX\2\u0241\u0251\3\2\2\2\u0242\u0243\5\u0091"+
		"I\2\u0243\u0244\5U+\2\u0244\u0251\3\2\2\2\u0245\u0246\5\u0089E\2\u0246"+
		"\u0247\5U+\2\u0247\u0251\3\2\2\2\u0248\u0249\5\u008bF\2\u0249\u024a\5"+
		"U+\2\u024a\u0251\3\2\2\2\u024b\u024c\5\33\16\2\u024c\u024d\5\u00adW\2"+
		"\u024d\u024e\5;\36\2\u024e\u024f\5\u00afX\2\u024f\u0251\3\2\2\2\u0250"+
		"\u022a\3\2\2\2\u0250\u022b\3\2\2\2\u0250\u022c\3\2\2\2\u0250\u022d\3\2"+
		"\2\2\u0250\u022e\3\2\2\2\u0250\u0232\3\2\2\2\u0250\u0242\3\2\2\2\u0250"+
		"\u0245\3\2\2\2\u0250\u0248\3\2\2\2\u0250\u024b\3\2\2\2\u0251X\3\2\2\2"+
		"\u0252\u0253\7r\2\2\u0253\u0254\7c\2\2\u0254\u0255\7e\2\2\u0255\u0256"+
		"\7m\2\2\u0256\u0257\7c\2\2\u0257\u0258\7i\2\2\u0258\u0259\7g\2\2\u0259"+
		"Z\3\2\2\2\u025a\u025b\7k\2\2\u025b\u025c\7o\2\2\u025c\u025d\7r\2\2\u025d"+
		"\u025e\7q\2\2\u025e\u025f\7t\2\2\u025f\u0260\7v\2\2\u0260\\\3\2\2\2\u0261"+
		"\u0262\7e\2\2\u0262\u0263\7n\2\2\u0263\u0264\7c\2\2\u0264\u0265\7u\2\2"+
		"\u0265\u0266\7u\2\2\u0266^\3\2\2\2\u0267\u0268\7r\2\2\u0268\u0269\7w\2"+
		"\2\u0269\u026a\7d\2\2\u026a\u026b\7n\2\2\u026b\u026c\7k\2\2\u026c\u026d"+
		"\7e\2\2\u026d`\3\2\2\2\u026e\u026f\7r\2\2\u026f\u0270\7t\2\2\u0270\u0271"+
		"\7k\2\2\u0271\u0272\7x\2\2\u0272\u0273\7c\2\2\u0273\u0274\7v\2\2\u0274"+
		"\u0275\7g\2\2\u0275b\3\2\2\2\u0276\u0277\7r\2\2\u0277\u0278\7t\2\2\u0278"+
		"\u0279\7q\2\2\u0279\u027a\7v\2\2\u027a\u027b\7g\2\2\u027b\u027c\7e\2\2"+
		"\u027c\u027d\7v\2\2\u027d\u027e\7g\2\2\u027e\u027f\7f\2\2\u027fd\3\2\2"+
		"\2\u0280\u0281\7g\2\2\u0281\u0282\7z\2\2\u0282\u0283\7v\2\2\u0283\u0284"+
		"\7g\2\2\u0284\u0285\7p\2\2\u0285\u0286\7f\2\2\u0286\u0287\7u\2\2\u0287"+
		"f\3\2\2\2\u0288\u0289\7u\2\2\u0289\u028a\7w\2\2\u028a\u028b\7r\2\2\u028b"+
		"\u028c\7g\2\2\u028c\u028d\7t\2\2\u028dh\3\2\2\2\u028e\u028f\7v\2\2\u028f"+
		"\u0290\7j\2\2\u0290\u0291\7k\2\2\u0291\u0292\7u\2\2\u0292j\3\2\2\2\u0293"+
		"\u0294\7p\2\2\u0294\u0295\7g\2\2\u0295\u0296\7y\2\2\u0296l\3\2\2\2\u0297"+
		"\u0298\7k\2\2\u0298\u0299\7h\2\2\u0299n\3\2\2\2\u029a\u029b\7g\2\2\u029b"+
		"\u029c\7n\2\2\u029c\u029d\7u\2\2\u029d\u029e\7g\2\2\u029ep\3\2\2\2\u029f"+
		"\u02a0\7h\2\2\u02a0\u02a1\7q\2\2\u02a1\u02a2\7t\2\2\u02a2r\3\2\2\2\u02a3"+
		"\u02a4\7y\2\2\u02a4\u02a5\7j\2\2\u02a5\u02a6\7k\2\2\u02a6\u02a7\7n\2\2"+
		"\u02a7\u02a8\7g\2\2\u02a8t\3\2\2\2\u02a9\u02aa\7f\2\2\u02aa\u02ab\7q\2"+
		"\2\u02abv\3\2\2\2\u02ac\u02ad\7d\2\2\u02ad\u02ae\7t\2\2\u02ae\u02af\7"+
		"g\2\2\u02af\u02b0\7c\2\2\u02b0\u02b1\7m\2\2\u02b1x\3\2\2\2\u02b2\u02b3"+
		"\7e\2\2\u02b3\u02b4\7q\2\2\u02b4\u02b5\7p\2\2\u02b5\u02b6\7v\2\2\u02b6"+
		"\u02b7\7k\2\2\u02b7\u02b8\7p\2\2\u02b8\u02b9\7w\2\2\u02b9\u02ba\7g\2\2"+
		"\u02baz\3\2\2\2\u02bb\u02bc\7t\2\2\u02bc\u02bd\7g\2\2\u02bd\u02be\7v\2"+
		"\2\u02be\u02bf\7w\2\2\u02bf\u02c0\7t\2\2\u02c0\u02c1\7p\2\2\u02c1|\3\2"+
		"\2\2\u02c2\u02c3\7?\2\2\u02c3~\3\2\2\2\u02c4\u02c5\7-\2\2\u02c5\u0080"+
		"\3\2\2\2\u02c6\u02c7\7/\2\2\u02c7\u0082\3\2\2\2\u02c8\u02c9\7,\2\2\u02c9"+
		"\u0084\3\2\2\2\u02ca\u02cb\7\61\2\2\u02cb\u0086\3\2\2\2\u02cc\u02cd\7"+
		"\'\2\2\u02cd\u0088\3\2\2\2\u02ce\u02cf\7-\2\2\u02cf\u02d0\7-\2\2\u02d0"+
		"\u008a\3\2\2\2\u02d1\u02d2\7/\2\2\u02d2\u02d3\7/\2\2\u02d3\u008c\3\2\2"+
		"\2\u02d4\u02d5\7~\2\2\u02d5\u02d6\7~\2\2\u02d6\u008e\3\2\2\2\u02d7\u02d8"+
		"\7(\2\2\u02d8\u02d9\7(\2\2\u02d9\u0090\3\2\2\2\u02da\u02db\7#\2\2\u02db"+
		"\u0092\3\2\2\2\u02dc\u02dd\7?\2\2\u02dd\u02de\7?\2\2\u02de\u0094\3\2\2"+
		"\2\u02df\u02e0\7#\2\2\u02e0\u02e1\7?\2\2\u02e1\u0096\3\2\2\2\u02e2\u02e3"+
		"\7>\2\2\u02e3\u0098\3\2\2\2\u02e4\u02e5\7>\2\2\u02e5\u02e6\7?\2\2\u02e6"+
		"\u009a\3\2\2\2\u02e7\u02e8\7@\2\2\u02e8\u009c\3\2\2\2\u02e9\u02ea\7@\2"+
		"\2\u02ea\u02eb\7?\2\2\u02eb\u009e\3\2\2\2\u02ec\u02ed\7\60\2\2\u02ed\u00a0"+
		"\3\2\2\2\u02ee\u02ef\7.\2\2\u02ef\u00a2\3\2\2\2\u02f0\u02f1\7=\2\2\u02f1"+
		"\u00a4\3\2\2\2\u02f2\u02f3\7<\2\2\u02f3\u00a6\3\2\2\2\u02f4\u02f5\7A\2"+
		"\2\u02f5\u00a8\3\2\2\2\u02f6\u02f7\7}\2\2\u02f7\u00aa\3\2\2\2\u02f8\u02f9"+
		"\7\177\2\2\u02f9\u00ac\3\2\2\2\u02fa\u02fb\7*\2\2\u02fb\u00ae\3\2\2\2"+
		"\u02fc\u02fd\7+\2\2\u02fd\u00b0\3\2\2\2\u02fe\u02ff\7]\2\2\u02ff\u00b2"+
		"\3\2\2\2\u0300\u0301\7_\2\2\u0301\u00b4\3\2\2\2\u0302\u0303\7d\2\2\u0303"+
		"\u0304\7q\2\2\u0304\u0305\7q\2\2\u0305\u0306\7n\2\2\u0306\u0307\7g\2\2"+
		"\u0307\u0308\7c\2\2\u0308\u0309\7p\2\2\u0309\u00b6\3\2\2\2\u030a\u030b"+
		"\7d\2\2\u030b\u030c\7{\2\2\u030c\u030d\7v\2\2\u030d\u030e\7g\2\2\u030e"+
		"\u00b8\3\2\2\2\u030f\u0310\7u\2\2\u0310\u0311\7j\2\2\u0311\u0312\7q\2"+
		"\2\u0312\u0313\7t\2\2\u0313\u0314\7v\2\2\u0314\u00ba\3\2\2\2\u0315\u0316"+
		"\7n\2\2\u0316\u0317\7q\2\2\u0317\u0318\7p\2\2\u0318\u0319\7i\2\2\u0319"+
		"\u00bc\3\2\2\2\u031a\u031b\7k\2\2\u031b\u031c\7p\2\2\u031c\u031d\7v\2"+
		"\2\u031d\u00be\3\2\2\2\u031e\u031f\7e\2\2\u031f\u0320\7j\2\2\u0320\u0321"+
		"\7c\2\2\u0321\u0322\7t\2\2\u0322\u00c0\3\2\2\2\u0323\u0324\7h\2\2\u0324"+
		"\u0325\7n\2\2\u0325\u0326\7q\2\2\u0326\u0327\7c\2\2\u0327\u0328\7v\2\2"+
		"\u0328\u00c2\3\2\2\2\u0329\u032a\7f\2\2\u032a\u032b\7q\2\2\u032b\u032c"+
		"\7w\2\2\u032c\u032d\7d\2\2\u032d\u032e\7n\2\2\u032e\u032f\7g\2\2\u032f"+
		"\u00c4\3\2\2\2\u0330\u0332\t\2\2\2\u0331\u0330\3\2\2\2\u0332\u0333\3\2"+
		"\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335"+
		"\u0336\bc\2\2\u0336\u00c6\3\2\2\2\u0337\u0339\t\3\2\2\u0338\u0337\3\2"+
		"\2\2\u0339\u033a\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u00c8\3\2\2\2\u033c\u033e\t\4\2\2\u033d\u033c\3\2\2\2\u033e\u033f\3\2"+
		"\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0344\3\2\2\2\u0341"+
		"\u0343\t\5\2\2\u0342\u0341\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2"+
		"\2\2\u0344\u0345\3\2\2\2\u0345\u00ca\3\2\2\2\u0346\u0344\3\2\2\2\64\2"+
		"\u00dd\u00e4\u00ef\u00f7\u00fa\u0105\u010c\u0117\u011b\u011f\u0126\u012a"+
		"\u0137\u0143\u0148\u0150\u0157\u0169\u016e\u0172\u018d\u0195\u019a\u019e"+
		"\u01a4\u01ac\u01b4\u01c2\u01ca\u01d3\u01dd\u01df\u01ef\u01f1\u01fb\u01fd"+
		"\u020a\u020c\u0216\u0218\u0221\u0228\u0236\u023d\u0250\u0333\u033a\u033f"+
		"\u0344\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}