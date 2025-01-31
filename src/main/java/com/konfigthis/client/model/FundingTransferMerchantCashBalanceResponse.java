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
 * FundingTransferMerchantCashBalanceResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FundingTransferMerchantCashBalanceResponse {
  public static final String SERIALIZED_NAME_TRANSFERRED_FROM = "TransferredFrom";
  @SerializedName(SERIALIZED_NAME_TRANSFERRED_FROM)
  private String transferredFrom;

  public static final String SERIALIZED_NAME_TRANSFERRED_TO = "TransferredTo";
  @SerializedName(SERIALIZED_NAME_TRANSFERRED_TO)
  private String transferredTo;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount = 0;

  public FundingTransferMerchantCashBalanceResponse() {
  }

  public FundingTransferMerchantCashBalanceResponse transferredFrom(String transferredFrom) {
    
    
    
    
    this.transferredFrom = transferredFrom;
    return this;
  }

   /**
   * Get transferredFrom
   * @return transferredFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10DAD551-5FB8-456B-BC69-F6D903C93D40", value = "")

  public String getTransferredFrom() {
    return transferredFrom;
  }


  public void setTransferredFrom(String transferredFrom) {
    
    
    
    this.transferredFrom = transferredFrom;
  }


  public FundingTransferMerchantCashBalanceResponse transferredTo(String transferredTo) {
    
    
    
    
    this.transferredTo = transferredTo;
    return this;
  }

   /**
   * Get transferredTo
   * @return transferredTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EBFF36A1-E430-4998-A8C1-18840D6C8D90", value = "")

  public String getTransferredTo() {
    return transferredTo;
  }


  public void setTransferredTo(String transferredTo) {
    
    
    
    this.transferredTo = transferredTo;
  }


  public FundingTransferMerchantCashBalanceResponse amount(Integer amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    
    
    
    this.amount = amount;
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
   * @return the FundingTransferMerchantCashBalanceResponse instance itself
   */
  public FundingTransferMerchantCashBalanceResponse putAdditionalProperty(String key, Object value) {
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
    FundingTransferMerchantCashBalanceResponse fundingTransferMerchantCashBalanceResponse = (FundingTransferMerchantCashBalanceResponse) o;
    return Objects.equals(this.transferredFrom, fundingTransferMerchantCashBalanceResponse.transferredFrom) &&
        Objects.equals(this.transferredTo, fundingTransferMerchantCashBalanceResponse.transferredTo) &&
        Objects.equals(this.amount, fundingTransferMerchantCashBalanceResponse.amount)&&
        Objects.equals(this.additionalProperties, fundingTransferMerchantCashBalanceResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferredFrom, transferredTo, amount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingTransferMerchantCashBalanceResponse {\n");
    sb.append("    transferredFrom: ").append(toIndentedString(transferredFrom)).append("\n");
    sb.append("    transferredTo: ").append(toIndentedString(transferredTo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("TransferredFrom");
    openapiFields.add("TransferredTo");
    openapiFields.add("Amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FundingTransferMerchantCashBalanceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FundingTransferMerchantCashBalanceResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FundingTransferMerchantCashBalanceResponse is not found in the empty JSON string", FundingTransferMerchantCashBalanceResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("TransferredFrom") != null && !jsonObj.get("TransferredFrom").isJsonNull()) && !jsonObj.get("TransferredFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransferredFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TransferredFrom").toString()));
      }
      if ((jsonObj.get("TransferredTo") != null && !jsonObj.get("TransferredTo").isJsonNull()) && !jsonObj.get("TransferredTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TransferredTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TransferredTo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FundingTransferMerchantCashBalanceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FundingTransferMerchantCashBalanceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FundingTransferMerchantCashBalanceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FundingTransferMerchantCashBalanceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<FundingTransferMerchantCashBalanceResponse>() {
           @Override
           public void write(JsonWriter out, FundingTransferMerchantCashBalanceResponse value) throws IOException {
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
           public FundingTransferMerchantCashBalanceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FundingTransferMerchantCashBalanceResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FundingTransferMerchantCashBalanceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FundingTransferMerchantCashBalanceResponse
  * @throws IOException if the JSON string is invalid with respect to FundingTransferMerchantCashBalanceResponse
  */
  public static FundingTransferMerchantCashBalanceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FundingTransferMerchantCashBalanceResponse.class);
  }

 /**
  * Convert an instance of FundingTransferMerchantCashBalanceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

