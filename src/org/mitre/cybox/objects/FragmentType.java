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
import org.mitre.cybox.common_2.HexBinaryObjectPropertyType;


/**
 * Specifies the fields of the Fragment header, which is used by an IPv6 source to send a packet larger than would fit in the path MTU. http://tools.ietf.org/html/rfc2460.
 * 
 * <p>Java class for FragmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FragmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Fragment_Header" type="{http://cybox.mitre.org/objects#PacketObject-2}FragmentHeaderType" minOccurs="0"/>
 *         &lt;element name="Fragment" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FragmentType", propOrder = {
    "fragmentHeadersAndFragments"
})
public class FragmentType {

    @XmlElements({
        @XmlElement(name = "Fragment_Header", type = FragmentHeaderType.class),
        @XmlElement(name = "Fragment", type = HexBinaryObjectPropertyType.class)
    })
    protected List<Object> fragmentHeadersAndFragments;

    /**
     * Gets the value of the fragmentHeadersAndFragments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fragmentHeadersAndFragments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFragmentHeadersAndFragments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FragmentHeaderType }
     * {@link HexBinaryObjectPropertyType }
     * 
     * 
     */
    public List<Object> getFragmentHeadersAndFragments() {
        if (fragmentHeadersAndFragments == null) {
            fragmentHeadersAndFragments = new ArrayList<Object>();
        }
        return this.fragmentHeadersAndFragments;
    }

}
