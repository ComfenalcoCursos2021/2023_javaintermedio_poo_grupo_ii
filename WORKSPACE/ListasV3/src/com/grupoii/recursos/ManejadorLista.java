package com.grupoii.recursos;

public class ManejadorLista {

	private Elemento primero;
	private Elemento ultimo;
	
	private Elemento interactivo;

	public void agregar(int i) {
		Elemento nuevo = new Elemento();
		nuevo.setDato(i);

		if (primero == null) {
			interactivo = nuevo;
			primero = nuevo;
			ultimo = nuevo;
			primero.setSiguiente(ultimo);
			primero.setAnterior(ultimo);
		} else {

			nuevo.setAnterior(ultimo);
			nuevo.setSiguiente(primero);
			ultimo.setSiguiente(nuevo);
			ultimo = nuevo;
			primero.setAnterior(ultimo);

		}
	}

	public void imprimirLista() {
		Elemento temp = primero;
		do {
			System.out.println("IMPRIMIENDO EL DATO -> " + temp.getDato());
			temp = temp.getSiguiente();
		} while (temp != primero);
	}
	
	public int getPrimero() {
		interactivo = primero;
		return interactivo.getDato();
	}
	public int getAnterior() {
		interactivo = interactivo.getAnterior();
		return interactivo.getDato();
	}
	public int getSiguiente() {
		interactivo = interactivo.getSiguiente();
		return interactivo.getDato();
	}	
	public int getUtlimo() {
		interactivo = ultimo;
		return interactivo.getDato();
	}
}
