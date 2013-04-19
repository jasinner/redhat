package com.fusesource.training.osgi.helloworld.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.fusesource.training.osgi.helloworld.HelloWorld;


public class HelloWorldImpl implements HelloWorld, InitializingBean, DisposableBean {
	
	public static final Logger logger = LoggerFactory.getLogger(HelloWorldImpl.class);
	
	private String response; 
	
	public String sayHello(String message) {
		logger.info("Just got message '" + message + "'");
		logger.info("Returning... '" + response + "'");
		return response;
	}

	public void setResponse(String response) {
		logger.info("Setting the response to '" + response + "'");
		this.response = response;
	}

	public void afterPropertiesSet() throws Exception {
		logger.info("HelloWorldImpl initialized.");
		logger.info("Will return response '" + response + "'");
	}

	public void destroy() throws Exception {
		logger.info("Shutting down HelloWorldImpl");
	}
	
}
