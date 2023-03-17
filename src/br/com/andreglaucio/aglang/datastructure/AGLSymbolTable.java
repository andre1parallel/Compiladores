package br.com.andreglaucio.aglang.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class AGLSymbolTable {
	
	// Mapa que associa nomes de símbolos a instâncias de AGLSymbol
	private HashMap<String, AGLSymbol> map;
	
	// Construtor que cria um novo mapa vazio
	public AGLSymbolTable() {
		map = new HashMap<String, AGLSymbol>();
	}
	// Adiciona um símbolo à tabela
	public void add(AGLSymbol symbol) {
		map.put(symbol.getName(), symbol);
	}
	// Verifica se um símbolo com o nome especificado já existe na tabela
	public boolean exists(String symbolName) {
		return map.get(symbolName) != null;
	}
	// Retorna o símbolo com o nome especificado, ou null se ele não existir na tabela
	public AGLSymbol get(String symbolName) {
		return map.get(symbolName);
	}
	
	public ArrayList<AGLSymbol> getAll(){
		ArrayList<AGLSymbol> lista = new ArrayList<AGLSymbol>();
		for (AGLSymbol symbol : map.values()) {
			lista.add(symbol);
		}
		return lista;
	}

}
