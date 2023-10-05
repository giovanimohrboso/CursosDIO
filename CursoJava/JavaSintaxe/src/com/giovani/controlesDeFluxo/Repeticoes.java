package com.giovani.controlesDeFluxo;

public class Repeticoes {

	public static void main(String[] args) {

		System.out.println("Contando Carneirinhos");
		for (int carneirinhos = 1;(carneirinhos <= 10);carneirinhos++) {
			System.out.println("->"+carneirinhos);
		}
		
		System.out.println("Contando Alunos");
		String alunos[] = {"Felipe","Joao","Maria","Ana"};
		
		for(int x=0;x<alunos.length;x++) {
			System.out.println(alunos[x]);
		}
		
		System.out.println("Contando Alunos COM FOR EACH");
		
		for(String aluno:alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("Utilizando break e continue no for");
		//vai parar no 5
		for (int i = 1;(i <= 10);i++) {
			if (i==5) break;
			System.out.println("->"+i);
			
		}
		//vai pular o 5
		for (int i = 1;(i <= 10);i++) {
			if (i==5) continue;
			System.out.println("->"+i);
		}
		
		System.out.println("Utilizando WHILE");
		
		int carneirinhos = 0;
		while (carneirinhos < 5) {
			carneirinhos++;
			System.out.println("->"+carneirinhos);
			
		}
		
		System.out.println("Utilizando DO WHILE");
		
		carneirinhos = 0;
		do {
			carneirinhos++;
			System.out.println("->"+carneirinhos);
			
		}
		while(carneirinhos < 5);

	}

}
