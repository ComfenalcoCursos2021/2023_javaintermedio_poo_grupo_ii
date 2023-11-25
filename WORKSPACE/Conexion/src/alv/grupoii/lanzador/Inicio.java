package alv.grupoii.lanzador;

import alv.grupoii.fabrica.FabricaConexiones;
import alv.grupoii.interfaces.IConexion;

public class Inicio {

	public static void main(String[] args) {
		FabricaConexiones fCon = new FabricaConexiones();
		
		IConexion cualquiera = fCon.crearConexion(0);
		
		
		cualquiera.conectar();
		cualquiera.conectar();cualquiera.conectar();
		cualquiera.conectar();
		cualquiera.conectar();
		cualquiera.conectar();
		cualquiera.conectar();
		cualquiera.conectar();
		cualquiera.conectar();
		cualquiera.conectar();
		cualquiera.conectar();
		cualquiera.conectar();
		
		cualquiera.conectar();

	}

}
