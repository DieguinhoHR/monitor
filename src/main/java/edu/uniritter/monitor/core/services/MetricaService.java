package edu.uniritter.monitor.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.uniritter.monitor.core.domain.Metrica;
import edu.uniritter.monitor.core.repository.MetricaRepository;

@Component
public class MetricaService {
	
	@Autowired
	MetricaRepository repository;
	
	public List<Metrica> getMetricas() {		
		return repository.getMetricas();		
	}
}
