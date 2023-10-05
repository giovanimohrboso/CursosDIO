package com.giovani.contador;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o Primeiro Numero");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o Segundo Numero");
		int segundoNumero = teclado.nextInt();
		
		try {
			contar(primeiroNumero,segundoNumero);
			
		} catch (ParametrosInvalidosException e) {
			System.out.println("Parametros Inválidos.Segundo Parametro deve ser Maior que o Primeiro");
		}
		
		

	}
	
	static void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException {
		
		if (parametroDois < parametroUm) throw new ParametrosInvalidosException();
		for(int x=parametroUm;(parametroDois>x);x++) {
			System.out.println("Imprimindo o numero "+x);
		}
		
	}
	
	

}
