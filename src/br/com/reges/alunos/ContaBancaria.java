package br.com.reges.alunos;

public class ContaBancaria {
	
	private String nome;
	private int conta;
	private double saldo;
		
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.setNome("Conta Do Lucas");
		conta.setConta(12345);
		conta.setSaldo(124.99);
		System.out.println(conta);
	}

	@Override
	public String toString() {
		return "ContaBancaria [nome=" + nome + ", conta=" + conta + ", saldo="
				+ saldo + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
	
}
