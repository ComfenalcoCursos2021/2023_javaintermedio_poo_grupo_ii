package alv.com.grupoii.almacenadores;

public class Acumulador {

	private int contador = 4;

	public int getContador() {
		return this.contador;
	}

	public void setContador(int valor) {
		this.contador = valor;
	}
	/**
	 * Esta funcion incrementa en uno la variable destinada a llevar el conteo
	 */
	public void acumular() {
		this.contador = this.contador + 1;		
	}

	/*
	 * public int getContador() { return this.contador; } public void
	 * setContador(int value) { this.contador = value; }
	 */

	public void imprimirMensaje() {
		int contadorMetodo = 8;

		contadorMetodo = contadorMetodo + this.contador;

		System.out.println("Soy acumulador DEL METODO  " + contadorMetodo);
		System.out.println("Soy acumulador DE LA CLASE " + this.contador);
	}

	public void imprimirContador() {
		System.out.println(this.contador);
	}

}
