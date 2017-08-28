
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
 *         &lt;element name="sourcedIdSet" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}ArrayOfString" minOccurs="0"/&gt;
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
    "sourcedIdSet"
})
@XmlRootElement(name = "readMembershipsRequest")
public class ReadMembershipsRequest {

    protected ArrayOfString sourcedIdSet;

    /**
     * Gets the value of the sourcedIdSet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSourcedIdSet() {
        return sourcedIdSet;
    }

    /**
     * Sets the value of the sourcedIdSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSourcedIdSet(ArrayOfString value) {
        this.sourcedIdSet = value;
    }

}
