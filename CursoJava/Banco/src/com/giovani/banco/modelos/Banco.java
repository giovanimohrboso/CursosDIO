package com.giovani.banco.modelos;

import java.util.List;

public class Banco {
	
	private List<Conta> contas;
	
	public void listarContas() {
		for (Conta conta:contas) {
			System.out.println("Ciente "+conta.cliente.getNome()+" Agencia: "+conta.agencia+" Conta: "+conta.numero+" Saldo "+conta.saldo);
		}
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	

}
