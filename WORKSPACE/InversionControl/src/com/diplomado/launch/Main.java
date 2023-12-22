package com.diplomado.launch;

import com.diplomado.entidades.Arma;
import com.diplomado.inversion.YoControlo;

public class Main {

	public static void main(String[] args) {
		YoControlo IV = new YoControlo();
		
		Arma arma = new Arma();
		
		IV.controlando(arma);
		
		System.out.println("Termino");

	}

}
