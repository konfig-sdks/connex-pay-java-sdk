/*
 * ConnexPay Reporting API
 * REST API for retrieving reporting data. Currently Daily Accounting data only.
 *
 * The version of the OpenAPI document: v1
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
 * SaleCreateTransaction201ResponseConnexPayTransaction
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SaleCreateTransaction201ResponseConnexPayTransaction {
  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_EXPECTED_PAYMENTS = "expectedPayments";
  @SerializedName(SERIALIZED_NAME_EXPECTED_PAYMENTS)
  private Integer expectedPayments = 0;

  public static final String SERIALIZED_NAME_INCOMING_TRANS_CODE = "incomingTransCode";
  @SerializedName(SERIALIZED_NAME_INCOMING_TRANS_CODE)
  private String incomingTransCode;

  public SaleCreateTransaction201ResponseConnexPayTransaction() {
  }

  public SaleCreateTransaction201ResponseConnexPayTransaction guid(String guid) {
    
    
    
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d6c7e3c3-1cdd-47a1-89b9-368059b85c2c", value = "")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    
    
    
    this.guid = guid;
  }


  public SaleCreateTransaction201ResponseConnexPayTransaction expectedPayments(Integer expectedPayments) {
    
    
    
    
    this.expectedPayments = expectedPayments;
    return this;
  }

   /**
   * Get expectedPayments
   * @return expectedPayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getExpectedPayments() {
    return expectedPayments;
  }


  public void setExpectedPayments(Integer expectedPayments) {
    
    
    
    this.expectedPayments = expectedPayments;
  }


  public SaleCreateTransaction201ResponseConnexPayTransaction incomingTransCode(String incomingTransCode) {
    
    
    
    
    this.incomingTransCode = incomingTransCode;
    return this;
  }

   /**
   * Get incomingTransCode
   * @return incomingTransCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23D5797638192431927631987", value = "")

  public String getIncomingTransCode() {
    return incomingTransCode;
  }


  public void setIncomingTransCode(String incomingTransCode) {
    
    
    
    this.incomingTransCode = incomingTransCode;
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
   * @return the SaleCreateTransaction201ResponseConnexPayTransaction instance itself
   */
  public SaleCreateTransaction201ResponseConnexPayTransaction putAdditionalProperty(String key, Object value) {
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
    SaleCreateTransaction201ResponseConnexPayTransaction saleCreateTransaction201ResponseConnexPayTransaction = (SaleCreateTransaction201ResponseConnexPayTransaction) o;
    return Objects.equals(this.guid, saleCreateTransaction201ResponseConnexPayTransaction.guid) &&
        Objects.equals(this.expectedPayments, saleCreateTransaction201ResponseConnexPayTransaction.expectedPayments) &&
        Objects.equals(this.incomingTransCode, saleCreateTransaction201ResponseConnexPayTransaction.incomingTransCode)&&
        Objects.equals(this.additionalProperties, saleCreateTransaction201ResponseConnexPayTransaction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, expectedPayments, incomingTransCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleCreateTransaction201ResponseConnexPayTransaction {\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    expectedPayments: ").append(toIndentedString(expectedPayments)).append("\n");
    sb.append("    incomingTransCode: ").append(toIndentedString(incomingTransCode)).append("\n");
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
    openapiFields.add("guid");
    openapiFields.add("expectedPayments");
    openapiFields.add("incomingTransCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SaleCreateTransaction201ResponseConnexPayTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SaleCreateTransaction201ResponseConnexPayTransaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SaleCreateTransaction201ResponseConnexPayTransaction is not found in the empty JSON string", SaleCreateTransaction201ResponseConnexPayTransaction.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull()) && !jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if ((jsonObj.get("incomingTransCode") != null && !jsonObj.get("incomingTransCode").isJsonNull()) && !jsonObj.get("incomingTransCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `incomingTransCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("incomingTransCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SaleCreateTransaction201ResponseConnexPayTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SaleCreateTransaction201ResponseConnexPayTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SaleCreateTransaction201ResponseConnexPayTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SaleCreateTransaction201ResponseConnexPayTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<SaleCreateTransaction201ResponseConnexPayTransaction>() {
           @Override
           public void write(JsonWriter out, SaleCreateTransaction201ResponseConnexPayTransaction value) throws IOException {
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
           public SaleCreateTransaction201ResponseConnexPayTransaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SaleCreateTransaction201ResponseConnexPayTransaction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SaleCreateTransaction201ResponseConnexPayTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SaleCreateTransaction201ResponseConnexPayTransaction
  * @throws IOException if the JSON string is invalid with respect to SaleCreateTransaction201ResponseConnexPayTransaction
  */
  public static SaleCreateTransaction201ResponseConnexPayTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SaleCreateTransaction201ResponseConnexPayTransaction.class);
  }

 /**
  * Convert an instance of SaleCreateTransaction201ResponseConnexPayTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

