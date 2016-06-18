package edu.uniritter.monitor.infrastrutucture.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import edu.uniritter.monitor.domain.metrica.Metrica;

@Component
public class MetricaDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MetricaDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;		
	}
	
	public List<Metrica> getMetricas() {
		return this.jdbcTemplate.query(
		    "SELECT id, nome, dataDeCriacao FROM metrica ORDER BY id DESC", 
				new MetricaRowMapper());
	}
}
