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
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * http://msdn.microsoft.com/en-us/library/windows/desktop/ms724877(v=vs.85).aspx.
 * 
 * <p>Java class for HiveListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HiveListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hive" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HiveListType", namespace = "http://cybox.mitre.org/objects#WinSystemRestoreObject-2", propOrder = {
    "hives"
})
public class HiveListType {

    @XmlElement(name = "Hive", required = true)
    protected List<StringObjectPropertyType> hives;

    /**
     * Gets the value of the hives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringObjectPropertyType }
     * 
     * 
     */
    public List<StringObjectPropertyType> getHives() {
        if (hives == null) {
            hives = new ArrayList<StringObjectPropertyType>();
        }
        return this.hives;
    }

}
