package alv.com.grupoii.lanzador;

import java.util.Scanner;

import alv.com.grupoii.almacenadores.Acumulador;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el numero de empleados del dia de hoy");
		
		int numEmpleados = teclado.nextInt();
		
		Acumulador X = new Acumulador(numEmpleados);// Instanciar una clase/objeto
		

		// X.contador = 99;
		//X.setContador(99);

		X.imprimirContador();

		/*
		X.contador = X.contador + 1;
		
		X.contador = X.getContador() + 1;
		
		X.setContador(X.getContador() + 1);
		*/
		
		//X.setContador(X.getContador() + 1);// 
		//X.acumular();

		//X.setContador(X.getContador() + 3);// 
		X.acumular();		
		
		X.imprimirContador();

		System.out.println("Termino!!!");
	}

}
