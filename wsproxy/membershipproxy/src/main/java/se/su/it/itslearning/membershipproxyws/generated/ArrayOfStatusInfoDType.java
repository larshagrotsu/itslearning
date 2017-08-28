
package se.su.it.itslearning.membershipproxyws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatusInfoDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatusInfoDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statusInfo" type="{http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0}StatusInfoDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatusInfoDType", namespace = "http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0", propOrder = {
    "statusInfo"
})
public class ArrayOfStatusInfoDType {

    @XmlElement(nillable = true)
    protected List<StatusInfoDType> statusInfo;

    /**
     * Gets the value of the statusInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusInfoDType }
     * 
     * 
     */
    public List<StatusInfoDType> getStatusInfo() {
        if (statusInfo == null) {
            statusInfo = new ArrayList<StatusInfoDType>();
        }
        return this.statusInfo;
    }

}
