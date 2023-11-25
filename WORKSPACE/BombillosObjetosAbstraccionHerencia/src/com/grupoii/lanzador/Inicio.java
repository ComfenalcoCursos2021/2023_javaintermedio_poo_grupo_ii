package com.grupoii.lanzador;

import com.grupoii.recursos.Bombillo;
import com.grupoii.recursos.BombilloHomecenter;
import com.grupoii.recursos.BombilloLuminex;
import com.grupoii.recursos.Cuadrado;
import com.grupoii.recursos.FiguraGeometrica;

public class Inicio {

	public static void main(String[] args) {
		
		BombilloHomecenter miCuarto = new BombilloHomecenter();
		//BombilloLuminex sala = new BombilloLuminex();
		
		//Bombillo miCuarto = new Bombillo("Dairu", 10000);
		Bombillo sala = new Bombillo("Luminex", 20000);
		System.out.println(miCuarto.getMarca());
		
		System.out.println(sala.getMarca());
		
		
		System.out.println("------------------------------");
		FiguraGeometrica cuadrado = new FiguraGeometrica(4);
		
		
		FiguraGeometrica cuadradoZonaAnotacion = new FiguraGeometrica(4);
		
		Cuadrado zonaAnotacion = new Cuadrado();
		
		System.out.println(cuadradoZonaAnotacion.getNumeroLados());
		System.out.println(zonaAnotacion.getNumeroLados());
		
		
		FiguraGeometrica triangulo = new FiguraGeometrica(3);
		FiguraGeometrica pentagono = new FiguraGeometrica(5);
		
		
		

	}

}
