package com.grupoii.recursos;

public class Elemento {

	private int dato;
	private Elemento siguiente;
	
	
	public Elemento() {
		
	}
	public Elemento(int datoValor) {
		this.dato = datoValor;
	}
	
	
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Elemento getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Elemento siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
