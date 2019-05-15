// Generated from docuWiki.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class docuWikiParser extends Parser {
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
	public static final int
		RULE_paragraph = 0, RULE_url = 1, RULE_headline = 2, RULE_bold = 3, RULE_italic = 4, 
		RULE_underline = 5, RULE_subscript = 6, RULE_superscript = 7, RULE_deleted = 8, 
		RULE_externalLink = 9, RULE_media = 10, RULE_quote = 11, RULE_code = 12, 
		RULE_newline = 13, RULE_elements = 14, RULE_body = 15;
	public static final String[] ruleNames = {
		"paragraph", "url", "headline", "bold", "italic", "underline", "subscript", 
		"superscript", "deleted", "externalLink", "media", "quote", "code", "newline", 
		"elements", "body"
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

	@Override
	public String getGrammarFileName() { return "docuWiki.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	  protected StringBuilder htmlBuilder = new StringBuilder();
	public docuWikiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParagraphContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(docuWikiParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(docuWikiParser.CHAR, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(docuWikiParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(docuWikiParser.SPACE, i);
		}
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitParagraph(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_paragraph);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(32);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==CHAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(35); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode URL_START() { return getToken(docuWikiParser.URL_START, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitUrl(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(URL_START);
			setState(38);
			paragraph();
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

	public static class HeadlineContext extends ParserRuleContext {
		public Token CHAR;
		public ParagraphContext paragraph;
		public List<TerminalNode> HEADLINE_1() { return getTokens(docuWikiParser.HEADLINE_1); }
		public TerminalNode HEADLINE_1(int i) {
			return getToken(docuWikiParser.HEADLINE_1, i);
		}
		public TerminalNode CHAR() { return getToken(docuWikiParser.CHAR, 0); }
		public List<TerminalNode> HEADLINE_2() { return getTokens(docuWikiParser.HEADLINE_2); }
		public TerminalNode HEADLINE_2(int i) {
			return getToken(docuWikiParser.HEADLINE_2, i);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public List<TerminalNode> HEADLINE_3() { return getTokens(docuWikiParser.HEADLINE_3); }
		public TerminalNode HEADLINE_3(int i) {
			return getToken(docuWikiParser.HEADLINE_3, i);
		}
		public List<TerminalNode> HEADLINE_4() { return getTokens(docuWikiParser.HEADLINE_4); }
		public TerminalNode HEADLINE_4(int i) {
			return getToken(docuWikiParser.HEADLINE_4, i);
		}
		public HeadlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterHeadline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitHeadline(this);
		}
	}

	public final HeadlineContext headline() throws RecognitionException {
		HeadlineContext _localctx = new HeadlineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_headline);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEADLINE_1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(HEADLINE_1);
				setState(41);
				((HeadlineContext)_localctx).CHAR = match(CHAR);
				setState(42);
				match(HEADLINE_1);
				htmlBuilder.append("<h1>" + (((HeadlineContext)_localctx).CHAR!=null?((HeadlineContext)_localctx).CHAR.getText():null) + "</h1>");
				}
				break;
			case HEADLINE_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(HEADLINE_2);
				setState(45);
				((HeadlineContext)_localctx).paragraph = paragraph();
				setState(46);
				match(HEADLINE_2);
				htmlBuilder.append("<h2>" + (((HeadlineContext)_localctx).paragraph!=null?_input.getText(((HeadlineContext)_localctx).paragraph.start,((HeadlineContext)_localctx).paragraph.stop):null) + "</h2>");
				}
				break;
			case HEADLINE_3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(HEADLINE_3);
				setState(50);
				((HeadlineContext)_localctx).paragraph = paragraph();
				setState(51);
				match(HEADLINE_3);
				htmlBuilder.append("<h3>" + (((HeadlineContext)_localctx).paragraph!=null?_input.getText(((HeadlineContext)_localctx).paragraph.start,((HeadlineContext)_localctx).paragraph.stop):null) + "</h3>");
				}
				break;
			case HEADLINE_4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				match(HEADLINE_4);
				setState(55);
				((HeadlineContext)_localctx).paragraph = paragraph();
				setState(56);
				match(HEADLINE_4);
				htmlBuilder.append("<h4>" + (((HeadlineContext)_localctx).paragraph!=null?_input.getText(((HeadlineContext)_localctx).paragraph.start,((HeadlineContext)_localctx).paragraph.stop):null) + "</h4>");
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

	public static class BoldContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public List<TerminalNode> BOLD_MARK() { return getTokens(docuWikiParser.BOLD_MARK); }
		public TerminalNode BOLD_MARK(int i) {
			return getToken(docuWikiParser.BOLD_MARK, i);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public BoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterBold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitBold(this);
		}
	}

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(BOLD_MARK);
			setState(62);
			((BoldContext)_localctx).paragraph = paragraph();
			setState(63);
			match(BOLD_MARK);
			htmlBuilder.append("<b>" + (((BoldContext)_localctx).paragraph!=null?_input.getText(((BoldContext)_localctx).paragraph.start,((BoldContext)_localctx).paragraph.stop):null) + "</b>");
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

	public static class ItalicContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public List<TerminalNode> ITALIC_MARK() { return getTokens(docuWikiParser.ITALIC_MARK); }
		public TerminalNode ITALIC_MARK(int i) {
			return getToken(docuWikiParser.ITALIC_MARK, i);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public ItalicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterItalic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitItalic(this);
		}
	}

	public final ItalicContext italic() throws RecognitionException {
		ItalicContext _localctx = new ItalicContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_italic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ITALIC_MARK);
			setState(67);
			((ItalicContext)_localctx).paragraph = paragraph();
			setState(68);
			match(ITALIC_MARK);
			htmlBuilder.append("<i>" + (((ItalicContext)_localctx).paragraph!=null?_input.getText(((ItalicContext)_localctx).paragraph.start,((ItalicContext)_localctx).paragraph.stop):null) + "</i>");
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

	public static class UnderlineContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public List<TerminalNode> UNDERLINE_MARK() { return getTokens(docuWikiParser.UNDERLINE_MARK); }
		public TerminalNode UNDERLINE_MARK(int i) {
			return getToken(docuWikiParser.UNDERLINE_MARK, i);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public UnderlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterUnderline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitUnderline(this);
		}
	}

	public final UnderlineContext underline() throws RecognitionException {
		UnderlineContext _localctx = new UnderlineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_underline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(UNDERLINE_MARK);
			setState(72);
			((UnderlineContext)_localctx).paragraph = paragraph();
			setState(73);
			match(UNDERLINE_MARK);
			htmlBuilder.append("<u>" + (((UnderlineContext)_localctx).paragraph!=null?_input.getText(((UnderlineContext)_localctx).paragraph.start,((UnderlineContext)_localctx).paragraph.stop):null) + "</u>");
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

	public static class SubscriptContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public TerminalNode SUBSCRIPT_START() { return getToken(docuWikiParser.SUBSCRIPT_START, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode SUBSCRIPT_END() { return getToken(docuWikiParser.SUBSCRIPT_END, 0); }
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitSubscript(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(SUBSCRIPT_START);
			setState(77);
			((SubscriptContext)_localctx).paragraph = paragraph();
			setState(78);
			match(SUBSCRIPT_END);
			htmlBuilder.append("<sub>" + (((SubscriptContext)_localctx).paragraph!=null?_input.getText(((SubscriptContext)_localctx).paragraph.start,((SubscriptContext)_localctx).paragraph.stop):null) + "</sub>");
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

	public static class SuperscriptContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public TerminalNode SUPERSCRIPT_START() { return getToken(docuWikiParser.SUPERSCRIPT_START, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode SUPERSCRIPT_END() { return getToken(docuWikiParser.SUPERSCRIPT_END, 0); }
		public SuperscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterSuperscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitSuperscript(this);
		}
	}

	public final SuperscriptContext superscript() throws RecognitionException {
		SuperscriptContext _localctx = new SuperscriptContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_superscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(SUPERSCRIPT_START);
			setState(82);
			((SuperscriptContext)_localctx).paragraph = paragraph();
			setState(83);
			match(SUPERSCRIPT_END);
			htmlBuilder.append("<sup>" + (((SuperscriptContext)_localctx).paragraph!=null?_input.getText(((SuperscriptContext)_localctx).paragraph.start,((SuperscriptContext)_localctx).paragraph.stop):null) + "</sup>");
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

	public static class DeletedContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public TerminalNode DELETED_START() { return getToken(docuWikiParser.DELETED_START, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode DELETED_END() { return getToken(docuWikiParser.DELETED_END, 0); }
		public DeletedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterDeleted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitDeleted(this);
		}
	}

	public final DeletedContext deleted() throws RecognitionException {
		DeletedContext _localctx = new DeletedContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_deleted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(DELETED_START);
			setState(87);
			((DeletedContext)_localctx).paragraph = paragraph();
			setState(88);
			match(DELETED_END);
			htmlBuilder.append("<strike>" + (((DeletedContext)_localctx).paragraph!=null?_input.getText(((DeletedContext)_localctx).paragraph.start,((DeletedContext)_localctx).paragraph.stop):null) + "</strike>");
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

	public static class ExternalLinkContext extends ParserRuleContext {
		public UrlContext url;
		public ParagraphContext paragraph;
		public TerminalNode LINK_OPEN() { return getToken(docuWikiParser.LINK_OPEN, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(docuWikiParser.PIPE, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode LINK_END() { return getToken(docuWikiParser.LINK_END, 0); }
		public ExternalLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterExternalLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitExternalLink(this);
		}
	}

	public final ExternalLinkContext externalLink() throws RecognitionException {
		ExternalLinkContext _localctx = new ExternalLinkContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_externalLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(LINK_OPEN);
			setState(92);
			((ExternalLinkContext)_localctx).url = url();
			setState(93);
			match(PIPE);
			setState(94);
			((ExternalLinkContext)_localctx).paragraph = paragraph();
			setState(95);
			match(LINK_END);
			htmlBuilder.append("<a href='" + (((ExternalLinkContext)_localctx).url!=null?_input.getText(((ExternalLinkContext)_localctx).url.start,((ExternalLinkContext)_localctx).url.stop):null) + "'>" + (((ExternalLinkContext)_localctx).paragraph!=null?_input.getText(((ExternalLinkContext)_localctx).paragraph.start,((ExternalLinkContext)_localctx).paragraph.stop):null) + "</a>");
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

	public static class MediaContext extends ParserRuleContext {
		public UrlContext url;
		public TerminalNode MEDIA_START() { return getToken(docuWikiParser.MEDIA_START, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode MEDIA_END() { return getToken(docuWikiParser.MEDIA_END, 0); }
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitMedia(this);
		}
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_media);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(MEDIA_START);
			setState(99);
			((MediaContext)_localctx).url = url();
			setState(100);
			match(MEDIA_END);
			htmlBuilder.append("<img src='" + (((MediaContext)_localctx).url!=null?_input.getText(((MediaContext)_localctx).url.start,((MediaContext)_localctx).url.stop):null) + "'>");
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

	public static class QuoteContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public TerminalNode QUOTE() { return getToken(docuWikiParser.QUOTE, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitQuote(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(QUOTE);
			setState(104);
			((QuoteContext)_localctx).paragraph = paragraph();
			htmlBuilder.append("<blockquote>" + (((QuoteContext)_localctx).paragraph!=null?_input.getText(((QuoteContext)_localctx).paragraph.start,((QuoteContext)_localctx).paragraph.stop):null) + "</blockquote>");
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

	public static class CodeContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public TerminalNode CODE_START() { return getToken(docuWikiParser.CODE_START, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode CODE_END() { return getToken(docuWikiParser.CODE_END, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CODE_START);
			setState(108);
			((CodeContext)_localctx).paragraph = paragraph();
			setState(109);
			match(CODE_END);
			htmlBuilder.append("<code>" + (((CodeContext)_localctx).paragraph!=null?_input.getText(((CodeContext)_localctx).paragraph.start,((CodeContext)_localctx).paragraph.stop):null) + "</code>");
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

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE_MARK() { return getToken(docuWikiParser.NEWLINE_MARK, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitNewline(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(NEWLINE_MARK);
			htmlBuilder.append("</br>");
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

	public static class ElementsContext extends ParserRuleContext {
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ItalicContext italic() {
			return getRuleContext(ItalicContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public UnderlineContext underline() {
			return getRuleContext(UnderlineContext.class,0);
		}
		public SubscriptContext subscript() {
			return getRuleContext(SubscriptContext.class,0);
		}
		public SuperscriptContext superscript() {
			return getRuleContext(SuperscriptContext.class,0);
		}
		public DeletedContext deleted() {
			return getRuleContext(DeletedContext.class,0);
		}
		public ExternalLinkContext externalLink() {
			return getRuleContext(ExternalLinkContext.class,0);
		}
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public HeadlineContext headline() {
			return getRuleContext(HeadlineContext.class,0);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitElements(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elements);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				bold();
				setState(116);
				elements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				italic();
				setState(119);
				elements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				newline();
				setState(122);
				elements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				paragraph();
				setState(125);
				elements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				underline();
				setState(128);
				elements();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				subscript();
				setState(131);
				elements();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				superscript();
				setState(134);
				elements();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				deleted();
				setState(137);
				elements();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(139);
				externalLink();
				setState(140);
				elements();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				media();
				setState(143);
				elements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(145);
				quote();
				setState(146);
				elements();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(148);
				code();
				setState(149);
				elements();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(151);
				headline();
				setState(152);
				elements();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(154);
				newline();
				setState(155);
				elements();
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

	public static class BodyContext extends ParserRuleContext {
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(159);
					elements();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00a7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2"+
		"$\n\2\r\2\16\2%\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00a0\n\20\3\21\6\21\u00a3\n\21\r\21\16\21\u00a4\3\21\3\u00a4\2\22\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\3\4\2\u00a8\2#\3\2\2\2"+
		"\4\'\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nD\3\2\2\2\fI\3\2\2\2\16N\3\2\2\2\20"+
		"S\3\2\2\2\22X\3\2\2\2\24]\3\2\2\2\26d\3\2\2\2\30i\3\2\2\2\32m\3\2\2\2"+
		"\34r\3\2\2\2\36\u009f\3\2\2\2 \u00a2\3\2\2\2\"$\t\2\2\2#\"\3\2\2\2$%\3"+
		"\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'(\7\35\2\2()\5\2\2\2)\5\3\2\2\2"+
		"*+\7\5\2\2+,\7\4\2\2,-\7\5\2\2->\b\4\1\2./\7\6\2\2/\60\5\2\2\2\60\61\7"+
		"\6\2\2\61\62\b\4\1\2\62>\3\2\2\2\63\64\7\7\2\2\64\65\5\2\2\2\65\66\7\7"+
		"\2\2\66\67\b\4\1\2\67>\3\2\2\289\7\b\2\29:\5\2\2\2:;\7\b\2\2;<\b\4\1\2"+
		"<>\3\2\2\2=*\3\2\2\2=.\3\2\2\2=\63\3\2\2\2=8\3\2\2\2>\7\3\2\2\2?@\7\t"+
		"\2\2@A\5\2\2\2AB\7\t\2\2BC\b\5\1\2C\t\3\2\2\2DE\7\n\2\2EF\5\2\2\2FG\7"+
		"\n\2\2GH\b\6\1\2H\13\3\2\2\2IJ\7\13\2\2JK\5\2\2\2KL\7\13\2\2LM\b\7\1\2"+
		"M\r\3\2\2\2NO\7\25\2\2OP\5\2\2\2PQ\7\26\2\2QR\b\b\1\2R\17\3\2\2\2ST\7"+
		"\27\2\2TU\5\2\2\2UV\7\30\2\2VW\b\t\1\2W\21\3\2\2\2XY\7\31\2\2YZ\5\2\2"+
		"\2Z[\7\32\2\2[\\\b\n\1\2\\\23\3\2\2\2]^\7\r\2\2^_\5\4\3\2_`\7\22\2\2`"+
		"a\5\2\2\2ab\7\16\2\2bc\b\13\1\2c\25\3\2\2\2de\7\33\2\2ef\5\4\3\2fg\7\34"+
		"\2\2gh\b\f\1\2h\27\3\2\2\2ij\7\21\2\2jk\5\2\2\2kl\b\r\1\2l\31\3\2\2\2"+
		"mn\7\23\2\2no\5\2\2\2op\7\24\2\2pq\b\16\1\2q\33\3\2\2\2rs\7\f\2\2st\b"+
		"\17\1\2t\35\3\2\2\2uv\5\b\5\2vw\5\36\20\2w\u00a0\3\2\2\2xy\5\n\6\2yz\5"+
		"\36\20\2z\u00a0\3\2\2\2{|\5\34\17\2|}\5\36\20\2}\u00a0\3\2\2\2~\177\5"+
		"\2\2\2\177\u0080\5\36\20\2\u0080\u00a0\3\2\2\2\u0081\u0082\5\f\7\2\u0082"+
		"\u0083\5\36\20\2\u0083\u00a0\3\2\2\2\u0084\u0085\5\16\b\2\u0085\u0086"+
		"\5\36\20\2\u0086\u00a0\3\2\2\2\u0087\u0088\5\20\t\2\u0088\u0089\5\36\20"+
		"\2\u0089\u00a0\3\2\2\2\u008a\u008b\5\22\n\2\u008b\u008c\5\36\20\2\u008c"+
		"\u00a0\3\2\2\2\u008d\u008e\5\24\13\2\u008e\u008f\5\36\20\2\u008f\u00a0"+
		"\3\2\2\2\u0090\u0091\5\26\f\2\u0091\u0092\5\36\20\2\u0092\u00a0\3\2\2"+
		"\2\u0093\u0094\5\30\r\2\u0094\u0095\5\36\20\2\u0095\u00a0\3\2\2\2\u0096"+
		"\u0097\5\32\16\2\u0097\u0098\5\36\20\2\u0098\u00a0\3\2\2\2\u0099\u009a"+
		"\5\6\4\2\u009a\u009b\5\36\20\2\u009b\u00a0\3\2\2\2\u009c\u009d\5\34\17"+
		"\2\u009d\u009e\5\36\20\2\u009e\u00a0\3\2\2\2\u009fu\3\2\2\2\u009fx\3\2"+
		"\2\2\u009f{\3\2\2\2\u009f~\3\2\2\2\u009f\u0081\3\2\2\2\u009f\u0084\3\2"+
		"\2\2\u009f\u0087\3\2\2\2\u009f\u008a\3\2\2\2\u009f\u008d\3\2\2\2\u009f"+
		"\u0090\3\2\2\2\u009f\u0093\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u0099\3\2"+
		"\2\2\u009f\u009c\3\2\2\2\u00a0\37\3\2\2\2\u00a1\u00a3\5\36\20\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5!\3\2\2\2\6%=\u009f\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}