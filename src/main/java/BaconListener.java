// Generated from /Users/mburgess/git/bacon/src/main/antlr/Bacon.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BaconParser}.
 */
public interface BaconListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BaconParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BaconParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaconParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BaconParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaconParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(BaconParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaconParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(BaconParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaconParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BaconParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaconParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BaconParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaconParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(BaconParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaconParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(BaconParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaconParser#quotedString}.
	 * @param ctx the parse tree
	 */
	void enterQuotedString(BaconParser.QuotedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaconParser#quotedString}.
	 * @param ctx the parse tree
	 */
	void exitQuotedString(BaconParser.QuotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaconParser#unquotedString}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedString(BaconParser.UnquotedStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaconParser#unquotedString}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedString(BaconParser.UnquotedStringContext ctx);
}