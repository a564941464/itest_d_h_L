//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 02:35:05 PM IST 
//


package com.dhl.xmlpi.shipVal.models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelImageFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LabelImageFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="3"/>
 *     &lt;maxLength value="4"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="ZPL"/>
 *     &lt;enumeration value="ZPL2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelImageFormat")
@XmlEnum
public enum LabelImageFormat {

    PDF("PDF"),
    ZPL("ZPL"),
    @XmlEnumValue("ZPL2")
    ZPL_2("ZPL2");
    private final String value;

    LabelImageFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LabelImageFormat fromValue(String v) {
        for (LabelImageFormat c: LabelImageFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
