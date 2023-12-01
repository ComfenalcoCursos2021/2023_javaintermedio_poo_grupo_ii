package com.alv.grupoii.lanzador;

import com.alv.grupoii.manejadores.ManejadorBombillos;
import com.alv.grupoii.recursos.Bombillo;
import com.alv.grupoii.recursos.BombilloLed;
import com.alv.grupoii.recursos.Constantes;

public class Inicio {

	public static void main(String[] args) {

		ManejadorBombillos mb = new ManejadorBombillos();
		
		BombilloLed bLed1 = new BombilloLed();
		BombilloLed bLed2 = new BombilloLed();
		BombilloLed bLed3 = new BombilloLed();
		
		

		bLed1.setNombre("bLed1");
		Bombillo.adorno = "-->";
		bLed2.setNombre("bLed2");
		Bombillo.adorno = "==>";
		bLed3.setNombre("bLed3");
		Bombillo.adorno = ">>>";
		
		System.out.println(bLed1.getNombreAdorno());
		System.out.println(bLed2.getNombreAdorno());
		System.out.println(bLed3.getNombreAdorno());
		Bombillo.imprimirGarantia();
		Bombillo.imprimirGarantia();
		Bombillo.imprimirGarantia();
		
		String ref = Bombillo.getReferencia();
		System.out.println("La referencia " + ref);
		if(Bombillo.probador(110)) {
			System.out.println("El bombillo prendio");
		} else {
			System.out.println("El bombillo no prende");
		}
		
		System.out.println("Imprimir la constante " + Constantes.A);
		Constantes.A = 9999999;
		System.out.println("Imprimir la constante " + Constantes.A);
		System.out.println("Termino!!!");
		

	}

}
