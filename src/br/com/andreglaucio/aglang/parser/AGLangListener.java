// Generated from AGLang.opl by ANTLR 4.7.1
package br.com.andreglaucio.aglang.parser;

	import br.com.andreglaucio.aglang.datastructure.*;
	import br.com.andreglaucio.aglang.exceptions.AGLSemanticException;
	import br.com.andreglaucio.aglang.ast.*;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AGLangParser}.
 */
public interface AGLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AGLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AGLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AGLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(AGLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(AGLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(AGLangParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(AGLangParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AGLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AGLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(AGLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(AGLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(AGLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(AGLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(AGLangParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(AGLangParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(AGLangParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(AGLangParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(AGLangParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(AGLangParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#cmddecisao}.
	 * @param ctx the parse tree
	 */
	void enterCmddecisao(AGLangParser.CmddecisaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#cmddecisao}.
	 * @param ctx the parse tree
	 */
	void exitCmddecisao(AGLangParser.CmddecisaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AGLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AGLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AGLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AGLangParser.TermoContext ctx);
}