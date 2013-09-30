
package fr.dcns.myn.scf.gatewaysysext.vms;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for vmsPos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vmsPos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="DA" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="TI" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LT" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="LG" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="SP" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="CO" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="NA" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XR" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IR" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PA" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vmsPos")
public class VmsPos {

    @XmlAttribute(name = "DA", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar da;
    @XmlAttribute(name = "TI", required = true)
    protected String ti;
    @XmlAttribute(name = "LT", required = true)
    protected BigDecimal lt;
    @XmlAttribute(name = "LG", required = true)
    protected BigDecimal lg;
    @XmlAttribute(name = "SP", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sp;
    @XmlAttribute(name = "CO", required = true)
    protected int co;
    @XmlAttribute(name = "NA", required = true)
    protected String na;
    @XmlAttribute(name = "XR", required = true)
    protected String xr;
    @XmlAttribute(name = "RC")
    protected String rc;
    @XmlAttribute(name = "IR")
    protected String ir;
    @XmlAttribute(name = "PA", required = true)
    protected String pa;

    /**
     * Gets the value of the da property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDA() {
        return da;
    }

    /**
     * Sets the value of the da property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDA(XMLGregorianCalendar value) {
        this.da = value;
    }

    /**
     * Gets the value of the ti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTI() {
        return ti;
    }

    /**
     * Sets the value of the ti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTI(String value) {
        this.ti = value;
    }

    /**
     * Gets the value of the lt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLT() {
        return lt;
    }

    /**
     * Sets the value of the lt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLT(BigDecimal value) {
        this.lt = value;
    }

    /**
     * Gets the value of the lg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLG() {
        return lg;
    }

    /**
     * Sets the value of the lg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLG(BigDecimal value) {
        this.lg = value;
    }

    /**
     * Gets the value of the sp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSP() {
        return sp;
    }

    /**
     * Sets the value of the sp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSP(BigInteger value) {
        this.sp = value;
    }

    /**
     * Gets the value of the co property.
     * 
     */
    public int getCO() {
        return co;
    }

    /**
     * Sets the value of the co property.
     * 
     */
    public void setCO(int value) {
        this.co = value;
    }

    /**
     * Gets the value of the na property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNA() {
        return na;
    }

    /**
     * Sets the value of the na property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNA(String value) {
        this.na = value;
    }

    /**
     * Gets the value of the xr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXR() {
        return xr;
    }

    /**
     * Sets the value of the xr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXR(String value) {
        this.xr = value;
    }

    /**
     * Gets the value of the rc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRC() {
        return rc;
    }

    /**
     * Sets the value of the rc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRC(String value) {
        this.rc = value;
    }

    /**
     * Gets the value of the ir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIR() {
        return ir;
    }

    /**
     * Sets the value of the ir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIR(String value) {
        this.ir = value;
    }

    /**
     * Gets the value of the pa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPA() {
        return pa;
    }

    /**
     * Sets the value of the pa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPA(String value) {
        this.pa = value;
    }

}
