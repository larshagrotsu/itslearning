
package se.su.it.itslearning.extendedpersonproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CreatedFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="OnlyManuallyCreatedUsers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ConvertFromManual" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "pageIndex",
    "pageSize",
    "createdFrom",
    "onlyManuallyCreatedUsers",
    "convertFromManual"
})
@XmlRootElement(name = "readAllPersonsRequest", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0")
public class ReadAllPersonsRequest {

    @XmlElement(name = "PageIndex", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0", required = true, type = Integer.class, nillable = true)
    protected Integer pageIndex;
    @XmlElement(name = "PageSize", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0", required = true, type = Integer.class, nillable = true)
    protected Integer pageSize;
    @XmlElement(name = "CreatedFrom", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdFrom;
    @XmlElement(name = "OnlyManuallyCreatedUsers", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0", required = true, type = Boolean.class, nillable = true)
    protected Boolean onlyManuallyCreatedUsers;
    @XmlElement(name = "ConvertFromManual", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0", required = true, type = Boolean.class, nillable = true)
    protected Boolean convertFromManual;

    /**
     * Gets the value of the pageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the createdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedFrom() {
        return createdFrom;
    }

    /**
     * Sets the value of the createdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedFrom(XMLGregorianCalendar value) {
        this.createdFrom = value;
    }

    /**
     * Gets the value of the onlyManuallyCreatedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyManuallyCreatedUsers() {
        return onlyManuallyCreatedUsers;
    }

    /**
     * Sets the value of the onlyManuallyCreatedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyManuallyCreatedUsers(Boolean value) {
        this.onlyManuallyCreatedUsers = value;
    }

    /**
     * Gets the value of the convertFromManual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvertFromManual() {
        return convertFromManual;
    }

    /**
     * Sets the value of the convertFromManual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvertFromManual(Boolean value) {
        this.convertFromManual = value;
    }

}
