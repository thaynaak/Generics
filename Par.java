package com.jovemprogramador.cursojavatarde.generics;

public class Par <T, U> {

	private T par1;
	private U par2;
	
	public Par (T par1, U par2) {
		this.par1 = par1;
		this.par2 = par2;
	}

	public T getPar1() {
		return par1;
	}

	public U getPar2() {
		return par2;
	}
	
	@Override
    public String toString() {
        return "Par{" +
                "Par1 = " + par1 +
                ", Par2 = " + par2 +
                '}';
    }
}
