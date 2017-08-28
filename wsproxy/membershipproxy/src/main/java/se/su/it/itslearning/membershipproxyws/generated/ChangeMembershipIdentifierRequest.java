
package se.su.it.itslearning.membershipproxyws.generated;

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
 *               &lt;extension base="{http://www.imsglobal.org/services/mms/xsd/imsMemberManMessSchema_v1p0}BaseId"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="newSourcedId" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.imsglobal.org/services/mms/xsd/imsMemberManMessSchema_v1p0}BaseId"&gt;
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
@XmlRootElement(name = "changeMembershipIdentifierRequest")
public class ChangeMembershipIdentifierRequest {

    protected ChangeMembershipIdentifierRequest.SourcedId sourcedId;
    protected ChangeMembershipIdentifierRequest.NewSourcedId newSourcedId;

    /**
     * Gets the value of the sourcedId property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeMembershipIdentifierRequest.SourcedId }
     *     
     */
    public ChangeMembershipIdentifierRequest.SourcedId getSourcedId() {
        return sourcedId;
    }

    /**
     * Sets the value of the sourcedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeMembershipIdentifierRequest.SourcedId }
     *     
     */
    public void setSourcedId(ChangeMembershipIdentifierRequest.SourcedId value) {
        this.sourcedId = value;
    }

    /**
     * Gets the value of the newSourcedId property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeMembershipIdentifierRequest.NewSourcedId }
     *     
     */
    public ChangeMembershipIdentifierRequest.NewSourcedId getNewSourcedId() {
        return newSourcedId;
    }

    /**
     * Sets the value of the newSourcedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeMembershipIdentifierRequest.NewSourcedId }
     *     
     */
    public void setNewSourcedId(ChangeMembershipIdentifierRequest.NewSourcedId value) {
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
     *     &lt;extension base="{http://www.imsglobal.org/services/mms/xsd/imsMemberManMessSchema_v1p0}BaseId"&gt;
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
     *     &lt;extension base="{http://www.imsglobal.org/services/mms/xsd/imsMemberManMessSchema_v1p0}BaseId"&gt;
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
