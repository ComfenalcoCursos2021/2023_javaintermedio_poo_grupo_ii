package alv.grupoii.lanzador;

import alv.grupoii.interfaces.IConexion;
import alv.grupoii.recursos.ConexionMySQL;
import alv.grupoii.recursos.ConexionSQLServer;

public class Inicio {

	public static void main(String[] args) {
		ConexionMySQL nuevo = new ConexionMySQL();
		IConexion cualquiera = new ConexionMySQL();
		IConexion cualquiera2 = new ConexionSQLServer();

		nuevo.conectar();
		nuevo.limpiar();
		cualquiera.conectar();
		cualquiera.limpiar();
		cualquiera2.conectar();

	}

}
