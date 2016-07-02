package edu.uniritter.monitor.infrastrutucture.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import edu.uniritter.monitor.domain.metrica.Metrica;
import edu.uniritter.monitor.domain.metrica.MetricaRepository;

@Component
public class MetricaPersistence implements MetricaRepository {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MetricaPersistence(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;		
	}
	
	public List<Metrica> getMetricas() {
		return this.jdbcTemplate.query(
		    "SELECT id, nome, dataDeCriacao FROM metricas ORDER BY id DESC", 
				new MetricaRowMapper());
	}

	@Override
	public void salvar(Metrica metrica) {
		// TODO Auto-generated method stub		
	}
}
