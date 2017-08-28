
package se.su.it.itslearning.personproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="telType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *               &lt;enumeration value="4"/&gt;
 *               &lt;enumeration value="Voice"/&gt;
 *               &lt;enumeration value="Fax"/&gt;
 *               &lt;enumeration value="Mobile"/&gt;
 *               &lt;enumeration value="Pager"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="telValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelDType", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0", propOrder = {
    "telType",
    "telValue"
})
public class TelDType {

    protected String telType;
    protected String telValue;

    /**
     * Gets the value of the telType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelType() {
        return telType;
    }

    /**
     * Sets the value of the telType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelType(String value) {
        this.telType = value;
    }

    /**
     * Gets the value of the telValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelValue() {
        return telValue;
    }

    /**
     * Sets the value of the telValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelValue(String value) {
        this.telValue = value;
    }

}
