
package soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="longParamName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longParamName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longParamName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stringParamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elementType", propOrder = {
    "elementName",
    "id",
    "longParamName1",
    "longParamName2",
    "longParamName3",
    "stringParamName"
})
public class ElementType {

    protected String elementName;
    protected Long id;
    protected String longParamName1;
    protected String longParamName2;
    protected String longParamName3;
    protected String stringParamName;

    /**
     * Gets the value of the elementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementName() {
        return elementName;
    }

    /**
     * Sets the value of the elementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementName(String value) {
        this.elementName = value;
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
     * Gets the value of the longParamName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongParamName1() {
        return longParamName1;
    }

    /**
     * Sets the value of the longParamName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongParamName1(String value) {
        this.longParamName1 = value;
    }

    /**
     * Gets the value of the longParamName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongParamName2() {
        return longParamName2;
    }

    /**
     * Sets the value of the longParamName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongParamName2(String value) {
        this.longParamName2 = value;
    }

    /**
     * Gets the value of the longParamName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongParamName3() {
        return longParamName3;
    }

    /**
     * Sets the value of the longParamName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongParamName3(String value) {
        this.longParamName3 = value;
    }

    /**
     * Gets the value of the stringParamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringParamName() {
        return stringParamName;
    }

    /**
     * Sets the value of the stringParamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringParamName(String value) {
        this.stringParamName = value;
    }

}
