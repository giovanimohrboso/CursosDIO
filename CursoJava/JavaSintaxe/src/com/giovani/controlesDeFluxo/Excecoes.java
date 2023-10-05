package com.giovani.controlesDeFluxo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {
		
		String nome = null;
		String sobreNome = null;
		int idade = 0;
		double altura = 0;
		
		Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
		try {
		
			System.out.println("Digite seu Nome:");
			nome = teclado.next();
			System.out.println("Digite seu Sobrenome:");
			sobreNome = teclado.next();
			System.out.println("Digite sua Idade:");
			idade = teclado.nextInt();
			System.out.println("Digite sua Altura:");
			altura = teclado.nextDouble();
			
			System.out.println("Olá "+nome+ " "+sobreNome);
			System.out.println("Sua Idade é  "+idade+ " com Altura de "+altura);
		}
		catch(InputMismatchException e){
			System.out.println("Os campos Idade e Altura precisam ser Numericos");
		}
		
		
		
	}

}
