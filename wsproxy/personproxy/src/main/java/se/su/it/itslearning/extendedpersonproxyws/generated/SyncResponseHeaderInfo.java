
package se.su.it.itslearning.extendedpersonproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="messageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusInfo" type="{http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0}StatusInfoDType" minOccurs="0"/&gt;
 *         &lt;element name="statusInfoSet" type="{http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0}ArrayOfStatusInfoDType" minOccurs="0"/&gt;
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
    "messageIdentifier",
    "statusInfo",
    "statusInfoSet"
})
@XmlRootElement(name = "syncResponseHeaderInfo", namespace = "http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0")
public class SyncResponseHeaderInfo {

    @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0")
    protected String messageIdentifier;
    @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0")
    protected StatusInfoDType statusInfo;
    @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0")
    protected ArrayOfStatusInfoDType statusInfoSet;

    /**
     * Gets the value of the messageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Sets the value of the messageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageIdentifier(String value) {
        this.messageIdentifier = value;
    }

    /**
     * Gets the value of the statusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatusInfoDType }
     *     
     */
    public StatusInfoDType getStatusInfo() {
        return statusInfo;
    }

    /**
     * Sets the value of the statusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusInfoDType }
     *     
     */
    public void setStatusInfo(StatusInfoDType value) {
        this.statusInfo = value;
    }

    /**
     * Gets the value of the statusInfoSet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStatusInfoDType }
     *     
     */
    public ArrayOfStatusInfoDType getStatusInfoSet() {
        return statusInfoSet;
    }

    /**
     * Sets the value of the statusInfoSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStatusInfoDType }
     *     
     */
    public void setStatusInfoSet(ArrayOfStatusInfoDType value) {
        this.statusInfoSet = value;
    }

}
