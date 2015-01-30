//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.stix.incident_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The ExternalImpactAssessmentModelType is an abstract type enabling the definition through extension of incident impact assessment models external to STIX.
 * 
 * <p>Java class for ExternalImpactAssessmentModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalImpactAssessmentModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="model_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="model_reference" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalImpactAssessmentModelType")
public abstract class ExternalImpactAssessmentModelType {

    @XmlAttribute(name = "model_name")
    protected String modelName;
    @XmlAttribute(name = "model_reference")
    @XmlSchemaType(name = "anyURI")
    protected String modelReference;

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the modelReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelReference() {
        return modelReference;
    }

    /**
     * Sets the value of the modelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelReference(String value) {
        this.modelReference = value;
    }

}
