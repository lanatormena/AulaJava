package br.com.bd1start.aula2;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.aula2.Aula11;

public class Aula11Test {
	
	@Test
	public void deveRetornarListaDeNomes() {
		
		Aula11 aula11 = new Aula11();
		
		List<String> nomes = aula11.nomes();
		
		Assert.assertEquals("Maiko", nomes.get(0));
		Assert.assertEquals("João", nomes.get(1));
	}

}