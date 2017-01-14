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
 * <p>Java class for BillCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="2"/>
 *     &lt;maxLength value="3"/>
 *     &lt;enumeration value="DSA"/>
 *     &lt;enumeration value="DBA"/>
 *     &lt;enumeration value="TCA"/>
 *     &lt;enumeration value="IEA"/>
 *     &lt;enumeration value="UAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillCode")
@XmlEnum
public enum BillCode {

    DSA,
    DBA,
    TCA,
    IEA,
    UAN;

    public String value() {
        return name();
    }

    public static BillCode fromValue(String v) {
        return valueOf(v);
    }

}