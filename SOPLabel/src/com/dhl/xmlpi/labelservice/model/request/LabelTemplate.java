//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 04:46:27 PM IST 
//


package com.dhl.xmlpi.labelservice.model.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelTemplate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LabelTemplate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="30"/>
 *     &lt;enumeration value="ECOM_8X4_A4_PDF"/>
 *     &lt;enumeration value="ECOM_8X4_thermal"/>
 *     &lt;enumeration value="ECOM_8X4_A4_TC_PDF"/>
 *     &lt;enumeration value="ECOM_6X4_thermal"/>
 *     &lt;enumeration value="ECOM_6X4_A4_PDF"/>
 *     &lt;enumeration value="ECOM_8X4_CI_PDF"/>
 *     &lt;enumeration value="ECOM_8X4_CI_thermal"/>
 *     &lt;enumeration value="ECOM_8X4_RU_A4_PDF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelTemplate")
@XmlEnum
public enum LabelTemplate {

    @XmlEnumValue("ECOM26_84_A4_001")
    ECOM_8X4_A4_PDF("ECOM26_84_A4_001"),
    @XmlEnumValue("ECOM26_84_001")
    ECOM_8X4_thermal("ECOM26_84_001"),
    @XmlEnumValue("ECOM_TC_A4")
    ECOM_8X4_A4_TC_PDF("ECOM_TC_A4"),
    @XmlEnumValue("ECOM26_A6_002")
    ECOM_6X4_thermal("ECOM26_A6_002"),
    @XmlEnumValue("ECOM26_A6_002")
    ECOM_6X4_A4_PDF("ECOM26_A6_002"),
    @XmlEnumValue("ECOM26_84CI_001")
    ECOM_8X4_CI_PDF("ECOM26_84CI_001"),
    @XmlEnumValue("ECOM26_84CI_001")
    ECOM_8X4_CI_thermal("ECOM26_84CI_001"),
    //BEGIN :: Added below New value for XMLPI Label Enhancement :: Rajesh Nagampurath :: 08-DEC-2014 | XMLPI Label Enhancement | XML_PI_v52_Cyrillic
   /* @XmlEnumValue("RU_ECOM_A4")
    ECOM_8X4_RU_PDF("RU_ECOM_A4");*/
    @XmlEnumValue("ECOM_A4_RU_002")
    ECOM_8X4_RU_A4_PDF("ECOM_A4_RU_002");
    //END :: Rajesh Nagampurath :: 08-DEC-2014 | XMLPI Label Enhancement | XML_PI_v52_Cyrillic
    
    private final String value;

    LabelTemplate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LabelTemplate fromValue(String v) {
        for (LabelTemplate c: LabelTemplate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
