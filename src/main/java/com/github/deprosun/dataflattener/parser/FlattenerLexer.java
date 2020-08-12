// Generated from /Users/kgupta/projects/DataFlattener/Flattener.g4 by ANTLR 4.7.2
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
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, SPACE=23, COMMENT=24, LINE_COMMENT=25;
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
			"T__17", "T__18", "T__19", "T__20", "ID", "SPACE", "COMMENT", "LINE_COMMENT", 
			"NUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TABLE'", "'FROM'", "'('", "'MAPPING'", "')'", "'explode('", "'WITH'", 
			"','", "'Reference'", "'copy'", "'.'", "'='", "'CONCAT'", "'['", "']'", 
			"'[ALL]'", "'NOT'", "'NULL'", "'PK'", "'FK'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "SPACE", 
			"COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\27\6\27\u0095\n\27\r\27\16\27\u0096\3\30\6\30\u009a\n"+
		"\30\r\30\16\30\u009b\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00a4\n\31\f\31"+
		"\16\31\u00a7\13\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00b2"+
		"\n\32\f\32\16\32\u00b5\13\32\3\32\3\32\3\33\6\33\u00ba\n\33\r\33\16\33"+
		"\u00bb\3\u00a5\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\2\3\2\6\5\2\62;C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2\62;\2\u00c0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\3\67\3\2\2\2\5=\3\2\2\2\7B\3\2\2\2\tD\3\2"+
		"\2\2\13L\3\2\2\2\rN\3\2\2\2\17W\3\2\2\2\21\\\3\2\2\2\23^\3\2\2\2\25h\3"+
		"\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35x\3\2\2\2\37z\3\2\2\2!|\3"+
		"\2\2\2#\u0082\3\2\2\2%\u0086\3\2\2\2\'\u008b\3\2\2\2)\u008e\3\2\2\2+\u0091"+
		"\3\2\2\2-\u0094\3\2\2\2/\u0099\3\2\2\2\61\u009f\3\2\2\2\63\u00ad\3\2\2"+
		"\2\65\u00b9\3\2\2\2\678\7V\2\289\7C\2\29:\7D\2\2:;\7N\2\2;<\7G\2\2<\4"+
		"\3\2\2\2=>\7H\2\2>?\7T\2\2?@\7Q\2\2@A\7O\2\2A\6\3\2\2\2BC\7*\2\2C\b\3"+
		"\2\2\2DE\7O\2\2EF\7C\2\2FG\7R\2\2GH\7R\2\2HI\7K\2\2IJ\7P\2\2JK\7I\2\2"+
		"K\n\3\2\2\2LM\7+\2\2M\f\3\2\2\2NO\7g\2\2OP\7z\2\2PQ\7r\2\2QR\7n\2\2RS"+
		"\7q\2\2ST\7f\2\2TU\7g\2\2UV\7*\2\2V\16\3\2\2\2WX\7Y\2\2XY\7K\2\2YZ\7V"+
		"\2\2Z[\7J\2\2[\20\3\2\2\2\\]\7.\2\2]\22\3\2\2\2^_\7T\2\2_`\7g\2\2`a\7"+
		"h\2\2ab\7g\2\2bc\7t\2\2cd\7g\2\2de\7p\2\2ef\7e\2\2fg\7g\2\2g\24\3\2\2"+
		"\2hi\7e\2\2ij\7q\2\2jk\7r\2\2kl\7{\2\2l\26\3\2\2\2mn\7\60\2\2n\30\3\2"+
		"\2\2op\7?\2\2p\32\3\2\2\2qr\7E\2\2rs\7Q\2\2st\7P\2\2tu\7E\2\2uv\7C\2\2"+
		"vw\7V\2\2w\34\3\2\2\2xy\7]\2\2y\36\3\2\2\2z{\7_\2\2{ \3\2\2\2|}\7]\2\2"+
		"}~\7C\2\2~\177\7N\2\2\177\u0080\7N\2\2\u0080\u0081\7_\2\2\u0081\"\3\2"+
		"\2\2\u0082\u0083\7P\2\2\u0083\u0084\7Q\2\2\u0084\u0085\7V\2\2\u0085$\3"+
		"\2\2\2\u0086\u0087\7P\2\2\u0087\u0088\7W\2\2\u0088\u0089\7N\2\2\u0089"+
		"\u008a\7N\2\2\u008a&\3\2\2\2\u008b\u008c\7R\2\2\u008c\u008d\7M\2\2\u008d"+
		"(\3\2\2\2\u008e\u008f\7H\2\2\u008f\u0090\7M\2\2\u0090*\3\2\2\2\u0091\u0092"+
		"\7a\2\2\u0092,\3\2\2\2\u0093\u0095\t\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097.\3\2\2\2\u0098"+
		"\u009a\t\3\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\30\2\2\u009e"+
		"\60\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a5\3\2\2"+
		"\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\b\31\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af\7\61"+
		"\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\n\4\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\32\2\2\u00b7\64\3\2\2\2\u00b8\u00ba"+
		"\t\5\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\66\3\2\2\2\b\2\u0096\u009b\u00a5\u00b3\u00bb\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}