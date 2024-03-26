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
 * ConnexPay Transaction.
 */
@ApiModel(description = "ConnexPay Transaction.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TransactionCaptureAuthorizationRequestConnexPayTransaction {
  public static final String SERIALIZED_NAME_EXPECTED_PAYMENTS = "ExpectedPayments";
  @SerializedName(SERIALIZED_NAME_EXPECTED_PAYMENTS)
  private Integer expectedPayments;

  public TransactionCaptureAuthorizationRequestConnexPayTransaction() {
  }

  public TransactionCaptureAuthorizationRequestConnexPayTransaction expectedPayments(Integer expectedPayments) {
    
    
    
    
    this.expectedPayments = expectedPayments;
    return this;
  }

   /**
   * This is the number of outbound payments that will be made to suppliers. If paying a single supplier the value is 1, if paying two suppliers the value is 2, etc.
   * @return expectedPayments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This is the number of outbound payments that will be made to suppliers. If paying a single supplier the value is 1, if paying two suppliers the value is 2, etc.")

  public Integer getExpectedPayments() {
    return expectedPayments;
  }


  public void setExpectedPayments(Integer expectedPayments) {
    
    
    
    this.expectedPayments = expectedPayments;
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
   * @return the TransactionCaptureAuthorizationRequestConnexPayTransaction instance itself
   */
  public TransactionCaptureAuthorizationRequestConnexPayTransaction putAdditionalProperty(String key, Object value) {
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
    TransactionCaptureAuthorizationRequestConnexPayTransaction transactionCaptureAuthorizationRequestConnexPayTransaction = (TransactionCaptureAuthorizationRequestConnexPayTransaction) o;
    return Objects.equals(this.expectedPayments, transactionCaptureAuthorizationRequestConnexPayTransaction.expectedPayments)&&
        Objects.equals(this.additionalProperties, transactionCaptureAuthorizationRequestConnexPayTransaction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedPayments, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCaptureAuthorizationRequestConnexPayTransaction {\n");
    sb.append("    expectedPayments: ").append(toIndentedString(expectedPayments)).append("\n");
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
    openapiFields.add("ExpectedPayments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ExpectedPayments");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionCaptureAuthorizationRequestConnexPayTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionCaptureAuthorizationRequestConnexPayTransaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionCaptureAuthorizationRequestConnexPayTransaction is not found in the empty JSON string", TransactionCaptureAuthorizationRequestConnexPayTransaction.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionCaptureAuthorizationRequestConnexPayTransaction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionCaptureAuthorizationRequestConnexPayTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionCaptureAuthorizationRequestConnexPayTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionCaptureAuthorizationRequestConnexPayTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionCaptureAuthorizationRequestConnexPayTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionCaptureAuthorizationRequestConnexPayTransaction>() {
           @Override
           public void write(JsonWriter out, TransactionCaptureAuthorizationRequestConnexPayTransaction value) throws IOException {
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
           public TransactionCaptureAuthorizationRequestConnexPayTransaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransactionCaptureAuthorizationRequestConnexPayTransaction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionCaptureAuthorizationRequestConnexPayTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionCaptureAuthorizationRequestConnexPayTransaction
  * @throws IOException if the JSON string is invalid with respect to TransactionCaptureAuthorizationRequestConnexPayTransaction
  */
  public static TransactionCaptureAuthorizationRequestConnexPayTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionCaptureAuthorizationRequestConnexPayTransaction.class);
  }

 /**
  * Convert an instance of TransactionCaptureAuthorizationRequestConnexPayTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

