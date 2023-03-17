package br.com.andreglaucio.aglang.exceptions;

public class AGLSemanticException extends RuntimeException {
	// Construtor que recebe uma mensagem de erro e a repassa para a superclasse RuntimeException
	public AGLSemanticException(String msg) {
		super(msg);
	}

}
