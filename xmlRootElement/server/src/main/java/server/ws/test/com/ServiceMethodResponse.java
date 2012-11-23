
package server.ws.test.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceMethodResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceMethodResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testObjectResult" type="{http://com.test.ws.server/}serviceOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceMethodResponse", propOrder = {
    "testObjectResult"
})
public class ServiceMethodResponse {

    @XmlElement(namespace = "")
    protected ServiceOutput testObjectResult;

    /**
     * Gets the value of the testObjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOutput }
     *     
     */
    public ServiceOutput getTestObjectResult() {
        return testObjectResult;
    }

    /**
     * Sets the value of the testObjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOutput }
     *     
     */
    public void setTestObjectResult(ServiceOutput value) {
        this.testObjectResult = value;
    }

}
