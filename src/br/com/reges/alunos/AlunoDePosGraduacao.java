package br.com.reges.alunos;

/**
 * Aluno de Graduação é uma especialização de Aluno, onde adicionamos mais um trabalho
 * 
 * @author lucas
 *
 */
public class AlunoDePosGraduacao extends Aluno {

	/**
	 * Nota do trabalho
	 */
	Double notaTrabalho = 0.0;

	/**
	 * Calcula a nota total do primeiro bimestre
	 * 
	 * @return Valor da nota total do primeiro bimestre prova mais trabalho
	 */
	Double calcularNota() {
		return notaProva + notaTrabalho;
	}

	/**
	 * Construtor padrão
	 */
	public AlunoDePosGraduacao() {
		super();
	}

	/**
	 * Construtor recebendo nome e sobrenome
	 * 
	 * @param nome
	 * @param sobrenome
	 */
	public AlunoDePosGraduacao(String nome, String sobrenome) {
		super(nome, sobrenome);
	}

	/**
	 * Exibe o resultado do aluno de pós graduação
	 * 
	 * @return "APROVADO" caso o calculo da Nota maior ou igual a 7
	 *         <p>
	 *         "EXAME" caso o calculo da Nota entre 5 e 6,9
	 *         <p>
	 *         "REPROVADO" caso o calculo da Nota menor que 5
	 */
	public String resultado() {

		if (calcularNota() < 5.0) {
			return "REPROVADO";
		} else if ((calcularNota() >= 5.0) && (calcularNota() < 7.0)) {
			return "EXAME";
		} else {
			return "APROVADO";
		}
	}

}
