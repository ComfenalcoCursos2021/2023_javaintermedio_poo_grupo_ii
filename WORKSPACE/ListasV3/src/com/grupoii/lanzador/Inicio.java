package com.grupoii.lanzador;

import com.grupoii.recursos.ManejadorLista;

public class Inicio {

	public static void main(String[] args) {
		
		ManejadorLista lista1 = new ManejadorLista();
		
		lista1.agregar(1);
		lista1.agregar(2);
		lista1.agregar(3);
		lista1.agregar(4);
		lista1.agregar(5);
		lista1.agregar(6);
		
		lista1.imprimirLista();
		
		System.out.println("TERMINO");

	}

}
