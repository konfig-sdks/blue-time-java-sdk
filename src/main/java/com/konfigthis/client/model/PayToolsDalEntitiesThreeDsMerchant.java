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
import com.konfigthis.client.model.PayToolsDalEntitiesThreeDsBrand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
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
 * PayToolsDalEntitiesThreeDsMerchant
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayToolsDalEntitiesThreeDsMerchant {
  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchantName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_MERCHANT_DISPLAY_NAME = "merchantDisplayName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_DISPLAY_NAME)
  private String merchantDisplayName;

  public static final String SERIALIZED_NAME_MERCHANT_REQUESTOR_ID_SUFFIX = "merchantRequestorIdSuffix";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REQUESTOR_ID_SUFFIX)
  private String merchantRequestorIdSuffix;

  public static final String SERIALIZED_NAME_MERCHANT_COUNTRY = "merchantCountry";
  @SerializedName(SERIALIZED_NAME_MERCHANT_COUNTRY)
  private String merchantCountry;

  public static final String SERIALIZED_NAME_MERCHANT_URL = "merchantUrl";
  @SerializedName(SERIALIZED_NAME_MERCHANT_URL)
  private URI merchantUrl;

  public static final String SERIALIZED_NAME_ACQUIRER_NAME = "acquirerName";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_NAME)
  private String acquirerName;

  public static final String SERIALIZED_NAME_BRANDS = "brands";
  @SerializedName(SERIALIZED_NAME_BRANDS)
  private List<PayToolsDalEntitiesThreeDsBrand> brands = null;

  public PayToolsDalEntitiesThreeDsMerchant() {
  }

  public PayToolsDalEntitiesThreeDsMerchant merchantName(String merchantName) {
    
    
    if (merchantName != null && merchantName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for merchantName. Length must be greater than or equal to 1.");
    }
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Get merchantName
   * @return merchantName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    
    
    if (merchantName != null && merchantName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for merchantName. Length must be greater than or equal to 1.");
    }
    this.merchantName = merchantName;
  }


  public PayToolsDalEntitiesThreeDsMerchant merchantDisplayName(String merchantDisplayName) {
    
    
    if (merchantDisplayName != null && merchantDisplayName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for merchantDisplayName. Length must be greater than or equal to 1.");
    }
    
    this.merchantDisplayName = merchantDisplayName;
    return this;
  }

   /**
   * Get merchantDisplayName
   * @return merchantDisplayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMerchantDisplayName() {
    return merchantDisplayName;
  }


  public void setMerchantDisplayName(String merchantDisplayName) {
    
    
    if (merchantDisplayName != null && merchantDisplayName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for merchantDisplayName. Length must be greater than or equal to 1.");
    }
    this.merchantDisplayName = merchantDisplayName;
  }


  public PayToolsDalEntitiesThreeDsMerchant merchantRequestorIdSuffix(String merchantRequestorIdSuffix) {
    
    
    if (merchantRequestorIdSuffix != null && merchantRequestorIdSuffix.length() < 1) {
      throw new IllegalArgumentException("Invalid value for merchantRequestorIdSuffix. Length must be greater than or equal to 1.");
    }
    
    this.merchantRequestorIdSuffix = merchantRequestorIdSuffix;
    return this;
  }

   /**
   * Get merchantRequestorIdSuffix
   * @return merchantRequestorIdSuffix
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMerchantRequestorIdSuffix() {
    return merchantRequestorIdSuffix;
  }


  public void setMerchantRequestorIdSuffix(String merchantRequestorIdSuffix) {
    
    
    if (merchantRequestorIdSuffix != null && merchantRequestorIdSuffix.length() < 1) {
      throw new IllegalArgumentException("Invalid value for merchantRequestorIdSuffix. Length must be greater than or equal to 1.");
    }
    this.merchantRequestorIdSuffix = merchantRequestorIdSuffix;
  }


  public PayToolsDalEntitiesThreeDsMerchant merchantCountry(String merchantCountry) {
    
    
    if (merchantCountry != null && merchantCountry.length() < 1) {
      throw new IllegalArgumentException("Invalid value for merchantCountry. Length must be greater than or equal to 1.");
    }
    
    this.merchantCountry = merchantCountry;
    return this;
  }

   /**
   * Get merchantCountry
   * @return merchantCountry
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMerchantCountry() {
    return merchantCountry;
  }


  public void setMerchantCountry(String merchantCountry) {
    
    
    if (merchantCountry != null && merchantCountry.length() < 1) {
      throw new IllegalArgumentException("Invalid value for merchantCountry. Length must be greater than or equal to 1.");
    }
    this.merchantCountry = merchantCountry;
  }


  public PayToolsDalEntitiesThreeDsMerchant merchantUrl(URI merchantUrl) {
    
    
    if (merchantUrl != null && merchantUrl.length() < 1) {
      throw new IllegalArgumentException("Invalid value for merchantUrl. Length must be greater than or equal to 1.");
    }
    
    this.merchantUrl = merchantUrl;
    return this;
  }

   /**
   * Get merchantUrl
   * @return merchantUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getMerchantUrl() {
    return merchantUrl;
  }


  public void setMerchantUrl(URI merchantUrl) {
    
    
    if (merchantUrl != null && merchantUrl.length() < 1) {
      throw new IllegalArgumentException("Invalid value for merchantUrl. Length must be greater than or equal to 1.");
    }
    this.merchantUrl = merchantUrl;
  }


  public PayToolsDalEntitiesThreeDsMerchant acquirerName(String acquirerName) {
    
    
    if (acquirerName != null && acquirerName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for acquirerName. Length must be greater than or equal to 1.");
    }
    
    this.acquirerName = acquirerName;
    return this;
  }

   /**
   * Get acquirerName
   * @return acquirerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAcquirerName() {
    return acquirerName;
  }


  public void setAcquirerName(String acquirerName) {
    
    
    if (acquirerName != null && acquirerName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for acquirerName. Length must be greater than or equal to 1.");
    }
    this.acquirerName = acquirerName;
  }


  public PayToolsDalEntitiesThreeDsMerchant brands(List<PayToolsDalEntitiesThreeDsBrand> brands) {
    
    
    
    
    this.brands = brands;
    return this;
  }

  public PayToolsDalEntitiesThreeDsMerchant addBrandsItem(PayToolsDalEntitiesThreeDsBrand brandsItem) {
    if (this.brands == null) {
      this.brands = new ArrayList<>();
    }
    this.brands.add(brandsItem);
    return this;
  }

   /**
   * Get brands
   * @return brands
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PayToolsDalEntitiesThreeDsBrand> getBrands() {
    return brands;
  }


  public void setBrands(List<PayToolsDalEntitiesThreeDsBrand> brands) {
    
    
    
    this.brands = brands;
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
   * @return the PayToolsDalEntitiesThreeDsMerchant instance itself
   */
  public PayToolsDalEntitiesThreeDsMerchant putAdditionalProperty(String key, Object value) {
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
    PayToolsDalEntitiesThreeDsMerchant payToolsDalEntitiesThreeDsMerchant = (PayToolsDalEntitiesThreeDsMerchant) o;
    return Objects.equals(this.merchantName, payToolsDalEntitiesThreeDsMerchant.merchantName) &&
        Objects.equals(this.merchantDisplayName, payToolsDalEntitiesThreeDsMerchant.merchantDisplayName) &&
        Objects.equals(this.merchantRequestorIdSuffix, payToolsDalEntitiesThreeDsMerchant.merchantRequestorIdSuffix) &&
        Objects.equals(this.merchantCountry, payToolsDalEntitiesThreeDsMerchant.merchantCountry) &&
        Objects.equals(this.merchantUrl, payToolsDalEntitiesThreeDsMerchant.merchantUrl) &&
        Objects.equals(this.acquirerName, payToolsDalEntitiesThreeDsMerchant.acquirerName) &&
        Objects.equals(this.brands, payToolsDalEntitiesThreeDsMerchant.brands)&&
        Objects.equals(this.additionalProperties, payToolsDalEntitiesThreeDsMerchant.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantName, merchantDisplayName, merchantRequestorIdSuffix, merchantCountry, merchantUrl, acquirerName, brands, additionalProperties);
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
    sb.append("class PayToolsDalEntitiesThreeDsMerchant {\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantDisplayName: ").append(toIndentedString(merchantDisplayName)).append("\n");
    sb.append("    merchantRequestorIdSuffix: ").append(toIndentedString(merchantRequestorIdSuffix)).append("\n");
    sb.append("    merchantCountry: ").append(toIndentedString(merchantCountry)).append("\n");
    sb.append("    merchantUrl: ").append(toIndentedString(merchantUrl)).append("\n");
    sb.append("    acquirerName: ").append(toIndentedString(acquirerName)).append("\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
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
    openapiFields.add("merchantName");
    openapiFields.add("merchantDisplayName");
    openapiFields.add("merchantRequestorIdSuffix");
    openapiFields.add("merchantCountry");
    openapiFields.add("merchantUrl");
    openapiFields.add("acquirerName");
    openapiFields.add("brands");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantName");
    openapiRequiredFields.add("merchantDisplayName");
    openapiRequiredFields.add("merchantRequestorIdSuffix");
    openapiRequiredFields.add("merchantCountry");
    openapiRequiredFields.add("merchantUrl");
    openapiRequiredFields.add("acquirerName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayToolsDalEntitiesThreeDsMerchant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayToolsDalEntitiesThreeDsMerchant.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayToolsDalEntitiesThreeDsMerchant is not found in the empty JSON string", PayToolsDalEntitiesThreeDsMerchant.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayToolsDalEntitiesThreeDsMerchant.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("merchantName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantName").toString()));
      }
      if (!jsonObj.get("merchantDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantDisplayName").toString()));
      }
      if (!jsonObj.get("merchantRequestorIdSuffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantRequestorIdSuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantRequestorIdSuffix").toString()));
      }
      if (!jsonObj.get("merchantCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantCountry").toString()));
      }
      if (!jsonObj.get("merchantUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantUrl").toString()));
      }
      if (!jsonObj.get("acquirerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acquirerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acquirerName").toString()));
      }
      if (jsonObj.get("brands") != null && !jsonObj.get("brands").isJsonNull()) {
        JsonArray jsonArraybrands = jsonObj.getAsJsonArray("brands");
        if (jsonArraybrands != null) {
          // ensure the json data is an array
          if (!jsonObj.get("brands").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `brands` to be an array in the JSON string but got `%s`", jsonObj.get("brands").toString()));
          }

          // validate the optional field `brands` (array)
          for (int i = 0; i < jsonArraybrands.size(); i++) {
            PayToolsDalEntitiesThreeDsBrand.validateJsonObject(jsonArraybrands.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayToolsDalEntitiesThreeDsMerchant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayToolsDalEntitiesThreeDsMerchant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayToolsDalEntitiesThreeDsMerchant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayToolsDalEntitiesThreeDsMerchant.class));

       return (TypeAdapter<T>) new TypeAdapter<PayToolsDalEntitiesThreeDsMerchant>() {
           @Override
           public void write(JsonWriter out, PayToolsDalEntitiesThreeDsMerchant value) throws IOException {
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
           public PayToolsDalEntitiesThreeDsMerchant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayToolsDalEntitiesThreeDsMerchant instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayToolsDalEntitiesThreeDsMerchant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayToolsDalEntitiesThreeDsMerchant
  * @throws IOException if the JSON string is invalid with respect to PayToolsDalEntitiesThreeDsMerchant
  */
  public static PayToolsDalEntitiesThreeDsMerchant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayToolsDalEntitiesThreeDsMerchant.class);
  }

 /**
  * Convert an instance of PayToolsDalEntitiesThreeDsMerchant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

