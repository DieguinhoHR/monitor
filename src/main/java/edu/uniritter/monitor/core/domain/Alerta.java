package edu.uniritter.monitor.core.domain;

public enum Alerta {
	SUCCESS(1), INFO(2), WARNING(3), DANGER(4);
	private final int valor;
	
	Alerta(int valor) {
		this.valor = valor;		
	}
	
	public int getValor() {
		return valor;
	}
}
