package com.grupoii.matematicos;

import java.io.Serializable;

public class Collatz implements Serializable {

	/**
	 * 
	 */
	//private static final long serialVersionUID = -5430668992263480538L;
	//private static final long serialVersionUID = -5430668992263480538L;
	public int nuevo(int m) {
		int suma = 0;
		for (int i = 0; i < m; i++) {
			suma = suma +i;
		}
		return suma;
	}
	public void imprimirSecuencia(int n) {
	
		System.out.println("================================");
		System.out.println("asdfadfadsf");
		while(n!=1) {
			System.out.println(n);
			if(n%2 == 0) {
				n=n/2;
				n=(n*2)/2;
			} else {
				n= (3*n) + 1;
			}
		}
		System.out.println(n);
		System.out.println("================================");
		
	}
	
	public String obtenerSecuencia(int n) {
		
		
		StringBuilder cons = new StringBuilder();
		
		while(n!=1) {			
			cons.append(n + " ");
			if(n%2 == 0) {
				n=n/2;
			} else {
				n= (3*n) + 1;
			}
		}
		cons.append(n + " ");
		return cons.toString();
		
	}
	
	public void imprimirTablas(int valor, int hastaDonde) throws Exception {
		
		if(valor < 1) {
			throw new Exception("Fallo");
		}
		if(hastaDonde < 1) {
			throw new Exception("Fallo");
		}
		for(int i = 1; i<=hastaDonde; i++) {
			System.out.println(valor + " x " + i + " = " + (valor*i));			
		}
		
	}
	public void imprimirTablaHasta10(int valor) throws Exception {
		this.validacion(valor);
		this.cicloParaImprimirTabla(valor, 1, valor, 10);
	}
	
	public void imprimirTablasV2(int valor, int hastaDonde) throws Exception {
		
		this.validacion(valor);
		this.validacion(hastaDonde);
		this.cicloParaImprimirTabla(valor, 1, valor, hastaDonde);
		
	}
	private void validacion(int valor) throws Exception {
		if(valor < 1) {
			throw new Exception("Fallo");
		}
	}
	private void cicloParaImprimirTabla(int valor, int inicio,int fin,int incremento) {
		for(int i = inicio; i<=fin; i=i+incremento) {
			print(valor + "x" + i + " = " + (valor*i));			
		}
	}
	private void print(String cadena) {
		System.out.println(cadena);
	}
	
	
}
