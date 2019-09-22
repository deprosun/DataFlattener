// Generated from /Users/kgupta/projects/DataFlattener/Flattener.g4 by ANTLR 4.7.2
package com.deprosun.dataflattener.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlattenerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ID=19, SPACE=20, COMMENT=21, LINE_COMMENT=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "ID", "SPACE", "COMMENT", "LINE_COMMENT", "NUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SOURCE'", "'FROM'", "'('", "')'", "'MAPPING'", "','", "'.'", 
			"'='", "'Reference'", "'['", "']'", "'ConcatBy'", "'ReferenceType'", 
			"'[ALL]'", "'NOT'", "'NULL'", "'PK'", "'FK'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "SPACE", "COMMENT", "LINE_COMMENT"
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


	public FlattenerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Flattener.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\6\24\u008b\n\24\r\24\16\24\u008c"+
		"\3\25\6\25\u0090\n\25\r\25\16\25\u0091\3\25\3\25\3\26\3\26\3\26\3\26\7"+
		"\26\u009a\n\26\f\26\16\26\u009d\13\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\7\27\u00a8\n\27\f\27\16\27\u00ab\13\27\3\27\3\27\3\30\6"+
		"\30\u00b0\n\30\r\30\16\30\u00b1\3\u009b\2\31\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\2\3\2\6\5\2\62;C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2\62"+
		";\2\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\3\61\3\2\2\2\58\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rI\3\2\2\2"+
		"\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Y\3\2\2\2\27[\3\2\2\2\31]\3\2\2"+
		"\2\33f\3\2\2\2\35t\3\2\2\2\37z\3\2\2\2!~\3\2\2\2#\u0083\3\2\2\2%\u0086"+
		"\3\2\2\2\'\u008a\3\2\2\2)\u008f\3\2\2\2+\u0095\3\2\2\2-\u00a3\3\2\2\2"+
		"/\u00af\3\2\2\2\61\62\7U\2\2\62\63\7Q\2\2\63\64\7W\2\2\64\65\7T\2\2\65"+
		"\66\7E\2\2\66\67\7G\2\2\67\4\3\2\2\289\7H\2\29:\7T\2\2:;\7Q\2\2;<\7O\2"+
		"\2<\6\3\2\2\2=>\7*\2\2>\b\3\2\2\2?@\7+\2\2@\n\3\2\2\2AB\7O\2\2BC\7C\2"+
		"\2CD\7R\2\2DE\7R\2\2EF\7K\2\2FG\7P\2\2GH\7I\2\2H\f\3\2\2\2IJ\7.\2\2J\16"+
		"\3\2\2\2KL\7\60\2\2L\20\3\2\2\2MN\7?\2\2N\22\3\2\2\2OP\7T\2\2PQ\7g\2\2"+
		"QR\7h\2\2RS\7g\2\2ST\7t\2\2TU\7g\2\2UV\7p\2\2VW\7e\2\2WX\7g\2\2X\24\3"+
		"\2\2\2YZ\7]\2\2Z\26\3\2\2\2[\\\7_\2\2\\\30\3\2\2\2]^\7E\2\2^_\7q\2\2_"+
		"`\7p\2\2`a\7e\2\2ab\7c\2\2bc\7v\2\2cd\7D\2\2de\7{\2\2e\32\3\2\2\2fg\7"+
		"T\2\2gh\7g\2\2hi\7h\2\2ij\7g\2\2jk\7t\2\2kl\7g\2\2lm\7p\2\2mn\7e\2\2n"+
		"o\7g\2\2op\7V\2\2pq\7{\2\2qr\7r\2\2rs\7g\2\2s\34\3\2\2\2tu\7]\2\2uv\7"+
		"C\2\2vw\7N\2\2wx\7N\2\2xy\7_\2\2y\36\3\2\2\2z{\7P\2\2{|\7Q\2\2|}\7V\2"+
		"\2} \3\2\2\2~\177\7P\2\2\177\u0080\7W\2\2\u0080\u0081\7N\2\2\u0081\u0082"+
		"\7N\2\2\u0082\"\3\2\2\2\u0083\u0084\7R\2\2\u0084\u0085\7M\2\2\u0085$\3"+
		"\2\2\2\u0086\u0087\7H\2\2\u0087\u0088\7M\2\2\u0088&\3\2\2\2\u0089\u008b"+
		"\t\2\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d(\3\2\2\2\u008e\u0090\t\3\2\2\u008f\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\b\25\2\2\u0094*\3\2\2\2\u0095\u0096\7\61\2\2\u0096"+
		"\u0097\7,\2\2\u0097\u009b\3\2\2\2\u0098\u009a\13\2\2\2\u0099\u0098\3\2"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7,\2\2\u009f\u00a0\7\61"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\26\2\2\u00a2,\3\2\2\2\u00a3\u00a4"+
		"\7\61\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8\n\4\2\2"+
		"\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\27\2\2"+
		"\u00ad.\3\2\2\2\u00ae\u00b0\t\5\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\60\3\2\2\2\b\2\u008c"+
		"\u0091\u009b\u00a9\u00b1\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}