package br.com.reges.estruturasderepeticao;

public class ExemplosForWhile {
	
	public static void main(String[] args) {
		
		//Contando com for
		
//		for ( int i = 0 ; i <= 10 ; i++){
//			System.out.println("O valor de i é: " + i);
//		}
		
		
		//Contando com while
		
//		int i = 0;
//		while( i <= 10) {
//			
//			System.out.println("WHILE-> O valor de i é: " + i);
//			i++;
//		}
		
		Aluno[] alunos = new Aluno[10];
		
		
		alunos[0] = new Aluno();
		alunos[0].nome = "Lucas";
		alunos[0].telefone = "5555-5555";
		
		alunos[1] = new Aluno();
		alunos[1].nome = "Matheus";
		alunos[1].telefone = "5555-44444";
		
		for (int i = 0 ; i< alunos.length;i++){
			//System.out.println("O valor de i é: " + i);
			if (alunos[i] == null) break;
			System.out.println(alunos[i]);
		}
		
		
		//switch 
			
			
	}

}

class Aluno{
	String nome;
	String telefone;
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", telefone=" + telefone + "]";
	}
}
