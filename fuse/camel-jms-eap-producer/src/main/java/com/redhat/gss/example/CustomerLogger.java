package com.redhat.gss.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerLogger {
	Logger log = LoggerFactory.getLogger(CustomerLogger.class);
	
	public CustomerLogger(){
		log.info("created CustomerLogger");
	}
}
