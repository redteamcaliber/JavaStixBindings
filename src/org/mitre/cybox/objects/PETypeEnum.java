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
 * <p>Java class for PETypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PETypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Executable"/>
 *     &lt;enumeration value="Dll"/>
 *     &lt;enumeration value="Invalid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PETypeEnum", namespace = "http://cybox.mitre.org/objects#WinExecutableFileObject-2")
@XmlEnum
public enum PETypeEnum {


    /**
     * Specifies an executable image (not an OBJ or LIB).
     * 
     */
    @XmlEnumValue("Executable")
    EXECUTABLE("Executable"),

    /**
     * Specifies a dynamic link library, not a program.
     * 
     */
    @XmlEnumValue("Dll")
    DLL("Dll"),

    /**
     * Specifies an invalid executable file (i.e. not one of the listed types).
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid");
    private final String value;

    PETypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PETypeEnum fromValue(String v) {
        for (PETypeEnum c: PETypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
