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
import com.konfigthis.client.model.PaymentsBankCard;
import com.konfigthis.client.model.PaymentsMoney;
import com.konfigthis.client.model.PaymentsPayer;
import com.konfigthis.client.model.PaymentsThreeDS;
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
 * PaymentsChargeRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentsChargeRequest {
  public static final String SERIALIZED_NAME_BANK_CARD = "bankCard";
  @SerializedName(SERIALIZED_NAME_BANK_CARD)
  private PaymentsBankCard bankCard;

  public static final String SERIALIZED_NAME_PAYER = "payer";
  @SerializedName(SERIALIZED_NAME_PAYER)
  private PaymentsPayer payer;

  public static final String SERIALIZED_NAME_THREE_D_S = "threeDS";
  @SerializedName(SERIALIZED_NAME_THREE_D_S)
  private PaymentsThreeDS threeDS;

  public static final String SERIALIZED_NAME_USER_TOKEN = "userToken";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private PaymentsMoney amount;

  public static final String SERIALIZED_NAME_MY_REFERENCE = "myReference";
  @SerializedName(SERIALIZED_NAME_MY_REFERENCE)
  private String myReference;

  public static final String SERIALIZED_NAME_IS_DIGITAL_GOODS = "isDigitalGoods";
  @SerializedName(SERIALIZED_NAME_IS_DIGITAL_GOODS)
  private Boolean isDigitalGoods;

  public static final String SERIALIZED_NAME_ORDER_DESC = "orderDesc";
  @SerializedName(SERIALIZED_NAME_ORDER_DESC)
  private String orderDesc;

  public static final String SERIALIZED_NAME_GENERATE_TOKEN = "generateToken";
  @SerializedName(SERIALIZED_NAME_GENERATE_TOKEN)
  private Boolean generateToken;

  public PaymentsChargeRequest() {
  }

  public PaymentsChargeRequest bankCard(PaymentsBankCard bankCard) {
    
    
    
    
    this.bankCard = bankCard;
    return this;
  }

   /**
   * Get bankCard
   * @return bankCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsBankCard getBankCard() {
    return bankCard;
  }


  public void setBankCard(PaymentsBankCard bankCard) {
    
    
    
    this.bankCard = bankCard;
  }


  public PaymentsChargeRequest payer(PaymentsPayer payer) {
    
    
    
    
    this.payer = payer;
    return this;
  }

   /**
   * Get payer
   * @return payer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsPayer getPayer() {
    return payer;
  }


  public void setPayer(PaymentsPayer payer) {
    
    
    
    this.payer = payer;
  }


  public PaymentsChargeRequest threeDS(PaymentsThreeDS threeDS) {
    
    
    
    
    this.threeDS = threeDS;
    return this;
  }

   /**
   * Get threeDS
   * @return threeDS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsThreeDS getThreeDS() {
    return threeDS;
  }


  public void setThreeDS(PaymentsThreeDS threeDS) {
    
    
    
    this.threeDS = threeDS;
  }


  public PaymentsChargeRequest userToken(String userToken) {
    
    
    
    
    this.userToken = userToken;
    return this;
  }

   /**
   * Get userToken
   * @return userToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserToken() {
    return userToken;
  }


  public void setUserToken(String userToken) {
    
    
    
    this.userToken = userToken;
  }


  public PaymentsChargeRequest amount(PaymentsMoney amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsMoney getAmount() {
    return amount;
  }


  public void setAmount(PaymentsMoney amount) {
    
    
    
    this.amount = amount;
  }


  public PaymentsChargeRequest myReference(String myReference) {
    
    
    
    
    this.myReference = myReference;
    return this;
  }

   /**
   * Get myReference
   * @return myReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMyReference() {
    return myReference;
  }


  public void setMyReference(String myReference) {
    
    
    
    this.myReference = myReference;
  }


  public PaymentsChargeRequest isDigitalGoods(Boolean isDigitalGoods) {
    
    
    
    
    this.isDigitalGoods = isDigitalGoods;
    return this;
  }

   /**
   * Get isDigitalGoods
   * @return isDigitalGoods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDigitalGoods() {
    return isDigitalGoods;
  }


  public void setIsDigitalGoods(Boolean isDigitalGoods) {
    
    
    
    this.isDigitalGoods = isDigitalGoods;
  }


  public PaymentsChargeRequest orderDesc(String orderDesc) {
    
    
    
    
    this.orderDesc = orderDesc;
    return this;
  }

   /**
   * Get orderDesc
   * @return orderDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderDesc() {
    return orderDesc;
  }


  public void setOrderDesc(String orderDesc) {
    
    
    
    this.orderDesc = orderDesc;
  }


  public PaymentsChargeRequest generateToken(Boolean generateToken) {
    
    
    
    
    this.generateToken = generateToken;
    return this;
  }

   /**
   * Get generateToken
   * @return generateToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGenerateToken() {
    return generateToken;
  }


  public void setGenerateToken(Boolean generateToken) {
    
    
    
    this.generateToken = generateToken;
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
   * @return the PaymentsChargeRequest instance itself
   */
  public PaymentsChargeRequest putAdditionalProperty(String key, Object value) {
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
    PaymentsChargeRequest paymentsChargeRequest = (PaymentsChargeRequest) o;
    return Objects.equals(this.bankCard, paymentsChargeRequest.bankCard) &&
        Objects.equals(this.payer, paymentsChargeRequest.payer) &&
        Objects.equals(this.threeDS, paymentsChargeRequest.threeDS) &&
        Objects.equals(this.userToken, paymentsChargeRequest.userToken) &&
        Objects.equals(this.amount, paymentsChargeRequest.amount) &&
        Objects.equals(this.myReference, paymentsChargeRequest.myReference) &&
        Objects.equals(this.isDigitalGoods, paymentsChargeRequest.isDigitalGoods) &&
        Objects.equals(this.orderDesc, paymentsChargeRequest.orderDesc) &&
        Objects.equals(this.generateToken, paymentsChargeRequest.generateToken)&&
        Objects.equals(this.additionalProperties, paymentsChargeRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCard, payer, threeDS, userToken, amount, myReference, isDigitalGoods, orderDesc, generateToken, additionalProperties);
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
    sb.append("class PaymentsChargeRequest {\n");
    sb.append("    bankCard: ").append(toIndentedString(bankCard)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    threeDS: ").append(toIndentedString(threeDS)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    myReference: ").append(toIndentedString(myReference)).append("\n");
    sb.append("    isDigitalGoods: ").append(toIndentedString(isDigitalGoods)).append("\n");
    sb.append("    orderDesc: ").append(toIndentedString(orderDesc)).append("\n");
    sb.append("    generateToken: ").append(toIndentedString(generateToken)).append("\n");
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
    openapiFields.add("bankCard");
    openapiFields.add("payer");
    openapiFields.add("threeDS");
    openapiFields.add("userToken");
    openapiFields.add("amount");
    openapiFields.add("myReference");
    openapiFields.add("isDigitalGoods");
    openapiFields.add("orderDesc");
    openapiFields.add("generateToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentsChargeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentsChargeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentsChargeRequest is not found in the empty JSON string", PaymentsChargeRequest.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `bankCard`
      if (jsonObj.get("bankCard") != null && !jsonObj.get("bankCard").isJsonNull()) {
        PaymentsBankCard.validateJsonObject(jsonObj.getAsJsonObject("bankCard"));
      }
      // validate the optional field `payer`
      if (jsonObj.get("payer") != null && !jsonObj.get("payer").isJsonNull()) {
        PaymentsPayer.validateJsonObject(jsonObj.getAsJsonObject("payer"));
      }
      // validate the optional field `threeDS`
      if (jsonObj.get("threeDS") != null && !jsonObj.get("threeDS").isJsonNull()) {
        PaymentsThreeDS.validateJsonObject(jsonObj.getAsJsonObject("threeDS"));
      }
      if (!jsonObj.get("userToken").isJsonNull() && (jsonObj.get("userToken") != null && !jsonObj.get("userToken").isJsonNull()) && !jsonObj.get("userToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userToken").toString()));
      }
      // validate the optional field `amount`
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) {
        PaymentsMoney.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      if (!jsonObj.get("myReference").isJsonNull() && (jsonObj.get("myReference") != null && !jsonObj.get("myReference").isJsonNull()) && !jsonObj.get("myReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `myReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("myReference").toString()));
      }
      if (!jsonObj.get("orderDesc").isJsonNull() && (jsonObj.get("orderDesc") != null && !jsonObj.get("orderDesc").isJsonNull()) && !jsonObj.get("orderDesc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderDesc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderDesc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentsChargeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentsChargeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentsChargeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentsChargeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentsChargeRequest>() {
           @Override
           public void write(JsonWriter out, PaymentsChargeRequest value) throws IOException {
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
           public PaymentsChargeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentsChargeRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentsChargeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentsChargeRequest
  * @throws IOException if the JSON string is invalid with respect to PaymentsChargeRequest
  */
  public static PaymentsChargeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentsChargeRequest.class);
  }

 /**
  * Convert an instance of PaymentsChargeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

