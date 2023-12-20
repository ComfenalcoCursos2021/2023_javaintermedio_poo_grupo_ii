package com.grupo.ii.recursos.matematicos;

public class OperacionesMatematicas {

	public double factorialClasico(int n) {
		double factorial = 1;
		for(int i = 2 ; i<=n;i++) {
			factorial = factorial * i;			
		}
		return factorial;
	}
	
	public double factorialRecursivo(int n) {
		if(n == 0 ) {
			return 1;
		} else {
			return n * factorialRecursivo(n-1);
		}
		
	}
}
