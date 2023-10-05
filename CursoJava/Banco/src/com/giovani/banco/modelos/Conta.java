package com.giovani.banco.modelos;

public abstract class Conta implements IConta{
	
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = 1;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public boolean sacar(double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("SALDO INSUFICIENTE");
			return false;
		}
		
		
	}

	@Override
	public void transferir(double valor,Conta destino) {
		if (this.sacar(valor)) {
		destino.depositar(valor);
		System.out.println("Transferencia Realizada!");
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(String.format("Agencia:  %s",this.agencia));
		System.out.println(String.format("Conta:  %s",this.agencia));
		System.out.println(String.format("Cliente:  %s",this.cliente.getNome()));
		
	}
	
	

}
