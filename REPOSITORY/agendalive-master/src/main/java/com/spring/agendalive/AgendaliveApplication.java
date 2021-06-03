package com.spring.agendalive;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaliveApplication {

	private static final Logger LOGGER = LogManager.getLogger(AgendaliveApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AgendaliveApplication.class, args);

	
		
		LOGGER.trace("A TRACE Message");
		LOGGER.debug("A DEBUG Message");
		LOGGER.info("An INFO Message");
		LOGGER.warn("A WARN Message");
		LOGGER.error("An ERROR Message");


	}

}
