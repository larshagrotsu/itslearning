
package se.su.it.itslearning.personproxyws.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstitutionRoleDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstitutionRoleDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="institutionRoleType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Student"/&gt;
 *               &lt;enumeration value="Faculty"/&gt;
 *               &lt;enumeration value="Member"/&gt;
 *               &lt;enumeration value="Learner"/&gt;
 *               &lt;enumeration value="Instructor"/&gt;
 *               &lt;enumeration value="Mentor"/&gt;
 *               &lt;enumeration value="Staff"/&gt;
 *               &lt;enumeration value="Alumni"/&gt;
 *               &lt;enumeration value="ProspectiveStudent"/&gt;
 *               &lt;enumeration value="Guest"/&gt;
 *               &lt;enumeration value="Other"/&gt;
 *               &lt;enumeration value="Administrator"/&gt;
 *               &lt;enumeration value="Observer"/&gt;
 *               &lt;enumeration value="Carer"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="primaryRoleType" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitutionRoleDType", namespace = "http://www.imsglobal.org/services/pms/xsd/imsPersonManDataSchema_v1p0", propOrder = {
    "institutionRoleType",
    "primaryRoleType"
})
public class InstitutionRoleDType {

    @XmlElement(required = true)
    protected String institutionRoleType;
    protected boolean primaryRoleType;

    /**
     * Gets the value of the institutionRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionRoleType() {
        return institutionRoleType;
    }

    /**
     * Sets the value of the institutionRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionRoleType(String value) {
        this.institutionRoleType = value;
    }

    /**
     * Gets the value of the primaryRoleType property.
     * 
     */
    public boolean isPrimaryRoleType() {
        return primaryRoleType;
    }

    /**
     * Sets the value of the primaryRoleType property.
     * 
     */
    public void setPrimaryRoleType(boolean value) {
        this.primaryRoleType = value;
    }

}
