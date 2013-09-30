package com.redhat.gss.example.camel.client;

import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;

public class WSRouteBuilder extends RouteBuilder {

	public void configure() {

		from("direct-vm:ComS_WS").id("ComS_WSRoute")
				.setExchangePattern(ExchangePattern.InOnly)
				.beanRef("comSWSProcessor", "prepareMessageEndpoint");
	}

}
