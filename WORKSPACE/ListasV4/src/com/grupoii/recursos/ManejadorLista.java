package com.grupoii.recursos;

import com.grupoii.excepciones.MalAugurioException;
import com.grupoii.excepciones.ManejadorListaVaciaException;

public class ManejadorLista {

	private Elemento primero;
	private Elemento ultimo;
	
	private Elemento interactivo;

	public boolean estaVacia() {
		return primero == null;
	}
	
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
		if(interactivo == null) {
			return -99999;
		} else {
			return interactivo.getDato();	
		}
		
	}
	public int getAnterior() throws Exception  {
		
		if(interactivo == null) {
			throw new ManejadorListaVaciaException("Mano ojo que no hay nada");
		}
		
		interactivo = interactivo.getAnterior();
		if(interactivo.getDato() == 6) {
			throw new MalAugurioException("El 6 es mal augurio");
		}
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
