	package com.jovemprogramador.cursojavatarde.generics;

	public class ProdutoG<T> {
	    private Codigo<T, Integer> codigo;
	    private String descricao;

	    public ProdutoG(Codigo<T, Integer> codigo, String descricao) {
	        this.codigo = codigo;
	        this.descricao = descricao;
	    }

	    public Codigo<T, Integer> getCodigo() {
	        return codigo;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    @Override
	    public String toString() {
	        return "ProdutoG{" +
	                "codigo=" + codigo +
	                ", descricao='" + descricao + '\'' +
	                '}';
	    }
	}


