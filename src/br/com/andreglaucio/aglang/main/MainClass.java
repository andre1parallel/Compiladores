package br.com.andreglaucio.aglang.main;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;

import br.com.andreglaucio.aglang.exceptions.AGLSemanticException;
import br.com.andreglaucio.aglang.parser.AGLangLexer;
import br.com.andreglaucio.aglang.parser.AGLangParser;

/* Esta é a classe principal do programa que inicia a execução do compilador.
 * É responsável por criar a interação com o usuário, instanciar o parser e apontar para o arquivo fonte.
 * O arquivo fonte possui a extensão .agl
 */

public class MainClass {
	public static void main(String[] args) {
		try {
			AGLangLexer lexer;
			AGLangParser parser;
			
			// O arquivo "input.agl" é lido como entrada para o Analisador léxico
			lexer = new AGLangLexer(CharStreams.fromFileName("input.agl"));
			
			// É criado um "Fluxo de tokens" para passar para o Analisador Sintático
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			// É criado o parser a partir do tokenStream
			parser = new AGLangParser(tokenStream);
			
			// Chama o método "prog" do parser para iniciar a Análise Sintática
			parser.prog();
			
			System.out.println("O programa foi compilado com sucesso!");
			
			parser.exibeComandos();
			
			parser.generateCode();
		}
		// Captura exceções do tipo AGLSemanticException, que podem ser geradas durante a análise semântica do programa
		catch(AGLSemanticException ex) {
			System.err.println("ERRO Semântico - "+ex.getMessage());
		}
		// Captura outras exceções que possam ocorrer durante a execução do programa
		catch(Exception ex) {
			System.err.println("ERRO "+ex.getMessage());
		}
	}
}
