//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.stix.common_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.cybox_2.Observable;


/**
 * Identifies or characterizes a relationship to a cyber observable.
 * 
 * <p>Java class for RelatedObservableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedObservableType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://stix.mitre.org/common-1}GenericRelationshipType">
 *       &lt;sequence>
 *         &lt;element name="Observable" type="{http://cybox.mitre.org/cybox-2}ObservableType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedObservableType", propOrder = {
    "observable"
})
public class RelatedObservableType
    extends GenericRelationshipType
{

    @XmlElement(name = "Observable", required = true)
    protected Observable observable;

    /**
     * Gets the value of the observable property.
     * 
     * @return
     *     possible object is
     *     {@link Observable }
     *     
     */
    public Observable getObservable() {
        return observable;
    }

    /**
     * Sets the value of the observable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Observable }
     *     
     */
    public void setObservable(Observable value) {
        this.observable = value;
    }

}
