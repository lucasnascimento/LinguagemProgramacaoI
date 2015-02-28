package br.com.reges.alunos;

/**
 * Especialização de um aluno de graduação que escolhe não fazer os trabalhos e
 * sua nota é apenas as notas de prova
 * 
 * @author lucas
 *
 */
public class AlunoDeGraduacaoSemTrabalho extends AlunoDeGraduacao {

	/**
	 * Construtor padrão
	 */
	public AlunoDeGraduacaoSemTrabalho() {
		super();
	}

	/**
	 * Construtor recebeno nome e sobrenome
	 * 
	 * @param nome
	 * @param sobrenome
	 */
	public AlunoDeGraduacaoSemTrabalho(String nome, String sobrenome) {
		super(nome, sobrenome);
	}

	/**
	 * Calcula a nota total do primeiro bimestre
	 * 
	 * @return Valor da nota total do primeiro bimestre prova mais trabalho
	 */
	Double calcularNotaPrimeiroBimestre() {
		return notaProva;
	}

	/**
	 * Calcula a nota total do segundo bimestre
	 * 
	 * @return Valor da nota total do segundo bimestre prova mais trabalho
	 */
	Double calcularNotaSegundoBimestre() {
		return notaProvaSegundoBimestre;
	}

}
