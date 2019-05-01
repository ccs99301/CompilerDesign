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
		RULE_assignment_statement = 8, RULE_if_statement = 9, RULE_for_statement = 10, 
		RULE_exit_statement = 11, RULE_read_statement = 12, RULE_write_statement = 13, 
		RULE_bool_expression = 14, RULE_bool_expression2 = 15, RULE_bool_term = 16, 
		RULE_bool_term2 = 17, RULE_bool_factor = 18, RULE_bool_primary = 19, RULE_relation_op = 20, 
		RULE_arith_expression = 21, RULE_arith_expression2 = 22, RULE_arith_term = 23, 
		RULE_arith_term2 = 24, RULE_arith_factor = 25, RULE_arith_primary = 26;
	public static final String[] ruleNames = {
		"token", "program", "variables", "variables2", "variable", "statements", 
		"statements2", "statement", "assignment_statement", "if_statement", "for_statement", 
		"exit_statement", "read_statement", "write_statement", "bool_expression", 
		"bool_expression2", "bool_term", "bool_term2", "bool_factor", "bool_primary", 
		"relation_op", "arith_expression", "arith_expression2", "arith_term", 
		"arith_term2", "arith_factor", "arith_primary"
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << DECLARE) | (1L << ELSE) | (1L << END) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << IS) | (1L << LOOP) | (1L << PROCEDURE) | (1L << READ) | (1L << THEN) | (1L << WRITE) | (1L << ID) | (1L << CONST) | (1L << WHITESPACE) | (1L << COMMENT) | (1L << COL) | (1L << DOT2) | (1L << SCOL) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << DEF) | (1L << OPAREN) | (1L << CPAREN))) != 0)) {
				{
				{
				setState(54);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << DECLARE) | (1L << ELSE) | (1L << END) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << IS) | (1L << LOOP) | (1L << PROCEDURE) | (1L << READ) | (1L << THEN) | (1L << WRITE) | (1L << ID) | (1L << CONST) | (1L << WHITESPACE) | (1L << COMMENT) | (1L << COL) | (1L << DOT2) | (1L << SCOL) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << DEF) | (1L << OPAREN) | (1L << CPAREN))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(59);
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
			setState(60);
			match(PROCEDURE);
			setState(61);
			match(ID);
			setState(62);
			match(IS);
			setState(63);
			match(DECLARE);
			setState(64);
			variables();
			setState(65);
			match(BEGIN);
			setState(66);
			statements();
			setState(67);
			match(END);
			setState(68);
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
			setState(70);
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
			setState(76);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				variable();
				setState(73);
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
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode COL() { return getToken(RoseParser.COL, 0); }
		public TerminalNode INTEGER() { return getToken(RoseParser.INTEGER, 0); }
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
			setState(78);
			match(ID);
			setState(79);
			match(COL);
			setState(80);
			match(INTEGER);
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
		public Statements2Context statements2() {
			return getRuleContext(Statements2Context.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			statements2();
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statements2Context statements2() {
			return getRuleContext(Statements2Context.class,0);
		}
		public Statements2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Statements2Context statements2() throws RecognitionException {
		Statements2Context _localctx = new Statements2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements2);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case EXIT:
			case FOR:
			case IF:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				statement();
				setState(85);
				statements2();
				}
				break;
			case ELSE:
			case END:
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

	public static class StatementContext extends ParserRuleContext {
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				assignment_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				if_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				for_statement();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				exit_statement();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				read_statement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				write_statement();
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
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode DEF() { return getToken(RoseParser.DEF, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
			setState(99);
			match(DEF);
			setState(100);
			arith_expression();
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
		public List<TerminalNode> IF() { return getTokens(RoseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(RoseParser.IF, i);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(RoseParser.THEN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode ELSE() { return getToken(RoseParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_statement);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(IF);
				setState(103);
				bool_expression();
				setState(104);
				match(THEN);
				setState(105);
				statements();
				setState(106);
				match(END);
				setState(107);
				match(IF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(IF);
				setState(110);
				bool_expression();
				setState(111);
				match(THEN);
				setState(112);
				statements();
				setState(113);
				match(ELSE);
				setState(114);
				statements();
				setState(115);
				match(END);
				setState(116);
				match(IF);
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

	public static class For_statementContext extends ParserRuleContext {
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
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(FOR);
			setState(121);
			match(ID);
			setState(122);
			match(IN);
			setState(123);
			arith_expression();
			setState(124);
			match(DOT2);
			setState(125);
			arith_expression();
			setState(126);
			match(LOOP);
			setState(127);
			statements();
			setState(128);
			match(END);
			setState(129);
			match(LOOP);
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
		enterRule(_localctx, 22, RULE_exit_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(EXIT);
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
		public TerminalNode READ() { return getToken(RoseParser.READ, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(READ);
			setState(134);
			match(ID);
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
		public TerminalNode WRITE() { return getToken(RoseParser.WRITE, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(WRITE);
			setState(137);
			arith_expression();
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
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression2Context bool_expression2() {
			return getRuleContext(Bool_expression2Context.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			bool_term();
			setState(140);
			bool_expression2();
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
		public TerminalNode OR() { return getToken(RoseParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression2Context bool_expression2() {
			return getRuleContext(Bool_expression2Context.class,0);
		}
		public Bool_expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Bool_expression2Context bool_expression2() throws RecognitionException {
		Bool_expression2Context _localctx = new Bool_expression2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool_expression2);
		try {
			setState(147);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(OR);
				setState(143);
				bool_term();
				setState(144);
				bool_expression2();
				}
				break;
			case THEN:
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

	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term2Context bool_term2() {
			return getRuleContext(Bool_term2Context.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			bool_factor();
			setState(150);
			bool_term2();
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
		public TerminalNode AND() { return getToken(RoseParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term2Context bool_term2() {
			return getRuleContext(Bool_term2Context.class,0);
		}
		public Bool_term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Bool_term2Context bool_term2() throws RecognitionException {
		Bool_term2Context _localctx = new Bool_term2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_term2);
		try {
			setState(157);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(AND);
				setState(153);
				bool_factor();
				setState(154);
				bool_term2();
				}
				break;
			case THEN:
			case OR:
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

	public static class Bool_factorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(RoseParser.NOT, 0); }
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bool_factor);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(NOT);
				setState(160);
				bool_primary();
				}
				break;
			case ID:
			case CONST:
			case SUB:
			case OPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				bool_primary();
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
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Bool_primaryContext bool_primary() throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bool_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			arith_expression();
			setState(165);
			relation_op();
			setState(166);
			arith_expression();
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
		enterRule(_localctx, 40, RULE_relation_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression2Context arith_expression2() {
			return getRuleContext(Arith_expression2Context.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			arith_term();
			setState(171);
			arith_expression2();
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
		public TerminalNode ADD() { return getToken(RoseParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression2Context arith_expression2() {
			return getRuleContext(Arith_expression2Context.class,0);
		}
		public TerminalNode SUB() { return getToken(RoseParser.SUB, 0); }
		public Arith_expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Arith_expression2Context arith_expression2() throws RecognitionException {
		Arith_expression2Context _localctx = new Arith_expression2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_arith_expression2);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ADD);
				setState(174);
				arith_term();
				setState(175);
				arith_expression2();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(SUB);
				setState(178);
				arith_term();
				setState(179);
				arith_expression2();
				}
				break;
			case ELSE:
			case END:
			case EXIT:
			case FOR:
			case IF:
			case LOOP:
			case READ:
			case THEN:
			case WRITE:
			case ID:
			case DOT2:
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
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term2Context arith_term2() {
			return getRuleContext(Arith_term2Context.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Arith_termContext arith_term() throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			arith_factor();
			setState(185);
			arith_term2();
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
		public TerminalNode MUL() { return getToken(RoseParser.MUL, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term2Context arith_term2() {
			return getRuleContext(Arith_term2Context.class,0);
		}
		public TerminalNode DIV() { return getToken(RoseParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RoseParser.MOD, 0); }
		public Arith_term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Arith_term2Context arith_term2() throws RecognitionException {
		Arith_term2Context _localctx = new Arith_term2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_arith_term2);
		try {
			setState(200);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(MUL);
				setState(188);
				arith_factor();
				setState(189);
				arith_term2();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(DIV);
				setState(192);
				arith_factor();
				setState(193);
				arith_term2();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(MOD);
				setState(196);
				arith_factor();
				setState(197);
				arith_term2();
				}
				break;
			case ELSE:
			case END:
			case EXIT:
			case FOR:
			case IF:
			case LOOP:
			case READ:
			case THEN:
			case WRITE:
			case ID:
			case DOT2:
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
		public TerminalNode SUB() { return getToken(RoseParser.SUB, 0); }
		public Arith_primaryContext arith_primary() {
			return getRuleContext(Arith_primaryContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Arith_factorContext arith_factor() throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arith_factor);
		try {
			setState(205);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(SUB);
				setState(203);
				arith_primary();
				}
				break;
			case ID:
			case CONST:
			case OPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				arith_primary();
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
		public TerminalNode CONST() { return getToken(RoseParser.CONST, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode OPAREN() { return getToken(RoseParser.OPAREN, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(RoseParser.CPAREN, 0); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Arith_primaryContext arith_primary() throws RecognitionException {
		Arith_primaryContext _localctx = new Arith_primaryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arith_primary);
		try {
			setState(213);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(CONST);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(ID);
				}
				break;
			case OPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(OPAREN);
				setState(210);
				arith_expression();
				setState(211);
				match(CPAREN);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"c\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0096\n\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00a0\n\23\3\24\3\24\3\24\5\24\u00a5\n\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u00b9\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00cb\n\32\3\33\3\33\3\33\5\33"+
		"\u00d0\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00d8\n\34\3\34\2\2\35"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\4\3\2\3"+
		")\3\2\36#\u00d2\2;\3\2\2\2\4>\3\2\2\2\6H\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2"+
		"\fT\3\2\2\2\16Z\3\2\2\2\20b\3\2\2\2\22d\3\2\2\2\24x\3\2\2\2\26z\3\2\2"+
		"\2\30\u0085\3\2\2\2\32\u0087\3\2\2\2\34\u008a\3\2\2\2\36\u008d\3\2\2\2"+
		" \u0095\3\2\2\2\"\u0097\3\2\2\2$\u009f\3\2\2\2&\u00a4\3\2\2\2(\u00a6\3"+
		"\2\2\2*\u00aa\3\2\2\2,\u00ac\3\2\2\2.\u00b8\3\2\2\2\60\u00ba\3\2\2\2\62"+
		"\u00ca\3\2\2\2\64\u00cf\3\2\2\2\66\u00d7\3\2\2\28:\t\2\2\298\3\2\2\2:"+
		"=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=;\3\2\2\2>?\7\16\2\2?@\7\22\2"+
		"\2@A\7\f\2\2AB\7\4\2\2BC\5\6\4\2CD\7\3\2\2DE\5\f\7\2EF\7\6\2\2FG\7\30"+
		"\2\2G\5\3\2\2\2HI\5\b\5\2I\7\3\2\2\2JK\5\n\6\2KL\5\b\5\2LO\3\2\2\2MO\3"+
		"\2\2\2NJ\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ\7\22\2\2QR\7\26\2\2RS\7\13\2\2"+
		"S\13\3\2\2\2TU\5\16\b\2U\r\3\2\2\2VW\5\20\t\2WX\5\16\b\2X[\3\2\2\2Y[\3"+
		"\2\2\2ZV\3\2\2\2ZY\3\2\2\2[\17\3\2\2\2\\c\5\22\n\2]c\5\24\13\2^c\5\26"+
		"\f\2_c\5\30\r\2`c\5\32\16\2ac\5\34\17\2b\\\3\2\2\2b]\3\2\2\2b^\3\2\2\2"+
		"b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\21\3\2\2\2de\7\22\2\2ef\7\'\2\2fg\5,\27"+
		"\2g\23\3\2\2\2hi\7\t\2\2ij\5\36\20\2jk\7\20\2\2kl\5\f\7\2lm\7\6\2\2mn"+
		"\7\t\2\2ny\3\2\2\2op\7\t\2\2pq\5\36\20\2qr\7\20\2\2rs\5\f\7\2st\7\5\2"+
		"\2tu\5\f\7\2uv\7\6\2\2vw\7\t\2\2wy\3\2\2\2xh\3\2\2\2xo\3\2\2\2y\25\3\2"+
		"\2\2z{\7\b\2\2{|\7\22\2\2|}\7\n\2\2}~\5,\27\2~\177\7\27\2\2\177\u0080"+
		"\5,\27\2\u0080\u0081\7\r\2\2\u0081\u0082\5\f\7\2\u0082\u0083\7\6\2\2\u0083"+
		"\u0084\7\r\2\2\u0084\27\3\2\2\2\u0085\u0086\7\7\2\2\u0086\31\3\2\2\2\u0087"+
		"\u0088\7\17\2\2\u0088\u0089\7\22\2\2\u0089\33\3\2\2\2\u008a\u008b\7\21"+
		"\2\2\u008b\u008c\5,\27\2\u008c\35\3\2\2\2\u008d\u008e\5\"\22\2\u008e\u008f"+
		"\5 \21\2\u008f\37\3\2\2\2\u0090\u0091\7%\2\2\u0091\u0092\5\"\22\2\u0092"+
		"\u0093\5 \21\2\u0093\u0096\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0090\3\2"+
		"\2\2\u0095\u0094\3\2\2\2\u0096!\3\2\2\2\u0097\u0098\5&\24\2\u0098\u0099"+
		"\5$\23\2\u0099#\3\2\2\2\u009a\u009b\7$\2\2\u009b\u009c\5&\24\2\u009c\u009d"+
		"\5$\23\2\u009d\u00a0\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009a\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0%\3\2\2\2\u00a1\u00a2\7&\2\2\u00a2\u00a5\5(\25\2\u00a3"+
		"\u00a5\5(\25\2\u00a4\u00a1\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\'\3\2\2\2"+
		"\u00a6\u00a7\5,\27\2\u00a7\u00a8\5*\26\2\u00a8\u00a9\5,\27\2\u00a9)\3"+
		"\2\2\2\u00aa\u00ab\t\3\2\2\u00ab+\3\2\2\2\u00ac\u00ad\5\60\31\2\u00ad"+
		"\u00ae\5.\30\2\u00ae-\3\2\2\2\u00af\u00b0\7\31\2\2\u00b0\u00b1\5\60\31"+
		"\2\u00b1\u00b2\5.\30\2\u00b2\u00b9\3\2\2\2\u00b3\u00b4\7\32\2\2\u00b4"+
		"\u00b5\5\60\31\2\u00b5\u00b6\5.\30\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\3"+
		"\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"/\3\2\2\2\u00ba\u00bb\5\64\33\2\u00bb\u00bc\5\62\32\2\u00bc\61\3\2\2\2"+
		"\u00bd\u00be\7\33\2\2\u00be\u00bf\5\64\33\2\u00bf\u00c0\5\62\32\2\u00c0"+
		"\u00cb\3\2\2\2\u00c1\u00c2\7\34\2\2\u00c2\u00c3\5\64\33\2\u00c3\u00c4"+
		"\5\62\32\2\u00c4\u00cb\3\2\2\2\u00c5\u00c6\7\35\2\2\u00c6\u00c7\5\64\33"+
		"\2\u00c7\u00c8\5\62\32\2\u00c8\u00cb\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00bd\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\63\3\2\2\2\u00cc\u00cd\7\32\2\2\u00cd\u00d0\5\66\34\2\u00ce"+
		"\u00d0\5\66\34\2\u00cf\u00cc\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\65\3\2"+
		"\2\2\u00d1\u00d8\7\23\2\2\u00d2\u00d8\7\22\2\2\u00d3\u00d4\7(\2\2\u00d4"+
		"\u00d5\5,\27\2\u00d5\u00d6\7)\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d1\3\2"+
		"\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\67\3\2\2\2\16;NZbx"+
		"\u0095\u009f\u00a4\u00b8\u00ca\u00cf\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}