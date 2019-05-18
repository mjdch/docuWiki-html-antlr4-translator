// Generated from docuWiki.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class docuWikiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, CHAR=2, HEADLINE_1=3, HEADLINE_2=4, HEADLINE_3=5, HEADLINE_4=6, 
		BOLD_MARK=7, ITALIC_MARK=8, UNDERLINE_MARK=9, NEWLINE_MARK=10, LINK_OPEN=11, 
		LINK_END=12, LIST_MARK=13, NUMBERED_LIST_MARK=14, QUOTE=15, PIPE=16, CODE_START=17, 
		CODE_END=18, SUBSCRIPT_START=19, SUBSCRIPT_END=20, SUPERSCRIPT_START=21, 
		SUPERSCRIPT_END=22, DELETED_START=23, DELETED_END=24, MEDIA_START=25, 
		MEDIA_END=26, URL_START=27, NL=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "CHAR", "HEADLINE_1", "HEADLINE_2", "HEADLINE_3", "HEADLINE_4", 
		"BOLD_MARK", "ITALIC_MARK", "UNDERLINE_MARK", "NEWLINE_MARK", "LINK_OPEN", 
		"LINK_END", "LIST_MARK", "NUMBERED_LIST_MARK", "QUOTE", "PIPE", "CODE_START", 
		"CODE_END", "SUBSCRIPT_START", "SUBSCRIPT_END", "SUPERSCRIPT_START", "SUPERSCRIPT_END", 
		"DELETED_START", "DELETED_END", "MEDIA_START", "MEDIA_END", "URL_START", 
		"NL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'='", "'=='", "'==='", "'===='", "'**'", "'//'", "'__'", 
		"'\\'", "'[['", "']]'", "'* '", "'- '", "'>'", "' | '", "'<code>'", "'</code>'", 
		"'<sub>'", "'</sub>'", "'<sup>'", "'</sup>'", "'<del>'", "'</del>'", "'{{'", 
		"'}}'", "'http://'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "CHAR", "HEADLINE_1", "HEADLINE_2", "HEADLINE_3", "HEADLINE_4", 
		"BOLD_MARK", "ITALIC_MARK", "UNDERLINE_MARK", "NEWLINE_MARK", "LINK_OPEN", 
		"LINK_END", "LIST_MARK", "NUMBERED_LIST_MARK", "QUOTE", "PIPE", "CODE_START", 
		"CODE_END", "SUBSCRIPT_START", "SUBSCRIPT_END", "SUPERSCRIPT_START", "SUPERSCRIPT_END", 
		"DELETED_START", "DELETED_END", "MEDIA_START", "MEDIA_END", "URL_START", 
		"NL", "WS"
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


	public docuWikiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "docuWiki.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00bc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\5\35\u00b2\n\35\3\35\3\35"+
		"\3\36\6\36\u00b7\n\36\r\36\16\36\u00b8\3\36\3\36\2\2\37\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\5\4\2\13"+
		"\13\"\"\7\2#>A]_|~~\u0080\u0080\5\2\13\f\17\17\"\"\2\u00bd\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2"+
		"\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13F\3\2\2\2\rJ\3\2\2\2\17O\3\2\2"+
		"\2\21R\3\2\2\2\23U\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31]\3\2\2\2\33`\3\2"+
		"\2\2\35c\3\2\2\2\37f\3\2\2\2!h\3\2\2\2#l\3\2\2\2%s\3\2\2\2\'{\3\2\2\2"+
		")\u0081\3\2\2\2+\u0088\3\2\2\2-\u008e\3\2\2\2/\u0095\3\2\2\2\61\u009b"+
		"\3\2\2\2\63\u00a2\3\2\2\2\65\u00a5\3\2\2\2\67\u00a8\3\2\2\29\u00b1\3\2"+
		"\2\2;\u00b6\3\2\2\2=>\t\2\2\2>\4\3\2\2\2?@\t\3\2\2@\6\3\2\2\2AB\7?\2\2"+
		"B\b\3\2\2\2CD\7?\2\2DE\7?\2\2E\n\3\2\2\2FG\7?\2\2GH\7?\2\2HI\7?\2\2I\f"+
		"\3\2\2\2JK\7?\2\2KL\7?\2\2LM\7?\2\2MN\7?\2\2N\16\3\2\2\2OP\7,\2\2PQ\7"+
		",\2\2Q\20\3\2\2\2RS\7\61\2\2ST\7\61\2\2T\22\3\2\2\2UV\7a\2\2VW\7a\2\2"+
		"W\24\3\2\2\2XY\7^\2\2Y\26\3\2\2\2Z[\7]\2\2[\\\7]\2\2\\\30\3\2\2\2]^\7"+
		"_\2\2^_\7_\2\2_\32\3\2\2\2`a\7,\2\2ab\7\"\2\2b\34\3\2\2\2cd\7/\2\2de\7"+
		"\"\2\2e\36\3\2\2\2fg\7@\2\2g \3\2\2\2hi\7\"\2\2ij\7~\2\2jk\7\"\2\2k\""+
		"\3\2\2\2lm\7>\2\2mn\7e\2\2no\7q\2\2op\7f\2\2pq\7g\2\2qr\7@\2\2r$\3\2\2"+
		"\2st\7>\2\2tu\7\61\2\2uv\7e\2\2vw\7q\2\2wx\7f\2\2xy\7g\2\2yz\7@\2\2z&"+
		"\3\2\2\2{|\7>\2\2|}\7u\2\2}~\7w\2\2~\177\7d\2\2\177\u0080\7@\2\2\u0080"+
		"(\3\2\2\2\u0081\u0082\7>\2\2\u0082\u0083\7\61\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7w\2\2\u0085\u0086\7d\2\2\u0086\u0087\7@\2\2\u0087*\3\2\2\2\u0088"+
		"\u0089\7>\2\2\u0089\u008a\7u\2\2\u008a\u008b\7w\2\2\u008b\u008c\7r\2\2"+
		"\u008c\u008d\7@\2\2\u008d,\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090\7\61"+
		"\2\2\u0090\u0091\7u\2\2\u0091\u0092\7w\2\2\u0092\u0093\7r\2\2\u0093\u0094"+
		"\7@\2\2\u0094.\3\2\2\2\u0095\u0096\7>\2\2\u0096\u0097\7f\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7@\2\2\u009a\60\3\2\2\2\u009b\u009c"+
		"\7>\2\2\u009c\u009d\7\61\2\2\u009d\u009e\7f\2\2\u009e\u009f\7g\2\2\u009f"+
		"\u00a0\7n\2\2\u00a0\u00a1\7@\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\7}\2\2\u00a3"+
		"\u00a4\7}\2\2\u00a4\64\3\2\2\2\u00a5\u00a6\7\177\2\2\u00a6\u00a7\7\177"+
		"\2\2\u00a7\66\3\2\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab"+
		"\7v\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7<\2\2\u00ad\u00ae\7\61\2\2\u00ae"+
		"\u00af\7\61\2\2\u00af8\3\2\2\2\u00b0\u00b2\7\17\2\2\u00b1\u00b0\3\2\2"+
		"\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\f\2\2\u00b4:"+
		"\3\2\2\2\u00b5\u00b7\t\4\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\36"+
		"\2\2\u00bb<\3\2\2\2\5\2\u00b1\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}