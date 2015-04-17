package br.com.reges.tratamentodeexcecoes;

public class FluxoDeExcecao {

	public static void main(String[] args) {
		System.out.println("inicio MAIN");
		metodo1();
		System.out.println("fim MAIN");
	}

	private static void metodo1() {
		System.out.println("inicio METODO_1");
		metodo2();
		System.out.println("fim METODO_1");
	}

	private static void metodo2() {
		System.out.println("inicio METODO_2");
		metodo3();
		System.out.println("fim METODO_2");
	}

	private static void metodo3() {
		System.out.println("inicio METODO_3");
		int[] nums = new int[5];
		for (int i = 0; i < 6; i++) {
			nums[i] = i;
			System.out.println(nums[i]);
		}
		System.out.println("fim METODO_3");
	}
}
