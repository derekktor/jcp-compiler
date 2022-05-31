// Generated from /mnt/d/Coding/tkik/jcp-compiler/attempt2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class attempt2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Modifier=1, Extends=2, Body=3, BodyDec=4, MethodDec=5, Block=6, BlockDec=7, 
		LocalDec=8, MemberDec=9, Type=10, PrimitiveType=11, NumericType=12, IntegralType=13, 
		FloatingPointType=14, ReferenceType=15, ClassType=16, ConstructorDec=17, 
		Parameters=18, Parameter=19, ConstructorBody=20, ConstructorInvocation=21, 
		Argument=22, Statement=23, ForInit=24, ForUpdate=25, Expression=26, Assignment=27, 
		LeftHandSide=28, FieldAccess=29, ArrayAccess=30, ConditionalExpression=31, 
		OrExpression=32, AndExpression=33, EqualityExpression=34, RelationalExpression=35, 
		AdditiveExpression=36, MultiplicativeExpression=37, UnaireExpression=38, 
		UnaryExpression=39, PrimaryExpression=40, PACKAGE=41, IMPORT=42, CLASS=43, 
		PUBLIC=44, PRIVATE=45, PROTECTED=46, EXTENDS=47, SUPER=48, THIS=49, NEW=50, 
		IF=51, ELSE=52, FOR=53, WHILE=54, DO=55, BREAK=56, CONTINUE=57, RETURN=58, 
		ASSIGN=59, PLUS=60, MINUS=61, MULTIPLY=62, DIVIDE=63, MOD=64, INCREMENT=65, 
		DECREMENT=66, OR=67, AND=68, NOT=69, EQUAL=70, NOTEQUAL=71, LESS=72, LESSEQUAL=73, 
		GREATER=74, GREATEREQUAL=75, DOT=76, COMMA=77, SEMI=78, COLON=79, QUESTION=80, 
		LCUR=81, RCUR=82, LPAR=83, RPAR=84, LBRACK=85, RBRACK=86, BOOL=87, BYTE=88, 
		SHORT=89, LONG=90, INT=91, CHAR=92, FLOAT=93, DOUBLE=94, WS=95, LITERAL=96, 
		IDENTIFIER=97;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Modifier", "Extends", "Body", "BodyDec", "MethodDec", "Block", "BlockDec", 
			"LocalDec", "MemberDec", "Type", "PrimitiveType", "NumericType", "IntegralType", 
			"FloatingPointType", "ReferenceType", "ClassType", "ConstructorDec", 
			"Parameters", "Parameter", "ConstructorBody", "ConstructorInvocation", 
			"Argument", "Statement", "ForInit", "ForUpdate", "Expression", "Assignment", 
			"LeftHandSide", "FieldAccess", "ArrayAccess", "ConditionalExpression", 
			"OrExpression", "AndExpression", "EqualityExpression", "RelationalExpression", 
			"AdditiveExpression", "MultiplicativeExpression", "UnaireExpression", 
			"UnaryExpression", "PrimaryExpression", "PACKAGE", "IMPORT", "CLASS", 
			"PUBLIC", "PRIVATE", "PROTECTED", "EXTENDS", "SUPER", "THIS", "NEW", 
			"IF", "ELSE", "FOR", "WHILE", "DO", "BREAK", "CONTINUE", "RETURN", "ASSIGN", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "INCREMENT", "DECREMENT", 
			"OR", "AND", "NOT", "EQUAL", "NOTEQUAL", "LESS", "LESSEQUAL", "GREATER", 
			"GREATEREQUAL", "DOT", "COMMA", "SEMI", "COLON", "QUESTION", "LCUR", 
			"RCUR", "LPAR", "RPAR", "LBRACK", "RBRACK", "BOOL", "BYTE", "SHORT", 
			"LONG", "INT", "CHAR", "FLOAT", "DOUBLE", "WS", "LITERAL", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'package'", "'import'", "'class'", "'public'", 
			"'private'", "'protected'", "'extends'", "'super'", "'this'", "'new'", 
			"'if'", "'else'", "'for'", "'while'", "'do'", "'break'", "'continue'", 
			"'return'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
			"'||'", "'&&'", "'!'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'.'", "','", "';'", "':'", "'?'", "'{'", "'}'", "'('", "')'", "'['", 
			"']'", "'boolean'", "'byte'", "'short'", "'long'", "'int'", "'char'", 
			"'float'", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Modifier", "Extends", "Body", "BodyDec", "MethodDec", "Block", 
			"BlockDec", "LocalDec", "MemberDec", "Type", "PrimitiveType", "NumericType", 
			"IntegralType", "FloatingPointType", "ReferenceType", "ClassType", "ConstructorDec", 
			"Parameters", "Parameter", "ConstructorBody", "ConstructorInvocation", 
			"Argument", "Statement", "ForInit", "ForUpdate", "Expression", "Assignment", 
			"LeftHandSide", "FieldAccess", "ArrayAccess", "ConditionalExpression", 
			"OrExpression", "AndExpression", "EqualityExpression", "RelationalExpression", 
			"AdditiveExpression", "MultiplicativeExpression", "UnaireExpression", 
			"UnaryExpression", "PrimaryExpression", "PACKAGE", "IMPORT", "CLASS", 
			"PUBLIC", "PRIVATE", "PROTECTED", "EXTENDS", "SUPER", "THIS", "NEW", 
			"IF", "ELSE", "FOR", "WHILE", "DO", "BREAK", "CONTINUE", "RETURN", "ASSIGN", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "INCREMENT", "DECREMENT", 
			"OR", "AND", "NOT", "EQUAL", "NOTEQUAL", "LESS", "LESSEQUAL", "GREATER", 
			"GREATEREQUAL", "DOT", "COMMA", "SEMI", "COLON", "QUESTION", "LCUR", 
			"RCUR", "LPAR", "RPAR", "LBRACK", "RBRACK", "BOOL", "BYTE", "SHORT", 
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


	public attempt2Lexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2c\u0330\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\3\2\3\2\3\2\5\2\u00c9\n\2\3\3\3\3\3\3\3\3\3\3\7\3\u00d0"+
		"\n\3\f\3\16\3\u00d3\13\3\3\4\3\4\7\4\u00d7\n\4\f\4\16\4\u00da\13\4\3\4"+
		"\3\4\3\5\3\5\3\5\5\5\u00e1\n\5\3\6\5\6\u00e4\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\7\7\u00ed\n\7\f\7\16\7\u00f0\13\7\3\7\3\7\3\b\3\b\5\b\u00f6\n\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\5\13\u0101\n\13\3\f\3\f\5\f\u0105"+
		"\n\f\3\r\3\r\5\r\u0109\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0110\n\16\3"+
		"\17\3\17\5\17\u0114\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\5\23\u0121\n\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\5\25\u012d\n\25\3\25\7\25\u0130\n\25\f\25\16\25\u0133\13\25\3\25"+
		"\3\25\3\26\3\26\3\26\5\26\u013a\n\26\3\26\3\26\3\26\7\26\u013f\n\26\f"+
		"\26\16\26\u0142\13\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0153\n\30\3\30\3\30\3\30\5\30\u0158\n"+
		"\30\3\30\3\30\5\30\u015c\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0177\n\30\3\30\3\30\3\30\3\30\7\30\u017d\n\30\f"+
		"\30\16\30\u0180\13\30\3\30\3\30\5\30\u0184\n\30\3\31\3\31\5\31\u0188\n"+
		"\31\3\32\3\32\3\33\3\33\5\33\u018e\n\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\5\35\u0196\n\35\3\36\3\36\3\36\3\36\7\36\u019c\n\36\f\36\16\36\u019f"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u01ac\n \3!\3!\3"+
		"!\3!\7!\u01b2\n!\f!\16!\u01b5\13!\3\"\3\"\3\"\3\"\7\"\u01bb\n\"\f\"\16"+
		"\"\u01be\13\"\3#\3#\3#\3#\3#\3#\3#\7#\u01c7\n#\f#\16#\u01ca\13#\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u01d9\n$\f$\16$\u01dc\13$\3%\3%\3"+
		"%\3%\3%\3%\3%\7%\u01e5\n%\f%\16%\u01e8\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\7&\u01f4\n&\f&\16&\u01f7\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0200"+
		"\n\'\f\'\16\'\u0203\13\'\3(\3(\3(\3(\3(\3(\5(\u020b\n(\3(\3(\3(\3(\3("+
		"\5(\u0212\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0220\n)\3)\3)\3)"+
		"\7)\u0225\n)\f)\16)\u0228\13)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u023a\n)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3;\3;\3;\3;\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B\3C"+
		"\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3J\3J\3J\3K\3K"+
		"\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V"+
		"\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3[\3["+
		"\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3_\3_\3_\3"+
		"_\3_\3_\3_\3`\6`\u031b\n`\r`\16`\u031c\3`\3`\3a\6a\u0322\na\ra\16a\u0323"+
		"\3b\6b\u0327\nb\rb\16b\u0328\3b\7b\u032c\nb\fb\16b\u032f\13b\2\2c\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7"+
		"]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\3\2\6\5\2\13\f\17\17\"\"\3"+
		"\2\62;\5\2C\\aac|\6\2\62;C\\aac|\2\u0377\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\3\u00c8\3\2\2\2\5\u00ca"+
		"\3\2\2\2\7\u00d4\3\2\2\2\t\u00e0\3\2\2\2\13\u00e3\3\2\2\2\r\u00ea\3\2"+
		"\2\2\17\u00f5\3\2\2\2\21\u00f7\3\2\2\2\23\u00fb\3\2\2\2\25\u0100\3\2\2"+
		"\2\27\u0104\3\2\2\2\31\u0108\3\2\2\2\33\u010f\3\2\2\2\35\u0113\3\2\2\2"+
		"\37\u0115\3\2\2\2!\u0117\3\2\2\2#\u0119\3\2\2\2%\u011e\3\2\2\2\'\u0127"+
		"\3\2\2\2)\u012a\3\2\2\2+\u0136\3\2\2\2-\u0145\3\2\2\2/\u0183\3\2\2\2\61"+
		"\u0187\3\2\2\2\63\u0189\3\2\2\2\65\u018d\3\2\2\2\67\u018f\3\2\2\29\u0195"+
		"\3\2\2\2;\u0197\3\2\2\2=\u01a0\3\2\2\2?\u01a5\3\2\2\2A\u01ad\3\2\2\2C"+
		"\u01b6\3\2\2\2E\u01bf\3\2\2\2G\u01cb\3\2\2\2I\u01dd\3\2\2\2K\u01e9\3\2"+
		"\2\2M\u01f8\3\2\2\2O\u0211\3\2\2\2Q\u0239\3\2\2\2S\u023b\3\2\2\2U\u0243"+
		"\3\2\2\2W\u024a\3\2\2\2Y\u0250\3\2\2\2[\u0257\3\2\2\2]\u025f\3\2\2\2_"+
		"\u0269\3\2\2\2a\u0271\3\2\2\2c\u0277\3\2\2\2e\u027c\3\2\2\2g\u0280\3\2"+
		"\2\2i\u0283\3\2\2\2k\u0288\3\2\2\2m\u028c\3\2\2\2o\u0292\3\2\2\2q\u0295"+
		"\3\2\2\2s\u029b\3\2\2\2u\u02a4\3\2\2\2w\u02ab\3\2\2\2y\u02ad\3\2\2\2{"+
		"\u02af\3\2\2\2}\u02b1\3\2\2\2\177\u02b3\3\2\2\2\u0081\u02b5\3\2\2\2\u0083"+
		"\u02b7\3\2\2\2\u0085\u02ba\3\2\2\2\u0087\u02bd\3\2\2\2\u0089\u02c0\3\2"+
		"\2\2\u008b\u02c3\3\2\2\2\u008d\u02c5\3\2\2\2\u008f\u02c8\3\2\2\2\u0091"+
		"\u02cb\3\2\2\2\u0093\u02cd\3\2\2\2\u0095\u02d0\3\2\2\2\u0097\u02d2\3\2"+
		"\2\2\u0099\u02d5\3\2\2\2\u009b\u02d7\3\2\2\2\u009d\u02d9\3\2\2\2\u009f"+
		"\u02db\3\2\2\2\u00a1\u02dd\3\2\2\2\u00a3\u02df\3\2\2\2\u00a5\u02e1\3\2"+
		"\2\2\u00a7\u02e3\3\2\2\2\u00a9\u02e5\3\2\2\2\u00ab\u02e7\3\2\2\2\u00ad"+
		"\u02e9\3\2\2\2\u00af\u02eb\3\2\2\2\u00b1\u02f3\3\2\2\2\u00b3\u02f8\3\2"+
		"\2\2\u00b5\u02fe\3\2\2\2\u00b7\u0303\3\2\2\2\u00b9\u0307\3\2\2\2\u00bb"+
		"\u030c\3\2\2\2\u00bd\u0312\3\2\2\2\u00bf\u031a\3\2\2\2\u00c1\u0321\3\2"+
		"\2\2\u00c3\u0326\3\2\2\2\u00c5\u00c9\5Y-\2\u00c6\u00c9\5[.\2\u00c7\u00c9"+
		"\5]/\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\4\3\2\2\2\u00ca\u00cb\5_\60\2\u00cb\u00d1\5\u00c3b\2\u00cc\u00cd\5\u0099"+
		"M\2\u00cd\u00ce\5\u00c3b\2\u00ce\u00d0\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\6\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d4\u00d8\5\u00a3R\2\u00d5\u00d7\5\t\5\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\5\u00a5S\2\u00dc"+
		"\b\3\2\2\2\u00dd\u00e1\5\23\n\2\u00de\u00e1\5#\22\2\u00df\u00e1\5\13\6"+
		"\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\n"+
		"\3\2\2\2\u00e2\u00e4\5\3\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\5\25\13\2\u00e6\u00e7\5\u00c3b\2\u00e7\u00e8"+
		"\5%\23\2\u00e8\u00e9\5\r\7\2\u00e9\f\3\2\2\2\u00ea\u00ee\5\u00a3R\2\u00eb"+
		"\u00ed\5\17\b\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f2\5\u00a5S\2\u00f2\16\3\2\2\2\u00f3\u00f6\5\21\t\2\u00f4\u00f6\5"+
		"/\30\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\20\3\2\2\2\u00f7"+
		"\u00f8\5\25\13\2\u00f8\u00f9\5\u00c3b\2\u00f9\u00fa\5\u009dO\2\u00fa\22"+
		"\3\2\2\2\u00fb\u00fc\5\3\2\2\u00fc\u00fd\5\21\t\2\u00fd\24\3\2\2\2\u00fe"+
		"\u0101\5\27\f\2\u00ff\u0101\5\37\20\2\u0100\u00fe\3\2\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\26\3\2\2\2\u0102\u0105\5\31\r\2\u0103\u0105\5\u00afX\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\30\3\2\2\2\u0106\u0109"+
		"\5\33\16\2\u0107\u0109\5\35\17\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2"+
		"\2\u0109\32\3\2\2\2\u010a\u0110\5\u00b1Y\2\u010b\u0110\5\u00b3Z\2\u010c"+
		"\u0110\5\u00b7\\\2\u010d\u0110\5\u00b5[\2\u010e\u0110\5\u00b9]\2\u010f"+
		"\u010a\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u010e\3\2\2\2\u0110\34\3\2\2\2\u0111\u0114\5\u00bb^\2\u0112"+
		"\u0114\5\u00bd_\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\36\3\2"+
		"\2\2\u0115\u0116\5!\21\2\u0116 \3\2\2\2\u0117\u0118\5\u00c3b\2\u0118\""+
		"\3\2\2\2\u0119\u011a\5\3\2\2\u011a\u011b\5\u00c3b\2\u011b\u011c\5%\23"+
		"\2\u011c\u011d\5)\25\2\u011d$\3\2\2\2\u011e\u0120\5\u00a7T\2\u011f\u0121"+
		"\5\'\24\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2"+
		"\u0122\u0123\5\u009bN\2\u0123\u0124\5\'\24\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\5\u00a9U\2\u0126&\3\2\2\2\u0127\u0128\5\25\13\2\u0128\u0129\5\u00c3"+
		"b\2\u0129(\3\2\2\2\u012a\u012c\5\u00a3R\2\u012b\u012d\5+\26\2\u012c\u012b"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0131\3\2\2\2\u012e\u0130\5/\30\2\u012f"+
		"\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5\u00a5S\2\u0135"+
		"*\3\2\2\2\u0136\u0137\5a\61\2\u0137\u0139\5\u00a7T\2\u0138\u013a\5-\27"+
		"\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0140\3\2\2\2\u013b\u013c"+
		"\5\u009bN\2\u013c\u013d\5-\27\2\u013d\u013f\3\2\2\2\u013e\u013b\3\2\2"+
		"\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\5\u00a9U\2\u0144,\3\2\2\2\u0145"+
		"\u0146\5\u00c3b\2\u0146.\3\2\2\2\u0147\u0148\5\65\33\2\u0148\u0149\5\u009d"+
		"O\2\u0149\u0184\3\2\2\2\u014a\u014b\5g\64\2\u014b\u014c\5\u00a7T\2\u014c"+
		"\u014d\5\65\33\2\u014d\u014e\5\u00a9U\2\u014e\u0152\5/\30\2\u014f\u0150"+
		"\5i\65\2\u0150\u0151\5/\30\2\u0151\u0153\3\2\2\2\u0152\u014f\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0184\3\2\2\2\u0154\u0155\5k\66\2\u0155\u0157\5\u00a7"+
		"T\2\u0156\u0158\5\61\31\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015b\5\u009dO\2\u015a\u015c\5\63\32\2\u015b\u015a"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\5\u00a9U"+
		"\2\u015e\u015f\5/\30\2\u015f\u0184\3\2\2\2\u0160\u0161\5m\67\2\u0161\u0162"+
		"\5\u00a7T\2\u0162\u0163\5\65\33\2\u0163\u0164\5\u00a9U\2\u0164\u0165\5"+
		"/\30\2\u0165\u0184\3\2\2\2\u0166\u0167\5o8\2\u0167\u0168\5/\30\2\u0168"+
		"\u0169\5m\67\2\u0169\u016a\5\u00a7T\2\u016a\u016b\5\65\33\2\u016b\u016c"+
		"\5\u00a9U\2\u016c\u016d\5\u009dO\2\u016d\u0184\3\2\2\2\u016e\u016f\5q"+
		"9\2\u016f\u0170\5\u009dO\2\u0170\u0184\3\2\2\2\u0171\u0172\5s:\2\u0172"+
		"\u0173\5\u009dO\2\u0173\u0184\3\2\2\2\u0174\u0176\5u;\2\u0175\u0177\5"+
		"\65\33\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\5\u009dO\2\u0179\u0184\3\2\2\2\u017a\u017e\5\u00a3R\2\u017b\u017d"+
		"\5\17\b\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2"+
		"\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182"+
		"\5\u00a5S\2\u0182\u0184\3\2\2\2\u0183\u0147\3\2\2\2\u0183\u014a\3\2\2"+
		"\2\u0183\u0154\3\2\2\2\u0183\u0160\3\2\2\2\u0183\u0166\3\2\2\2\u0183\u016e"+
		"\3\2\2\2\u0183\u0171\3\2\2\2\u0183\u0174\3\2\2\2\u0183\u017a\3\2\2\2\u0184"+
		"\60\3\2\2\2\u0185\u0188\5\21\t\2\u0186\u0188\5\65\33\2\u0187\u0185\3\2"+
		"\2\2\u0187\u0186\3\2\2\2\u0188\62\3\2\2\2\u0189\u018a\5\65\33\2\u018a"+
		"\64\3\2\2\2\u018b\u018e\5\67\34\2\u018c\u018e\5? \2\u018d\u018b\3\2\2"+
		"\2\u018d\u018c\3\2\2\2\u018e\66\3\2\2\2\u018f\u0190\59\35\2\u0190\u0191"+
		"\5w<\2\u0191\u0192\5\65\33\2\u01928\3\2\2\2\u0193\u0196\5;\36\2\u0194"+
		"\u0196\5=\37\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196:\3\2\2\2"+
		"\u0197\u019d\5\u00c3b\2\u0198\u0199\5\u0099M\2\u0199\u019a\5\u00c3b\2"+
		"\u019a\u019c\3\2\2\2\u019b\u0198\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e<\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a1\5\u00c3b\2\u01a1\u01a2\5\u00abV\2\u01a2\u01a3\5\u00c1a\2\u01a3"+
		"\u01a4\5\u00adW\2\u01a4>\3\2\2\2\u01a5\u01ab\5A!\2\u01a6\u01a7\5\u00a1"+
		"Q\2\u01a7\u01a8\5\65\33\2\u01a8\u01a9\5\u009fP\2\u01a9\u01aa\5\65\33\2"+
		"\u01aa\u01ac\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac@\3"+
		"\2\2\2\u01ad\u01b3\5C\"\2\u01ae\u01af\5\u0087D\2\u01af\u01b0\5C\"\2\u01b0"+
		"\u01b2\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4B\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01bc"+
		"\5E#\2\u01b7\u01b8\5\u0089E\2\u01b8\u01b9\5E#\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b7\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bdD\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c8\5G$\2\u01c0\u01c1"+
		"\5\u008dG\2\u01c1\u01c2\5G$\2\u01c2\u01c7\3\2\2\2\u01c3\u01c4\5\u008f"+
		"H\2\u01c4\u01c5\5G$\2\u01c5\u01c7\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c3"+
		"\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"F\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01da\5I%\2\u01cc\u01cd\5\u0091I\2"+
		"\u01cd\u01ce\5I%\2\u01ce\u01d9\3\2\2\2\u01cf\u01d0\5\u0093J\2\u01d0\u01d1"+
		"\5I%\2\u01d1\u01d9\3\2\2\2\u01d2\u01d3\5\u0095K\2\u01d3\u01d4\5I%\2\u01d4"+
		"\u01d9\3\2\2\2\u01d5\u01d6\5\u0097L\2\u01d6\u01d7\5I%\2\u01d7\u01d9\3"+
		"\2\2\2\u01d8\u01cc\3\2\2\2\u01d8\u01cf\3\2\2\2\u01d8\u01d2\3\2\2\2\u01d8"+
		"\u01d5\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01dbH\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01e6\5K&\2\u01de\u01df"+
		"\5y=\2\u01df\u01e0\5K&\2\u01e0\u01e5\3\2\2\2\u01e1\u01e2\5{>\2\u01e2\u01e3"+
		"\5K&\2\u01e3\u01e5\3\2\2\2\u01e4\u01de\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e5"+
		"\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7J\3\2\2\2"+
		"\u01e8\u01e6\3\2\2\2\u01e9\u01f5\5O(\2\u01ea\u01eb\5}?\2\u01eb\u01ec\5"+
		"O(\2\u01ec\u01f4\3\2\2\2\u01ed\u01ee\5\177@\2\u01ee\u01ef\5O(\2\u01ef"+
		"\u01f4\3\2\2\2\u01f0\u01f1\5\u0081A\2\u01f1\u01f2\5O(\2\u01f2\u01f4\3"+
		"\2\2\2\u01f3\u01ea\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f4"+
		"\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6L\3\2\2\2"+
		"\u01f7\u01f5\3\2\2\2\u01f8\u0201\5Q)\2\u01f9\u01fa\5y=\2\u01fa\u01fb\5"+
		"O(\2\u01fb\u0200\3\2\2\2\u01fc\u01fd\5{>\2\u01fd\u01fe\5O(\2\u01fe\u0200"+
		"\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff\u01fc\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202N\3\2\2\2\u0203\u0201\3\2\2\2"+
		"\u0204\u0205\5y=\2\u0205\u0206\5O(\2\u0206\u020b\3\2\2\2\u0207\u0208\5"+
		"{>\2\u0208\u0209\5O(\2\u0209\u020b\3\2\2\2\u020a\u0204\3\2\2\2\u020a\u0207"+
		"\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5O(\2\u020d\u0212\3\2\2\2\u020e"+
		"\u020f\5\u008bF\2\u020f\u0210\5O(\2\u0210\u0212\3\2\2\2\u0211\u020a\3"+
		"\2\2\2\u0211\u020e\3\2\2\2\u0212P\3\2\2\2\u0213\u023a\5\u00c1a\2\u0214"+
		"\u023a\5\u00c3b\2\u0215\u023a\5c\62\2\u0216\u023a\5a\61\2\u0217\u0218"+
		"\5\u00a7T\2\u0218\u0219\5\65\33\2\u0219\u021a\5\u00a9U\2\u021a\u023a\3"+
		"\2\2\2\u021b\u021c\5e\63\2\u021c\u021d\5!\21\2\u021d\u021f\5\u00a7T\2"+
		"\u021e\u0220\5-\27\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0226"+
		"\3\2\2\2\u0221\u0222\5\u009bN\2\u0222\u0223\5-\27\2\u0223\u0225\3\2\2"+
		"\2\u0224\u0221\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227"+
		"\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\5\u00a9U"+
		"\2\u022a\u023a\3\2\2\2\u022b\u022c\5\u008bF\2\u022c\u022d\5O(\2\u022d"+
		"\u023a\3\2\2\2\u022e\u022f\5\u0083B\2\u022f\u0230\5O(\2\u0230\u023a\3"+
		"\2\2\2\u0231\u0232\5\u0085C\2\u0232\u0233\5O(\2\u0233\u023a\3\2\2\2\u0234"+
		"\u0235\5\25\13\2\u0235\u0236\5\u00a7T\2\u0236\u0237\5\65\33\2\u0237\u0238"+
		"\5\u00a9U\2\u0238\u023a\3\2\2\2\u0239\u0213\3\2\2\2\u0239\u0214\3\2\2"+
		"\2\u0239\u0215\3\2\2\2\u0239\u0216\3\2\2\2\u0239\u0217\3\2\2\2\u0239\u021b"+
		"\3\2\2\2\u0239\u022b\3\2\2\2\u0239\u022e\3\2\2\2\u0239\u0231\3\2\2\2\u0239"+
		"\u0234\3\2\2\2\u023aR\3\2\2\2\u023b\u023c\7r\2\2\u023c\u023d\7c\2\2\u023d"+
		"\u023e\7e\2\2\u023e\u023f\7m\2\2\u023f\u0240\7c\2\2\u0240\u0241\7i\2\2"+
		"\u0241\u0242\7g\2\2\u0242T\3\2\2\2\u0243\u0244\7k\2\2\u0244\u0245\7o\2"+
		"\2\u0245\u0246\7r\2\2\u0246\u0247\7q\2\2\u0247\u0248\7t\2\2\u0248\u0249"+
		"\7v\2\2\u0249V\3\2\2\2\u024a\u024b\7e\2\2\u024b\u024c\7n\2\2\u024c\u024d"+
		"\7c\2\2\u024d\u024e\7u\2\2\u024e\u024f\7u\2\2\u024fX\3\2\2\2\u0250\u0251"+
		"\7r\2\2\u0251\u0252\7w\2\2\u0252\u0253\7d\2\2\u0253\u0254\7n\2\2\u0254"+
		"\u0255\7k\2\2\u0255\u0256\7e\2\2\u0256Z\3\2\2\2\u0257\u0258\7r\2\2\u0258"+
		"\u0259\7t\2\2\u0259\u025a\7k\2\2\u025a\u025b\7x\2\2\u025b\u025c\7c\2\2"+
		"\u025c\u025d\7v\2\2\u025d\u025e\7g\2\2\u025e\\\3\2\2\2\u025f\u0260\7r"+
		"\2\2\u0260\u0261\7t\2\2\u0261\u0262\7q\2\2\u0262\u0263\7v\2\2\u0263\u0264"+
		"\7g\2\2\u0264\u0265\7e\2\2\u0265\u0266\7v\2\2\u0266\u0267\7g\2\2\u0267"+
		"\u0268\7f\2\2\u0268^\3\2\2\2\u0269\u026a\7g\2\2\u026a\u026b\7z\2\2\u026b"+
		"\u026c\7v\2\2\u026c\u026d\7g\2\2\u026d\u026e\7p\2\2\u026e\u026f\7f\2\2"+
		"\u026f\u0270\7u\2\2\u0270`\3\2\2\2\u0271\u0272\7u\2\2\u0272\u0273\7w\2"+
		"\2\u0273\u0274\7r\2\2\u0274\u0275\7g\2\2\u0275\u0276\7t\2\2\u0276b\3\2"+
		"\2\2\u0277\u0278\7v\2\2\u0278\u0279\7j\2\2\u0279\u027a\7k\2\2\u027a\u027b"+
		"\7u\2\2\u027bd\3\2\2\2\u027c\u027d\7p\2\2\u027d\u027e\7g\2\2\u027e\u027f"+
		"\7y\2\2\u027ff\3\2\2\2\u0280\u0281\7k\2\2\u0281\u0282\7h\2\2\u0282h\3"+
		"\2\2\2\u0283\u0284\7g\2\2\u0284\u0285\7n\2\2\u0285\u0286\7u\2\2\u0286"+
		"\u0287\7g\2\2\u0287j\3\2\2\2\u0288\u0289\7h\2\2\u0289\u028a\7q\2\2\u028a"+
		"\u028b\7t\2\2\u028bl\3\2\2\2\u028c\u028d\7y\2\2\u028d\u028e\7j\2\2\u028e"+
		"\u028f\7k\2\2\u028f\u0290\7n\2\2\u0290\u0291\7g\2\2\u0291n\3\2\2\2\u0292"+
		"\u0293\7f\2\2\u0293\u0294\7q\2\2\u0294p\3\2\2\2\u0295\u0296\7d\2\2\u0296"+
		"\u0297\7t\2\2\u0297\u0298\7g\2\2\u0298\u0299\7c\2\2\u0299\u029a\7m\2\2"+
		"\u029ar\3\2\2\2\u029b\u029c\7e\2\2\u029c\u029d\7q\2\2\u029d\u029e\7p\2"+
		"\2\u029e\u029f\7v\2\2\u029f\u02a0\7k\2\2\u02a0\u02a1\7p\2\2\u02a1\u02a2"+
		"\7w\2\2\u02a2\u02a3\7g\2\2\u02a3t\3\2\2\2\u02a4\u02a5\7t\2\2\u02a5\u02a6"+
		"\7g\2\2\u02a6\u02a7\7v\2\2\u02a7\u02a8\7w\2\2\u02a8\u02a9\7t\2\2\u02a9"+
		"\u02aa\7p\2\2\u02aav\3\2\2\2\u02ab\u02ac\7?\2\2\u02acx\3\2\2\2\u02ad\u02ae"+
		"\7-\2\2\u02aez\3\2\2\2\u02af\u02b0\7/\2\2\u02b0|\3\2\2\2\u02b1\u02b2\7"+
		",\2\2\u02b2~\3\2\2\2\u02b3\u02b4\7\61\2\2\u02b4\u0080\3\2\2\2\u02b5\u02b6"+
		"\7\'\2\2\u02b6\u0082\3\2\2\2\u02b7\u02b8\7-\2\2\u02b8\u02b9\7-\2\2\u02b9"+
		"\u0084\3\2\2\2\u02ba\u02bb\7/\2\2\u02bb\u02bc\7/\2\2\u02bc\u0086\3\2\2"+
		"\2\u02bd\u02be\7~\2\2\u02be\u02bf\7~\2\2\u02bf\u0088\3\2\2\2\u02c0\u02c1"+
		"\7(\2\2\u02c1\u02c2\7(\2\2\u02c2\u008a\3\2\2\2\u02c3\u02c4\7#\2\2\u02c4"+
		"\u008c\3\2\2\2\u02c5\u02c6\7?\2\2\u02c6\u02c7\7?\2\2\u02c7\u008e\3\2\2"+
		"\2\u02c8\u02c9\7#\2\2\u02c9\u02ca\7?\2\2\u02ca\u0090\3\2\2\2\u02cb\u02cc"+
		"\7>\2\2\u02cc\u0092\3\2\2\2\u02cd\u02ce\7>\2\2\u02ce\u02cf\7?\2\2\u02cf"+
		"\u0094\3\2\2\2\u02d0\u02d1\7@\2\2\u02d1\u0096\3\2\2\2\u02d2\u02d3\7@\2"+
		"\2\u02d3\u02d4\7?\2\2\u02d4\u0098\3\2\2\2\u02d5\u02d6\7\60\2\2\u02d6\u009a"+
		"\3\2\2\2\u02d7\u02d8\7.\2\2\u02d8\u009c\3\2\2\2\u02d9\u02da\7=\2\2\u02da"+
		"\u009e\3\2\2\2\u02db\u02dc\7<\2\2\u02dc\u00a0\3\2\2\2\u02dd\u02de\7A\2"+
		"\2\u02de\u00a2\3\2\2\2\u02df\u02e0\7}\2\2\u02e0\u00a4\3\2\2\2\u02e1\u02e2"+
		"\7\177\2\2\u02e2\u00a6\3\2\2\2\u02e3\u02e4\7*\2\2\u02e4\u00a8\3\2\2\2"+
		"\u02e5\u02e6\7+\2\2\u02e6\u00aa\3\2\2\2\u02e7\u02e8\7]\2\2\u02e8\u00ac"+
		"\3\2\2\2\u02e9\u02ea\7_\2\2\u02ea\u00ae\3\2\2\2\u02eb\u02ec\7d\2\2\u02ec"+
		"\u02ed\7q\2\2\u02ed\u02ee\7q\2\2\u02ee\u02ef\7n\2\2\u02ef\u02f0\7g\2\2"+
		"\u02f0\u02f1\7c\2\2\u02f1\u02f2\7p\2\2\u02f2\u00b0\3\2\2\2\u02f3\u02f4"+
		"\7d\2\2\u02f4\u02f5\7{\2\2\u02f5\u02f6\7v\2\2\u02f6\u02f7\7g\2\2\u02f7"+
		"\u00b2\3\2\2\2\u02f8\u02f9\7u\2\2\u02f9\u02fa\7j\2\2\u02fa\u02fb\7q\2"+
		"\2\u02fb\u02fc\7t\2\2\u02fc\u02fd\7v\2\2\u02fd\u00b4\3\2\2\2\u02fe\u02ff"+
		"\7n\2\2\u02ff\u0300\7q\2\2\u0300\u0301\7p\2\2\u0301\u0302\7i\2\2\u0302"+
		"\u00b6\3\2\2\2\u0303\u0304\7k\2\2\u0304\u0305\7p\2\2\u0305\u0306\7v\2"+
		"\2\u0306\u00b8\3\2\2\2\u0307\u0308\7e\2\2\u0308\u0309\7j\2\2\u0309\u030a"+
		"\7c\2\2\u030a\u030b\7t\2\2\u030b\u00ba\3\2\2\2\u030c\u030d\7h\2\2\u030d"+
		"\u030e\7n\2\2\u030e\u030f\7q\2\2\u030f\u0310\7c\2\2\u0310\u0311\7v\2\2"+
		"\u0311\u00bc\3\2\2\2\u0312\u0313\7f\2\2\u0313\u0314\7q\2\2\u0314\u0315"+
		"\7w\2\2\u0315\u0316\7d\2\2\u0316\u0317\7n\2\2\u0317\u0318\7g\2\2\u0318"+
		"\u00be\3\2\2\2\u0319\u031b\t\2\2\2\u031a\u0319\3\2\2\2\u031b\u031c\3\2"+
		"\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u031f\b`\2\2\u031f\u00c0\3\2\2\2\u0320\u0322\t\3\2\2\u0321\u0320\3\2"+
		"\2\2\u0322\u0323\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u00c2\3\2\2\2\u0325\u0327\t\4\2\2\u0326\u0325\3\2\2\2\u0327\u0328\3\2"+
		"\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032d\3\2\2\2\u032a"+
		"\u032c\t\5\2\2\u032b\u032a\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2"+
		"\2\2\u032d\u032e\3\2\2\2\u032e\u00c4\3\2\2\2\u032f\u032d\3\2\2\2\64\2"+
		"\u00c8\u00d1\u00d8\u00e0\u00e3\u00ee\u00f5\u0100\u0104\u0108\u010f\u0113"+
		"\u0120\u012c\u0131\u0139\u0140\u0152\u0157\u015b\u0176\u017e\u0183\u0187"+
		"\u018d\u0195\u019d\u01ab\u01b3\u01bc\u01c6\u01c8\u01d8\u01da\u01e4\u01e6"+
		"\u01f3\u01f5\u01ff\u0201\u020a\u0211\u021f\u0226\u0239\u031c\u0323\u0328"+
		"\u032d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}