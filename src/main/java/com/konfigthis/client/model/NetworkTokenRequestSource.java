/*
 * Orchestra API
 * Code Version 1.0.7.15
 *
 * The version of the OpenAPI document: Prod
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets NetworkToken.RequestSource
 */
@JsonAdapter(NetworkTokenRequestSource.Adapter.class)public enum NetworkTokenRequestSource {
  
  MERCHANT("Merchant"),
  
  CARDHOLDER("CardHolder"),
  
  ISSUER("Issuer");

  private String value;

  NetworkTokenRequestSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NetworkTokenRequestSource fromValue(String value) {
    for (NetworkTokenRequestSource b : NetworkTokenRequestSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NetworkTokenRequestSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final NetworkTokenRequestSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NetworkTokenRequestSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NetworkTokenRequestSource.fromValue(value);
    }
  }
}

