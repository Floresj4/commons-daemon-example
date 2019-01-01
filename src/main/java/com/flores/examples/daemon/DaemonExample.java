package com.flores.examples.daemon;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Jason
 */
public class DaemonExample {
	
	private static final Logger logger = LoggerFactory.getLogger(DaemonExample.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logSomething();
	}
	
	static void logSomething() {
		logger.debug("Logging a debug message.");
		logger.warn("logging a warn message");
	}
}
