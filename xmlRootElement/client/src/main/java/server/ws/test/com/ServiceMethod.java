
package server.ws.test.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testObject" type="{http://com.test.ws.server/}serviceInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceMethod", propOrder = {
    "testObject"
})
public class ServiceMethod {

    @XmlElement(namespace = "")
    protected ServiceInput testObject;

    /**
     * Gets the value of the testObject property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInput }
     *     
     */
    public ServiceInput getTestObject() {
        return testObject;
    }

    /**
     * Sets the value of the testObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInput }
     *     
     */
    public void setTestObject(ServiceInput value) {
        this.testObject = value;
    }

}
