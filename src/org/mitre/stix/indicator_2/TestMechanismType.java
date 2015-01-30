//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.stix.indicator_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.mitre.stix.common_1.InformationSourceType;
import org.mitre.stix.common_1.StatementType;


/**
 *  5. YARA: The YARA test mechanism allows for the specification of a YARA test through the use of a raw CDATA section. The type is named YaraTestMechanismType and is in the http://stix.mitre.org/extensions/TestMechanism#YARA-1 namespace. The extension is defined in the file extensions/test_mechanism/yara_test_mechanism.xsd or at the URL http://stix.mitre.org/XMLSchema/extensions/test_mechanism/yara/1.1.1/yara_test_mechanism.xsd.
 * 
 * <p>Java class for TestMechanismType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestMechanismType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Efficacy" type="{http://stix.mitre.org/common-1}StatementType" minOccurs="0"/>
 *         &lt;element name="Producer" type="{http://stix.mitre.org/common-1}InformationSourceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="idref" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestMechanismType", propOrder = {
    "efficacy",
    "producer"
})
public abstract class TestMechanismType {

    @XmlElement(name = "Efficacy")
    protected StatementType efficacy;
    @XmlElement(name = "Producer")
    protected InformationSourceType producer;
    @XmlAttribute(name = "id")
    protected QName id;
    @XmlAttribute(name = "idref")
    protected QName idref;

    /**
     * Gets the value of the efficacy property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType }
     *     
     */
    public StatementType getEfficacy() {
        return efficacy;
    }

    /**
     * Sets the value of the efficacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType }
     *     
     */
    public void setEfficacy(StatementType value) {
        this.efficacy = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSourceType }
     *     
     */
    public InformationSourceType getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSourceType }
     *     
     */
    public void setProducer(InformationSourceType value) {
        this.producer = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setId(QName value) {
        this.id = value;
    }

    /**
     * Gets the value of the idref property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getIdref() {
        return idref;
    }

    /**
     * Sets the value of the idref property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setIdref(QName value) {
        this.idref = value;
    }

}
