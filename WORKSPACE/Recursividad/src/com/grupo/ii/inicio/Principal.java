package com.grupo.ii.inicio;

import com.grupo.ii.recursos.matematicos.OperacionesMatematicas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacionesMatematicas op = new OperacionesMatematicas();
		
		System.out.println(op.factorialClasico(150));
		
		System.out.println(op.factorialRecursivo(150));
	}

}
