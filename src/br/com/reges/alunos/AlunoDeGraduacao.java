package br.com.reges.alunos;

/**
 * Aluno de Graduação é uma especialização de Aluno, onde adicionamos mais notas
 * por bimestre e mais um trabalho para cada bimestre
 * 
 * @author Lucas Nascimento
 *
 */
public class AlunoDeGraduacao extends Aluno {

	/**
	 * Nota da prova do segundo bimestre deve ser entre 0 e 7
	 */
	Double notaProvaSegundoBimestre = 0.0;
	/**
	 * Nota do trabalho do primeiro bimestre deve ser entre 0 e 3
	 */
	Double notaTrabalhoPrimeiroBimstre = 0.0;
	/**
	 * Nota do trabalho do segundo bimestre deve ser entre 0 e 3
	 */
	Double notaTrabalhoSegundoBimestre = 0.0;

	/**
	 * Construtor padrão
	 */
	public AlunoDeGraduacao() {
		super();
	}

	/**
	 * Construtor recebeno nome e sobrenome
	 * @param nome
	 * @param sobrenome
	 */
	public AlunoDeGraduacao(String nome, String sobrenome) {
		super(nome, sobrenome);
	}

	/**
	 * Calcula a nota total do primeiro bimestre
	 * 
	 * @return Valor da nota total do primeiro bimestre prova mais trabalho
	 */
	Double calcularNotaPrimeiroBimestre() {
		return notaProva + notaTrabalhoPrimeiroBimstre;
	}

	/**
	 * Calcula a nota total do segundo bimestre
	 * 
	 * @return Valor da nota total do segundo bimestre prova mais trabalho
	 */
	Double calcularNotaSegundoBimestre() {
		return notaProvaSegundoBimestre + notaTrabalhoSegundoBimestre;
	}

	/**
	 * Calcula a média total do semestre
	 * 
	 * @return Valor média total do primeiro bimestre prova mais trabalho
	 */
	Double calcularMediaSemestre() {
		return (calcularNotaPrimeiroBimestre() + calcularNotaSegundoBimestre()) / 2;
	}

	/**
	 * Exibe o resultado do aluno de graduação
	 * 
	 * @return "APROVADO" caso média maior ou igual a 7
	 *         <p>
	 *         "EXAME" caso média entre 5 e 6,9
	 *         <p>
	 *         "REPROVADO" caso média menor que 5
	 */
	public String resultado() {

		if (calcularMediaSemestre() < 5.0) {
			return "REPROVADO";
		} else if ((calcularMediaSemestre() >= 5.0)
				&& (calcularMediaSemestre() < 7.0)) {
			return "EXAME";
		} else {
			return "APROVADO";
		}
	}

}
