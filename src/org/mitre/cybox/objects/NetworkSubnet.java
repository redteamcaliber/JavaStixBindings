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
import org.mitre.cybox.common_2.IntegerObjectPropertyType;
import org.mitre.cybox.common_2.ObjectPropertiesType;
import org.mitre.cybox.common_2.StringObjectPropertyType;
import org.mitre.cybox.common_2.StructuredTextType;


/**
 * The NetworkSubnetObjectType type is intended to characterize a generic system network subnet.
 * 
 * <p>Java class for NetworkSubnetObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkSubnetObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/common-2}ObjectPropertiesType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://cybox.mitre.org/common-2}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Number_Of_IP_Addresses" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Routes" type="{http://cybox.mitre.org/objects#NetworkSubnetObject-2}RoutesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSubnetObjectType", namespace = "http://cybox.mitre.org/objects#NetworkSubnetObject-2", propOrder = {
    "name",
    "description",
    "numberOfIPAddresses",
    "routes"
})
@XmlRootElement(name = "Network_Subnet", namespace = "http://cybox.mitre.org/objects#NetworkSubnetObject-2")
public class NetworkSubnet
    extends ObjectPropertiesType
{

    @XmlElement(name = "Name")
    protected StringObjectPropertyType name;
    @XmlElement(name = "Description")
    protected StructuredTextType description;
    @XmlElement(name = "Number_Of_IP_Addresses")
    protected IntegerObjectPropertyType numberOfIPAddresses;
    @XmlElement(name = "Routes")
    protected RoutesType routes;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTextType }
     *     
     */
    public StructuredTextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTextType }
     *     
     */
    public void setDescription(StructuredTextType value) {
        this.description = value;
    }

    /**
     * Gets the value of the numberOfIPAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getNumberOfIPAddresses() {
        return numberOfIPAddresses;
    }

    /**
     * Sets the value of the numberOfIPAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setNumberOfIPAddresses(IntegerObjectPropertyType value) {
        this.numberOfIPAddresses = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link RoutesType }
     *     
     */
    public RoutesType getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutesType }
     *     
     */
    public void setRoutes(RoutesType value) {
        this.routes = value;
    }

}
