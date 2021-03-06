//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.stix.stix_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.mitre.cybox.cybox_2.Observables;
import org.mitre.stix.common_1.ExploitTargetsType;


/**
 * STIXType defines a bundle of information characterized in the Structured Threat Information eXpression (STIX) language.
 * 
 * <p>Java class for STIXType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STIXType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STIX_Header" type="{http://stix.mitre.org/stix-1}STIXHeaderType" minOccurs="0"/>
 *         &lt;element name="Observables" type="{http://cybox.mitre.org/cybox-2}ObservablesType" minOccurs="0"/>
 *         &lt;element name="Indicators" type="{http://stix.mitre.org/stix-1}IndicatorsType" minOccurs="0"/>
 *         &lt;element name="TTPs" type="{http://stix.mitre.org/stix-1}TTPsType" minOccurs="0"/>
 *         &lt;element name="Exploit_Targets" type="{http://stix.mitre.org/common-1}ExploitTargetsType" minOccurs="0"/>
 *         &lt;element name="Incidents" type="{http://stix.mitre.org/stix-1}IncidentsType" minOccurs="0"/>
 *         &lt;element name="Courses_Of_Action" type="{http://stix.mitre.org/stix-1}CoursesOfActionType" minOccurs="0"/>
 *         &lt;element name="Campaigns" type="{http://stix.mitre.org/stix-1}CampaignsType" minOccurs="0"/>
 *         &lt;element name="Threat_Actors" type="{http://stix.mitre.org/stix-1}ThreatActorsType" minOccurs="0"/>
 *         &lt;element name="Related_Packages" type="{http://stix.mitre.org/stix-1}RelatedPackagesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="idref" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="version" type="{http://stix.mitre.org/stix-1}STIXPackageVersionEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STIXType", propOrder = {
    "stixHeader",
    "observables",
    "indicators",
    "ttPs",
    "exploitTargets",
    "incidents",
    "coursesOfAction",
    "campaigns",
    "threatActors",
    "relatedPackages"
})
@XmlRootElement(name = "STIX_Package")
public class STIXPackage {

    @XmlElement(name = "STIX_Header")
    protected STIXHeaderType stixHeader;
    @XmlElement(name = "Observables")
    protected Observables observables;
    @XmlElement(name = "Indicators")
    protected IndicatorsType indicators;
    @XmlElement(name = "TTPs")
    protected TTPsType ttPs;
    @XmlElement(name = "Exploit_Targets")
    protected ExploitTargetsType exploitTargets;
    @XmlElement(name = "Incidents")
    protected IncidentsType incidents;
    @XmlElement(name = "Courses_Of_Action")
    protected CoursesOfActionType coursesOfAction;
    @XmlElement(name = "Campaigns")
    protected CampaignsType campaigns;
    @XmlElement(name = "Threat_Actors")
    protected ThreatActorsType threatActors;
    @XmlElement(name = "Related_Packages")
    protected RelatedPackagesType relatedPackages;
    @XmlAttribute(name = "id")
    protected QName id;
    @XmlAttribute(name = "idref")
    protected QName idref;
    @XmlAttribute(name = "timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the stixHeader property.
     * 
     * @return
     *     possible object is
     *     {@link STIXHeaderType }
     *     
     */
    public STIXHeaderType getSTIXHeader() {
        return stixHeader;
    }

    /**
     * Sets the value of the stixHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link STIXHeaderType }
     *     
     */
    public void setSTIXHeader(STIXHeaderType value) {
        this.stixHeader = value;
    }

    /**
     * Gets the value of the observables property.
     * 
     * @return
     *     possible object is
     *     {@link Observables }
     *     
     */
    public Observables getObservables() {
        return observables;
    }

    /**
     * Sets the value of the observables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Observables }
     *     
     */
    public void setObservables(Observables value) {
        this.observables = value;
    }

    /**
     * Gets the value of the indicators property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorsType }
     *     
     */
    public IndicatorsType getIndicators() {
        return indicators;
    }

    /**
     * Sets the value of the indicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorsType }
     *     
     */
    public void setIndicators(IndicatorsType value) {
        this.indicators = value;
    }

    /**
     * Gets the value of the ttPs property.
     * 
     * @return
     *     possible object is
     *     {@link TTPsType }
     *     
     */
    public TTPsType getTTPs() {
        return ttPs;
    }

    /**
     * Sets the value of the ttPs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTPsType }
     *     
     */
    public void setTTPs(TTPsType value) {
        this.ttPs = value;
    }

    /**
     * Gets the value of the exploitTargets property.
     * 
     * @return
     *     possible object is
     *     {@link ExploitTargetsType }
     *     
     */
    public ExploitTargetsType getExploitTargets() {
        return exploitTargets;
    }

    /**
     * Sets the value of the exploitTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExploitTargetsType }
     *     
     */
    public void setExploitTargets(ExploitTargetsType value) {
        this.exploitTargets = value;
    }

    /**
     * Gets the value of the incidents property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentsType }
     *     
     */
    public IncidentsType getIncidents() {
        return incidents;
    }

    /**
     * Sets the value of the incidents property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentsType }
     *     
     */
    public void setIncidents(IncidentsType value) {
        this.incidents = value;
    }

    /**
     * Gets the value of the coursesOfAction property.
     * 
     * @return
     *     possible object is
     *     {@link CoursesOfActionType }
     *     
     */
    public CoursesOfActionType getCoursesOfAction() {
        return coursesOfAction;
    }

    /**
     * Sets the value of the coursesOfAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoursesOfActionType }
     *     
     */
    public void setCoursesOfAction(CoursesOfActionType value) {
        this.coursesOfAction = value;
    }

    /**
     * Gets the value of the campaigns property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignsType }
     *     
     */
    public CampaignsType getCampaigns() {
        return campaigns;
    }

    /**
     * Sets the value of the campaigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignsType }
     *     
     */
    public void setCampaigns(CampaignsType value) {
        this.campaigns = value;
    }

    /**
     * Gets the value of the threatActors property.
     * 
     * @return
     *     possible object is
     *     {@link ThreatActorsType }
     *     
     */
    public ThreatActorsType getThreatActors() {
        return threatActors;
    }

    /**
     * Sets the value of the threatActors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreatActorsType }
     *     
     */
    public void setThreatActors(ThreatActorsType value) {
        this.threatActors = value;
    }

    /**
     * Gets the value of the relatedPackages property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPackagesType }
     *     
     */
    public RelatedPackagesType getRelatedPackages() {
        return relatedPackages;
    }

    /**
     * Sets the value of the relatedPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPackagesType }
     *     
     */
    public void setRelatedPackages(RelatedPackagesType value) {
        this.relatedPackages = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setId(QName value) {
        this.id = value;
    }

    /**
     * Gets the value of the idref property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getIdref() {
        return idref;
    }

    /**
     * Sets the value of the idref property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setIdref(QName value) {
        this.idref = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
