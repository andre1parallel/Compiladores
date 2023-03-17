package br.com.andreglaucio.aglang.datastructure;

public abstract class AGLSymbol {
	
	protected String name;
	
	// Método abstrato para gerar o código Java correspondente ao símbolo
	public abstract String generateJavaCode();
	
	// Construtor que recebe o nome do símbolo
	public AGLSymbol(String name) {
		this.name = name;
	}
	
	// // Métodos para acessar e modificar o nome do símbolo
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AGLSymbol [name=" + name + "]";
	}
}
