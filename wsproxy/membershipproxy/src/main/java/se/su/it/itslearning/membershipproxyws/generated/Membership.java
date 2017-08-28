
package se.su.it.itslearning.membershipproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for membership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="membership"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupSourcedId" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0}BaseId"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="member" type="{http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0}MemberDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "membership", namespace = "http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0", propOrder = {
    "groupSourcedId",
    "member"
})
public class Membership {

    protected Membership.GroupSourcedId groupSourcedId;
    protected MemberDType member;

    /**
     * Gets the value of the groupSourcedId property.
     * 
     * @return
     *     possible object is
     *     {@link Membership.GroupSourcedId }
     *     
     */
    public Membership.GroupSourcedId getGroupSourcedId() {
        return groupSourcedId;
    }

    /**
     * Sets the value of the groupSourcedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Membership.GroupSourcedId }
     *     
     */
    public void setGroupSourcedId(Membership.GroupSourcedId value) {
        this.groupSourcedId = value;
    }

    /**
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link MemberDType }
     *     
     */
    public MemberDType getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberDType }
     *     
     */
    public void setMember(MemberDType value) {
        this.member = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0}BaseId"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GroupSourcedId
        extends BaseId2
    {


    }

}
