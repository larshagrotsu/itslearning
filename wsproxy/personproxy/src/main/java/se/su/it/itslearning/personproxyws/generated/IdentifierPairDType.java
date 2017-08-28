
package se.su.it.itslearning.personproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentifierPairDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifierPairDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secondId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierPairDType", namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0", propOrder = {
    "firstId",
    "secondId"
})
public class IdentifierPairDType {

    protected String firstId;
    protected String secondId;

    /**
     * Gets the value of the firstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstId() {
        return firstId;
    }

    /**
     * Sets the value of the firstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstId(String value) {
        this.firstId = value;
    }

    /**
     * Gets the value of the secondId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondId() {
        return secondId;
    }

    /**
     * Sets the value of the secondId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondId(String value) {
        this.secondId = value;
    }

}
