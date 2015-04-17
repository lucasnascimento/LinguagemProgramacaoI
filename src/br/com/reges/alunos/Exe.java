package br.com.reges.alunos;


public class Exe {

	public static void main(String[] args) {
		
		System.out.println(inverte(123452111));

	}

	private static int inverte(int original) {

		int num = original;
		int invertido = 0;
		while (num != 0) {
			int digito = num % 10;
			invertido = (invertido * 10) + digito;
			num = num / 10;
		}

		return invertido;
	}

}
