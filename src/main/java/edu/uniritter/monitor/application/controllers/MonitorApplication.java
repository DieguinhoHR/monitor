package edu.uniritter.monitor.application.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class MonitorApplication {
	public static void main(String[] args) {
		SpringApplication.run(MonitorApplication.class, args);
	}
}