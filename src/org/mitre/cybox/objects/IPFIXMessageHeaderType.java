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
import org.mitre.cybox.common_2.IntegerObjectPropertyType;


/**
 * This type represents the message header for the IPFIX format. For more information about each of the fields, please refer to RFC 5101 (http://tools.ietf.org/html/rfc5101) under the heading, "Message Header Field Descriptions." Note that common elements are included in the Network_Flow_Label.
 * 
 * <p>Java class for IPFIXMessageHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPFIXMessageHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Version" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Byte_Length" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Export_Timestamp" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Sequence_Number" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Observation_Domain_ID" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPFIXMessageHeaderType", namespace = "http://cybox.mitre.org/objects#NetworkFlowObject-2", propOrder = {
    "version",
    "byteLength",
    "exportTimestamp",
    "sequenceNumber",
    "observationDomainID"
})
public class IPFIXMessageHeaderType {

    @XmlElement(name = "Version")
    protected HexBinaryObjectPropertyType version;
    @XmlElement(name = "Byte_Length")
    protected HexBinaryObjectPropertyType byteLength;
    @XmlElement(name = "Export_Timestamp")
    protected IntegerObjectPropertyType exportTimestamp;
    @XmlElement(name = "Sequence_Number")
    protected IntegerObjectPropertyType sequenceNumber;
    @XmlElement(name = "Observation_Domain_ID")
    protected IntegerObjectPropertyType observationDomainID;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setVersion(HexBinaryObjectPropertyType value) {
        this.version = value;
    }

    /**
     * Gets the value of the byteLength property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getByteLength() {
        return byteLength;
    }

    /**
     * Sets the value of the byteLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setByteLength(HexBinaryObjectPropertyType value) {
        this.byteLength = value;
    }

    /**
     * Gets the value of the exportTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getExportTimestamp() {
        return exportTimestamp;
    }

    /**
     * Sets the value of the exportTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setExportTimestamp(IntegerObjectPropertyType value) {
        this.exportTimestamp = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setSequenceNumber(IntegerObjectPropertyType value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the observationDomainID property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getObservationDomainID() {
        return observationDomainID;
    }

    /**
     * Sets the value of the observationDomainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setObservationDomainID(IntegerObjectPropertyType value) {
        this.observationDomainID = value;
    }

}