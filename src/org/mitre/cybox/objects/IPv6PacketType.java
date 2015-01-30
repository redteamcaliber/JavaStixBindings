//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.HexBinaryObjectPropertyType;


/**
 * Internet Protocol version 6 (IPv6) is intended to succeed IPv4, and like IPv4 it is a connectionless protocol for use on packet-switched link layer networks. RFC 3513, RFC 2460, http://en.wikipedia.org/wiki/IPv6.
 * 
 * <p>Java class for IPv6PacketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPv6PacketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IPv6_Header" type="{http://cybox.mitre.org/objects#PacketObject-2}IPv6HeaderType" minOccurs="0"/>
 *         &lt;element name="Ext_Headers" type="{http://cybox.mitre.org/objects#PacketObject-2}IPv6ExtHeaderType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv6PacketType", propOrder = {
    "iPv6Header",
    "extHeaders",
    "data"
})
public class IPv6PacketType {

    @XmlElement(name = "IPv6_Header")
    protected IPv6HeaderType iPv6Header;
    @XmlElement(name = "Ext_Headers")
    protected List<IPv6ExtHeaderType> extHeaders;
    @XmlElement(name = "Data")
    protected HexBinaryObjectPropertyType data;

    /**
     * Gets the value of the iPv6Header property.
     * 
     * @return
     *     possible object is
     *     {@link IPv6HeaderType }
     *     
     */
    public IPv6HeaderType getIPv6Header() {
        return iPv6Header;
    }

    /**
     * Sets the value of the iPv6Header property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6HeaderType }
     *     
     */
    public void setIPv6Header(IPv6HeaderType value) {
        this.iPv6Header = value;
    }

    /**
     * Gets the value of the extHeaders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extHeaders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPv6ExtHeaderType }
     * 
     * 
     */
    public List<IPv6ExtHeaderType> getExtHeaders() {
        if (extHeaders == null) {
            extHeaders = new ArrayList<IPv6ExtHeaderType>();
        }
        return this.extHeaders;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setData(HexBinaryObjectPropertyType value) {
        this.data = value;
    }

}
