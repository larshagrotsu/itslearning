
package se.su.it.itslearning.personproxyws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIdentifierPairDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIdentifierPairDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifierPair" type="{http://www.imsglobal.org/services/common/imsCommonSchema_v1p0}IdentifierPairDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIdentifierPairDType", namespace = "http://www.imsglobal.org/services/common/imsCommonSchema_v1p0", propOrder = {
    "identifierPair"
})
public class ArrayOfIdentifierPairDType {

    protected List<IdentifierPairDType> identifierPair;

    /**
     * Gets the value of the identifierPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifierPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifierPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierPairDType }
     * 
     * 
     */
    public List<IdentifierPairDType> getIdentifierPair() {
        if (identifierPair == null) {
            identifierPair = new ArrayList<IdentifierPairDType>();
        }
        return this.identifierPair;
    }

}
