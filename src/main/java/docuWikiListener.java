// Generated from docuWiki.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link docuWikiParser}.
 */
public interface docuWikiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(docuWikiParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(docuWikiParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#headline}.
	 * @param ctx the parse tree
	 */
	void enterHeadline(docuWikiParser.HeadlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#headline}.
	 * @param ctx the parse tree
	 */
	void exitHeadline(docuWikiParser.HeadlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBold(docuWikiParser.BoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBold(docuWikiParser.BoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#italic}.
	 * @param ctx the parse tree
	 */
	void enterItalic(docuWikiParser.ItalicContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#italic}.
	 * @param ctx the parse tree
	 */
	void exitItalic(docuWikiParser.ItalicContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#underline}.
	 * @param ctx the parse tree
	 */
	void enterUnderline(docuWikiParser.UnderlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#underline}.
	 * @param ctx the parse tree
	 */
	void exitUnderline(docuWikiParser.UnderlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(docuWikiParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(docuWikiParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#superscript}.
	 * @param ctx the parse tree
	 */
	void enterSuperscript(docuWikiParser.SuperscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#superscript}.
	 * @param ctx the parse tree
	 */
	void exitSuperscript(docuWikiParser.SuperscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#deleted}.
	 * @param ctx the parse tree
	 */
	void enterDeleted(docuWikiParser.DeletedContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#deleted}.
	 * @param ctx the parse tree
	 */
	void exitDeleted(docuWikiParser.DeletedContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#externalLink}.
	 * @param ctx the parse tree
	 */
	void enterExternalLink(docuWikiParser.ExternalLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#externalLink}.
	 * @param ctx the parse tree
	 */
	void exitExternalLink(docuWikiParser.ExternalLinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(docuWikiParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(docuWikiParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(docuWikiParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(docuWikiParser.QuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(docuWikiParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(docuWikiParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(docuWikiParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(docuWikiParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#bodyElements}.
	 * @param ctx the parse tree
	 */
	void enterBodyElements(docuWikiParser.BodyElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#bodyElements}.
	 * @param ctx the parse tree
	 */
	void exitBodyElements(docuWikiParser.BodyElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link docuWikiParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(docuWikiParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link docuWikiParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(docuWikiParser.BodyContext ctx);
}