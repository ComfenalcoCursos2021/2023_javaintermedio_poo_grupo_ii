package com.grupo.ii.poo.inicio;

import com.grupo.ii.poo.manejadores.ManejadorArbol;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManejadorArbol mA= new ManejadorArbol();
		
		mA.agregarDato(10);
		mA.agregarDato(5);
		mA.agregarDato(15);
		mA.agregarDato(3);
		mA.agregarDato(4);
		mA.agregarDato(1);
		mA.agregarDato(5);
		mA.agregarDato(9);
		mA.agregarDato(7);
		mA.agregarDato(8);
		
		mA.imprimirArbol();
		System.out.println("==============");
		mA.imprimirReverseArbol();
		System.out.println("Termino");
	}

}
