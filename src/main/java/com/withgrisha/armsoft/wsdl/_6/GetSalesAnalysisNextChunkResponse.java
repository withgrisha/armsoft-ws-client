
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
 *         &lt;element name="GetSalesAnalysisNextChunkResult" type="{http://www.armsoft.am/Accountant/6.0}ChunkedResultOfSalesAnalysisDataProvider.DataRow" minOccurs="0"/>
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
    "getSalesAnalysisNextChunkResult"
})
@XmlRootElement(name = "GetSalesAnalysisNextChunkResponse")
public class GetSalesAnalysisNextChunkResponse {

    @XmlElementRef(name = "GetSalesAnalysisNextChunkResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> getSalesAnalysisNextChunkResult;

    /**
     * Gets the value of the getSalesAnalysisNextChunkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisDataProviderDataRow }{@code >}
     *     
     */
    public JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> getGetSalesAnalysisNextChunkResult() {
        return getSalesAnalysisNextChunkResult;
    }

    /**
     * Sets the value of the getSalesAnalysisNextChunkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChunkedResultOfSalesAnalysisDataProviderDataRow }{@code >}
     *     
     */
    public void setGetSalesAnalysisNextChunkResult(JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> value) {
        this.getSalesAnalysisNextChunkResult = ((JAXBElement<ChunkedResultOfSalesAnalysisDataProviderDataRow> ) value);
    }

}
