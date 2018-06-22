
package soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authUser" type="{http://soap/}authUser" minOccurs="0"/>
 *         &lt;element name="categoryType" type="{http://soap/}categoryType" minOccurs="0"/>
 *         &lt;element name="elements" type="{http://soap/}element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parameter" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "category", propOrder = {
    "authUser",
    "categoryType",
    "elements",
    "id",
    "parameter"
})
public class Category {

    protected AuthUser authUser;
    protected CategoryType categoryType;
    @XmlElement(nillable = true)
    protected List<Element> elements;
    protected Long id;
    protected Long parameter;

    /**
     * Gets the value of the authUser property.
     * 
     * @return
     *     possible object is
     *     {@link AuthUser }
     *     
     */
    public AuthUser getAuthUser() {
        return authUser;
    }

    /**
     * Sets the value of the authUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthUser }
     *     
     */
    public void setAuthUser(AuthUser value) {
        this.authUser = value;
    }

    /**
     * Gets the value of the categoryType property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryType }
     *     
     */
    public CategoryType getCategoryType() {
        return categoryType;
    }

    /**
     * Sets the value of the categoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryType }
     *     
     */
    public void setCategoryType(CategoryType value) {
        this.categoryType = value;
    }

    /**
     * Gets the value of the elements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getElements() {
        if (elements == null) {
            elements = new ArrayList<Element>();
        }
        return this.elements;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParameter(Long value) {
        this.parameter = value;
    }

}
