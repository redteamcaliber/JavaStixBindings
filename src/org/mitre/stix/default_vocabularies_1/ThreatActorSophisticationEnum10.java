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
 * <p>Java class for ThreatActorSophisticationEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThreatActorSophisticationEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Innovator"/>
 *     &lt;enumeration value="Expert"/>
 *     &lt;enumeration value="Practitioner"/>
 *     &lt;enumeration value="Novice"/>
 *     &lt;enumeration value="Aspirant"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThreatActorSophisticationEnum-1.0")
@XmlEnum
public enum ThreatActorSophisticationEnum10 {


    /**
     * Demonstrates sophisticated capability. An innovator has the ability to create and script unique programs and codes targeting virtually any form of technology. At this level, this actor has a deep knowledge of networks, operating systems, programming languages, firmware, and infrastructure topologies and will demonstrate operational security when conducting his activities. Innovators are largely responsible for the discovery of 0-day vulnerabilities and the development of new attack techniques.
     * 
     */
    @XmlEnumValue("Innovator")
    INNOVATOR("Innovator"),

    /**
     * Demonstrates advanced capability. An actor possessing expert capability has the ability to modify existing programs or codes but does not have the capability to script sophisticated programs from scratch. The expert has a working knowledge of networks, operating systems, and possibly even defensive techniques and will typically exhibit some operational security.
     * 
     */
    @XmlEnumValue("Expert")
    EXPERT("Expert"),

    /**
     * Has a demonstrated, albeit low, capability. A practitioner possesses low sophistication capability. He does not have the ability to identify or exploit known vulnerabilities without the use of automated tools. He is proficient in the basic uses of publicly available hacking tools, but is unable to write or alter such programs on his own.
     * 
     */
    @XmlEnumValue("Practitioner")
    PRACTITIONER("Practitioner"),

    /**
     * Demonstrates a nascent capability. A novice has basic computer skills and likely requires the assistance of a Practitioner or higher to engage in hacking activity. He uses existing and frequently well known and easy-to-find techniques and programs or scripts to search for and exploit weaknesses in other computers on the Internet and lacks the ability to conduct his own reconnaissance and targeting research.
     * 
     */
    @XmlEnumValue("Novice")
    NOVICE("Novice"),

    /**
     * Demonstrates no capability.
     * 
     */
    @XmlEnumValue("Aspirant")
    ASPIRANT("Aspirant");
    private final String value;

    ThreatActorSophisticationEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThreatActorSophisticationEnum10 fromValue(String v) {
        for (ThreatActorSophisticationEnum10 c: ThreatActorSophisticationEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}