package edu.unirritter.domain.metrica;

public class Metrica {	
	private String nome;
	private Metrica metrica;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Metrica(String nome) {
		this.nome = nome;
	}
		
	public String getNome() {
		return nome;
	}
		
	public Metrica getMetrica() {
		return metrica;
	}

	public void setMetrica(Metrica metrica) {
		this.metrica = metrica;
	}
}