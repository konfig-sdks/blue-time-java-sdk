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
import com.konfigthis.client.model.PayToolsApiModelsCardInputModel;
import com.konfigthis.client.model.PayToolsApiModelsPaymentGatewayAccount;
import com.konfigthis.client.model.PaymentsNetworkTokenSchemes;
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
 * Model for a Capturing or voiding a previously Pre-authorize request via a payment gateway
 */
@ApiModel(description = "Model for a Capturing or voiding a previously Pre-authorize request via a payment gateway")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayToolsApiModelsCaptureVoidRequestModel {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_REF_TRANS_ID = "refTransId";
  @SerializedName(SERIALIZED_NAME_REF_TRANS_ID)
  private String refTransId;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private PayToolsApiModelsCardInputModel card;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_MY_REF = "myRef";
  @SerializedName(SERIALIZED_NAME_MY_REF)
  private String myRef;

  public static final String SERIALIZED_NAME_PAYMENT_GATEWAY_ACCOUNT_NAME = "paymentGatewayAccountName";
  @SerializedName(SERIALIZED_NAME_PAYMENT_GATEWAY_ACCOUNT_NAME)
  private String paymentGatewayAccountName;

  public static final String SERIALIZED_NAME_CERTIFICATE_NAME = "certificateName";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_NAME)
  private String certificateName;

  public static final String SERIALIZED_NAME_PAYMENT_GATEWAY_ACCOUNT = "paymentGatewayAccount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_GATEWAY_ACCOUNT)
  private PayToolsApiModelsPaymentGatewayAccount paymentGatewayAccount;

  public static final String SERIALIZED_NAME_NETWORK_TOKEN_BRAND = "networkTokenBrand";
  @SerializedName(SERIALIZED_NAME_NETWORK_TOKEN_BRAND)
  private PaymentsNetworkTokenSchemes networkTokenBrand;

  public PayToolsApiModelsCaptureVoidRequestModel() {
  }

  public PayToolsApiModelsCaptureVoidRequestModel currency(String currency) {
    
    
    if (currency != null && currency.length() < 1) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 1.");
    }
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the transaction. Based on the &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217#Active_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 4217&lt;/a&gt; standard.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The currency of the transaction. Based on the <a href=\"https://en.wikipedia.org/wiki/ISO_4217#Active_codes\" target=\"_blank\">ISO 4217</a> standard.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    if (currency != null && currency.length() < 1) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 1.");
    }
    this.currency = currency;
  }


  public PayToolsApiModelsCaptureVoidRequestModel refTransId(String refTransId) {
    
    
    if (refTransId != null && refTransId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for refTransId. Length must be greater than or equal to 1.");
    }
    
    this.refTransId = refTransId;
    return this;
  }

   /**
   * The transaction ID that this operation is referring to.
   * @return refTransId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The transaction ID that this operation is referring to.")

  public String getRefTransId() {
    return refTransId;
  }


  public void setRefTransId(String refTransId) {
    
    
    if (refTransId != null && refTransId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for refTransId. Length must be greater than or equal to 1.");
    }
    this.refTransId = refTransId;
  }


  public PayToolsApiModelsCaptureVoidRequestModel card(PayToolsApiModelsCardInputModel card) {
    
    
    
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PayToolsApiModelsCardInputModel getCard() {
    return card;
  }


  public void setCard(PayToolsApiModelsCardInputModel card) {
    
    
    
    this.card = card;
  }


  public PayToolsApiModelsCaptureVoidRequestModel amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount to be charged (the amount should be in major units - for example, 10.23)
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The amount to be charged (the amount should be in major units - for example, 10.23)")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public PayToolsApiModelsCaptureVoidRequestModel myRef(String myRef) {
    
    
    
    
    this.myRef = myRef;
    return this;
  }

   /**
   * Your custom reference for this transaction
   * @return myRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your custom reference for this transaction")

  public String getMyRef() {
    return myRef;
  }


  public void setMyRef(String myRef) {
    
    
    
    this.myRef = myRef;
  }


  public PayToolsApiModelsCaptureVoidRequestModel paymentGatewayAccountName(String paymentGatewayAccountName) {
    
    
    
    
    this.paymentGatewayAccountName = paymentGatewayAccountName;
    return this;
  }

   /**
   * The reference name provided to the stored Payment Gateway Account as set in &#x60;PUT /PaymentGatewayAccounts/{name}&#x60;.  **Please note**, if you provide us with both this parameter and the raw credentials in the &#x60;paymentGatewayAccount&#x60; object, this parameter will be ignored and the raw credentials will take precedence.
   * @return paymentGatewayAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference name provided to the stored Payment Gateway Account as set in `PUT /PaymentGatewayAccounts/{name}`.  **Please note**, if you provide us with both this parameter and the raw credentials in the `paymentGatewayAccount` object, this parameter will be ignored and the raw credentials will take precedence.")

  public String getPaymentGatewayAccountName() {
    return paymentGatewayAccountName;
  }


  public void setPaymentGatewayAccountName(String paymentGatewayAccountName) {
    
    
    
    this.paymentGatewayAccountName = paymentGatewayAccountName;
  }


  public PayToolsApiModelsCaptureVoidRequestModel certificateName(String certificateName) {
    
    
    
    
    this.certificateName = certificateName;
    return this;
  }

   /**
   * Optional parameter if the payment gateway requires authentication using a client certificate. The name of the certificate that was stored in our system via our &lt;a href&#x3D;\&quot;https://portal.epaytools.com\&quot; target&#x3D;\&quot;_blank\&quot;&gt;users portal&lt;/a&gt;
   * @return certificateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional parameter if the payment gateway requires authentication using a client certificate. The name of the certificate that was stored in our system via our <a href=\"https://portal.epaytools.com\" target=\"_blank\">users portal</a>")

  public String getCertificateName() {
    return certificateName;
  }


  public void setCertificateName(String certificateName) {
    
    
    
    this.certificateName = certificateName;
  }


  public PayToolsApiModelsCaptureVoidRequestModel paymentGatewayAccount(PayToolsApiModelsPaymentGatewayAccount paymentGatewayAccount) {
    
    
    
    
    this.paymentGatewayAccount = paymentGatewayAccount;
    return this;
  }

   /**
   * Get paymentGatewayAccount
   * @return paymentGatewayAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayToolsApiModelsPaymentGatewayAccount getPaymentGatewayAccount() {
    return paymentGatewayAccount;
  }


  public void setPaymentGatewayAccount(PayToolsApiModelsPaymentGatewayAccount paymentGatewayAccount) {
    
    
    
    this.paymentGatewayAccount = paymentGatewayAccount;
  }


  public PayToolsApiModelsCaptureVoidRequestModel networkTokenBrand(PaymentsNetworkTokenSchemes networkTokenBrand) {
    
    
    
    
    this.networkTokenBrand = networkTokenBrand;
    return this;
  }

   /**
   * Get networkTokenBrand
   * @return networkTokenBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsNetworkTokenSchemes getNetworkTokenBrand() {
    return networkTokenBrand;
  }


  public void setNetworkTokenBrand(PaymentsNetworkTokenSchemes networkTokenBrand) {
    
    
    
    this.networkTokenBrand = networkTokenBrand;
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
   * @return the PayToolsApiModelsCaptureVoidRequestModel instance itself
   */
  public PayToolsApiModelsCaptureVoidRequestModel putAdditionalProperty(String key, Object value) {
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
    PayToolsApiModelsCaptureVoidRequestModel payToolsApiModelsCaptureVoidRequestModel = (PayToolsApiModelsCaptureVoidRequestModel) o;
    return Objects.equals(this.currency, payToolsApiModelsCaptureVoidRequestModel.currency) &&
        Objects.equals(this.refTransId, payToolsApiModelsCaptureVoidRequestModel.refTransId) &&
        Objects.equals(this.card, payToolsApiModelsCaptureVoidRequestModel.card) &&
        Objects.equals(this.amount, payToolsApiModelsCaptureVoidRequestModel.amount) &&
        Objects.equals(this.myRef, payToolsApiModelsCaptureVoidRequestModel.myRef) &&
        Objects.equals(this.paymentGatewayAccountName, payToolsApiModelsCaptureVoidRequestModel.paymentGatewayAccountName) &&
        Objects.equals(this.certificateName, payToolsApiModelsCaptureVoidRequestModel.certificateName) &&
        Objects.equals(this.paymentGatewayAccount, payToolsApiModelsCaptureVoidRequestModel.paymentGatewayAccount) &&
        Objects.equals(this.networkTokenBrand, payToolsApiModelsCaptureVoidRequestModel.networkTokenBrand)&&
        Objects.equals(this.additionalProperties, payToolsApiModelsCaptureVoidRequestModel.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, refTransId, card, amount, myRef, paymentGatewayAccountName, certificateName, paymentGatewayAccount, networkTokenBrand, additionalProperties);
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
    sb.append("class PayToolsApiModelsCaptureVoidRequestModel {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    refTransId: ").append(toIndentedString(refTransId)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    myRef: ").append(toIndentedString(myRef)).append("\n");
    sb.append("    paymentGatewayAccountName: ").append(toIndentedString(paymentGatewayAccountName)).append("\n");
    sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
    sb.append("    paymentGatewayAccount: ").append(toIndentedString(paymentGatewayAccount)).append("\n");
    sb.append("    networkTokenBrand: ").append(toIndentedString(networkTokenBrand)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("refTransId");
    openapiFields.add("card");
    openapiFields.add("amount");
    openapiFields.add("myRef");
    openapiFields.add("paymentGatewayAccountName");
    openapiFields.add("certificateName");
    openapiFields.add("paymentGatewayAccount");
    openapiFields.add("networkTokenBrand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("refTransId");
    openapiRequiredFields.add("card");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayToolsApiModelsCaptureVoidRequestModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayToolsApiModelsCaptureVoidRequestModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayToolsApiModelsCaptureVoidRequestModel is not found in the empty JSON string", PayToolsApiModelsCaptureVoidRequestModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayToolsApiModelsCaptureVoidRequestModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("refTransId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refTransId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refTransId").toString()));
      }
      // validate the required field `card`
      PayToolsApiModelsCardInputModel.validateJsonObject(jsonObj.getAsJsonObject("card"));
      if (!jsonObj.get("myRef").isJsonNull() && (jsonObj.get("myRef") != null && !jsonObj.get("myRef").isJsonNull()) && !jsonObj.get("myRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `myRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("myRef").toString()));
      }
      if (!jsonObj.get("paymentGatewayAccountName").isJsonNull() && (jsonObj.get("paymentGatewayAccountName") != null && !jsonObj.get("paymentGatewayAccountName").isJsonNull()) && !jsonObj.get("paymentGatewayAccountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentGatewayAccountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentGatewayAccountName").toString()));
      }
      if (!jsonObj.get("certificateName").isJsonNull() && (jsonObj.get("certificateName") != null && !jsonObj.get("certificateName").isJsonNull()) && !jsonObj.get("certificateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificateName").toString()));
      }
      // validate the optional field `paymentGatewayAccount`
      if (jsonObj.get("paymentGatewayAccount") != null && !jsonObj.get("paymentGatewayAccount").isJsonNull()) {
        PayToolsApiModelsPaymentGatewayAccount.validateJsonObject(jsonObj.getAsJsonObject("paymentGatewayAccount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayToolsApiModelsCaptureVoidRequestModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayToolsApiModelsCaptureVoidRequestModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayToolsApiModelsCaptureVoidRequestModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayToolsApiModelsCaptureVoidRequestModel.class));

       return (TypeAdapter<T>) new TypeAdapter<PayToolsApiModelsCaptureVoidRequestModel>() {
           @Override
           public void write(JsonWriter out, PayToolsApiModelsCaptureVoidRequestModel value) throws IOException {
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
           public PayToolsApiModelsCaptureVoidRequestModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayToolsApiModelsCaptureVoidRequestModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayToolsApiModelsCaptureVoidRequestModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayToolsApiModelsCaptureVoidRequestModel
  * @throws IOException if the JSON string is invalid with respect to PayToolsApiModelsCaptureVoidRequestModel
  */
  public static PayToolsApiModelsCaptureVoidRequestModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayToolsApiModelsCaptureVoidRequestModel.class);
  }

 /**
  * Convert an instance of PayToolsApiModelsCaptureVoidRequestModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

