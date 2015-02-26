/**
 * Pacote de Classes do modulo alunos
 */
package br.com.reges.alunos;

/**
 * Classe que modela um aluno de Ensino Fundamental no aspecto de sua nota
 * dentro de um sistema Academico
 * 
 * @author Lucas Nascimento
 *
 */
public class Aluno {

	/**
	 * Nome do Aluno
	 */
	String nome = "";
	
	/**
	 * Sobrenome do Aluno
	 */
	String sobrenome = "";
	
	/**
	 * Nota Prova deve ser um valor entre 0 e 10
	 */
	Double notaProva;

	/**
	 * Construtor padrão
	 */
	public Aluno() {

	}

	/**
	 * Construtor recebendo os campos
	 * 
	 * @param nome
	 * @param sobrenome
	 */
	public Aluno(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	/**
	 * Retorna o resultado do aluno
	 * 
	 * @return "APROVADO" caso nota maior ou igual a 5
	 *         <p>
	 *         "REPROVADO" caso média menor que 5
	 */
	public String resultado() {
		if (notaProva < 5.0) {
			return "REPROVADO";
		} else {
			return "APROVADO";
		}
	}
}
