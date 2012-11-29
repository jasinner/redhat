package com.redhat.gss.wss;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.apache.cxf.ws.security.SecurityConstants;

public class SecureServiceClient {
	private static final String SERVICE_URL = "http://localhost:8080/usernametoken/SecureService";
	
	private SecureService proxy;
	
	public SecureServiceClient() throws MalformedURLException{
		QName serviceName = new QName("http://wss.gss.redhat.com/", "SecureServiceService");
		URL wsdlURL = new URL(SERVICE_URL + "?wsdl");
		Service service = Service.create(wsdlURL, serviceName);
		proxy = (SecureService)service.getPort(SecureService.class);
		((BindingProvider)proxy).getRequestContext().put(SecurityConstants.USERNAME, "kermit");
		((BindingProvider)proxy).getRequestContext().put(SecurityConstants.CALLBACK_HANDLER,
		      "com.redhat.gss.wss.policy.jaas.UsernamePasswordCallback");
	}
	
	public SecureService getProxy(){
		return proxy;
	}
	
	public static void main(String args[]) throws MalformedURLException{
		SecureServiceClient client = new SecureServiceClient();

		String response = client.getProxy().sayHello("kermit");
		System.out.println("received response: " + response);
	}
}
