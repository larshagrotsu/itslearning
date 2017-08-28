
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
 *         &lt;element name="membershipIDPairSet" type="{http://www.imsglobal.org/services/mms/xsd/imsMemberManMessSchema_v1p0}ArrayOfMembershipIdPairDType" minOccurs="0"/&gt;
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
    "membershipIDPairSet"
})
@XmlRootElement(name = "readMembershipsForGroupResponse")
public class ReadMembershipsForGroupResponse {

    protected ArrayOfMembershipIdPairDType membershipIDPairSet;

    /**
     * Gets the value of the membershipIDPairSet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMembershipIdPairDType }
     *     
     */
    public ArrayOfMembershipIdPairDType getMembershipIDPairSet() {
        return membershipIDPairSet;
    }

    /**
     * Sets the value of the membershipIDPairSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMembershipIdPairDType }
     *     
     */
    public void setMembershipIDPairSet(ArrayOfMembershipIdPairDType value) {
        this.membershipIDPairSet = value;
    }

}
