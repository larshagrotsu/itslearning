
package se.su.it.itslearning.membershipproxyws.generated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuesDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuesDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valueType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="list" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *           &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuesDType", namespace = "http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0", propOrder = {
    "valueType",
    "listOrMaxOrMin"
})
public class ValuesDType {

    protected String valueType;
    @XmlElementRefs({
        @XmlElementRef(name = "max", namespace = "http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "min", namespace = "http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "list", namespace = "http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> listOrMaxOrMin;

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueType(String value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the listOrMaxOrMin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOrMaxOrMin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOrMaxOrMin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getListOrMaxOrMin() {
        if (listOrMaxOrMin == null) {
            listOrMaxOrMin = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.listOrMaxOrMin;
    }

}
