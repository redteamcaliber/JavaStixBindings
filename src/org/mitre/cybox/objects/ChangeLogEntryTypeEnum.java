//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeLogEntryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeLogEntryTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UPDATE_ACL"/>
 *     &lt;enumeration value="UPDATE_ATTRIBUTES"/>
 *     &lt;enumeration value="DELETE_FILE"/>
 *     &lt;enumeration value="CREATE_FILE"/>
 *     &lt;enumeration value="RENAME_FILE"/>
 *     &lt;enumeration value="CREATE_DIRECTORY"/>
 *     &lt;enumeration value="RENAME_DIRECTORY"/>
 *     &lt;enumeration value="DELETE_DIRECTORY"/>
 *     &lt;enumeration value="MNT_CREATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeLogEntryTypeEnum", namespace = "http://cybox.mitre.org/objects#WinSystemRestoreObject-2")
@XmlEnum
public enum ChangeLogEntryTypeEnum {


    /**
     * Represents a changelog entry descriptor for updating an ACL. (0x00000001).
     * 
     */
    UPDATE_ACL,

    /**
     * Represents a changelog entry descriptor for updating attributes. (0x00000002).
     * 
     */
    UPDATE_ATTRIBUTES,

    /**
     * Represents a changelog entry descriptor for deleting a file. (0x00000004).
     * 
     */
    DELETE_FILE,

    /**
     * Represents a changelog entry descriptor for creating a file. (0x00000010).
     * 
     */
    CREATE_FILE,

    /**
     * Represents a changelog entry descriptor for renaming a file. (0x00000020).
     * 
     */
    RENAME_FILE,

    /**
     * Represents a changelog entry descriptor for creating a directory. (0x00000040).
     * 
     */
    CREATE_DIRECTORY,

    /**
     * Represents a changelog entry descriptor for renaming a directory. (0x00000080).
     * 
     */
    RENAME_DIRECTORY,

    /**
     * Represents a changelog entry descriptor for deleting a directory. (0x00000100).
     * 
     */
    DELETE_DIRECTORY,

    /**
     * Related to filesystem attachment points. (0x00000200).
     * 
     */
    MNT_CREATE;

    public String value() {
        return name();
    }

    public static ChangeLogEntryTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}