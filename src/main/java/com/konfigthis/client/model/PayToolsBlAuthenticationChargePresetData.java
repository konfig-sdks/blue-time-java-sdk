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
import com.konfigthis.client.model.PayToolsSharedModelsMoneyModel;
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
 * Data to be used in Charge request
 */
@ApiModel(description = "Data to be used in Charge request")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayToolsBlAuthenticationChargePresetData {
  public static final String SERIALIZED_NAME_DSC = "dsc";
  @SerializedName(SERIALIZED_NAME_DSC)
  private String dsc;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_DIG = "dig";
  @SerializedName(SERIALIZED_NAME_DIG)
  private Boolean dig;

  public static final String SERIALIZED_NAME_AMT = "amt";
  @SerializedName(SERIALIZED_NAME_AMT)
  private PayToolsSharedModelsMoneyModel amt;

  public static final String SERIALIZED_NAME_UAN = "uan";
  @SerializedName(SERIALIZED_NAME_UAN)
  private String uan;

  public static final String SERIALIZED_NAME_UCC = "ucc";
  @SerializedName(SERIALIZED_NAME_UCC)
  private String ucc;

  public PayToolsBlAuthenticationChargePresetData() {
  }

  public PayToolsBlAuthenticationChargePresetData dsc(String dsc) {
    
    
    
    
    this.dsc = dsc;
    return this;
  }

   /**
   * Order description
   * @return dsc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order description")

  public String getDsc() {
    return dsc;
  }


  public void setDsc(String dsc) {
    
    
    
    this.dsc = dsc;
  }


  public PayToolsBlAuthenticationChargePresetData ref(String ref) {
    
    
    
    
    this.ref = ref;
    return this;
  }

   /**
   * Creator reference
   * @return ref
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creator reference")

  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    
    
    
    this.ref = ref;
  }


  public PayToolsBlAuthenticationChargePresetData dig(Boolean dig) {
    
    
    
    
    this.dig = dig;
    return this;
  }

   /**
   * Is it digital goods
   * @return dig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is it digital goods")

  public Boolean getDig() {
    return dig;
  }


  public void setDig(Boolean dig) {
    
    
    
    this.dig = dig;
  }


  public PayToolsBlAuthenticationChargePresetData amt(PayToolsSharedModelsMoneyModel amt) {
    
    
    
    
    this.amt = amt;
    return this;
  }

   /**
   * Get amt
   * @return amt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayToolsSharedModelsMoneyModel getAmt() {
    return amt;
  }


  public void setAmt(PayToolsSharedModelsMoneyModel amt) {
    
    
    
    this.amt = amt;
  }


  public PayToolsBlAuthenticationChargePresetData uan(String uan) {
    
    
    
    
    this.uan = uan;
    return this;
  }

   /**
   * The Upg Account name
   * @return uan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Upg Account name")

  public String getUan() {
    return uan;
  }


  public void setUan(String uan) {
    
    
    
    this.uan = uan;
  }


  public PayToolsBlAuthenticationChargePresetData ucc(String ucc) {
    
    
    
    
    this.ucc = ucc;
    return this;
  }

   /**
   * The Upg Client Certificate name
   * @return ucc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Upg Client Certificate name")

  public String getUcc() {
    return ucc;
  }


  public void setUcc(String ucc) {
    
    
    
    this.ucc = ucc;
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
   * @return the PayToolsBlAuthenticationChargePresetData instance itself
   */
  public PayToolsBlAuthenticationChargePresetData putAdditionalProperty(String key, Object value) {
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
    PayToolsBlAuthenticationChargePresetData payToolsBlAuthenticationChargePresetData = (PayToolsBlAuthenticationChargePresetData) o;
    return Objects.equals(this.dsc, payToolsBlAuthenticationChargePresetData.dsc) &&
        Objects.equals(this.ref, payToolsBlAuthenticationChargePresetData.ref) &&
        Objects.equals(this.dig, payToolsBlAuthenticationChargePresetData.dig) &&
        Objects.equals(this.amt, payToolsBlAuthenticationChargePresetData.amt) &&
        Objects.equals(this.uan, payToolsBlAuthenticationChargePresetData.uan) &&
        Objects.equals(this.ucc, payToolsBlAuthenticationChargePresetData.ucc)&&
        Objects.equals(this.additionalProperties, payToolsBlAuthenticationChargePresetData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dsc, ref, dig, amt, uan, ucc, additionalProperties);
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
    sb.append("class PayToolsBlAuthenticationChargePresetData {\n");
    sb.append("    dsc: ").append(toIndentedString(dsc)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    dig: ").append(toIndentedString(dig)).append("\n");
    sb.append("    amt: ").append(toIndentedString(amt)).append("\n");
    sb.append("    uan: ").append(toIndentedString(uan)).append("\n");
    sb.append("    ucc: ").append(toIndentedString(ucc)).append("\n");
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
    openapiFields.add("dsc");
    openapiFields.add("ref");
    openapiFields.add("dig");
    openapiFields.add("amt");
    openapiFields.add("uan");
    openapiFields.add("ucc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayToolsBlAuthenticationChargePresetData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayToolsBlAuthenticationChargePresetData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayToolsBlAuthenticationChargePresetData is not found in the empty JSON string", PayToolsBlAuthenticationChargePresetData.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("dsc").isJsonNull() && (jsonObj.get("dsc") != null && !jsonObj.get("dsc").isJsonNull()) && !jsonObj.get("dsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dsc").toString()));
      }
      if (!jsonObj.get("ref").isJsonNull() && (jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      // validate the optional field `amt`
      if (jsonObj.get("amt") != null && !jsonObj.get("amt").isJsonNull()) {
        PayToolsSharedModelsMoneyModel.validateJsonObject(jsonObj.getAsJsonObject("amt"));
      }
      if (!jsonObj.get("uan").isJsonNull() && (jsonObj.get("uan") != null && !jsonObj.get("uan").isJsonNull()) && !jsonObj.get("uan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uan").toString()));
      }
      if (!jsonObj.get("ucc").isJsonNull() && (jsonObj.get("ucc") != null && !jsonObj.get("ucc").isJsonNull()) && !jsonObj.get("ucc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ucc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ucc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayToolsBlAuthenticationChargePresetData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayToolsBlAuthenticationChargePresetData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayToolsBlAuthenticationChargePresetData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayToolsBlAuthenticationChargePresetData.class));

       return (TypeAdapter<T>) new TypeAdapter<PayToolsBlAuthenticationChargePresetData>() {
           @Override
           public void write(JsonWriter out, PayToolsBlAuthenticationChargePresetData value) throws IOException {
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
           public PayToolsBlAuthenticationChargePresetData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayToolsBlAuthenticationChargePresetData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayToolsBlAuthenticationChargePresetData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayToolsBlAuthenticationChargePresetData
  * @throws IOException if the JSON string is invalid with respect to PayToolsBlAuthenticationChargePresetData
  */
  public static PayToolsBlAuthenticationChargePresetData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayToolsBlAuthenticationChargePresetData.class);
  }

 /**
  * Convert an instance of PayToolsBlAuthenticationChargePresetData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

