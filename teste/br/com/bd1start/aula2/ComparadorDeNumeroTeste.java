package br.com.bd1start.aula2;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula2.ComparadorDeNumeros;

public class ComparadorDeNumeroTeste {
	@Test
	public void deveRetornarNumero1MenorQueNumero2() {
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		double resultado = comparador.comparar(1, 2);
		Assert.assertEquals(1, resultado, 0);
	}

	@Test

	public void deveRetornarNumero2MenorQueNumero1() {
		ComparadorDeNumeros comparador = new ComparadorDeNumeros();
		double resultado = comparador.comparar(30, 20);
		Assert.assertEquals(20, resultado, 0);
	}
}