package br.com.alura;

public class Aluno {
	
	private String nome;
	private int cpf;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			
			throw new NullPointerException("Nome não pode Ser Null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	public String getNome() {
		return nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;	  
	}
	
	@Override
	public String toString() {
	
		return "[Aluno: "+ this.nome + " - Matrícula: " + this.numeroMatricula + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {		
		//aqui devolve um valor pra pimeira letra do nome da pessoa para agrupar esses nomes e possibilitar a busca
		//return this.nome.charAt(0);
		
		//aqui ele devolve o hashcode da string inteira utilizando o codigo do proprio metodo hasCode implementado na classe String (muito mais interessante)
		return this.nome.hashCode();
	}
	
	//SEMPRE QUE SOBREESCREVER O MÉTODO EQUALS SE DEVE SOBRESCREVER O MÉTODO HASCODE
	
	
}

