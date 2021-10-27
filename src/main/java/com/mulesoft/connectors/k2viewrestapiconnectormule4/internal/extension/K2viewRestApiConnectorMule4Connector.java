package com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.config.K2viewRestApiConnectorMule4Configuration;
import org.mule.runtime.api.meta.Category;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "K2view Rest Api", category = Category.CERTIFIED)
@Xml(prefix = "k2view-rest-api-connector-mule-4")
@Configurations({K2viewRestApiConnectorMule4Configuration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class K2viewRestApiConnectorMule4Connector {}
