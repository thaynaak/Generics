package com.jovemprogramador.cursojavatarde.generics;

public class TestePar {
	public static void main(String[] args){
		Par <String, Double> conjunto1 = new Par <> ("Thayna", 10.0);
		Par <Integer, String> conjunto2 = new Par <> (123, "Bruno");
		Par <Float, Float> conjunto3 = new Par <> (41.40338f, 2.17403f);
		
		
		System.out.println(conjunto1);
		System.out.println(conjunto2);
		System.out.println(conjunto3);
	}
}
