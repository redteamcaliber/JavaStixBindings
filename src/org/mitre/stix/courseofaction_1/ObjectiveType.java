//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.stix.courseofaction_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.stix.common_1.ConfidenceType;
import org.mitre.stix.common_1.StructuredTextType;


/**
 * The ObjectiveType characterizes the objective of this CourseOfAction.
 * 
 * <p>Java class for ObjectiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectiveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://stix.mitre.org/common-1}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Short_Description" type="{http://stix.mitre.org/common-1}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Applicability_Confidence" type="{http://stix.mitre.org/common-1}ConfidenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectiveType", propOrder = {
    "description",
    "shortDescription",
    "applicabilityConfidence"
})
public class ObjectiveType {

    @XmlElement(name = "Description")
    protected StructuredTextType description;
    @XmlElement(name = "Short_Description")
    protected StructuredTextType shortDescription;
    @XmlElement(name = "Applicability_Confidence")
    protected ConfidenceType applicabilityConfidence;

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
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTextType }
     *     
     */
    public StructuredTextType getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTextType }
     *     
     */
    public void setShortDescription(StructuredTextType value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the applicabilityConfidence property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidenceType }
     *     
     */
    public ConfidenceType getApplicabilityConfidence() {
        return applicabilityConfidence;
    }

    /**
     * Sets the value of the applicabilityConfidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidenceType }
     *     
     */
    public void setApplicabilityConfidence(ConfidenceType value) {
        this.applicabilityConfidence = value;
    }

}
