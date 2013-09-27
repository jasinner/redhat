
package com.fusesource.demo.wsdl.customerservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fusesource.demo.wsdl.customerservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fusesource.demo.wsdl.customerservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LookupCustomer }
     * 
     */
    public LookupCustomer createLookupCustomer() {
        return new LookupCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerStatus }
     * 
     */
    public GetCustomerStatus createGetCustomerStatus() {
        return new GetCustomerStatus();
    }

    /**
     * Create an instance of {@link GetCustomerStatusResponse }
     * 
     */
    public GetCustomerStatusResponse createGetCustomerStatusResponse() {
        return new GetCustomerStatusResponse();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link LookupCustomerResponse }
     * 
     */
    public LookupCustomerResponse createLookupCustomerResponse() {
        return new LookupCustomerResponse();
    }

}
