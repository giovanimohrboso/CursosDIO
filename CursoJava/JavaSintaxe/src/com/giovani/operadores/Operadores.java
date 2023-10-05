package com.giovani.operadores;

public class Operadores {

	public static void main(String[] args) {

		String nome = "Giovani";
		System.out.println(nome);
		double soma = 10.5 + 15.7 ;
		System.out.println(soma);
		int subtracao = 10 - 5 ;
		System.out.println(subtracao);
		int modulo = 5 % 2;
		System.out.println(modulo);
		String nomeCompleto = "GIovani "+"Mohr "+"Boso";
		System.out.println(nomeCompleto);
		
		String concatenacao = "?";
		System.out.println(concatenacao);
		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao);
		concatenacao = 1+"1"+1+1;
		System.out.println(concatenacao);
		concatenacao = 1+"1"+(1+1);
		System.out.println(concatenacao);
		
		//operador Unário
		
		int numero = 5;
		System.out.println(-numero);
		System.out.println(numero);
		numero = -numero;
		System.out.println(numero);
		numero = +numero; //não realiza a alteração
		System.out.println(numero); 
		
		numero = numero * -1;
		System.out.println(numero);
		numero++; //incremento
		System.out.println(numero);
		numero--; //decremento
		System.out.println(numero);
		
		boolean variavel = true;
		System.out.println(variavel);
		System.out.println(!variavel);
		variavel = !variavel; //invertendo o valor
		System.out.println(variavel);
		
		//Operador ternário
		int a,b;
		
		a = 5;
		b = 6;
		String resultado;
		
		if (a==b) {
			resultado = "Verdadeiro";
		}else {
			resultado = "Falso";
		}
		System.out.println("If Normal: "+resultado);
		
		resultado ="";
		
		resultado = a==b ? "Verdadeiro":"Falso";
		System.out.println("Ternario: "+resultado);
		
		//Operador Relacional
		
		boolean simNao = a == b;
		System.out.println(" A Igual B: "+simNao);
		simNao = a > b;
		System.out.println("A Maior B: "+simNao);
		simNao = a < b;
		System.out.println("A Menor B: "+simNao);
		simNao = a != b;
		System.out.println("A Diferente B: "+simNao);
		
		String nome1 = "Giovani";
		String nome2 = new String("Giovani");
		simNao = nome1 == nome2;
		System.out.println(nome1+"="+nome2+" : "+simNao); 
		simNao = nome1.equals(nome2);
		System.out.println(nome1+"="+nome2+" : "+simNao); 
		
		//Operador Lógicos
		
		boolean condicao1 = true;
		int a1 = 10;
		int b1 = 20;
		
		if ((condicao1) && (a1 == b1)){
			System.out.println("1 - Entrou no IF");
		}else {
			System.out.println("1 - Entrou no ELSE");
		}
		
		if ((condicao1) || (a1 == b1)){
			System.out.println("2 - Entrou no IF");
		}else {
			System.out.println("2 - Entrou no ELSE");
		}
			
		
		

	}

}
