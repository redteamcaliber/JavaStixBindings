//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.NonNegativeIntegerObjectPropertyType;
import org.mitre.cybox.common_2.ObjectPropertiesType;
import org.mitre.cybox.common_2.RegionalRegistryType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The ASObjectType type is intended to characterize an autonomous system (AS).
 * 
 * <p>Java class for ASObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/common-2}ObjectPropertiesType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://cybox.mitre.org/common-2}NonNegativeIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Handle" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Regional_Internet_Registry" type="{http://cybox.mitre.org/common-2}RegionalRegistryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASObjectType", namespace = "http://cybox.mitre.org/objects#ASObject-1", propOrder = {
    "number",
    "name",
    "handle",
    "regionalInternetRegistry"
})
@XmlRootElement(name = "AS", namespace = "http://cybox.mitre.org/objects#ASObject-1")
public class AS
    extends ObjectPropertiesType
{

    @XmlElement(name = "Number")
    protected NonNegativeIntegerObjectPropertyType number;
    @XmlElement(name = "Name")
    protected StringObjectPropertyType name;
    @XmlElement(name = "Handle")
    protected StringObjectPropertyType handle;
    @XmlElement(name = "Regional_Internet_Registry")
    protected RegionalRegistryType regionalInternetRegistry;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public NonNegativeIntegerObjectPropertyType getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public void setNumber(NonNegativeIntegerObjectPropertyType value) {
        this.number = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setName(StringObjectPropertyType value) {
        this.name = value;
    }

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setHandle(StringObjectPropertyType value) {
        this.handle = value;
    }

    /**
     * Gets the value of the regionalInternetRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalRegistryType }
     *     
     */
    public RegionalRegistryType getRegionalInternetRegistry() {
        return regionalInternetRegistry;
    }

    /**
     * Sets the value of the regionalInternetRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalRegistryType }
     *     
     */
    public void setRegionalInternetRegistry(RegionalRegistryType value) {
        this.regionalInternetRegistry = value;
    }

}
