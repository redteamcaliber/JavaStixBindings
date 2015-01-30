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
 * <p>Java class for AuthenticationTypeEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationTypeEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No Authentication"/>
 *     &lt;enumeration value="Password"/>
 *     &lt;enumeration value="Cryptographic Key"/>
 *     &lt;enumeration value="Biometrics"/>
 *     &lt;enumeration value="Hardware Token"/>
 *     &lt;enumeration value="Software Token"/>
 *     &lt;enumeration value="Multifactor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationTypeEnum-1.0", namespace = "http://cybox.mitre.org/objects#AccountObject-2")
@XmlEnum
public enum AuthenticationTypeEnum10 {


    /**
     * The No Authentication value specifies that there is no authentication mechanism in place.
     * 
     */
    @XmlEnumValue("No Authentication")
    NO_AUTHENTICATION("No Authentication"),

    /**
     * The Password value specifies password based authentication.
     * 
     */
    @XmlEnumValue("Password")
    PASSWORD("Password"),

    /**
     * The Cryptographic Key value specifies cryptographic key based authentication.
     * 
     */
    @XmlEnumValue("Cryptographic Key")
    CRYPTOGRAPHIC_KEY("Cryptographic Key"),

    /**
     * The Biometrics value specifies biometrics based authentication. Examples include fingerprint or retina readers.
     * 
     */
    @XmlEnumValue("Biometrics")
    BIOMETRICS("Biometrics"),

    /**
     * The Hardware Token value specifies authentication requiring physical or hardware tokens. Examples include smart cards, bluetooth tokens, and usb tokens.
     * 
     */
    @XmlEnumValue("Hardware Token")
    HARDWARE_TOKEN("Hardware Token"),

    /**
     * The Software Token value specifies an authentication device stored in software form.
     * 
     */
    @XmlEnumValue("Software Token")
    SOFTWARE_TOKEN("Software Token"),

    /**
     * The Multifactor authentication value specifies multifactor authentication.
     * 
     */
    @XmlEnumValue("Multifactor")
    MULTIFACTOR("Multifactor");
    private final String value;

    AuthenticationTypeEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationTypeEnum10 fromValue(String v) {
        for (AuthenticationTypeEnum10 c: AuthenticationTypeEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
