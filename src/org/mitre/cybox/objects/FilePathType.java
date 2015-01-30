//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The FilePathType type specifies the path to the file, not including the device. Whether the path is relative or fully-qualified can be specified via the 'fully_qualified' attribute.
 * 
 * <p>Java class for FilePathType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilePathType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://cybox.mitre.org/common-2>StringObjectPropertyType">
 *       &lt;attribute name="fully_qualified" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilePathType", namespace = "http://cybox.mitre.org/objects#FileObject-2")
public class FilePathType
    extends StringObjectPropertyType
{

    @XmlAttribute(name = "fully_qualified")
    protected Boolean fullyQualified;

    /**
     * Gets the value of the fullyQualified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullyQualified() {
        return fullyQualified;
    }

    /**
     * Sets the value of the fullyQualified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullyQualified(Boolean value) {
        this.fullyQualified = value;
    }

}
