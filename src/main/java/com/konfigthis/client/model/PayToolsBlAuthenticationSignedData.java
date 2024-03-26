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
import com.konfigthis.client.model.PayToolsBlAuthenticationChargePresetData;
import com.konfigthis.client.model.PayToolsBlAuthenticationThreeDsPresetData;
import com.konfigthis.client.model.PayToolsBlAuthenticationTokenizationAction;
import com.konfigthis.client.model.PayToolsSharedEnumsPerform3ds;
import com.konfigthis.client.model.PaymentsChargeRequest;
import com.konfigthis.client.model.PaymentsOperationResult;
import com.konfigthis.client.model.PciBookingIINLookupLibraryCardValidationRequest;
import com.konfigthis.client.model.PciBookingIINLookupLibraryCardValidationResult;
import com.konfigthis.client.model.PciBookingIINLookupLibraryRiskLevel;
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
 * Class to represent signed data
 */
@ApiModel(description = "Class to represent signed data")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayToolsBlAuthenticationSignedData {
  public static final String SERIALIZED_NAME_VLD_RQ = "vld_rq";
  @SerializedName(SERIALIZED_NAME_VLD_RQ)
  private PciBookingIINLookupLibraryCardValidationRequest vldRq;

  public static final String SERIALIZED_NAME_VLD_RS = "vld_rs";
  @SerializedName(SERIALIZED_NAME_VLD_RS)
  private PciBookingIINLookupLibraryCardValidationResult vldRs;

  public static final String SERIALIZED_NAME_CRG_RQ = "crg_rq";
  @SerializedName(SERIALIZED_NAME_CRG_RQ)
  private PaymentsChargeRequest crgRq;

  public static final String SERIALIZED_NAME_CRG_RS = "crg_rs";
  @SerializedName(SERIALIZED_NAME_CRG_RS)
  private PaymentsOperationResult crgRs;

  public static final String SERIALIZED_NAME_TKN_RS = "tkn_rs";
  @SerializedName(SERIALIZED_NAME_TKN_RS)
  private String tknRs;

  public static final String SERIALIZED_NAME_3DS_D = "3ds_d";
  @SerializedName(SERIALIZED_NAME_3DS_D)
  private PayToolsBlAuthenticationThreeDsPresetData _3dsD;

  public static final String SERIALIZED_NAME_VLD = "vld";
  @SerializedName(SERIALIZED_NAME_VLD)
  private PciBookingIINLookupLibraryRiskLevel vld;

  public static final String SERIALIZED_NAME_3DS = "3ds";
  @SerializedName(SERIALIZED_NAME_3DS)
  private PayToolsSharedEnumsPerform3ds _3ds;

  public static final String SERIALIZED_NAME_CRG = "crg";
  @SerializedName(SERIALIZED_NAME_CRG)
  private Boolean crg;

  public static final String SERIALIZED_NAME_TKN = "tkn";
  @SerializedName(SERIALIZED_NAME_TKN)
  private PayToolsBlAuthenticationTokenizationAction tkn;

  public static final String SERIALIZED_NAME_CRG_D = "crg_d";
  @SerializedName(SERIALIZED_NAME_CRG_D)
  private PayToolsBlAuthenticationChargePresetData crgD;

  public PayToolsBlAuthenticationSignedData() {
  }

  public PayToolsBlAuthenticationSignedData vldRq(PciBookingIINLookupLibraryCardValidationRequest vldRq) {
    
    
    
    
    this.vldRq = vldRq;
    return this;
  }

   /**
   * Get vldRq
   * @return vldRq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PciBookingIINLookupLibraryCardValidationRequest getVldRq() {
    return vldRq;
  }


  public void setVldRq(PciBookingIINLookupLibraryCardValidationRequest vldRq) {
    
    
    
    this.vldRq = vldRq;
  }


  public PayToolsBlAuthenticationSignedData vldRs(PciBookingIINLookupLibraryCardValidationResult vldRs) {
    
    
    
    
    this.vldRs = vldRs;
    return this;
  }

   /**
   * Get vldRs
   * @return vldRs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PciBookingIINLookupLibraryCardValidationResult getVldRs() {
    return vldRs;
  }


  public void setVldRs(PciBookingIINLookupLibraryCardValidationResult vldRs) {
    
    
    
    this.vldRs = vldRs;
  }


  public PayToolsBlAuthenticationSignedData crgRq(PaymentsChargeRequest crgRq) {
    
    
    
    
    this.crgRq = crgRq;
    return this;
  }

   /**
   * Get crgRq
   * @return crgRq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsChargeRequest getCrgRq() {
    return crgRq;
  }


  public void setCrgRq(PaymentsChargeRequest crgRq) {
    
    
    
    this.crgRq = crgRq;
  }


  public PayToolsBlAuthenticationSignedData crgRs(PaymentsOperationResult crgRs) {
    
    
    
    
    this.crgRs = crgRs;
    return this;
  }

   /**
   * Get crgRs
   * @return crgRs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentsOperationResult getCrgRs() {
    return crgRs;
  }


  public void setCrgRs(PaymentsOperationResult crgRs) {
    
    
    
    this.crgRs = crgRs;
  }


  public PayToolsBlAuthenticationSignedData tknRs(String tknRs) {
    
    
    
    
    this.tknRs = tknRs;
    return this;
  }

   /**
   * Result from tokenization
   * @return tknRs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result from tokenization")

  public String getTknRs() {
    return tknRs;
  }


  public void setTknRs(String tknRs) {
    
    
    
    this.tknRs = tknRs;
  }


  public PayToolsBlAuthenticationSignedData _3dsD(PayToolsBlAuthenticationThreeDsPresetData _3dsD) {
    
    
    
    
    this._3dsD = _3dsD;
    return this;
  }

   /**
   * Get _3dsD
   * @return _3dsD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayToolsBlAuthenticationThreeDsPresetData get3dsD() {
    return _3dsD;
  }


  public void set3dsD(PayToolsBlAuthenticationThreeDsPresetData _3dsD) {
    
    
    
    this._3dsD = _3dsD;
  }


  public PayToolsBlAuthenticationSignedData vld(PciBookingIINLookupLibraryRiskLevel vld) {
    
    
    
    
    this.vld = vld;
    return this;
  }

   /**
   * Get vld
   * @return vld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PciBookingIINLookupLibraryRiskLevel getVld() {
    return vld;
  }


  public void setVld(PciBookingIINLookupLibraryRiskLevel vld) {
    
    
    
    this.vld = vld;
  }


  public PayToolsBlAuthenticationSignedData _3ds(PayToolsSharedEnumsPerform3ds _3ds) {
    
    
    
    
    this._3ds = _3ds;
    return this;
  }

   /**
   * Get _3ds
   * @return _3ds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayToolsSharedEnumsPerform3ds get3ds() {
    return _3ds;
  }


  public void set3ds(PayToolsSharedEnumsPerform3ds _3ds) {
    
    
    
    this._3ds = _3ds;
  }


  public PayToolsBlAuthenticationSignedData crg(Boolean crg) {
    
    
    
    
    this.crg = crg;
    return this;
  }

   /**
   * Is Card charge required for this session
   * @return crg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is Card charge required for this session")

  public Boolean getCrg() {
    return crg;
  }


  public void setCrg(Boolean crg) {
    
    
    
    this.crg = crg;
  }


  public PayToolsBlAuthenticationSignedData tkn(PayToolsBlAuthenticationTokenizationAction tkn) {
    
    
    
    
    this.tkn = tkn;
    return this;
  }

   /**
   * Get tkn
   * @return tkn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayToolsBlAuthenticationTokenizationAction getTkn() {
    return tkn;
  }


  public void setTkn(PayToolsBlAuthenticationTokenizationAction tkn) {
    
    
    
    this.tkn = tkn;
  }


  public PayToolsBlAuthenticationSignedData crgD(PayToolsBlAuthenticationChargePresetData crgD) {
    
    
    
    
    this.crgD = crgD;
    return this;
  }

   /**
   * Get crgD
   * @return crgD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayToolsBlAuthenticationChargePresetData getCrgD() {
    return crgD;
  }


  public void setCrgD(PayToolsBlAuthenticationChargePresetData crgD) {
    
    
    
    this.crgD = crgD;
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
   * @return the PayToolsBlAuthenticationSignedData instance itself
   */
  public PayToolsBlAuthenticationSignedData putAdditionalProperty(String key, Object value) {
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
    PayToolsBlAuthenticationSignedData payToolsBlAuthenticationSignedData = (PayToolsBlAuthenticationSignedData) o;
    return Objects.equals(this.vldRq, payToolsBlAuthenticationSignedData.vldRq) &&
        Objects.equals(this.vldRs, payToolsBlAuthenticationSignedData.vldRs) &&
        Objects.equals(this.crgRq, payToolsBlAuthenticationSignedData.crgRq) &&
        Objects.equals(this.crgRs, payToolsBlAuthenticationSignedData.crgRs) &&
        Objects.equals(this.tknRs, payToolsBlAuthenticationSignedData.tknRs) &&
        Objects.equals(this._3dsD, payToolsBlAuthenticationSignedData._3dsD) &&
        Objects.equals(this.vld, payToolsBlAuthenticationSignedData.vld) &&
        Objects.equals(this._3ds, payToolsBlAuthenticationSignedData._3ds) &&
        Objects.equals(this.crg, payToolsBlAuthenticationSignedData.crg) &&
        Objects.equals(this.tkn, payToolsBlAuthenticationSignedData.tkn) &&
        Objects.equals(this.crgD, payToolsBlAuthenticationSignedData.crgD)&&
        Objects.equals(this.additionalProperties, payToolsBlAuthenticationSignedData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vldRq, vldRs, crgRq, crgRs, tknRs, _3dsD, vld, _3ds, crg, tkn, crgD, additionalProperties);
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
    sb.append("class PayToolsBlAuthenticationSignedData {\n");
    sb.append("    vldRq: ").append(toIndentedString(vldRq)).append("\n");
    sb.append("    vldRs: ").append(toIndentedString(vldRs)).append("\n");
    sb.append("    crgRq: ").append(toIndentedString(crgRq)).append("\n");
    sb.append("    crgRs: ").append(toIndentedString(crgRs)).append("\n");
    sb.append("    tknRs: ").append(toIndentedString(tknRs)).append("\n");
    sb.append("    _3dsD: ").append(toIndentedString(_3dsD)).append("\n");
    sb.append("    vld: ").append(toIndentedString(vld)).append("\n");
    sb.append("    _3ds: ").append(toIndentedString(_3ds)).append("\n");
    sb.append("    crg: ").append(toIndentedString(crg)).append("\n");
    sb.append("    tkn: ").append(toIndentedString(tkn)).append("\n");
    sb.append("    crgD: ").append(toIndentedString(crgD)).append("\n");
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
    openapiFields.add("vld_rq");
    openapiFields.add("vld_rs");
    openapiFields.add("crg_rq");
    openapiFields.add("crg_rs");
    openapiFields.add("tkn_rs");
    openapiFields.add("3ds_d");
    openapiFields.add("vld");
    openapiFields.add("3ds");
    openapiFields.add("crg");
    openapiFields.add("tkn");
    openapiFields.add("crg_d");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayToolsBlAuthenticationSignedData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayToolsBlAuthenticationSignedData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayToolsBlAuthenticationSignedData is not found in the empty JSON string", PayToolsBlAuthenticationSignedData.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `vld_rq`
      if (jsonObj.get("vld_rq") != null && !jsonObj.get("vld_rq").isJsonNull()) {
        PciBookingIINLookupLibraryCardValidationRequest.validateJsonObject(jsonObj.getAsJsonObject("vld_rq"));
      }
      // validate the optional field `vld_rs`
      if (jsonObj.get("vld_rs") != null && !jsonObj.get("vld_rs").isJsonNull()) {
        PciBookingIINLookupLibraryCardValidationResult.validateJsonObject(jsonObj.getAsJsonObject("vld_rs"));
      }
      // validate the optional field `crg_rq`
      if (jsonObj.get("crg_rq") != null && !jsonObj.get("crg_rq").isJsonNull()) {
        PaymentsChargeRequest.validateJsonObject(jsonObj.getAsJsonObject("crg_rq"));
      }
      // validate the optional field `crg_rs`
      if (jsonObj.get("crg_rs") != null && !jsonObj.get("crg_rs").isJsonNull()) {
        PaymentsOperationResult.validateJsonObject(jsonObj.getAsJsonObject("crg_rs"));
      }
      if (!jsonObj.get("tkn_rs").isJsonNull() && (jsonObj.get("tkn_rs") != null && !jsonObj.get("tkn_rs").isJsonNull()) && !jsonObj.get("tkn_rs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tkn_rs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tkn_rs").toString()));
      }
      // validate the optional field `3ds_d`
      if (jsonObj.get("3ds_d") != null && !jsonObj.get("3ds_d").isJsonNull()) {
        PayToolsBlAuthenticationThreeDsPresetData.validateJsonObject(jsonObj.getAsJsonObject("3ds_d"));
      }
      // validate the optional field `crg_d`
      if (jsonObj.get("crg_d") != null && !jsonObj.get("crg_d").isJsonNull()) {
        PayToolsBlAuthenticationChargePresetData.validateJsonObject(jsonObj.getAsJsonObject("crg_d"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayToolsBlAuthenticationSignedData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayToolsBlAuthenticationSignedData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayToolsBlAuthenticationSignedData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayToolsBlAuthenticationSignedData.class));

       return (TypeAdapter<T>) new TypeAdapter<PayToolsBlAuthenticationSignedData>() {
           @Override
           public void write(JsonWriter out, PayToolsBlAuthenticationSignedData value) throws IOException {
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
           public PayToolsBlAuthenticationSignedData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayToolsBlAuthenticationSignedData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayToolsBlAuthenticationSignedData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayToolsBlAuthenticationSignedData
  * @throws IOException if the JSON string is invalid with respect to PayToolsBlAuthenticationSignedData
  */
  public static PayToolsBlAuthenticationSignedData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayToolsBlAuthenticationSignedData.class);
  }

 /**
  * Convert an instance of PayToolsBlAuthenticationSignedData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

