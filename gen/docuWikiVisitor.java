// Generated from /Users/mjadach/IdeaProjects/dokuWiki/src/main/java/docuWiki.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link docuWikiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface docuWikiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#paragraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraph(docuWikiParser.ParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#headline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadline(docuWikiParser.HeadlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBold(docuWikiParser.BoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#italic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalic(docuWikiParser.ItalicContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#underline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderline(docuWikiParser.UnderlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(docuWikiParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#superscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperscript(docuWikiParser.SuperscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#deleted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleted(docuWikiParser.DeletedContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#externalLink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalLink(docuWikiParser.ExternalLinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#media}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedia(docuWikiParser.MediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(docuWikiParser.QuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(docuWikiParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(docuWikiParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(docuWikiParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link docuWikiParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(docuWikiParser.BodyContext ctx);
}