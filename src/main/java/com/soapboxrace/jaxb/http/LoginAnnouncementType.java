//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.04.19 às 11:07:08 PM AMT 
//


package com.soapboxrace.jaxb.http;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LoginAnnouncementType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LoginAnnouncementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ExternalLink"/>
 *     &lt;enumeration value="SafehouseProduct"/>
 *     &lt;enumeration value="ImageOnly"/>
 *     &lt;enumeration value="SafehouseProductNoButton"/>
 *     &lt;enumeration value="ExternalLinkNoButton"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoginAnnouncementType")
@XmlEnum
public enum LoginAnnouncementType {

    @XmlEnumValue("ExternalLink")
    EXTERNAL_LINK("ExternalLink"),
    @XmlEnumValue("SafehouseProduct")
    SAFEHOUSE_PRODUCT("SafehouseProduct"),
    @XmlEnumValue("ImageOnly")
    IMAGE_ONLY("ImageOnly"),
    @XmlEnumValue("SafehouseProductNoButton")
    SAFEHOUSE_PRODUCT_NO_BUTTON("SafehouseProductNoButton"),
    @XmlEnumValue("ExternalLinkNoButton")
    EXTERNAL_LINK_NO_BUTTON("ExternalLinkNoButton");
    private final String value;

    LoginAnnouncementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoginAnnouncementType fromValue(String v) {
        for (LoginAnnouncementType c: LoginAnnouncementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}