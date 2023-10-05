package com.giovani.banco.modelos;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	private double juros;
	
	public void gerarJuros() {
		
		this.juros += this.saldo*0.1;
		this.saldo += this.juros;
	}

}
