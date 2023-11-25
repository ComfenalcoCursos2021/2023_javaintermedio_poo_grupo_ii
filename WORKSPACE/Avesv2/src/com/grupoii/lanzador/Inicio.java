package com.grupoii.lanzador;

import com.grupoii.aves.Colibri;
import com.grupoii.aves.Golondrina;
import com.grupoii.aves.Paloma;
import com.grupoii.aves.Pinguino;
import com.grupoii.manejadores.PruebaVueloManejador;

public class Inicio {

	public static void main(String[] args) {

		PruebaVueloManejador pruebas = new PruebaVueloManejador();
		
		
		Paloma p = new Paloma();
		Colibri c = new Colibri();
		
		Pinguino pin = new Pinguino();
		Golondrina g = new Golondrina();
		
		c.setNombre("El colibri pepe");
		p.setNombre("La paloma lola");
		
		pruebas.pruebaVuelo(p);
		pruebas.pruebaVuelo(c);
		pruebas.pruebaVuelo(g);
		
		
		System.out.println("TERMINO!!!");

	}

}
