//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.common_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The HashSegmentType is used for characterizing the internal components of a single trigger point-delimited segment in a cryptograhic fuzzy hash algorithmic calculation.
 * 
 * <p>Java class for HashSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HashSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Trigger_Point" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Segment_Hash" type="{http://cybox.mitre.org/common-2}HashValueType" minOccurs="0"/>
 *         &lt;element name="Raw_Segment_Content" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HashSegmentType", propOrder = {
    "triggerPoint",
    "segmentHash",
    "rawSegmentContent"
})
public class HashSegmentType {

    @XmlElement(name = "Trigger_Point")
    protected HexBinaryObjectPropertyType triggerPoint;
    @XmlElement(name = "Segment_Hash")
    protected HashValueType segmentHash;
    @XmlElement(name = "Raw_Segment_Content")
    protected Object rawSegmentContent;

    /**
     * Gets the value of the triggerPoint property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getTriggerPoint() {
        return triggerPoint;
    }

    /**
     * Sets the value of the triggerPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setTriggerPoint(HexBinaryObjectPropertyType value) {
        this.triggerPoint = value;
    }

    /**
     * Gets the value of the segmentHash property.
     * 
     * @return
     *     possible object is
     *     {@link HashValueType }
     *     
     */
    public HashValueType getSegmentHash() {
        return segmentHash;
    }

    /**
     * Sets the value of the segmentHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashValueType }
     *     
     */
    public void setSegmentHash(HashValueType value) {
        this.segmentHash = value;
    }

    /**
     * Gets the value of the rawSegmentContent property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRawSegmentContent() {
        return rawSegmentContent;
    }

    /**
     * Sets the value of the rawSegmentContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRawSegmentContent(Object value) {
        this.rawSegmentContent = value;
    }

}
