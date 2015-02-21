package br.com.reges.alunos;



import java.util.Scanner;

public class exerc2{
 
 public static void main(String[]args){
 
  Double prova1 = 0.0;
  Double prova2 = 0.0;
  Double trabalho1 = 0.0;
  Double trabalho2 = 0.0;
  Double media = 0.0;
  String nome="";
  String sobrenome="";

  @SuppressWarnings("resource")
  Scanner teclado = new Scanner(System.in);

  Integer i = 0;
  while ( i == 0){
	  System.out.print("Informe o nome do aluno: ");
	  nome = teclado.nextLine();
	  
	  System.out.print("Informe o sobrenome do aluno: ");
	  sobrenome = teclado.nextLine();
	  
   System.out.print("Informe o nota da prova do primeiro bimestre: ");
   prova1=Double.parseDouble(teclado.nextLine());
   
   System.out.print("Informe o nota do trabalho do primeiro bimestre: ");
   trabalho1=Double.parseDouble(teclado.nextLine());
  
   System.out.print("Informe o nota da prova do segundo bimestre: ");
   prova2=Double.parseDouble(teclado.nextLine());
   
   System.out.print("Informe o nota do trabalho do segundo bimestre: ");
   prova2=Double.parseDouble(teclado.nextLine());
  
   media = (prova1 + trabalho1) +(prova2 + trabalho2) /2;
   System.out.print("A media final do aluno " + nome + " " + sobrenome +" e: " + media);
        
   if(media < 5.0){
    System.out.println("  O aluno esta Reprovado :(");
   }else if((media >= 5.0) && (media < 7.0)){
    System.out.println("  O aluno esta Exame :O");
   }else{
    System.out.println("  O aluno esta Aprovado :)");  
   }
   System.out.println("\n");
   System.out.print("Deseja Sair (1 = Sim/0 = Nao): ");
   i = teclado.nextInt();
  }
 }
}