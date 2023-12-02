package com.grupoii.recursos;

public class ManejadorLista {

	private Elemento primero;
	private Elemento ultimo;
	
	public void agregar(int i) {
		Elemento nuevo = new Elemento();
		nuevo.setDato(i);
		
		if(primero == null) {
			primero = nuevo;
			ultimo = nuevo;
		} else {
			ultimo.setSiguiente(nuevo);
			ultimo  = nuevo;
		}
	}
	
	public void imprimirLista() {
		Elemento temp = primero;
		
		do {
			System.out.println("IMPRIMIENDO EL DATO -> "+temp.getDato());
			temp = temp.getSiguiente();
		} while(temp != null);
	}
}
