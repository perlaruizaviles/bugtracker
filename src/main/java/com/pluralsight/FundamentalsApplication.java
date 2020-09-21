package com.pluralsight;

import com.pluralsight.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pluralsight.entity.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FundamentalsApplication {

	private static final Logger log = LoggerFactory.getLogger(FundamentalsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			for (Application application : repository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
	}
}
