//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.22 at 03:17:19 PM IST 
//


package com.dhl.xmlpi.shipVal.models;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargeCardNo" type="{http://www.dhl.com/datatypes_global}ChargeCardNo"/>
 *         &lt;element name="ChargeCardType" type="{http://www.dhl.com/datatypes_global}ChargeCardType"/>
 *         &lt;element name="ChargeCardConfNo" type="{http://www.dhl.com/datatypes_global}ChargeCardConfNo"/>
 *         &lt;element name="ChargeCardExpiryDate" type="{http://www.dhl.com/datatypes_global}ChargeCardExpDateValidator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeCard", propOrder = {
    "chargeCardNo",
    "chargeCardType",
    "chargeCardConfNo",
    "chargeCardExpiryDate"
})
public class ChargeCard {

    @XmlElement(name = "ChargeCardNo")
    protected long chargeCardNo;
    @XmlElement(name = "ChargeCardType", required = true)
    protected ChargeCardType chargeCardType;
    @XmlElement(name = "ChargeCardConfNo", required = true)
    protected BigInteger chargeCardConfNo;
    @XmlElement(name = "ChargeCardExpiryDate", required = true)
    protected BigInteger chargeCardExpiryDate;

    /**
     * Gets the value of the chargeCardNo property.
     * 
     */
    public long getChargeCardNo() {
        return chargeCardNo;
    }

    /**
     * Sets the value of the chargeCardNo property.
     * 
     */
    public void setChargeCardNo(long value) {
        this.chargeCardNo = value;
    }

    /**
     * Gets the value of the chargeCardType property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeCardType }
     *     
     */
    public ChargeCardType getChargeCardType() {
        return chargeCardType;
    }

    /**
     * Sets the value of the chargeCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeCardType }
     *     
     */
    public void setChargeCardType(ChargeCardType value) {
        this.chargeCardType = value;
    }

    /**
     * Gets the value of the chargeCardConfNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargeCardConfNo() {
        return chargeCardConfNo;
    }

    /**
     * Sets the value of the chargeCardConfNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargeCardConfNo(BigInteger value) {
        this.chargeCardConfNo = value;
    }

    /**
     * Gets the value of the chargeCardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargeCardExpiryDate() {
        return chargeCardExpiryDate;
    }

    /**
     * Sets the value of the chargeCardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargeCardExpiryDate(BigInteger value) {
        this.chargeCardExpiryDate = value;
    }

}
