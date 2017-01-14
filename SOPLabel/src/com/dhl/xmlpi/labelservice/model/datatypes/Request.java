//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.01 at 04:46:28 PM IST 
//


package com.dhl.xmlpi.labelservice.model.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic Registration Request Header
 * 			
 * 
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceHeader" type="{http://www.dhl.com/LabelService_datatypes}ServiceHeaderRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "serviceHeader"
})
public class Request {

    @XmlElement(name = "ServiceHeader", required = true)
    protected ServiceHeaderRequest serviceHeader;

    /**
     * Gets the value of the serviceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceHeaderRequest }
     *     
     */
    public ServiceHeaderRequest getServiceHeader() {
        return serviceHeader;
    }

    /**
     * Sets the value of the serviceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHeaderRequest }
     *     
     */
    public void setServiceHeader(ServiceHeaderRequest value) {
        this.serviceHeader = value;
    }

}
