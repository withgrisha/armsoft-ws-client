
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
 *         &lt;element name="GetProductsListShortResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfProductShortListRow" minOccurs="0"/>
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
    "getProductsListShortResult"
})
@XmlRootElement(name = "GetProductsListShortResponse")
public class GetProductsListShortResponse {

    @XmlElementRef(name = "GetProductsListShortResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfProductShortListRow> getProductsListShortResult;

    /**
     * Gets the value of the getProductsListShortResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfProductShortListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfProductShortListRow> getGetProductsListShortResult() {
        return getProductsListShortResult;
    }

    /**
     * Sets the value of the getProductsListShortResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfProductShortListRow }{@code >}
     *     
     */
    public void setGetProductsListShortResult(JAXBElement<ChunkedResultOfProductShortListRow> value) {
        this.getProductsListShortResult = ((JAXBElement<ChunkedResultOfProductShortListRow> ) value);
    }

}
