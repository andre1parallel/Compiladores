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
	 * Enter a parse tree produced by {@link AGLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AGLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AGLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(AGLangParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(AGLangParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#declaracao_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_var(AGLangParser.Declaracao_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#declaracao_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_var(AGLangParser.Declaracao_varContext ctx);
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
	 * Enter a parse tree produced by {@link AGLangParser#cmdEntrada}.
	 * @param ctx the parse tree
	 */
	void enterCmdEntrada(AGLangParser.CmdEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#cmdEntrada}.
	 * @param ctx the parse tree
	 */
	void exitCmdEntrada(AGLangParser.CmdEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#cmdSaida}.
	 * @param ctx the parse tree
	 */
	void enterCmdSaida(AGLangParser.CmdSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#cmdSaida}.
	 * @param ctx the parse tree
	 */
	void exitCmdSaida(AGLangParser.CmdSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#cmdAtribui}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribui(AGLangParser.CmdAtribuiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#cmdAtribui}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribui(AGLangParser.CmdAtribuiContext ctx);
	/**
	 * Enter a parse tree produced by {@link AGLangParser#cmdDecisao}.
	 * @param ctx the parse tree
	 */
	void enterCmdDecisao(AGLangParser.CmdDecisaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AGLangParser#cmdDecisao}.
	 * @param ctx the parse tree
	 */
	void exitCmdDecisao(AGLangParser.CmdDecisaoContext ctx);
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