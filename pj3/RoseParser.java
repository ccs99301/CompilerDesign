// Generated from Rose.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, DECLARE=2, ELSE=3, END=4, EXIT=5, FOR=6, IF=7, IN=8, INTEGER=9, 
		IS=10, LOOP=11, PROCEDURE=12, READ=13, THEN=14, WRITE=15, ID=16, CONST=17, 
		WHITESPACE=18, COMMENT=19, COL=20, DOT2=21, SCOL=22, ADD=23, SUB=24, MUL=25, 
		DIV=26, MOD=27, EQ=28, NEQ=29, GT=30, GE=31, LT=32, LE=33, AND=34, OR=35, 
		NOT=36, DEF=37, OPAREN=38, CPAREN=39;
	public static final int
		RULE_token = 0, RULE_program = 1, RULE_variables = 2, RULE_variables2 = 3, 
		RULE_variable = 4, RULE_statements = 5, RULE_statements2 = 6, RULE_statement = 7, 
		RULE_assignment_statement = 8, RULE_if_statement = 9, RULE_else_statement = 10, 
		RULE_for_statement = 11, RULE_exit_statement = 12, RULE_read_statement = 13, 
		RULE_write_statement = 14, RULE_bool_expression = 15, RULE_bool_expression2 = 16, 
		RULE_bool_term = 17, RULE_bool_term2 = 18, RULE_bool_factor = 19, RULE_bool_primary = 20, 
		RULE_relation_op = 21, RULE_arith_expression = 22, RULE_arith_expression2 = 23, 
		RULE_arith_term = 24, RULE_arith_term2 = 25, RULE_arith_factor = 26, RULE_arith_primary = 27;
	public static final String[] ruleNames = {
		"token", "program", "variables", "variables2", "variable", "statements", 
		"statements2", "statement", "assignment_statement", "if_statement", "else_statement", 
		"for_statement", "exit_statement", "read_statement", "write_statement", 
		"bool_expression", "bool_expression2", "bool_term", "bool_term2", "bool_factor", 
		"bool_primary", "relation_op", "arith_expression", "arith_expression2", 
		"arith_term", "arith_term2", "arith_factor", "arith_primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'declare'", "'else'", "'end'", "'exit'", "'for'", "'if'", 
		"'in'", "'integer'", "'is'", "'loop'", "'procedure'", "'read'", "'then'", 
		"'write'", null, null, null, null, "':'", "'..'", "';'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'&&'", 
		"'||'", "'!'", "':='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "DECLARE", "ELSE", "END", "EXIT", "FOR", "IF", "IN", "INTEGER", 
		"IS", "LOOP", "PROCEDURE", "READ", "THEN", "WRITE", "ID", "CONST", "WHITESPACE", 
		"COMMENT", "COL", "DOT2", "SCOL", "ADD", "SUB", "MUL", "DIV", "MOD", "EQ", 
		"NEQ", "GT", "GE", "LT", "LE", "AND", "OR", "NOT", "DEF", "OPAREN", "CPAREN"
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
	public String getGrammarFileName() { return "Rose.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RoseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TokenContext extends ParserRuleContext {
		public List<TerminalNode> BEGIN() { return getTokens(RoseParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(RoseParser.BEGIN, i);
		}
		public List<TerminalNode> DECLARE() { return getTokens(RoseParser.DECLARE); }
		public TerminalNode DECLARE(int i) {
			return getToken(RoseParser.DECLARE, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(RoseParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(RoseParser.ELSE, i);
		}
		public List<TerminalNode> END() { return getTokens(RoseParser.END); }
		public TerminalNode END(int i) {
			return getToken(RoseParser.END, i);
		}
		public List<TerminalNode> EXIT() { return getTokens(RoseParser.EXIT); }
		public TerminalNode EXIT(int i) {
			return getToken(RoseParser.EXIT, i);
		}
		public List<TerminalNode> FOR() { return getTokens(RoseParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(RoseParser.FOR, i);
		}
		public List<TerminalNode> IF() { return getTokens(RoseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(RoseParser.IF, i);
		}
		public List<TerminalNode> IN() { return getTokens(RoseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(RoseParser.IN, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(RoseParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(RoseParser.INTEGER, i);
		}
		public List<TerminalNode> IS() { return getTokens(RoseParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(RoseParser.IS, i);
		}
		public List<TerminalNode> LOOP() { return getTokens(RoseParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(RoseParser.LOOP, i);
		}
		public List<TerminalNode> PROCEDURE() { return getTokens(RoseParser.PROCEDURE); }
		public TerminalNode PROCEDURE(int i) {
			return getToken(RoseParser.PROCEDURE, i);
		}
		public List<TerminalNode> READ() { return getTokens(RoseParser.READ); }
		public TerminalNode READ(int i) {
			return getToken(RoseParser.READ, i);
		}
		public List<TerminalNode> THEN() { return getTokens(RoseParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(RoseParser.THEN, i);
		}
		public List<TerminalNode> WRITE() { return getTokens(RoseParser.WRITE); }
		public TerminalNode WRITE(int i) {
			return getToken(RoseParser.WRITE, i);
		}
		public List<TerminalNode> ID() { return getTokens(RoseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RoseParser.ID, i);
		}
		public List<TerminalNode> CONST() { return getTokens(RoseParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(RoseParser.CONST, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(RoseParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(RoseParser.WHITESPACE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(RoseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(RoseParser.COMMENT, i);
		}
		public List<TerminalNode> COL() { return getTokens(RoseParser.COL); }
		public TerminalNode COL(int i) {
			return getToken(RoseParser.COL, i);
		}
		public List<TerminalNode> DOT2() { return getTokens(RoseParser.DOT2); }
		public TerminalNode DOT2(int i) {
			return getToken(RoseParser.DOT2, i);
		}
		public List<TerminalNode> SCOL() { return getTokens(RoseParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(RoseParser.SCOL, i);
		}
		public List<TerminalNode> ADD() { return getTokens(RoseParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(RoseParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(RoseParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(RoseParser.SUB, i);
		}
		public List<TerminalNode> MUL() { return getTokens(RoseParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(RoseParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(RoseParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(RoseParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(RoseParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(RoseParser.MOD, i);
		}
		public List<TerminalNode> EQ() { return getTokens(RoseParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(RoseParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(RoseParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(RoseParser.NEQ, i);
		}
		public List<TerminalNode> GT() { return getTokens(RoseParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(RoseParser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(RoseParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(RoseParser.GE, i);
		}
		public List<TerminalNode> LT() { return getTokens(RoseParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(RoseParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(RoseParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(RoseParser.LE, i);
		}
		public List<TerminalNode> AND() { return getTokens(RoseParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RoseParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(RoseParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RoseParser.OR, i);
		}
		public List<TerminalNode> NOT() { return getTokens(RoseParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(RoseParser.NOT, i);
		}
		public List<TerminalNode> DEF() { return getTokens(RoseParser.DEF); }
		public TerminalNode DEF(int i) {
			return getToken(RoseParser.DEF, i);
		}
		public List<TerminalNode> OPAREN() { return getTokens(RoseParser.OPAREN); }
		public TerminalNode OPAREN(int i) {
			return getToken(RoseParser.OPAREN, i);
		}
		public List<TerminalNode> CPAREN() { return getTokens(RoseParser.CPAREN); }
		public TerminalNode CPAREN(int i) {
			return getToken(RoseParser.CPAREN, i);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << DECLARE) | (1L << ELSE) | (1L << END) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << IS) | (1L << LOOP) | (1L << PROCEDURE) | (1L << READ) | (1L << THEN) | (1L << WRITE) | (1L << ID) | (1L << CONST) | (1L << WHITESPACE) | (1L << COMMENT) | (1L << COL) | (1L << DOT2) | (1L << SCOL) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << DEF) | (1L << OPAREN) | (1L << CPAREN))) != 0)) {
				{
				{
				setState(56);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << DECLARE) | (1L << ELSE) | (1L << END) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << IS) | (1L << LOOP) | (1L << PROCEDURE) | (1L << READ) | (1L << THEN) | (1L << WRITE) | (1L << ID) | (1L << CONST) | (1L << WHITESPACE) | (1L << COMMENT) | (1L << COL) | (1L << DOT2) | (1L << SCOL) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << DEF) | (1L << OPAREN) | (1L << CPAREN))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(61);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(RoseParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IS() { return getToken(RoseParser.IS, 0); }
		public TerminalNode DECLARE() { return getToken(RoseParser.DECLARE, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(RoseParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode SCOL() { return getToken(RoseParser.SCOL, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(PROCEDURE);
			setState(63);
			match(ID);
			setState(64);
			match(IS);
			setState(65);
			match(DECLARE);
			setState(66);
			variables();
			setState(67);
			match(BEGIN);
			int reg=0,label=1; System.out.println("\n\t.text\nmain:");
			setState(69);
			statements(reg,label);
			setState(70);
			match(END);
			setState(71);
			match(SCOL);
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

	public static class VariablesContext extends ParserRuleContext {
		public Variables2Context variables2() {
			return getRuleContext(Variables2Context.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("\t.data");
			setState(74);
			variables2();
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

	public static class Variables2Context extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Variables2Context variables2() {
			return getRuleContext(Variables2Context.class,0);
		}
		public Variables2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterVariables2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitVariables2(this);
		}
	}

	public final Variables2Context variables2() throws RecognitionException {
		Variables2Context _localctx = new Variables2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables2);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				variable();
				setState(77);
				variables2();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VariableContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode COL() { return getToken(RoseParser.COL, 0); }
		public TerminalNode INTEGER() { return getToken(RoseParser.INTEGER, 0); }
		public TerminalNode SCOL() { return getToken(RoseParser.SCOL, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((VariableContext)_localctx).ID = match(ID);
			setState(83);
			match(COL);
			setState(84);
			match(INTEGER);
			setState(85);
			match(SCOL);
			System.out.println(((VariableContext)_localctx).ID.getText()+":\t.word 0");
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

	public static class StatementsContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Statements2Context statements2;
		public Statements2Context statements2() {
			return getRuleContext(Statements2Context.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements(int reg,int label) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 10, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((StatementsContext)_localctx).statements2 = statements2(_localctx.reg,_localctx.label);
			((StatementsContext)_localctx).nreg = ((StatementsContext)_localctx).statements2.nreg; ((StatementsContext)_localctx).nlabel = ((StatementsContext)_localctx).statements2.nlabel;
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

	public static class Statements2Context extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public StatementContext statement;
		public Statements2Context statements2;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statements2Context statements2() {
			return getRuleContext(Statements2Context.class,0);
		}
		public Statements2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Statements2Context(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statements2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatements2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatements2(this);
		}
	}

	public final Statements2Context statements2(int reg,int label) throws RecognitionException {
		Statements2Context _localctx = new Statements2Context(_ctx, getState(), reg, label);
		enterRule(_localctx, 12, RULE_statements2);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case EXIT:
			case FOR:
			case IF:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				((Statements2Context)_localctx).statement = statement(_localctx.reg,_localctx.label);
				setState(92);
				((Statements2Context)_localctx).statements2 = statements2(((Statements2Context)_localctx).statement.nreg,((Statements2Context)_localctx).statement.nlabel);
				((Statements2Context)_localctx).nreg = _localctx.nreg; ((Statements2Context)_localctx).nlabel = _localctx.nlabel;
				}
				break;
			case ELSE:
			case END:
				enterOuterAlt(_localctx, 2);
				{
				((Statements2Context)_localctx).nreg = _localctx.reg; ((Statements2Context)_localctx).nlabel = _localctx.label;
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

	public static class StatementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Assignment_statementContext assignment_statement;
		public If_statementContext if_statement;
		public For_statementContext for_statement;
		public Write_statementContext write_statement;
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(int reg,int label) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				((StatementContext)_localctx).assignment_statement = assignment_statement(_localctx.reg);
				((StatementContext)_localctx).nreg = ((StatementContext)_localctx).assignment_statement.nreg; ((StatementContext)_localctx).nlabel = _localctx.label;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				((StatementContext)_localctx).if_statement = if_statement(_localctx.reg,_localctx.label);
				((StatementContext)_localctx).nreg = ((StatementContext)_localctx).if_statement.nreg; ((StatementContext)_localctx).nlabel = ((StatementContext)_localctx).if_statement.nlabel;
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				((StatementContext)_localctx).for_statement = for_statement(_localctx.reg,_localctx.label);
				((StatementContext)_localctx).nreg = ((StatementContext)_localctx).for_statement.nreg; ((StatementContext)_localctx).nlabel = ((StatementContext)_localctx).for_statement.nlabel;
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				exit_statement();
				((StatementContext)_localctx).nreg = _localctx.reg; ((StatementContext)_localctx).nlabel = _localctx.label;
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				read_statement(_localctx.reg);
				((StatementContext)_localctx).nreg = _localctx.reg; ((StatementContext)_localctx).nlabel = _localctx.label;
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				((StatementContext)_localctx).write_statement = write_statement(_localctx.reg);
				((StatementContext)_localctx).nreg = ((StatementContext)_localctx).write_statement.nreg; ((StatementContext)_localctx).nlabel = _localctx.label;
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode DEF() { return getToken(RoseParser.DEF, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(RoseParser.SCOL, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement(int reg) throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 16, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((Assignment_statementContext)_localctx).ID = match(ID);
			setState(119);
			match(DEF);
			setState(120);
			((Assignment_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(121);
			match(SCOL);
			System.out.println("\tla\t$t"+((Assignment_statementContext)_localctx).arith_expression.nreg+", "+((Assignment_statementContext)_localctx).ID.getText());
				 System.out.println("\tsw\t$t"+((Assignment_statementContext)_localctx).arith_expression.place+", 0($t"+((Assignment_statementContext)_localctx).arith_expression.nreg+")");
				 ((Assignment_statementContext)_localctx).nreg = ((Assignment_statementContext)_localctx).arith_expression.nreg-1;
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

	public static class If_statementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_expressionContext bool_expression;
		public StatementsContext statements;
		public Else_statementContext else_statement;
		public TerminalNode IF() { return getToken(RoseParser.IF, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(RoseParser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_statementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement(int reg,int label) throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 18, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IF);
			int btrue=_localctx.label++; int bfalse=_localctx.label++; int Lnext;
			setState(126);
			((If_statementContext)_localctx).bool_expression = bool_expression(_localctx.reg,_localctx.label,btrue,bfalse);
			setState(127);
			match(THEN);
			System.out.println("L"+((If_statementContext)_localctx).bool_expression.tbtrue+":");
			setState(129);
			((If_statementContext)_localctx).statements = statements(((If_statementContext)_localctx).bool_expression.nreg,((If_statementContext)_localctx).bool_expression.nlabel);
			Lnext=((If_statementContext)_localctx).bool_expression.nlabel++;
			setState(131);
			((If_statementContext)_localctx).else_statement = else_statement(((If_statementContext)_localctx).statements.nreg,((If_statementContext)_localctx).statements.nlabel,((If_statementContext)_localctx).bool_expression.tbfalse,Lnext);
			((If_statementContext)_localctx).nreg = ((If_statementContext)_localctx).else_statement.nreg; ((If_statementContext)_localctx).nlabel = ((If_statementContext)_localctx).else_statement.nlabel;
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

	public static class Else_statementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int bfalse;
		public int Lnext;
		public int nreg;
		public int nlabel;
		public StatementsContext statements;
		public TerminalNode ELSE() { return getToken(RoseParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode IF() { return getToken(RoseParser.IF, 0); }
		public TerminalNode SCOL() { return getToken(RoseParser.SCOL, 0); }
		public Else_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Else_statementContext(ParserRuleContext parent, int invokingState, int reg, int label, int bfalse, int Lnext) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.bfalse = bfalse;
			this.Lnext = Lnext;
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement(int reg,int label,int bfalse,int Lnext) throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState(), reg, label, bfalse, Lnext);
		enterRule(_localctx, 20, RULE_else_statement);
		try {
			setState(146);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("\tb\tL"+_localctx.Lnext); System.out.println("L"+_localctx.bfalse+":");
				setState(135);
				match(ELSE);
				setState(136);
				((Else_statementContext)_localctx).statements = statements(_localctx.reg,_localctx.label);
				setState(137);
				match(END);
				setState(138);
				match(IF);
				setState(139);
				match(SCOL);
				System.out.println("L"+_localctx.Lnext+":"); ((Else_statementContext)_localctx).nreg = ((Else_statementContext)_localctx).statements.nreg; ((Else_statementContext)_localctx).nlabel = ((Else_statementContext)_localctx).statements.nlabel;
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(END);
				setState(143);
				match(IF);
				setState(144);
				match(SCOL);
				System.out.println("L"+_localctx.bfalse+":"); ((Else_statementContext)_localctx).nreg = _localctx.reg; ((Else_statementContext)_localctx).nlabel = _localctx.label;
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

	public static class For_statementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public StatementsContext statements;
		public TerminalNode FOR() { return getToken(RoseParser.FOR, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IN() { return getToken(RoseParser.IN, 0); }
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public TerminalNode DOT2() { return getToken(RoseParser.DOT2, 0); }
		public List<TerminalNode> LOOP() { return getTokens(RoseParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(RoseParser.LOOP, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode SCOL() { return getToken(RoseParser.SCOL, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public For_statementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement(int reg,int label) throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 22, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int Lbegin=_localctx.label++; int btrue=_localctx.label++; int bfalse=_localctx.label++;
			setState(149);
			match(FOR);
			setState(150);
			((For_statementContext)_localctx).ID = match(ID);
			setState(151);
			match(IN);
			setState(152);
			((For_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			System.out.println("\tla\t$t"+((For_statementContext)_localctx).arith_expression.nreg+", "+((For_statementContext)_localctx).ID.getText());
				System.out.println("\tsw\t$t"+((For_statementContext)_localctx).arith_expression.place+", 0($t"+((For_statementContext)_localctx).arith_expression.nreg+")"); ((For_statementContext)_localctx).nreg = ((For_statementContext)_localctx).arith_expression.nreg-1;
				System.out.println("L"+Lbegin+":"); System.out.println("\tla\t$t"+_localctx.nreg+", "+((For_statementContext)_localctx).ID.getText());
				System.out.println("\tlw\t$t"+_localctx.nreg+", 0($t"+_localctx.nreg+")");
			setState(154);
			match(DOT2);
			setState(155);
			((For_statementContext)_localctx).arith_expression = arith_expression(_localctx.nreg+1);
			System.out.println("\tble\t$t"+_localctx.nreg+", $t"+((For_statementContext)_localctx).arith_expression.place+", L"+btrue); System.out.println("\tb\tL"+bfalse);
			setState(157);
			match(LOOP);
			System.out.println("L"+btrue+":"); ((For_statementContext)_localctx).nreg = ((For_statementContext)_localctx).arith_expression.nreg-2;
			setState(159);
			((For_statementContext)_localctx).statements = statements(_localctx.nreg,_localctx.label);
			((For_statementContext)_localctx).nreg = ((For_statementContext)_localctx).statements.nreg; System.out.println("\tla\t$t"+_localctx.nreg+", "+((For_statementContext)_localctx).ID.getText());
				 System.out.println("\tlw\t$t"+_localctx.nreg+", 0($t"+_localctx.nreg+")"); System.out.println("\tli\t$t"+(_localctx.nreg+1)+", 1");
				 System.out.println("\tadd\t$t"+_localctx.nreg+", $t"+_localctx.nreg+", $t"+(_localctx.nreg+1));
				 System.out.println("\tla\t$t"+(_localctx.nreg+1)+", "+((For_statementContext)_localctx).ID.getText()); System.out.println("\tsw\t$t"+_localctx.nreg+", 0($t"+(_localctx.nreg+1)+")");
			setState(161);
			match(END);
			setState(162);
			match(LOOP);
			setState(163);
			match(SCOL);
			System.out.println("\tb\tL"+Lbegin); System.out.println("L"+bfalse+":"); ((For_statementContext)_localctx).nreg = ((For_statementContext)_localctx).statements.nreg; ((For_statementContext)_localctx).nlabel = ((For_statementContext)_localctx).statements.nlabel;
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

	public static class Exit_statementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(RoseParser.EXIT, 0); }
		public TerminalNode SCOL() { return getToken(RoseParser.SCOL, 0); }
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterExit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitExit_statement(this);
		}
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exit_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(EXIT);
			setState(167);
			match(SCOL);
			System.out.println("\tli\t$v0, 10\n\tsyscall");
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

	public static class Read_statementContext extends ParserRuleContext {
		public int reg;
		public Token ID;
		public TerminalNode READ() { return getToken(RoseParser.READ, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(RoseParser.SCOL, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Read_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRead_statement(this);
		}
	}

	public final Read_statementContext read_statement(int reg) throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 26, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(READ);
			setState(171);
			((Read_statementContext)_localctx).ID = match(ID);
			setState(172);
			match(SCOL);
			System.out.println("\tli\t$v0, 5\n\tsyscall\n\tla\t$t"+_localctx.reg+", "+((Read_statementContext)_localctx).ID.getText()+"\n\tsw\t$v0, 0($t"+_localctx.reg+")");
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

	public static class Write_statementContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public Arith_expressionContext arith_expression;
		public TerminalNode WRITE() { return getToken(RoseParser.WRITE, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(RoseParser.SCOL, 0); }
		public Write_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Write_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement(int reg) throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 28, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(WRITE);
			setState(176);
			((Write_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(177);
			match(SCOL);
			System.out.println("\tmove\t$a0, $t"+((Write_statementContext)_localctx).arith_expression.place+"\n\tli\t$v0, 1\n\tsyscall"); ((Write_statementContext)_localctx).nreg = ((Write_statementContext)_localctx).arith_expression.nreg-1;
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int btrue;
		public int bfalse;
		public int nreg;
		public int nlabel;
		public int tbtrue;
		public int tbfalse;
		public Bool_termContext bool_term;
		public Bool_expression2Context bool_expression2;
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression2Context bool_expression2() {
			return getRuleContext(Bool_expression2Context.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState, int reg, int label, int btrue, int bfalse) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.btrue = btrue;
			this.bfalse = bfalse;
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression(int reg,int label,int btrue,int bfalse) throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState(), reg, label, btrue, bfalse);
		enterRule(_localctx, 30, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((Bool_expressionContext)_localctx).bool_term = bool_term(_localctx.reg,_localctx.label,_localctx.btrue,_localctx.bfalse);
			((Bool_expressionContext)_localctx).bool_term.nlabel++; ((Bool_expressionContext)_localctx).tbtrue = ((Bool_expressionContext)_localctx).bool_term.nlabel-3;
			setState(182);
			((Bool_expressionContext)_localctx).bool_expression2 = bool_expression2(((Bool_expressionContext)_localctx).bool_term.nreg,((Bool_expressionContext)_localctx).bool_term.nlabel,((Bool_expressionContext)_localctx).bool_term.nlabel-3,((Bool_expressionContext)_localctx).bool_term.nlabel-1);
			((Bool_expressionContext)_localctx).nreg = ((Bool_expressionContext)_localctx).bool_expression2.nreg; ((Bool_expressionContext)_localctx).nlabel = ((Bool_expressionContext)_localctx).bool_expression2.nlabel; ((Bool_expressionContext)_localctx).tbfalse = ((Bool_expressionContext)_localctx).bool_expression2.tbfalse;
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

	public static class Bool_expression2Context extends ParserRuleContext {
		public int reg;
		public int label;
		public int btrue;
		public int bfalse;
		public int nreg;
		public int nlabel;
		public int tbfalse;
		public Bool_termContext bool_term;
		public Bool_expression2Context bool_expression2;
		public TerminalNode OR() { return getToken(RoseParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression2Context bool_expression2() {
			return getRuleContext(Bool_expression2Context.class,0);
		}
		public Bool_expression2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expression2Context(ParserRuleContext parent, int invokingState, int reg, int label, int btrue, int bfalse) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.btrue = btrue;
			this.bfalse = bfalse;
		}
		@Override public int getRuleIndex() { return RULE_bool_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_expression2(this);
		}
	}

	public final Bool_expression2Context bool_expression2(int reg,int label,int btrue,int bfalse) throws RecognitionException {
		Bool_expression2Context _localctx = new Bool_expression2Context(_ctx, getState(), reg, label, btrue, bfalse);
		enterRule(_localctx, 32, RULE_bool_expression2);
		try {
			setState(193);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("L"+_localctx.bfalse+":");
				setState(186);
				match(OR);
				setState(187);
				((Bool_expression2Context)_localctx).bool_term = bool_term(_localctx.reg,_localctx.label,_localctx.btrue,_localctx.bfalse);
				((Bool_expression2Context)_localctx).bool_term.nlabel++;
				setState(189);
				((Bool_expression2Context)_localctx).bool_expression2 = bool_expression2(((Bool_expression2Context)_localctx).bool_term.nreg,((Bool_expression2Context)_localctx).bool_term.nlabel,_localctx.btrue,((Bool_expression2Context)_localctx).bool_term.nlabel-1);
				((Bool_expression2Context)_localctx).nreg = _localctx.nreg; ((Bool_expression2Context)_localctx).nlabel = _localctx.nlabel; ((Bool_expression2Context)_localctx).tbfalse = _localctx.bfalse;
				}
				break;
			case THEN:
				enterOuterAlt(_localctx, 2);
				{
				((Bool_expression2Context)_localctx).nreg = _localctx.reg; ((Bool_expression2Context)_localctx).nlabel = _localctx.label-1; ((Bool_expression2Context)_localctx).tbfalse = _localctx.bfalse-1;
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

	public static class Bool_termContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int btrue;
		public int bfalse;
		public int nreg;
		public int nlabel;
		public Bool_factorContext bool_factor;
		public Bool_term2Context bool_term2;
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term2Context bool_term2() {
			return getRuleContext(Bool_term2Context.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_termContext(ParserRuleContext parent, int invokingState, int reg, int label, int btrue, int bfalse) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.btrue = btrue;
			this.bfalse = bfalse;
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term(int reg,int label,int btrue,int bfalse) throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState(), reg, label, btrue, bfalse);
		enterRule(_localctx, 34, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((Bool_termContext)_localctx).bool_factor = bool_factor(_localctx.reg,_localctx.label,_localctx.btrue,_localctx.bfalse);
			((Bool_termContext)_localctx).bool_factor.nlabel++;
			setState(197);
			((Bool_termContext)_localctx).bool_term2 = bool_term2(((Bool_termContext)_localctx).bool_factor.nreg,((Bool_termContext)_localctx).bool_factor.nlabel,((Bool_termContext)_localctx).bool_factor.nlabel-1,_localctx.bfalse);
			((Bool_termContext)_localctx).nreg = ((Bool_termContext)_localctx).bool_term2.nreg; ((Bool_termContext)_localctx).nlabel = ((Bool_termContext)_localctx).bool_term2.nlabel;
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

	public static class Bool_term2Context extends ParserRuleContext {
		public int reg;
		public int label;
		public int btrue;
		public int bfalse;
		public int nreg;
		public int nlabel;
		public Bool_factorContext bool_factor;
		public Bool_term2Context bool_term2;
		public TerminalNode AND() { return getToken(RoseParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term2Context bool_term2() {
			return getRuleContext(Bool_term2Context.class,0);
		}
		public Bool_term2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_term2Context(ParserRuleContext parent, int invokingState, int reg, int label, int btrue, int bfalse) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.btrue = btrue;
			this.bfalse = bfalse;
		}
		@Override public int getRuleIndex() { return RULE_bool_term2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_term2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_term2(this);
		}
	}

	public final Bool_term2Context bool_term2(int reg,int label,int btrue,int bfalse) throws RecognitionException {
		Bool_term2Context _localctx = new Bool_term2Context(_ctx, getState(), reg, label, btrue, bfalse);
		enterRule(_localctx, 36, RULE_bool_term2);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("L"+_localctx.btrue+":");
				setState(201);
				match(AND);
				setState(202);
				((Bool_term2Context)_localctx).bool_factor = bool_factor(_localctx.reg,_localctx.label,_localctx.btrue,_localctx.bfalse);
				((Bool_term2Context)_localctx).bool_factor.nlabel++;
				setState(204);
				((Bool_term2Context)_localctx).bool_term2 = bool_term2(((Bool_term2Context)_localctx).bool_factor.nreg,((Bool_term2Context)_localctx).bool_factor.nlabel,((Bool_term2Context)_localctx).bool_factor.nlabel-1,_localctx.bfalse);
				((Bool_term2Context)_localctx).nreg = _localctx.nreg; ((Bool_term2Context)_localctx).nlabel = _localctx.nlabel;
				}
				break;
			case THEN:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				((Bool_term2Context)_localctx).nreg = _localctx.reg; ((Bool_term2Context)_localctx).nlabel = _localctx.label-1;
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

	public static class Bool_factorContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int btrue;
		public int bfalse;
		public int nreg;
		public int nlabel;
		public Bool_primaryContext bool_primary;
		public TerminalNode NOT() { return getToken(RoseParser.NOT, 0); }
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_factorContext(ParserRuleContext parent, int invokingState, int reg, int label, int btrue, int bfalse) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.btrue = btrue;
			this.bfalse = bfalse;
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor(int reg,int label,int btrue,int bfalse) throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState(), reg, label, btrue, bfalse);
		enterRule(_localctx, 38, RULE_bool_factor);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(NOT);
				setState(211);
				((Bool_factorContext)_localctx).bool_primary = bool_primary(_localctx.reg,_localctx.label,_localctx.bfalse,_localctx.btrue);
				((Bool_factorContext)_localctx).nreg = ((Bool_factorContext)_localctx).bool_primary.nreg; ((Bool_factorContext)_localctx).nlabel = ((Bool_factorContext)_localctx).bool_primary.nlabel;
				}
				break;
			case ID:
			case CONST:
			case SUB:
			case OPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((Bool_factorContext)_localctx).bool_primary = bool_primary(_localctx.reg,_localctx.label,_localctx.btrue,_localctx.bfalse);
				((Bool_factorContext)_localctx).nreg = ((Bool_factorContext)_localctx).bool_primary.nreg; ((Bool_factorContext)_localctx).nlabel = ((Bool_factorContext)_localctx).bool_primary.nlabel;
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

	public static class Bool_primaryContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int btrue;
		public int bfalse;
		public int nreg;
		public int nlabel;
		public Arith_expressionContext arith_expression;
		public Relation_opContext relation_op;
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_primaryContext(ParserRuleContext parent, int invokingState, int reg, int label, int btrue, int bfalse) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.btrue = btrue;
			this.bfalse = bfalse;
		}
		@Override public int getRuleIndex() { return RULE_bool_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_primary(this);
		}
	}

	public final Bool_primaryContext bool_primary(int reg,int label,int btrue,int bfalse) throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState(), reg, label, btrue, bfalse);
		enterRule(_localctx, 40, RULE_bool_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int oplace;
			setState(220);
			((Bool_primaryContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			oplace=((Bool_primaryContext)_localctx).arith_expression.place;
			setState(222);
			((Bool_primaryContext)_localctx).relation_op = relation_op();
			setState(223);
			((Bool_primaryContext)_localctx).arith_expression = arith_expression(((Bool_primaryContext)_localctx).arith_expression.nreg);
			System.out.println("\t"+((Bool_primaryContext)_localctx).relation_op.op+"\t$t"+oplace+", $t"+((Bool_primaryContext)_localctx).arith_expression.place+", L"+_localctx.btrue);
				 System.out.println("\tb\tL"+_localctx.bfalse); ((Bool_primaryContext)_localctx).nreg = ((Bool_primaryContext)_localctx).arith_expression.nreg-2; ((Bool_primaryContext)_localctx).nlabel = _localctx.label;
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

	public static class Relation_opContext extends ParserRuleContext {
		public String op;
		public TerminalNode EQ() { return getToken(RoseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(RoseParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(RoseParser.GT, 0); }
		public TerminalNode GE() { return getToken(RoseParser.GE, 0); }
		public TerminalNode LT() { return getToken(RoseParser.LT, 0); }
		public TerminalNode LE() { return getToken(RoseParser.LE, 0); }
		public Relation_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRelation_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRelation_op(this);
		}
	}

	public final Relation_opContext relation_op() throws RecognitionException {
		Relation_opContext _localctx = new Relation_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relation_op);
		try {
			setState(238);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(EQ);
				((Relation_opContext)_localctx).op = "beq";
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(NEQ);
				((Relation_opContext)_localctx).op = "bne";
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(GT);
				((Relation_opContext)_localctx).op = "bgt";
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(GE);
				((Relation_opContext)_localctx).op = "bge";
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				match(LT);
				((Relation_opContext)_localctx).op = "blt";
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				match(LE);
				((Relation_opContext)_localctx).op = "ble";
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_termContext arith_term;
		public Arith_expression2Context arith_expression2;
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression2Context arith_expression2() {
			return getRuleContext(Arith_expression2Context.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expressionContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression(int reg) throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState(), reg);
		enterRule(_localctx, 44, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((Arith_expressionContext)_localctx).arith_term = arith_term(_localctx.reg);
			setState(241);
			((Arith_expressionContext)_localctx).arith_expression2 = arith_expression2(((Arith_expressionContext)_localctx).arith_term.nreg,((Arith_expressionContext)_localctx).arith_term.place);
			((Arith_expressionContext)_localctx).nreg = ((Arith_expressionContext)_localctx).arith_expression2.nreg; ((Arith_expressionContext)_localctx).place = ((Arith_expressionContext)_localctx).arith_expression2.place;
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

	public static class Arith_expression2Context extends ParserRuleContext {
		public int reg;
		public int oplace;
		public int nreg;
		public int place;
		public Arith_termContext arith_term;
		public TerminalNode ADD() { return getToken(RoseParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression2Context arith_expression2() {
			return getRuleContext(Arith_expression2Context.class,0);
		}
		public TerminalNode SUB() { return getToken(RoseParser.SUB, 0); }
		public Arith_expression2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expression2Context(ParserRuleContext parent, int invokingState, int reg, int oplace) {
			super(parent, invokingState);
			this.reg = reg;
			this.oplace = oplace;
		}
		@Override public int getRuleIndex() { return RULE_arith_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_expression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_expression2(this);
		}
	}

	public final Arith_expression2Context arith_expression2(int reg,int oplace) throws RecognitionException {
		Arith_expression2Context _localctx = new Arith_expression2Context(_ctx, getState(), reg, oplace);
		enterRule(_localctx, 46, RULE_arith_expression2);
		try {
			setState(255);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(ADD);
				setState(245);
				((Arith_expression2Context)_localctx).arith_term = arith_term(_localctx.reg);
				System.out.println("\tadd\t$t"+_localctx.oplace+", $t"+_localctx.oplace+", $t"+((Arith_expression2Context)_localctx).arith_term.place);
					((Arith_expression2Context)_localctx).nreg = ((Arith_expression2Context)_localctx).arith_term.nreg-1; ((Arith_expression2Context)_localctx).place = _localctx.oplace;
				setState(247);
				arith_expression2(_localctx.nreg,_localctx.oplace);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(SUB);
				setState(250);
				((Arith_expression2Context)_localctx).arith_term = arith_term(_localctx.reg);
				System.out.println("\tsub\t$t"+_localctx.oplace+", $t"+_localctx.oplace+", $t"+((Arith_expression2Context)_localctx).arith_term.place);
					((Arith_expression2Context)_localctx).nreg = ((Arith_expression2Context)_localctx).arith_term.nreg-1; ((Arith_expression2Context)_localctx).place = _localctx.oplace;
				setState(252);
				arith_expression2(_localctx.nreg,_localctx.oplace);
				}
				break;
			case LOOP:
			case THEN:
			case DOT2:
			case SCOL:
			case EQ:
			case NEQ:
			case GT:
			case GE:
			case LT:
			case LE:
			case AND:
			case OR:
			case CPAREN:
				enterOuterAlt(_localctx, 3);
				{
				((Arith_expression2Context)_localctx).nreg = _localctx.reg; ((Arith_expression2Context)_localctx).place = _localctx.oplace;
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

	public static class Arith_termContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_factorContext arith_factor;
		public Arith_term2Context arith_term2;
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term2Context arith_term2() {
			return getRuleContext(Arith_term2Context.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_termContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_term(this);
		}
	}

	public final Arith_termContext arith_term(int reg) throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState(), reg);
		enterRule(_localctx, 48, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			((Arith_termContext)_localctx).arith_factor = arith_factor(_localctx.reg);
			setState(258);
			((Arith_termContext)_localctx).arith_term2 = arith_term2(((Arith_termContext)_localctx).arith_factor.nreg,((Arith_termContext)_localctx).arith_factor.place);
			((Arith_termContext)_localctx).nreg = ((Arith_termContext)_localctx).arith_term2.nreg; ((Arith_termContext)_localctx).place = ((Arith_termContext)_localctx).arith_term2.place;
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

	public static class Arith_term2Context extends ParserRuleContext {
		public int reg;
		public int oplace;
		public int nreg;
		public int place;
		public Arith_factorContext arith_factor;
		public TerminalNode MUL() { return getToken(RoseParser.MUL, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term2Context arith_term2() {
			return getRuleContext(Arith_term2Context.class,0);
		}
		public TerminalNode DIV() { return getToken(RoseParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RoseParser.MOD, 0); }
		public Arith_term2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_term2Context(ParserRuleContext parent, int invokingState, int reg, int oplace) {
			super(parent, invokingState);
			this.reg = reg;
			this.oplace = oplace;
		}
		@Override public int getRuleIndex() { return RULE_arith_term2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_term2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_term2(this);
		}
	}

	public final Arith_term2Context arith_term2(int reg,int oplace) throws RecognitionException {
		Arith_term2Context _localctx = new Arith_term2Context(_ctx, getState(), reg, oplace);
		enterRule(_localctx, 50, RULE_arith_term2);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(MUL);
				setState(262);
				((Arith_term2Context)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\tmul\t$t"+_localctx.oplace+", $t"+_localctx.oplace+", $t"+((Arith_term2Context)_localctx).arith_factor.place);
					((Arith_term2Context)_localctx).nreg = ((Arith_term2Context)_localctx).arith_factor.nreg-1; ((Arith_term2Context)_localctx).place = _localctx.oplace;
				setState(264);
				arith_term2(_localctx.nreg,_localctx.oplace);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(DIV);
				setState(267);
				((Arith_term2Context)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\tdiv\t$t"+_localctx.oplace+", $t"+_localctx.oplace+", $t"+((Arith_term2Context)_localctx).arith_factor.place);
					((Arith_term2Context)_localctx).nreg = ((Arith_term2Context)_localctx).arith_factor.nreg-1; ((Arith_term2Context)_localctx).place = _localctx.oplace;
				setState(269);
				arith_term2(_localctx.nreg,_localctx.oplace);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(MOD);
				setState(272);
				((Arith_term2Context)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\trem\t$t"+_localctx.oplace+", $t"+_localctx.oplace+", $t"+((Arith_term2Context)_localctx).arith_factor.place);
					((Arith_term2Context)_localctx).nreg = ((Arith_term2Context)_localctx).arith_factor.nreg-1; ((Arith_term2Context)_localctx).place = _localctx.oplace;
				setState(274);
				arith_term2(_localctx.nreg,_localctx.oplace);
				}
				break;
			case LOOP:
			case THEN:
			case DOT2:
			case SCOL:
			case ADD:
			case SUB:
			case EQ:
			case NEQ:
			case GT:
			case GE:
			case LT:
			case LE:
			case AND:
			case OR:
			case CPAREN:
				enterOuterAlt(_localctx, 4);
				{
				((Arith_term2Context)_localctx).nreg = _localctx.reg; ((Arith_term2Context)_localctx).place = _localctx.oplace;
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

	public static class Arith_factorContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_primaryContext arith_primary;
		public TerminalNode SUB() { return getToken(RoseParser.SUB, 0); }
		public Arith_primaryContext arith_primary() {
			return getRuleContext(Arith_primaryContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_factorContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_factor(this);
		}
	}

	public final Arith_factorContext arith_factor(int reg) throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState(), reg);
		enterRule(_localctx, 52, RULE_arith_factor);
		try {
			setState(286);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(SUB);
				setState(280);
				((Arith_factorContext)_localctx).arith_primary = arith_primary(_localctx.reg);
				System.out.println("\tneg\t$t"+((Arith_factorContext)_localctx).arith_primary.place+", $t"+((Arith_factorContext)_localctx).arith_primary.place);
					((Arith_factorContext)_localctx).nreg = ((Arith_factorContext)_localctx).arith_primary.nreg; ((Arith_factorContext)_localctx).place = ((Arith_factorContext)_localctx).arith_primary.place;
				}
				break;
			case ID:
			case CONST:
			case OPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				((Arith_factorContext)_localctx).arith_primary = arith_primary(_localctx.reg);
				((Arith_factorContext)_localctx).nreg = ((Arith_factorContext)_localctx).arith_primary.nreg; ((Arith_factorContext)_localctx).place = ((Arith_factorContext)_localctx).arith_primary.place;
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

	public static class Arith_primaryContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Token CONST;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode CONST() { return getToken(RoseParser.CONST, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode OPAREN() { return getToken(RoseParser.OPAREN, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(RoseParser.CPAREN, 0); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_primary(this);
		}
	}

	public final Arith_primaryContext arith_primary(int reg) throws RecognitionException {
		Arith_primaryContext _localctx = new Arith_primaryContext(_ctx, getState(), reg);
		enterRule(_localctx, 54, RULE_arith_primary);
		try {
			setState(297);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				((Arith_primaryContext)_localctx).CONST = match(CONST);
				System.out.println("\tli\t$t"+_localctx.reg+", "+((Arith_primaryContext)_localctx).CONST.getText()); ((Arith_primaryContext)_localctx).place = _localctx.reg; ((Arith_primaryContext)_localctx).nreg = _localctx.reg+1;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				((Arith_primaryContext)_localctx).ID = match(ID);
				System.out.println("\tla\t$t"+_localctx.reg+", "+((Arith_primaryContext)_localctx).ID.getText()); System.out.println("\tlw\t$t"+_localctx.reg+", 0($t"+_localctx.reg+")");
					((Arith_primaryContext)_localctx).place = _localctx.reg; ((Arith_primaryContext)_localctx).nreg = _localctx.reg+1;
				}
				break;
			case OPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(OPAREN);
				setState(293);
				((Arith_primaryContext)_localctx).arith_expression = arith_expression(_localctx.reg);
				setState(294);
				match(CPAREN);
				((Arith_primaryContext)_localctx).nreg = ((Arith_primaryContext)_localctx).arith_expression.nreg; ((Arith_primaryContext)_localctx).place = ((Arith_primaryContext)_localctx).arith_expression.place;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\5\5S\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b"+
		"c\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\tw\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0095\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00c4\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00d3\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00dc\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f1\n\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0102"+
		"\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0118\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0121\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u012c\n\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668\2\3\3\2\3)\u012a\2=\3\2\2\2\4@\3\2\2\2\6K\3"+
		"\2\2\2\bR\3\2\2\2\nT\3\2\2\2\fZ\3\2\2\2\16b\3\2\2\2\20v\3\2\2\2\22x\3"+
		"\2\2\2\24~\3\2\2\2\26\u0094\3\2\2\2\30\u0096\3\2\2\2\32\u00a8\3\2\2\2"+
		"\34\u00ac\3\2\2\2\36\u00b1\3\2\2\2 \u00b6\3\2\2\2\"\u00c3\3\2\2\2$\u00c5"+
		"\3\2\2\2&\u00d2\3\2\2\2(\u00db\3\2\2\2*\u00dd\3\2\2\2,\u00f0\3\2\2\2."+
		"\u00f2\3\2\2\2\60\u0101\3\2\2\2\62\u0103\3\2\2\2\64\u0117\3\2\2\2\66\u0120"+
		"\3\2\2\28\u012b\3\2\2\2:<\t\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2"+
		"\2\2>\3\3\2\2\2?=\3\2\2\2@A\7\16\2\2AB\7\22\2\2BC\7\f\2\2CD\7\4\2\2DE"+
		"\5\6\4\2EF\7\3\2\2FG\b\3\1\2GH\5\f\7\2HI\7\6\2\2IJ\7\30\2\2J\5\3\2\2\2"+
		"KL\b\4\1\2LM\5\b\5\2M\7\3\2\2\2NO\5\n\6\2OP\5\b\5\2PS\3\2\2\2QS\3\2\2"+
		"\2RN\3\2\2\2RQ\3\2\2\2S\t\3\2\2\2TU\7\22\2\2UV\7\26\2\2VW\7\13\2\2WX\7"+
		"\30\2\2XY\b\6\1\2Y\13\3\2\2\2Z[\5\16\b\2[\\\b\7\1\2\\\r\3\2\2\2]^\5\20"+
		"\t\2^_\5\16\b\2_`\b\b\1\2`c\3\2\2\2ac\b\b\1\2b]\3\2\2\2ba\3\2\2\2c\17"+
		"\3\2\2\2de\5\22\n\2ef\b\t\1\2fw\3\2\2\2gh\5\24\13\2hi\b\t\1\2iw\3\2\2"+
		"\2jk\5\30\r\2kl\b\t\1\2lw\3\2\2\2mn\5\32\16\2no\b\t\1\2ow\3\2\2\2pq\5"+
		"\34\17\2qr\b\t\1\2rw\3\2\2\2st\5\36\20\2tu\b\t\1\2uw\3\2\2\2vd\3\2\2\2"+
		"vg\3\2\2\2vj\3\2\2\2vm\3\2\2\2vp\3\2\2\2vs\3\2\2\2w\21\3\2\2\2xy\7\22"+
		"\2\2yz\7\'\2\2z{\5.\30\2{|\7\30\2\2|}\b\n\1\2}\23\3\2\2\2~\177\7\t\2\2"+
		"\177\u0080\b\13\1\2\u0080\u0081\5 \21\2\u0081\u0082\7\20\2\2\u0082\u0083"+
		"\b\13\1\2\u0083\u0084\5\f\7\2\u0084\u0085\b\13\1\2\u0085\u0086\5\26\f"+
		"\2\u0086\u0087\b\13\1\2\u0087\25\3\2\2\2\u0088\u0089\b\f\1\2\u0089\u008a"+
		"\7\5\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7\6\2\2\u008c\u008d\7\t\2\2\u008d"+
		"\u008e\7\30\2\2\u008e\u008f\b\f\1\2\u008f\u0095\3\2\2\2\u0090\u0091\7"+
		"\6\2\2\u0091\u0092\7\t\2\2\u0092\u0093\7\30\2\2\u0093\u0095\b\f\1\2\u0094"+
		"\u0088\3\2\2\2\u0094\u0090\3\2\2\2\u0095\27\3\2\2\2\u0096\u0097\b\r\1"+
		"\2\u0097\u0098\7\b\2\2\u0098\u0099\7\22\2\2\u0099\u009a\7\n\2\2\u009a"+
		"\u009b\5.\30\2\u009b\u009c\b\r\1\2\u009c\u009d\7\27\2\2\u009d\u009e\5"+
		".\30\2\u009e\u009f\b\r\1\2\u009f\u00a0\7\r\2\2\u00a0\u00a1\b\r\1\2\u00a1"+
		"\u00a2\5\f\7\2\u00a2\u00a3\b\r\1\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\7\r"+
		"\2\2\u00a5\u00a6\7\30\2\2\u00a6\u00a7\b\r\1\2\u00a7\31\3\2\2\2\u00a8\u00a9"+
		"\7\7\2\2\u00a9\u00aa\7\30\2\2\u00aa\u00ab\b\16\1\2\u00ab\33\3\2\2\2\u00ac"+
		"\u00ad\7\17\2\2\u00ad\u00ae\7\22\2\2\u00ae\u00af\7\30\2\2\u00af\u00b0"+
		"\b\17\1\2\u00b0\35\3\2\2\2\u00b1\u00b2\7\21\2\2\u00b2\u00b3\5.\30\2\u00b3"+
		"\u00b4\7\30\2\2\u00b4\u00b5\b\20\1\2\u00b5\37\3\2\2\2\u00b6\u00b7\5$\23"+
		"\2\u00b7\u00b8\b\21\1\2\u00b8\u00b9\5\"\22\2\u00b9\u00ba\b\21\1\2\u00ba"+
		"!\3\2\2\2\u00bb\u00bc\b\22\1\2\u00bc\u00bd\7%\2\2\u00bd\u00be\5$\23\2"+
		"\u00be\u00bf\b\22\1\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\b\22\1\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c4\b\22\1\2\u00c3\u00bb\3\2\2\2\u00c3\u00c2\3"+
		"\2\2\2\u00c4#\3\2\2\2\u00c5\u00c6\5(\25\2\u00c6\u00c7\b\23\1\2\u00c7\u00c8"+
		"\5&\24\2\u00c8\u00c9\b\23\1\2\u00c9%\3\2\2\2\u00ca\u00cb\b\24\1\2\u00cb"+
		"\u00cc\7$\2\2\u00cc\u00cd\5(\25\2\u00cd\u00ce\b\24\1\2\u00ce\u00cf\5&"+
		"\24\2\u00cf\u00d0\b\24\1\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3\b\24\1\2\u00d2"+
		"\u00ca\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\'\3\2\2\2\u00d4\u00d5\7&\2\2"+
		"\u00d5\u00d6\5*\26\2\u00d6\u00d7\b\25\1\2\u00d7\u00dc\3\2\2\2\u00d8\u00d9"+
		"\5*\26\2\u00d9\u00da\b\25\1\2\u00da\u00dc\3\2\2\2\u00db\u00d4\3\2\2\2"+
		"\u00db\u00d8\3\2\2\2\u00dc)\3\2\2\2\u00dd\u00de\b\26\1\2\u00de\u00df\5"+
		".\30\2\u00df\u00e0\b\26\1\2\u00e0\u00e1\5,\27\2\u00e1\u00e2\5.\30\2\u00e2"+
		"\u00e3\b\26\1\2\u00e3+\3\2\2\2\u00e4\u00e5\7\36\2\2\u00e5\u00f1\b\27\1"+
		"\2\u00e6\u00e7\7\37\2\2\u00e7\u00f1\b\27\1\2\u00e8\u00e9\7 \2\2\u00e9"+
		"\u00f1\b\27\1\2\u00ea\u00eb\7!\2\2\u00eb\u00f1\b\27\1\2\u00ec\u00ed\7"+
		"\"\2\2\u00ed\u00f1\b\27\1\2\u00ee\u00ef\7#\2\2\u00ef\u00f1\b\27\1\2\u00f0"+
		"\u00e4\3\2\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00ea\3\2"+
		"\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1-\3\2\2\2\u00f2\u00f3"+
		"\5\62\32\2\u00f3\u00f4\5\60\31\2\u00f4\u00f5\b\30\1\2\u00f5/\3\2\2\2\u00f6"+
		"\u00f7\7\31\2\2\u00f7\u00f8\5\62\32\2\u00f8\u00f9\b\31\1\2\u00f9\u00fa"+
		"\5\60\31\2\u00fa\u0102\3\2\2\2\u00fb\u00fc\7\32\2\2\u00fc\u00fd\5\62\32"+
		"\2\u00fd\u00fe\b\31\1\2\u00fe\u00ff\5\60\31\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u0102\b\31\1\2\u0101\u00f6\3\2\2\2\u0101\u00fb\3\2\2\2\u0101\u0100\3"+
		"\2\2\2\u0102\61\3\2\2\2\u0103\u0104\5\66\34\2\u0104\u0105\5\64\33\2\u0105"+
		"\u0106\b\32\1\2\u0106\63\3\2\2\2\u0107\u0108\7\33\2\2\u0108\u0109\5\66"+
		"\34\2\u0109\u010a\b\33\1\2\u010a\u010b\5\64\33\2\u010b\u0118\3\2\2\2\u010c"+
		"\u010d\7\34\2\2\u010d\u010e\5\66\34\2\u010e\u010f\b\33\1\2\u010f\u0110"+
		"\5\64\33\2\u0110\u0118\3\2\2\2\u0111\u0112\7\35\2\2\u0112\u0113\5\66\34"+
		"\2\u0113\u0114\b\33\1\2\u0114\u0115\5\64\33\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0118\b\33\1\2\u0117\u0107\3\2\2\2\u0117\u010c\3\2\2\2\u0117\u0111\3"+
		"\2\2\2\u0117\u0116\3\2\2\2\u0118\65\3\2\2\2\u0119\u011a\7\32\2\2\u011a"+
		"\u011b\58\35\2\u011b\u011c\b\34\1\2\u011c\u0121\3\2\2\2\u011d\u011e\5"+
		"8\35\2\u011e\u011f\b\34\1\2\u011f\u0121\3\2\2\2\u0120\u0119\3\2\2\2\u0120"+
		"\u011d\3\2\2\2\u0121\67\3\2\2\2\u0122\u0123\7\23\2\2\u0123\u012c\b\35"+
		"\1\2\u0124\u0125\7\22\2\2\u0125\u012c\b\35\1\2\u0126\u0127\7(\2\2\u0127"+
		"\u0128\5.\30\2\u0128\u0129\7)\2\2\u0129\u012a\b\35\1\2\u012a\u012c\3\2"+
		"\2\2\u012b\u0122\3\2\2\2\u012b\u0124\3\2\2\2\u012b\u0126\3\2\2\2\u012c"+
		"9\3\2\2\2\17=Rbv\u0094\u00c3\u00d2\u00db\u00f0\u0101\u0117\u0120\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}