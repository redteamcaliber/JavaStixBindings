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
 * <p>Java class for SiLKAddressTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiLKAddressTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="non-routable (0)"/>
 *     &lt;enumeration value="internal(1)"/>
 *     &lt;enumeration value="routable_external(2)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiLKAddressTypeEnum", namespace = "http://cybox.mitre.org/objects#NetworkFlowObject-2")
@XmlEnum
public enum SiLKAddressTypeEnum {


    /**
     * Denotes a (non-routable) IP address.
     * 
     */
    @XmlEnumValue("non-routable (0)")
    NON_ROUTABLE_0("non-routable (0)"),

    /**
     * Denotes an IP address internal to the monitored network.
     * 
     */
    @XmlEnumValue("internal(1)")
    INTERNAL_1("internal(1)"),

    /**
     * Denotes an IP address external to the monitored network.
     * 
     */
    @XmlEnumValue("routable_external(2)")
    ROUTABLE_EXTERNAL_2("routable_external(2)");
    private final String value;

    SiLKAddressTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiLKAddressTypeEnum fromValue(String v) {
        for (SiLKAddressTypeEnum c: SiLKAddressTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
