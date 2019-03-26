package br.com.bd1start.aula2;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula2.ExercicioDeString;

public class ExercicioDeStringTeste {

	// Exercicio String 1
	@Test
	public void deveRetornarToUppercase() {
		ExercicioDeString exercicio = new ExercicioDeString();
		String resultado = exercicio.devolverUppercase("Algoritmos");
		Assert.assertEquals("ALGORITMOS", resultado);
	}

	// Exercicio String 2
	@Test
	public void deveRetornaToLowercase() {
		ExercicioDeString exercicio = new ExercicioDeString();
		String resultado = exercicio.devolverLowercase("ALGORITMOS");
		Assert.assertEquals("algoritmos", resultado);
	}

	// Exercicio String 3
	@Test
	public void deveRetornarQtDeLetras() {
		ExercicioDeString exercicio = new ExercicioDeString();
		int resultado = exercicio.contarCaracteres("DB1START");
		Assert.assertEquals(8, resultado);
	}

	// Exercicio String 4
	@Test
	public void deveRetornarQtDeCaracteres2() {
		ExercicioDeString exercicio = new ExercicioDeString();
		int resultado = exercicio.contarCaracteres(" DB1START ");
		Assert.assertEquals(10, resultado);
	}

	// Exercicio String 5
	@Test
	public void contarSemEspaco() {
		ExercicioDeString exercicio = new ExercicioDeString();
		int resultado = exercicio.contarLetrasSemEspacos(" DB1START ");
		Assert.assertEquals(8, resultado);
	}

	// Exercicio String 6
	@Test
	public void letrasNome() {
		ExercicioDeString exercicio = new ExercicioDeString();
		String texto = exercicio.textoCortado("Lana Ananias Tormena");
		Assert.assertEquals("Lana", texto);
	}

	// Exercicio String 7
	@Test
	public void letrasNomeTerceiraEmDiante() {
		ExercicioDeString exercicio = new ExercicioDeString();
		String texto = exercicio.textoCortado2("Lana Ananias Tormena");
		Assert.assertEquals("na Ananias Tormena", texto);
	}

	// Exercicio String 8
	@Test
	public void letrasNome4Ultimas() {
		ExercicioDeString exercicio = new ExercicioDeString();
		String texto = exercicio.textoCortado3("Lana Ananias Tormena");
		Assert.assertEquals("mena", texto);
	}

	// Exercicio String 9
	@Test
	public void substituirPrimeiroNomePorALUNA() {
		ExercicioDeString exercicio = new ExercicioDeString();
		String texto = exercicio.substituirPrimeiroNome("Lana Ananias Tormena");
		Assert.assertEquals("ALUNA Ananias Tormena", texto);
	}

	// Exercicio String 10
	@Test
	public void stringOrdenada() {
		
		ExercicioDeString exercicio = new ExercicioDeString();
		String[] texto = exercicio.StringOrdenada("banana,maçã,melancia");
		Assert.assertArrayEquals(new String [] {"banana", "maçã", "melancia"}, texto);
	}

	// Exercicio String 11
	@Test
	public void qtdeVogais() {
		ExercicioDeString exercicio = new ExercicioDeString();
		int resultado = exercicio.contarVogais("Comunidade");
		Assert.assertEquals(5, resultado);
	}

	// Exercicio String 12
	@Test
	public void inversorDeString() {
		ExercicioDeString exercicio = new ExercicioDeString();
		String texto = exercicio.stringInvertida("texto");
		Assert.assertEquals("otxet", texto);
	}
}
