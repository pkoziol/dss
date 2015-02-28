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

import eu.europa.ec.markt.dss.validation102853.tsl.TSLRefreshPolicy;
import eu.europa.ec.markt.dss.validation102853.tsl.TrustedListsCertificateSource;

/**
 * This is the MOCK source which can load any trusted list.
 */
public class MockTSLCertificateSource extends TrustedListsCertificateSource {

	public MockTSLCertificateSource() {

		super();
		this.setTslRefreshPolicy(TSLRefreshPolicy.NEVER);
	}

	@Override
	public void loadAdditionalLists(final String... urls) {

		for (final String url : urls) {

			this.loadTSL(url, "MOCK", null);
		}
	}
}
