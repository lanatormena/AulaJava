package br.com.db1start.aula2;

public class ExercicioDeDouble {

	public double compararMenorEmDois(double numero1, double numero2) {
		if (numero1 < numero2) {
			return numero1;
		}
		return numero2;
	}

	public double compararMenorEmTres(double numero1, double numero2, double numero3) {
		double menor = 0.0;
		if (numero1 < numero2) {
			menor = numero1;
		} else {
			menor = numero2;
		}
		if (numero3 < menor) {
			menor = numero3;
		}
		return menor;
	}

	public double mediaDeTresDouble(double num1, double num2, double num3) {
		double media = ((num1 + num2 + num3) / 3);
		return media;
	}

	public double areaTrianguloEquilatero(double base, double altura) {
		double area = 0.0;
		area = ((base * altura) / 2);

		return area;
	}
}
