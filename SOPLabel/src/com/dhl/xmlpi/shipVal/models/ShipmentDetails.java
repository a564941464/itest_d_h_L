//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 02:35:05 PM IST 
//


package com.dhl.xmlpi.shipVal.models;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShipmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfPieces">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Pieces" type="{http://www.dhl.com/datatypes_global}Pieces"/>
 *         &lt;element name="Weight" type="{http://www.dhl.com/datatypes_global}Weight"/>
 *         &lt;element name="WeightUnit" type="{http://www.dhl.com/datatypes_global}WeightUnit"/>
 *         &lt;element name="GlobalProductCode" type="{http://www.dhl.com/datatypes_global}GlobalProductCode"/>
 *         &lt;element name="LocalProductCode" type="{http://www.dhl.com/datatypes_global}LocalProductCode" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.dhl.com/datatypes_global}Date"/>
 *         &lt;element name="Contents" type="{http://www.dhl.com/datatypes_global}ShipmentContents" minOccurs="0"/>
 *         &lt;element name="DoorTo" type="{http://www.dhl.com/datatypes_global}DoorTo" minOccurs="0"/>
 *         &lt;element name="DimensionUnit" type="{http://www.dhl.com/datatypes_global}DimensionUnit" minOccurs="0"/>
 *         &lt;element name="InsuredAmount" type="{http://www.dhl.com/datatypes_global}Money" minOccurs="0"/>
 *         &lt;element name="PackageType" type="{http://www.dhl.com/datatypes_global}PackageType" minOccurs="0"/>
 *         &lt;element name="IsDutiable" type="{http://www.dhl.com/datatypes_global}YesNo" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.dhl.com/datatypes_global}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="AdditionalProtection" type="{http://www.dhl.com/datatypes_global}AdditionalProtection" minOccurs="0"/>
 *         &lt;element name="DOSFlag" type="{http://www.dhl.com/datatypes_global}YesNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDetails", propOrder = {
    "numberOfPieces",
    "pieces",
    "weight",
    "weightUnit",
    "globalProductCode",
    "localProductCode",
    "date",
    "contents",
    "doorTo",
    "dimensionUnit",
    "insuredAmount",
    "packageType",
    "isDutiable",
    "currencyCode",
    "additionalProtection",
    "dosFlag"
})
public class ShipmentDetails {

    @XmlElement(name = "NumberOfPieces")
    protected int numberOfPieces;
    @XmlElement(name = "Pieces", required = true)
    protected Pieces pieces;
    @XmlElement(name = "Weight", required = true)
    protected BigDecimal weight;
    @XmlElement(name = "WeightUnit", required = true)
    protected WeightUnit weightUnit;
    @XmlElement(name = "GlobalProductCode", required = true)
    protected String globalProductCode;
    @XmlElement(name = "LocalProductCode")
    protected String localProductCode;
    @XmlElement(name = "Date", required = true)
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Contents")
    protected String contents;
    @XmlElement(name = "DoorTo")
    protected DoorTo doorTo;
    @XmlElement(name = "DimensionUnit")
    protected DimensionUnit dimensionUnit;
    @XmlElement(name = "InsuredAmount")
    protected Float insuredAmount;
    @XmlElement(name = "PackageType")
    protected PackageType packageType;
    @XmlElement(name = "IsDutiable")
    protected YesNo isDutiable;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "AdditionalProtection")
    protected AdditionalProtection additionalProtection;
    @XmlElement(name = "DOSFlag")
    protected YesNo dosFlag;

    /**
     * Gets the value of the numberOfPieces property.
     * 
     */
    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * Sets the value of the numberOfPieces property.
     * 
     */
    public void setNumberOfPieces(int value) {
        this.numberOfPieces = value;
    }

    /**
     * Gets the value of the pieces property.
     * 
     * @return
     *     possible object is
     *     {@link Pieces }
     *     
     */
    public Pieces getPieces() {
        return pieces;
    }

    /**
     * Sets the value of the pieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pieces }
     *     
     */
    public void setPieces(Pieces value) {
        this.pieces = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gets the value of the weightUnit property.
     * 
     * @return
     *     possible object is
     *     {@link WeightUnit }
     *     
     */
    public WeightUnit getWeightUnit() {
        return weightUnit;
    }

    /**
     * Sets the value of the weightUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightUnit }
     *     
     */
    public void setWeightUnit(WeightUnit value) {
        this.weightUnit = value;
    }

    /**
     * Gets the value of the globalProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalProductCode() {
        return globalProductCode;
    }

    /**
     * Sets the value of the globalProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalProductCode(String value) {
        this.globalProductCode = value;
    }

    /**
     * Gets the value of the localProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalProductCode() {
        return localProductCode;
    }

    /**
     * Sets the value of the localProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalProductCode(String value) {
        this.localProductCode = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the contents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContents() {
        return contents;
    }

    /**
     * Sets the value of the contents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContents(String value) {
        this.contents = value;
    }

    /**
     * Gets the value of the doorTo property.
     * 
     * @return
     *     possible object is
     *     {@link DoorTo }
     *     
     */
    public DoorTo getDoorTo() {
        return doorTo;
    }

    /**
     * Sets the value of the doorTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorTo }
     *     
     */
    public void setDoorTo(DoorTo value) {
        this.doorTo = value;
    }

    /**
     * Gets the value of the dimensionUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionUnit }
     *     
     */
    public DimensionUnit getDimensionUnit() {
        return dimensionUnit;
    }

    /**
     * Sets the value of the dimensionUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionUnit }
     *     
     */
    public void setDimensionUnit(DimensionUnit value) {
        this.dimensionUnit = value;
    }

    /**
     * Gets the value of the insuredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInsuredAmount() {
        return insuredAmount;
    }

    /**
     * Sets the value of the insuredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInsuredAmount(Float value) {
        this.insuredAmount = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackageType(PackageType value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the isDutiable property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getIsDutiable() {
        return isDutiable;
    }

    /**
     * Sets the value of the isDutiable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setIsDutiable(YesNo value) {
        this.isDutiable = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the additionalProtection property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProtection }
     *     
     */
    public AdditionalProtection getAdditionalProtection() {
        return additionalProtection;
    }

    /**
     * Sets the value of the additionalProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProtection }
     *     
     */
    public void setAdditionalProtection(AdditionalProtection value) {
        this.additionalProtection = value;
    }

    /**
     * Gets the value of the dosFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDOSFlag() {
        return dosFlag;
    }

    /**
     * Sets the value of the dosFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDOSFlag(YesNo value) {
        this.dosFlag = value;
    }

}
