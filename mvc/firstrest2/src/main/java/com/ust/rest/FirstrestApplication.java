package com.ust.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstrestApplication {
	final static Logger logger =LoggerFactory.getLogger("FirstrestApplication.class");

	public static void main(String[] args) {
		SpringApplication.run(FirstrestApplication.class, args);
		logger.trace("Application started succesfully");
		logger.info("Application started sucessfully");
		logger.error("MAKE IT COUNT");
		logger.warn("Application started sucessfully");
		logger.debug("Application started sucessfully");
//		((Object) logger).fine("Application started sucessfully");
	}

}
