package com.alv.grupoii.recursos;

public class BombilloLed extends Bombillo {
	private int numeroLeds;

	public int getNumeroLeds() {
		return numeroLeds;
	}

	public void setNumeroLeds(int numeroLeds) {
		this.numeroLeds = numeroLeds;
	}
	
	public void encender() {
		System.out.println("Ahora lo enciendo desde el led");
		System.out.println("$> calentar leds");
		super.encender();
	}

}
