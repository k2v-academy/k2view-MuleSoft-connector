package com.mulesoft.connectors.k2viewrestapiconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;

public class PutLuLuNameIidTableOutputMetadataResolver extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/schemas/put-common-table-output-schema.json";
  }

  @Override
  public String getCategoryName() {
    return "put-lu-lu-name-iid-table-type-resolver";
  }
}
