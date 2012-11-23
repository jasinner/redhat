/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the 
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.gss.example.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.apache.cxf.ws.security.SecurityConstants;

import com.redhat.gss.example.webservices.client.HelloWorld;
import com.redhat.gss.example.ws.callback.KeystorePasswordCallback;
/**
 * A simple CDI service which is able to say hello to someone
 * 
 * @author Pete Muir
 * 
 */
public class WSClientService {

	private static final String WSDL_URL = "http://localhost:8080/JavaFirstWSSecPol/HelloWorld?wsdl";

	public void doWSCall() {
		QName serviceName = new QName(
				"http://webservices.example.gss.redhat.com/",
				"HelloWorldService");

		Service service = Service.create(getWsdUrl(), serviceName);
		HelloWorld proxy = (HelloWorld) service.getPort(HelloWorld.class);

		((BindingProvider) proxy).getRequestContext().put(
				SecurityConstants.CALLBACK_HANDLER,
				new KeystorePasswordCallback());
		((BindingProvider) proxy).getRequestContext().put(
				SecurityConstants.SIGNATURE_PROPERTIES,
				Thread.currentThread().getContextClassLoader()
						.getResource("alice.properties"));
		((BindingProvider) proxy).getRequestContext().put(
				SecurityConstants.ENCRYPT_PROPERTIES,
				Thread.currentThread().getContextClassLoader()
						.getResource("alice.properties"));
		((BindingProvider) proxy).getRequestContext().put(
				SecurityConstants.SIGNATURE_USERNAME, "alice");
		((BindingProvider) proxy).getRequestContext().put(
				SecurityConstants.ENCRYPT_USERNAME, "bob");

		
		
		proxy.sayHello("Jason");
	}


	private URL getWsdUrl() {
		try {
			return new URL(WSDL_URL);
		} catch (MalformedURLException e) {
			throw new IllegalStateException(WSDL_URL + " not found");
		}
	}

}
