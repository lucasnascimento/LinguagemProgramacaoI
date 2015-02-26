package br.com.reges.alunos;

/**
 * Classe que testa a implementação da Classe Aluno
 * 
 * @author Lucas Nascimento
 *
 */
public class AlunoTeste {

	/**
	 * Método principal a ser chamado na hora de terstarmos nossa implementação
	 * 
	 * @param args Argumentos da linha de comando
	 */
	public static void main(String[] args) {
		
		//Testando um Aluno que seria reprovado
		Aluno aluno = new Aluno("Aluno", "Ensino Fundamental");
		aluno.notaProva = 5.5;
		System.out.println(aluno.resultado());

		//Testando um Aluno que iria para Exame
		AlunoDeGraduacao alunoGraduacao = new AlunoDeGraduacao("Aluno","Graduação");
		alunoGraduacao.notaProva = 2.0;
		alunoGraduacao.notaTrabalhoPrimeiroBimstre = 3.0;
		alunoGraduacao.notaProvaSegundoBimestre = 2.0;
		alunoGraduacao.notaTrabalhoSegundoBimestre = 3.0;
		System.out.println(alunoGraduacao.resultado());

		//Testando um Aluno que seria aprovado
		AlunoDePosGraduacao alunoPosGraduacao = new AlunoDePosGraduacao("Aluno","PosGraduação");
		alunoPosGraduacao.notaProva = 5.0;
		alunoPosGraduacao.notaTrabalho = 2.0;
		System.out.println(alunoPosGraduacao.resultado());

	}

}
