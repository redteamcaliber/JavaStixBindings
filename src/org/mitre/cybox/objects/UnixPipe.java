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
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The UnixPipeObjectType type is intended to characterize Unix pipes.
 * 
 * <p>Java class for UnixPipeObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnixPipeObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/objects#PipeObject-2}PipeObjectType">
 *       &lt;sequence>
 *         &lt;element name="Permission_Mode" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnixPipeObjectType", namespace = "http://cybox.mitre.org/objects#UnixPipeObject-2", propOrder = {
    "permissionMode"
})
@XmlRootElement(name = "Unix_Pipe", namespace = "http://cybox.mitre.org/objects#UnixPipeObject-2")
public class UnixPipe
    extends PipeObjectType
{

    @XmlElement(name = "Permission_Mode")
    protected StringObjectPropertyType permissionMode;

    /**
     * Gets the value of the permissionMode property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getPermissionMode() {
        return permissionMode;
    }

    /**
     * Sets the value of the permissionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setPermissionMode(StringObjectPropertyType value) {
        this.permissionMode = value;
    }

}