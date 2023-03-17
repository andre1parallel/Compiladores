package br.com.andreglaucio.aglang.ast;

import br.com.andreglaucio.aglang.datastructure.AGLVariable;

public class CommandLeitura extends AbstractCommand {
	
	private String id;
	private AGLVariable var;
	
	public CommandLeitura (String id, AGLVariable var) {
		this.id = id;
		this.var = var;
	}
	
	@Override
	public String generateJavaCode() {
		return id +" = _key." + (var.getType() == AGLVariable.NUMBER? "nextDouble();": "nextLine();");
	}

	@Override
	public String toString() {
		return "Comando de Leitura [id = " + id + "]";
	}
	
	
}
