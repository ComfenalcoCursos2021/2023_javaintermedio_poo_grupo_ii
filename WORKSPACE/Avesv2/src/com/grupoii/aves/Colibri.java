package com.grupoii.aves;

public class Colibri extends Ave implements IAveVoladora {

	public void volar() {
		System.out.println("DESPEGA DESDE EL MISMO PUNTO DESDE COLIBRI");
	}
	public void aterrizar() {
		System.out.println("ATERRIZANDO DESDE COLIBRI");
	}
}
