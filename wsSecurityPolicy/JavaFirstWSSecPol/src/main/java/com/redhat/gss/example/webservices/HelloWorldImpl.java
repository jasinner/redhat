package com.redhat.gss.example.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.EndpointConfig;

@WebService(wsdlLocation = "WEB-INF/wsdl/HelloWorld.wsdl",
		endpointInterface="com.redhat.gss.example.webservices.HelloWorld",
		targetNamespace = "http://webservices.example.gss.redhat.com/",
		portName = "HelloWorldPort",
		serviceName="HelloWorldService")
@EndpointConfig(configFile = "WEB-INF/jaxws-endpoint-config.xml", configName = "Custom WS-Security Endpoint")
public class HelloWorldImpl {
	@WebMethod
	public String sayHello(String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
}
