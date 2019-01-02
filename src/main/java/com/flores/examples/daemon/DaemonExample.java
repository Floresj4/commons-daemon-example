package com.flores.examples.daemon;

import java.util.UUID;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Jason
 */
public class DaemonExample {
	
	static {
		PropertyConfigurator.configure("log4j.properties");
	}

	private static final Logger logger = LoggerFactory.getLogger(DaemonExample.class);
	
	static boolean isLogging = false;
	
	public static void main(String[] args) {
	}
	
	static void logSomething(UUID guid) {
		logger.debug(String.format("Logging a debug event for user %s", 
				guid.toString()));
	}
	
	public static void start(String args[]) {
		while(isLogging = true) {
			UUID guid = UUID.randomUUID();
			logSomething(guid);

			try {
				//sleep for between 1 and 10 seconds
				double sleepDuration = (int) (Math.random() * 10000);
				logger.trace(String.format("Sleeping for %4.3f seconds", (sleepDuration / 1000)));
				Thread.sleep((int)sleepDuration);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void stop(String args[]) {
		logger.debug("Terminating process...");
		isLogging = false;
		System.exit(0);
	}
}
