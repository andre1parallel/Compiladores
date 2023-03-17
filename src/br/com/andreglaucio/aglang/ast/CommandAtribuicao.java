package br.com.andreglaucio.aglang.ast;

import br.com.andreglaucio.aglang.datastructure.AGLVariable;

public class CommandAtribuicao extends AbstractCommand {
	
	private String id;
	private String expr;
	
	public CommandAtribuicao(String id, String expr) {
		this.id = id;
		this.expr = expr;
	}
	
	@Override
	public String generateJavaCode() {
		return id + " = "+expr+";";
	}

	@Override
	public String toString() {
		return "Comando de Atribuição [id = " + id + ", expr = " + expr + "]";
	}
	
	
	
}
