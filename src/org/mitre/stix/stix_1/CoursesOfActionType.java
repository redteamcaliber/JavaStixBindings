//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.stix.stix_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.stix.common_1.CourseOfActionBaseType;


/**
 * <p>Java class for CoursesOfActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoursesOfActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Course_Of_Action" type="{http://stix.mitre.org/common-1}CourseOfActionBaseType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoursesOfActionType", propOrder = {
    "courseOfActions"
})
public class CoursesOfActionType {

    @XmlElement(name = "Course_Of_Action", required = true)
    protected List<CourseOfActionBaseType> courseOfActions;

    /**
     * Gets the value of the courseOfActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseOfActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseOfActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseOfActionBaseType }
     * 
     * 
     */
    public List<CourseOfActionBaseType> getCourseOfActions() {
        if (courseOfActions == null) {
            courseOfActions = new ArrayList<CourseOfActionBaseType>();
        }
        return this.courseOfActions;
    }

}
