package br.com.reges.alunos;

/**
 * Classe que testa a implementação da Classe Aluno
 * 
 * @author Lucas Nascimento
 *
 */
public class AlunoTeste {

	public static void main(String[] args) {
		
		//Testando um Aluno que seria reprovado
		Aluno alunoReprovado = new Aluno();
		alunoReprovado.nome = "Aluno";
		alunoReprovado.sobrenome = "Reprovado";
		alunoReprovado.notaProvaPrimeiroBimestre = 2.0;
		alunoReprovado.notaTrabalhoPrimeiroBimstre = 2.0;
		alunoReprovado.notaProvaSegundoBimestre = 2.0;
		alunoReprovado.notaTrabalhoSegundoBimestre = 2.0;
		System.out.println(alunoReprovado.imprimeResultadoAluno());

		//Testando um Aluno que iria para Exame
		Aluno alunoExame = new Aluno();
		alunoExame.nome = "Aluno";
		alunoExame.sobrenome = "Exame";
		alunoExame.notaProvaPrimeiroBimestre = 2.0;
		alunoExame.notaTrabalhoPrimeiroBimstre = 3.0;
		alunoExame.notaProvaSegundoBimestre = 2.0;
		alunoExame.notaTrabalhoSegundoBimestre = 3.0;
		System.out.println(alunoExame.imprimeResultadoAluno());

		//Testando um Aluno que seria aprovado
		Aluno alunoAprovado = new Aluno();
		alunoAprovado.nome = "Aluno";
		alunoAprovado.sobrenome = "Aprovado";
		alunoAprovado.notaProvaPrimeiroBimestre = 5.0;
		alunoAprovado.notaTrabalhoPrimeiroBimstre = 2.0;
		alunoAprovado.notaProvaSegundoBimestre = 5.0;
		alunoAprovado.notaTrabalhoSegundoBimestre = 2.0;
		System.out.println(alunoAprovado.imprimeResultadoAluno());

	}

}
