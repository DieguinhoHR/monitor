package edu.uniritter.monitor.application.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.uniritter.monitor.domain.metrica.MetricaService;

@RestController
public class MetricaController {
	//@Autowired
	//MetricaService service;
	
    @RequestMapping("/")
    public void index() {
    	System.out.println("TESTE");
		//this.service.getMetricas();    	
	}
}
