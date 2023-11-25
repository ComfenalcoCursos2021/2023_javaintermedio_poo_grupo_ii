package com.grupoii.aves;

public class Paloma extends Ave implements IAveVoladora {

	public void volar() {
		System.out.println("AGARRANDO CARRERA DESDE PALOMA");
	}
	public void aterrizar() {
		System.out.println("ATERRIZNADO FRENANDO DESDE PALOMA");
	}
}
