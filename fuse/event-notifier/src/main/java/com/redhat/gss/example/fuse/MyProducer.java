package com.redhat.gss.example.fuse;

import org.apache.camel.Exchange;

public class MyProducer {
	public void send(Exchange exchange) throws Exception {
		String endpointUri = "mock:result";
		exchange.getContext().createProducerTemplate().sendBody(endpointUri, exchange.getIn().getBody(String.class));	
	}
}
