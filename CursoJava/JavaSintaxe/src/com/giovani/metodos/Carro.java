package com.giovani.metodos;

public class Carro {
	private String modelo;
	private String cor;
	private int ano;
	Motor motor;
	
	public void acelerarCarro() {
		this.motor.setAceleracao(this.motor.getAceleracao()+1);
	}
	public void desacelerarCarro() {
		this.motor.setAceleracao(this.motor.getAceleracao()-1);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	

}
