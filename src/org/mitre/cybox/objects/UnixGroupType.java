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
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.NonNegativeIntegerObjectPropertyType;


/**
 * The UnixGroupType type is used for specifying Unix groups. It extends the abstract GroupType from the Cybox UserAccount construct.
 * 
 * <p>Java class for UnixGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnixGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/objects#UserAccountObject-2}GroupType">
 *       &lt;sequence>
 *         &lt;element name="Group_ID" type="{http://cybox.mitre.org/common-2}NonNegativeIntegerObjectPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnixGroupType", namespace = "http://cybox.mitre.org/objects#UnixUserAccountObject-2", propOrder = {
    "groupID"
})
public class UnixGroupType
    extends GroupType
{

    @XmlElement(name = "Group_ID", required = true)
    protected NonNegativeIntegerObjectPropertyType groupID;

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public NonNegativeIntegerObjectPropertyType getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public void setGroupID(NonNegativeIntegerObjectPropertyType value) {
        this.groupID = value;
    }

}