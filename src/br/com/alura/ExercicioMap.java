package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExercicioMap {

	public static void main(String[] args) {

//		Map<Integer, String> pessoas = new HashMap<>();
//
//		pessoas.put(21, "Leonardo Cordeiro");
//		pessoas.put(27, "Fabio Pimentel");
//		pessoas.put(19, "Silvio Mattos");
//		pessoas.put(23, "Romulo Henrique");
//
//		pessoas.keySet().forEach(idade -> {
//			System.out.println(pessoas.get(idade));
//		});

		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);

		nomesParaIdade.keySet().forEach(idade -> {
			System.out.println("O nome " + idade);
		});

		nomesParaIdade.values().forEach(nome -> {
			System.out.println("A idade é " + nome);
		});
		
		
		//aqui devolve o nome 
		//o método keySet me permite acessar a chave do elmento
		Set<String> chaves = nomesParaIdade.keySet();
		for (String nome : chaves) {
			System.out.println(nome);
		}

		
		
		//aqui devolve a idade
		//o método value me permite acessar o valor do elmento
		Collection<Integer> nomes = nomesParaIdade.values();
		for (Integer idade : nomes) {
			System.out.println(idade);
		}
		
		//aqui evolve a associação entre chave e valor
		// o método entrySet devolve um Set de Entry
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();    
		for (Entry<String, Integer> associacao : associacoes) {
		    System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
	}

}
