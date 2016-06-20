package edu.uniritter.monitor.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uniritter.monitor.domain.metrica.MetricaService;

@RestController
public class MetricaController {
	@Autowired
	MetricaService service;
	
    @RequestMapping("/")
    public void index() {
		//this.service.getMetricas();
    	System.out.println("teste");
	}
}
