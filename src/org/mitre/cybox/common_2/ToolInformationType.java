//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.common_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * The ToolInformationType is intended to characterize the properties of a hardware or software tool, including those related to instances of its use.
 * 
 * <p>Java class for ToolInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToolInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://cybox.mitre.org/common-2}ControlledVocabularyStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://cybox.mitre.org/common-2}StructuredTextType" minOccurs="0"/>
 *         &lt;element name="References" type="{http://cybox.mitre.org/common-2}ToolReferencesType" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Pack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tool_Specific_Data" type="{http://cybox.mitre.org/common-2}ToolSpecificDataType" minOccurs="0"/>
 *         &lt;element name="Tool_Hashes" type="{http://cybox.mitre.org/common-2}HashListType" minOccurs="0"/>
 *         &lt;element name="Tool_Configuration" type="{http://cybox.mitre.org/common-2}ToolConfigurationType" minOccurs="0"/>
 *         &lt;element name="Execution_Environment" type="{http://cybox.mitre.org/common-2}ExecutionEnvironmentType" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://cybox.mitre.org/common-2}ErrorsType" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{http://cybox.mitre.org/common-2}MetadataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Compensation_Model" type="{http://cybox.mitre.org/common-2}CompensationModelType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="idref" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToolInformationType", propOrder = {
    "name",
    "types",
    "description",
    "references",
    "vendor",
    "version",
    "servicePack",
    "toolSpecificData",
    "toolHashes",
    "toolConfiguration",
    "executionEnvironment",
    "errors",
    "metadatas",
    "compensationModel"
})
@XmlSeeAlso({
    org.mitre.stix.common_1.ToolInformationType.class
})
public class ToolInformationType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type")
    protected List<ControlledVocabularyStringType> types;
    @XmlElement(name = "Description")
    protected StructuredTextType description;
    @XmlElement(name = "References")
    protected ToolReferencesType references;
    @XmlElement(name = "Vendor")
    protected String vendor;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Service_Pack")
    protected String servicePack;
    @XmlElement(name = "Tool_Specific_Data")
    protected ToolSpecificDataType toolSpecificData;
    @XmlElement(name = "Tool_Hashes")
    protected HashListType toolHashes;
    @XmlElement(name = "Tool_Configuration")
    protected ToolConfigurationType toolConfiguration;
    @XmlElement(name = "Execution_Environment")
    protected ExecutionEnvironmentType executionEnvironment;
    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "Metadata")
    protected List<MetadataType> metadatas;
    @XmlElement(name = "Compensation_Model")
    protected CompensationModelType compensationModel;
    @XmlAttribute(name = "id")
    protected QName id;
    @XmlAttribute(name = "idref")
    protected QName idref;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlledVocabularyStringType }
     * 
     * 
     */
    public List<ControlledVocabularyStringType> getTypes() {
        if (types == null) {
            types = new ArrayList<ControlledVocabularyStringType>();
        }
        return this.types;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredTextType }
     *     
     */
    public StructuredTextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredTextType }
     *     
     */
    public void setDescription(StructuredTextType value) {
        this.description = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link ToolReferencesType }
     *     
     */
    public ToolReferencesType getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolReferencesType }
     *     
     */
    public void setReferences(ToolReferencesType value) {
        this.references = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
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

    /**
     * Gets the value of the servicePack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePack() {
        return servicePack;
    }

    /**
     * Sets the value of the servicePack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePack(String value) {
        this.servicePack = value;
    }

    /**
     * Gets the value of the toolSpecificData property.
     * 
     * @return
     *     possible object is
     *     {@link ToolSpecificDataType }
     *     
     */
    public ToolSpecificDataType getToolSpecificData() {
        return toolSpecificData;
    }

    /**
     * Sets the value of the toolSpecificData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolSpecificDataType }
     *     
     */
    public void setToolSpecificData(ToolSpecificDataType value) {
        this.toolSpecificData = value;
    }

    /**
     * Gets the value of the toolHashes property.
     * 
     * @return
     *     possible object is
     *     {@link HashListType }
     *     
     */
    public HashListType getToolHashes() {
        return toolHashes;
    }

    /**
     * Sets the value of the toolHashes property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashListType }
     *     
     */
    public void setToolHashes(HashListType value) {
        this.toolHashes = value;
    }

    /**
     * Gets the value of the toolConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link ToolConfigurationType }
     *     
     */
    public ToolConfigurationType getToolConfiguration() {
        return toolConfiguration;
    }

    /**
     * Sets the value of the toolConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolConfigurationType }
     *     
     */
    public void setToolConfiguration(ToolConfigurationType value) {
        this.toolConfiguration = value;
    }

    /**
     * Gets the value of the executionEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionEnvironmentType }
     *     
     */
    public ExecutionEnvironmentType getExecutionEnvironment() {
        return executionEnvironment;
    }

    /**
     * Sets the value of the executionEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionEnvironmentType }
     *     
     */
    public void setExecutionEnvironment(ExecutionEnvironmentType value) {
        this.executionEnvironment = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the metadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataType }
     * 
     * 
     */
    public List<MetadataType> getMetadatas() {
        if (metadatas == null) {
            metadatas = new ArrayList<MetadataType>();
        }
        return this.metadatas;
    }

    /**
     * Gets the value of the compensationModel property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationModelType }
     *     
     */
    public CompensationModelType getCompensationModel() {
        return compensationModel;
    }

    /**
     * Sets the value of the compensationModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationModelType }
     *     
     */
    public void setCompensationModel(CompensationModelType value) {
        this.compensationModel = value;
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

}