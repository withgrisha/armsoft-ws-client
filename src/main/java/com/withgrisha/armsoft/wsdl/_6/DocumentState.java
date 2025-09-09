
package com.withgrisha.armsoft.wsdl._6;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DraftOrProcessed"/>
 *     &lt;enumeration value="Draft"/>
 *     &lt;enumeration value="Processed"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentState")
@XmlEnum
public enum DocumentState {

    @XmlEnumValue("DraftOrProcessed")
    DRAFT_OR_PROCESSED("DraftOrProcessed"),
    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    DocumentState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentState fromValue(String v) {
        for (DocumentState c: DocumentState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
