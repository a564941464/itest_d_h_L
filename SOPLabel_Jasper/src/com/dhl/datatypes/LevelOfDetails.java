//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.09.25 at 02:04:03 PM IST 
//


package com.dhl.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LevelOfDetails.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LevelOfDetails">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LAST_CHECK_POINT_ONLY"/>
 *     &lt;enumeration value="ALL_CHECK_POINTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LevelOfDetails")
@XmlEnum
public enum LevelOfDetails {

    LAST_CHECK_POINT_ONLY,
    ALL_CHECK_POINTS;

    public String value() {
        return name();
    }

    public static LevelOfDetails fromValue(String v) {
        return valueOf(v);
    }

}
