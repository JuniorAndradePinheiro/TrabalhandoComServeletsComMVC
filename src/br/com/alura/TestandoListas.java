package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a Classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		// uma forma de ercorrer a lista com foreach
		for (String aula : aulas) {

			System.out.println("Aula: " + aula);

		}

		String primeiraAula = aulas.get(0);

		System.out.println("A primeira aula é " + primeiraAula);

		// outra forma de percorrer a lista
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		
		
		//percorrendo a lista pelo método foreach onde cada elemento da lista chamamos de aula e definimos uma ação utilizando -> e pode ser escrito tudo na mesma linha
		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula: " + aula);
		});
		
		aulas.add("Aumento o conhecimento");
		System.out.println("Antes de ordenar");
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println("Aepois de ordenar");
		System.out.println(aulas);
	}
}
