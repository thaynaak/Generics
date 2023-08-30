package com.jovemprogramador.cursojavatarde.generics;

public class TesteProdutoG2 {
    public static void main(String[] args) {
        Codigo<String, Integer> codigo1 = new Codigo<>("IMP", 34);
        Codigo<String, Integer> codigo2 = new Codigo<>("SEC", 1413);

        ValorM valor1 = new ValorM(150.0);
        ValorM valor2 = new ValorM(299.99);

        ProdutoG2<String> produto1 = new ProdutoG2<>(codigo1, "Produto Implantação", valor1);
        ProdutoG2<String> produto2 = new ProdutoG2<>(codigo2, "Produto Se"
        		+ "quencial", valor2);

        System.out.println(produto1);
        System.out.println(produto2);
    }
}
