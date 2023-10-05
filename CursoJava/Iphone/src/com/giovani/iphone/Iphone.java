package com.giovani.iphone;

public class Iphone implements Midia,Telefone,Navegador{
	
	private String modelo;
	
	public Iphone(String modelo) {
		setModelo(modelo);
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo a pagina atual");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Pagina");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
		
	}

	@Override
	public void ligar() {
		System.out.println("Realizando Chamada");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Chamada");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Inicio Correio Voz");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando Musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica");
		
	}

}
