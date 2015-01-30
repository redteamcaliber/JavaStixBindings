//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.ObjectPropertiesType;
import org.mitre.cybox.common_2.PositiveIntegerObjectPropertyType;
import org.mitre.cybox.common_2.StringObjectPropertyType;
import org.mitre.cybox.common_2.UnsignedIntegerObjectPropertyType;


/**
 * The SemaphoreObjectType type is intended to characterize generic semaphore objects.
 * 
 * <p>Java class for SemaphoreObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SemaphoreObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/common-2}ObjectPropertiesType">
 *       &lt;sequence>
 *         &lt;element name="Current_Count" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Maximum_Count" type="{http://cybox.mitre.org/common-2}PositiveIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="named" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SemaphoreObjectType", namespace = "http://cybox.mitre.org/objects#SemaphoreObject-2", propOrder = {
    "currentCount",
    "maximumCount",
    "name"
})
@XmlSeeAlso({
    WinSemaphore.class
})
public class SemaphoreObjectType
    extends ObjectPropertiesType
{

    @XmlElement(name = "Current_Count")
    protected UnsignedIntegerObjectPropertyType currentCount;
    @XmlElement(name = "Maximum_Count")
    protected PositiveIntegerObjectPropertyType maximumCount;
    @XmlElement(name = "Name")
    protected StringObjectPropertyType name;
    @XmlAttribute(name = "named")
    protected Boolean named;

    /**
     * Gets the value of the currentCount property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getCurrentCount() {
        return currentCount;
    }

    /**
     * Sets the value of the currentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setCurrentCount(UnsignedIntegerObjectPropertyType value) {
        this.currentCount = value;
    }

    /**
     * Gets the value of the maximumCount property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveIntegerObjectPropertyType }
     *     
     */
    public PositiveIntegerObjectPropertyType getMaximumCount() {
        return maximumCount;
    }

    /**
     * Sets the value of the maximumCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveIntegerObjectPropertyType }
     *     
     */
    public void setMaximumCount(PositiveIntegerObjectPropertyType value) {
        this.maximumCount = value;
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
     * Gets the value of the named property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNamed() {
        return named;
    }

    /**
     * Sets the value of the named property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNamed(Boolean value) {
        this.named = value;
    }

}
