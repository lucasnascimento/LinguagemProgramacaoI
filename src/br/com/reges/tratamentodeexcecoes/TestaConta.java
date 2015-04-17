package br.com.reges.tratamentodeexcecoes;

public class TestaConta {
	
	public static void main(String[] args) {
		
		Conta lucas = new Conta();
		
		lucas.deposita(100.0);
		lucas.saca(20.0);
		lucas.saca(100.0);
		
		System.out.println(lucas.getSaldo());
		
		throw new RuntimeException();
		
		
		
		
		
	}

}
