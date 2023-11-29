package com.alv.grupoii.lanzador;

import com.alv.grupoii.manejadores.ManejadorBombillos;
import com.alv.grupoii.recursos.BombilloLed;

public class Inicio {

	public static void main(String[] args) {

		ManejadorBombillos mb = new ManejadorBombillos();
		BombilloLed bLed = new BombilloLed();
		
		System.out.println(bLed.isEstaPrendido());
		mb.encenderBombillo(bLed);
		System.out.println(bLed.isEstaPrendido());
		
		System.out.println("Termino!!!");
		

	}

}
