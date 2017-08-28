
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
 *         &lt;element name="membershipIdPairSet" type="{http://www.imsglobal.org/services/mms/xsd/imsMemberManMessSchema_v1p0}ArrayOfMembershipIdPairDType" minOccurs="0"/&gt;
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
    "membershipIdPairSet"
})
@XmlRootElement(name = "updateMembershipsRequest")
public class UpdateMembershipsRequest {

    protected ArrayOfMembershipIdPairDType membershipIdPairSet;

    /**
     * Gets the value of the membershipIdPairSet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMembershipIdPairDType }
     *     
     */
    public ArrayOfMembershipIdPairDType getMembershipIdPairSet() {
        return membershipIdPairSet;
    }

    /**
     * Sets the value of the membershipIdPairSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMembershipIdPairDType }
     *     
     */
    public void setMembershipIdPairSet(ArrayOfMembershipIdPairDType value) {
        this.membershipIdPairSet = value;
    }

}
