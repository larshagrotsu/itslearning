
package se.su.it.itslearning.personproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonIdPairDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIdPairDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourcedId" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0}BaseId"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="person" type="{http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0}person" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdPairDType", propOrder = {
    "sourcedId",
    "person"
})
public class PersonIdPairDType {

    protected PersonIdPairDType.SourcedId sourcedId;
    protected Person person;

    /**
     * Gets the value of the sourcedId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdPairDType.SourcedId }
     *     
     */
    public PersonIdPairDType.SourcedId getSourcedId() {
        return sourcedId;
    }

    /**
     * Sets the value of the sourcedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdPairDType.SourcedId }
     *     
     */
    public void setSourcedId(PersonIdPairDType.SourcedId value) {
        this.sourcedId = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0}BaseId"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SourcedId
        extends BaseId
    {


    }

}
