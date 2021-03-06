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
import org.mitre.cybox.common_2.DateTimeObjectPropertyType;
import org.mitre.cybox.common_2.LongObjectPropertyType;
import org.mitre.cybox.common_2.ObjectPropertiesType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The WindowsPrefetchObjectType type is intended to characterize entries in the Windows prefetch files. Starting with Windows XP, prefetching was introduced to speed up application startup. The prefetch object draws upon the descriptions and XML sample at http://www.forensicswiki.org/wiki/Prefetch_XML.
 * 
 * <p>Java class for WindowsPrefetchObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowsPrefetchObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/common-2}ObjectPropertiesType">
 *       &lt;sequence>
 *         &lt;element name="Application_File_Name" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Prefetch_Hash" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Times_Executed" type="{http://cybox.mitre.org/common-2}LongObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="First_Run" type="{http://cybox.mitre.org/common-2}DateTimeObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Last_Run" type="{http://cybox.mitre.org/common-2}DateTimeObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Volume" type="{http://cybox.mitre.org/objects#WinPrefetchObject-2}VolumeType" minOccurs="0"/>
 *         &lt;element name="Accessed_File_List" type="{http://cybox.mitre.org/objects#WinPrefetchObject-2}AccessedFileListType" minOccurs="0"/>
 *         &lt;element name="Accessed_Directory_List" type="{http://cybox.mitre.org/objects#WinPrefetchObject-2}AccessedDirectoryListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowsPrefetchObjectType", namespace = "http://cybox.mitre.org/objects#WinPrefetchObject-2", propOrder = {
    "applicationFileName",
    "prefetchHash",
    "timesExecuted",
    "firstRun",
    "lastRun",
    "volume",
    "accessedFileList",
    "accessedDirectoryList"
})
@XmlRootElement(name = "Windows_Prefetch_Entry", namespace = "http://cybox.mitre.org/objects#WinPrefetchObject-2")
public class WindowsPrefetchEntry
    extends ObjectPropertiesType
{

    @XmlElement(name = "Application_File_Name")
    protected StringObjectPropertyType applicationFileName;
    @XmlElement(name = "Prefetch_Hash")
    protected StringObjectPropertyType prefetchHash;
    @XmlElement(name = "Times_Executed")
    protected LongObjectPropertyType timesExecuted;
    @XmlElement(name = "First_Run")
    protected DateTimeObjectPropertyType firstRun;
    @XmlElement(name = "Last_Run")
    protected DateTimeObjectPropertyType lastRun;
    @XmlElement(name = "Volume")
    protected VolumeType volume;
    @XmlElement(name = "Accessed_File_List")
    protected AccessedFileListType accessedFileList;
    @XmlElement(name = "Accessed_Directory_List")
    protected AccessedDirectoryListType accessedDirectoryList;

    /**
     * Gets the value of the applicationFileName property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getApplicationFileName() {
        return applicationFileName;
    }

    /**
     * Sets the value of the applicationFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setApplicationFileName(StringObjectPropertyType value) {
        this.applicationFileName = value;
    }

    /**
     * Gets the value of the prefetchHash property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getPrefetchHash() {
        return prefetchHash;
    }

    /**
     * Sets the value of the prefetchHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setPrefetchHash(StringObjectPropertyType value) {
        this.prefetchHash = value;
    }

    /**
     * Gets the value of the timesExecuted property.
     * 
     * @return
     *     possible object is
     *     {@link LongObjectPropertyType }
     *     
     */
    public LongObjectPropertyType getTimesExecuted() {
        return timesExecuted;
    }

    /**
     * Sets the value of the timesExecuted property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongObjectPropertyType }
     *     
     */
    public void setTimesExecuted(LongObjectPropertyType value) {
        this.timesExecuted = value;
    }

    /**
     * Gets the value of the firstRun property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public DateTimeObjectPropertyType getFirstRun() {
        return firstRun;
    }

    /**
     * Sets the value of the firstRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public void setFirstRun(DateTimeObjectPropertyType value) {
        this.firstRun = value;
    }

    /**
     * Gets the value of the lastRun property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public DateTimeObjectPropertyType getLastRun() {
        return lastRun;
    }

    /**
     * Sets the value of the lastRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public void setLastRun(DateTimeObjectPropertyType value) {
        this.lastRun = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setVolume(VolumeType value) {
        this.volume = value;
    }

    /**
     * Gets the value of the accessedFileList property.
     * 
     * @return
     *     possible object is
     *     {@link AccessedFileListType }
     *     
     */
    public AccessedFileListType getAccessedFileList() {
        return accessedFileList;
    }

    /**
     * Sets the value of the accessedFileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessedFileListType }
     *     
     */
    public void setAccessedFileList(AccessedFileListType value) {
        this.accessedFileList = value;
    }

    /**
     * Gets the value of the accessedDirectoryList property.
     * 
     * @return
     *     possible object is
     *     {@link AccessedDirectoryListType }
     *     
     */
    public AccessedDirectoryListType getAccessedDirectoryList() {
        return accessedDirectoryList;
    }

    /**
     * Sets the value of the accessedDirectoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessedDirectoryListType }
     *     
     */
    public void setAccessedDirectoryList(AccessedDirectoryListType value) {
        this.accessedDirectoryList = value;
    }

}
