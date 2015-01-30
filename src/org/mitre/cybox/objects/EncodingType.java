//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The EncodingType captures any encoding packaging details for an artifact.
 * 
 * <p>Java class for EncodingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncodingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string" default="Base64" />
 *       &lt;attribute name="character_set" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custom_character_set_ref" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncodingType", namespace = "http://cybox.mitre.org/objects#ArtifactObject-2")
public class EncodingType {

    @XmlAttribute(name = "algorithm")
    protected String algorithm;
    @XmlAttribute(name = "character_set")
    protected String characterSet;
    @XmlAttribute(name = "custom_character_set_ref")
    @XmlSchemaType(name = "anyURI")
    protected String customCharacterSetRef;

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        if (algorithm == null) {
            return "Base64";
        } else {
            return algorithm;
        }
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the characterSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * Sets the value of the characterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterSet(String value) {
        this.characterSet = value;
    }

    /**
     * Gets the value of the customCharacterSetRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomCharacterSetRef() {
        return customCharacterSetRef;
    }

    /**
     * Sets the value of the customCharacterSetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomCharacterSetRef(String value) {
        this.customCharacterSetRef = value;
    }

}
