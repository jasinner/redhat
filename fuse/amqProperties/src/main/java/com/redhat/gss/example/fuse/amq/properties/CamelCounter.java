package com.redhat.gss.example.fuse.amq.properties;

import org.apache.camel.Exchange;

public class CamelCounter {
	private int count;
	private int rolloverTarget;
	
	public CamelCounter(int rolloverTarget){
		count = 0;
		if(rolloverTarget < 2)
			throw new IllegalArgumentException("rolloverTarget must be greater than 1");
		this.rolloverTarget= rolloverTarget;
	}
	
	//returns incremented count
	public int increment(String body, Exchange exchange){
		if(exchange.getProperty("count") == null)
			exchange.setProperty("count", count);
		exchange.setProperty("count", ++count);
		return count;
	}
	
	public boolean rollover(String body, Exchange exchange){
		int c = (Integer) exchange.getProperty("count");
		if(c % rolloverTarget == 0)
				return true;
		return false;
	}
	
	public int getCount(){
		return count;
	}
}
