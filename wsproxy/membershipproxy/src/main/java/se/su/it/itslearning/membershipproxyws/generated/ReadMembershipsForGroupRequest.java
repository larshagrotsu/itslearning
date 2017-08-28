
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
 *         &lt;element name="groupSourcedId" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0}BaseId"&gt;
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
    "groupSourcedId"
})
@XmlRootElement(name = "readMembershipsForGroupRequest")
public class ReadMembershipsForGroupRequest {

    protected ReadMembershipsForGroupRequest.GroupSourcedId groupSourcedId;

    /**
     * Gets the value of the groupSourcedId property.
     * 
     * @return
     *     possible object is
     *     {@link ReadMembershipsForGroupRequest.GroupSourcedId }
     *     
     */
    public ReadMembershipsForGroupRequest.GroupSourcedId getGroupSourcedId() {
        return groupSourcedId;
    }

    /**
     * Sets the value of the groupSourcedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadMembershipsForGroupRequest.GroupSourcedId }
     *     
     */
    public void setGroupSourcedId(ReadMembershipsForGroupRequest.GroupSourcedId value) {
        this.groupSourcedId = value;
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
