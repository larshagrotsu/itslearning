
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
 *         &lt;element name="sourcedId" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0}BaseId"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="newSourcedId" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0}BaseId"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "sourcedId",
    "newSourcedId"
})
@XmlRootElement(name = "changePersonIdentifierRequest")
public class ChangePersonIdentifierRequest {

    protected ChangePersonIdentifierRequest.SourcedId sourcedId;
    protected ChangePersonIdentifierRequest.NewSourcedId newSourcedId;

    /**
     * Gets the value of the sourcedId property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePersonIdentifierRequest.SourcedId }
     *     
     */
    public ChangePersonIdentifierRequest.SourcedId getSourcedId() {
        return sourcedId;
    }

    /**
     * Sets the value of the sourcedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePersonIdentifierRequest.SourcedId }
     *     
     */
    public void setSourcedId(ChangePersonIdentifierRequest.SourcedId value) {
        this.sourcedId = value;
    }

    /**
     * Gets the value of the newSourcedId property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePersonIdentifierRequest.NewSourcedId }
     *     
     */
    public ChangePersonIdentifierRequest.NewSourcedId getNewSourcedId() {
        return newSourcedId;
    }

    /**
     * Sets the value of the newSourcedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePersonIdentifierRequest.NewSourcedId }
     *     
     */
    public void setNewSourcedId(ChangePersonIdentifierRequest.NewSourcedId value) {
        this.newSourcedId = value;
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
    public static class NewSourcedId
        extends BaseId
    {


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
