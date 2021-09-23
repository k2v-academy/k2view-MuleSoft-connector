package com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;

public class PostAuthenticateOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/post-authenticate-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "post-authenticate-type-resolver";
  }
}
