/**
 * Pacote de Classes do modulo alunos
 */
package br.com.reges.alunos;

/**
 * Classe que modela um aluno no aspecto de suas notas dentro de um sistema
 * Academico
 * 
 * @author Lucas Nascimento
 *
 */
public class Aluno {

	/**
	 * Nota da prova do primeiro bimestre deve ser entre 0 e 7
	 */
	Double notaProvaPrimeiroBimestre = 0.0;
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
	 * Nome do Aluno
	 */
	String nome = "";
	/**
	 * Sobrenome do Aluno
	 */
	String sobrenome = "";

	/**
	 * Calcula a nota total do primeiro bimestre
	 * 
	 * @return Valor da nota total do primeiro bimestre prova mais trabalho
	 */
	Double calcularNotaPrimeiroBimestre() {
		return notaProvaPrimeiroBimestre + notaTrabalhoPrimeiroBimstre;
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
	 * Imprime a mensagem final de resultado do aluno
	 * 
	 * @return
	 */
	String imprimeResultadoAluno() {
		return "A media final do aluno " + nome + " " + sobrenome + " e: "
				+ calcularMediaSemestre() + " - Portanto você esta: "
				+ calcularMensagemFinal();
	}

	/**
	 * Calcula o texto final sobre a média do aluno
	 * 
	 * @return "Aprovado" caso média maior ou igual a 7 <p> "Exame" caso média entre 5 e 6,9 <p> "Reprovado" caso média menor que 5 
	 */
	String calcularMensagemFinal() {

		if (calcularMediaSemestre() < 5.0) {
			return " Reprovado :( ";
		} else if ((calcularMediaSemestre() >= 5.0)
				&& (calcularMediaSemestre() < 7.0)) {
			return " Exame :O ";
		} else {
			return " Aprovado :)";
		}
	}

}
