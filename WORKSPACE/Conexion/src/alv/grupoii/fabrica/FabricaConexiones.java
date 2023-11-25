package alv.grupoii.fabrica;

import alv.grupoii.interfaces.IConexion;
import alv.grupoii.recursos.ConexionMySQL;
import alv.grupoii.recursos.ConexionSQLServer;

public class FabricaConexiones {

	public IConexion crearConexion(int i) {
		if(i==0) {
			return new ConexionSQLServer();
		}
		if(i==1) {
			return new ConexionMySQL();
		}
		
		return new ConexionMySQL();
	}
}
