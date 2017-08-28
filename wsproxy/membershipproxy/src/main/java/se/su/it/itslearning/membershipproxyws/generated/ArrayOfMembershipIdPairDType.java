
package se.su.it.itslearning.membershipproxyws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMembershipIdPairDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMembershipIdPairDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="membershipIdPair" type="{http://www.imsglobal.org/services/mms/xsd/imsMemberManMessSchema_v1p0}MembershipIdPairDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMembershipIdPairDType", propOrder = {
    "membershipIdPair"
})
public class ArrayOfMembershipIdPairDType {

    protected List<MembershipIdPairDType> membershipIdPair;

    /**
     * Gets the value of the membershipIdPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membershipIdPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembershipIdPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MembershipIdPairDType }
     * 
     * 
     */
    public List<MembershipIdPairDType> getMembershipIdPair() {
        if (membershipIdPair == null) {
            membershipIdPair = new ArrayList<MembershipIdPairDType>();
        }
        return this.membershipIdPair;
    }

}
