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
import org.mitre.cybox.common_2.DigitalSignatureInfoType;
import org.mitre.cybox.common_2.ObjectPropertiesType;
import org.mitre.cybox.common_2.StringObjectPropertyType;
import org.mitre.cybox.common_2.UnsignedLongObjectPropertyType;


/**
 * The WindowsKernelHookObjectType type is intended to characterize Windows kernel function hooks.
 * 
 * <p>Java class for WindowsKernelHookObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowsKernelHookObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/common-2}ObjectPropertiesType">
 *       &lt;sequence>
 *         &lt;element name="Digital_Signature_Hooking" type="{http://cybox.mitre.org/common-2}DigitalSignatureInfoType" minOccurs="0"/>
 *         &lt;element name="Digital_Signature_Hooked" type="{http://cybox.mitre.org/common-2}DigitalSignatureInfoType" minOccurs="0"/>
 *         &lt;element name="Hooking_Address" type="{http://cybox.mitre.org/common-2}UnsignedLongObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Hook_Description" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Hooked_Function" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Hooked_Module" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Hooking_Module" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://cybox.mitre.org/objects#WinKernelHookObject-2}KernelHookType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowsKernelHookObjectType", namespace = "http://cybox.mitre.org/objects#WinKernelHookObject-2", propOrder = {
    "digitalSignatureHooking",
    "digitalSignatureHooked",
    "hookingAddress",
    "hookDescription",
    "hookedFunction",
    "hookedModule",
    "hookingModule",
    "type"
})
@XmlRootElement(name = "Windows_Kernel_Hook", namespace = "http://cybox.mitre.org/objects#WinKernelHookObject-2")
public class WindowsKernelHook
    extends ObjectPropertiesType
{

    @XmlElement(name = "Digital_Signature_Hooking")
    protected DigitalSignatureInfoType digitalSignatureHooking;
    @XmlElement(name = "Digital_Signature_Hooked")
    protected DigitalSignatureInfoType digitalSignatureHooked;
    @XmlElement(name = "Hooking_Address")
    protected UnsignedLongObjectPropertyType hookingAddress;
    @XmlElement(name = "Hook_Description")
    protected StringObjectPropertyType hookDescription;
    @XmlElement(name = "Hooked_Function")
    protected StringObjectPropertyType hookedFunction;
    @XmlElement(name = "Hooked_Module")
    protected StringObjectPropertyType hookedModule;
    @XmlElement(name = "Hooking_Module")
    protected StringObjectPropertyType hookingModule;
    @XmlElement(name = "Type")
    protected KernelHookType type;

    /**
     * Gets the value of the digitalSignatureHooking property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalSignatureInfoType }
     *     
     */
    public DigitalSignatureInfoType getDigitalSignatureHooking() {
        return digitalSignatureHooking;
    }

    /**
     * Sets the value of the digitalSignatureHooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalSignatureInfoType }
     *     
     */
    public void setDigitalSignatureHooking(DigitalSignatureInfoType value) {
        this.digitalSignatureHooking = value;
    }

    /**
     * Gets the value of the digitalSignatureHooked property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalSignatureInfoType }
     *     
     */
    public DigitalSignatureInfoType getDigitalSignatureHooked() {
        return digitalSignatureHooked;
    }

    /**
     * Sets the value of the digitalSignatureHooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalSignatureInfoType }
     *     
     */
    public void setDigitalSignatureHooked(DigitalSignatureInfoType value) {
        this.digitalSignatureHooked = value;
    }

    /**
     * Gets the value of the hookingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedLongObjectPropertyType }
     *     
     */
    public UnsignedLongObjectPropertyType getHookingAddress() {
        return hookingAddress;
    }

    /**
     * Sets the value of the hookingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedLongObjectPropertyType }
     *     
     */
    public void setHookingAddress(UnsignedLongObjectPropertyType value) {
        this.hookingAddress = value;
    }

    /**
     * Gets the value of the hookDescription property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getHookDescription() {
        return hookDescription;
    }

    /**
     * Sets the value of the hookDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setHookDescription(StringObjectPropertyType value) {
        this.hookDescription = value;
    }

    /**
     * Gets the value of the hookedFunction property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getHookedFunction() {
        return hookedFunction;
    }

    /**
     * Sets the value of the hookedFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setHookedFunction(StringObjectPropertyType value) {
        this.hookedFunction = value;
    }

    /**
     * Gets the value of the hookedModule property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getHookedModule() {
        return hookedModule;
    }

    /**
     * Sets the value of the hookedModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setHookedModule(StringObjectPropertyType value) {
        this.hookedModule = value;
    }

    /**
     * Gets the value of the hookingModule property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getHookingModule() {
        return hookingModule;
    }

    /**
     * Sets the value of the hookingModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setHookingModule(StringObjectPropertyType value) {
        this.hookingModule = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link KernelHookType }
     *     
     */
    public KernelHookType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link KernelHookType }
     *     
     */
    public void setType(KernelHookType value) {
        this.type = value;
    }

}