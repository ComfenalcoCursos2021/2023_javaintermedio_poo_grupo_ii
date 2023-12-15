package com.grupoii.matematicos;

public class Collatz {

	
	
	public void imprimirSecuencia(int n) {
	
		System.out.println("================================");
		while(n!=1) {
			System.out.println(n);
			if(n%2 == 0) {
				n=n/2;
			} else {
				n= (3*n) + 1;
			}
		}
		System.out.println(n);
		System.out.println("================================");
		
	}
}
