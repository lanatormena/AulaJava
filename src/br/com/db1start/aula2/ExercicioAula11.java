package br.com.db1start.aula2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioAula11 {
	public List<String> cores() {
		List<String> cores = new ArrayList<>();
		cores.add("Preto");
		cores.add("Verde");
		return cores;
	}

	// Exercicio 2
	public int item(List<String> cores) {
		return cores.size();

	}

	// Exercicio 3
	public List<String> addRemoveNomes(String nome1, String nome2, String nome3) {
		List<String> nomes = new ArrayList<>();
		nomes.add(nome1);
		nomes.add(nome2);
		nomes.add(nome3);

		nomes.remove(1);

		return nomes;
	}

	// Exercicio 4
	public List<String> coresOrdenadas(String cor1, String cor2, String cor3) {
		List<String> cores = new ArrayList<>();
		cores.add(cor1);
		cores.add(cor2);
		cores.add(cor3);

		Collections.sort(cores);
		return cores;

	}

	// Exercicio 5
	public List<String> removerCor(List<String> cores, String remover) {
		for (int i = 0; i < cores.size(); i++) {
			if (cores.get(i) == remover)
				cores.remove(i);
		}
		
		return cores;
	}

	// Exercicio 6
	public List<String> ordenarDecrescente(List<String> lista) {
		Collections.sort(lista);
		Collections.reverse(lista);
		return lista;
	}
	
	//Exercicio 7
	
	public List<List<Integer>> retonarListaDeListaParImpar(List<Integer> numeros) {
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		
		
		for (int i = 0; i < numeros.size(); i++) {
			int value = numeros.get(i);
			if (value % 2 == 0) {
				pares.add(value);
			}else {
				impares.add(value);
			}
		}
		
		List<List<Integer>> resultado = new ArrayList<List<Integer>>();
		resultado.add(pares);
		resultado.add(impares);
		return resultado;
	}
	
	// Exercicio 8
	public List<String> listaOrdenada(List<String> lista) {
		Collections.sort(lista);
		return lista;
	}

	// Exercicio 9
	public int totalDaLista(List<Integer> lista) {
		int total = 0;
		for (int i = 0; i < lista.size(); i++) {
			total = lista.get(i) + total;
		}
		return total;
	}

	// Exercicio 10
	public double mediaDaLista(List<Double> lista) {
		double total = 0.0;
		for (int i = 0; i < lista.size(); i++) {
			total = lista.get(i) + total;
		}
		total = (total / lista.size());
		return total;
	}

	// Exercicio 11
	public int menorValorDaLista(List<Integer> lista) {
		int menor = lista.get(0);
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < menor) {
				menor = lista.get(i);
			}
		}
		return menor;
	}

	// Exercicio 12
	public int maiorValorDaLista(List<Integer> lista) {
		int maior = lista.get(0);
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > maior) {
				maior = lista.get(i);
			}
		}
		return maior;
	}

	// Exercicio 13
	public List<Integer> retornaListaPar(List<Integer> lista) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 2 != 0) {
				lista.remove(i);
			}
		}
		return lista;
	}
	// Exercicio 14
	public List<List<Character>> retornaLetras(String frase) {
		frase = frase.toLowerCase();
		List<Character> vogais = new ArrayList<>();
		List<Character> outrosCharacteres = new ArrayList<>();

		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vogais.add(c);
			} else {
				outrosCharacteres.add(c);
			}
		}

		List<List<Character>> resultado = new ArrayList<>();
		resultado.add(vogais);
		resultado.add(outrosCharacteres);
		return resultado;
	}
}
