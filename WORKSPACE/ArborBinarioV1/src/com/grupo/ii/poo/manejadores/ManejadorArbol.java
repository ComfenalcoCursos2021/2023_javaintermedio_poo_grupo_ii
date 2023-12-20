package com.grupo.ii.poo.manejadores;

import com.grupo.ii.poo.recursos.Nodo;

public class ManejadorArbol {

	private Nodo inicial;
	
	
	
	public void agregarDato(int dato) {
		
		if(inicial == null) {
			
			inicial = new Nodo();
			inicial.setNumero(dato);
			
		} else {
			Nodo temp = inicial;
			Nodo nuevo = new Nodo();
			nuevo.setNumero(dato);
			while(temp != null) {
				
				if(temp.getNumero() > dato) {
					//derecha
					if(temp.getMayor() == null) {
						temp.setMayor(nuevo);
					} else {
						
					}
				} else {
					//izquierda
					if(temp.getMenor() == null) {
						temp.setMenor(nuevo);
					} else {
						
					}
					
				}				
			}
			
			System.out.println("aqui continuaria");
			
		}
	}
}
