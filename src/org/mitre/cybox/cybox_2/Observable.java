//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.cybox_2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.mitre.cybox.common_2.MeasureSourceType;
import org.mitre.cybox.common_2.StructuredTextType;


/**
 * The ObservableType is a type representing a description of a single cyber observable.
 * 
 * <p>Java class for ObservableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://cybox.mitre.org/common-2}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://cybox.mitre.org/cybox-2}KeywordsType" minOccurs="0"/>
 *         &lt;element name="Observable_Source" type="{http://cybox.mitre.org/common-2}MeasureSourceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://cybox.mitre.org/cybox-2}Object" minOccurs="0"/>
 *           &lt;element ref="{http://cybox.mitre.org/cybox-2}Event" minOccurs="0"/>
 *           &lt;element name="Observable_Composition" type="{http://cybox.mitre.org/cybox-2}ObservableCompositionType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Pattern_Fidelity" type="{http://cybox.mitre.org/cybox-2}PatternFidelityType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="idref" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="negate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="sighting_count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservableType", propOrder = {
    "title",
    "description",
    "keywords",
    "observableSources",
    "observableComposition",
    "event",
    "object",
    "patternFidelity"
})
@XmlRootElement(name = "Observable")
public class Observable {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    protected StructuredTextType description;
    @XmlElement(name = "Keywords")
    protected KeywordsType keywords;
    @XmlElement(name = "Observable_Source")
    protected List<MeasureSourceType> observableSources;
    @XmlElement(name = "Observable_Composition")
    protected ObservableCompositionType observableComposition;
    @XmlElement(name = "Event")
    protected Event event;
    @XmlElement(name = "Object")
    protected ObjectType object;
    @XmlElement(name = "Pattern_Fidelity")
    protected PatternFidelityType patternFidelity;
    @XmlAttribute(name = "id")
    protected QName id;
    @XmlAttribute(name = "idref")
    protected QName idref;
    @XmlAttribute(name = "negate")
    protected Boolean negate;
    @XmlAttribute(name = "sighting_count")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sightingCount;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

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
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordsType }
     *     
     */
    public KeywordsType getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordsType }
     *     
     */
    public void setKeywords(KeywordsType value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the observableSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observableSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservableSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureSourceType }
     * 
     * 
     */
    public List<MeasureSourceType> getObservableSources() {
        if (observableSources == null) {
            observableSources = new ArrayList<MeasureSourceType>();
        }
        return this.observableSources;
    }

    /**
     * Gets the value of the observableComposition property.
     * 
     * @return
     *     possible object is
     *     {@link ObservableCompositionType }
     *     
     */
    public ObservableCompositionType getObservableComposition() {
        return observableComposition;
    }

    /**
     * Sets the value of the observableComposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservableCompositionType }
     *     
     */
    public void setObservableComposition(ObservableCompositionType value) {
        this.observableComposition = value;
    }

    /**
     * The Event construct enables specification of a cyber observable event that is dynamic in nature with specific action(s) taken against specific cyber relevant objects (e.g. a file is deleted, a registry key is created or an HTTP Get Request is received).
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * The Object construct identifies and specifies the characteristics of a specific cyber-relevant object (e.g. a file, a registry key or a process).
     * 
     * @return
     *     possible object is
     *     {@link ObjectType }
     *     
     */
    public ObjectType getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectType }
     *     
     */
    public void setObject(ObjectType value) {
        this.object = value;
    }

    /**
     * Gets the value of the patternFidelity property.
     * 
     * @return
     *     possible object is
     *     {@link PatternFidelityType }
     *     
     */
    public PatternFidelityType getPatternFidelity() {
        return patternFidelity;
    }

    /**
     * Sets the value of the patternFidelity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatternFidelityType }
     *     
     */
    public void setPatternFidelity(PatternFidelityType value) {
        this.patternFidelity = value;
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

    /**
     * Gets the value of the negate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegate() {
        if (negate == null) {
            return false;
        } else {
            return negate;
        }
    }

    /**
     * Sets the value of the negate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegate(Boolean value) {
        this.negate = value;
    }

    /**
     * Gets the value of the sightingCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSightingCount() {
        return sightingCount;
    }

    /**
     * Sets the value of the sightingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSightingCount(BigInteger value) {
        this.sightingCount = value;
    }

}
