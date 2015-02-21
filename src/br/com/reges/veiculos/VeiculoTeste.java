package br.com.reges.veiculos;

/**
 * Classe utilitária para Execução do nosso programa de Gestão de
 * veiculos.
 * 
 * @author lucas
 *
 */
public class VeiculoTeste {

	/**
	 * Método principal que será executado quando chamarmos nossa classe
	 * pelo comando <code>java MeuPrograma</code> no prompt de comando do 
	 * Windows.
	 * 
	 * @param args Paramêtros passados na linha de comando.
	 */
	public static void main(String[] args) {
		/*
		 * Vamos criar um objeto do tipo Veículo que em sua instância será uma 
		 * moto, para que assim possamos utilizar seus métodos
		 */
		Veiculo moto = new Veiculo();
		moto.nomeProprietario = "Lucas Nascimento";
		//Acelerando a moto a 120km/h
		moto.acelerar(120);
		moto.frear();
		
	}

}

