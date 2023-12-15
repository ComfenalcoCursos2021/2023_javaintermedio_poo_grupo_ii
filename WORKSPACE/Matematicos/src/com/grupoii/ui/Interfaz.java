package com.grupoii.ui;

import java.util.Scanner;

import com.grupoii.matematicos.Collatz;

public class Interfaz {

	private final int OPCION_SALIR = 99;
	private Scanner TECLADO = new Scanner(System.in);
	private Collatz C = new Collatz();
	private void  menu() {
		System.out.println("************************************");
		System.out.println("*************** MENU ***************");
		System.out.println("************************************");
		System.out.println("*********INGRESE UN NUMERO**********");
		System.out.println("*********el "+this.OPCION_SALIR+" para salir **********");
	}
	
	public void iniciarPrograma() {
		int opcion = this.OPCION_SALIR+1;
		while(opcion != this.OPCION_SALIR) {
			this.menu();
			opcion = TECLADO.nextInt();
			if(opcion != this.OPCION_SALIR) {
				C.imprimirSecuencia(opcion);
			}
		}
	}
}
