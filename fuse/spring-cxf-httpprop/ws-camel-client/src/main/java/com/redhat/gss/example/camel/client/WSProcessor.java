package com.redhat.gss.example.camel.client;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.RecipientList;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.CxfPayload;
import org.apache.camel.converter.jaxp.XmlConverter;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.apache.cxf.transports.http.configuration.ProxyServerType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import fr.dcns.myn.scf.gatewaysysext.vms.VmsRequestWsPortType;
import fr.dcns.myn.scf.gatewaysysext.vms.VmsRequestWsService;

public class WSProcessor {

	@RecipientList
	public Endpoint prepareMessageEndpoint(Exchange pExchange) throws Exception {
		Message msg = pExchange.getIn();
		
		String demande = (String) msg.getBody();

		// set the payload header with null
		List<Element> outElements = new ArrayList<Element>();
		XmlConverter converter = new XmlConverter();
		Document outDocument = converter.toDOMDocument("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><cus:getCustomerStatus xmlns:cus=\"http://demo.fusesource.com/wsdl/CustomerService/\"><customerId>1</customerId></cus:getCustomerStatus>");
        outElements.add(outDocument.getDocumentElement());

        CxfPayload<SoapHeader> responsePayload = new CxfPayload<SoapHeader>(null, outElements);
        msg.setBody(responsePayload);
        
		String uri = "http://localhost:8180/Customer?wsdl";
		String serviceName = "{http://demo.fusesource.com/wsdl/CustomerService/}CustomerService";
		String portName = "{http://demo.fusesource.com/wsdl/CustomerService/}SOAPOverHTTP";
		
		String wsUri = "cxf://" 
			+ (uri.replace("?WSDL", "")).replace("?wsdl", "")
			+ "?serviceName=" + serviceName
			+ "&portName="	+ portName
			+ "&wsdlURL="+ uri
			+ "&dataFormat=PAYLOAD";				
		
		CxfEndpoint cxfEndpoint = pExchange.getContext().getEndpoint(wsUri, CxfEndpoint.class);
		
/*		VmsRequestWsService vmsRequestWsService = new VmsRequestWsService();
		VmsRequestWsPortType vmsRequestWsPortType = vmsRequestWsService.getPort(new QName("http://vms.gatewaySysExt.scf.myn.dcns.fr/", "VmsRequestWsPort"), VmsRequestWsPortType.class);
		Client client = ClientProxy.getClient(vmsRequestWsPortType);
		HTTPConduit httpConduit = (HTTPConduit) client.getConduit();
		String proxyHost = "172.27.231.210";
		String proxyPort = "8080";
		if (proxyHost != null && !proxyHost.equals("")) {
			HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
			httpClientPolicy.setProxyServer(proxyHost);
			httpClientPolicy.setProxyServerPort(Integer.parseInt(proxyPort));
			httpClientPolicy.setProxyServerType(ProxyServerType.HTTP);
			httpConduit.setClient(httpClientPolicy);*/
		
		return cxfEndpoint;
	
	}
	
}
