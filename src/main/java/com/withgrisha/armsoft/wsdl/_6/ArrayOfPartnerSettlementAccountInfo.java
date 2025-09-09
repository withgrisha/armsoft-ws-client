
package com.withgrisha.armsoft.wsdl._6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfPartnerSettlementAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPartnerSettlementAccountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerSettlementAccountInfo" type="{http://www.armsoft.am/Accountant/6.0}PartnerSettlementAccountInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPartnerSettlementAccountInfo", propOrder = {
    "partnerSettlementAccountInfo"
})
public class ArrayOfPartnerSettlementAccountInfo {

    @XmlElement(name = "PartnerSettlementAccountInfo", nillable = true)
    protected List<PartnerSettlementAccountInfo> partnerSettlementAccountInfo;

    /**
     * Gets the value of the partnerSettlementAccountInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerSettlementAccountInfo property.
     * 
     * <p>
     * For example, to save a new item, do as follows:
     * <pre>
     *    getPartnerSettlementAccountInfo().save(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerSettlementAccountInfo }
     * 
     * 
     */
    public List<PartnerSettlementAccountInfo> getPartnerSettlementAccountInfo() {
        if (partnerSettlementAccountInfo == null) {
            partnerSettlementAccountInfo = new ArrayList<PartnerSettlementAccountInfo>();
        }
        return this.partnerSettlementAccountInfo;
    }

}
