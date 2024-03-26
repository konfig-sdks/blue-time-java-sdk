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
 * Results for a card validation request
 */
@ApiModel(description = "Results for a card validation request")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayToolsApiModelsCardValidationResults {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RISK_LEVEL = "riskLevel";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private String riskLevel;

  public static final String SERIALIZED_NAME_CARD_BRAND = "cardBrand";
  @SerializedName(SERIALIZED_NAME_CARD_BRAND)
  private String cardBrand;

  public static final String SERIALIZED_NAME_CARD_TYPE = "cardType";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_CARD_CATEGORY = "cardCategory";
  @SerializedName(SERIALIZED_NAME_CARD_CATEGORY)
  private String cardCategory;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuerName";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public static final String SERIALIZED_NAME_ISSUER_COUNTRY = "issuerCountry";
  @SerializedName(SERIALIZED_NAME_ISSUER_COUNTRY)
  private String issuerCountry;

  public static final String SERIALIZED_NAME_COUNTRY_BY_I_P = "countryByIP";
  @SerializedName(SERIALIZED_NAME_COUNTRY_BY_I_P)
  private String countryByIP;

  public static final String SERIALIZED_NAME_COUNTRY_FROM_BILLING_ADDRESS = "countryFromBillingAddress";
  @SerializedName(SERIALIZED_NAME_COUNTRY_FROM_BILLING_ADDRESS)
  private String countryFromBillingAddress;

  public static final String SERIALIZED_NAME_ANONYMOUS_PROXY_USED = "anonymousProxyUsed";
  @SerializedName(SERIALIZED_NAME_ANONYMOUS_PROXY_USED)
  private Boolean anonymousProxyUsed;

  public PayToolsApiModelsCardValidationResults() {
  }

  public PayToolsApiModelsCardValidationResults description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description of the risk that was identified for this transaction.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the risk that was identified for this transaction.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PayToolsApiModelsCardValidationResults riskLevel(String riskLevel) {
    
    
    
    
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * The risk level associated with this transaction (possible values are &#x60;VeryLow&#x60;, &#x60;Low&#x60;, &#x60;High&#x60; and &#x60;VeryHigh&#x60;)
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The risk level associated with this transaction (possible values are `VeryLow`, `Low`, `High` and `VeryHigh`)")

  public String getRiskLevel() {
    return riskLevel;
  }


  public void setRiskLevel(String riskLevel) {
    
    
    
    this.riskLevel = riskLevel;
  }


  public PayToolsApiModelsCardValidationResults cardBrand(String cardBrand) {
    
    
    
    
    this.cardBrand = cardBrand;
    return this;
  }

   /**
   * The card brand (AMERICAN EXPRESS, VISA, MASTERCARD, JCB etc)
   * @return cardBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The card brand (AMERICAN EXPRESS, VISA, MASTERCARD, JCB etc)")

  public String getCardBrand() {
    return cardBrand;
  }


  public void setCardBrand(String cardBrand) {
    
    
    
    this.cardBrand = cardBrand;
  }


  public PayToolsApiModelsCardValidationResults cardType(String cardType) {
    
    
    
    
    this.cardType = cardType;
    return this;
  }

   /**
   * Type of card (e.g &#39;CREDIT&#39;, &#39;DEBIT&#39;, etc.)
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of card (e.g 'CREDIT', 'DEBIT', etc.)")

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    
    
    
    this.cardType = cardType;
  }


  public PayToolsApiModelsCardValidationResults cardCategory(String cardCategory) {
    
    
    
    
    this.cardCategory = cardCategory;
    return this;
  }

   /**
   * Card category (e.g &#39;GIFT&#39;, &#39;PROPRIETARY&#39; etc.)
   * @return cardCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card category (e.g 'GIFT', 'PROPRIETARY' etc.)")

  public String getCardCategory() {
    return cardCategory;
  }


  public void setCardCategory(String cardCategory) {
    
    
    
    this.cardCategory = cardCategory;
  }


  public PayToolsApiModelsCardValidationResults issuerName(String issuerName) {
    
    
    
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Name of Card issuer (e.g &#39;Bank of America&#39;)
   * @return issuerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of Card issuer (e.g 'Bank of America')")

  public String getIssuerName() {
    return issuerName;
  }


  public void setIssuerName(String issuerName) {
    
    
    
    this.issuerName = issuerName;
  }


  public PayToolsApiModelsCardValidationResults issuerCountry(String issuerCountry) {
    
    
    
    
    this.issuerCountry = issuerCountry;
    return this;
  }

   /**
   * 2 letter country code (&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166-2 &lt;img src&#x3D;\&quot;https://files.readme.io/b676144-openNewWindow.png\&quot; width&#x3D;\&quot;10\&quot; /&gt;&lt;/a&gt;) of the card issuer&#39;s country
   * @return issuerCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "2 letter country code (<a href=\"https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\" target=\"_blank\">ISO 3166-2 <img src=\"https://files.readme.io/b676144-openNewWindow.png\" width=\"10\" /></a>) of the card issuer's country")

  public String getIssuerCountry() {
    return issuerCountry;
  }


  public void setIssuerCountry(String issuerCountry) {
    
    
    
    this.issuerCountry = issuerCountry;
  }


  public PayToolsApiModelsCardValidationResults countryByIP(String countryByIP) {
    
    
    
    
    this.countryByIP = countryByIP;
    return this;
  }

   /**
   * 2 letter country code (&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166-2 &lt;img src&#x3D;\&quot;https://files.readme.io/b676144-openNewWindow.png\&quot; width&#x3D;\&quot;10\&quot; /&gt;&lt;/a&gt;) of the country detected by the Payer&#39;s IP address
   * @return countryByIP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "2 letter country code (<a href=\"https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\" target=\"_blank\">ISO 3166-2 <img src=\"https://files.readme.io/b676144-openNewWindow.png\" width=\"10\" /></a>) of the country detected by the Payer's IP address")

  public String getCountryByIP() {
    return countryByIP;
  }


  public void setCountryByIP(String countryByIP) {
    
    
    
    this.countryByIP = countryByIP;
  }


  public PayToolsApiModelsCardValidationResults countryFromBillingAddress(String countryFromBillingAddress) {
    
    
    
    
    this.countryFromBillingAddress = countryFromBillingAddress;
    return this;
  }

   /**
   * 2 letter country code (&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166-2 &lt;img src&#x3D;\&quot;https://files.readme.io/b676144-openNewWindow.png\&quot; width&#x3D;\&quot;10\&quot; /&gt;&lt;/a&gt;) from the Payer&#39;s billing address
   * @return countryFromBillingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "2 letter country code (<a href=\"https://en.wikipedia.org/wiki/ISO_3166-2#Current_codes\" target=\"_blank\">ISO 3166-2 <img src=\"https://files.readme.io/b676144-openNewWindow.png\" width=\"10\" /></a>) from the Payer's billing address")

  public String getCountryFromBillingAddress() {
    return countryFromBillingAddress;
  }


  public void setCountryFromBillingAddress(String countryFromBillingAddress) {
    
    
    
    this.countryFromBillingAddress = countryFromBillingAddress;
  }


  public PayToolsApiModelsCardValidationResults anonymousProxyUsed(Boolean anonymousProxyUsed) {
    
    
    
    
    this.anonymousProxyUsed = anonymousProxyUsed;
    return this;
  }

   /**
   * Is the Payer&#39;s IP address coming from an Anonymous Proxy
   * @return anonymousProxyUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the Payer's IP address coming from an Anonymous Proxy")

  public Boolean getAnonymousProxyUsed() {
    return anonymousProxyUsed;
  }


  public void setAnonymousProxyUsed(Boolean anonymousProxyUsed) {
    
    
    
    this.anonymousProxyUsed = anonymousProxyUsed;
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
   * @return the PayToolsApiModelsCardValidationResults instance itself
   */
  public PayToolsApiModelsCardValidationResults putAdditionalProperty(String key, Object value) {
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
    PayToolsApiModelsCardValidationResults payToolsApiModelsCardValidationResults = (PayToolsApiModelsCardValidationResults) o;
    return Objects.equals(this.description, payToolsApiModelsCardValidationResults.description) &&
        Objects.equals(this.riskLevel, payToolsApiModelsCardValidationResults.riskLevel) &&
        Objects.equals(this.cardBrand, payToolsApiModelsCardValidationResults.cardBrand) &&
        Objects.equals(this.cardType, payToolsApiModelsCardValidationResults.cardType) &&
        Objects.equals(this.cardCategory, payToolsApiModelsCardValidationResults.cardCategory) &&
        Objects.equals(this.issuerName, payToolsApiModelsCardValidationResults.issuerName) &&
        Objects.equals(this.issuerCountry, payToolsApiModelsCardValidationResults.issuerCountry) &&
        Objects.equals(this.countryByIP, payToolsApiModelsCardValidationResults.countryByIP) &&
        Objects.equals(this.countryFromBillingAddress, payToolsApiModelsCardValidationResults.countryFromBillingAddress) &&
        Objects.equals(this.anonymousProxyUsed, payToolsApiModelsCardValidationResults.anonymousProxyUsed)&&
        Objects.equals(this.additionalProperties, payToolsApiModelsCardValidationResults.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, riskLevel, cardBrand, cardType, cardCategory, issuerName, issuerCountry, countryByIP, countryFromBillingAddress, anonymousProxyUsed, additionalProperties);
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
    sb.append("class PayToolsApiModelsCardValidationResults {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardCategory: ").append(toIndentedString(cardCategory)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    issuerCountry: ").append(toIndentedString(issuerCountry)).append("\n");
    sb.append("    countryByIP: ").append(toIndentedString(countryByIP)).append("\n");
    sb.append("    countryFromBillingAddress: ").append(toIndentedString(countryFromBillingAddress)).append("\n");
    sb.append("    anonymousProxyUsed: ").append(toIndentedString(anonymousProxyUsed)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("riskLevel");
    openapiFields.add("cardBrand");
    openapiFields.add("cardType");
    openapiFields.add("cardCategory");
    openapiFields.add("issuerName");
    openapiFields.add("issuerCountry");
    openapiFields.add("countryByIP");
    openapiFields.add("countryFromBillingAddress");
    openapiFields.add("anonymousProxyUsed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayToolsApiModelsCardValidationResults
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayToolsApiModelsCardValidationResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayToolsApiModelsCardValidationResults is not found in the empty JSON string", PayToolsApiModelsCardValidationResults.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("riskLevel").isJsonNull() && (jsonObj.get("riskLevel") != null && !jsonObj.get("riskLevel").isJsonNull()) && !jsonObj.get("riskLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `riskLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("riskLevel").toString()));
      }
      if (!jsonObj.get("cardBrand").isJsonNull() && (jsonObj.get("cardBrand") != null && !jsonObj.get("cardBrand").isJsonNull()) && !jsonObj.get("cardBrand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardBrand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardBrand").toString()));
      }
      if (!jsonObj.get("cardType").isJsonNull() && (jsonObj.get("cardType") != null && !jsonObj.get("cardType").isJsonNull()) && !jsonObj.get("cardType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardType").toString()));
      }
      if (!jsonObj.get("cardCategory").isJsonNull() && (jsonObj.get("cardCategory") != null && !jsonObj.get("cardCategory").isJsonNull()) && !jsonObj.get("cardCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardCategory").toString()));
      }
      if (!jsonObj.get("issuerName").isJsonNull() && (jsonObj.get("issuerName") != null && !jsonObj.get("issuerName").isJsonNull()) && !jsonObj.get("issuerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerName").toString()));
      }
      if (!jsonObj.get("issuerCountry").isJsonNull() && (jsonObj.get("issuerCountry") != null && !jsonObj.get("issuerCountry").isJsonNull()) && !jsonObj.get("issuerCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerCountry").toString()));
      }
      if (!jsonObj.get("countryByIP").isJsonNull() && (jsonObj.get("countryByIP") != null && !jsonObj.get("countryByIP").isJsonNull()) && !jsonObj.get("countryByIP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryByIP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryByIP").toString()));
      }
      if (!jsonObj.get("countryFromBillingAddress").isJsonNull() && (jsonObj.get("countryFromBillingAddress") != null && !jsonObj.get("countryFromBillingAddress").isJsonNull()) && !jsonObj.get("countryFromBillingAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryFromBillingAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryFromBillingAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayToolsApiModelsCardValidationResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayToolsApiModelsCardValidationResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayToolsApiModelsCardValidationResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayToolsApiModelsCardValidationResults.class));

       return (TypeAdapter<T>) new TypeAdapter<PayToolsApiModelsCardValidationResults>() {
           @Override
           public void write(JsonWriter out, PayToolsApiModelsCardValidationResults value) throws IOException {
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
           public PayToolsApiModelsCardValidationResults read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayToolsApiModelsCardValidationResults instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayToolsApiModelsCardValidationResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayToolsApiModelsCardValidationResults
  * @throws IOException if the JSON string is invalid with respect to PayToolsApiModelsCardValidationResults
  */
  public static PayToolsApiModelsCardValidationResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayToolsApiModelsCardValidationResults.class);
  }

 /**
  * Convert an instance of PayToolsApiModelsCardValidationResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

