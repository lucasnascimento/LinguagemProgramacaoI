package br.com.reges.alunos;

public class AlunoDeGraduacaoSemTrabalho extends AlunoDeGraduacao {

	@Override
	Double calcularNotaPrimeiroBimestre() {
		// TODO Auto-generated method stub
		return notaProva;
	}
	@Override
	Double calcularNotaSegundoBimestre() {
		// TODO Auto-generated method stub
		return notaProvaSegundoBimestre;
	}
	
}
