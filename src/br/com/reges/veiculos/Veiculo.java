package br.com.reges.veiculos;

/**
 * Classe que modela um Veículo para utilização em nosso
 * programa de gestão de veículos
 * 
 * @author Lucas Nascimento
 *
 */
public class Veiculo {
	
	/**
	 *  Atributo que armazena o Nome do Proprietário do Veículo
	 */
	String nomeProprietario;
	
	/**
	 * Atributo que armazena o Renavam do Veículo
	 */
	String numeroRenavam;
	
	/**
	 * Método responsável por acelerar o veículo a té uma certa velocidade
	 * 
	 * @param velocidade Velocidade final desejada ao acelerar o veículo
	 * @return Verdadeiro caso a aceleração ocorreu sem problemas
	 */
	boolean acelerar(Integer velocidade){
		//Imprime no console a mensagem que o método esta acelerando
		System.out.println("Acelerando...");
		
		//retorna verdadeiro para indicar que a aceleração 
		return true;
	}
	
	/*
	 * 
	 */
	void frear(){
		System.out.println("Freando...");
	}
	
}
