
package se.su.it.itslearning.membershipproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordInfo" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}RecordMetaDataDType" minOccurs="0"/&gt;
 *         &lt;element name="values" type="{http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0}ValuesDType" minOccurs="0"/&gt;
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultDType", namespace = "http://www.imsglobal.org/services/mms/xsd/imsMemberManDataSchema_v1p0", propOrder = {
    "resultType",
    "recordInfo",
    "values",
    "mode",
    "result"
})
public class ResultDType {

    protected String resultType;
    protected RecordMetaDataDType recordInfo;
    protected ValuesDType values;
    protected String mode;
    protected String result;

    /**
     * Gets the value of the resultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultType() {
        return resultType;
    }

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultType(String value) {
        this.resultType = value;
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
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesDType }
     *     
     */
    public ValuesDType getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesDType }
     *     
     */
    public void setValues(ValuesDType value) {
        this.values = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

}
