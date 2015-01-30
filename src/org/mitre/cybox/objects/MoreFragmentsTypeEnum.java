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
 * <p>Java class for MoreFragmentsTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MoreFragmentsTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="lastfragment(0)"/>
 *     &lt;enumeration value="morefragmentstofollow(1)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MoreFragmentsTypeEnum")
@XmlEnum
public enum MoreFragmentsTypeEnum {


    /**
     * Indicates that the last fragment has been received. In other words, the "more fragments" flag is set to 0.
     * 
     */
    @XmlEnumValue("lastfragment(0)")
    LASTFRAGMENT_0("lastfragment(0)"),

    /**
     * Indicates that more fragments need to be received. In other words, the "more fragments" flag is set.
     * 
     */
    @XmlEnumValue("morefragmentstofollow(1)")
    MOREFRAGMENTSTOFOLLOW_1("morefragmentstofollow(1)");
    private final String value;

    MoreFragmentsTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MoreFragmentsTypeEnum fromValue(String v) {
        for (MoreFragmentsTypeEnum c: MoreFragmentsTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}