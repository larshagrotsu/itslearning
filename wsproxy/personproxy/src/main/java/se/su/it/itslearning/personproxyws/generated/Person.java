
package se.su.it.itslearning.personproxyws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formatName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0}NameDType" minOccurs="0"/&gt;
 *         &lt;element name="recordInfo" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}RecordMetaDataDType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}email" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}URL" minOccurs="0"/&gt;
 *         &lt;element name="systemRole" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="SysAdmin"/&gt;
 *               &lt;enumeration value="SysSupport"/&gt;
 *               &lt;enumeration value="Creator"/&gt;
 *               &lt;enumeration value="AccountAdmin"/&gt;
 *               &lt;enumeration value="User"/&gt;
 *               &lt;enumeration value="Administrator"/&gt;
 *               &lt;enumeration value="None"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userId" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}UserIdDType" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0}AddressDType" minOccurs="0"/&gt;
 *         &lt;element name="demographics" type="{http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0}DemographicsDType" minOccurs="0"/&gt;
 *         &lt;element name="institutionRole" type="{http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0}InstitutionRoleDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tel" type="{http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0}TelDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="photo" type="{http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0}PhotoDType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}dataSource" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0}extensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0", propOrder = {
    "formatName",
    "name",
    "recordInfo",
    "email",
    "url",
    "systemRole",
    "userId",
    "address",
    "demographics",
    "institutionRole",
    "tel",
    "photo",
    "dataSource",
    "extension"
})
public class Person {

    @XmlElement(required = true, nillable = true)
    protected String formatName;
    protected NameDType name;
    protected RecordMetaDataDType recordInfo;
    @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0")
    protected String email;
    @XmlElement(name = "URL", namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0")
    protected String url;
    protected String systemRole;
    protected UserIdDType userId;
    protected AddressDType address;
    protected DemographicsDType demographics;
    protected List<InstitutionRoleDType> institutionRole;
    protected List<TelDType> tel;
    protected PhotoDType photo;
    @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0")
    protected String dataSource;
    protected ExtensionType extension;

    /**
     * Gets the value of the formatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatName() {
        return formatName;
    }

    /**
     * Sets the value of the formatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatName(String value) {
        this.formatName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameDType }
     *     
     */
    public NameDType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameDType }
     *     
     */
    public void setName(NameDType value) {
        this.name = value;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the systemRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemRole() {
        return systemRole;
    }

    /**
     * Sets the value of the systemRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemRole(String value) {
        this.systemRole = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDType }
     *     
     */
    public AddressDType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDType }
     *     
     */
    public void setAddress(AddressDType value) {
        this.address = value;
    }

    /**
     * Gets the value of the demographics property.
     * 
     * @return
     *     possible object is
     *     {@link DemographicsDType }
     *     
     */
    public DemographicsDType getDemographics() {
        return demographics;
    }

    /**
     * Sets the value of the demographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicsDType }
     *     
     */
    public void setDemographics(DemographicsDType value) {
        this.demographics = value;
    }

    /**
     * Gets the value of the institutionRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the institutionRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstitutionRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstitutionRoleDType }
     * 
     * 
     */
    public List<InstitutionRoleDType> getInstitutionRole() {
        if (institutionRole == null) {
            institutionRole = new ArrayList<InstitutionRoleDType>();
        }
        return this.institutionRole;
    }

    /**
     * Gets the value of the tel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelDType }
     * 
     * 
     */
    public List<TelDType> getTel() {
        if (tel == null) {
            tel = new ArrayList<TelDType>();
        }
        return this.tel;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     {@link PhotoDType }
     *     
     */
    public PhotoDType getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoDType }
     *     
     */
    public void setPhoto(PhotoDType value) {
        this.photo = value;
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
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

}
