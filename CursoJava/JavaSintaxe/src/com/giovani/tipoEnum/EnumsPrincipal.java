package com.giovani.tipoEnum;

public class EnumsPrincipal {

	public static void main(String[] args) {
		
		EstadosBrasileiros estados = EstadosBrasileiros.SAO_PAULO;
		System.out.println(estados.getNome());
		System.out.println(estados.getSigla());
		EstadosBrasileiros estados1;
		System.out.println(estados.values());
		Object teste[] = estados.values();
		System.out.println(teste[0]);

	}

}
