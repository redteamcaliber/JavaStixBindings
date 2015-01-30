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
import org.mitre.cybox.common_2.HexBinaryObjectPropertyType;


/**
 * Elements associated with ICMPv4 error messages (as opposed to ICMP informational messages or ICMP traceroute message).
 * 
 * <p>Java class for ICMPv4ErrorMessageContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICMPv4ErrorMessageContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IP_Header" type="{http://cybox.mitre.org/objects#PacketObject-2}IPv4HeaderType" minOccurs="0"/>
 *         &lt;element name="First_Eight_Bytes" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMPv4ErrorMessageContentType", propOrder = {
    "ipHeader",
    "firstEightBytes"
})
public class ICMPv4ErrorMessageContentType {

    @XmlElement(name = "IP_Header")
    protected IPv4HeaderType ipHeader;
    @XmlElement(name = "First_Eight_Bytes")
    protected HexBinaryObjectPropertyType firstEightBytes;

    /**
     * Gets the value of the ipHeader property.
     * 
     * @return
     *     possible object is
     *     {@link IPv4HeaderType }
     *     
     */
    public IPv4HeaderType getIPHeader() {
        return ipHeader;
    }

    /**
     * Sets the value of the ipHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv4HeaderType }
     *     
     */
    public void setIPHeader(IPv4HeaderType value) {
        this.ipHeader = value;
    }

    /**
     * Gets the value of the firstEightBytes property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getFirstEightBytes() {
        return firstEightBytes;
    }

    /**
     * Sets the value of the firstEightBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setFirstEightBytes(HexBinaryObjectPropertyType value) {
        this.firstEightBytes = value;
    }

}
