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


/**
 * The MemorySectionListType type specifies a list of memory sections used by the process.
 * 
 * <p>Java class for MemorySectionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemorySectionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Memory_Section" type="{http://cybox.mitre.org/objects#MemoryObject-2}MemoryObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemorySectionListType", namespace = "http://cybox.mitre.org/objects#WinProcessObject-2", propOrder = {
    "memorySections"
})
public class MemorySectionListType {

    @XmlElement(name = "Memory_Section", required = true)
    protected List<MemoryObjectType> memorySections;

    /**
     * Gets the value of the memorySections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memorySections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemorySections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemoryObjectType }
     * 
     * 
     */
    public List<MemoryObjectType> getMemorySections() {
        if (memorySections == null) {
            memorySections = new ArrayList<MemoryObjectType>();
        }
        return this.memorySections;
    }

}
