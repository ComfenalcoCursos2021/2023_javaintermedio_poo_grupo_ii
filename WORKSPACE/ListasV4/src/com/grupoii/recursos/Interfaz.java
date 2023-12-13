package com.grupoii.recursos;

import java.util.Scanner;

public class Interfaz {

	private Scanner TECLADO;
	private ManejadorLista MANEJADOR;

	public Interfaz() {
		this.TECLADO = new Scanner(System.in);
		this.MANEJADOR = new ManejadorLista();
	}

	private void menu1() {
		System.out.println("******************************************");
		System.out.println("1.) Agregar");
		System.out.println("2.) Recorrer");
		System.out.println("3.) ImprimirLista");
		System.out.println("99.) Salir");
		System.out.println("******************************************");
	}

	private void interaccionMenu1() {
		int opcion = 999;

		while (opcion != 99) {
			this.menu1();
			System.out.println("Ingrese la opcion requerida");
			opcion = this.TECLADO.nextInt();

			/*
			 * switch (opcion) { case 1: //codigo agregar; break; case 2: //codigo recorrer;
			 * break; case 3: //codigo salir; break;
			 * 
			 * default: System.out.println("INGRESE UN A OPCION VALIDA"); break; }
			 */

			if (opcion == 1) {
				this.interaccionAgregar();
			} else if (opcion == 2) {
				this.interaccionRecorrer();
			} else if (opcion == 3) {
				// pintar consola
				this.MANEJADOR.imprimirLista();
			} else if (opcion == 99) {
				// salir
			} else {
				System.out.println("INGRESE UNA OPCION VALIDA");
			}
		}
	}

	private void interaccionAgregar() {

		System.out.println("*********************************");
		System.out.println("******* Ingrese el numero *******");
		System.out.println("*********************************");
		System.out.println("");
		int numero = this.TECLADO.nextInt();
		this.MANEJADOR.agregar(numero);

	}

	private void interaccionRecorrer() {

		int opcion = 999;
		int dato = this.MANEJADOR.getPrimero();
		while (opcion != 99) {
			System.out.println("*********************************");
			System.out.println("************** DATO *************");
			System.out.println(dato);
			System.out.println("*********************************");
			System.out.println("");
			System.out.println("1.  PRIMERO");
			System.out.println("2.  ANTERIOR");
			System.out.println("3.  SIGUIENTE");
			System.out.println("4.  ULTIMO");
			System.out.println("99.  VOLVER");
			System.out.println("\nIngrese una opcion:");
			opcion = this.TECLADO.nextInt();
			
			if(opcion == 1) {
				dato = this.MANEJADOR.getPrimero();
			} else if(opcion == 2) {
				try {
					dato = this.MANEJADOR.getAnterior();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if(opcion == 3) {
				dato = this.MANEJADOR.getSiguiente();
			} else if(opcion == 4) {
				dato = this.MANEJADOR.getUtlimo();
			}
		}
	}

	public void iniciarPrograma() {
		this.interaccionMenu1();
	}
}
