
package com.withgrisha.armsoft.wsdl._6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesAnalysisRowGroupedbyGoodsAndServices" type="{http://www.armsoft.am/Accountant/6.0}SalesAnalysisRowGroupedbyGoodsAndServices" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices", propOrder = {
    "salesAnalysisRowGroupedbyGoodsAndServices"
})
public class ArrayOfSalesAnalysisRowGroupedbyGoodsAndServices {

    @XmlElement(name = "SalesAnalysisRowGroupedbyGoodsAndServices", nillable = true)
    protected List<SalesAnalysisRowGroupedbyGoodsAndServices> salesAnalysisRowGroupedbyGoodsAndServices;

    /**
     * Gets the value of the salesAnalysisRowGroupedbyGoodsAndServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesAnalysisRowGroupedbyGoodsAndServices property.
     * 
     * <p>
     * For example, to save a new item, do as follows:
     * <pre>
     *    getSalesAnalysisRowGroupedbyGoodsAndServices().save(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesAnalysisRowGroupedbyGoodsAndServices }
     * 
     * 
     */
    public List<SalesAnalysisRowGroupedbyGoodsAndServices> getSalesAnalysisRowGroupedbyGoodsAndServices() {
        if (salesAnalysisRowGroupedbyGoodsAndServices == null) {
            salesAnalysisRowGroupedbyGoodsAndServices = new ArrayList<SalesAnalysisRowGroupedbyGoodsAndServices>();
        }
        return this.salesAnalysisRowGroupedbyGoodsAndServices;
    }

}
