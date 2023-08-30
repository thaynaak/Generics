package com.jovemprogramador.cursojavatarde.generics;

public class TesteProdutoG {
    public static void main(String[] args) {
        Codigo<String, Integer> codigo1 = new Codigo<>("IMP", 34);
        Codigo<String, Integer> codigo2 = new Codigo<>("SEC", 1413);

        ProdutoG<String> produto1 = new ProdutoG<>(codigo1, "Produto Implantação");
        ProdutoG<String> produto2 = new ProdutoG<>(codigo2, "Produto Sequencial");

        System.out.println(produto1);
        System.out.println(produto2);
    }
}
