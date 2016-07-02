package edu.uniritter.monitor.domain.medicao;

import java.util.Date;

public class Medicao {
	private Date data;
	private int hora;
	private double valor;
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}	
}

