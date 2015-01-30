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
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.HexBinaryObjectPropertyType;
import org.mitre.cybox.common_2.IntegerObjectPropertyType;


/**
 * Specifies an Options Template FlowSet, which is one or more Options Template Records that have been grouped together in an Export Packet.
 * 
 * <p>Java class for NetflowV9OptionsTemplateFlowSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetflowV9OptionsTemplateFlowSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Flow_Set_ID" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Length" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Options_Template_Record" type="{http://cybox.mitre.org/objects#NetworkFlowObject-2}NetflowV9OptionsTemplateRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Padding" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetflowV9OptionsTemplateFlowSetType", namespace = "http://cybox.mitre.org/objects#NetworkFlowObject-2", propOrder = {
    "flowSetID",
    "length",
    "optionsTemplateRecords",
    "padding"
})
public class NetflowV9OptionsTemplateFlowSetType {

    @XmlElement(name = "Flow_Set_ID")
    protected HexBinaryObjectPropertyType flowSetID;
    @XmlElement(name = "Length")
    protected IntegerObjectPropertyType length;
    @XmlElement(name = "Options_Template_Record")
    protected List<NetflowV9OptionsTemplateRecordType> optionsTemplateRecords;
    @XmlElement(name = "Padding")
    protected HexBinaryObjectPropertyType padding;

    /**
     * Gets the value of the flowSetID property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getFlowSetID() {
        return flowSetID;
    }

    /**
     * Sets the value of the flowSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setFlowSetID(HexBinaryObjectPropertyType value) {
        this.flowSetID = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setLength(IntegerObjectPropertyType value) {
        this.length = value;
    }

    /**
     * Gets the value of the optionsTemplateRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionsTemplateRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionsTemplateRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetflowV9OptionsTemplateRecordType }
     * 
     * 
     */
    public List<NetflowV9OptionsTemplateRecordType> getOptionsTemplateRecords() {
        if (optionsTemplateRecords == null) {
            optionsTemplateRecords = new ArrayList<NetflowV9OptionsTemplateRecordType>();
        }
        return this.optionsTemplateRecords;
    }

    /**
     * Gets the value of the padding property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getPadding() {
        return padding;
    }

    /**
     * Sets the value of the padding property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setPadding(HexBinaryObjectPropertyType value) {
        this.padding = value;
    }

}
