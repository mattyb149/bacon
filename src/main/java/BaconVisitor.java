// Generated from /Users/mburgess/git/bacon/src/main/antlr/Bacon.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BaconParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BaconVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BaconParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(BaconParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaconParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(BaconParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaconParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BaconParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaconParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(BaconParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaconParser#quotedString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedString(BaconParser.QuotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaconParser#unquotedString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedString(BaconParser.UnquotedStringContext ctx);
}