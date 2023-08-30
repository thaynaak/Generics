package com.jovemprogramador.cursojavatarde.generics;

public class ProdutoG2<T> {
    private Codigo<T, Integer> codigo;
    private String descricao;
    private ValorM valor;

    public ProdutoG2(Codigo<T, Integer> codigo, String descricao, ValorM valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Codigo<T, Integer> getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public ValorM getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "ProdutoG2{" +
                "codigo = " + codigo +
                ", descricao = '" + descricao + '\'' +
                ", valor = " + valor +
                '}';
    }
}
