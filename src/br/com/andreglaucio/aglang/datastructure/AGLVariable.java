package br.com.andreglaucio.aglang.datastructure;

public class AGLVariable extends AGLSymbol {
	// Constantes para representar os tipos de variáveis suportados
	public static final int NUMBER = 0;
	public static final int TEXT = 1;
	
	// Atributos que representam o tipo e o valor da variável
	private int type;
	private String value;
	
	// Construtor que inicializa o nome, o tipo e o valor da variável
	public AGLVariable(String name, int type, String value) {
		super(name);
		this.type = type;
		this.value = value;
	}

	// Métodos para acessar e modificar o tipo da variável
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	// Métodos para acessar e modificar o valor da variável
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "AGLVariable [name=" + name + ", type=" + type + ", value=" + value + "]";
	}
	
	// Método para gerar o código Java correspondente à declaração da variável
	public String generateJavaCode() {
		String str;
		if (type == NUMBER) {
			str = "double ";
		}
		else {
			str = "String ";
		}
		return str + " "+super.name+";";
	}
}
