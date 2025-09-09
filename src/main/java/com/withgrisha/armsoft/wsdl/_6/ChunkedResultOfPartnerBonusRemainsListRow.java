
package com.withgrisha.armsoft.wsdl._6;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChunkedResultOfPartnerBonusRemainsListRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChunkedResultOfPartnerBonusRemainsListRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rows" type="{http://www.armsoft.am/Accountant/6.0}ArrayOfPartnerBonusRemainsListRow"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChunkedResultOfPartnerBonusRemainsListRow", propOrder = {
    "total",
    "offset",
    "rows"
})
public class ChunkedResultOfPartnerBonusRemainsListRow {

    @XmlElement(name = "Total")
    protected int total;
    @XmlElement(name = "Offset")
    protected int offset;
    @XmlElement(name = "Rows", required = true, nillable = true)
    protected ArrayOfPartnerBonusRemainsListRow rows;

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPartnerBonusRemainsListRow }
     *     
     */
    public ArrayOfPartnerBonusRemainsListRow getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPartnerBonusRemainsListRow }
     *     
     */
    public void setRows(ArrayOfPartnerBonusRemainsListRow value) {
        this.rows = value;
    }

}
