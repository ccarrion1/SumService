package com.example.sum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(SumServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SumServiceApplication.class, args);
		log.info("Application up and running");
	}

}
