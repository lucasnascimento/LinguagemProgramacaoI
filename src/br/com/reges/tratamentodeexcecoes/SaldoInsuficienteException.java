package br.com.reges.tratamentodeexcecoes;

public class SaldoInsuficienteException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	private double saldoAtual;
	private double valorTentado;
	
	public SaldoInsuficienteException(String message, double saldoAtual, double valorTentado){
		super(message);
		this.saldoAtual = saldoAtual;
		this.valorTentado = valorTentado;
	}
	
	public double getSaldoAtual(){
		return this.saldoAtual;
	}

	public double getValorTentado() {
		return valorTentado;
	}
	

}
