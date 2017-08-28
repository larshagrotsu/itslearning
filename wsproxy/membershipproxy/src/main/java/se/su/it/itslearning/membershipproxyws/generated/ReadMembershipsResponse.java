
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
 *         &lt;element name="membershipSet" type="{http://www.imsglobal.org/services/mms/xsd/imsMemberManMessSchema_v1p0}ArrayOfMembership" minOccurs="0"/&gt;
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
    "membershipSet"
})
@XmlRootElement(name = "readMembershipsResponse")
public class ReadMembershipsResponse {

    protected ArrayOfMembership membershipSet;

    /**
     * Gets the value of the membershipSet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMembership }
     *     
     */
    public ArrayOfMembership getMembershipSet() {
        return membershipSet;
    }

    /**
     * Sets the value of the membershipSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMembership }
     *     
     */
    public void setMembershipSet(ArrayOfMembership value) {
        this.membershipSet = value;
    }

}
