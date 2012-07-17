
package org.openclinica.ws.beans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="genderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="m"/>
 *     &lt;enumeration value="f"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "genderType")
@XmlEnum
@SuppressWarnings("javadoc")
public enum GenderType {

    @XmlEnumValue("m")
    M("m"),
    @XmlEnumValue("f")
    F("f");
    private final String value;

    GenderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenderType fromValue(String v) {
        for (GenderType c: GenderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
