
package com.withgrisha.armsoft.wsdl._6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfCashListRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCashListRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CashListRow" type="{http://www.armsoft.am/Accountant/6.0}CashListRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCashListRow", propOrder = {
    "cashListRow"
})
public class ArrayOfCashListRow {

    @XmlElement(name = "CashListRow", nillable = true)
    protected List<CashListRow> cashListRow;

    /**
     * Gets the value of the cashListRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashListRow property.
     * 
     * <p>
     * For example, to save a new item, do as follows:
     * <pre>
     *    getCashListRow().save(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashListRow }
     * 
     * 
     */
    public List<CashListRow> getCashListRow() {
        if (cashListRow == null) {
            cashListRow = new ArrayList<CashListRow>();
        }
        return this.cashListRow;
    }

}
