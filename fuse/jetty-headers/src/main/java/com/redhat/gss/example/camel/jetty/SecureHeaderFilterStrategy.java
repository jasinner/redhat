package com.redhat.gss.example.camel.jetty;

import org.apache.camel.Exchange;
import org.apache.camel.spi.HeaderFilterStrategy;

public class SecureHeaderFilterStrategy implements HeaderFilterStrategy {

	public boolean applyFilterToCamelHeaders(String headerName,
			Object headerValue, Exchange exchange) {
		System.out.println("*** Secure HeaderFilter called, apply to camel, header:" + headerName);
		if(headerName.equals("Server"))
			return true;
		return false;
	}

	public boolean applyFilterToExternalHeaders(String headerName,
			Object headerValue, Exchange exchange) {
		System.out.println("*** Secure HeaderFilter called, apply to external, header:" + headerName);
		return false;
	}

}
