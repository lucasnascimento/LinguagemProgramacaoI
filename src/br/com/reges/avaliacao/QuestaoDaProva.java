package br.com.reges.avaliacao;

class SuperClasse {
	public String imprime(){
		return "SuperClasse";
	}
}

class SubClasse extends QuestaoDaProva {
	public String imprime(){
		return "SubClasse";
	}
}

public class QuestaoDaProva{
	public static void main(String[] args) {
		
		int num=0;
		
		if (num==10) {    
		    System.out.println("\n\nVoce acertou!\n");    
		    System.out.println("O numero e igual a 10.\n");    
		} else if (num>10)  {    
			System.out.println("O numero e maior que 10.");    
		} else {    
			System.out.println("O numero e menor que 10.");    
		}   
	
	}
}