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
		RULE_token = 0;
	public static final String[] ruleNames = {
		"token"
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
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << DECLARE) | (1L << ELSE) | (1L << END) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << IS) | (1L << LOOP) | (1L << PROCEDURE) | (1L << READ) | (1L << THEN) | (1L << WRITE) | (1L << ID) | (1L << CONST) | (1L << WHITESPACE) | (1L << COMMENT) | (1L << COL) | (1L << DOT2) | (1L << SCOL) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << DEF) | (1L << OPAREN) | (1L << CPAREN))) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << DECLARE) | (1L << ELSE) | (1L << END) | (1L << EXIT) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INTEGER) | (1L << IS) | (1L << LOOP) | (1L << PROCEDURE) | (1L << READ) | (1L << THEN) | (1L << WRITE) | (1L << ID) | (1L << CONST) | (1L << WHITESPACE) | (1L << COMMENT) | (1L << COL) | (1L << DOT2) | (1L << SCOL) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << DEF) | (1L << OPAREN) | (1L << CPAREN))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(7);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\13\4\2\t\2\3\2\7"+
		"\2\6\n\2\f\2\16\2\t\13\2\3\2\2\2\3\2\2\3\3\2\3)\n\2\7\3\2\2\2\4\6\t\2"+
		"\2\2\5\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2\t\7\3"+
		"\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}