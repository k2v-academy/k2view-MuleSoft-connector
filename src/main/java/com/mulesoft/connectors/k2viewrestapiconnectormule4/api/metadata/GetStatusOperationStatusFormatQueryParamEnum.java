package com.mulesoft.connectors.k2viewrestapiconnectormule4.api.metadata;

public enum GetStatusOperationStatusFormatQueryParamEnum {
  JMX("JMX"),

  STRING("STRING"),

  HTML("HTML");

  private String value;

  GetStatusOperationStatusFormatQueryParamEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
