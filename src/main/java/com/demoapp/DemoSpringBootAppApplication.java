package com.demoapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootAppApplication {

	private static final Logger LOGGER = LogManager.getLogger(DemoSpringBootAppApplication.class);
	
	public static void main(String[] args) {
		
		LOGGER.debug("Debug level");
		LOGGER.error("Error level");
		LOGGER.info("Info level");
		LOGGER.warn("Warn level");
		LOGGER.trace("Trace level");
		System.out.println("isDebugEnabled: " + LOGGER.isDebugEnabled());
		System.out.println("isErrorEnabled: " + LOGGER.isErrorEnabled());
		System.out.println("isWarnEnabled: " + LOGGER.isWarnEnabled());
		System.out.println("isInfoEnabled: " + LOGGER.isInfoEnabled());
		System.out.println("isTraceEnabled: " + LOGGER.isTraceEnabled());
		
		SpringApplication.run(DemoSpringBootAppApplication.class, args);
	}
}
