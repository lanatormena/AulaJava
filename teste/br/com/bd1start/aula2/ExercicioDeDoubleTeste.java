package br.com.bd1start.aula2;

import org.junit.Assert;
import org.junit.Test;
import br.com.db1start.aula2.ExercicioDeDouble;

public class ExercicioDeDoubleTeste {

	ExercicioDeDouble exercicio = new ExercicioDeDouble();

	// Exercicio 1
	@Test
	public void deveRetornarMenorEntre2() {
		double resultado = exercicio.compararMenorEmDois(5.0, 2.5);
		Assert.assertEquals(2.5, resultado, 0.001);
	}

	// Exercicio 2
	@Test
	public void deveRetornarMenorEntre3() {
		double resultado = exercicio.compararMenorEmTres(5.0, 2.5, 1.025);
		Assert.assertEquals(1.025, resultado, 0.001);
	}

	// Exercicio 3
	@Test
	public void deveRetornarMediaEntre3() {
		double resultado = exercicio.mediaDeTresDouble(10.0, 15.0, 20.0);
		Assert.assertEquals(15.0, resultado, 0.001);
	}

	// Exercicio 4
	@Test
	public void deveRetornarAreaTrianguloEquilatero() {
		double resultado = exercicio.areaTrianguloEquilatero(15.2, 27.3);
		Assert.assertEquals(207.48, resultado, 0.001);
	}
}
