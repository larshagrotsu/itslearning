
package se.su.it.itslearning.membershipproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}identifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseId", propOrder = {
    "identifier"
})
@XmlSeeAlso({
    se.su.it.itslearning.membershipproxyws.generated.CreateMembershipRequest.SourcedId.class,
    se.su.it.itslearning.membershipproxyws.generated.DeleteMembershipRequest.SourcedId.class,
    se.su.it.itslearning.membershipproxyws.generated.ReadMembershipRequest.SourcedId.class,
    se.su.it.itslearning.membershipproxyws.generated.UpdateMembershipRequest.SourcedId.class,
    se.su.it.itslearning.membershipproxyws.generated.ReplaceMembershipRequest.SourcedId.class,
    se.su.it.itslearning.membershipproxyws.generated.ChangeMembershipIdentifierRequest.SourcedId.class,
    se.su.it.itslearning.membershipproxyws.generated.ChangeMembershipIdentifierRequest.NewSourcedId.class,
    se.su.it.itslearning.membershipproxyws.generated.ReadMembershipsForPersonRequest.PersonSourcedId.class,
    se.su.it.itslearning.membershipproxyws.generated.MembershipIdPairDType.SourcedId.class
})
public class BaseId {

    @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0")
    protected String identifier;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}
