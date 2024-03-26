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
import com.konfigthis.client.model.PayToolsBlAuthenticationThreeDsSessionModel;
import com.konfigthis.client.model.PayToolsBlAuthenticationTokenizationAction;
import com.konfigthis.client.model.PayToolsSharedEnumsPerform3ds;
import com.konfigthis.client.model.PciBookingIINLookupLibraryRiskLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Model for initial request for a Card operation session
 */
@ApiModel(description = "Model for initial request for a Card operation session")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayToolsBlAuthenticationPreSignedDataModel {
  public static final String SERIALIZED_NAME_THREE_DS_SESSION_MODEL = "threeDsSessionModel";
  @SerializedName(SERIALIZED_NAME_THREE_DS_SESSION_MODEL)
  private PayToolsBlAuthenticationThreeDsSessionModel threeDsSessionModel;

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

  public PayToolsBlAuthenticationPreSignedDataModel() {
  }

  public PayToolsBlAuthenticationPreSignedDataModel threeDsSessionModel(PayToolsBlAuthenticationThreeDsSessionModel threeDsSessionModel) {
    
    
    
    
    this.threeDsSessionModel = threeDsSessionModel;
    return this;
  }

   /**
   * Get threeDsSessionModel
   * @return threeDsSessionModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayToolsBlAuthenticationThreeDsSessionModel getThreeDsSessionModel() {
    return threeDsSessionModel;
  }


  public void setThreeDsSessionModel(PayToolsBlAuthenticationThreeDsSessionModel threeDsSessionModel) {
    
    
    
    this.threeDsSessionModel = threeDsSessionModel;
  }


  public PayToolsBlAuthenticationPreSignedDataModel vld(PciBookingIINLookupLibraryRiskLevel vld) {
    
    
    
    
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


  public PayToolsBlAuthenticationPreSignedDataModel _3ds(PayToolsSharedEnumsPerform3ds _3ds) {
    
    
    
    
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


  public PayToolsBlAuthenticationPreSignedDataModel crg(Boolean crg) {
    
    
    
    
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


  public PayToolsBlAuthenticationPreSignedDataModel tkn(PayToolsBlAuthenticationTokenizationAction tkn) {
    
    
    
    
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


  public PayToolsBlAuthenticationPreSignedDataModel crgD(PayToolsBlAuthenticationChargePresetData crgD) {
    
    
    
    
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
   * @return the PayToolsBlAuthenticationPreSignedDataModel instance itself
   */
  public PayToolsBlAuthenticationPreSignedDataModel putAdditionalProperty(String key, Object value) {
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
    PayToolsBlAuthenticationPreSignedDataModel payToolsBlAuthenticationPreSignedDataModel = (PayToolsBlAuthenticationPreSignedDataModel) o;
    return Objects.equals(this.threeDsSessionModel, payToolsBlAuthenticationPreSignedDataModel.threeDsSessionModel) &&
        Objects.equals(this.vld, payToolsBlAuthenticationPreSignedDataModel.vld) &&
        Objects.equals(this._3ds, payToolsBlAuthenticationPreSignedDataModel._3ds) &&
        Objects.equals(this.crg, payToolsBlAuthenticationPreSignedDataModel.crg) &&
        Objects.equals(this.tkn, payToolsBlAuthenticationPreSignedDataModel.tkn) &&
        Objects.equals(this.crgD, payToolsBlAuthenticationPreSignedDataModel.crgD)&&
        Objects.equals(this.additionalProperties, payToolsBlAuthenticationPreSignedDataModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDsSessionModel, vld, _3ds, crg, tkn, crgD, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayToolsBlAuthenticationPreSignedDataModel {\n");
    sb.append("    threeDsSessionModel: ").append(toIndentedString(threeDsSessionModel)).append("\n");
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
    openapiFields.add("threeDsSessionModel");
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
  * @throws IOException if the JSON Object is invalid with respect to PayToolsBlAuthenticationPreSignedDataModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayToolsBlAuthenticationPreSignedDataModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayToolsBlAuthenticationPreSignedDataModel is not found in the empty JSON string", PayToolsBlAuthenticationPreSignedDataModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `threeDsSessionModel`
      if (jsonObj.get("threeDsSessionModel") != null && !jsonObj.get("threeDsSessionModel").isJsonNull()) {
        PayToolsBlAuthenticationThreeDsSessionModel.validateJsonObject(jsonObj.getAsJsonObject("threeDsSessionModel"));
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
       if (!PayToolsBlAuthenticationPreSignedDataModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayToolsBlAuthenticationPreSignedDataModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayToolsBlAuthenticationPreSignedDataModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayToolsBlAuthenticationPreSignedDataModel.class));

       return (TypeAdapter<T>) new TypeAdapter<PayToolsBlAuthenticationPreSignedDataModel>() {
           @Override
           public void write(JsonWriter out, PayToolsBlAuthenticationPreSignedDataModel value) throws IOException {
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
           public PayToolsBlAuthenticationPreSignedDataModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayToolsBlAuthenticationPreSignedDataModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayToolsBlAuthenticationPreSignedDataModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayToolsBlAuthenticationPreSignedDataModel
  * @throws IOException if the JSON string is invalid with respect to PayToolsBlAuthenticationPreSignedDataModel
  */
  public static PayToolsBlAuthenticationPreSignedDataModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayToolsBlAuthenticationPreSignedDataModel.class);
  }

 /**
  * Convert an instance of PayToolsBlAuthenticationPreSignedDataModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

