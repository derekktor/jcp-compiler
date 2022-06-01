// Generated from /mnt/d/Coding/tkik/jcp-compiler/JCP.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JCPParser extends Parser {
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
	public static final int
		RULE_start = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"start"
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

	@Override
	public String getGrammarFileName() { return "JCP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JCPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JCPParser.EOF, 0); }
		public List<TerminalNode> PackageDec() { return getTokens(JCPParser.PackageDec); }
		public TerminalNode PackageDec(int i) {
			return getToken(JCPParser.PackageDec, i);
		}
		public List<TerminalNode> ImportDec() { return getTokens(JCPParser.ImportDec); }
		public TerminalNode ImportDec(int i) {
			return getToken(JCPParser.ImportDec, i);
		}
		public List<TerminalNode> ClassDec() { return getTokens(JCPParser.ClassDec); }
		public TerminalNode ClassDec(int i) {
			return getToken(JCPParser.ClassDec, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PackageDec) {
				{
				{
				setState(2);
				match(PackageDec);
				}
				}
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ImportDec) {
				{
				{
				setState(8);
				match(ImportDec);
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ClassDec) {
				{
				{
				setState(14);
				match(ClassDec);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3f\31\4\2\t\2\3\2\7"+
		"\2\6\n\2\f\2\16\2\t\13\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\7\2\22\n\2"+
		"\f\2\16\2\25\13\2\3\2\3\2\3\2\2\2\3\2\2\2\2\32\2\7\3\2\2\2\4\6\7\3\2\2"+
		"\5\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\r\3\2\2\2\t\7\3\2\2"+
		"\2\n\f\7\4\2\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16"+
		"\23\3\2\2\2\17\r\3\2\2\2\20\22\7\5\2\2\21\20\3\2\2\2\22\25\3\2\2\2\23"+
		"\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27"+
		"\3\3\2\2\2\5\7\r\23";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}