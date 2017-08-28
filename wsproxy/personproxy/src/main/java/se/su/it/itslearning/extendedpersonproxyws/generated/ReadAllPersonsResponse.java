
package se.su.it.itslearning.extendedpersonproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personIdPairSet" type="{http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0}ArrayOfPersonIdPairDType" minOccurs="0"/&gt;
 *         &lt;element name="virtualCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personIdPairSet",
    "virtualCount"
})
@XmlRootElement(name = "readAllPersonsResponse", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0")
public class ReadAllPersonsResponse {

    @XmlElement(namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0")
    protected ArrayOfPersonIdPairDType personIdPairSet;
    @XmlElement(namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0")
    protected int virtualCount;

    /**
     * Gets the value of the personIdPairSet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonIdPairDType }
     *     
     */
    public ArrayOfPersonIdPairDType getPersonIdPairSet() {
        return personIdPairSet;
    }

    /**
     * Sets the value of the personIdPairSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonIdPairDType }
     *     
     */
    public void setPersonIdPairSet(ArrayOfPersonIdPairDType value) {
        this.personIdPairSet = value;
    }

    /**
     * Gets the value of the virtualCount property.
     * 
     */
    public int getVirtualCount() {
        return virtualCount;
    }

    /**
     * Sets the value of the virtualCount property.
     * 
     */
    public void setVirtualCount(int value) {
        this.virtualCount = value;
    }

}
