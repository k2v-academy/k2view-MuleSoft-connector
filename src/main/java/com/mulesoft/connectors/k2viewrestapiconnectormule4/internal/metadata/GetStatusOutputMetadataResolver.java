package com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.StringOutputMetadataResolver;

public class GetStatusOutputMetadataResolver extends StringOutputMetadataResolver {
  @Override
  public String getCategoryName() {
    return "get-status-type-resolver";
  }
}
