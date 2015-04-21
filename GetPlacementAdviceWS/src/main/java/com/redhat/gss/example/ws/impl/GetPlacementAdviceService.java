package com.redhat.gss.example.ws.impl;

import javax.jws.WebService;
import javax.xml.ws.Holder;

import com.redhat.gss.example.ws.GetPlacementAdvicePortType;

@WebService(serviceName = "GetPlacementAdviceService", portName = "getPlacementAdvise", name = "getPlacementAdvise", endpointInterface = "com.redhat.gss.example.ws.GetPlacementAdvicePortType", targetNamespace = "urn:PSL_CLM_GetPlacementAdvice")
public class GetPlacementAdviceService implements GetPlacementAdvicePortType {

	@Override
	public void getPlacementAdvice(String networkName, String subscriptionID,
			String numberOfVMs, Holder<String> networkOptionChoiceID,
			Holder<String> computeOptionChoiceID) {
		networkOptionChoiceID.value = "networkOptionChoice";
		computeOptionChoiceID.value = "computeOptionChoice";
	}

}
