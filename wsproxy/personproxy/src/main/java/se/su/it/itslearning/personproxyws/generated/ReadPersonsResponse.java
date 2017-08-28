
package se.su.it.itslearning.personproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="personSet" type="{http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0}ArrayOfPerson" minOccurs="0"/&gt;
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
    "personSet"
})
@XmlRootElement(name = "readPersonsResponse")
public class ReadPersonsResponse {

    protected ArrayOfPerson personSet;

    /**
     * Gets the value of the personSet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPerson }
     *     
     */
    public ArrayOfPerson getPersonSet() {
        return personSet;
    }

    /**
     * Sets the value of the personSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPerson }
     *     
     */
    public void setPersonSet(ArrayOfPerson value) {
        this.personSet = value;
    }

}
