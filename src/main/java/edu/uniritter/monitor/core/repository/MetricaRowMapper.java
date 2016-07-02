package edu.uniritter.monitor.core.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.uniritter.monitor.core.domain.Metrica;

public class MetricaRowMapper implements RowMapper<Metrica> {
	public Metrica mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		return new Metrica(
			resultSet.getLong("id"), 
			resultSet.getString("nome"),
			resultSet.getDate("dataDeCriacao")
		);
	}
}