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
 * The PDFIndirectObjectContentsType captures the contents of a PDF indirect object, including both stream and non-stream portions.
 * 
 * <p>Java class for PDFIndirectObjectContentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFIndirectObjectContentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Non_Stream_Contents" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Stream_Contents" type="{http://cybox.mitre.org/objects#PDFFileObject-1}PDFStreamType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFIndirectObjectContentsType", namespace = "http://cybox.mitre.org/objects#PDFFileObject-1", propOrder = {
    "nonStreamContents",
    "streamContents"
})
public class PDFIndirectObjectContentsType {

    @XmlElement(name = "Non_Stream_Contents")
    protected StringObjectPropertyType nonStreamContents;
    @XmlElement(name = "Stream_Contents")
    protected PDFStreamType streamContents;

    /**
     * Gets the value of the nonStreamContents property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getNonStreamContents() {
        return nonStreamContents;
    }

    /**
     * Sets the value of the nonStreamContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setNonStreamContents(StringObjectPropertyType value) {
        this.nonStreamContents = value;
    }

    /**
     * Gets the value of the streamContents property.
     * 
     * @return
     *     possible object is
     *     {@link PDFStreamType }
     *     
     */
    public PDFStreamType getStreamContents() {
        return streamContents;
    }

    /**
     * Sets the value of the streamContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFStreamType }
     *     
     */
    public void setStreamContents(PDFStreamType value) {
        this.streamContents = value;
    }

}