
package se.su.it.itslearning.membershipproxyws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RoleDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roleType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Learner"/&gt;
 *               &lt;enumeration value="Instructor"/&gt;
 *               &lt;enumeration value="ContentDeveloper"/&gt;
 *               &lt;enumeration value="Member"/&gt;
 *               &lt;enumeration value="Manager"/&gt;
 *               &lt;enumeration value="Mentor"/&gt;
 *               &lt;enumeration value="Administrator"/&gt;
 *               &lt;enumeration value="TeachingAssistant"/&gt;
 *               &lt;enumeration value="01"/&gt;
 *               &lt;enumeration value="02"/&gt;
 *               &lt;enumeration value="03"/&gt;
 *               &lt;enumeration value="04"/&gt;
 *               &lt;enumeration value="05"/&gt;
 *               &lt;enumeration value="06"/&gt;
 *               &lt;enumeration value="07"/&gt;
 *               &lt;enumeration value="08"/&gt;
 *               &lt;enumeration value="Default"/&gt;
 *               &lt;enumeration value="Guest"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordInfo" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}RecordMetaDataDType" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}UserIdDType" minOccurs="0"/&gt;
 *         &lt;element name="timeFrame" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}TimeFrameDType" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}email" minOccurs="0"/&gt;
 *         &lt;element name="interimResult" type="{http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0}ResultDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="finalResult" type="{http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0}ResultDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}dataSource" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}ArrayOfExtensionField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleDType", namespace = "http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0", propOrder = {
    "roleType",
    "subRole",
    "recordInfo",
    "userId",
    "timeFrame",
    "status",
    "dateTime",
    "email",
    "interimResult",
    "finalResult",
    "dataSource",
    "extension"
})
public class RoleDType {

    @XmlElement(required = true)
    protected String roleType;
    protected String subRole;
    protected RecordMetaDataDType recordInfo;
    protected UserIdDType userId;
    protected TimeFrameDType timeFrame;
    protected Boolean status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0")
    protected String email;
    protected List<ResultDType> interimResult;
    protected List<ResultDType> finalResult;
    @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0")
    protected String dataSource;
    protected ArrayOfExtensionField extension;

    /**
     * Gets the value of the roleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * Sets the value of the roleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleType(String value) {
        this.roleType = value;
    }

    /**
     * Gets the value of the subRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRole() {
        return subRole;
    }

    /**
     * Sets the value of the subRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRole(String value) {
        this.subRole = value;
    }

    /**
     * Gets the value of the recordInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecordMetaDataDType }
     *     
     */
    public RecordMetaDataDType getRecordInfo() {
        return recordInfo;
    }

    /**
     * Sets the value of the recordInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordMetaDataDType }
     *     
     */
    public void setRecordInfo(RecordMetaDataDType value) {
        this.recordInfo = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdDType }
     *     
     */
    public UserIdDType getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdDType }
     *     
     */
    public void setUserId(UserIdDType value) {
        this.userId = value;
    }

    /**
     * Gets the value of the timeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrameDType }
     *     
     */
    public TimeFrameDType getTimeFrame() {
        return timeFrame;
    }

    /**
     * Sets the value of the timeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrameDType }
     *     
     */
    public void setTimeFrame(TimeFrameDType value) {
        this.timeFrame = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the interimResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interimResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterimResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultDType }
     * 
     * 
     */
    public List<ResultDType> getInterimResult() {
        if (interimResult == null) {
            interimResult = new ArrayList<ResultDType>();
        }
        return this.interimResult;
    }

    /**
     * Gets the value of the finalResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finalResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinalResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultDType }
     * 
     * 
     */
    public List<ResultDType> getFinalResult() {
        if (finalResult == null) {
            finalResult = new ArrayList<ResultDType>();
        }
        return this.finalResult;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtensionField }
     *     
     */
    public ArrayOfExtensionField getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtensionField }
     *     
     */
    public void setExtension(ArrayOfExtensionField value) {
        this.extension = value;
    }

}
