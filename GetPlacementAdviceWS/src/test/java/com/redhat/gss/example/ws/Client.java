/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
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
package com.redhat.gss.example.ws;

import com.redhat.gss.example.ws.GetPlacementAdvicePortType;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import javax.xml.ws.Service;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * A Client stub to the HelloWorld JAX-WS Web Service.
 * 
 * @author Red Hat Global Support Services
 */
public class Client implements GetPlacementAdvicePortType {
    private GetPlacementAdvicePortType getPlacementAdviceService;

    /**
     * Default constructor
     * 
     * @param url The URL to the Hello World WSDL endpoint.
     */
    public Client(final URL wsdlUrl) {
        QName serviceName = new QName("urn:PSL_CLM_GetPlacementAdvice", "GetPlacementAdviceService");

        Service service = Service.create(wsdlUrl, serviceName);
        getPlacementAdviceService = service.getPort(GetPlacementAdvicePortType.class);
        assert (getPlacementAdviceService != null);
    }
    
    /**
     * Default constructor
     * 
     * @param url The URL to the Hello World WSDL endpoint.
     * @throws MalformedURLException if the WSDL url is malformed.
     */
    public Client(final String url) throws MalformedURLException {
        this(new URL(url));
    }


	@Override
	public void getPlacementAdvice(String networkName, String subscriptionID,
			String numberOfVMs, Holder<String> networkOptionChoiceID,
			Holder<String> computeOptionChoiceID) {
		Holder<String> networkOptionHolder = new Holder<String>("networkOptionChoiceID");
		Holder<String> computeOptionHolder = new Holder<String>("computeOptionChoiceID");
		getPlacementAdviceService.getPlacementAdvice("networkName", "subscriptionID", "numberOfVMs", networkOptionHolder, computeOptionHolder);
	}
}
