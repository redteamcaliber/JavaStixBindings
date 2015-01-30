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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.NonNegativeIntegerObjectPropertyType;
import org.mitre.cybox.common_2.ObjectPropertiesType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The WindowsNetworkShareObjectType type is intended to characterize Windows network shares.
 * 
 * <p>Java class for WindowsNetworkShareObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowsNetworkShareObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/common-2}ObjectPropertiesType">
 *       &lt;sequence>
 *         &lt;element name="Current_Uses" type="{http://cybox.mitre.org/common-2}NonNegativeIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Local_Path" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Max_Uses" type="{http://cybox.mitre.org/common-2}NonNegativeIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Netname" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://cybox.mitre.org/objects#WinNetworkShareObject-2}SharedResourceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://cybox.mitre.org/objects#WinNetworkShareObject-2}AccessPermissionsGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowsNetworkShareObjectType", namespace = "http://cybox.mitre.org/objects#WinNetworkShareObject-2", propOrder = {
    "currentUses",
    "localPath",
    "maxUses",
    "netname",
    "type"
})
@XmlRootElement(name = "Windows_Network_Share", namespace = "http://cybox.mitre.org/objects#WinNetworkShareObject-2")
public class WindowsNetworkShare
    extends ObjectPropertiesType
{

    @XmlElement(name = "Current_Uses")
    protected NonNegativeIntegerObjectPropertyType currentUses;
    @XmlElement(name = "Local_Path")
    protected StringObjectPropertyType localPath;
    @XmlElement(name = "Max_Uses")
    protected NonNegativeIntegerObjectPropertyType maxUses;
    @XmlElement(name = "Netname")
    protected StringObjectPropertyType netname;
    @XmlElement(name = "Type")
    protected SharedResourceType type;
    @XmlAttribute(name = "ACCESS_READ")
    protected Boolean accessread;
    @XmlAttribute(name = "ACCESS_WRITE")
    protected Boolean accesswrite;
    @XmlAttribute(name = "ACCESS_CREATE")
    protected Boolean accesscreate;
    @XmlAttribute(name = "ACCESS_EXEC")
    protected Boolean accessexec;
    @XmlAttribute(name = "ACCESS_DELETE")
    protected Boolean accessdelete;
    @XmlAttribute(name = "ACCESS_ATRIB")
    protected Boolean accessatrib;
    @XmlAttribute(name = "ACCESS_PERM")
    protected Boolean accessperm;
    @XmlAttribute(name = "ACCESS_ALL")
    protected Boolean accessall;

    /**
     * Gets the value of the currentUses property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public NonNegativeIntegerObjectPropertyType getCurrentUses() {
        return currentUses;
    }

    /**
     * Sets the value of the currentUses property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public void setCurrentUses(NonNegativeIntegerObjectPropertyType value) {
        this.currentUses = value;
    }

    /**
     * Gets the value of the localPath property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getLocalPath() {
        return localPath;
    }

    /**
     * Sets the value of the localPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setLocalPath(StringObjectPropertyType value) {
        this.localPath = value;
    }

    /**
     * Gets the value of the maxUses property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public NonNegativeIntegerObjectPropertyType getMaxUses() {
        return maxUses;
    }

    /**
     * Sets the value of the maxUses property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public void setMaxUses(NonNegativeIntegerObjectPropertyType value) {
        this.maxUses = value;
    }

    /**
     * Gets the value of the netname property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getNetname() {
        return netname;
    }

    /**
     * Sets the value of the netname property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setNetname(StringObjectPropertyType value) {
        this.netname = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SharedResourceType }
     *     
     */
    public SharedResourceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedResourceType }
     *     
     */
    public void setType(SharedResourceType value) {
        this.type = value;
    }

    /**
     * Gets the value of the accessread property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCESSREAD() {
        return accessread;
    }

    /**
     * Sets the value of the accessread property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCESSREAD(Boolean value) {
        this.accessread = value;
    }

    /**
     * Gets the value of the accesswrite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCESSWRITE() {
        return accesswrite;
    }

    /**
     * Sets the value of the accesswrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCESSWRITE(Boolean value) {
        this.accesswrite = value;
    }

    /**
     * Gets the value of the accesscreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCESSCREATE() {
        return accesscreate;
    }

    /**
     * Sets the value of the accesscreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCESSCREATE(Boolean value) {
        this.accesscreate = value;
    }

    /**
     * Gets the value of the accessexec property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCESSEXEC() {
        return accessexec;
    }

    /**
     * Sets the value of the accessexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCESSEXEC(Boolean value) {
        this.accessexec = value;
    }

    /**
     * Gets the value of the accessdelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCESSDELETE() {
        return accessdelete;
    }

    /**
     * Sets the value of the accessdelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCESSDELETE(Boolean value) {
        this.accessdelete = value;
    }

    /**
     * Gets the value of the accessatrib property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCESSATRIB() {
        return accessatrib;
    }

    /**
     * Sets the value of the accessatrib property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCESSATRIB(Boolean value) {
        this.accessatrib = value;
    }

    /**
     * Gets the value of the accessperm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCESSPERM() {
        return accessperm;
    }

    /**
     * Sets the value of the accessperm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCESSPERM(Boolean value) {
        this.accessperm = value;
    }

    /**
     * Gets the value of the accessall property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACCESSALL() {
        return accessall;
    }

    /**
     * Sets the value of the accessall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACCESSALL(Boolean value) {
        this.accessall = value;
    }

}