package alv.com.grupoii.lanzador;

import alv.com.grupoii.almacenadores.Acumulador;

public class Inicio {

	public static void main(String[] args) {

		Acumulador X = new Acumulador();//Instanciar una clase/objeto
		Acumulador Y = new Acumulador();
		Acumulador Z;
		
		//X.contador = 99;
		X.setContador(99);
		
		X.imprimirContador();	
		Y.imprimirContador();
		
		Z = X;
		X = Y;		
		int a = 5;
		X.imprimirContador();
		System.out.println("==========================");
		//Y.contador = 500;
		Y.setContador(500);
		X.imprimirContador();
		
		System.out.println("el valor para Z");
		Z.imprimirContador();
		
		System.out.println("Termino!!!");
	}

}
