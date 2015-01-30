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
 * <p>Java class for IANAPortNumberRegistryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IANAPortNumberRegistryTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ftpdata(20)"/>
 *     &lt;enumeration value="ftp(21)"/>
 *     &lt;enumeration value="ssh(22)"/>
 *     &lt;enumeration value="telnet(23)"/>
 *     &lt;enumeration value="smtp(25)"/>
 *     &lt;enumeration value="domain(53)"/>
 *     &lt;enumeration value="tftp(69)"/>
 *     &lt;enumeration value="http(80)"/>
 *     &lt;enumeration value="ldap(389)"/>
 *     &lt;enumeration value="https(443)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IANAPortNumberRegistryTypeEnum")
@XmlEnum
public enum IANAPortNumberRegistryTypeEnum {


    /**
     * Indicates the port for ftpdata.
     * 
     */
    @XmlEnumValue("ftpdata(20)")
    FTPDATA_20("ftpdata(20)"),

    /**
     * Indicates the port for ftp.
     * 
     */
    @XmlEnumValue("ftp(21)")
    FTP_21("ftp(21)"),

    /**
     * Indicates the port for ssh.
     * 
     */
    @XmlEnumValue("ssh(22)")
    SSH_22("ssh(22)"),

    /**
     * Indicates the port for telnet.
     * 
     */
    @XmlEnumValue("telnet(23)")
    TELNET_23("telnet(23)"),

    /**
     * Indicates the port for smtp.
     * 
     */
    @XmlEnumValue("smtp(25)")
    SMTP_25("smtp(25)"),

    /**
     * Indicates the domain port.
     * 
     */
    @XmlEnumValue("domain(53)")
    DOMAIN_53("domain(53)"),

    /**
     * Indicates the port for tftp.
     * 
     */
    @XmlEnumValue("tftp(69)")
    TFTP_69("tftp(69)"),

    /**
     * Indicates the port for http.
     * 
     */
    @XmlEnumValue("http(80)")
    HTTP_80("http(80)"),

    /**
     * Indicates the port for ldap.
     * 
     */
    @XmlEnumValue("ldap(389)")
    LDAP_389("ldap(389)"),

    /**
     * Indicates the port for https.
     * 
     */
    @XmlEnumValue("https(443)")
    HTTPS_443("https(443)");
    private final String value;

    IANAPortNumberRegistryTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IANAPortNumberRegistryTypeEnum fromValue(String v) {
        for (IANAPortNumberRegistryTypeEnum c: IANAPortNumberRegistryTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
