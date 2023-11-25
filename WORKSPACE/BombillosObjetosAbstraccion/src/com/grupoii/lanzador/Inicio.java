package com.grupoii.lanzador;

import com.grupoii.recursos.Bombillo;
import com.grupoii.recursos.BombilloHomecenter;
import com.grupoii.recursos.BombilloLuminex;

public class Inicio {

	public static void main(String[] args) {
		
		//BombilloHomecenter miCuarto = new BombilloHomecenter();
		//BombilloLuminex sala = new BombilloLuminex();
		
		Bombillo miCuarto = new Bombillo("Dairu", 10000);
		Bombillo sala = new Bombillo("Luminex", 20000);
		
		System.out.println(miCuarto.getMarca());
		
		System.out.println(sala.getMarca());
		

	}

}
