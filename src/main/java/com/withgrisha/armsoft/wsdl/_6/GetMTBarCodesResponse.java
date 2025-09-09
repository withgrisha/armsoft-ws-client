
package com.withgrisha.armsoft.wsdl._6;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMTBarCodesResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfMTBarCodes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMTBarCodesResult"
})
@XmlRootElement(name = "GetMTBarCodesResponse")
public class GetMTBarCodesResponse {

    @XmlElementRef(name = "GetMTBarCodesResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfMTBarCodes> getMTBarCodesResult;

    /**
     * Gets the value of the getMTBarCodesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfMTBarCodes }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfMTBarCodes> getGetMTBarCodesResult() {
        return getMTBarCodesResult;
    }

    /**
     * Sets the value of the getMTBarCodesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfMTBarCodes }{@code >}
     *     
     */
    public void setGetMTBarCodesResult(JAXBElement<ChunkedResultOfMTBarCodes> value) {
        this.getMTBarCodesResult = ((JAXBElement<ChunkedResultOfMTBarCodes> ) value);
    }

}
