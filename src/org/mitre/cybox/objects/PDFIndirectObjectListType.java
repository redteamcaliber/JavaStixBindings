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
 * The PDFIndirectObjectListType captures a list of PDF indirect objects.
 * 
 * <p>Java class for PDFIndirectObjectListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFIndirectObjectListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Indirect_Object" type="{http://cybox.mitre.org/objects#PDFFileObject-1}PDFIndirectObjectType" maxOccurs="unbounded" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFIndirectObjectListType", namespace = "http://cybox.mitre.org/objects#PDFFileObject-1", propOrder = {
    "indirectObjects"
})
public class PDFIndirectObjectListType {

    @XmlElement(name = "Indirect_Object", required = true)
    protected List<PDFIndirectObjectType> indirectObjects;

    /**
     * Gets the value of the indirectObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indirectObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndirectObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDFIndirectObjectType }
     * 
     * 
     */
    public List<PDFIndirectObjectType> getIndirectObjects() {
        if (indirectObjects == null) {
            indirectObjects = new ArrayList<PDFIndirectObjectType>();
        }
        return this.indirectObjects;
    }

}
