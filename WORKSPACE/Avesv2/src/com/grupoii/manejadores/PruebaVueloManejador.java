package com.grupoii.manejadores;

import com.grupoii.aves.IAveVoladora;

public class PruebaVueloManejador {
	
	public void pruebaVuelo(IAveVoladora a) {
		System.out.println("---------------------------------");
		a.volar();
		System.out.println("~~~~~~~~~~~~");
		a.aterrizar();
		System.out.println("---------------------------------");
	}
	
}
