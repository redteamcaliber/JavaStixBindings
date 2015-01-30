//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.stix.incident_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.stix.common_1.ControlledVocabularyStringType;


/**
 * The ImpactAssessmentType specifies a summary assessment of impact for this cyber threat Incident. 
 * 
 * <p>Java class for ImpactAssessmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImpactAssessmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Direct_Impact_Summary" type="{http://stix.mitre.org/Incident-1}DirectImpactSummaryType" minOccurs="0"/>
 *         &lt;element name="Indirect_Impact_Summary" type="{http://stix.mitre.org/Incident-1}IndirectImpactSummaryType" minOccurs="0"/>
 *         &lt;element name="Total_Loss_Estimation" type="{http://stix.mitre.org/Incident-1}TotalLossEstimationType" minOccurs="0"/>
 *         &lt;element name="Impact_Qualification" type="{http://stix.mitre.org/common-1}ControlledVocabularyStringType" minOccurs="0"/>
 *         &lt;element name="Effects" type="{http://stix.mitre.org/Incident-1}EffectsType" minOccurs="0"/>
 *         &lt;element name="External_Impact_Assessment_Model" type="{http://stix.mitre.org/Incident-1}ExternalImpactAssessmentModelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpactAssessmentType", propOrder = {
    "directImpactSummary",
    "indirectImpactSummary",
    "totalLossEstimation",
    "impactQualification",
    "effects",
    "externalImpactAssessmentModel"
})
public class ImpactAssessmentType {

    @XmlElement(name = "Direct_Impact_Summary")
    protected DirectImpactSummaryType directImpactSummary;
    @XmlElement(name = "Indirect_Impact_Summary")
    protected IndirectImpactSummaryType indirectImpactSummary;
    @XmlElement(name = "Total_Loss_Estimation")
    protected TotalLossEstimationType totalLossEstimation;
    @XmlElement(name = "Impact_Qualification")
    protected ControlledVocabularyStringType impactQualification;
    @XmlElement(name = "Effects")
    protected EffectsType effects;
    @XmlElement(name = "External_Impact_Assessment_Model")
    protected ExternalImpactAssessmentModelType externalImpactAssessmentModel;

    /**
     * Gets the value of the directImpactSummary property.
     * 
     * @return
     *     possible object is
     *     {@link DirectImpactSummaryType }
     *     
     */
    public DirectImpactSummaryType getDirectImpactSummary() {
        return directImpactSummary;
    }

    /**
     * Sets the value of the directImpactSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectImpactSummaryType }
     *     
     */
    public void setDirectImpactSummary(DirectImpactSummaryType value) {
        this.directImpactSummary = value;
    }

    /**
     * Gets the value of the indirectImpactSummary property.
     * 
     * @return
     *     possible object is
     *     {@link IndirectImpactSummaryType }
     *     
     */
    public IndirectImpactSummaryType getIndirectImpactSummary() {
        return indirectImpactSummary;
    }

    /**
     * Sets the value of the indirectImpactSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndirectImpactSummaryType }
     *     
     */
    public void setIndirectImpactSummary(IndirectImpactSummaryType value) {
        this.indirectImpactSummary = value;
    }

    /**
     * Gets the value of the totalLossEstimation property.
     * 
     * @return
     *     possible object is
     *     {@link TotalLossEstimationType }
     *     
     */
    public TotalLossEstimationType getTotalLossEstimation() {
        return totalLossEstimation;
    }

    /**
     * Sets the value of the totalLossEstimation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalLossEstimationType }
     *     
     */
    public void setTotalLossEstimation(TotalLossEstimationType value) {
        this.totalLossEstimation = value;
    }

    /**
     * Gets the value of the impactQualification property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public ControlledVocabularyStringType getImpactQualification() {
        return impactQualification;
    }

    /**
     * Sets the value of the impactQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledVocabularyStringType }
     *     
     */
    public void setImpactQualification(ControlledVocabularyStringType value) {
        this.impactQualification = value;
    }

    /**
     * Gets the value of the effects property.
     * 
     * @return
     *     possible object is
     *     {@link EffectsType }
     *     
     */
    public EffectsType getEffects() {
        return effects;
    }

    /**
     * Sets the value of the effects property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectsType }
     *     
     */
    public void setEffects(EffectsType value) {
        this.effects = value;
    }

    /**
     * Gets the value of the externalImpactAssessmentModel property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalImpactAssessmentModelType }
     *     
     */
    public ExternalImpactAssessmentModelType getExternalImpactAssessmentModel() {
        return externalImpactAssessmentModel;
    }

    /**
     * Sets the value of the externalImpactAssessmentModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalImpactAssessmentModelType }
     *     
     */
    public void setExternalImpactAssessmentModel(ExternalImpactAssessmentModelType value) {
        this.externalImpactAssessmentModel = value;
    }

}
