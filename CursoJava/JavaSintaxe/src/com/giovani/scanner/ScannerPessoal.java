package com.giovani.scanner;

import java.util.Locale;
import java.util.Scanner;

public class ScannerPessoal {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu Nome:");
		String nome = scanner.next();
		
		System.out.println("Digite seu Sobrenome:");
		String sobreNome = scanner.next();
		
		System.out.println("Ola "+nome+" "+sobreNome);
		

	}

}
