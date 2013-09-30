
package fr.dcns.myn.scf.gatewaysysext.vms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageRetour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageRetour">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageErreur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retourType" type="{http://vms.gatewaySysExt.scf.myn.dcns.fr/}retourType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageRetour", propOrder = {
    "messageErreur",
    "retourType"
})
public class MessageRetour {

    protected String messageErreur;
    protected RetourType retourType;

    /**
     * Gets the value of the messageErreur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageErreur() {
        return messageErreur;
    }

    /**
     * Sets the value of the messageErreur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageErreur(String value) {
        this.messageErreur = value;
    }

    /**
     * Gets the value of the retourType property.
     * 
     * @return
     *     possible object is
     *     {@link RetourType }
     *     
     */
    public RetourType getRetourType() {
        return retourType;
    }

    /**
     * Sets the value of the retourType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetourType }
     *     
     */
    public void setRetourType(RetourType value) {
        this.retourType = value;
    }

}
