
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
 *         &lt;element name="GetProductRemsDetailedResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfGoodAvailabilityRow" minOccurs="0"/>
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
    "getProductRemsDetailedResult"
})
@XmlRootElement(name = "GetProductRemsDetailedResponse")
public class GetProductRemsDetailedResponse {

    @XmlElementRef(name = "GetProductRemsDetailedResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfGoodAvailabilityRow> getProductRemsDetailedResult;

    /**
     * Gets the value of the getProductRemsDetailedResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfGoodAvailabilityRow> getGetProductRemsDetailedResult() {
        return getProductRemsDetailedResult;
    }

    /**
     * Sets the value of the getProductRemsDetailedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfGoodAvailabilityRow }{@code >}
     *     
     */
    public void setGetProductRemsDetailedResult(JAXBElement<ChunkedResultOfGoodAvailabilityRow> value) {
        this.getProductRemsDetailedResult = ((JAXBElement<ChunkedResultOfGoodAvailabilityRow> ) value);
    }

}
