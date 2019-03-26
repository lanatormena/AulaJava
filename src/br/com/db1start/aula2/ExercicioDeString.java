package br.com.db1start.aula2;

public class ExercicioDeString {
	
	public String devolverUppercase(String texto) {
		return texto.toUpperCase();
	}
	
	public String devolverLowercase(String texto) {
		return texto.toLowerCase();
	}
	
	public int contarCaracteres(String texto) {
		return texto.length();
	}
	
	public int contarLetrasSemEspacos(String texto) {
		int qtdeLetras = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == ' ') {
			} else {
				qtdeLetras = qtdeLetras + 1;
			}
		}
		return qtdeLetras;
	}
	
	public String textoCortado(String texto) {
		String textoCortado;
		textoCortado = texto.substring(0, 4);
		return textoCortado;
	}
	
	public String textoCortado2(String texto) {
		String textoCortado;
		textoCortado = texto.substring(2, texto.length());
		return textoCortado;
	}

	public String textoCortado3(String texto) {
		String textoCortado;
		textoCortado = texto.substring(texto.length() - 4, texto.length());
		return textoCortado;
	}
	
	public String substituirPrimeiroNome(String texto) {
		String nomeAluna;
		nomeAluna = texto.substring(texto.indexOf(' '), texto.length());
		return "ALUNA" + nomeAluna;
	}
	
	
	public String[] StringOrdenada(String texto) {
		return texto.split(",");
			
		
	}
	
	public int contarVogais(String texto) {
		texto = texto.toLowerCase();
		int qtdeVogais = 0;
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				qtdeVogais++;
			}
		}
		return qtdeVogais;
	}
	
	public String stringInvertida(String texto) {
		String invertida = "";
		for (int i = texto.length()-1; i >= 0; i--) {
		    invertida += texto.charAt(i);
		}
		return invertida;
	}

}