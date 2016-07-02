package edu.uniritter.monitor.core.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import edu.uniritter.monitor.core.domain.Metrica;

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
	}
}
