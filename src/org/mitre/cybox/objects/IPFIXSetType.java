//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents the possible sets of records that can be represented in an IPFIX message. See RFC 5101 and look for the terms "Template Set", "Options Template Set", and "Data Set", for more information.
 * 
 * <p>Java class for IPFIXSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPFIXSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Template_Set" type="{http://cybox.mitre.org/objects#NetworkFlowObject-2}IPFIXTemplateSetType" minOccurs="0"/>
 *         &lt;element name="Options_Template_Set" type="{http://cybox.mitre.org/objects#NetworkFlowObject-2}IPFIXOptionsTemplateSetType" minOccurs="0"/>
 *         &lt;element name="Data_Set" type="{http://cybox.mitre.org/objects#NetworkFlowObject-2}IPFIXDataSetType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPFIXSetType", namespace = "http://cybox.mitre.org/objects#NetworkFlowObject-2", propOrder = {
    "templateSetsAndOptionsTemplateSetsAndDataSets"
})
public class IPFIXSetType {

    @XmlElements({
        @XmlElement(name = "Template_Set", type = IPFIXTemplateSetType.class),
        @XmlElement(name = "Options_Template_Set", type = IPFIXOptionsTemplateSetType.class),
        @XmlElement(name = "Data_Set", type = IPFIXDataSetType.class)
    })
    protected List<Object> templateSetsAndOptionsTemplateSetsAndDataSets;

    /**
     * Gets the value of the templateSetsAndOptionsTemplateSetsAndDataSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateSetsAndOptionsTemplateSetsAndDataSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateSetsAndOptionsTemplateSetsAndDataSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPFIXTemplateSetType }
     * {@link IPFIXOptionsTemplateSetType }
     * {@link IPFIXDataSetType }
     * 
     * 
     */
    public List<Object> getTemplateSetsAndOptionsTemplateSetsAndDataSets() {
        if (templateSetsAndOptionsTemplateSetsAndDataSets == null) {
            templateSetsAndOptionsTemplateSetsAndDataSets = new ArrayList<Object>();
        }
        return this.templateSetsAndOptionsTemplateSetsAndDataSets;
    }

}
