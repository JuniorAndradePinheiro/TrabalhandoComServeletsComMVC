package br.com.alura;

//import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");
		
		//Criando uma lista para armazenar as aulas do curso
		//List<Aula> aulas = javaColecoes.getAulas();
		//aulas.add(new Aula("Trabalhando com Arrays",21));
		
		//Outra forma de realizar a mesma coisa mas de forma simplificada em uma linha
		//javaColecoes.getAulas().add(new Aula("Trabalhando com Arrays",21));
		
		
		//Adicionando Aulas nas lista por meio de um método da classe curso (é o mais indicado)
		javaColecoes.adiciona(new Aula("Trabalhando com Arrays",21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));
		

		System.out.println(javaColecoes.getNome() + " - " + javaColecoes.getInstrutor() + " - " + javaColecoes.getAulas());
		
		System.out.println(javaColecoes.getTempoTotal() + " minutos");
		
		System.out.println(javaColecoes);

	}

}
