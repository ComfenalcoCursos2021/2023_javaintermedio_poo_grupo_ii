package com.grupoii.lanzador;

import com.grupoii.recursos.UsuarioSistema;

public class Inicio {

	public static void main(String[] args) {
		
		UsuarioSistema a = new UsuarioSistema();
		a=null;
		
		try {
			int aN = Integer.parseInt("156");
					
			a.setContrasenia("123456");
			System.out.println("la contraseña de a es:: "+ a.getContrasenia());	
		} catch (NullPointerException e) {
			System.out.println("FALLO por nulo");
			e.printStackTrace();
		} catch(NumberFormatException e) {
			System.out.println("FALLO por numero");
			e.printStackTrace();
		}
		
		System.out.println("Termino");

	}

}
