package alv.grupoii.recursos;

import alv.grupoii.interfaces.IConexion;

public class ConexionMySQL implements IConexion {

	public void conectar() {
		System.out.println("Conectando desde Mysql");
		
	}
	
	public void limpiar() {
		System.out.println("Limpiando desde Mysql");
	}

	

}
