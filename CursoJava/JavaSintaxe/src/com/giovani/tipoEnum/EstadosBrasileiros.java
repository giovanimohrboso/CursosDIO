package com.giovani.tipoEnum;

public enum EstadosBrasileiros {
	SAO_PAULO("SP","São Paulo"),
	RIO_DE_JANEIRO("RJ","Rio de janeiro")
	
	;
	
	private String sigla;
	private String nome;
	
	private EstadosBrasileiros(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
