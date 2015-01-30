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
import org.mitre.cybox.common_2.IntegerObjectPropertyType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The RSAPublicKeyType captures details of RSA public keys.
 * 
 * <p>Java class for RSAPublicKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSAPublicKeyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Modulus" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Exponent" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSAPublicKeyType", namespace = "http://cybox.mitre.org/objects#X509CertificateObject-2", propOrder = {
    "modulus",
    "exponent"
})
public class RSAPublicKeyType {

    @XmlElement(name = "Modulus")
    protected StringObjectPropertyType modulus;
    @XmlElement(name = "Exponent")
    protected IntegerObjectPropertyType exponent;

    /**
     * Gets the value of the modulus property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getModulus() {
        return modulus;
    }

    /**
     * Sets the value of the modulus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setModulus(StringObjectPropertyType value) {
        this.modulus = value;
    }

    /**
     * Gets the value of the exponent property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getExponent() {
        return exponent;
    }

    /**
     * Sets the value of the exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setExponent(IntegerObjectPropertyType value) {
        this.exponent = value;
    }

}
