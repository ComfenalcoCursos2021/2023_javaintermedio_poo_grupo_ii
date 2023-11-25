package com.grupoii.manejadores;

import com.grupoii.aves.Paloma;

public class PruebaVueloManejador {
	
	public void pruebaVuelo(Paloma a) {
		System.out.println("---------------------------------");
		a.volar();
		System.out.println("~~~~~~~~~~~~");
		a.aterrizar();
		System.out.println("---------------------------------");
	}
}
