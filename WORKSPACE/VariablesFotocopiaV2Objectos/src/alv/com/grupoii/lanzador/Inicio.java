package alv.com.grupoii.lanzador;

import alv.com.grupoii.almacenadores.Acumulador;

public class Inicio {

	public static void main(String[] args) {

		Acumulador X = new Acumulador();// Instanciar una clase/objeto
		Acumulador Y = new Acumulador();
		Acumulador Z;

		// X.contador = 99;
		X.setContador(99);

		X.imprimirContador();

		/*
		X.contador = X.contador + 1;
		
		X.contador = X.getContador() + 1;
		
		X.setContador(X.getContador() + 1);
		*/
		
		//X.setContador(X.getContador() + 1);// 
		X.acumular();

		X.setContador(X.getContador() + 1);// X.acumular();
		
		X.imprimirContador();

		System.out.println("Termino!!!");
	}

}
