package com.jovemprogramador.cursojavatarde.generics;

public class ValorM {
    private double valor;

    public ValorM(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "R$ " + valor;
    }
}
