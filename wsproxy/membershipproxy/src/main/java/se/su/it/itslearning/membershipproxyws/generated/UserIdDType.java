
package se.su.it.itslearning.membershipproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserIdDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIdDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userIdValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pwEncryptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authenticationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdDType", namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0", propOrder = {
    "userIdValue",
    "userIdType",
    "passWord",
    "pwEncryptionType",
    "authenticationType"
})
public class UserIdDType {

    protected String userIdValue;
    protected String userIdType;
    protected String passWord;
    protected String pwEncryptionType;
    protected String authenticationType;

    /**
     * Gets the value of the userIdValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdValue() {
        return userIdValue;
    }

    /**
     * Sets the value of the userIdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdValue(String value) {
        this.userIdValue = value;
    }

    /**
     * Gets the value of the userIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdType() {
        return userIdType;
    }

    /**
     * Sets the value of the userIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdType(String value) {
        this.userIdType = value;
    }

    /**
     * Gets the value of the passWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * Sets the value of the passWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassWord(String value) {
        this.passWord = value;
    }

    /**
     * Gets the value of the pwEncryptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwEncryptionType() {
        return pwEncryptionType;
    }

    /**
     * Sets the value of the pwEncryptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwEncryptionType(String value) {
        this.pwEncryptionType = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationType(String value) {
        this.authenticationType = value;
    }

}
