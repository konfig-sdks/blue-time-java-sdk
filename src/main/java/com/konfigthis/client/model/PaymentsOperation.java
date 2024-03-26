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
 * Gets or Sets Payments.Operation
 */
@JsonAdapter(PaymentsOperation.Adapter.class)public enum PaymentsOperation {
  
  CHARGE("Charge"),
  
  PREAUTH("PreAuth"),
  
  CAPTURE("Capture"),
  
  VOID("Void"),
  
  REFUND("Refund"),
  
  TOKENIZE("Tokenize");

  private String value;

  PaymentsOperation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentsOperation fromValue(String value) {
    for (PaymentsOperation b : PaymentsOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PaymentsOperation> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentsOperation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentsOperation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentsOperation.fromValue(value);
    }
  }
}

