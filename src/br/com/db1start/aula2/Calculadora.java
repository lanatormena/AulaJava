package br.com.db1start.aula2;

public class Calculadora {
	public int somar(int numero1, int numero2) {

		return numero1 + numero2;
	}

	public int sub(int numero1, int numero2) {

		return numero1 - numero2;
	}

	public int mult(int numero1, int numero2) {

		return numero1 * numero2;
	}

	public int div(int numero1, int numero2) {

		return numero1 / numero2;
	}

	public boolean parImpar(int numero) {
		if (numero % 2 == 0) {
			return true;
		}

		else {

			return false;
		}

	}

	public int comparar(int numero1, int numero2) {
		if (numero1 > numero2) {
			return numero1;
		}

		return numero2;
	}

	public int imparAte100(int numero1) {
		int contador = 0;
		for (int i = numero1+1; i < 100; i++) {
			if (!parImpar(i)) {
				contador = contador+1;
			}
		}
		return contador;
	}

}
