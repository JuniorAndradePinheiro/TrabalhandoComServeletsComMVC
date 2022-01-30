package br.com.alura;

//import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {
	
public static void main(String[] args) {
	List<String> letras = new LinkedList<>();
	letras.add("A");
	letras.add("B");
	letras.add("C");

	
//	Iterator<String> iterador = letras.iterator();
//	
//	while (iterador.hasNext()) {
//		String primeiraLetra = iterador.next();
//		System.out.println("Letra " + primeiraLetra);
//	}
	
//	letras.forEach(caracter-> {System.out.println("Letra "+ caracter);});
	
	for (String caracter : letras) {
		System.out.println("letra: " + caracter);	
	}

}

}
