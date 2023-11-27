// Generated from Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(GrammarParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(GrammarParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(GrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(GrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void enterListDecl(GrammarParser.ListDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void exitListDecl(GrammarParser.ListDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declTip}.
	 * @param ctx the parse tree
	 */
	void enterDeclTip(GrammarParser.DeclTipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declTip}.
	 * @param ctx the parse tree
	 */
	void exitDeclTip(GrammarParser.DeclTipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listId}.
	 * @param ctx the parse tree
	 */
	void enterListId(GrammarParser.ListIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listId}.
	 * @param ctx the parse tree
	 */
	void exitListId(GrammarParser.ListIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tip}.
	 * @param ctx the parse tree
	 */
	void enterTip(GrammarParser.TipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tip}.
	 * @param ctx the parse tree
	 */
	void exitTip(GrammarParser.TipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void enterCmdComp(GrammarParser.CmdCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void exitCmdComp(GrammarParser.CmdCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void enterListCmd(GrammarParser.ListCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void exitListCmd(GrammarParser.ListCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(GrammarParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(GrammarParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(GrammarParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(GrammarParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(GrammarParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(GrammarParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(GrammarParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(GrammarParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(GrammarParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(GrammarParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listW}.
	 * @param ctx the parse tree
	 */
	void enterListW(GrammarParser.ListWContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listW}.
	 * @param ctx the parse tree
	 */
	void exitListW(GrammarParser.ListWContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elemW}.
	 * @param ctx the parse tree
	 */
	void enterElemW(GrammarParser.ElemWContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elemW}.
	 * @param ctx the parse tree
	 */
	void exitElemW(GrammarParser.ElemWContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtrib(GrammarParser.CmdAtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtrib(GrammarParser.CmdAtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(GrammarParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(GrammarParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GrammarParser.FactorContext ctx);
}