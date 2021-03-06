//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 02:35:05 PM IST 
//


package com.dhl.xmlpi.shipVal.models;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Piece complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Piece">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PieceID" type="{http://www.dhl.com/datatypes_global}PieceID" minOccurs="0"/>
 *         &lt;element name="PackageType" type="{http://www.dhl.com/datatypes_global}PackageType" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.dhl.com/datatypes_global}Weight" minOccurs="0"/>
 *         &lt;element name="DimWeight" type="{http://www.dhl.com/datatypes_global}Weight" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Depth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PieceContents" type="{http://www.dhl.com/datatypes_global}PieceContents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Piece", propOrder = {
    "pieceID",
    "packageType",
    "weight",
    "dimWeight",
    "width",
    "height",
    "depth",
    "pieceContents"
})
public class Piece {

    @XmlElement(name = "PieceID")
    protected String pieceID;
    @XmlElement(name = "PackageType")
    protected PackageType packageType;
    @XmlElement(name = "Weight")
    protected BigDecimal weight;
    @XmlElement(name = "DimWeight")
    protected BigDecimal dimWeight;
    @XmlElement(name = "Width")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger width;
    @XmlElement(name = "Height")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger height;
    @XmlElement(name = "Depth")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger depth;
    @XmlElement(name = "PieceContents")
    protected String pieceContents;

    /**
     * Gets the value of the pieceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceID() {
        return pieceID;
    }

    /**
     * Sets the value of the pieceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceID(String value) {
        this.pieceID = value;
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
     * Gets the value of the dimWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDimWeight() {
        return dimWeight;
    }

    /**
     * Sets the value of the dimWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDimWeight(BigDecimal value) {
        this.dimWeight = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepth(BigInteger value) {
        this.depth = value;
    }

    /**
     * Gets the value of the pieceContents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceContents() {
        return pieceContents;
    }

    /**
     * Sets the value of the pieceContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceContents(String value) {
        this.pieceContents = value;
    }

}
