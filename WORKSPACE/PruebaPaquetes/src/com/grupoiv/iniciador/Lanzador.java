package com.grupoiv.iniciador;

import java.math.BigDecimal;
import java.math.BigInteger;

import confenalco.aritmetica.Suma;



public class Lanzador {

	public static void main(String[] args) {		
		
		Suma fotocopia = new Suma();
		
		int resultado = fotocopia.sumaDosNumeros(200,300);
		System.out.println("Este es el resultado " + resultado);
		
		int resultado2 = fotocopia.sumaNnumerosNaturales(4);
		System.out.println("La suma de los n numeros naturales " + resultado2);
		System.out.println("HOLA MUNDO DESDE LANZADOR");
		
		fotocopia.tiposDatos();
		byte bb; // -128 a 127
		short sh; // -32
		int a;
		long l = 54646456L;
		float f = 7.5f   ;
		double d = 7.5;		
		
		char c = '+';
		boolean b = true;
		boolean bf = false;
		
		String s = "a cualquier texto";
		
		
		
		

	}

}
