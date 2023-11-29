package com.alv.grupoii.recursos;

public class Bombillo {

	private String nombre;
	private String marca ;
	private int intensidad;
	private boolean estaPrendido;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getIntensidad() {
		return intensidad;
	}
	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}
	public String isEstaPrendido() {
		return estaPrendido ? "PRENDIDO" : "APAGADO" ;
	}
	public void setEstaPrendido(boolean estaPrendido) {
		this.estaPrendido = estaPrendido;
	}
	
}
