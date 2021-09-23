package com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.config;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.connection.provider.BearerConnectionProvider;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.DeleteCommonTableOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.DeleteLuLuNameIidOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.DeleteLuLuNameIidTableOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.GetCommonOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.GetCommonTableOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.GetIsAliveOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.GetLuLuNameIidOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.GetLuLuNameIidTableOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.GetLuLuNameOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.GetStatusOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.PostAuthenticateOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.PostCommonTableOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.PostLuLuNameIidOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.PostLuLuNameIidTableOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.PutCommonTableOperation;
import com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.operation.PutLuLuNameIidTableOperation;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

@Configuration
@Operations({
  PostAuthenticateOperation.class,
  GetCommonOperation.class,
  GetCommonTableOperation.class,
  PutCommonTableOperation.class,
  PostCommonTableOperation.class,
  DeleteCommonTableOperation.class,
  GetIsAliveOperation.class,
  GetLuLuNameOperation.class,
  GetLuLuNameIidOperation.class,
  PostLuLuNameIidOperation.class,
  DeleteLuLuNameIidOperation.class,
  GetLuLuNameIidTableOperation.class,
  PutLuLuNameIidTableOperation.class,
  PostLuLuNameIidTableOperation.class,
  DeleteLuLuNameIidTableOperation.class,
  GetStatusOperation.class
})
@ConnectionProviders({BearerConnectionProvider.class})
public class K2viewRestApiConnectorMule4Configuration extends RestConfiguration {}
