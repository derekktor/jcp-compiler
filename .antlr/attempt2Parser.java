// Generated from /mnt/d/Coding/tkik/jcp-compiler/attempt2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class attempt2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PACKAGE=1, IDENTIFIER=2, DOT=3, SEMI=4, IMPORT=5, CLASS=6, Body=7, PUBLIC=8, 
		PRIVATE=9, PROTECTED=10, EXTENDS=11, LCUR=12, RCUR=13, BOOL=14, BYTE=15, 
		SHORT=16, INT=17, LONG=18, CHAR=19, FLOAT=20, DOUBLE=21, LPAR=22, COMMA=23, 
		RPAR=24, SUPER=25, IF=26, ELSE=27, FOR=28, WHILE=29, DO=30, BREAK=31, 
		CONTINUE=32, RETURN=33, ASSIGN=34, LBRACK=35, LITERAL=36, RBRACK=37, QUESTION=38, 
		COLON=39, OR=40, AND=41, EQUAL=42, NOTEQUAL=43, LESS=44, LESSEQUAL=45, 
		GREATER=46, GREATEREQUAL=47, PLUS=48, MINUS=49, MULTIPLY=50, DIVIDE=51, 
		MOD=52, NOT=53, THIS=54, NEW=55, INCREMENT=56, DECREMENT=57;
	public static final int
		RULE_start = 0, RULE_packageDec = 1, RULE_importDec = 2, RULE_classDec = 3, 
		RULE_modifier = 4, RULE_extends = 5, RULE_bodyDec = 6, RULE_methodDec = 7, 
		RULE_block = 8, RULE_blockDec = 9, RULE_localDec = 10, RULE_memberDec = 11, 
		RULE_type = 12, RULE_primitiveType = 13, RULE_numericType = 14, RULE_integralType = 15, 
		RULE_floatingPointType = 16, RULE_feferenceType = 17, RULE_classType = 18, 
		RULE_constructorDec = 19, RULE_parameters = 20, RULE_parameter = 21, RULE_constructorBody = 22, 
		RULE_constructorInvocation = 23, RULE_argument = 24, RULE_statement = 25, 
		RULE_forInit = 26, RULE_forUpdate = 27, RULE_expression = 28, RULE_assignment = 29, 
		RULE_leftHandSide = 30, RULE_fieldAccess = 31, RULE_arrayAccess = 32, 
		RULE_conditionalExpression = 33, RULE_orExpression = 34, RULE_andExpression = 35, 
		RULE_equalityExpression = 36, RULE_relationalExpression = 37, RULE_additiveExpression = 38, 
		RULE_multiplicativeExpression = 39, RULE_unaireExpression = 40, RULE_unaryExpression = 41, 
		RULE_primaryExpression = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "packageDec", "importDec", "classDec", "modifier", "extends", 
			"bodyDec", "methodDec", "block", "blockDec", "localDec", "memberDec", 
			"type", "primitiveType", "numericType", "integralType", "floatingPointType", 
			"feferenceType", "classType", "constructorDec", "parameters", "parameter", 
			"constructorBody", "constructorInvocation", "argument", "statement", 
			"forInit", "forUpdate", "expression", "assignment", "leftHandSide", "fieldAccess", 
			"arrayAccess", "conditionalExpression", "orExpression", "andExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaireExpression", "unaryExpression", "primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PACKAGE", "IDENTIFIER", "DOT", "SEMI", "IMPORT", "CLASS", "Body", 
			"PUBLIC", "PRIVATE", "PROTECTED", "EXTENDS", "LCUR", "RCUR", "BOOL", 
			"BYTE", "SHORT", "INT", "LONG", "CHAR", "FLOAT", "DOUBLE", "LPAR", "COMMA", 
			"RPAR", "SUPER", "IF", "ELSE", "FOR", "WHILE", "DO", "BREAK", "CONTINUE", 
			"RETURN", "ASSIGN", "LBRACK", "LITERAL", "RBRACK", "QUESTION", "COLON", 
			"OR", "AND", "EQUAL", "NOTEQUAL", "LESS", "LESSEQUAL", "GREATER", "GREATEREQUAL", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "NOT", "THIS", "NEW", "INCREMENT", 
			"DECREMENT"
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
	public String getGrammarFileName() { return "attempt2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public attempt2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(attempt2Parser.EOF, 0); }
		public List<PackageDecContext> packageDec() {
			return getRuleContexts(PackageDecContext.class);
		}
		public PackageDecContext packageDec(int i) {
			return getRuleContext(PackageDecContext.class,i);
		}
		public List<ImportDecContext> importDec() {
			return getRuleContexts(ImportDecContext.class);
		}
		public ImportDecContext importDec(int i) {
			return getRuleContext(ImportDecContext.class,i);
		}
		public List<ClassDecContext> classDec() {
			return getRuleContexts(ClassDecContext.class);
		}
		public ClassDecContext classDec(int i) {
			return getRuleContext(ClassDecContext.class,i);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PACKAGE) {
				{
				{
				setState(86);
				packageDec();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(92);
				importDec();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				{
				setState(98);
				classDec();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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

	public static class PackageDecContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(attempt2Parser.PACKAGE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(attempt2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(attempt2Parser.IDENTIFIER, i);
		}
		public TerminalNode SEMI() { return getToken(attempt2Parser.SEMI, 0); }
		public TerminalNode DOT() { return getToken(attempt2Parser.DOT, 0); }
		public PackageDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDec; }
	}

	public final PackageDecContext packageDec() throws RecognitionException {
		PackageDecContext _localctx = new PackageDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(PACKAGE);
			setState(107);
			match(IDENTIFIER);
			{
			setState(108);
			match(DOT);
			setState(109);
			match(IDENTIFIER);
			}
			setState(111);
			match(SEMI);
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

	public static class ImportDecContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(attempt2Parser.IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(attempt2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(attempt2Parser.IDENTIFIER, i);
		}
		public TerminalNode SEMI() { return getToken(attempt2Parser.SEMI, 0); }
		public TerminalNode DOT() { return getToken(attempt2Parser.DOT, 0); }
		public ImportDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDec; }
	}

	public final ImportDecContext importDec() throws RecognitionException {
		ImportDecContext _localctx = new ImportDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IMPORT);
			setState(114);
			match(IDENTIFIER);
			{
			setState(115);
			match(DOT);
			setState(116);
			match(IDENTIFIER);
			}
			setState(118);
			match(SEMI);
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

	public static class ClassDecContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(attempt2Parser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(attempt2Parser.IDENTIFIER, 0); }
		public TerminalNode Body() { return getToken(attempt2Parser.Body, 0); }
		public ExtendsContext extends() {
			return getRuleContext(ExtendsContext.class,0);
		}
		public ClassDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDec; }
	}

	public final ClassDecContext classDec() throws RecognitionException {
		ClassDecContext _localctx = new ClassDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			modifier();
			setState(121);
			match(CLASS);
			setState(122);
			match(IDENTIFIER);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(123);
				extends();
				}
			}

			setState(126);
			match(Body);
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(attempt2Parser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(attempt2Parser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(attempt2Parser.PROTECTED, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExtendsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(attempt2Parser.EXTENDS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(attempt2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(attempt2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(attempt2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(attempt2Parser.DOT, i);
		}
		public ExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extends; }
	}

	public final ExtendsContext extends() throws RecognitionException {
		ExtendsContext _localctx = new ExtendsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_extends);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(EXTENDS);
			setState(131);
			match(IDENTIFIER);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(132);
				match(DOT);
				setState(133);
				match(IDENTIFIER);
				}
				}
				setState(138);
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

	public static class BodyDecContext extends ParserRuleContext {
		public MemberDecContext memberDec() {
			return getRuleContext(MemberDecContext.class,0);
		}
		public ConstructorDecContext constructorDec() {
			return getRuleContext(ConstructorDecContext.class,0);
		}
		public MethodDecContext methodDec() {
			return getRuleContext(MethodDecContext.class,0);
		}
		public BodyDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyDec; }
	}

	public final BodyDecContext bodyDec() throws RecognitionException {
		BodyDecContext _localctx = new BodyDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bodyDec);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				memberDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				constructorDec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				methodDec();
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

	public static class MethodDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(attempt2Parser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public MethodDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDec; }
	}

	public final MethodDecContext methodDec() throws RecognitionException {
		MethodDecContext _localctx = new MethodDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(144);
				modifier();
				}
			}

			setState(147);
			type();
			setState(148);
			match(IDENTIFIER);
			setState(149);
			parameters();
			setState(150);
			block();
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
		public TerminalNode LCUR() { return getToken(attempt2Parser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(attempt2Parser.RCUR, 0); }
		public List<BlockDecContext> blockDec() {
			return getRuleContexts(BlockDecContext.class);
		}
		public BlockDecContext blockDec(int i) {
			return getRuleContext(BlockDecContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(LCUR);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << LCUR) | (1L << BOOL) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << DOUBLE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) {
				{
				{
				setState(153);
				blockDec();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(RCUR);
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

	public static class BlockDecContext extends ParserRuleContext {
		public LocalDecContext localDec() {
			return getRuleContext(LocalDecContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDec; }
	}

	public final BlockDecContext blockDec() throws RecognitionException {
		BlockDecContext _localctx = new BlockDecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockDec);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				localDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				statement();
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

	public static class LocalDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(attempt2Parser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(attempt2Parser.SEMI, 0); }
		public LocalDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDec; }
	}

	public final LocalDecContext localDec() throws RecognitionException {
		LocalDecContext _localctx = new LocalDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_localDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			type();
			setState(166);
			match(IDENTIFIER);
			setState(167);
			match(SEMI);
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

	public static class MemberDecContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public LocalDecContext localDec() {
			return getRuleContext(LocalDecContext.class,0);
		}
		public MemberDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDec; }
	}

	public final MemberDecContext memberDec() throws RecognitionException {
		MemberDecContext _localctx = new MemberDecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_memberDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			modifier();
			setState(170);
			localDec();
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public FeferenceTypeContext feferenceType() {
			return getRuleContext(FeferenceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case CHAR:
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				feferenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(attempt2Parser.BOOL, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitiveType);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case CHAR:
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				numericType();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numericType);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				integralType();
				}
				break;
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(attempt2Parser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(attempt2Parser.SHORT, 0); }
		public TerminalNode INT() { return getToken(attempt2Parser.INT, 0); }
		public TerminalNode LONG() { return getToken(attempt2Parser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(attempt2Parser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(attempt2Parser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(attempt2Parser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FeferenceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public FeferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feferenceType; }
	}

	public final FeferenceTypeContext feferenceType() throws RecognitionException {
		FeferenceTypeContext _localctx = new FeferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_feferenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			classType();
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(attempt2Parser.IDENTIFIER, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IDENTIFIER);
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

	public static class ConstructorDecContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(attempt2Parser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public ConstructorDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDec; }
	}

	public final ConstructorDecContext constructorDec() throws RecognitionException {
		ConstructorDecContext _localctx = new ConstructorDecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			modifier();
			setState(193);
			match(IDENTIFIER);
			setState(194);
			parameters();
			setState(195);
			constructorBody();
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(attempt2Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(attempt2Parser.RPAR, 0); }
		public TerminalNode COMMA() { return getToken(attempt2Parser.COMMA, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LPAR);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << BOOL) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << DOUBLE))) != 0)) {
				{
				setState(198);
				parameter();
				}
			}

			{
			setState(201);
			match(COMMA);
			setState(202);
			parameter();
			}
			setState(204);
			match(RPAR);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(attempt2Parser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			type();
			setState(207);
			match(IDENTIFIER);
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode LCUR() { return getToken(attempt2Parser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(attempt2Parser.RCUR, 0); }
		public ConstructorInvocationContext constructorInvocation() {
			return getRuleContext(ConstructorInvocationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(LCUR);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUPER) {
				{
				setState(210);
				constructorInvocation();
				}
			}

			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << LCUR) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) {
				{
				{
				setState(213);
				statement();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(RCUR);
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

	public static class ConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(attempt2Parser.SUPER, 0); }
		public TerminalNode LPAR() { return getToken(attempt2Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(attempt2Parser.RPAR, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(attempt2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(attempt2Parser.COMMA, i);
		}
		public ConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorInvocation; }
	}

	public final ConstructorInvocationContext constructorInvocation() throws RecognitionException {
		ConstructorInvocationContext _localctx = new ConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(SUPER);
			setState(222);
			match(LPAR);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(223);
				argument();
				}
			}

			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				argument();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(RPAR);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(attempt2Parser.IDENTIFIER, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IDENTIFIER);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(attempt2Parser.SEMI, 0); }
		public TerminalNode IF() { return getToken(attempt2Parser.IF, 0); }
		public TerminalNode LPAR() { return getToken(attempt2Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(attempt2Parser.RPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(attempt2Parser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(attempt2Parser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(attempt2Parser.WHILE, 0); }
		public TerminalNode DO() { return getToken(attempt2Parser.DO, 0); }
		public TerminalNode BREAK() { return getToken(attempt2Parser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(attempt2Parser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(attempt2Parser.RETURN, 0); }
		public TerminalNode LCUR() { return getToken(attempt2Parser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(attempt2Parser.RCUR, 0); }
		public List<BlockDecContext> blockDec() {
			return getRuleContexts(BlockDecContext.class);
		}
		public BlockDecContext blockDec(int i) {
			return getRuleContext(BlockDecContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case PLUS:
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				expression();
				setState(238);
				match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(IF);
				setState(241);
				match(LPAR);
				setState(242);
				expression();
				setState(243);
				match(RPAR);
				setState(244);
				statement();
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(245);
					match(ELSE);
					setState(246);
					statement();
					}
					break;
				}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(FOR);
				setState(250);
				match(LPAR);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << BOOL) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << DOUBLE) | (1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) {
					{
					setState(251);
					forInit();
					}
				}

				setState(254);
				match(SEMI);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) {
					{
					setState(255);
					forUpdate();
					}
				}

				setState(258);
				match(RPAR);
				setState(259);
				statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(WHILE);
				setState(261);
				match(LPAR);
				setState(262);
				expression();
				setState(263);
				match(RPAR);
				setState(264);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(DO);
				setState(267);
				statement();
				setState(268);
				match(WHILE);
				setState(269);
				match(LPAR);
				setState(270);
				expression();
				setState(271);
				match(RPAR);
				setState(272);
				match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				match(BREAK);
				setState(275);
				match(SEMI);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				match(CONTINUE);
				setState(277);
				match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(278);
				match(RETURN);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) {
					{
					setState(279);
					expression();
					}
				}

				setState(282);
				match(SEMI);
				}
				break;
			case LCUR:
				enterOuterAlt(_localctx, 9);
				{
				setState(283);
				match(LCUR);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << LCUR) | (1L << BOOL) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << DOUBLE) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) {
					{
					{
					setState(284);
					blockDec();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(290);
				match(RCUR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalDecContext localDec() {
			return getRuleContext(LocalDecContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forInit);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				localDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				expression();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				assignment();
				}
				break;
			case PLUS:
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				conditionalExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(attempt2Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			leftHandSide();
			setState(304);
			match(ASSIGN);
			setState(305);
			expression();
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

	public static class LeftHandSideContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_leftHandSide);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				fieldAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				arrayAccess();
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

	public static class FieldAccessContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(attempt2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(attempt2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(attempt2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(attempt2Parser.DOT, i);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fieldAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(IDENTIFIER);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(312);
				match(DOT);
				setState(313);
				match(IDENTIFIER);
				}
				}
				setState(318);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(attempt2Parser.IDENTIFIER, 0); }
		public TerminalNode LBRACK() { return getToken(attempt2Parser.LBRACK, 0); }
		public TerminalNode LITERAL() { return getToken(attempt2Parser.LITERAL, 0); }
		public TerminalNode RBRACK() { return getToken(attempt2Parser.RBRACK, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(IDENTIFIER);
			setState(320);
			match(LBRACK);
			setState(321);
			match(LITERAL);
			setState(322);
			match(RBRACK);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(attempt2Parser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(attempt2Parser.COLON, 0); }
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			orExpression();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(325);
				match(QUESTION);
				setState(326);
				expression();
				setState(327);
				match(COLON);
				setState(328);
				expression();
				}
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

	public static class OrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(attempt2Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(attempt2Parser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			andExpression();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(333);
				match(OR);
				setState(334);
				andExpression();
				}
				}
				setState(339);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(attempt2Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(attempt2Parser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			equalityExpression();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(341);
				match(AND);
				setState(342);
				equalityExpression();
				}
				}
				setState(347);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(attempt2Parser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(attempt2Parser.EQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(attempt2Parser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(attempt2Parser.NOTEQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			relationalExpression();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				setState(353);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(349);
					match(EQUAL);
					setState(350);
					relationalExpression();
					}
					break;
				case NOTEQUAL:
					{
					setState(351);
					match(NOTEQUAL);
					setState(352);
					relationalExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(357);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LESS() { return getTokens(attempt2Parser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(attempt2Parser.LESS, i);
		}
		public List<TerminalNode> LESSEQUAL() { return getTokens(attempt2Parser.LESSEQUAL); }
		public TerminalNode LESSEQUAL(int i) {
			return getToken(attempt2Parser.LESSEQUAL, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(attempt2Parser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(attempt2Parser.GREATER, i);
		}
		public List<TerminalNode> GREATEREQUAL() { return getTokens(attempt2Parser.GREATEREQUAL); }
		public TerminalNode GREATEREQUAL(int i) {
			return getToken(attempt2Parser.GREATEREQUAL, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			additiveExpression();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSEQUAL) | (1L << GREATER) | (1L << GREATEREQUAL))) != 0)) {
				{
				setState(367);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS:
					{
					setState(359);
					match(LESS);
					setState(360);
					additiveExpression();
					}
					break;
				case LESSEQUAL:
					{
					setState(361);
					match(LESSEQUAL);
					setState(362);
					additiveExpression();
					}
					break;
				case GREATER:
					{
					setState(363);
					match(GREATER);
					setState(364);
					additiveExpression();
					}
					break;
				case GREATEREQUAL:
					{
					setState(365);
					match(GREATEREQUAL);
					setState(366);
					additiveExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(371);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(attempt2Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(attempt2Parser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(attempt2Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(attempt2Parser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			multiplicativeExpression();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(377);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(373);
					match(PLUS);
					setState(374);
					multiplicativeExpression();
					}
					break;
				case MINUS:
					{
					setState(375);
					match(MINUS);
					setState(376);
					multiplicativeExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(381);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(attempt2Parser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(attempt2Parser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(attempt2Parser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(attempt2Parser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(attempt2Parser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(attempt2Parser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			unaryExpression();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				setState(389);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTIPLY:
					{
					setState(383);
					match(MULTIPLY);
					setState(384);
					unaryExpression();
					}
					break;
				case DIVIDE:
					{
					setState(385);
					match(DIVIDE);
					setState(386);
					unaryExpression();
					}
					break;
				case MOD:
					{
					setState(387);
					match(MOD);
					setState(388);
					unaryExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(393);
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

	public static class UnaireExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(attempt2Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(attempt2Parser.PLUS, i);
		}
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(attempt2Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(attempt2Parser.MINUS, i);
		}
		public UnaireExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaireExpression; }
	}

	public final UnaireExpressionContext unaireExpression() throws RecognitionException {
		UnaireExpressionContext _localctx = new UnaireExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unaireExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			primaryExpression();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(399);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(395);
					match(PLUS);
					setState(396);
					unaryExpression();
					}
					break;
				case MINUS:
					{
					setState(397);
					match(MINUS);
					setState(398);
					unaryExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(403);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(attempt2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(attempt2Parser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(attempt2Parser.NOT, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unaryExpression);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(404);
					match(PLUS);
					setState(405);
					unaryExpression();
					}
					break;
				case MINUS:
					{
					setState(406);
					match(MINUS);
					setState(407);
					unaryExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(410);
				unaryExpression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(412);
				match(NOT);
				setState(413);
				unaryExpression();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(attempt2Parser.LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(attempt2Parser.IDENTIFIER, 0); }
		public TerminalNode THIS() { return getToken(attempt2Parser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(attempt2Parser.SUPER, 0); }
		public TerminalNode LPAR() { return getToken(attempt2Parser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(attempt2Parser.RPAR, 0); }
		public TerminalNode NEW() { return getToken(attempt2Parser.NEW, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(attempt2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(attempt2Parser.COMMA, i);
		}
		public TerminalNode NOT() { return getToken(attempt2Parser.NOT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(attempt2Parser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(attempt2Parser.DECREMENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_primaryExpression);
		int _la;
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				match(SUPER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				match(LPAR);
				setState(421);
				expression();
				setState(422);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(424);
				match(NEW);
				setState(425);
				classType();
				setState(426);
				match(LPAR);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(427);
					argument();
					}
				}

				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(430);
					match(COMMA);
					setState(431);
					argument();
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(439);
				match(NOT);
				setState(440);
				unaryExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(441);
				match(INCREMENT);
				setState(442);
				unaryExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(443);
				match(DECREMENT);
				setState(444);
				unaryExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(445);
				type();
				setState(446);
				match(LPAR);
				setState(447);
				expression();
				setState(448);
				match(RPAR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u01c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\7\2f"+
		"\n\2\f\2\16\2i\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\177\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\b\3\b\3\b\5\b\u0091\n\b\3\t\5"+
		"\t\u0094\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u009d\n\n\f\n\16\n\u00a0"+
		"\13\n\3\n\3\n\3\13\3\13\5\13\u00a6\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\5\16\u00b1\n\16\3\17\3\17\5\17\u00b5\n\17\3\20\3\20\5\20\u00b9"+
		"\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\5\26\u00ca\n\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\5\30\u00d6\n\30\3\30\7\30\u00d9\n\30\f\30\16\30\u00dc\13\30\3\30"+
		"\3\30\3\31\3\31\3\31\5\31\u00e3\n\31\3\31\3\31\7\31\u00e7\n\31\f\31\16"+
		"\31\u00ea\13\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00fa\n\33\3\33\3\33\3\33\5\33\u00ff\n\33\3\33\3"+
		"\33\5\33\u0103\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u011b"+
		"\n\33\3\33\3\33\3\33\7\33\u0120\n\33\f\33\16\33\u0123\13\33\3\33\5\33"+
		"\u0126\n\33\3\34\3\34\5\34\u012a\n\34\3\35\3\35\3\36\3\36\5\36\u0130\n"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \5 \u0138\n \3!\3!\3!\7!\u013d\n!\f!\16!"+
		"\u0140\13!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u014d\n#\3$\3$\3$"+
		"\7$\u0152\n$\f$\16$\u0155\13$\3%\3%\3%\7%\u015a\n%\f%\16%\u015d\13%\3"+
		"&\3&\3&\3&\3&\7&\u0164\n&\f&\16&\u0167\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\7\'\u0172\n\'\f\'\16\'\u0175\13\'\3(\3(\3(\3(\3(\7(\u017c\n("+
		"\f(\16(\u017f\13(\3)\3)\3)\3)\3)\3)\3)\7)\u0188\n)\f)\16)\u018b\13)\3"+
		"*\3*\3*\3*\3*\7*\u0192\n*\f*\16*\u0195\13*\3+\3+\3+\3+\5+\u019b\n+\3+"+
		"\3+\3+\3+\5+\u01a1\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01af\n,"+
		"\3,\3,\7,\u01b3\n,\f,\16,\u01b6\13,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\5,\u01c5\n,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTV\2\5\3\2\n\f\3\2\21\25\3\2\26\27\2\u01db"+
		"\2[\3\2\2\2\4l\3\2\2\2\6s\3\2\2\2\bz\3\2\2\2\n\u0082\3\2\2\2\f\u0084\3"+
		"\2\2\2\16\u0090\3\2\2\2\20\u0093\3\2\2\2\22\u009a\3\2\2\2\24\u00a5\3\2"+
		"\2\2\26\u00a7\3\2\2\2\30\u00ab\3\2\2\2\32\u00b0\3\2\2\2\34\u00b4\3\2\2"+
		"\2\36\u00b8\3\2\2\2 \u00ba\3\2\2\2\"\u00bc\3\2\2\2$\u00be\3\2\2\2&\u00c0"+
		"\3\2\2\2(\u00c2\3\2\2\2*\u00c7\3\2\2\2,\u00d0\3\2\2\2.\u00d3\3\2\2\2\60"+
		"\u00df\3\2\2\2\62\u00ed\3\2\2\2\64\u0125\3\2\2\2\66\u0129\3\2\2\28\u012b"+
		"\3\2\2\2:\u012f\3\2\2\2<\u0131\3\2\2\2>\u0137\3\2\2\2@\u0139\3\2\2\2B"+
		"\u0141\3\2\2\2D\u0146\3\2\2\2F\u014e\3\2\2\2H\u0156\3\2\2\2J\u015e\3\2"+
		"\2\2L\u0168\3\2\2\2N\u0176\3\2\2\2P\u0180\3\2\2\2R\u018c\3\2\2\2T\u01a0"+
		"\3\2\2\2V\u01c4\3\2\2\2XZ\5\4\3\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2"+
		"\2\2\\a\3\2\2\2][\3\2\2\2^`\5\6\4\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2bg\3\2\2\2ca\3\2\2\2df\5\b\5\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3"+
		"\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\2\2\3k\3\3\2\2\2lm\7\3\2\2mn\7\4\2\2no"+
		"\7\5\2\2op\7\4\2\2pq\3\2\2\2qr\7\6\2\2r\5\3\2\2\2st\7\7\2\2tu\7\4\2\2"+
		"uv\7\5\2\2vw\7\4\2\2wx\3\2\2\2xy\7\6\2\2y\7\3\2\2\2z{\5\n\6\2{|\7\b\2"+
		"\2|~\7\4\2\2}\177\5\f\7\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\7\t\2\2\u0081\t\3\2\2\2\u0082\u0083\t\2\2\2\u0083\13\3\2\2\2\u0084"+
		"\u0085\7\r\2\2\u0085\u008a\7\4\2\2\u0086\u0087\7\5\2\2\u0087\u0089\7\4"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\r\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0091\5\30\r"+
		"\2\u008e\u0091\5(\25\2\u008f\u0091\5\20\t\2\u0090\u008d\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\17\3\2\2\2\u0092\u0094\5\n\6"+
		"\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096"+
		"\5\32\16\2\u0096\u0097\7\4\2\2\u0097\u0098\5*\26\2\u0098\u0099\5\22\n"+
		"\2\u0099\21\3\2\2\2\u009a\u009e\7\16\2\2\u009b\u009d\5\24\13\2\u009c\u009b"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\17\2\2\u00a2\23\3\2\2"+
		"\2\u00a3\u00a6\5\26\f\2\u00a4\u00a6\5\64\33\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\25\3\2\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9\7\4"+
		"\2\2\u00a9\u00aa\7\6\2\2\u00aa\27\3\2\2\2\u00ab\u00ac\5\n\6\2\u00ac\u00ad"+
		"\5\26\f\2\u00ad\31\3\2\2\2\u00ae\u00b1\5\34\17\2\u00af\u00b1\5$\23\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\33\3\2\2\2\u00b2\u00b5\5\36\20"+
		"\2\u00b3\u00b5\7\20\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\35\3\2\2\2\u00b6\u00b9\5 \21\2\u00b7\u00b9\5\"\22\2\u00b8\u00b6\3\2\2"+
		"\2\u00b8\u00b7\3\2\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb!\3\2"+
		"\2\2\u00bc\u00bd\t\4\2\2\u00bd#\3\2\2\2\u00be\u00bf\5&\24\2\u00bf%\3\2"+
		"\2\2\u00c0\u00c1\7\4\2\2\u00c1\'\3\2\2\2\u00c2\u00c3\5\n\6\2\u00c3\u00c4"+
		"\7\4\2\2\u00c4\u00c5\5*\26\2\u00c5\u00c6\5.\30\2\u00c6)\3\2\2\2\u00c7"+
		"\u00c9\7\30\2\2\u00c8\u00ca\5,\27\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00cd\5,\27\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\7\32\2\2\u00cf+\3\2\2\2\u00d0\u00d1\5\32\16"+
		"\2\u00d1\u00d2\7\4\2\2\u00d2-\3\2\2\2\u00d3\u00d5\7\16\2\2\u00d4\u00d6"+
		"\5\60\31\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da\3\2\2\2"+
		"\u00d7\u00d9\5\64\33\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00de\7\17\2\2\u00de/\3\2\2\2\u00df\u00e0\7\33\2\2\u00e0\u00e2\7\30\2"+
		"\2\u00e1\u00e3\5\62\32\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e8\3\2\2\2\u00e4\u00e5\7\31\2\2\u00e5\u00e7\5\62\32\2\u00e6\u00e4"+
		"\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\32\2\2\u00ec\61\3\2\2"+
		"\2\u00ed\u00ee\7\4\2\2\u00ee\63\3\2\2\2\u00ef\u00f0\5:\36\2\u00f0\u00f1"+
		"\7\6\2\2\u00f1\u0126\3\2\2\2\u00f2\u00f3\7\34\2\2\u00f3\u00f4\7\30\2\2"+
		"\u00f4\u00f5\5:\36\2\u00f5\u00f6\7\32\2\2\u00f6\u00f9\5\64\33\2\u00f7"+
		"\u00f8\7\35\2\2\u00f8\u00fa\5\64\33\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u0126\3\2\2\2\u00fb\u00fc\7\36\2\2\u00fc\u00fe\7\30\2\2"+
		"\u00fd\u00ff\5\66\34\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0102\7\6\2\2\u0101\u0103\58\35\2\u0102\u0101\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\32\2\2\u0105\u0126\5"+
		"\64\33\2\u0106\u0107\7\37\2\2\u0107\u0108\7\30\2\2\u0108\u0109\5:\36\2"+
		"\u0109\u010a\7\32\2\2\u010a\u010b\5\64\33\2\u010b\u0126\3\2\2\2\u010c"+
		"\u010d\7 \2\2\u010d\u010e\5\64\33\2\u010e\u010f\7\37\2\2\u010f\u0110\7"+
		"\30\2\2\u0110\u0111\5:\36\2\u0111\u0112\7\32\2\2\u0112\u0113\7\6\2\2\u0113"+
		"\u0126\3\2\2\2\u0114\u0115\7!\2\2\u0115\u0126\7\6\2\2\u0116\u0117\7\""+
		"\2\2\u0117\u0126\7\6\2\2\u0118\u011a\7#\2\2\u0119\u011b\5:\36\2\u011a"+
		"\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0126\7\6"+
		"\2\2\u011d\u0121\7\16\2\2\u011e\u0120\5\24\13\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0126\7\17\2\2\u0125\u00ef\3\2\2\2\u0125"+
		"\u00f2\3\2\2\2\u0125\u00fb\3\2\2\2\u0125\u0106\3\2\2\2\u0125\u010c\3\2"+
		"\2\2\u0125\u0114\3\2\2\2\u0125\u0116\3\2\2\2\u0125\u0118\3\2\2\2\u0125"+
		"\u011d\3\2\2\2\u0126\65\3\2\2\2\u0127\u012a\5\26\f\2\u0128\u012a\5:\36"+
		"\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\67\3\2\2\2\u012b\u012c"+
		"\5:\36\2\u012c9\3\2\2\2\u012d\u0130\5<\37\2\u012e\u0130\5D#\2\u012f\u012d"+
		"\3\2\2\2\u012f\u012e\3\2\2\2\u0130;\3\2\2\2\u0131\u0132\5> \2\u0132\u0133"+
		"\7$\2\2\u0133\u0134\5:\36\2\u0134=\3\2\2\2\u0135\u0138\5@!\2\u0136\u0138"+
		"\5B\"\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138?\3\2\2\2\u0139\u013e"+
		"\7\4\2\2\u013a\u013b\7\5\2\2\u013b\u013d\7\4\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fA\3\2\2\2"+
		"\u0140\u013e\3\2\2\2\u0141\u0142\7\4\2\2\u0142\u0143\7%\2\2\u0143\u0144"+
		"\7&\2\2\u0144\u0145\7\'\2\2\u0145C\3\2\2\2\u0146\u014c\5F$\2\u0147\u0148"+
		"\7(\2\2\u0148\u0149\5:\36\2\u0149\u014a\7)\2\2\u014a\u014b\5:\36\2\u014b"+
		"\u014d\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u014d\3\2\2\2\u014dE\3\2\2\2"+
		"\u014e\u0153\5H%\2\u014f\u0150\7*\2\2\u0150\u0152\5H%\2\u0151\u014f\3"+
		"\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"G\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015b\5J&\2\u0157\u0158\7+\2\2\u0158"+
		"\u015a\5J&\2\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2"+
		"\2\u015b\u015c\3\2\2\2\u015cI\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0165"+
		"\5L\'\2\u015f\u0160\7,\2\2\u0160\u0164\5L\'\2\u0161\u0162\7-\2\2\u0162"+
		"\u0164\5L\'\2\u0163\u015f\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166K\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0168\u0173\5N(\2\u0169\u016a\7.\2\2\u016a\u0172\5N(\2\u016b"+
		"\u016c\7/\2\2\u016c\u0172\5N(\2\u016d\u016e\7\60\2\2\u016e\u0172\5N(\2"+
		"\u016f\u0170\7\61\2\2\u0170\u0172\5N(\2\u0171\u0169\3\2\2\2\u0171\u016b"+
		"\3\2\2\2\u0171\u016d\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174M\3\2\2\2\u0175\u0173\3\2\2\2"+
		"\u0176\u017d\5P)\2\u0177\u0178\7\62\2\2\u0178\u017c\5P)\2\u0179\u017a"+
		"\7\63\2\2\u017a\u017c\5P)\2\u017b\u0177\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017eO\3\2\2\2"+
		"\u017f\u017d\3\2\2\2\u0180\u0189\5T+\2\u0181\u0182\7\64\2\2\u0182\u0188"+
		"\5T+\2\u0183\u0184\7\65\2\2\u0184\u0188\5T+\2\u0185\u0186\7\66\2\2\u0186"+
		"\u0188\5T+\2\u0187\u0181\3\2\2\2\u0187\u0183\3\2\2\2\u0187\u0185\3\2\2"+
		"\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018aQ"+
		"\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u0193\5V,\2\u018d\u018e\7\62\2\2\u018e"+
		"\u0192\5T+\2\u018f\u0190\7\63\2\2\u0190\u0192\5T+\2\u0191\u018d\3\2\2"+
		"\2\u0191\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194S\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\62\2\2\u0197"+
		"\u019b\5T+\2\u0198\u0199\7\63\2\2\u0199\u019b\5T+\2\u019a\u0196\3\2\2"+
		"\2\u019a\u0198\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\5T+\2\u019d\u01a1"+
		"\3\2\2\2\u019e\u019f\7\67\2\2\u019f\u01a1\5T+\2\u01a0\u019a\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1U\3\2\2\2\u01a2\u01c5\7&\2\2\u01a3\u01c5\7\4\2\2\u01a4"+
		"\u01c5\78\2\2\u01a5\u01c5\7\33\2\2\u01a6\u01a7\7\30\2\2\u01a7\u01a8\5"+
		":\36\2\u01a8\u01a9\7\32\2\2\u01a9\u01c5\3\2\2\2\u01aa\u01ab\79\2\2\u01ab"+
		"\u01ac\5&\24\2\u01ac\u01ae\7\30\2\2\u01ad\u01af\5\62\32\2\u01ae\u01ad"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b4\3\2\2\2\u01b0\u01b1\7\31\2\2"+
		"\u01b1\u01b3\5\62\32\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01b8\7\32\2\2\u01b8\u01c5\3\2\2\2\u01b9\u01ba\7\67\2\2\u01ba\u01c5\5"+
		"T+\2\u01bb\u01bc\7:\2\2\u01bc\u01c5\5T+\2\u01bd\u01be\7;\2\2\u01be\u01c5"+
		"\5T+\2\u01bf\u01c0\5\32\16\2\u01c0\u01c1\7\30\2\2\u01c1\u01c2\5:\36\2"+
		"\u01c2\u01c3\7\32\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01a2\3\2\2\2\u01c4\u01a3"+
		"\3\2\2\2\u01c4\u01a4\3\2\2\2\u01c4\u01a5\3\2\2\2\u01c4\u01a6\3\2\2\2\u01c4"+
		"\u01aa\3\2\2\2\u01c4\u01b9\3\2\2\2\u01c4\u01bb\3\2\2\2\u01c4\u01bd\3\2"+
		"\2\2\u01c4\u01bf\3\2\2\2\u01c5W\3\2\2\2/[ag~\u008a\u0090\u0093\u009e\u00a5"+
		"\u00b0\u00b4\u00b8\u00c9\u00d5\u00da\u00e2\u00e8\u00f9\u00fe\u0102\u011a"+
		"\u0121\u0125\u0129\u012f\u0137\u013e\u014c\u0153\u015b\u0163\u0165\u0171"+
		"\u0173\u017b\u017d\u0187\u0189\u0191\u0193\u019a\u01a0\u01ae\u01b4\u01c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}