// Generated from /Users/kgupta/projects/DataFlattener/src/main/antlr/Flattener.g4 by ANTLR 4.7.2
package com.github.deprosun.dataflattener.parser;
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, ID=28, SPACE=29, COMMENT=30, LINE_COMMENT=31;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "ID", "SPACE", "COMMENT", "LINE_COMMENT", "NUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TABLE'", "'FROM'", "'FILTER'", "'('", "'MAPPING'", "')'", "'INTERNAL'", 
			"'='", "'explode('", "'WITH'", "','", "'BROADCAST'", "'AS'", "'Reference'", 
			"'copy'", "'.'", "'literal('", "'lit('", "'CONCAT'", "'['", "']'", "'[ALL]'", 
			"'NOT'", "'NULL'", "'PK'", "'FK'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "SPACE", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\6\35\u00cc"+
		"\n\35\r\35\16\35\u00cd\3\36\6\36\u00d1\n\36\r\36\16\36\u00d2\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\7\37\u00db\n\37\f\37\16\37\u00de\13\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \7 \u00e9\n \f \16 \u00ec\13 \3 \3 \3!\6!\u00f1"+
		"\n!\r!\16!\u00f2\3\u00dc\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\2\3\2\6\5\2\62;C\\c|\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\3\2\62;\2\u00f7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3C\3\2\2"+
		"\2\5I\3\2\2\2\7N\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2"+
		"\21j\3\2\2\2\23l\3\2\2\2\25u\3\2\2\2\27z\3\2\2\2\31|\3\2\2\2\33\u0086"+
		"\3\2\2\2\35\u0089\3\2\2\2\37\u0093\3\2\2\2!\u0098\3\2\2\2#\u009a\3\2\2"+
		"\2%\u00a3\3\2\2\2\'\u00a8\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b3"+
		"\3\2\2\2/\u00b9\3\2\2\2\61\u00bd\3\2\2\2\63\u00c2\3\2\2\2\65\u00c5\3\2"+
		"\2\2\67\u00c8\3\2\2\29\u00cb\3\2\2\2;\u00d0\3\2\2\2=\u00d6\3\2\2\2?\u00e4"+
		"\3\2\2\2A\u00f0\3\2\2\2CD\7V\2\2DE\7C\2\2EF\7D\2\2FG\7N\2\2GH\7G\2\2H"+
		"\4\3\2\2\2IJ\7H\2\2JK\7T\2\2KL\7Q\2\2LM\7O\2\2M\6\3\2\2\2NO\7H\2\2OP\7"+
		"K\2\2PQ\7N\2\2QR\7V\2\2RS\7G\2\2ST\7T\2\2T\b\3\2\2\2UV\7*\2\2V\n\3\2\2"+
		"\2WX\7O\2\2XY\7C\2\2YZ\7R\2\2Z[\7R\2\2[\\\7K\2\2\\]\7P\2\2]^\7I\2\2^\f"+
		"\3\2\2\2_`\7+\2\2`\16\3\2\2\2ab\7K\2\2bc\7P\2\2cd\7V\2\2de\7G\2\2ef\7"+
		"T\2\2fg\7P\2\2gh\7C\2\2hi\7N\2\2i\20\3\2\2\2jk\7?\2\2k\22\3\2\2\2lm\7"+
		"g\2\2mn\7z\2\2no\7r\2\2op\7n\2\2pq\7q\2\2qr\7f\2\2rs\7g\2\2st\7*\2\2t"+
		"\24\3\2\2\2uv\7Y\2\2vw\7K\2\2wx\7V\2\2xy\7J\2\2y\26\3\2\2\2z{\7.\2\2{"+
		"\30\3\2\2\2|}\7D\2\2}~\7T\2\2~\177\7Q\2\2\177\u0080\7C\2\2\u0080\u0081"+
		"\7F\2\2\u0081\u0082\7E\2\2\u0082\u0083\7C\2\2\u0083\u0084\7U\2\2\u0084"+
		"\u0085\7V\2\2\u0085\32\3\2\2\2\u0086\u0087\7C\2\2\u0087\u0088\7U\2\2\u0088"+
		"\34\3\2\2\2\u0089\u008a\7T\2\2\u008a\u008b\7g\2\2\u008b\u008c\7h\2\2\u008c"+
		"\u008d\7g\2\2\u008d\u008e\7t\2\2\u008e\u008f\7g\2\2\u008f\u0090\7p\2\2"+
		"\u0090\u0091\7e\2\2\u0091\u0092\7g\2\2\u0092\36\3\2\2\2\u0093\u0094\7"+
		"e\2\2\u0094\u0095\7q\2\2\u0095\u0096\7r\2\2\u0096\u0097\7{\2\2\u0097 "+
		"\3\2\2\2\u0098\u0099\7\60\2\2\u0099\"\3\2\2\2\u009a\u009b\7n\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e\u009f\7t\2\2"+
		"\u009f\u00a0\7c\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7*\2\2\u00a2$\3\2\2"+
		"\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7"+
		"\7*\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7E\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00ab"+
		"\7P\2\2\u00ab\u00ac\7E\2\2\u00ac\u00ad\7C\2\2\u00ad\u00ae\7V\2\2\u00ae"+
		"(\3\2\2\2\u00af\u00b0\7]\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7_\2\2\u00b2,"+
		"\3\2\2\2\u00b3\u00b4\7]\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6\7N\2\2\u00b6"+
		"\u00b7\7N\2\2\u00b7\u00b8\7_\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7P\2\2\u00ba"+
		"\u00bb\7Q\2\2\u00bb\u00bc\7V\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7P\2\2\u00be"+
		"\u00bf\7W\2\2\u00bf\u00c0\7N\2\2\u00c0\u00c1\7N\2\2\u00c1\62\3\2\2\2\u00c2"+
		"\u00c3\7R\2\2\u00c3\u00c4\7M\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\7H\2\2\u00c6"+
		"\u00c7\7M\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7a\2\2\u00c98\3\2\2\2\u00ca"+
		"\u00cc\t\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce:\3\2\2\2\u00cf\u00d1\t\3\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\b\36\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7\61\2"+
		"\2\u00d7\u00d8\7,\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00db\13\2\2\2\u00da\u00d9"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7,\2\2\u00e0\u00e1\7\61"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b\37\2\2\u00e3>\3\2\2\2\u00e4\u00e5"+
		"\7\61\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00e9\n\4\2\2"+
		"\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\b \2\2\u00ee"+
		"@\3\2\2\2\u00ef\u00f1\t\5\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3B\3\2\2\2\b\2\u00cd\u00d2"+
		"\u00dc\u00ea\u00f2\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}