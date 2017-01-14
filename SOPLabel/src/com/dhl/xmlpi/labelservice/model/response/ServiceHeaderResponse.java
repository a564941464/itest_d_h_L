//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.04 at 10:21:23 AM IST 
//


package com.dhl.xmlpi.labelservice.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Standard routing header
 * 
 * <p>Java class for ServiceHeaderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceHeaderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageTime" type="{http://www.dhl.com/LabelService_datatypes}MessageTime"/>
 *         &lt;element name="MessageReference" type="{http://www.dhl.com/LabelService_datatypes}MessageReference"/>
 *         &lt;element name="SiteID" type="{http://www.dhl.com/LabelService_datatypes}SiteID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHeaderResponse", propOrder = {
    "messageTime",
    "messageReference",
    "siteID"
})
public class ServiceHeaderResponse {

    @XmlElement(name = "MessageTime", required = true)
    protected String messageTime;
    @XmlElement(name = "MessageReference", required = true)
    protected String messageReference;
    @XmlElement(name = "SiteID", required = true)
    protected String siteID;

    /**
     * Gets the value of the messageTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTime() {
        return messageTime;
    }

    /**
     * Sets the value of the messageTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTime(String value) {
        this.messageTime = value;
    }

    /**
     * Gets the value of the messageReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageReference() {
        return messageReference;
    }

    /**
     * Sets the value of the messageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageReference(String value) {
        this.messageReference = value;
    }

    /**
     * Gets the value of the siteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteID() {
        return siteID;
    }

    /**
     * Sets the value of the siteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteID(String value) {
        this.siteID = value;
    }

}
