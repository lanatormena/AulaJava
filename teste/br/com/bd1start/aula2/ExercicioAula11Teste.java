package br.com.bd1start.aula2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula2.ExercicioAula11;

public class ExercicioAula11Teste {
	// Exercicio 1
	@Test
	public void deveRetornarListaDeNomes() {

		ExercicioAula11 exercicioaula11 = new ExercicioAula11();

		List<String> cores = exercicioaula11.cores();

		Assert.assertEquals("Preto", cores.get(0));
		Assert.assertEquals("Verde", cores.get(1));
	}

	// Exercicio 2
	@Test
	public void deveRetornarQuantidadeDeItens() {

		ExercicioAula11 aula11 = new ExercicioAula11();

		int tamanho = aula11.item(aula11.cores());

		Assert.assertEquals(2, tamanho);

	}

	// Exercicio 3
	@Test
	public void deveRemoverItem2() {
		ExercicioAula11 aula11 = new ExercicioAula11();
		List<String> nomes = aula11.addRemoveNomes("Lana", "Ana", "Allana");
		Assert.assertEquals("Lana", nomes.get(0));
		Assert.assertEquals("Allana", nomes.get(1));
	}

	// Exercicio 5
	@Test
	public void deveRetornarListaCoresOrdenada() {
		ExercicioAula11 exercicioaula11 = new ExercicioAula11();
		List<String> cores = exercicioaula11.coresOrdenadas("Preto", "Verde", "Azul");

		Assert.assertEquals("Azul", cores.get(0));
		Assert.assertEquals("Preto", cores.get(1));
		Assert.assertEquals("Verde", cores.get(2));
	}

	// Exercicio 6 - conferir hihihi
	@Test
	public void removerCor() {
		ExercicioAula11 exercicioAula11 = new ExercicioAula11();
		List<String> cores = exercicioAula11.coresOrdenadas("Preto", "Verde", "Azul");
		exercicioAula11.removerCor(cores, "Azul");
		Assert.assertEquals("Preto", cores.get(0));
		Assert.assertEquals("Verde", cores.get(1));

	}

	// Exercicio 7
	@Test
	public void listaInvertida() {
		ExercicioAula11 exercicioAula11 = new ExercicioAula11();
		List<String> listaLetras = new ArrayList<>();
		listaLetras.add("E");
		listaLetras.add("B");
		listaLetras.add("C");
		listaLetras.add("D");
		listaLetras.add("A");
		exercicioAula11.ordenarDecrescente(listaLetras);
		Assert.assertEquals("E", listaLetras.get(0));
		Assert.assertEquals("D", listaLetras.get(1));
		Assert.assertEquals("C", listaLetras.get(2));
		Assert.assertEquals("B", listaLetras.get(3));
		Assert.assertEquals("A", listaLetras.get(4));
	}

	// Exercicio 9
	@Test
	public void listaOrdenada() {
		ExercicioAula11 exercicioAula11 = new ExercicioAula11();
		List<String> listaNomes = new ArrayList<>();
		listaNomes.add("JOSÉ");
		listaNomes.add("MARIA");
		listaNomes.add("MARCOS");
		listaNomes.add("RODOLFO");
		listaNomes.add("ROBERVAL");
		listaNomes.add("RODOLPHO");
		listaNomes.add("VAGNER");
		listaNomes.add("JOSÉ");
		listaNomes.add("ANA");
		listaNomes.add("ANA LAURA");
		listaNomes.add("JOSE");
		listaNomes.add("WAGNER");
		listaNomes.add("JOALDO");
		listaNomes.add("CLECIO");

		exercicioAula11.listaOrdenada(listaNomes);
		Assert.assertEquals("ANA", listaNomes.get(0));
		Assert.assertEquals("ANA LAURA", listaNomes.get(1));
		Assert.assertEquals("CLECIO", listaNomes.get(2));
		Assert.assertEquals("JOALDO", listaNomes.get(3));
		Assert.assertEquals("JOSE", listaNomes.get(4));
		Assert.assertEquals("JOSÉ", listaNomes.get(5));
		Assert.assertEquals("JOSÉ", listaNomes.get(6));
		Assert.assertEquals("MARCOS", listaNomes.get(7));
		Assert.assertEquals("MARIA", listaNomes.get(8));
		Assert.assertEquals("ROBERVAL", listaNomes.get(9));
		Assert.assertEquals("RODOLFO", listaNomes.get(10));
		Assert.assertEquals("RODOLPHO", listaNomes.get(11));
		Assert.assertEquals("VAGNER", listaNomes.get(12));
		Assert.assertEquals("WAGNER", listaNomes.get(13));
	}

	// Exercicio 10
	@Test
	public void somaValorDaLista() {
		ExercicioAula11 exercicioAula11 = new ExercicioAula11();
		List<Integer> listaNumero = new ArrayList<>();
		listaNumero.add(10);
		listaNumero.add(20);
		listaNumero.add(30);
		int resultado = exercicioAula11.totalDaLista(listaNumero);
		Assert.assertEquals(60, resultado);
	}

	// Exercicio 11
	@Test
	public void mediaValorDaLista() {
		ExercicioAula11 exercicioAula11 = new ExercicioAula11();
		List<Double> listaNumero = new ArrayList<>();
		listaNumero.add(7.0);
		listaNumero.add(5.0);
		listaNumero.add(6.0);
		double resultado = exercicioAula11.mediaDaLista(listaNumero);
		Assert.assertEquals(6, resultado, 0.001);
	}

	// Exercicio 12
	@Test
	public void menorValorDaLista() {
		ExercicioAula11 exercicioAula11 = new ExercicioAula11();
		List<Integer> listaNumero = new ArrayList<>();
		listaNumero.add(20);
		listaNumero.add(100);
		listaNumero.add(10);
		int resultado = exercicioAula11.menorValorDaLista(listaNumero);
		Assert.assertEquals(10, resultado);
	}

	// Exercicio 13
	@Test
	public void maiorValorDaLista() {
		ExercicioAula11 exercicioAula11 = new ExercicioAula11();
		List<Integer> listaNumero = new ArrayList<>();
		listaNumero.add(20);
		listaNumero.add(100);
		listaNumero.add(1000);
		int resultado = exercicioAula11.maiorValorDaLista(listaNumero);
		Assert.assertEquals(1000, resultado);
	}

	// Exercicio 14
	@Test
	public void retornaApenasPares() {
		ExercicioAula11 exercicioAula11 = new ExercicioAula11();
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(5);
		listaNumeros.add(6);
		exercicioAula11.retornaListaPar(listaNumeros);
		Assert.assertEquals(Integer.valueOf(2), listaNumeros.get(0));
		Assert.assertEquals(Integer.valueOf(4), listaNumeros.get(1));
		Assert.assertEquals(Integer.valueOf(6), listaNumeros.get(2));
	}
}
