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
package eu.europa.ec.markt.dss.cookbook.sources;

import java.util.Calendar;

import eu.europa.ec.markt.dss.TSLConstant;
import eu.europa.ec.markt.dss.validation102853.condition.ServiceInfo;

public class MockServiceInfo extends ServiceInfo {

	public MockServiceInfo() {

		setTspName("DSS, Mock Office DSS-CA");
		setType(TSLConstant.CA_QC);
		setServiceName("DSS, Mock Service Name");
		setStatus(TSLConstant.SERVICE_STATUS_UNDERSUPERVISION_119612);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, -15);
		setStatusStartDate(calendar.getTime());
		setStatusEndDate(null);
		setTlWellSigned(true);
	}
}
