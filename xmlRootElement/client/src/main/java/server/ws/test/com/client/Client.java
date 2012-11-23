package server.ws.test.com.client;

import server.ws.test.com.Service;
import server.ws.test.com.ServiceInput;
import server.ws.test.com.ServiceService;
import server.ws.test.com.entity.header.Header;

public class Client {
	private ServiceService service;

	public Client(){
		service = new ServiceService();
	}
	
	public boolean invoke(){
		try{
			Service port = service.getPort(Service.class);
			ServiceInput input = getInput();
			port.serviceMethod(input);
			return true;
		}catch(Exception e){
			throw new IllegalStateException(e);
		}
	}

	private ServiceInput getInput() {
		ServiceInput input = new ServiceInput();
		Header header = new Header();
		header.setRepetitionCount(1);
		input.setHeader(header);
		return input;
	}
	
	public static void main(String[] args){
		Client client = new Client();
		if(client.invoke())
			System.out.println("Service invoked sucessfully");
		else
			System.out.println("Service was NOT invoked");
	}
}
