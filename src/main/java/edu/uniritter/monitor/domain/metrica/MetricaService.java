package edu.uniritter.monitor.domain.metrica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetricaService {
	
	@Autowired
	MetricaRepository repository;
	
	public List<Metrica> getMetricas() {		
		return repository.getMetricas();		
	}
}
