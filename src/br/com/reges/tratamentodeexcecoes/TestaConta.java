package br.com.reges.tratamentodeexcecoes;

public class TestaConta {

	public static void main(String[] args) {

		Conta lucas = new Conta();

		lucas.deposita(100.0);
		try {
			lucas.saca(20.0);
			lucas.saca(100.00);
		} catch (SaldoInsuficienteException e) {
			System.out.println(String.format("Saque não é possivel para o valor: %s - Seu saldo atual é: %s ", e.getValorTentado(), e.getSaldoAtual()));
		}

	}

}
