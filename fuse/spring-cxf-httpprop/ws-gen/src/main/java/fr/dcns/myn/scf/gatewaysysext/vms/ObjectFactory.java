
package fr.dcns.myn.scf.gatewaysysext.vms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.dcns.myn.scf.gatewaysysext.vms package. 
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

    private final static QName _SubmitResponse_QNAME = new QName("http://vms.gatewaySysExt.scf.myn.dcns.fr/", "submitResponse");
    private final static QName _Submit_QNAME = new QName("http://vms.gatewaySysExt.scf.myn.dcns.fr/", "submit");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.dcns.myn.scf.gatewaysysext.vms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Submit }
     * 
     */
    public Submit createSubmit() {
        return new Submit();
    }

    /**
     * Create an instance of {@link SubmitResponse }
     * 
     */
    public SubmitResponse createSubmitResponse() {
        return new SubmitResponse();
    }

    /**
     * Create an instance of {@link MessageRetour }
     * 
     */
    public MessageRetour createMessageRetour() {
        return new MessageRetour();
    }

    /**
     * Create an instance of {@link VmsPos }
     * 
     */
    public VmsPos createVmsPos() {
        return new VmsPos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vms.gatewaySysExt.scf.myn.dcns.fr/", name = "submitResponse")
    public JAXBElement<SubmitResponse> createSubmitResponse(SubmitResponse value) {
        return new JAXBElement<SubmitResponse>(_SubmitResponse_QNAME, SubmitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Submit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vms.gatewaySysExt.scf.myn.dcns.fr/", name = "submit")
    public JAXBElement<Submit> createSubmit(Submit value) {
        return new JAXBElement<Submit>(_Submit_QNAME, Submit.class, null, value);
    }

}
