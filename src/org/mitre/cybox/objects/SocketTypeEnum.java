//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocketTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SocketTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOCK_STREAM"/>
 *     &lt;enumeration value="SOCK_DGRAM"/>
 *     &lt;enumeration value="SOCK_RAW"/>
 *     &lt;enumeration value="SOCK_RDM"/>
 *     &lt;enumeration value="SOCK_SEQPACKET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SocketTypeEnum", namespace = "http://cybox.mitre.org/objects#NetworkSocketObject-2")
@XmlEnum
public enum SocketTypeEnum {


    /**
     * Specifies a pipe-like socket which operates over a connection with a particular remote socket, and transmits data reliably as a stream of bytes.
     * 
     */
    SOCK_STREAM,

    /**
     * Specifies a socket in which individually-addressed packets are sent (datagram).
     * 
     */
    SOCK_DGRAM,

    /**
     * Specifies raw sockets which allow new IP protocls to be implemented in user space. A raw socket receives or sends the raw datagram not including link level headers.
     * 
     */
    SOCK_RAW,

    /**
     * Specifies a socket indicating a reliably-delivered message..
     * 
     */
    SOCK_RDM,

    /**
     * Specifies a datagram congestion control Protocol socket.
     * 
     */
    SOCK_SEQPACKET;

    public String value() {
        return name();
    }

    public static SocketTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}