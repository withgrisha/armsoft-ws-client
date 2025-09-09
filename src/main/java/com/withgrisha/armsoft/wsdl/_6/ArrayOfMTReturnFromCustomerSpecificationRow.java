
package com.withgrisha.armsoft.wsdl._6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfMTReturnFromCustomerSpecificationRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMTReturnFromCustomerSpecificationRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MTReturnFromCustomerSpecificationRow" type="{http://www.armsoft.am/Accountant/6.0}MTReturnFromCustomerSpecificationRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMTReturnFromCustomerSpecificationRow", propOrder = {
    "mtReturnFromCustomerSpecificationRow"
})
public class ArrayOfMTReturnFromCustomerSpecificationRow {

    @XmlElement(name = "MTReturnFromCustomerSpecificationRow", nillable = true)
    protected List<MTReturnFromCustomerSpecificationRow> mtReturnFromCustomerSpecificationRow;

    /**
     * Gets the value of the mtReturnFromCustomerSpecificationRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtReturnFromCustomerSpecificationRow property.
     * 
     * <p>
     * For example, to save a new item, do as follows:
     * <pre>
     *    getMTReturnFromCustomerSpecificationRow().save(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MTReturnFromCustomerSpecificationRow }
     * 
     * 
     */
    public List<MTReturnFromCustomerSpecificationRow> getMTReturnFromCustomerSpecificationRow() {
        if (mtReturnFromCustomerSpecificationRow == null) {
            mtReturnFromCustomerSpecificationRow = new ArrayList<MTReturnFromCustomerSpecificationRow>();
        }
        return this.mtReturnFromCustomerSpecificationRow;
    }

}
