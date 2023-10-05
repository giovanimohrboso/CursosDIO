package com.giovani.metodos;

public class Metodos {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setModelo("Fusca");
		carro.setCor("Branco"); 
		carro.setAno(1980);
		
		Motor motor = new Motor();
		motor.setModelo("1300");
		motor.setPossuiTurbo(false);
		motor.setCavalos(45);
		
		carro.setMotor(motor);
		carro.acelerarCarro();
		
		System.out.println(carro.getModelo()+" possui "+carro.motor.getCavalos()+" cavalos");
		System.out.println(carro.getMotor().getAceleracao());
		carro.acelerarCarro();
		carro.acelerarCarro();
		carro.acelerarCarro();
		
		System.out.println(carro.getModelo()+" possui "+carro.motor.getCavalos()+" cavalos");
		System.out.println(carro.getMotor().getAceleracao());
		
		carro.desacelerarCarro();
		
		System.out.println(carro.getModelo()+" possui "+carro.motor.getCavalos()+" cavalos");
		System.out.println(carro.getMotor().getAceleracao());

	}

}
