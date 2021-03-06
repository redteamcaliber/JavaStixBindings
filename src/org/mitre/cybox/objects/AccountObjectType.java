//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.DateTimeObjectPropertyType;
import org.mitre.cybox.common_2.ObjectPropertiesType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The AccountObjectType type is intended to characterize generic accounts.
 * 
 * <p>Java class for AccountObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/common-2}ObjectPropertiesType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Authentication" type="{http://cybox.mitre.org/objects#AccountObject-2}AuthenticationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Creation_Date" type="{http://cybox.mitre.org/common-2}DateTimeObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Modified_Date" type="{http://cybox.mitre.org/common-2}DateTimeObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Last_Accessed_Time" type="{http://cybox.mitre.org/common-2}DateTimeObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="locked_out" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountObjectType", namespace = "http://cybox.mitre.org/objects#AccountObject-2", propOrder = {
    "description",
    "domain",
    "authentications",
    "creationDate",
    "modifiedDate",
    "lastAccessedTime"
})
@XmlSeeAlso({
    WindowsComputerAccount.class,
    UserAccountObjectType.class
})
public class AccountObjectType
    extends ObjectPropertiesType
{

    @XmlElement(name = "Description")
    protected StringObjectPropertyType description;
    @XmlElement(name = "Domain")
    protected StringObjectPropertyType domain;
    @XmlElement(name = "Authentication")
    protected List<AuthenticationType> authentications;
    @XmlElement(name = "Creation_Date")
    protected DateTimeObjectPropertyType creationDate;
    @XmlElement(name = "Modified_Date")
    protected DateTimeObjectPropertyType modifiedDate;
    @XmlElement(name = "Last_Accessed_Time")
    protected DateTimeObjectPropertyType lastAccessedTime;
    @XmlAttribute(name = "disabled")
    protected Boolean disabled;
    @XmlAttribute(name = "locked_out")
    protected Boolean lockedOut;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setDescription(StringObjectPropertyType value) {
        this.description = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setDomain(StringObjectPropertyType value) {
        this.domain = value;
    }

    /**
     * Gets the value of the authentications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authentications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthentications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationType }
     * 
     * 
     */
    public List<AuthenticationType> getAuthentications() {
        if (authentications == null) {
            authentications = new ArrayList<AuthenticationType>();
        }
        return this.authentications;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public DateTimeObjectPropertyType getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public void setCreationDate(DateTimeObjectPropertyType value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public DateTimeObjectPropertyType getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public void setModifiedDate(DateTimeObjectPropertyType value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the lastAccessedTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public DateTimeObjectPropertyType getLastAccessedTime() {
        return lastAccessedTime;
    }

    /**
     * Sets the value of the lastAccessedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public void setLastAccessedTime(DateTimeObjectPropertyType value) {
        this.lastAccessedTime = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the lockedOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockedOut() {
        return lockedOut;
    }

    /**
     * Sets the value of the lockedOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockedOut(Boolean value) {
        this.lockedOut = value;
    }

}
