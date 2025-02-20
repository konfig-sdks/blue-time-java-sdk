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
import com.konfigthis.client.model.PayToolsApiModelsThreeDSAuthenticationInputModel;
import com.konfigthis.client.model.PaymentsCardTypes;
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
 * The card details that should be charged. You can either provide us with the raw card details or provide a reference to the stored card details in a token.
 */
@ApiModel(description = "The card details that should be charged. You can either provide us with the raw card details or provide a reference to the stored card details in a token.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayToolsApiModelsCardInputModel {
  public static final String SERIALIZED_NAME_OWNER_I_D = "ownerID";
  @SerializedName(SERIALIZED_NAME_OWNER_I_D)
  private String ownerID;

  public static final String SERIALIZED_NAME_ISSUE_NUMBER = "issueNumber";
  @SerializedName(SERIALIZED_NAME_ISSUE_NUMBER)
  private String issueNumber;

  public static final String SERIALIZED_NAME_CVV = "cvv";
  @SerializedName(SERIALIZED_NAME_CVV)
  private String cvv;

  public static final String SERIALIZED_NAME_THREE_D_S_AUTHENTICATION = "threeDSAuthentication";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_AUTHENTICATION)
  private PayToolsApiModelsThreeDSAuthenticationInputModel threeDSAuthentication;

  public static final String SERIALIZED_NAME_CARD_TYPE = "cardType";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private PaymentsCardTypes cardType;

  public static final String SERIALIZED_NAME_CARD_HOLDER_NAME = "cardHolderName";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER_NAME)
  private String cardHolderName;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_EXPIRATION_YEAR = "expirationYear";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_YEAR)
  private Integer expirationYear;

  public static final String SERIALIZED_NAME_EXPIRATION_MONTH = "expirationMonth";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_MONTH)
  private Integer expirationMonth;

  public PayToolsApiModelsCardInputModel() {
  }

  public PayToolsApiModelsCardInputModel ownerID(String ownerID) {
    
    
    
    
    this.ownerID = ownerID;
    return this;
  }

   /**
   * Card owner Id
   * @return ownerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card owner Id")

  public String getOwnerID() {
    return ownerID;
  }


  public void setOwnerID(String ownerID) {
    
    
    
    this.ownerID = ownerID;
  }


  public PayToolsApiModelsCardInputModel issueNumber(String issueNumber) {
    
    
    
    
    this.issueNumber = issueNumber;
    return this;
  }

   /**
   * Card Issue Number
   * @return issueNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card Issue Number")

  public String getIssueNumber() {
    return issueNumber;
  }


  public void setIssueNumber(String issueNumber) {
    
    
    
    this.issueNumber = issueNumber;
  }


  public PayToolsApiModelsCardInputModel cvv(String cvv) {
    
    
    
    
    this.cvv = cvv;
    return this;
  }

   /**
   * Card security code (digits on back of card)
   * @return cvv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card security code (digits on back of card)")

  public String getCvv() {
    return cvv;
  }


  public void setCvv(String cvv) {
    
    
    
    this.cvv = cvv;
  }


  public PayToolsApiModelsCardInputModel threeDSAuthentication(PayToolsApiModelsThreeDSAuthenticationInputModel threeDSAuthentication) {
    
    
    
    
    this.threeDSAuthentication = threeDSAuthentication;
    return this;
  }

   /**
   * Get threeDSAuthentication
   * @return threeDSAuthentication
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayToolsApiModelsThreeDSAuthenticationInputModel getThreeDSAuthentication() {
    return threeDSAuthentication;
  }


  public void setThreeDSAuthentication(PayToolsApiModelsThreeDSAuthenticationInputModel threeDSAuthentication) {
    
    
    
    this.threeDSAuthentication = threeDSAuthentication;
  }


  public PayToolsApiModelsCardInputModel cardType(PaymentsCardTypes cardType) {
    
    
    
    
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsCardTypes getCardType() {
    return cardType;
  }


  public void setCardType(PaymentsCardTypes cardType) {
    
    
    
    this.cardType = cardType;
  }


  public PayToolsApiModelsCardInputModel cardHolderName(String cardHolderName) {
    
    
    if (cardHolderName != null && cardHolderName.length() < 3) {
      throw new IllegalArgumentException("Invalid value for cardHolderName. Length must be greater than or equal to 3.");
    }
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * Cardholder name (as apears on card)
   * @return cardHolderName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cardholder name (as apears on card)")

  public String getCardHolderName() {
    return cardHolderName;
  }


  public void setCardHolderName(String cardHolderName) {
    
    
    if (cardHolderName != null && cardHolderName.length() < 3) {
      throw new IllegalArgumentException("Invalid value for cardHolderName. Length must be greater than or equal to 3.");
    }
    this.cardHolderName = cardHolderName;
  }


  public PayToolsApiModelsCardInputModel cardNumber(String cardNumber) {
    
    
    if (cardNumber != null && cardNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for cardNumber. Length must be greater than or equal to 1.");
    }
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Card number (PAN) or a Reference to a Tokenized string. A Token should be referenced in the format @TOKEN, e.g \&quot;@nQGywsQE9gbURtrXEjTZwtWqeMdK9nsO\&quot;
   * @return cardNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Card number (PAN) or a Reference to a Tokenized string. A Token should be referenced in the format @TOKEN, e.g \"@nQGywsQE9gbURtrXEjTZwtWqeMdK9nsO\"")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    
    
    if (cardNumber != null && cardNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for cardNumber. Length must be greater than or equal to 1.");
    }
    this.cardNumber = cardNumber;
  }


  public PayToolsApiModelsCardInputModel expirationYear(Integer expirationYear) {
    
    
    
    
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Expiration year
   * @return expirationYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Expiration year")

  public Integer getExpirationYear() {
    return expirationYear;
  }


  public void setExpirationYear(Integer expirationYear) {
    
    
    
    this.expirationYear = expirationYear;
  }


  public PayToolsApiModelsCardInputModel expirationMonth(Integer expirationMonth) {
    if (expirationMonth != null && expirationMonth < 1) {
      throw new IllegalArgumentException("Invalid value for expirationMonth. Must be greater than or equal to 1.");
    }
    if (expirationMonth != null && expirationMonth > 12) {
      throw new IllegalArgumentException("Invalid value for expirationMonth. Must be less than or equal to 12.");
    }
    
    
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Expiration month
   * minimum: 1
   * maximum: 12
   * @return expirationMonth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Expiration month")

  public Integer getExpirationMonth() {
    return expirationMonth;
  }


  public void setExpirationMonth(Integer expirationMonth) {
    if (expirationMonth != null && expirationMonth < 1) {
      throw new IllegalArgumentException("Invalid value for expirationMonth. Must be greater than or equal to 1.");
    }
    if (expirationMonth != null && expirationMonth > 12) {
      throw new IllegalArgumentException("Invalid value for expirationMonth. Must be less than or equal to 12.");
    }
    
    this.expirationMonth = expirationMonth;
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
   * @return the PayToolsApiModelsCardInputModel instance itself
   */
  public PayToolsApiModelsCardInputModel putAdditionalProperty(String key, Object value) {
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
    PayToolsApiModelsCardInputModel payToolsApiModelsCardInputModel = (PayToolsApiModelsCardInputModel) o;
    return Objects.equals(this.ownerID, payToolsApiModelsCardInputModel.ownerID) &&
        Objects.equals(this.issueNumber, payToolsApiModelsCardInputModel.issueNumber) &&
        Objects.equals(this.cvv, payToolsApiModelsCardInputModel.cvv) &&
        Objects.equals(this.threeDSAuthentication, payToolsApiModelsCardInputModel.threeDSAuthentication) &&
        Objects.equals(this.cardType, payToolsApiModelsCardInputModel.cardType) &&
        Objects.equals(this.cardHolderName, payToolsApiModelsCardInputModel.cardHolderName) &&
        Objects.equals(this.cardNumber, payToolsApiModelsCardInputModel.cardNumber) &&
        Objects.equals(this.expirationYear, payToolsApiModelsCardInputModel.expirationYear) &&
        Objects.equals(this.expirationMonth, payToolsApiModelsCardInputModel.expirationMonth)&&
        Objects.equals(this.additionalProperties, payToolsApiModelsCardInputModel.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerID, issueNumber, cvv, threeDSAuthentication, cardType, cardHolderName, cardNumber, expirationYear, expirationMonth, additionalProperties);
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
    sb.append("class PayToolsApiModelsCardInputModel {\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    threeDSAuthentication: ").append(toIndentedString(threeDSAuthentication)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
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
    openapiFields.add("ownerID");
    openapiFields.add("issueNumber");
    openapiFields.add("cvv");
    openapiFields.add("threeDSAuthentication");
    openapiFields.add("cardType");
    openapiFields.add("cardHolderName");
    openapiFields.add("cardNumber");
    openapiFields.add("expirationYear");
    openapiFields.add("expirationMonth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cardHolderName");
    openapiRequiredFields.add("cardNumber");
    openapiRequiredFields.add("expirationYear");
    openapiRequiredFields.add("expirationMonth");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayToolsApiModelsCardInputModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayToolsApiModelsCardInputModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayToolsApiModelsCardInputModel is not found in the empty JSON string", PayToolsApiModelsCardInputModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayToolsApiModelsCardInputModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("ownerID").isJsonNull() && (jsonObj.get("ownerID") != null && !jsonObj.get("ownerID").isJsonNull()) && !jsonObj.get("ownerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerID").toString()));
      }
      if (!jsonObj.get("issueNumber").isJsonNull() && (jsonObj.get("issueNumber") != null && !jsonObj.get("issueNumber").isJsonNull()) && !jsonObj.get("issueNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueNumber").toString()));
      }
      if (!jsonObj.get("cvv").isJsonNull() && (jsonObj.get("cvv") != null && !jsonObj.get("cvv").isJsonNull()) && !jsonObj.get("cvv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cvv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cvv").toString()));
      }
      // validate the optional field `threeDSAuthentication`
      if (jsonObj.get("threeDSAuthentication") != null && !jsonObj.get("threeDSAuthentication").isJsonNull()) {
        PayToolsApiModelsThreeDSAuthenticationInputModel.validateJsonObject(jsonObj.getAsJsonObject("threeDSAuthentication"));
      }
      if (!jsonObj.get("cardHolderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardHolderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardHolderName").toString()));
      }
      if (!jsonObj.get("cardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayToolsApiModelsCardInputModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayToolsApiModelsCardInputModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayToolsApiModelsCardInputModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayToolsApiModelsCardInputModel.class));

       return (TypeAdapter<T>) new TypeAdapter<PayToolsApiModelsCardInputModel>() {
           @Override
           public void write(JsonWriter out, PayToolsApiModelsCardInputModel value) throws IOException {
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
           public PayToolsApiModelsCardInputModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayToolsApiModelsCardInputModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayToolsApiModelsCardInputModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayToolsApiModelsCardInputModel
  * @throws IOException if the JSON string is invalid with respect to PayToolsApiModelsCardInputModel
  */
  public static PayToolsApiModelsCardInputModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayToolsApiModelsCardInputModel.class);
  }

 /**
  * Convert an instance of PayToolsApiModelsCardInputModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

