
package fr.dcns.myn.scf.gatewaysysext.vms;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retourType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="retourType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERREUR_REQUETE"/>
 *     &lt;enumeration value="SUCCES_REQUETE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "retourType")
@XmlEnum
public enum RetourType {

    ERREUR_REQUETE,
    SUCCES_REQUETE;

    public String value() {
        return name();
    }

    public static RetourType fromValue(String v) {
        return valueOf(v);
    }

}
