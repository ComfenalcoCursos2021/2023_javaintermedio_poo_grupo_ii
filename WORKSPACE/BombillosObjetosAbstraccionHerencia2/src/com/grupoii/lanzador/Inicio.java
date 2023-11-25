package com.grupoii.lanzador;

import com.grupoii.recursos.UsuarioSistema;

public class Inicio {

	public static void main(String[] args) {
		
		UsuarioSistema a = new UsuarioSistema();
		
		a.setContrasenia("123456");
		System.out.println("la contraseña de a es:: "+ a.getContrasenia());
		System.out.println("Termino");

	}

}
