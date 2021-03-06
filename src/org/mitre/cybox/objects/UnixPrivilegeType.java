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
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The UnixPrivilegeType type is used to specify Unix privileges. It extends the abstract PrivilegeType from the CybOX UserAccount object.
 * 
 * <p>Java class for UnixPrivilegeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnixPrivilegeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/objects#UserAccountObject-2}PrivilegeType">
 *       &lt;sequence>
 *         &lt;element name="Permissions_Mask" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnixPrivilegeType", namespace = "http://cybox.mitre.org/objects#UnixUserAccountObject-2", propOrder = {
    "permissionsMask"
})
public class UnixPrivilegeType
    extends PrivilegeType
{

    @XmlElement(name = "Permissions_Mask", required = true)
    protected StringObjectPropertyType permissionsMask;

    /**
     * Gets the value of the permissionsMask property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getPermissionsMask() {
        return permissionsMask;
    }

    /**
     * Sets the value of the permissionsMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setPermissionsMask(StringObjectPropertyType value) {
        this.permissionsMask = value;
    }

}
