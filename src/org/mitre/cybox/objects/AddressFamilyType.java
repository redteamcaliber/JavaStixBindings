//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.BaseObjectPropertyType;


/**
 * AddressFamilyType specifies address family types, via a union of the AddressFamilyTypeEnum type and the atomic xs:string type. Its base type is the CybOX Core BaseObjectPropertyType, for permitting complex (i.e. regular-expression based) specifications.
 * 
 * <p>Java class for AddressFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressFamilyType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://cybox.mitre.org/common-2>BaseObjectPropertyType">
 *       &lt;attribute name="datatype" type="{http://cybox.mitre.org/common-2}DatatypeEnum" fixed="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressFamilyType", namespace = "http://cybox.mitre.org/objects#NetworkSocketObject-2")
public class AddressFamilyType
    extends BaseObjectPropertyType
{


}
