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
import org.mitre.cybox.common_2.DoubleObjectPropertyType;


/**
 * The PDFFileObjectType type is intended to characterize the structural makeup of PDF files.
 * 
 * <p>Java class for PDFFileObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFFileObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/objects#FileObject-2}FileObjectType">
 *       &lt;sequence>
 *         &lt;element name="Metadata" type="{http://cybox.mitre.org/objects#PDFFileObject-1}PDFFileMetadataType" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://cybox.mitre.org/common-2}DoubleObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Indirect_Objects" type="{http://cybox.mitre.org/objects#PDFFileObject-1}PDFIndirectObjectListType" minOccurs="0"/>
 *         &lt;element name="Cross_Reference_Tables" type="{http://cybox.mitre.org/objects#PDFFileObject-1}PDFXRefTableListType" minOccurs="0"/>
 *         &lt;element name="Trailers" type="{http://cybox.mitre.org/objects#PDFFileObject-1}PDFTrailerListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFFileObjectType", namespace = "http://cybox.mitre.org/objects#PDFFileObject-1", propOrder = {
    "metadata",
    "version",
    "indirectObjects",
    "crossReferenceTables",
    "trailers"
})
@XmlRootElement(name = "PDF_File", namespace = "http://cybox.mitre.org/objects#PDFFileObject-1")
public class PDFFile
    extends FileObjectType
{

    @XmlElement(name = "Metadata")
    protected PDFFileMetadataType metadata;
    @XmlElement(name = "Version")
    protected DoubleObjectPropertyType version;
    @XmlElement(name = "Indirect_Objects")
    protected PDFIndirectObjectListType indirectObjects;
    @XmlElement(name = "Cross_Reference_Tables")
    protected PDFXRefTableListType crossReferenceTables;
    @XmlElement(name = "Trailers")
    protected PDFTrailerListType trailers;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link PDFFileMetadataType }
     *     
     */
    public PDFFileMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFFileMetadataType }
     *     
     */
    public void setMetadata(PDFFileMetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleObjectPropertyType }
     *     
     */
    public DoubleObjectPropertyType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleObjectPropertyType }
     *     
     */
    public void setVersion(DoubleObjectPropertyType value) {
        this.version = value;
    }

    /**
     * Gets the value of the indirectObjects property.
     * 
     * @return
     *     possible object is
     *     {@link PDFIndirectObjectListType }
     *     
     */
    public PDFIndirectObjectListType getIndirectObjects() {
        return indirectObjects;
    }

    /**
     * Sets the value of the indirectObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFIndirectObjectListType }
     *     
     */
    public void setIndirectObjects(PDFIndirectObjectListType value) {
        this.indirectObjects = value;
    }

    /**
     * Gets the value of the crossReferenceTables property.
     * 
     * @return
     *     possible object is
     *     {@link PDFXRefTableListType }
     *     
     */
    public PDFXRefTableListType getCrossReferenceTables() {
        return crossReferenceTables;
    }

    /**
     * Sets the value of the crossReferenceTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFXRefTableListType }
     *     
     */
    public void setCrossReferenceTables(PDFXRefTableListType value) {
        this.crossReferenceTables = value;
    }

    /**
     * Gets the value of the trailers property.
     * 
     * @return
     *     possible object is
     *     {@link PDFTrailerListType }
     *     
     */
    public PDFTrailerListType getTrailers() {
        return trailers;
    }

    /**
     * Sets the value of the trailers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFTrailerListType }
     *     
     */
    public void setTrailers(PDFTrailerListType value) {
        this.trailers = value;
    }

}