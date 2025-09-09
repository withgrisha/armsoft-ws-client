
package com.withgrisha.armsoft.wsdl._6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfPartnerGroupListRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPartnerGroupListRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerGroupListRow" type="{http://www.armsoft.am/Accountant/6.0}PartnerGroupListRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPartnerGroupListRow", propOrder = {
    "partnerGroupListRow"
})
public class ArrayOfPartnerGroupListRow {

    @XmlElement(name = "PartnerGroupListRow", nillable = true)
    protected List<PartnerGroupListRow> partnerGroupListRow;

    /**
     * Gets the value of the partnerGroupListRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerGroupListRow property.
     * 
     * <p>
     * For example, to save a new item, do as follows:
     * <pre>
     *    getPartnerGroupListRow().save(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerGroupListRow }
     * 
     * 
     */
    public List<PartnerGroupListRow> getPartnerGroupListRow() {
        if (partnerGroupListRow == null) {
            partnerGroupListRow = new ArrayList<PartnerGroupListRow>();
        }
        return this.partnerGroupListRow;
    }

}
