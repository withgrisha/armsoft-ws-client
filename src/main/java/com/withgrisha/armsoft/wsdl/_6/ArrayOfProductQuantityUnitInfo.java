
package com.withgrisha.armsoft.wsdl._6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfProductQuantityUnitInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductQuantityUnitInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductQuantityUnitInfo" type="{http://www.armsoft.am/Accountant/6.0}ProductQuantityUnitInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductQuantityUnitInfo", propOrder = {
    "productQuantityUnitInfo"
})
public class ArrayOfProductQuantityUnitInfo {

    @XmlElement(name = "ProductQuantityUnitInfo", nillable = true)
    protected List<ProductQuantityUnitInfo> productQuantityUnitInfo;

    /**
     * Gets the value of the productQuantityUnitInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productQuantityUnitInfo property.
     * 
     * <p>
     * For example, to save a new item, do as follows:
     * <pre>
     *    getProductQuantityUnitInfo().save(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductQuantityUnitInfo }
     * 
     * 
     */
    public List<ProductQuantityUnitInfo> getProductQuantityUnitInfo() {
        if (productQuantityUnitInfo == null) {
            productQuantityUnitInfo = new ArrayList<ProductQuantityUnitInfo>();
        }
        return this.productQuantityUnitInfo;
    }

}
