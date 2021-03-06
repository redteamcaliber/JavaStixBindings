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
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The data record that contains values and scope information of the Flow measurement parameters, corresponding to an Options Template Record.
 * 
 * <p>Java class for OptionsDataRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionsDataRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Scope_Field_Value" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="Option_Record_Collection_Element" type="{http://cybox.mitre.org/objects#NetworkFlowObject-2}OptionCollectionElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionsDataRecordType", namespace = "http://cybox.mitre.org/objects#NetworkFlowObject-2", propOrder = {
    "scopeFieldValuesAndOptionRecordCollectionElements"
})
public class OptionsDataRecordType {

    @XmlElements({
        @XmlElement(name = "Scope_Field_Value", type = StringObjectPropertyType.class),
        @XmlElement(name = "Option_Record_Collection_Element", type = OptionCollectionElementType.class)
    })
    protected List<Object> scopeFieldValuesAndOptionRecordCollectionElements;

    /**
     * Gets the value of the scopeFieldValuesAndOptionRecordCollectionElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scopeFieldValuesAndOptionRecordCollectionElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScopeFieldValuesAndOptionRecordCollectionElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringObjectPropertyType }
     * {@link OptionCollectionElementType }
     * 
     * 
     */
    public List<Object> getScopeFieldValuesAndOptionRecordCollectionElements() {
        if (scopeFieldValuesAndOptionRecordCollectionElements == null) {
            scopeFieldValuesAndOptionRecordCollectionElements = new ArrayList<Object>();
        }
        return this.scopeFieldValuesAndOptionRecordCollectionElements;
    }

}
