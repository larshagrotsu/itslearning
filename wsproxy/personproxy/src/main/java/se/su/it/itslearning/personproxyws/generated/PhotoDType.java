
package se.su.it.itslearning.personproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhotoDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhotoDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhotoDType", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0", propOrder = {
    "imgType",
    "extRef"
})
public class PhotoDType {

    protected String imgType;
    protected String extRef;

    /**
     * Gets the value of the imgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgType() {
        return imgType;
    }

    /**
     * Sets the value of the imgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgType(String value) {
        this.imgType = value;
    }

    /**
     * Gets the value of the extRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtRef() {
        return extRef;
    }

    /**
     * Sets the value of the extRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtRef(String value) {
        this.extRef = value;
    }

}
