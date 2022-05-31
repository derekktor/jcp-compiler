// Generated from /Users/konradb/Coding/tkik/jcp-compiler/attempt2.g4 by ANTLR 4.9.2
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
		Body=7, BodyDec=8, MethodDec=9, Block=10, LocalDec=11, MemberDec=12, Type=13, 
		PrimitiveType=14, NumericType=15, IntegralType=16, FloatingPointType=17, 
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
		LONG=93, INT=94, CHAR=95, FLOAT=96, DOUBLE=97, LITERAL=98, IDENTIFIER=99;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Start", "PackageDec", "ImportDec", "ClassDec", "Modifier", "Extends", 
			"Body", "BodyDec", "MethodDec", "Block", "BlockDec", "LocalDec", "MemberDec", 
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
			"LONG", "INT", "CHAR", "FLOAT", "DOUBLE", "LITERAL", "IDENTIFIER"
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
			null, "Start", "PackageDec", "ImportDec", "ClassDec", "Modifier", "Extends", 
			"Body", "BodyDec", "MethodDec", "Block", "LocalDec", "MemberDec", "Type", 
			"PrimitiveType", "NumericType", "IntegralType", "FloatingPointType", 
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
			"LONG", "INT", "CHAR", "FLOAT", "DOUBLE", "LITERAL", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2e\u0354\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\7\2\u00cd\n\2\f\2\16\2\u00d0\13"+
		"\2\3\2\7\2\u00d3\n\2\f\2\16\2\u00d6\13\2\3\2\7\2\u00d9\n\2\f\2\16\2\u00dc"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\5\5\u00f2\n\5\3\5\3\5\3\6\3\6\3\6\5\6\u00f9\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\7\b\u0102\n\b\f\b\16\b\u0105\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\5\t\u010c\n\t\3\n\5\n\u010f\n\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7"+
		"\13\u0118\n\13\f\13\16\13\u011b\13\13\3\13\3\13\3\f\3\f\5\f\u0121\n\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\5\17\u012c\n\17\3\20\3\20\5"+
		"\20\u0130\n\20\3\21\3\21\5\21\u0134\n\21\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u013b\n\22\3\23\3\23\5\23\u013f\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\5\27\u014c\n\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\5\31\u0158\n\31\3\31\7\31\u015b\n\31\f\31\16\31\u015e"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\5\32\u0165\n\32\3\32\3\32\3\32\7\32\u016a"+
		"\n\32\f\32\16\32\u016d\13\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u017e\n\34\3\34\3\34\3\34\5\34"+
		"\u0183\n\34\3\34\3\34\5\34\u0187\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u01a2\n\34\3\34\3\34\3\34\3\34\7\34\u01a8"+
		"\n\34\f\34\16\34\u01ab\13\34\3\34\3\34\5\34\u01af\n\34\3\35\3\35\5\35"+
		"\u01b3\n\35\3\36\3\36\3\37\3\37\5\37\u01b9\n\37\3 \3 \3 \3 \3!\3!\5!\u01c1"+
		"\n!\3\"\3\"\3\"\3\"\7\"\u01c7\n\"\f\"\16\"\u01ca\13\"\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\5$\u01d7\n$\3%\3%\3%\3%\7%\u01dd\n%\f%\16%\u01e0\13%"+
		"\3&\3&\3&\3&\7&\u01e6\n&\f&\16&\u01e9\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u01f2\n\'\f\'\16\'\u01f5\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\7(\u0204\n(\f(\16(\u0207\13(\3)\3)\3)\3)\3)\3)\3)\7)\u0210\n)\f)"+
		"\16)\u0213\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u021f\n*\f*\16*\u0222"+
		"\13*\3+\3+\3+\3+\3+\3+\3+\7+\u022b\n+\f+\16+\u022e\13+\3,\3,\3,\3,\3,"+
		"\3,\5,\u0236\n,\3,\3,\3,\3,\3,\5,\u023d\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\5-\u024b\n-\3-\3-\3-\7-\u0250\n-\f-\16-\u0253\13-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0265\n-\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;"+
		"\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?"+
		"\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H"+
		"\3I\3I\3I\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3N\3N\3N\3O\3O\3P\3P\3P\3Q\3Q"+
		"\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3"+
		"_\3`\3`\3`\3`\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3"+
		"d\6d\u0346\nd\rd\16d\u0347\3e\6e\u034b\ne\re\16e\u034c\3e\7e\u0350\ne"+
		"\fe\16e\u0353\13e\2\2f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\2\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32"+
		"\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62"+
		"e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177@\u0081A\u0083B\u0085C\u0087D"+
		"\u0089E\u008bF\u008dG\u008fH\u0091I\u0093J\u0095K\u0097L\u0099M\u009b"+
		"N\u009dO\u009fP\u00a1Q\u00a3R\u00a5S\u00a7T\u00a9U\u00abV\u00adW\u00af"+
		"X\u00b1Y\u00b3Z\u00b5[\u00b7\\\u00b9]\u00bb^\u00bd_\u00bf`\u00c1a\u00c3"+
		"b\u00c5c\u00c7d\u00c9e\3\2\5\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\2\u039c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2"+
		"\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5"+
		"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\3\u00ce\3\2\2\2\5\u00df\3\2\2"+
		"\2\7\u00e6\3\2\2\2\t\u00ed\3\2\2\2\13\u00f8\3\2\2\2\r\u00fa\3\2\2\2\17"+
		"\u00ff\3\2\2\2\21\u010b\3\2\2\2\23\u010e\3\2\2\2\25\u0115\3\2\2\2\27\u0120"+
		"\3\2\2\2\31\u0122\3\2\2\2\33\u0126\3\2\2\2\35\u012b\3\2\2\2\37\u012f\3"+
		"\2\2\2!\u0133\3\2\2\2#\u013a\3\2\2\2%\u013e\3\2\2\2\'\u0140\3\2\2\2)\u0142"+
		"\3\2\2\2+\u0144\3\2\2\2-\u0149\3\2\2\2/\u0152\3\2\2\2\61\u0155\3\2\2\2"+
		"\63\u0161\3\2\2\2\65\u0170\3\2\2\2\67\u01ae\3\2\2\29\u01b2\3\2\2\2;\u01b4"+
		"\3\2\2\2=\u01b8\3\2\2\2?\u01ba\3\2\2\2A\u01c0\3\2\2\2C\u01c2\3\2\2\2E"+
		"\u01cb\3\2\2\2G\u01d0\3\2\2\2I\u01d8\3\2\2\2K\u01e1\3\2\2\2M\u01ea\3\2"+
		"\2\2O\u01f6\3\2\2\2Q\u0208\3\2\2\2S\u0214\3\2\2\2U\u0223\3\2\2\2W\u023c"+
		"\3\2\2\2Y\u0264\3\2\2\2[\u0266\3\2\2\2]\u026e\3\2\2\2_\u0275\3\2\2\2a"+
		"\u027b\3\2\2\2c\u0282\3\2\2\2e\u028a\3\2\2\2g\u0294\3\2\2\2i\u029c\3\2"+
		"\2\2k\u02a2\3\2\2\2m\u02a7\3\2\2\2o\u02ab\3\2\2\2q\u02ae\3\2\2\2s\u02b3"+
		"\3\2\2\2u\u02b7\3\2\2\2w\u02bd\3\2\2\2y\u02c0\3\2\2\2{\u02c6\3\2\2\2}"+
		"\u02cf\3\2\2\2\177\u02d6\3\2\2\2\u0081\u02d8\3\2\2\2\u0083\u02da\3\2\2"+
		"\2\u0085\u02dc\3\2\2\2\u0087\u02de\3\2\2\2\u0089\u02e0\3\2\2\2\u008b\u02e2"+
		"\3\2\2\2\u008d\u02e5\3\2\2\2\u008f\u02e8\3\2\2\2\u0091\u02eb\3\2\2\2\u0093"+
		"\u02ee\3\2\2\2\u0095\u02f0\3\2\2\2\u0097\u02f3\3\2\2\2\u0099\u02f6\3\2"+
		"\2\2\u009b\u02f8\3\2\2\2\u009d\u02fb\3\2\2\2\u009f\u02fd\3\2\2\2\u00a1"+
		"\u0300\3\2\2\2\u00a3\u0302\3\2\2\2\u00a5\u0304\3\2\2\2\u00a7\u0306\3\2"+
		"\2\2\u00a9\u0308\3\2\2\2\u00ab\u030a\3\2\2\2\u00ad\u030c\3\2\2\2\u00af"+
		"\u030e\3\2\2\2\u00b1\u0310\3\2\2\2\u00b3\u0312\3\2\2\2\u00b5\u0314\3\2"+
		"\2\2\u00b7\u0316\3\2\2\2\u00b9\u031e\3\2\2\2\u00bb\u0323\3\2\2\2\u00bd"+
		"\u0329\3\2\2\2\u00bf\u032e\3\2\2\2\u00c1\u0332\3\2\2\2\u00c3\u0337\3\2"+
		"\2\2\u00c5\u033d\3\2\2\2\u00c7\u0345\3\2\2\2\u00c9\u034a\3\2\2\2\u00cb"+
		"\u00cd\5\5\3\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d3\5\7\4\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d9\5\t\5\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00de\7\2\2\3\u00de\4\3\2\2\2\u00df\u00e0\5[.\2\u00e0\u00e1\5\u00c9e"+
		"\2\u00e1\u00e2\5\u00a1Q\2\u00e2\u00e3\5\u00c9e\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\5\u00a5S\2\u00e5\6\3\2\2\2\u00e6\u00e7\5]/\2\u00e7\u00e8\5\u00c9"+
		"e\2\u00e8\u00e9\5\u00a1Q\2\u00e9\u00ea\5\u00c9e\2\u00ea\u00eb\3\2\2\2"+
		"\u00eb\u00ec\5\u00a5S\2\u00ec\b\3\2\2\2\u00ed\u00ee\5\13\6\2\u00ee\u00ef"+
		"\5_\60\2\u00ef\u00f1\5\u00c9e\2\u00f0\u00f2\5\r\7\2\u00f1\u00f0\3\2\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\5\17\b\2\u00f4"+
		"\n\3\2\2\2\u00f5\u00f9\5a\61\2\u00f6\u00f9\5c\62\2\u00f7\u00f9\5e\63\2"+
		"\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\f\3"+
		"\2\2\2\u00fa\u00fb\5g\64\2\u00fb\u00fc\5\u00c9e\2\u00fc\u00fd\5\u00a1"+
		"Q\2\u00fd\u00fe\5\u00c9e\2\u00fe\16\3\2\2\2\u00ff\u0103\5\u00abV\2\u0100"+
		"\u0102\5\21\t\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0107\5\u00adW\2\u0107\20\3\2\2\2\u0108\u010c\5\33\16\2\u0109\u010c\5"+
		"+\26\2\u010a\u010c\5\23\n\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\22\3\2\2\2\u010d\u010f\5\13\6\2\u010e\u010d\3\2\2"+
		"\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5\35\17\2\u0111"+
		"\u0112\5\u00c9e\2\u0112\u0113\5-\27\2\u0113\u0114\5\25\13\2\u0114\24\3"+
		"\2\2\2\u0115\u0119\5\u00abV\2\u0116\u0118\5\27\f\2\u0117\u0116\3\2\2\2"+
		"\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\5\u00adW\2\u011d\26\3\2\2\2\u011e"+
		"\u0121\5\31\r\2\u011f\u0121\5\67\34\2\u0120\u011e\3\2\2\2\u0120\u011f"+
		"\3\2\2\2\u0121\30\3\2\2\2\u0122\u0123\5\35\17\2\u0123\u0124\5\u00c9e\2"+
		"\u0124\u0125\5\u00a5S\2\u0125\32\3\2\2\2\u0126\u0127\5\13\6\2\u0127\u0128"+
		"\5\31\r\2\u0128\34\3\2\2\2\u0129\u012c\5\37\20\2\u012a\u012c\5\'\24\2"+
		"\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\36\3\2\2\2\u012d\u0130"+
		"\5!\21\2\u012e\u0130\5\u00b7\\\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2"+
		"\2\u0130 \3\2\2\2\u0131\u0134\5#\22\2\u0132\u0134\5%\23\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0132\3\2\2\2\u0134\"\3\2\2\2\u0135\u013b\5\u00b9]\2\u0136"+
		"\u013b\5\u00bb^\2\u0137\u013b\5\u00bf`\2\u0138\u013b\5\u00bd_\2\u0139"+
		"\u013b\5\u00c1a\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0137"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b$\3\2\2\2\u013c"+
		"\u013f\5\u00c3b\2\u013d\u013f\5\u00c5c\2\u013e\u013c\3\2\2\2\u013e\u013d"+
		"\3\2\2\2\u013f&\3\2\2\2\u0140\u0141\5)\25\2\u0141(\3\2\2\2\u0142\u0143"+
		"\5\u00c9e\2\u0143*\3\2\2\2\u0144\u0145\5\13\6\2\u0145\u0146\5\u00c9e\2"+
		"\u0146\u0147\5-\27\2\u0147\u0148\5\61\31\2\u0148,\3\2\2\2\u0149\u014b"+
		"\5\u00afX\2\u014a\u014c\5/\30\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2"+
		"\2\u014c\u014d\3\2\2\2\u014d\u014e\5\u00a3R\2\u014e\u014f\5/\30\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\5\u00b1Y\2\u0151.\3\2\2\2\u0152\u0153\5\35"+
		"\17\2\u0153\u0154\5\u00c9e\2\u0154\60\3\2\2\2\u0155\u0157\5\u00abV\2\u0156"+
		"\u0158\5\63\32\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015c\3"+
		"\2\2\2\u0159\u015b\5\67\34\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015f\u0160\5\u00adW\2\u0160\62\3\2\2\2\u0161\u0162\5i\65\2\u0162"+
		"\u0164\5\u00afX\2\u0163\u0165\5\65\33\2\u0164\u0163\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u016b\3\2\2\2\u0166\u0167\5\u00a3R\2\u0167\u0168\5\65\33"+
		"\2\u0168\u016a\3\2\2\2\u0169\u0166\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u016f\5\u00b1Y\2\u016f\64\3\2\2\2\u0170\u0171\5\u00c9e\2\u0171\66\3\2"+
		"\2\2\u0172\u0173\5=\37\2\u0173\u0174\5\u00a5S\2\u0174\u01af\3\2\2\2\u0175"+
		"\u0176\5o8\2\u0176\u0177\5\u00afX\2\u0177\u0178\5=\37\2\u0178\u0179\5"+
		"\u00b1Y\2\u0179\u017d\5\67\34\2\u017a\u017b\5q9\2\u017b\u017c\5\67\34"+
		"\2\u017c\u017e\3\2\2\2\u017d\u017a\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u01af"+
		"\3\2\2\2\u017f\u0180\5s:\2\u0180\u0182\5\u00afX\2\u0181\u0183\59\35\2"+
		"\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186"+
		"\5\u00a5S\2\u0185\u0187\5;\36\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2"+
		"\2\u0187\u0188\3\2\2\2\u0188\u0189\5\u00b1Y\2\u0189\u018a\5\67\34\2\u018a"+
		"\u01af\3\2\2\2\u018b\u018c\5u;\2\u018c\u018d\5\u00afX\2\u018d\u018e\5"+
		"=\37\2\u018e\u018f\5\u00b1Y\2\u018f\u0190\5\67\34\2\u0190\u01af\3\2\2"+
		"\2\u0191\u0192\5w<\2\u0192\u0193\5\67\34\2\u0193\u0194\5u;\2\u0194\u0195"+
		"\5\u00afX\2\u0195\u0196\5=\37\2\u0196\u0197\5\u00b1Y\2\u0197\u0198\5\u00a5"+
		"S\2\u0198\u01af\3\2\2\2\u0199\u019a\5y=\2\u019a\u019b\5\u00a5S\2\u019b"+
		"\u01af\3\2\2\2\u019c\u019d\5{>\2\u019d\u019e\5\u00a5S\2\u019e\u01af\3"+
		"\2\2\2\u019f\u01a1\5}?\2\u01a0\u01a2\5=\37\2\u01a1\u01a0\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\5\u00a5S\2\u01a4\u01af"+
		"\3\2\2\2\u01a5\u01a9\5\u00abV\2\u01a6\u01a8\5\27\f\2\u01a7\u01a6\3\2\2"+
		"\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\5\u00adW\2\u01ad\u01af\3\2\2"+
		"\2\u01ae\u0172\3\2\2\2\u01ae\u0175\3\2\2\2\u01ae\u017f\3\2\2\2\u01ae\u018b"+
		"\3\2\2\2\u01ae\u0191\3\2\2\2\u01ae\u0199\3\2\2\2\u01ae\u019c\3\2\2\2\u01ae"+
		"\u019f\3\2\2\2\u01ae\u01a5\3\2\2\2\u01af8\3\2\2\2\u01b0\u01b3\5\31\r\2"+
		"\u01b1\u01b3\5=\37\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3:\3"+
		"\2\2\2\u01b4\u01b5\5=\37\2\u01b5<\3\2\2\2\u01b6\u01b9\5? \2\u01b7\u01b9"+
		"\5G$\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9>\3\2\2\2\u01ba\u01bb"+
		"\5A!\2\u01bb\u01bc\5\177@\2\u01bc\u01bd\5=\37\2\u01bd@\3\2\2\2\u01be\u01c1"+
		"\5C\"\2\u01bf\u01c1\5E#\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"B\3\2\2\2\u01c2\u01c8\5\u00c9e\2\u01c3\u01c4\5\u00a1Q\2\u01c4\u01c5\5"+
		"\u00c9e\2\u01c5\u01c7\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c7\u01ca\3\2\2\2"+
		"\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9D\3\2\2\2\u01ca\u01c8\3"+
		"\2\2\2\u01cb\u01cc\5\u00c9e\2\u01cc\u01cd\5\u00b3Z\2\u01cd\u01ce\5\u00c7"+
		"d\2\u01ce\u01cf\5\u00b5[\2\u01cfF\3\2\2\2\u01d0\u01d6\5I%\2\u01d1\u01d2"+
		"\5\u00a9U\2\u01d2\u01d3\5=\37\2\u01d3\u01d4\5\u00a7T\2\u01d4\u01d5\5="+
		"\37\2\u01d5\u01d7\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"H\3\2\2\2\u01d8\u01de\5K&\2\u01d9\u01da\5\u008fH\2\u01da\u01db\5K&\2\u01db"+
		"\u01dd\3\2\2\2\u01dc\u01d9\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01dfJ\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e7"+
		"\5M\'\2\u01e2\u01e3\5\u0091I\2\u01e3\u01e4\5M\'\2\u01e4\u01e6\3\2\2\2"+
		"\u01e5\u01e2\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8L\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01f3\5O(\2\u01eb\u01ec"+
		"\5\u0095K\2\u01ec\u01ed\5O(\2\u01ed\u01f2\3\2\2\2\u01ee\u01ef\5\u0097"+
		"L\2\u01ef\u01f0\5O(\2\u01f0\u01f2\3\2\2\2\u01f1\u01eb\3\2\2\2\u01f1\u01ee"+
		"\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"N\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u0205\5Q)\2\u01f7\u01f8\5\u0099M\2"+
		"\u01f8\u01f9\5Q)\2\u01f9\u0204\3\2\2\2\u01fa\u01fb\5\u009bN\2\u01fb\u01fc"+
		"\5Q)\2\u01fc\u0204\3\2\2\2\u01fd\u01fe\5\u009dO\2\u01fe\u01ff\5Q)\2\u01ff"+
		"\u0204\3\2\2\2\u0200\u0201\5\u009fP\2\u0201\u0202\5Q)\2\u0202\u0204\3"+
		"\2\2\2\u0203\u01f7\3\2\2\2\u0203\u01fa\3\2\2\2\u0203\u01fd\3\2\2\2\u0203"+
		"\u0200\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206P\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0211\5S*\2\u0209\u020a"+
		"\5\u0081A\2\u020a\u020b\5S*\2\u020b\u0210\3\2\2\2\u020c\u020d\5\u0083"+
		"B\2\u020d\u020e\5S*\2\u020e\u0210\3\2\2\2\u020f\u0209\3\2\2\2\u020f\u020c"+
		"\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"R\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0220\5W,\2\u0215\u0216\5\u0085C\2"+
		"\u0216\u0217\5W,\2\u0217\u021f\3\2\2\2\u0218\u0219\5\u0087D\2\u0219\u021a"+
		"\5W,\2\u021a\u021f\3\2\2\2\u021b\u021c\5\u0089E\2\u021c\u021d\5W,\2\u021d"+
		"\u021f\3\2\2\2\u021e\u0215\3\2\2\2\u021e\u0218\3\2\2\2\u021e\u021b\3\2"+
		"\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"T\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u022c\5Y-\2\u0224\u0225\5\u0081A\2"+
		"\u0225\u0226\5W,\2\u0226\u022b\3\2\2\2\u0227\u0228\5\u0083B\2\u0228\u0229"+
		"\5W,\2\u0229\u022b\3\2\2\2\u022a\u0224\3\2\2\2\u022a\u0227\3\2\2\2\u022b"+
		"\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022dV\3\2\2\2"+
		"\u022e\u022c\3\2\2\2\u022f\u0230\5\u0081A\2\u0230\u0231\5W,\2\u0231\u0236"+
		"\3\2\2\2\u0232\u0233\5\u0083B\2\u0233\u0234\5W,\2\u0234\u0236\3\2\2\2"+
		"\u0235\u022f\3\2\2\2\u0235\u0232\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238"+
		"\5W,\2\u0238\u023d\3\2\2\2\u0239\u023a\5\u0093J\2\u023a\u023b\5W,\2\u023b"+
		"\u023d\3\2\2\2\u023c\u0235\3\2\2\2\u023c\u0239\3\2\2\2\u023dX\3\2\2\2"+
		"\u023e\u0265\5\u00c7d\2\u023f\u0265\5\u00c9e\2\u0240\u0265\5k\66\2\u0241"+
		"\u0265\5i\65\2\u0242\u0243\5\u00afX\2\u0243\u0244\5=\37\2\u0244\u0245"+
		"\5\u00b1Y\2\u0245\u0265\3\2\2\2\u0246\u0247\5m\67\2\u0247\u0248\5)\25"+
		"\2\u0248\u024a\5\u00afX\2\u0249\u024b\5\65\33\2\u024a\u0249\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b\u0251\3\2\2\2\u024c\u024d\5\u00a3R\2\u024d\u024e"+
		"\5\65\33\2\u024e\u0250\3\2\2\2\u024f\u024c\3\2\2\2\u0250\u0253\3\2\2\2"+
		"\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251"+
		"\3\2\2\2\u0254\u0255\5\u00b1Y\2\u0255\u0265\3\2\2\2\u0256\u0257\5\u0093"+
		"J\2\u0257\u0258\5W,\2\u0258\u0265\3\2\2\2\u0259\u025a\5\u008bF\2\u025a"+
		"\u025b\5W,\2\u025b\u0265\3\2\2\2\u025c\u025d\5\u008dG\2\u025d\u025e\5"+
		"W,\2\u025e\u0265\3\2\2\2\u025f\u0260\5\35\17\2\u0260\u0261\5\u00afX\2"+
		"\u0261\u0262\5=\37\2\u0262\u0263\5\u00b1Y\2\u0263\u0265\3\2\2\2\u0264"+
		"\u023e\3\2\2\2\u0264\u023f\3\2\2\2\u0264\u0240\3\2\2\2\u0264\u0241\3\2"+
		"\2\2\u0264\u0242\3\2\2\2\u0264\u0246\3\2\2\2\u0264\u0256\3\2\2\2\u0264"+
		"\u0259\3\2\2\2\u0264\u025c\3\2\2\2\u0264\u025f\3\2\2\2\u0265Z\3\2\2\2"+
		"\u0266\u0267\7r\2\2\u0267\u0268\7c\2\2\u0268\u0269\7e\2\2\u0269\u026a"+
		"\7m\2\2\u026a\u026b\7c\2\2\u026b\u026c\7i\2\2\u026c\u026d\7g\2\2\u026d"+
		"\\\3\2\2\2\u026e\u026f\7k\2\2\u026f\u0270\7o\2\2\u0270\u0271\7r\2\2\u0271"+
		"\u0272\7q\2\2\u0272\u0273\7t\2\2\u0273\u0274\7v\2\2\u0274^\3\2\2\2\u0275"+
		"\u0276\7e\2\2\u0276\u0277\7n\2\2\u0277\u0278\7c\2\2\u0278\u0279\7u\2\2"+
		"\u0279\u027a\7u\2\2\u027a`\3\2\2\2\u027b\u027c\7r\2\2\u027c\u027d\7w\2"+
		"\2\u027d\u027e\7d\2\2\u027e\u027f\7n\2\2\u027f\u0280\7k\2\2\u0280\u0281"+
		"\7e\2\2\u0281b\3\2\2\2\u0282\u0283\7r\2\2\u0283\u0284\7t\2\2\u0284\u0285"+
		"\7k\2\2\u0285\u0286\7x\2\2\u0286\u0287\7c\2\2\u0287\u0288\7v\2\2\u0288"+
		"\u0289\7g\2\2\u0289d\3\2\2\2\u028a\u028b\7r\2\2\u028b\u028c\7t\2\2\u028c"+
		"\u028d\7q\2\2\u028d\u028e\7v\2\2\u028e\u028f\7g\2\2\u028f\u0290\7e\2\2"+
		"\u0290\u0291\7v\2\2\u0291\u0292\7g\2\2\u0292\u0293\7f\2\2\u0293f\3\2\2"+
		"\2\u0294\u0295\7g\2\2\u0295\u0296\7z\2\2\u0296\u0297\7v\2\2\u0297\u0298"+
		"\7g\2\2\u0298\u0299\7p\2\2\u0299\u029a\7f\2\2\u029a\u029b\7u\2\2\u029b"+
		"h\3\2\2\2\u029c\u029d\7u\2\2\u029d\u029e\7w\2\2\u029e\u029f\7r\2\2\u029f"+
		"\u02a0\7g\2\2\u02a0\u02a1\7t\2\2\u02a1j\3\2\2\2\u02a2\u02a3\7v\2\2\u02a3"+
		"\u02a4\7j\2\2\u02a4\u02a5\7k\2\2\u02a5\u02a6\7u\2\2\u02a6l\3\2\2\2\u02a7"+
		"\u02a8\7p\2\2\u02a8\u02a9\7g\2\2\u02a9\u02aa\7y\2\2\u02aan\3\2\2\2\u02ab"+
		"\u02ac\7k\2\2\u02ac\u02ad\7h\2\2\u02adp\3\2\2\2\u02ae\u02af\7g\2\2\u02af"+
		"\u02b0\7n\2\2\u02b0\u02b1\7u\2\2\u02b1\u02b2\7g\2\2\u02b2r\3\2\2\2\u02b3"+
		"\u02b4\7h\2\2\u02b4\u02b5\7q\2\2\u02b5\u02b6\7t\2\2\u02b6t\3\2\2\2\u02b7"+
		"\u02b8\7y\2\2\u02b8\u02b9\7j\2\2\u02b9\u02ba\7k\2\2\u02ba\u02bb\7n\2\2"+
		"\u02bb\u02bc\7g\2\2\u02bcv\3\2\2\2\u02bd\u02be\7f\2\2\u02be\u02bf\7q\2"+
		"\2\u02bfx\3\2\2\2\u02c0\u02c1\7d\2\2\u02c1\u02c2\7t\2\2\u02c2\u02c3\7"+
		"g\2\2\u02c3\u02c4\7c\2\2\u02c4\u02c5\7m\2\2\u02c5z\3\2\2\2\u02c6\u02c7"+
		"\7e\2\2\u02c7\u02c8\7q\2\2\u02c8\u02c9\7p\2\2\u02c9\u02ca\7v\2\2\u02ca"+
		"\u02cb\7k\2\2\u02cb\u02cc\7p\2\2\u02cc\u02cd\7w\2\2\u02cd\u02ce\7g\2\2"+
		"\u02ce|\3\2\2\2\u02cf\u02d0\7t\2\2\u02d0\u02d1\7g\2\2\u02d1\u02d2\7v\2"+
		"\2\u02d2\u02d3\7w\2\2\u02d3\u02d4\7t\2\2\u02d4\u02d5\7p\2\2\u02d5~\3\2"+
		"\2\2\u02d6\u02d7\7?\2\2\u02d7\u0080\3\2\2\2\u02d8\u02d9\7-\2\2\u02d9\u0082"+
		"\3\2\2\2\u02da\u02db\7/\2\2\u02db\u0084\3\2\2\2\u02dc\u02dd\7,\2\2\u02dd"+
		"\u0086\3\2\2\2\u02de\u02df\7\61\2\2\u02df\u0088\3\2\2\2\u02e0\u02e1\7"+
		"\'\2\2\u02e1\u008a\3\2\2\2\u02e2\u02e3\7-\2\2\u02e3\u02e4\7-\2\2\u02e4"+
		"\u008c\3\2\2\2\u02e5\u02e6\7/\2\2\u02e6\u02e7\7/\2\2\u02e7\u008e\3\2\2"+
		"\2\u02e8\u02e9\7~\2\2\u02e9\u02ea\7~\2\2\u02ea\u0090\3\2\2\2\u02eb\u02ec"+
		"\7(\2\2\u02ec\u02ed\7(\2\2\u02ed\u0092\3\2\2\2\u02ee\u02ef\7#\2\2\u02ef"+
		"\u0094\3\2\2\2\u02f0\u02f1\7?\2\2\u02f1\u02f2\7?\2\2\u02f2\u0096\3\2\2"+
		"\2\u02f3\u02f4\7#\2\2\u02f4\u02f5\7?\2\2\u02f5\u0098\3\2\2\2\u02f6\u02f7"+
		"\7>\2\2\u02f7\u009a\3\2\2\2\u02f8\u02f9\7>\2\2\u02f9\u02fa\7?\2\2\u02fa"+
		"\u009c\3\2\2\2\u02fb\u02fc\7@\2\2\u02fc\u009e\3\2\2\2\u02fd\u02fe\7@\2"+
		"\2\u02fe\u02ff\7?\2\2\u02ff\u00a0\3\2\2\2\u0300\u0301\7\60\2\2\u0301\u00a2"+
		"\3\2\2\2\u0302\u0303\7.\2\2\u0303\u00a4\3\2\2\2\u0304\u0305\7=\2\2\u0305"+
		"\u00a6\3\2\2\2\u0306\u0307\7<\2\2\u0307\u00a8\3\2\2\2\u0308\u0309\7A\2"+
		"\2\u0309\u00aa\3\2\2\2\u030a\u030b\7}\2\2\u030b\u00ac\3\2\2\2\u030c\u030d"+
		"\7\177\2\2\u030d\u00ae\3\2\2\2\u030e\u030f\7*\2\2\u030f\u00b0\3\2\2\2"+
		"\u0310\u0311\7+\2\2\u0311\u00b2\3\2\2\2\u0312\u0313\7]\2\2\u0313\u00b4"+
		"\3\2\2\2\u0314\u0315\7_\2\2\u0315\u00b6\3\2\2\2\u0316\u0317\7d\2\2\u0317"+
		"\u0318\7q\2\2\u0318\u0319\7q\2\2\u0319\u031a\7n\2\2\u031a\u031b\7g\2\2"+
		"\u031b\u031c\7c\2\2\u031c\u031d\7p\2\2\u031d\u00b8\3\2\2\2\u031e\u031f"+
		"\7d\2\2\u031f\u0320\7{\2\2\u0320\u0321\7v\2\2\u0321\u0322\7g\2\2\u0322"+
		"\u00ba\3\2\2\2\u0323\u0324\7u\2\2\u0324\u0325\7j\2\2\u0325\u0326\7q\2"+
		"\2\u0326\u0327\7t\2\2\u0327\u0328\7v\2\2\u0328\u00bc\3\2\2\2\u0329\u032a"+
		"\7n\2\2\u032a\u032b\7q\2\2\u032b\u032c\7p\2\2\u032c\u032d\7i\2\2\u032d"+
		"\u00be\3\2\2\2\u032e\u032f\7k\2\2\u032f\u0330\7p\2\2\u0330\u0331\7v\2"+
		"\2\u0331\u00c0\3\2\2\2\u0332\u0333\7e\2\2\u0333\u0334\7j\2\2\u0334\u0335"+
		"\7c\2\2\u0335\u0336\7t\2\2\u0336\u00c2\3\2\2\2\u0337\u0338\7h\2\2\u0338"+
		"\u0339\7n\2\2\u0339\u033a\7q\2\2\u033a\u033b\7c\2\2\u033b\u033c\7v\2\2"+
		"\u033c\u00c4\3\2\2\2\u033d\u033e\7f\2\2\u033e\u033f\7q\2\2\u033f\u0340"+
		"\7w\2\2\u0340\u0341\7d\2\2\u0341\u0342\7n\2\2\u0342\u0343\7g\2\2\u0343"+
		"\u00c6\3\2\2\2\u0344\u0346\t\2\2\2\u0345\u0344\3\2\2\2\u0346\u0347\3\2"+
		"\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u00c8\3\2\2\2\u0349"+
		"\u034b\t\3\2\2\u034a\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034a\3\2"+
		"\2\2\u034c\u034d\3\2\2\2\u034d\u0351\3\2\2\2\u034e\u0350\t\4\2\2\u034f"+
		"\u034e\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2"+
		"\2\2\u0352\u00ca\3\2\2\2\u0353\u0351\3\2\2\2\66\2\u00ce\u00d4\u00da\u00f1"+
		"\u00f8\u0103\u010b\u010e\u0119\u0120\u012b\u012f\u0133\u013a\u013e\u014b"+
		"\u0157\u015c\u0164\u016b\u017d\u0182\u0186\u01a1\u01a9\u01ae\u01b2\u01b8"+
		"\u01c0\u01c8\u01d6\u01de\u01e7\u01f1\u01f3\u0203\u0205\u020f\u0211\u021e"+
		"\u0220\u022a\u022c\u0235\u023c\u024a\u0251\u0264\u0347\u034c\u0351\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}