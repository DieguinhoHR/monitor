package edu.unirritter.domain.metrica;

import java.util.List;

public interface MetricaRepository {
	public void salvar(Metrica metrica);
	public List<Metrica> buscarTodos();
}
