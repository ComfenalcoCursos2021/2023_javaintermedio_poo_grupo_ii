package confenalco.aritmetica;

public class Suma {
	
	/**
	 * Esta funcion suma dos numeros y retorna la respuesta
	 * @param n1 El primer numero a sumar
	 * @param n2 El segundo numero a sumar
	 * @return el resultado de la suma
	 */
	public int sumaDosNumeros(int n1, int n2) {

		int rta;
		rta = n1 + n2;
		return rta;

	}

	public int sumaNnumerosNaturales(int n) {
		int rta = 0;
		
		for (int i = 1; i <= n; i++) {
			rta = rta + i;
		}
		return rta;
	}
	
	public void tiposDatos() {
		System.out.println("***************************************");
		
		System.out.println("BYTE -- byte");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println("Short - short");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		
		System.out.println("INT");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("LONG  --  long");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println("FLOAT  --  float");
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println("DOUBLE  --  fouble");
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		
		System.out.println("***************************************");
	}
}
