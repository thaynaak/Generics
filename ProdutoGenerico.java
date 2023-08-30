package com.jovemprogramador.cursojavatarde.generics;

public class ProdutoGenerico <T, U> {

	private T codSetor;
	private U codSeq;
	
	public ProdutoGenerico (T codSetor, U codSeq) {
		this.codSetor = codSetor;
		this.codSeq = codSeq;
		}

	public T getCodSetor() {
		return codSetor;
	}

	public U getCodSeq() {
		return codSeq;
	}
	
	@Override
    public String toString() {
        return "Codigo{" +
                "codSetor = " + codSetor +
                ", codSeq = " + codSeq +
                '}';
    }
}
