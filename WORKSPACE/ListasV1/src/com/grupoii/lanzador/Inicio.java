package com.grupoii.lanzador;

import com.grupoii.recursos.Elemento;

public class Inicio {

	public static void main(String[] args) {
		
		Elemento primero = new Elemento(1);
		Elemento segundo = new Elemento(2);
		Elemento tercero = new Elemento(3);
		Elemento cuarto = new Elemento(4);
		Elemento quinto = new Elemento(5);
		
		//primero.siguiente = segundo;
		primero.setSiguiente(segundo);
		
		segundo.setSiguiente(tercero);
		
		//tercero.setSiguiente(cuarto);
		primero.getSiguiente().getSiguiente().setSiguiente(cuarto);
		cuarto.setSiguiente(quinto);
		
		
		Elemento temp = primero;
		
		do {
			System.out.println("IMPRIMIENDO EL DATO -> "+temp.getDato());
			temp = temp.getSiguiente();
		} while(temp != null);
		
		System.out.println("TERMINO");

	}

}
