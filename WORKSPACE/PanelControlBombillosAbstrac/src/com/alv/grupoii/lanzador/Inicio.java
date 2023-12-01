package com.alv.grupoii.lanzador;

import com.alv.grupoii.manejadores.ManejadorBombillos;
import com.alv.grupoii.recursos.Bombillo;
import com.alv.grupoii.recursos.BombilloLed;
import com.alv.grupoii.recursos.BombilloRGB;
import com.alv.grupoii.recursos.IApagado;

public class Inicio {

	public static void main(String[] args) {

		ManejadorBombillos mb = new ManejadorBombillos();
		Bombillo bLed = new BombilloLed();
		Bombillo rgbLed = new BombilloRGB();
		
		
		
		System.out.println(rgbLed.isEstaPrendido());
		mb.encenderBombillo(rgbLed);
		
		System.out.println(rgbLed.isEstaPrendido());
		
		mb.apagarBombillo(rgbLed);
		System.out.println(rgbLed.isEstaPrendido());
		
		System.out.println("Termino!!!");
		

	}

}
