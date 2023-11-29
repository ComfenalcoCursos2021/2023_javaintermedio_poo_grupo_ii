package com.grupoii.genericos;

public class Almacenador<T> {
	private T dato;
	
	public void almacenar(T unDato) {
		this.dato = unDato;
	}
	
	public T devolver() {
		return this.dato;
	}
}
