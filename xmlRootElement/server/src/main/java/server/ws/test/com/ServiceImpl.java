package server.ws.test.com;

import javax.jws.WebService;

@WebService(serviceName="ServiceService", 
	portName="ServicePort",
	wsdlLocation="WEB-INF/wsdl/TestWS.wsdl",
	endpointInterface="server.ws.test.com.Service")
public class ServiceImpl implements Service {

	@Override
	public ServiceOutput serviceMethod(ServiceInput testObject) {
		return new ServiceOutput();
	}

}
