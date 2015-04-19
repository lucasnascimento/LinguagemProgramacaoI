package br.com.reges.tratamentodeexcecoes;

public class Conta {

	private double saldo;
	private int numero;
	private int agencia;
	private String titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente", this.saldo, valor);
		}
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
