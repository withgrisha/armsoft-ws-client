
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
 *         &lt;element name="GetDocumentsNextChunkResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfDocumentsListRow" minOccurs="0"/>
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
    "getDocumentsNextChunkResult"
})
@XmlRootElement(name = "GetDocumentsNextChunkResponse")
public class GetDocumentsNextChunkResponse {

    @XmlElementRef(name = "GetDocumentsNextChunkResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfDocumentsListRow> getDocumentsNextChunkResult;

    /**
     * Gets the value of the getDocumentsNextChunkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfDocumentsListRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfDocumentsListRow> getGetDocumentsNextChunkResult() {
        return getDocumentsNextChunkResult;
    }

    /**
     * Sets the value of the getDocumentsNextChunkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfDocumentsListRow }{@code >}
     *     
     */
    public void setGetDocumentsNextChunkResult(JAXBElement<ChunkedResultOfDocumentsListRow> value) {
        this.getDocumentsNextChunkResult = ((JAXBElement<ChunkedResultOfDocumentsListRow> ) value);
    }

}
