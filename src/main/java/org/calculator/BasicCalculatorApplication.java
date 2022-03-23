package org.calculator;

import org.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication()
public class BasicCalculatorApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;


	@Override
	public void run(String... args) throws Exception {
		CalculatorService calculatorService = applicationContext.getBean(CalculatorService.class);
		calculatorService.executeOperation();
	}

	public static void main(String[] args) {
		SpringApplication.run(BasicCalculatorApplication.class, args);
		System.out.println("Hello world!");
	}

}
