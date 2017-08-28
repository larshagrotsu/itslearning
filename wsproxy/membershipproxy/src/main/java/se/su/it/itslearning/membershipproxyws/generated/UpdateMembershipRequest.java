
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
 *         &lt;element name="membership" type="{http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0}membership" minOccurs="0"/&gt;
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
    "membership"
})
@XmlRootElement(name = "updateMembershipRequest")
public class UpdateMembershipRequest {

    protected UpdateMembershipRequest.SourcedId sourcedId;
    protected Membership membership;

    /**
     * Gets the value of the sourcedId property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMembershipRequest.SourcedId }
     *     
     */
    public UpdateMembershipRequest.SourcedId getSourcedId() {
        return sourcedId;
    }

    /**
     * Sets the value of the sourcedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMembershipRequest.SourcedId }
     *     
     */
    public void setSourcedId(UpdateMembershipRequest.SourcedId value) {
        this.sourcedId = value;
    }

    /**
     * Gets the value of the membership property.
     * 
     * @return
     *     possible object is
     *     {@link Membership }
     *     
     */
    public Membership getMembership() {
        return membership;
    }

    /**
     * Sets the value of the membership property.
     * 
     * @param value
     *     allowed object is
     *     {@link Membership }
     *     
     */
    public void setMembership(Membership value) {
        this.membership = value;
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
