package com.giovani.banco.modelos;

public interface IConta {
	
	void depositar(double valor);
	boolean sacar(double valor);
	void transferir(double valor,Conta conta);
	void imprimirExtrato();

}
