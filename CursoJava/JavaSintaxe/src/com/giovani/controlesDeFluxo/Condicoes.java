package com.giovani.controlesDeFluxo;

public class Condicoes {

	public static void main(String[] args) {
		
		double saldo = 1200;
		double valorSolicitado = 500;
		
		
		//Condicao Simples
		if (valorSolicitado <= saldo) {
			saldo = saldo - valorSolicitado;
		}
		System.out.println("Saldo: "+saldo);	
		
		
		double valorAprovadoEmprestimo = 1000;
		//Condicao Composta e Encadeadas
		valorSolicitado = 1500;
		if (valorSolicitado <= saldo) {
			saldo = saldo - valorSolicitado;
		}else if (valorSolicitado <= (saldo+valorAprovadoEmprestimo)){
			valorAprovadoEmprestimo = valorAprovadoEmprestimo -(valorSolicitado - saldo);
			System.out.println("Emprestimo Solicitado no valor de "+(valorSolicitado - saldo));
			saldo = 0;
		}else {
			System.out.println("Saque invalido");
		}
		System.out.println("Saldo: "+saldo);
		System.out.println("Ainda tem Emprestimo de: "+valorAprovadoEmprestimo);
		
		
		//Condicao Ternaria
		saldo = 1000;
		valorAprovadoEmprestimo = 1000;
		valorSolicitado = 1500;
		
		String mensagem = (valorSolicitado <= saldo) ? "Saque Aprovado" : (valorSolicitado <= (saldo+valorAprovadoEmprestimo)) ? "Emprestimo Aprovado" : "Saque Invalido";
		System.out.println(mensagem);
		
		//Switch case
		
		switch (mensagem) {
			case "Saque Aprovado":{
				saldo = saldo - valorSolicitado;
				break;
			}
			case "Emprestimo Aprovado" : {
				valorAprovadoEmprestimo = valorAprovadoEmprestimo -(valorSolicitado - saldo);
				saldo = 0;
				break;
			}
			default: {
				System.out.println("Não foi Possivel realizar o saque");
			}
		}
		
		
		
	}

}
