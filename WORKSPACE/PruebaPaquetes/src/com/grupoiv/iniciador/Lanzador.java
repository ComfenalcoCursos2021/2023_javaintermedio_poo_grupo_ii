package com.grupoiv.iniciador;

import confenalco.aritmetica.Suma;



public class Lanzador {

	public static void main(String[] args) {		
		
		Suma fotocopia = new Suma();
		
		int resultado = fotocopia.sumaDosNumeros(200,300);
		System.out.println("Este es el resultado " + resultado);
		
		resultado = fotocopia.sumaNnumerosNaturales(4);
		System.out.println("La suma de los n numeros naturales " + resultado);
		System.out.println("HOLA MUNDO DESDE LANZADOR");
		

	}

}
