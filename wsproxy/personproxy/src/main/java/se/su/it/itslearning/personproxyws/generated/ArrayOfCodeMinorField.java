
package se.su.it.itslearning.personproxyws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCodeMinorField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCodeMinorField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeMinorField" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="codeMinorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="codeMinorValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ArrayOfCodeMinorField", namespace = "http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0", propOrder = {
    "codeMinorField"
})
public class ArrayOfCodeMinorField {

    protected List<ArrayOfCodeMinorField.CodeMinorField> codeMinorField;

    /**
     * Gets the value of the codeMinorField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeMinorField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeMinorField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCodeMinorField.CodeMinorField }
     * 
     * 
     */
    public List<ArrayOfCodeMinorField.CodeMinorField> getCodeMinorField() {
        if (codeMinorField == null) {
            codeMinorField = new ArrayList<ArrayOfCodeMinorField.CodeMinorField>();
        }
        return this.codeMinorField;
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
     *         &lt;element name="codeMinorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="codeMinorValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "codeMinorName",
        "codeMinorValue"
    })
    public static class CodeMinorField {

        @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0")
        protected String codeMinorName;
        @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0")
        protected String codeMinorValue;

        /**
         * Gets the value of the codeMinorName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeMinorName() {
            return codeMinorName;
        }

        /**
         * Sets the value of the codeMinorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeMinorName(String value) {
            this.codeMinorName = value;
        }

        /**
         * Gets the value of the codeMinorValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeMinorValue() {
            return codeMinorValue;
        }

        /**
         * Sets the value of the codeMinorValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeMinorValue(String value) {
            this.codeMinorValue = value;
        }

    }

}
