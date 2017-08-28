
package se.su.it.itslearning.extendedpersonproxyws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusInfoDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusInfoDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeMajor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="success"/&gt;
 *               &lt;enumeration value="unsupported"/&gt;
 *               &lt;enumeration value="failure"/&gt;
 *               &lt;enumeration value="processing"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="severity"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="status"/&gt;
 *               &lt;enumeration value="warning"/&gt;
 *               &lt;enumeration value="error"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="codeMinor" type="{http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0}ArrayOfCodeMinorField" minOccurs="0"/&gt;
 *         &lt;element name="messageIdRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationIdRef" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}LangStringDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusInfoDType", namespace = "http://www.imsglobal.org/services/common/imsMessBindSchema_v1p0", propOrder = {
    "codeMajor",
    "severity",
    "codeMinor",
    "messageIdRef",
    "operationIdRef",
    "description"
})
public class StatusInfoDType {

    @XmlElement(required = true)
    protected String codeMajor;
    @XmlElement(required = true)
    protected String severity;
    protected ArrayOfCodeMinorField codeMinor;
    protected String messageIdRef;
    protected List<String> operationIdRef;
    protected LangStringDType description;

    /**
     * Gets the value of the codeMajor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeMajor() {
        return codeMajor;
    }

    /**
     * Sets the value of the codeMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeMajor(String value) {
        this.codeMajor = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the codeMinor property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCodeMinorField }
     *     
     */
    public ArrayOfCodeMinorField getCodeMinor() {
        return codeMinor;
    }

    /**
     * Sets the value of the codeMinor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCodeMinorField }
     *     
     */
    public void setCodeMinor(ArrayOfCodeMinorField value) {
        this.codeMinor = value;
    }

    /**
     * Gets the value of the messageIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageIdRef() {
        return messageIdRef;
    }

    /**
     * Sets the value of the messageIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageIdRef(String value) {
        this.messageIdRef = value;
    }

    /**
     * Gets the value of the operationIdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationIdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationIdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperationIdRef() {
        if (operationIdRef == null) {
            operationIdRef = new ArrayList<String>();
        }
        return this.operationIdRef;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link LangStringDType }
     *     
     */
    public LangStringDType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangStringDType }
     *     
     */
    public void setDescription(LangStringDType value) {
        this.description = value;
    }

}
