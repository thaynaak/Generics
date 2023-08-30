package com.jovemprogramador.cursojavatarde.generics;

public class TesteProdutoGenerico {

	public static void main(String[] args) {
		
		ProdutoGenerico<String, Integer> produto1 = new ProdutoGenerico<> ("IMP", 34);
		ProdutoGenerico<String, Integer> produto2 = new ProdutoGenerico <> ("SEC", 1413);
		
		System.out.println(produto1);
		System.out.println(produto2);
	}

}
