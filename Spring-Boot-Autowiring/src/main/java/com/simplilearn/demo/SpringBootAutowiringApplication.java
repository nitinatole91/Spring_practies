package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.simplilearn.demo.service.ReportService;

@SpringBootApplication
public class SpringBootAutowiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootAutowiringApplication.class, args);
		ReportService reportService = run.getBean(ReportService.class);	
		reportService.genrateReport();
	}

}
