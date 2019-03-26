package br.com.bd1start.aula2;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula2.Calculadora;

public class CalculadoraTeste {

	//Exercicio 1
	@Test
	public void deveRetornarSoma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(5, 10);
		Assert.assertEquals(15, resultado);
	}

	//Exercicio 2
	@Test
	public void deveRetornarSub() {
		Calculadora calc = new Calculadora();
		int resultado = calc.sub(20, 5);
		Assert.assertEquals(15, resultado);
	}

	//Exercicio 3
	@Test
	public void deveRetornarMult() {
		Calculadora calc = new Calculadora();
		int resultado = calc.mult(4, 5);
		Assert.assertEquals(20, resultado);
	}

	//Exercicio 4
	@Test
	public void deveRetornarDiv() {
		Calculadora calc = new Calculadora();
		int resultado = calc.div(100, 2);
		Assert.assertEquals(50, resultado);
	}

	//Exercicio 5
	@Test
	public void deveRetornarPar() {
		Calculadora calc = new Calculadora();
		boolean resultado = calc.parImpar(4);
		Assert.assertEquals(true, resultado);
	}

	//Exercicio 6
	@Test
	public void deveRetornarNumero1MaiorQueNumero2() {
		Calculadora calc = new Calculadora();
		int resultado = calc.comparar(50, 30);
		Assert.assertEquals(50, resultado);
	}

	//Exercicio 7
	@Test
	public void deveRetornarQtdeImparAte100() {
		Calculadora calc = new Calculadora();
		int resultado = calc.imparAte100(90);
		Assert.assertEquals(5, resultado);
	}

}
