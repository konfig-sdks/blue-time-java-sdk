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
 * Gets or Sets NetworkToken.CardSource
 */
@JsonAdapter(NetworkTokenCardSource.Adapter.class)public enum NetworkTokenCardSource {
  
  ONFILE("OnFile"),
  
  USERINPUT("UserInput");

  private String value;

  NetworkTokenCardSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NetworkTokenCardSource fromValue(String value) {
    for (NetworkTokenCardSource b : NetworkTokenCardSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NetworkTokenCardSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final NetworkTokenCardSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NetworkTokenCardSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NetworkTokenCardSource.fromValue(value);
    }
  }
}

