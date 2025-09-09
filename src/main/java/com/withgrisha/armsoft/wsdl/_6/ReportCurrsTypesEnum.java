
package com.withgrisha.armsoft.wsdl._6;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportCurrsTypesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportCurrsTypesEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RepNCOnly"/>
 *     &lt;enumeration value="RepFCOnly"/>
 *     &lt;enumeration value="RepNCandFC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportCurrsTypesEnum")
@XmlEnum
public enum ReportCurrsTypesEnum {

    @XmlEnumValue("RepNCOnly")
    REP_NC_ONLY("RepNCOnly"),
    @XmlEnumValue("RepFCOnly")
    REP_FC_ONLY("RepFCOnly"),
    @XmlEnumValue("RepNCandFC")
    REP_N_CAND_FC("RepNCandFC");
    private final String value;

    ReportCurrsTypesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportCurrsTypesEnum fromValue(String v) {
        for (ReportCurrsTypesEnum c: ReportCurrsTypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
