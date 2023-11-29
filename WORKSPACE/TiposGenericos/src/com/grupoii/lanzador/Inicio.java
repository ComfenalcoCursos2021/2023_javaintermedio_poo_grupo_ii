package com.grupoii.lanzador;

import java.util.ArrayList;
import java.util.List;

import com.grupoii.aves.Golondrina;
import com.grupoii.aves.Pinguino;
import com.grupoii.genericos.Almacenador;

public class Inicio {

	public static void main(String[] args) {
		
		Almacenador<Golondrina> almacenGolondrinas = new Almacenador<Golondrina>();
		Almacenador<Pinguino> almacenPinguinos = new Almacenador<Pinguino>();
		
		Golondrina g = new Golondrina();
		Pinguino p = new Pinguino();
		almacenGolondrinas.almacenar(g);
		
		List<Golondrina> lista = new ArrayList<Golondrina>();
		
		lista.add(g);
		
		List<Pinguino> listaP = new ArrayList<Pinguino>();
		listaP.add(p);
		Pinguino p1 = new Pinguino();
		listaP.add(p1);
		
	}

}
