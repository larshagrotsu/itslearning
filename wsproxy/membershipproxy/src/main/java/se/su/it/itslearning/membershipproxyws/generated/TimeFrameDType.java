
package se.su.it.itslearning.membershipproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeFrameDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeFrameDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="begin" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}RestrictDateDType"/&gt;
 *         &lt;element name="end" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}RestrictDateDType"/&gt;
 *         &lt;element name="adminPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeFrameDType", namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0", propOrder = {
    "begin",
    "end",
    "adminPeriod"
})
public class TimeFrameDType {

    @XmlElement(required = true, nillable = true)
    protected RestrictDateDType begin;
    @XmlElement(required = true, nillable = true)
    protected RestrictDateDType end;
    protected String adminPeriod;

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictDateDType }
     *     
     */
    public RestrictDateDType getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictDateDType }
     *     
     */
    public void setBegin(RestrictDateDType value) {
        this.begin = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictDateDType }
     *     
     */
    public RestrictDateDType getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictDateDType }
     *     
     */
    public void setEnd(RestrictDateDType value) {
        this.end = value;
    }

    /**
     * Gets the value of the adminPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminPeriod() {
        return adminPeriod;
    }

    /**
     * Sets the value of the adminPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminPeriod(String value) {
        this.adminPeriod = value;
    }

}
