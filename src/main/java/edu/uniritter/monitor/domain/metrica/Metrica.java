package edu.uniritter.monitor.domain.metrica;

import java.util.Date;

public class Metrica {	
	private Long id;
	private String nome;
	private Date dataDeCriacao;
	
	public Metrica() {}
	
	public Metrica(Long id, String nome, Date dataDeCriacao) {
		this.id = id;
		this.nome = nome;
		this.dataDeCriacao = dataDeCriacao;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}	
}
