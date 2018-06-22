
package soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://soap/}category" minOccurs="0"/>
 *         &lt;element name="elementType" type="{http://soap/}elementType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="longParam1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="longParam2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="longParam3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="stringParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "element", propOrder = {
    "category",
    "elementType",
    "id",
    "longParam1",
    "longParam2",
    "longParam3",
    "stringParam"
})
public class Element {

    protected Category category;
    protected ElementType elementType;
    protected Long id;
    protected Long longParam1;
    protected Long longParam2;
    protected Long longParam3;
    protected String stringParam;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementType }
     *     
     */
    public ElementType getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementType }
     *     
     */
    public void setElementType(ElementType value) {
        this.elementType = value;
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
     * Gets the value of the longParam1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLongParam1() {
        return longParam1;
    }

    /**
     * Sets the value of the longParam1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLongParam1(Long value) {
        this.longParam1 = value;
    }

    /**
     * Gets the value of the longParam2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLongParam2() {
        return longParam2;
    }

    /**
     * Sets the value of the longParam2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLongParam2(Long value) {
        this.longParam2 = value;
    }

    /**
     * Gets the value of the longParam3 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLongParam3() {
        return longParam3;
    }

    /**
     * Sets the value of the longParam3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLongParam3(Long value) {
        this.longParam3 = value;
    }

    /**
     * Gets the value of the stringParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringParam() {
        return stringParam;
    }

    /**
     * Sets the value of the stringParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringParam(String value) {
        this.stringParam = value;
    }

}
