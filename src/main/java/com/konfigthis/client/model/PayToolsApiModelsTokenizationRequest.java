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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.NetworkTokenCardSource;
import com.konfigthis.client.model.PayToolsApiModelsNetworkTokenizationPayer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Model for sending Network Tokenization Request
 */
@ApiModel(description = "Model for sending Network Tokenization Request")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayToolsApiModelsTokenizationRequest {
  public static final String SERIALIZED_NAME_CONSUMER_LANGUAGE = "consumerLanguage";
  @SerializedName(SERIALIZED_NAME_CONSUMER_LANGUAGE)
  private String consumerLanguage;

  public static final String SERIALIZED_NAME_CARD_HOLDER = "cardHolder";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER)
  private PayToolsApiModelsNetworkTokenizationPayer cardHolder;

  public static final String SERIALIZED_NAME_DEVICE_SCORE = "deviceScore";
  @SerializedName(SERIALIZED_NAME_DEVICE_SCORE)
  private Integer deviceScore;

  public static final String SERIALIZED_NAME_ACCOUNT_SCORE = "accountScore";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SCORE)
  private Integer accountScore;

  public static final String SERIALIZED_NAME_DEVICE_LOCATION_LAT = "deviceLocationLat";
  @SerializedName(SERIALIZED_NAME_DEVICE_LOCATION_LAT)
  private Double deviceLocationLat;

  public static final String SERIALIZED_NAME_DEVICE_LOCATION_LON = "deviceLocationLon";
  @SerializedName(SERIALIZED_NAME_DEVICE_LOCATION_LON)
  private Double deviceLocationLon;

  public static final String SERIALIZED_NAME_DEVICE_IP_ADDRESS = "deviceIpAddress";
  @SerializedName(SERIALIZED_NAME_DEVICE_IP_ADDRESS)
  private String deviceIpAddress;

  public static final String SERIALIZED_NAME_CARD_SOURCE = "cardSource";
  @SerializedName(SERIALIZED_NAME_CARD_SOURCE)
  private NetworkTokenCardSource cardSource;

  public PayToolsApiModelsTokenizationRequest() {
  }

  public PayToolsApiModelsTokenizationRequest consumerLanguage(String consumerLanguage) {
    
    
    if (consumerLanguage != null && consumerLanguage.length() < 2) {
      throw new IllegalArgumentException("Invalid value for consumerLanguage. Length must be greater than or equal to 2.");
    }
    
    this.consumerLanguage = consumerLanguage;
    return this;
  }

   /**
   * Iso-369-1 2-letter language code
   * @return consumerLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Iso-369-1 2-letter language code")

  public String getConsumerLanguage() {
    return consumerLanguage;
  }


  public void setConsumerLanguage(String consumerLanguage) {
    
    
    if (consumerLanguage != null && consumerLanguage.length() < 2) {
      throw new IllegalArgumentException("Invalid value for consumerLanguage. Length must be greater than or equal to 2.");
    }
    this.consumerLanguage = consumerLanguage;
  }


  public PayToolsApiModelsTokenizationRequest cardHolder(PayToolsApiModelsNetworkTokenizationPayer cardHolder) {
    
    
    
    
    this.cardHolder = cardHolder;
    return this;
  }

   /**
   * Get cardHolder
   * @return cardHolder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayToolsApiModelsNetworkTokenizationPayer getCardHolder() {
    return cardHolder;
  }


  public void setCardHolder(PayToolsApiModelsNetworkTokenizationPayer cardHolder) {
    
    
    
    this.cardHolder = cardHolder;
  }


  public PayToolsApiModelsTokenizationRequest deviceScore(Integer deviceScore) {
    if (deviceScore != null && deviceScore < 1) {
      throw new IllegalArgumentException("Invalid value for deviceScore. Must be greater than or equal to 1.");
    }
    if (deviceScore != null && deviceScore > 5) {
      throw new IllegalArgumentException("Invalid value for deviceScore. Must be less than or equal to 5.");
    }
    
    
    this.deviceScore = deviceScore;
    return this;
  }

   /**
   * Device score
   * minimum: 1
   * maximum: 5
   * @return deviceScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Device score")

  public Integer getDeviceScore() {
    return deviceScore;
  }


  public void setDeviceScore(Integer deviceScore) {
    if (deviceScore != null && deviceScore < 1) {
      throw new IllegalArgumentException("Invalid value for deviceScore. Must be greater than or equal to 1.");
    }
    if (deviceScore != null && deviceScore > 5) {
      throw new IllegalArgumentException("Invalid value for deviceScore. Must be less than or equal to 5.");
    }
    
    this.deviceScore = deviceScore;
  }


  public PayToolsApiModelsTokenizationRequest accountScore(Integer accountScore) {
    if (accountScore != null && accountScore < 1) {
      throw new IllegalArgumentException("Invalid value for accountScore. Must be greater than or equal to 1.");
    }
    if (accountScore != null && accountScore > 5) {
      throw new IllegalArgumentException("Invalid value for accountScore. Must be less than or equal to 5.");
    }
    
    
    this.accountScore = accountScore;
    return this;
  }

   /**
   * Account score
   * minimum: 1
   * maximum: 5
   * @return accountScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account score")

  public Integer getAccountScore() {
    return accountScore;
  }


  public void setAccountScore(Integer accountScore) {
    if (accountScore != null && accountScore < 1) {
      throw new IllegalArgumentException("Invalid value for accountScore. Must be greater than or equal to 1.");
    }
    if (accountScore != null && accountScore > 5) {
      throw new IllegalArgumentException("Invalid value for accountScore. Must be less than or equal to 5.");
    }
    
    this.accountScore = accountScore;
  }


  public PayToolsApiModelsTokenizationRequest deviceLocationLat(Double deviceLocationLat) {
    if (deviceLocationLat != null && deviceLocationLat < -90) {
      throw new IllegalArgumentException("Invalid value for deviceLocationLat. Must be greater than or equal to -90.");
    }
    if (deviceLocationLat != null && deviceLocationLat > 90) {
      throw new IllegalArgumentException("Invalid value for deviceLocationLat. Must be less than or equal to 90.");
    }
    
    
    this.deviceLocationLat = deviceLocationLat;
    return this;
  }

   /**
   * Device latitude -90 to 90
   * minimum: -90
   * maximum: 90
   * @return deviceLocationLat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Device latitude -90 to 90")

  public Double getDeviceLocationLat() {
    return deviceLocationLat;
  }


  public void setDeviceLocationLat(Double deviceLocationLat) {
    if (deviceLocationLat != null && deviceLocationLat < -90) {
      throw new IllegalArgumentException("Invalid value for deviceLocationLat. Must be greater than or equal to -90.");
    }
    if (deviceLocationLat != null && deviceLocationLat > 90) {
      throw new IllegalArgumentException("Invalid value for deviceLocationLat. Must be less than or equal to 90.");
    }
    
    this.deviceLocationLat = deviceLocationLat;
  }


  public PayToolsApiModelsTokenizationRequest deviceLocationLon(Double deviceLocationLon) {
    if (deviceLocationLon != null && deviceLocationLon < -180) {
      throw new IllegalArgumentException("Invalid value for deviceLocationLon. Must be greater than or equal to -180.");
    }
    if (deviceLocationLon != null && deviceLocationLon > 180) {
      throw new IllegalArgumentException("Invalid value for deviceLocationLon. Must be less than or equal to 180.");
    }
    
    
    this.deviceLocationLon = deviceLocationLon;
    return this;
  }

   /**
   * Device longitude -90 to 90
   * minimum: -180
   * maximum: 180
   * @return deviceLocationLon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Device longitude -90 to 90")

  public Double getDeviceLocationLon() {
    return deviceLocationLon;
  }


  public void setDeviceLocationLon(Double deviceLocationLon) {
    if (deviceLocationLon != null && deviceLocationLon < -180) {
      throw new IllegalArgumentException("Invalid value for deviceLocationLon. Must be greater than or equal to -180.");
    }
    if (deviceLocationLon != null && deviceLocationLon > 180) {
      throw new IllegalArgumentException("Invalid value for deviceLocationLon. Must be less than or equal to 180.");
    }
    
    this.deviceLocationLon = deviceLocationLon;
  }


  public PayToolsApiModelsTokenizationRequest deviceIpAddress(String deviceIpAddress) {
    
    
    
    
    this.deviceIpAddress = deviceIpAddress;
    return this;
  }

   /**
   * Ip address of device
   * @return deviceIpAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ip address of device")

  public String getDeviceIpAddress() {
    return deviceIpAddress;
  }


  public void setDeviceIpAddress(String deviceIpAddress) {
    
    
    
    this.deviceIpAddress = deviceIpAddress;
  }


  public PayToolsApiModelsTokenizationRequest cardSource(NetworkTokenCardSource cardSource) {
    
    
    
    
    this.cardSource = cardSource;
    return this;
  }

   /**
   * Get cardSource
   * @return cardSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkTokenCardSource getCardSource() {
    return cardSource;
  }


  public void setCardSource(NetworkTokenCardSource cardSource) {
    
    
    
    this.cardSource = cardSource;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PayToolsApiModelsTokenizationRequest instance itself
   */
  public PayToolsApiModelsTokenizationRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayToolsApiModelsTokenizationRequest payToolsApiModelsTokenizationRequest = (PayToolsApiModelsTokenizationRequest) o;
    return Objects.equals(this.consumerLanguage, payToolsApiModelsTokenizationRequest.consumerLanguage) &&
        Objects.equals(this.cardHolder, payToolsApiModelsTokenizationRequest.cardHolder) &&
        Objects.equals(this.deviceScore, payToolsApiModelsTokenizationRequest.deviceScore) &&
        Objects.equals(this.accountScore, payToolsApiModelsTokenizationRequest.accountScore) &&
        Objects.equals(this.deviceLocationLat, payToolsApiModelsTokenizationRequest.deviceLocationLat) &&
        Objects.equals(this.deviceLocationLon, payToolsApiModelsTokenizationRequest.deviceLocationLon) &&
        Objects.equals(this.deviceIpAddress, payToolsApiModelsTokenizationRequest.deviceIpAddress) &&
        Objects.equals(this.cardSource, payToolsApiModelsTokenizationRequest.cardSource)&&
        Objects.equals(this.additionalProperties, payToolsApiModelsTokenizationRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerLanguage, cardHolder, deviceScore, accountScore, deviceLocationLat, deviceLocationLon, deviceIpAddress, cardSource, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayToolsApiModelsTokenizationRequest {\n");
    sb.append("    consumerLanguage: ").append(toIndentedString(consumerLanguage)).append("\n");
    sb.append("    cardHolder: ").append(toIndentedString(cardHolder)).append("\n");
    sb.append("    deviceScore: ").append(toIndentedString(deviceScore)).append("\n");
    sb.append("    accountScore: ").append(toIndentedString(accountScore)).append("\n");
    sb.append("    deviceLocationLat: ").append(toIndentedString(deviceLocationLat)).append("\n");
    sb.append("    deviceLocationLon: ").append(toIndentedString(deviceLocationLon)).append("\n");
    sb.append("    deviceIpAddress: ").append(toIndentedString(deviceIpAddress)).append("\n");
    sb.append("    cardSource: ").append(toIndentedString(cardSource)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("consumerLanguage");
    openapiFields.add("cardHolder");
    openapiFields.add("deviceScore");
    openapiFields.add("accountScore");
    openapiFields.add("deviceLocationLat");
    openapiFields.add("deviceLocationLon");
    openapiFields.add("deviceIpAddress");
    openapiFields.add("cardSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayToolsApiModelsTokenizationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayToolsApiModelsTokenizationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayToolsApiModelsTokenizationRequest is not found in the empty JSON string", PayToolsApiModelsTokenizationRequest.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("consumerLanguage").isJsonNull() && (jsonObj.get("consumerLanguage") != null && !jsonObj.get("consumerLanguage").isJsonNull()) && !jsonObj.get("consumerLanguage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumerLanguage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumerLanguage").toString()));
      }
      // validate the optional field `cardHolder`
      if (jsonObj.get("cardHolder") != null && !jsonObj.get("cardHolder").isJsonNull()) {
        PayToolsApiModelsNetworkTokenizationPayer.validateJsonObject(jsonObj.getAsJsonObject("cardHolder"));
      }
      if (!jsonObj.get("deviceIpAddress").isJsonNull() && (jsonObj.get("deviceIpAddress") != null && !jsonObj.get("deviceIpAddress").isJsonNull()) && !jsonObj.get("deviceIpAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceIpAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceIpAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayToolsApiModelsTokenizationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayToolsApiModelsTokenizationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayToolsApiModelsTokenizationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayToolsApiModelsTokenizationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PayToolsApiModelsTokenizationRequest>() {
           @Override
           public void write(JsonWriter out, PayToolsApiModelsTokenizationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PayToolsApiModelsTokenizationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayToolsApiModelsTokenizationRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PayToolsApiModelsTokenizationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayToolsApiModelsTokenizationRequest
  * @throws IOException if the JSON string is invalid with respect to PayToolsApiModelsTokenizationRequest
  */
  public static PayToolsApiModelsTokenizationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayToolsApiModelsTokenizationRequest.class);
  }

 /**
  * Convert an instance of PayToolsApiModelsTokenizationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

