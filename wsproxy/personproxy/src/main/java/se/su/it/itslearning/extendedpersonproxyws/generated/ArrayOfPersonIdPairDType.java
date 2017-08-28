
package se.su.it.itslearning.extendedpersonproxyws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPersonIdPairDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPersonIdPairDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personIdPair" type="{http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0}PersonIdPairDType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPersonIdPairDType", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManMessSchema_v1p0", propOrder = {
    "personIdPair"
})
public class ArrayOfPersonIdPairDType {

    protected List<PersonIdPairDType> personIdPair;

    /**
     * Gets the value of the personIdPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personIdPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonIdPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonIdPairDType }
     * 
     * 
     */
    public List<PersonIdPairDType> getPersonIdPair() {
        if (personIdPair == null) {
            personIdPair = new ArrayList<PersonIdPairDType>();
        }
        return this.personIdPair;
    }

}
