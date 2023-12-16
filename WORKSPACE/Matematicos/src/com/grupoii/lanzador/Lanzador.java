package com.grupoii.lanzador;

import java.util.Scanner;

import com.grupoii.ui.Interfaz;

public class Lanzador {

	public static void main(String[] args) {

		//pruebaValidacion();
		Interfaz inter = new Interfaz();
		inter.iniciarPrograma();
		System.out.println("Termino");
	}
	
	public static void pruebaValidacion() {
		Scanner in = new Scanner(System.in);
		int  dato = 0;
		System.out.println("Instrucciones.- .....");
		System.out.println("Ingrese el dato");
		dato = in.nextInt();
		while(dato <= 1) {
			System.out.println("Recuerde  que el dato debe ser.---.-.----.");
			System.out.println("Ingrese el dato");
			dato = in.nextInt();
		}
		System.out.println("FELICITACIONES EL DATO VA BIEN " + dato);
		
	}

}
