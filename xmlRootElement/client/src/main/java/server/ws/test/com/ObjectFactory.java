
package server.ws.test.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server.ws.test.com package. 
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

    private final static QName _ServiceMethodResponse_QNAME = new QName("http://com.test.ws.server/", "serviceMethodResponse");
    private final static QName _ServiceInput_QNAME = new QName("http://com.test.ws.server/", "serviceInput");
    private final static QName _ServiceMethod_QNAME = new QName("http://com.test.ws.server/", "serviceMethod");
    private final static QName _ServiceOutput_QNAME = new QName("http://com.test.ws.server/", "serviceOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server.ws.test.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceMethod }
     * 
     */
    public ServiceMethod createServiceMethod() {
        return new ServiceMethod();
    }

    /**
     * Create an instance of {@link ServiceOutput }
     * 
     */
    public ServiceOutput createServiceOutput() {
        return new ServiceOutput();
    }

    /**
     * Create an instance of {@link ServiceInput }
     * 
     */
    public ServiceInput createServiceInput() {
        return new ServiceInput();
    }

    /**
     * Create an instance of {@link ServiceMethodResponse }
     * 
     */
    public ServiceMethodResponse createServiceMethodResponse() {
        return new ServiceMethodResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.test.ws.server/", name = "serviceMethodResponse")
    public JAXBElement<ServiceMethodResponse> createServiceMethodResponse(ServiceMethodResponse value) {
        return new JAXBElement<ServiceMethodResponse>(_ServiceMethodResponse_QNAME, ServiceMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.test.ws.server/", name = "serviceInput")
    public JAXBElement<ServiceInput> createServiceInput(ServiceInput value) {
        return new JAXBElement<ServiceInput>(_ServiceInput_QNAME, ServiceInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.test.ws.server/", name = "serviceMethod")
    public JAXBElement<ServiceMethod> createServiceMethod(ServiceMethod value) {
        return new JAXBElement<ServiceMethod>(_ServiceMethod_QNAME, ServiceMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.test.ws.server/", name = "serviceOutput")
    public JAXBElement<ServiceOutput> createServiceOutput(ServiceOutput value) {
        return new JAXBElement<ServiceOutput>(_ServiceOutput_QNAME, ServiceOutput.class, null, value);
    }

}
