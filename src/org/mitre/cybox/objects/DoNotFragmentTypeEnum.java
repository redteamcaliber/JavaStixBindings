//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoNotFragmentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DoNotFragmentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fragementifnecessary(0)"/>
 *     &lt;enumeration value="donotfragment(1)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DoNotFragmentTypeEnum")
@XmlEnum
public enum DoNotFragmentTypeEnum {


    /**
     * Indicates that the router or other device should fragment the packet if necessary, especially if the packet size is bigger than the MTU of an outgoing interface.
     * 
     */
    @XmlEnumValue("fragementifnecessary(0)")
    FRAGEMENTIFNECESSARY_0("fragementifnecessary(0)"),

    /**
     * Indicates that the router or other device should NOT fragment the packet in any circumstance.
     * 
     */
    @XmlEnumValue("donotfragment(1)")
    DONOTFRAGMENT_1("donotfragment(1)");
    private final String value;

    DoNotFragmentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoNotFragmentTypeEnum fromValue(String v) {
        for (DoNotFragmentTypeEnum c: DoNotFragmentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
