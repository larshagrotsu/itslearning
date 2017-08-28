
package se.su.it.itslearning.personproxyws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="namePartType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="namePartValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "NameDType", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0", propOrder = {
    "nameType",
    "partName"
})
public class NameDType {

    protected String nameType;
    protected List<NameDType.PartName> partName;

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the partName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameDType.PartName }
     * 
     * 
     */
    public List<NameDType.PartName> getPartName() {
        if (partName == null) {
            partName = new ArrayList<NameDType.PartName>();
        }
        return this.partName;
    }


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
     *         &lt;element name="namePartType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="namePartValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "namePartType",
        "namePartValue"
    })
    public static class PartName {

        @XmlElement(namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0")
        protected String namePartType;
        @XmlElement(namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0")
        protected String namePartValue;

        /**
         * Gets the value of the namePartType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNamePartType() {
            return namePartType;
        }

        /**
         * Sets the value of the namePartType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNamePartType(String value) {
            this.namePartType = value;
        }

        /**
         * Gets the value of the namePartValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNamePartValue() {
            return namePartValue;
        }

        /**
         * Sets the value of the namePartValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNamePartValue(String value) {
            this.namePartValue = value;
        }

    }

}
