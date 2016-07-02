package edu.uniritter.monitor.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uniritter.monitor.domain.metrica.Metrica;
import edu.uniritter.monitor.domain.metrica.MetricaService;

@RestController
public class MetricaController {
	
	@Autowired
	MetricaService service;
	
    @RequestMapping("/metricas")
    public List<Metrica> index() {
		return this.service.getMetricas();    	
	}
}
