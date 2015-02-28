
/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 *
 * This file is part of the "DSS - Digital Signature Services" project.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.ec.markt.dss.ws.validation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * 
 *
 * 
 * <pre>
 * &lt;complexType name="wsValidationReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xmlDetailedReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlDiagnosticData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlSimpleReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsValidationReport", propOrder = {
    "xmlDetailedReport",
    "xmlDiagnosticData",
    "xmlSimpleReport"
})
public class WsValidationReport {

    protected String xmlDetailedReport;
    protected String xmlDiagnosticData;
    protected String xmlSimpleReport;

    /**
     * Gets the value of the xmlDetailedReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlDetailedReport() {
        return xmlDetailedReport;
    }

    /**
     * Sets the value of the xmlDetailedReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlDetailedReport(String value) {
        this.xmlDetailedReport = value;
    }

    /**
     * Gets the value of the xmlDiagnosticData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlDiagnosticData() {
        return xmlDiagnosticData;
    }

    /**
     * Sets the value of the xmlDiagnosticData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlDiagnosticData(String value) {
        this.xmlDiagnosticData = value;
    }

    /**
     * Gets the value of the xmlSimpleReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlSimpleReport() {
        return xmlSimpleReport;
    }

    /**
     * Sets the value of the xmlSimpleReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlSimpleReport(String value) {
        this.xmlSimpleReport = value;
    }

}
