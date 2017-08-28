
package se.su.it.itslearning.extendedpersonproxyws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}extensionField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}relationship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extensionType", propOrder = {
    "extensionField",
    "relationship"
})
public class ExtensionType {

    @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0")
    protected List<ExtensionField> extensionField;
    @XmlElement(namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0")
    protected List<RelationshipDType> relationship;

    /**
     * Gets the value of the extensionField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionField }
     * 
     * 
     */
    public List<ExtensionField> getExtensionField() {
        if (extensionField == null) {
            extensionField = new ArrayList<ExtensionField>();
        }
        return this.extensionField;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipDType }
     * 
     * 
     */
    public List<RelationshipDType> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<RelationshipDType>();
        }
        return this.relationship;
    }

}
