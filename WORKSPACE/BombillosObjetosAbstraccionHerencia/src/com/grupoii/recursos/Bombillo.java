package com.grupoii.recursos;

public class Bombillo {
	private String marca;
	private int lumens;
	
	public Bombillo(String marcaValue, int lumensValue) {
		this.marca = marcaValue;
		this.lumens = lumensValue;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getLumens() {
		return lumens;
	}
	public void setLumens(int lumens) {
		this.lumens = lumens;
	}
	
	
}
