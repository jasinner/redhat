package com.redhat.gss.wss;

import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;
import org.jboss.ws.api.annotation.EndpointConfig;

@WebService(targetNamespace = "http://wss.gss.redhat.com/", 
	serviceName = "SecureServiceService",
	endpointInterface="com.redhat.gss.wss.SecureService",
	wsdlLocation="WEB-INF/wsdl/secureService.wsdl",
	portName = "SecureServicePort")
@EndpointConfig(configFile = "WEB-INF/jaxws-endpoint-config.xml", configName = "Custom WS-Security Endpoint")
@InInterceptors(interceptors = {
      "org.jboss.wsf.stack.cxf.security.authentication.SubjectCreatingPolicyInterceptor",
      "com.redhat.gss.wsse.policy.jaas.POJOEndpointAuthorizationInterceptor"}
)
public class SecureServiceImpl implements SecureService {

	@Override
	public String sayGoodbye(String arg0) {
		return "Goodbye " + arg0;
	}

	@Override
	public String sayHello(String arg0) {
		return "Hello " + arg0;
	}

}
