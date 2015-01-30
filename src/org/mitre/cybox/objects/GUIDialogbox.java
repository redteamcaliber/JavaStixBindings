//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The GUIDialogboxObjectType type is intended to characterize GUI dialog boxes.
 * 
 * <p>Java class for GUIDialogboxObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GUIDialogboxObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/objects#GUIObject-2}GUIObjectType">
 *       &lt;sequence>
 *         &lt;element name="Box_Caption" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Box_Text" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GUIDialogboxObjectType", namespace = "http://cybox.mitre.org/objects#GUIDialogboxObject-2", propOrder = {
    "boxCaption",
    "boxText"
})
@XmlRootElement(name = "GUI_Dialogbox", namespace = "http://cybox.mitre.org/objects#GUIDialogboxObject-2")
public class GUIDialogbox
    extends GUIObjectType
{

    @XmlElement(name = "Box_Caption")
    protected StringObjectPropertyType boxCaption;
    @XmlElement(name = "Box_Text")
    protected StringObjectPropertyType boxText;

    /**
     * Gets the value of the boxCaption property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getBoxCaption() {
        return boxCaption;
    }

    /**
     * Sets the value of the boxCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setBoxCaption(StringObjectPropertyType value) {
        this.boxCaption = value;
    }

    /**
     * Gets the value of the boxText property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getBoxText() {
        return boxText;
    }

    /**
     * Sets the value of the boxText property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setBoxText(StringObjectPropertyType value) {
        this.boxText = value;
    }

}
