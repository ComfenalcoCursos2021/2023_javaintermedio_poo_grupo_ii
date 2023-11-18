package alv.com.grupoii.almacenadores;

public class Acumulador {

	
	private int contador = 0;

	public Acumulador() {
		this.contador = 99;
	}
	
	public Acumulador(int numeroInicialEmpleados) {
		this.contador = numeroInicialEmpleados;
	}
	
	public Acumulador(String numeroInicialEmpleadosCandenaTexto) {
		this.contador = Integer.parseInt(numeroInicialEmpleadosCandenaTexto);
	}
	
	
	public Acumulador(String a, int b) {
		this.contador = 77;
	}
	public Acumulador(int a, String b) {
		this.contador = 99;
	}
	
	public Acumulador(int equiposTrabajo,int cantidadIntegrantes) {
		this.contador = equiposTrabajo * cantidadIntegrantes;
	}
	
	
		
	public int getContador() {
		return this.contador;
	}	
	
	/**
	 * Esta funcion incrementa en uno la variable destinada a llevar el conteo
	 */
	public void acumular() {
		this.contador = this.contador + 1;		
		
	}

	/*
	public void acumular(int numeroAcumular) {
		this.contador = this.contador + numeroAcumular;		
		
	}*/
	
	
	/*
	 * public int getContador() { return this.contador; } public void
	 * setContador(int value) { this.contador = value; }
	 */



	public void imprimirContador() {
		System.out.println(this.contador);
	}

}
