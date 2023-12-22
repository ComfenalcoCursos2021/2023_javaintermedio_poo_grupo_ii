package com.grupo.ii.poo.manejadores;

import com.grupo.ii.poo.recursos.LQ;
import com.grupo.ii.poo.recursos.Nodo;

public class ManejadorArbol {

	private Nodo inicial;
	
	
	
	public void imprimirArbol() {
		imprimaNodo(inicial);
	}
	public void imprimirReverseArbol() {
		imprimaReverseNodo(inicial);
	}
	private void imprimaNodo(Nodo nodo) {
		
		if(nodo.getMenor() != null ) {
			imprimaNodo(nodo.getMenor());
		}
		System.out.println(nodo.getNumero());
		if(nodo.getMayor() != null) {
			imprimaNodo(nodo.getMayor());
		}		
	}
	
	
	private void imprimaReverseNodo(Nodo nodo) {
		
		if(nodo.getMayor() != null) {
			imprimaReverseNodo(nodo.getMayor());
		}
		LQ.p(nodo.getNumero());
		if(nodo.getMenor() != null ) {
			imprimaReverseNodo(nodo.getMenor());
		}
				
	}
	public void agregarDato(int dato) {
		
		if(inicial == null) {
			
			inicial = new Nodo();
			inicial.setNumero(dato);
			
		} else {
			Nodo temp = inicial;
			Nodo nuevo = new Nodo();
			nuevo.setNumero(dato);
			while(temp != null) {
				
				if(temp.getNumero() < dato) {
					//derecha
					if(temp.getMayor() == null) {
						temp.setMayor(nuevo);
						temp = null;
					} else {
						temp = temp.getMayor();
					}
				} else {
					//izquierda
					if(temp.getMenor() == null) {
						temp.setMenor(nuevo);
						temp = null;
					} else {
						temp = temp.getMenor();
					}
					
				}				
			}
			
			System.out.println("Agregado!!!");
			
		}
	}
}
