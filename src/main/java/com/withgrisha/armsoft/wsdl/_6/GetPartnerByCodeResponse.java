
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
 *         &lt;element name="GetPartnerByCodeResult" type="{http://www.armsoft.am/Accountant/6.0}EditPartnerInfo" minOccurs="0"/>
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
    "getPartnerByCodeResult"
})
@XmlRootElement(name = "GetPartnerByCodeResponse")
public class GetPartnerByCodeResponse {

    @XmlElementRef(name = "GetPartnerByCodeResult", namespace = "http://www.armsoft.am/Accountant/6.0", type = JAXBElement.class)
    protected JAXBElement<EditPartnerInfo> getPartnerByCodeResult;

    /**
     * Gets the value of the getPartnerByCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EditPartnerInfo }{@code >}
     *     
     */
    public JAXBElement<EditPartnerInfo> getGetPartnerByCodeResult() {
        return getPartnerByCodeResult;
    }

    /**
     * Sets the value of the getPartnerByCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EditPartnerInfo }{@code >}
     *     
     */
    public void setGetPartnerByCodeResult(JAXBElement<EditPartnerInfo> value) {
        this.getPartnerByCodeResult = ((JAXBElement<EditPartnerInfo> ) value);
    }

}
