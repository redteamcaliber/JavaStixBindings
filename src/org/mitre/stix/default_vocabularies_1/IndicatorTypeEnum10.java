//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.stix.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndicatorTypeEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndicatorTypeEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Malicious E-mail"/>
 *     &lt;enumeration value="IP Watchlist"/>
 *     &lt;enumeration value="File Hash Watchlist"/>
 *     &lt;enumeration value="Domain Watchlist"/>
 *     &lt;enumeration value="URL Watchlist"/>
 *     &lt;enumeration value="Malware Artifacts"/>
 *     &lt;enumeration value="C2"/>
 *     &lt;enumeration value="Anonymization"/>
 *     &lt;enumeration value="Exfiltration"/>
 *     &lt;enumeration value="Host Characteristics"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndicatorTypeEnum-1.0")
@XmlEnum
public enum IndicatorTypeEnum10 {


    /**
     * Indicator describes suspected malicious e-mail (phishing, spear phishing, infected, etc.).
     * 
     */
    @XmlEnumValue("Malicious E-mail")
    MALICIOUS_E_MAIL("Malicious E-mail"),

    /**
     * Indicator describes a set of suspected malicious IP addresses or IP blocks.
     * 
     */
    @XmlEnumValue("IP Watchlist")
    IP_WATCHLIST("IP Watchlist"),

    /**
     * Indicator describes a set of hashes for suspected malicious files.
     * 
     */
    @XmlEnumValue("File Hash Watchlist")
    FILE_HASH_WATCHLIST("File Hash Watchlist"),

    /**
     * Indicator describes a set of suspected malicious domains.
     * 
     */
    @XmlEnumValue("Domain Watchlist")
    DOMAIN_WATCHLIST("Domain Watchlist"),

    /**
     * Indicator describes a set of suspected malicious URLS.
     * 
     */
    @XmlEnumValue("URL Watchlist")
    URL_WATCHLIST("URL Watchlist"),

    /**
     * Indicator describes the effects of suspected malware.
     * 
     */
    @XmlEnumValue("Malware Artifacts")
    MALWARE_ARTIFACTS("Malware Artifacts"),

    /**
     * Indicator describes suspected command and control activity or static indications.
     * 
     */
    @XmlEnumValue("C2")
    C_2("C2"),

    /**
     * Indicator describes suspected anonymization techniques (Proxy, TOR, VPN, etc.).
     * 
     */
    @XmlEnumValue("Anonymization")
    ANONYMIZATION("Anonymization"),

    /**
     * Indicator describes suspected exfiltration techniques or behavior.
     * 
     */
    @XmlEnumValue("Exfiltration")
    EXFILTRATION("Exfiltration"),

    /**
     * Indicator describes suspected malicious host characteristics.
     * 
     */
    @XmlEnumValue("Host Characteristics")
    HOST_CHARACTERISTICS("Host Characteristics");
    private final String value;

    IndicatorTypeEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndicatorTypeEnum10 fromValue(String v) {
        for (IndicatorTypeEnum10 c: IndicatorTypeEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
