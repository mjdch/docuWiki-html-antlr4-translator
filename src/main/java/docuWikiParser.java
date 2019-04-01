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
		SUPERSCRIPT_END=22, DELETED_START=23, DELETED_END=24, IMAGE_START=25, 
		IMAGE_END=26, ANY=27, NL=28, WS=29;
	public static final int
		RULE_paragraph = 0, RULE_headline = 1, RULE_bold = 2, RULE_italic = 3, 
		RULE_underline = 4, RULE_subscript = 5, RULE_superscript = 6, RULE_deleted = 7, 
		RULE_externalLink = 8, RULE_image = 9, RULE_quote = 10, RULE_code = 11, 
		RULE_newline = 12, RULE_bodyElements = 13, RULE_body = 14;
	public static final String[] ruleNames = {
		"paragraph", "headline", "bold", "italic", "underline", "subscript", "superscript", 
		"deleted", "externalLink", "image", "quote", "code", "newline", "bodyElements", 
		"body"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'='", "'=='", "'==='", "'===='", "'**'", "'//'", "'__'", 
		"'\\'", "'[['", "']]'", "'* '", "'- '", "'>'", "' | '", "'<code>'", "'</code>'", 
		"'<sub>'", "'</sub>'", "'<sup>'", "'</sup>'", "'<del>'", "'</del>'", "'{{'", 
		"'}}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "CHAR", "HEADLINE_1", "HEADLINE_2", "HEADLINE_3", "HEADLINE_4", 
		"BOLD_MARK", "ITALIC_MARK", "UNDERLINE_MARK", "NEWLINE_MARK", "LINK_OPEN", 
		"LINK_END", "LIST_MARK", "NUMBERED_LIST_MARK", "QUOTE", "PIPE", "CODE_START", 
		"CODE_END", "SUBSCRIPT_START", "SUBSCRIPT_END", "SUPERSCRIPT_START", "SUPERSCRIPT_END", 
		"DELETED_START", "DELETED_END", "IMAGE_START", "IMAGE_END", "ANY", "NL", 
		"WS"
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



	  // an attribute that is only available in your
	  // parser (so only in parser rules!)
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
			setState(31); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(30);
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
				setState(33); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
		public ParagraphContext paragraph;
		public List<TerminalNode> HEADLINE_1() { return getTokens(docuWikiParser.HEADLINE_1); }
		public TerminalNode HEADLINE_1(int i) {
			return getToken(docuWikiParser.HEADLINE_1, i);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public List<TerminalNode> HEADLINE_2() { return getTokens(docuWikiParser.HEADLINE_2); }
		public TerminalNode HEADLINE_2(int i) {
			return getToken(docuWikiParser.HEADLINE_2, i);
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
		enterRule(_localctx, 2, RULE_headline);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEADLINE_1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(HEADLINE_1);
				setState(36);
				((HeadlineContext)_localctx).paragraph = paragraph();
				setState(37);
				match(HEADLINE_1);
				htmlBuilder.append("<h1>" + (((HeadlineContext)_localctx).paragraph!=null?_input.getText(((HeadlineContext)_localctx).paragraph.start,((HeadlineContext)_localctx).paragraph.stop):null) + "</h1>");
				}
				break;
			case HEADLINE_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(HEADLINE_2);
				setState(41);
				((HeadlineContext)_localctx).paragraph = paragraph();
				setState(42);
				match(HEADLINE_2);
				htmlBuilder.append("<h2>" + (((HeadlineContext)_localctx).paragraph!=null?_input.getText(((HeadlineContext)_localctx).paragraph.start,((HeadlineContext)_localctx).paragraph.stop):null) + "</h2>");
				}
				break;
			case HEADLINE_3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(HEADLINE_3);
				setState(46);
				((HeadlineContext)_localctx).paragraph = paragraph();
				setState(47);
				match(HEADLINE_3);
				htmlBuilder.append("<h3>" + (((HeadlineContext)_localctx).paragraph!=null?_input.getText(((HeadlineContext)_localctx).paragraph.start,((HeadlineContext)_localctx).paragraph.stop):null) + "</h3>");
				}
				break;
			case HEADLINE_4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(HEADLINE_4);
				setState(51);
				((HeadlineContext)_localctx).paragraph = paragraph();
				setState(52);
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
		enterRule(_localctx, 4, RULE_bold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(BOLD_MARK);
			setState(58);
			((BoldContext)_localctx).paragraph = paragraph();
			setState(59);
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
		enterRule(_localctx, 6, RULE_italic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ITALIC_MARK);
			setState(63);
			((ItalicContext)_localctx).paragraph = paragraph();
			setState(64);
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
		enterRule(_localctx, 8, RULE_underline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(UNDERLINE_MARK);
			setState(68);
			((UnderlineContext)_localctx).paragraph = paragraph();
			setState(69);
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
		enterRule(_localctx, 10, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(SUBSCRIPT_START);
			setState(73);
			((SubscriptContext)_localctx).paragraph = paragraph();
			setState(74);
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
		enterRule(_localctx, 12, RULE_superscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(SUPERSCRIPT_START);
			setState(78);
			((SuperscriptContext)_localctx).paragraph = paragraph();
			setState(79);
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
		enterRule(_localctx, 14, RULE_deleted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(DELETED_START);
			setState(83);
			((DeletedContext)_localctx).paragraph = paragraph();
			setState(84);
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
		public TerminalNode LINK_OPEN() { return getToken(docuWikiParser.LINK_OPEN, 0); }
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public TerminalNode PIPE() { return getToken(docuWikiParser.PIPE, 0); }
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
		enterRule(_localctx, 16, RULE_externalLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(LINK_OPEN);
			setState(88);
			paragraph();
			setState(89);
			match(PIPE);
			setState(90);
			paragraph();
			setState(91);
			match(LINK_END);
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

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE_START() { return getToken(docuWikiParser.IMAGE_START, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode IMAGE_END() { return getToken(docuWikiParser.IMAGE_END, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitImage(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IMAGE_START);
			setState(94);
			paragraph();
			setState(95);
			match(IMAGE_END);
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
		enterRule(_localctx, 20, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(QUOTE);
			setState(98);
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

	public static class CodeContext extends ParserRuleContext {
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
		enterRule(_localctx, 22, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CODE_START);
			setState(101);
			paragraph();
			setState(102);
			match(CODE_END);
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
		enterRule(_localctx, 24, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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

	public static class BodyElementsContext extends ParserRuleContext {
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public BodyElementsContext bodyElements() {
			return getRuleContext(BodyElementsContext.class,0);
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
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
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
		public BodyElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).enterBodyElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof docuWikiListener ) ((docuWikiListener)listener).exitBodyElements(this);
		}
	}

	public final BodyElementsContext bodyElements() throws RecognitionException {
		BodyElementsContext _localctx = new BodyElementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bodyElements);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				bold();
				setState(108);
				bodyElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				italic();
				setState(111);
				bodyElements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				newline();
				setState(114);
				bodyElements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				paragraph();
				setState(117);
				bodyElements();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				underline();
				setState(120);
				bodyElements();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				subscript();
				setState(123);
				bodyElements();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				superscript();
				setState(126);
				bodyElements();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				deleted();
				setState(129);
				bodyElements();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(131);
				externalLink();
				setState(132);
				bodyElements();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(134);
				image();
				setState(135);
				bodyElements();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(137);
				quote();
				setState(138);
				bodyElements();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(140);
				code();
				setState(141);
				bodyElements();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(143);
				headline();
				setState(144);
				bodyElements();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(146);
				newline();
				setState(147);
				bodyElements();
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
		public List<BodyElementsContext> bodyElements() {
			return getRuleContexts(BodyElementsContext.class);
		}
		public BodyElementsContext bodyElements(int i) {
			return getRuleContext(BodyElementsContext.class,i);
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
		enterRule(_localctx, 28, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				bodyElements();
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << CHAR) | (1L << HEADLINE_1) | (1L << HEADLINE_2) | (1L << HEADLINE_3) | (1L << HEADLINE_4) | (1L << BOLD_MARK) | (1L << ITALIC_MARK) | (1L << UNDERLINE_MARK) | (1L << NEWLINE_MARK) | (1L << LINK_OPEN) | (1L << QUOTE) | (1L << CODE_START) | (1L << SUBSCRIPT_START) | (1L << SUPERSCRIPT_START) | (1L << DELETED_START) | (1L << IMAGE_START))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u009f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0098\n\17\3\20\6\20\u009b\n\20\r\20\16\20"+
		"\u009c\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\3\4"+
		"\2\u00a1\2!\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\b@\3\2\2\2\nE\3\2\2\2\fJ\3\2"+
		"\2\2\16O\3\2\2\2\20T\3\2\2\2\22Y\3\2\2\2\24_\3\2\2\2\26c\3\2\2\2\30f\3"+
		"\2\2\2\32j\3\2\2\2\34\u0097\3\2\2\2\36\u009a\3\2\2\2 \"\t\2\2\2! \3\2"+
		"\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%&\7\5\2\2&\'\5\2\2\2\'"+
		"(\7\5\2\2()\b\3\1\2):\3\2\2\2*+\7\6\2\2+,\5\2\2\2,-\7\6\2\2-.\b\3\1\2"+
		".:\3\2\2\2/\60\7\7\2\2\60\61\5\2\2\2\61\62\7\7\2\2\62\63\b\3\1\2\63:\3"+
		"\2\2\2\64\65\7\b\2\2\65\66\5\2\2\2\66\67\7\b\2\2\678\b\3\1\28:\3\2\2\2"+
		"9%\3\2\2\29*\3\2\2\29/\3\2\2\29\64\3\2\2\2:\5\3\2\2\2;<\7\t\2\2<=\5\2"+
		"\2\2=>\7\t\2\2>?\b\4\1\2?\7\3\2\2\2@A\7\n\2\2AB\5\2\2\2BC\7\n\2\2CD\b"+
		"\5\1\2D\t\3\2\2\2EF\7\13\2\2FG\5\2\2\2GH\7\13\2\2HI\b\6\1\2I\13\3\2\2"+
		"\2JK\7\25\2\2KL\5\2\2\2LM\7\26\2\2MN\b\7\1\2N\r\3\2\2\2OP\7\27\2\2PQ\5"+
		"\2\2\2QR\7\30\2\2RS\b\b\1\2S\17\3\2\2\2TU\7\31\2\2UV\5\2\2\2VW\7\32\2"+
		"\2WX\b\t\1\2X\21\3\2\2\2YZ\7\r\2\2Z[\5\2\2\2[\\\7\22\2\2\\]\5\2\2\2]^"+
		"\7\16\2\2^\23\3\2\2\2_`\7\33\2\2`a\5\2\2\2ab\7\34\2\2b\25\3\2\2\2cd\7"+
		"\21\2\2de\5\2\2\2e\27\3\2\2\2fg\7\23\2\2gh\5\2\2\2hi\7\24\2\2i\31\3\2"+
		"\2\2jk\7\f\2\2kl\b\16\1\2l\33\3\2\2\2mn\5\6\4\2no\5\34\17\2o\u0098\3\2"+
		"\2\2pq\5\b\5\2qr\5\34\17\2r\u0098\3\2\2\2st\5\32\16\2tu\5\34\17\2u\u0098"+
		"\3\2\2\2vw\5\2\2\2wx\5\34\17\2x\u0098\3\2\2\2yz\5\n\6\2z{\5\34\17\2{\u0098"+
		"\3\2\2\2|}\5\f\7\2}~\5\34\17\2~\u0098\3\2\2\2\177\u0080\5\16\b\2\u0080"+
		"\u0081\5\34\17\2\u0081\u0098\3\2\2\2\u0082\u0083\5\20\t\2\u0083\u0084"+
		"\5\34\17\2\u0084\u0098\3\2\2\2\u0085\u0086\5\22\n\2\u0086\u0087\5\34\17"+
		"\2\u0087\u0098\3\2\2\2\u0088\u0089\5\24\13\2\u0089\u008a\5\34\17\2\u008a"+
		"\u0098\3\2\2\2\u008b\u008c\5\26\f\2\u008c\u008d\5\34\17\2\u008d\u0098"+
		"\3\2\2\2\u008e\u008f\5\30\r\2\u008f\u0090\5\34\17\2\u0090\u0098\3\2\2"+
		"\2\u0091\u0092\5\4\3\2\u0092\u0093\5\34\17\2\u0093\u0098\3\2\2\2\u0094"+
		"\u0095\5\32\16\2\u0095\u0096\5\34\17\2\u0096\u0098\3\2\2\2\u0097m\3\2"+
		"\2\2\u0097p\3\2\2\2\u0097s\3\2\2\2\u0097v\3\2\2\2\u0097y\3\2\2\2\u0097"+
		"|\3\2\2\2\u0097\177\3\2\2\2\u0097\u0082\3\2\2\2\u0097\u0085\3\2\2\2\u0097"+
		"\u0088\3\2\2\2\u0097\u008b\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u0091\3\2"+
		"\2\2\u0097\u0094\3\2\2\2\u0098\35\3\2\2\2\u0099\u009b\5\34\17\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\37\3\2\2\2\6#9\u0097\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}