package alv.grupoii.recursos;

import alv.grupoii.interfaces.IConexion;

public class ConexionSQLServer implements IConexion {

	public void conectar() {
		System.out.println("Conectando desde SQLServer");
		
	}

	public void limpiar() {
		System.out.println("Limpiando desde SQLServer");
		
	}

}
