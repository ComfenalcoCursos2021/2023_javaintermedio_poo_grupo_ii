package confenalco.aritmetica;

public class Suma {

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
}
