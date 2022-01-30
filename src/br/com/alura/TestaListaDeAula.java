package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisitando as ArryLists", 21);
		Aula a2 = new Aula("Lista de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de Lista e Objetos", 15);
		
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		//Ordenando a lista usando o método sort a interface Collections
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		//Ordenando a lista por tempo de aula usando o método sort nativo em todas as lista a partir do java 8
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}
}
