package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAluno {

	public static void main(String[] args) {
		
		//É um conjunto (uma coleção) que devolve naturalmente os elementos em uma ordem aleatória
		//por conta disso não possui o método get para bus car um elemento pelo ID
		// não aceita redundancia mesma se você der o comanda para adicionar
		//para acessar os elementos utilizar u forEach ou o metodo foreach
		
		//Poderia utiliza ao invés de Set o nome da Interface mãe Colection. Dessa forma indepentende do tipo de coleção que eu usar vai funcior, pois todas são filhas de Colection e a implementam 
		//exceto qando é preciso buscar um elemento pelo índice, pois assim como o Set, a Collection não o método get e para isso precisaria usar uma List
	
		Collection <String> alunos = new HashSet<>();
		
		//Set<String> alunos = new HashSet<>();
		alunos.add("Rodirgo Turini");
		alunos.add("alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Jacqueline");
		alunos.add("Felipe");
		alunos.add("Bruno");
		alunos.add("Aline");
		alunos.add("Willian");
		alunos.add("Gabriel");
		
		//imprimindo com forEach
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		
		// toda coleção possui o método contins que verifica se já existe o elemento na coleção, mas no Set ele já faz automáticamente
		//métos como o conteains e remove são executados muito mais rapidamente, pois está utilizando um HashSet (tabela de espalhamento)
		
		//imprimindo usando o método foreach
		//alunos.forEach(aluno -> {System.out.println(aluno);});
		
		System.out.println("O tamnho da Coleção é  de " + alunos.size() + " elementos");
		
	}
	
	
	

}
