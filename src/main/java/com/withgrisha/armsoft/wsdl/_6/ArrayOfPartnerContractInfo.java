
package com.withgrisha.armsoft.wsdl._6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfPartnerContractInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPartnerContractInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerContractInfo" type="{http://www.armsoft.am/Accountant/6.0}PartnerContractInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPartnerContractInfo", propOrder = {
    "partnerContractInfo"
})
public class ArrayOfPartnerContractInfo {

    @XmlElement(name = "PartnerContractInfo", nillable = true)
    protected List<PartnerContractInfo> partnerContractInfo;

    /**
     * Gets the value of the partnerContractInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerContractInfo property.
     * 
     * <p>
     * For example, to save a new item, do as follows:
     * <pre>
     *    getPartnerContractInfo().save(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerContractInfo }
     * 
     * 
     */
    public List<PartnerContractInfo> getPartnerContractInfo() {
        if (partnerContractInfo == null) {
            partnerContractInfo = new ArrayList<PartnerContractInfo>();
        }
        return this.partnerContractInfo;
    }

}
