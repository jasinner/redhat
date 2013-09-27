package com.redhat.gss.example.ws;


import javax.xml.ws.Holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fusesource.demo.customer.Customer;
import com.fusesource.demo.wsdl.customerservice.CustomerService;

public class CustomerServiceWS implements CustomerService{

	public static final Logger logger = LoggerFactory.getLogger(CustomerServiceWS.class);


	@Override
	public void getCustomerStatus(String customerId, Holder<String> status,
			Holder<String> statusMessage) {
		logger.info("getCustomerStatus called");
		
	}


	@Override
	public Customer lookupCustomer(String customerId) {
		logger.info("lookupCustomer called");
		return new Customer();
	}


	@Override
	public void updateCustomer(Customer cust) {
		logger.info("updateCustomer called");
		
	}

}
