package com.grupoii.lanzador;

import com.grupoii.aves.Colibri;
import com.grupoii.aves.Golondrina;
import com.grupoii.aves.Paloma;
import com.grupoii.aves.Pinguino;

public class Inicio {

	public static void main(String[] args) {

		
		
		Paloma p = new Paloma();
		p.volar();
		p.aterrizar();
		
		Colibri c = new Colibri();
		c.volar();
		c.aterrizar();
		
		Pinguino pin = new Pinguino();
		pin.nadar();
		
		Golondrina g = new Golondrina();
		g.volar();
		g.aterrizar();
		
		
		System.out.println("TERMINO!!!");

	}

}
