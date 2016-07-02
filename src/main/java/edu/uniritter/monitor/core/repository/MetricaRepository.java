package edu.uniritter.monitor.core.repository;

import java.util.List;

import edu.uniritter.monitor.core.domain.Metrica;

public interface MetricaRepository {
	public void salvar(Metrica metrica);
	public List<Metrica> getMetricas();
}