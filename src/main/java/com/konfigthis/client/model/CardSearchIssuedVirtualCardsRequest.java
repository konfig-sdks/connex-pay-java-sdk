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
import java.time.LocalDate;

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
 * CardSearchIssuedVirtualCardsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CardSearchIssuedVirtualCardsRequest {
  public static final String SERIALIZED_NAME_MERCHANT_GUID = "MerchantGuid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_GUID)
  private String merchantGuid;

  public static final String SERIALIZED_NAME_SALE_GUID = "SaleGuid";
  @SerializedName(SERIALIZED_NAME_SALE_GUID)
  private String saleGuid;

  public static final String SERIALIZED_NAME_INCOMING_TRANSACTION_CODE = "IncomingTransactionCode";
  @SerializedName(SERIALIZED_NAME_INCOMING_TRANSACTION_CODE)
  private String incomingTransactionCode;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "OrderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_I_D = "CustomerID";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_I_D)
  private String customerID;

  public static final String SERIALIZED_NAME_TIME_STAMP_FROM = "TimeStampFrom";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP_FROM)
  private LocalDate timeStampFrom;

  public static final String SERIALIZED_NAME_TIME_STAMP_TO = "TimeStampTo";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP_TO)
  private LocalDate timeStampTo;

  public static final String SERIALIZED_NAME_ISSUED_AMOUNT_FROM = "IssuedAmountFrom";
  @SerializedName(SERIALIZED_NAME_ISSUED_AMOUNT_FROM)
  private Float issuedAmountFrom;

  public static final String SERIALIZED_NAME_ISSUED_AMOUNT_TO = "IssuedAmountTo";
  @SerializedName(SERIALIZED_NAME_ISSUED_AMOUNT_TO)
  private Float issuedAmountTo;

  public static final String SERIALIZED_NAME_OUTGOING_TRANSACTION_CODE = "OutgoingTransactionCode";
  @SerializedName(SERIALIZED_NAME_OUTGOING_TRANSACTION_CODE)
  private String outgoingTransactionCode;

  public static final String SERIALIZED_NAME_SETTLED_AMOUNT_FROM = "SettledAmountFrom";
  @SerializedName(SERIALIZED_NAME_SETTLED_AMOUNT_FROM)
  private Long settledAmountFrom;

  public static final String SERIALIZED_NAME_SETTLED_AMOUNT_TO = "SettledAmountTo";
  @SerializedName(SERIALIZED_NAME_SETTLED_AMOUNT_TO)
  private Long settledAmountTo;

  public static final String SERIALIZED_NAME_RETURNED_AMOUNT_FROM = "ReturnedAmountFrom";
  @SerializedName(SERIALIZED_NAME_RETURNED_AMOUNT_FROM)
  private Long returnedAmountFrom;

  public static final String SERIALIZED_NAME_RETURNED_AMOUNT_TO = "ReturnedAmountTo";
  @SerializedName(SERIALIZED_NAME_RETURNED_AMOUNT_TO)
  private Long returnedAmountTo;

  public CardSearchIssuedVirtualCardsRequest() {
  }

  public CardSearchIssuedVirtualCardsRequest merchantGuid(String merchantGuid) {
    
    
    
    
    this.merchantGuid = merchantGuid;
    return this;
  }

   /**
   * Your assigned Merchant GUID.
   * @return merchantGuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Your assigned Merchant GUID.")

  public String getMerchantGuid() {
    return merchantGuid;
  }


  public void setMerchantGuid(String merchantGuid) {
    
    
    
    this.merchantGuid = merchantGuid;
  }


  public CardSearchIssuedVirtualCardsRequest saleGuid(String saleGuid) {
    
    
    
    
    this.saleGuid = saleGuid;
    return this;
  }

   /**
   * Sale GUID linked to the card you are searching.
   * @return saleGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sale GUID linked to the card you are searching.")

  public String getSaleGuid() {
    return saleGuid;
  }


  public void setSaleGuid(String saleGuid) {
    
    
    
    this.saleGuid = saleGuid;
  }


  public CardSearchIssuedVirtualCardsRequest incomingTransactionCode(String incomingTransactionCode) {
    
    
    
    
    this.incomingTransactionCode = incomingTransactionCode;
    return this;
  }

   /**
   * Incoming Transaction Code linked to the card you are searching.
   * @return incomingTransactionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Incoming Transaction Code linked to the card you are searching.")

  public String getIncomingTransactionCode() {
    return incomingTransactionCode;
  }


  public void setIncomingTransactionCode(String incomingTransactionCode) {
    
    
    
    this.incomingTransactionCode = incomingTransactionCode;
  }


  public CardSearchIssuedVirtualCardsRequest orderNumber(String orderNumber) {
    
    
    
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Order Number linked to the card you are searching.
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order Number linked to the card you are searching.")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    
    
    
    this.orderNumber = orderNumber;
  }


  public CardSearchIssuedVirtualCardsRequest customerID(String customerID) {
    
    
    
    
    this.customerID = customerID;
    return this;
  }

   /**
   * Order Number linked to the card you are searching.
   * @return customerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order Number linked to the card you are searching.")

  public String getCustomerID() {
    return customerID;
  }


  public void setCustomerID(String customerID) {
    
    
    
    this.customerID = customerID;
  }


  public CardSearchIssuedVirtualCardsRequest timeStampFrom(LocalDate timeStampFrom) {
    
    
    
    
    this.timeStampFrom = timeStampFrom;
    return this;
  }

   /**
   * Starting Issued Date linked to the card(s) you are searching.
   * @return timeStampFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Starting Issued Date linked to the card(s) you are searching.")

  public LocalDate getTimeStampFrom() {
    return timeStampFrom;
  }


  public void setTimeStampFrom(LocalDate timeStampFrom) {
    
    
    
    this.timeStampFrom = timeStampFrom;
  }


  public CardSearchIssuedVirtualCardsRequest timeStampTo(LocalDate timeStampTo) {
    
    
    
    
    this.timeStampTo = timeStampTo;
    return this;
  }

   /**
   * Ending Issued Date linked to the card(s) you are searching.
   * @return timeStampTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ending Issued Date linked to the card(s) you are searching.")

  public LocalDate getTimeStampTo() {
    return timeStampTo;
  }


  public void setTimeStampTo(LocalDate timeStampTo) {
    
    
    
    this.timeStampTo = timeStampTo;
  }


  public CardSearchIssuedVirtualCardsRequest issuedAmountFrom(Float issuedAmountFrom) {
    
    
    
    
    this.issuedAmountFrom = issuedAmountFrom;
    return this;
  }

   /**
   * Start of Issued Amount range linked to the card(s) you are searching.
   * @return issuedAmountFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start of Issued Amount range linked to the card(s) you are searching.")

  public Float getIssuedAmountFrom() {
    return issuedAmountFrom;
  }


  public void setIssuedAmountFrom(Float issuedAmountFrom) {
    
    
    
    this.issuedAmountFrom = issuedAmountFrom;
  }


  public CardSearchIssuedVirtualCardsRequest issuedAmountTo(Float issuedAmountTo) {
    
    
    
    
    this.issuedAmountTo = issuedAmountTo;
    return this;
  }

   /**
   * End of Issued Amount range linked to the card(s) you are searching.
   * @return issuedAmountTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End of Issued Amount range linked to the card(s) you are searching.")

  public Float getIssuedAmountTo() {
    return issuedAmountTo;
  }


  public void setIssuedAmountTo(Float issuedAmountTo) {
    
    
    
    this.issuedAmountTo = issuedAmountTo;
  }


  public CardSearchIssuedVirtualCardsRequest outgoingTransactionCode(String outgoingTransactionCode) {
    
    
    
    
    this.outgoingTransactionCode = outgoingTransactionCode;
    return this;
  }

   /**
   * Outgoing Transaction Code linked to the card(s) you are searching.
   * @return outgoingTransactionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Outgoing Transaction Code linked to the card(s) you are searching.")

  public String getOutgoingTransactionCode() {
    return outgoingTransactionCode;
  }


  public void setOutgoingTransactionCode(String outgoingTransactionCode) {
    
    
    
    this.outgoingTransactionCode = outgoingTransactionCode;
  }


  public CardSearchIssuedVirtualCardsRequest settledAmountFrom(Long settledAmountFrom) {
    
    
    
    
    this.settledAmountFrom = settledAmountFrom;
    return this;
  }

   /**
   * Start of Settled Amount range linked to the card(s) you are searching.
   * @return settledAmountFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start of Settled Amount range linked to the card(s) you are searching.")

  public Long getSettledAmountFrom() {
    return settledAmountFrom;
  }


  public void setSettledAmountFrom(Long settledAmountFrom) {
    
    
    
    this.settledAmountFrom = settledAmountFrom;
  }


  public CardSearchIssuedVirtualCardsRequest settledAmountTo(Long settledAmountTo) {
    
    
    
    
    this.settledAmountTo = settledAmountTo;
    return this;
  }

   /**
   * End of Settled Amount range linked to the card(s) you are searching.
   * @return settledAmountTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End of Settled Amount range linked to the card(s) you are searching.")

  public Long getSettledAmountTo() {
    return settledAmountTo;
  }


  public void setSettledAmountTo(Long settledAmountTo) {
    
    
    
    this.settledAmountTo = settledAmountTo;
  }


  public CardSearchIssuedVirtualCardsRequest returnedAmountFrom(Long returnedAmountFrom) {
    
    
    
    
    this.returnedAmountFrom = returnedAmountFrom;
    return this;
  }

   /**
   * Start of Settled Returned Amount range linked to the card(s) you are searching.
   * @return returnedAmountFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start of Settled Returned Amount range linked to the card(s) you are searching.")

  public Long getReturnedAmountFrom() {
    return returnedAmountFrom;
  }


  public void setReturnedAmountFrom(Long returnedAmountFrom) {
    
    
    
    this.returnedAmountFrom = returnedAmountFrom;
  }


  public CardSearchIssuedVirtualCardsRequest returnedAmountTo(Long returnedAmountTo) {
    
    
    
    
    this.returnedAmountTo = returnedAmountTo;
    return this;
  }

   /**
   * End of Settled Returned Amount range linked to the card(s) you are searching.
   * @return returnedAmountTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End of Settled Returned Amount range linked to the card(s) you are searching.")

  public Long getReturnedAmountTo() {
    return returnedAmountTo;
  }


  public void setReturnedAmountTo(Long returnedAmountTo) {
    
    
    
    this.returnedAmountTo = returnedAmountTo;
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
   * @return the CardSearchIssuedVirtualCardsRequest instance itself
   */
  public CardSearchIssuedVirtualCardsRequest putAdditionalProperty(String key, Object value) {
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
    CardSearchIssuedVirtualCardsRequest cardSearchIssuedVirtualCardsRequest = (CardSearchIssuedVirtualCardsRequest) o;
    return Objects.equals(this.merchantGuid, cardSearchIssuedVirtualCardsRequest.merchantGuid) &&
        Objects.equals(this.saleGuid, cardSearchIssuedVirtualCardsRequest.saleGuid) &&
        Objects.equals(this.incomingTransactionCode, cardSearchIssuedVirtualCardsRequest.incomingTransactionCode) &&
        Objects.equals(this.orderNumber, cardSearchIssuedVirtualCardsRequest.orderNumber) &&
        Objects.equals(this.customerID, cardSearchIssuedVirtualCardsRequest.customerID) &&
        Objects.equals(this.timeStampFrom, cardSearchIssuedVirtualCardsRequest.timeStampFrom) &&
        Objects.equals(this.timeStampTo, cardSearchIssuedVirtualCardsRequest.timeStampTo) &&
        Objects.equals(this.issuedAmountFrom, cardSearchIssuedVirtualCardsRequest.issuedAmountFrom) &&
        Objects.equals(this.issuedAmountTo, cardSearchIssuedVirtualCardsRequest.issuedAmountTo) &&
        Objects.equals(this.outgoingTransactionCode, cardSearchIssuedVirtualCardsRequest.outgoingTransactionCode) &&
        Objects.equals(this.settledAmountFrom, cardSearchIssuedVirtualCardsRequest.settledAmountFrom) &&
        Objects.equals(this.settledAmountTo, cardSearchIssuedVirtualCardsRequest.settledAmountTo) &&
        Objects.equals(this.returnedAmountFrom, cardSearchIssuedVirtualCardsRequest.returnedAmountFrom) &&
        Objects.equals(this.returnedAmountTo, cardSearchIssuedVirtualCardsRequest.returnedAmountTo)&&
        Objects.equals(this.additionalProperties, cardSearchIssuedVirtualCardsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantGuid, saleGuid, incomingTransactionCode, orderNumber, customerID, timeStampFrom, timeStampTo, issuedAmountFrom, issuedAmountTo, outgoingTransactionCode, settledAmountFrom, settledAmountTo, returnedAmountFrom, returnedAmountTo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardSearchIssuedVirtualCardsRequest {\n");
    sb.append("    merchantGuid: ").append(toIndentedString(merchantGuid)).append("\n");
    sb.append("    saleGuid: ").append(toIndentedString(saleGuid)).append("\n");
    sb.append("    incomingTransactionCode: ").append(toIndentedString(incomingTransactionCode)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
    sb.append("    timeStampFrom: ").append(toIndentedString(timeStampFrom)).append("\n");
    sb.append("    timeStampTo: ").append(toIndentedString(timeStampTo)).append("\n");
    sb.append("    issuedAmountFrom: ").append(toIndentedString(issuedAmountFrom)).append("\n");
    sb.append("    issuedAmountTo: ").append(toIndentedString(issuedAmountTo)).append("\n");
    sb.append("    outgoingTransactionCode: ").append(toIndentedString(outgoingTransactionCode)).append("\n");
    sb.append("    settledAmountFrom: ").append(toIndentedString(settledAmountFrom)).append("\n");
    sb.append("    settledAmountTo: ").append(toIndentedString(settledAmountTo)).append("\n");
    sb.append("    returnedAmountFrom: ").append(toIndentedString(returnedAmountFrom)).append("\n");
    sb.append("    returnedAmountTo: ").append(toIndentedString(returnedAmountTo)).append("\n");
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
    openapiFields.add("MerchantGuid");
    openapiFields.add("SaleGuid");
    openapiFields.add("IncomingTransactionCode");
    openapiFields.add("OrderNumber");
    openapiFields.add("CustomerID");
    openapiFields.add("TimeStampFrom");
    openapiFields.add("TimeStampTo");
    openapiFields.add("IssuedAmountFrom");
    openapiFields.add("IssuedAmountTo");
    openapiFields.add("OutgoingTransactionCode");
    openapiFields.add("SettledAmountFrom");
    openapiFields.add("SettledAmountTo");
    openapiFields.add("ReturnedAmountFrom");
    openapiFields.add("ReturnedAmountTo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MerchantGuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardSearchIssuedVirtualCardsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CardSearchIssuedVirtualCardsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardSearchIssuedVirtualCardsRequest is not found in the empty JSON string", CardSearchIssuedVirtualCardsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CardSearchIssuedVirtualCardsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("MerchantGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MerchantGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MerchantGuid").toString()));
      }
      if ((jsonObj.get("SaleGuid") != null && !jsonObj.get("SaleGuid").isJsonNull()) && !jsonObj.get("SaleGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SaleGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SaleGuid").toString()));
      }
      if ((jsonObj.get("IncomingTransactionCode") != null && !jsonObj.get("IncomingTransactionCode").isJsonNull()) && !jsonObj.get("IncomingTransactionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IncomingTransactionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IncomingTransactionCode").toString()));
      }
      if ((jsonObj.get("OrderNumber") != null && !jsonObj.get("OrderNumber").isJsonNull()) && !jsonObj.get("OrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OrderNumber").toString()));
      }
      if ((jsonObj.get("CustomerID") != null && !jsonObj.get("CustomerID").isJsonNull()) && !jsonObj.get("CustomerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomerID").toString()));
      }
      if ((jsonObj.get("OutgoingTransactionCode") != null && !jsonObj.get("OutgoingTransactionCode").isJsonNull()) && !jsonObj.get("OutgoingTransactionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OutgoingTransactionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OutgoingTransactionCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardSearchIssuedVirtualCardsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardSearchIssuedVirtualCardsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardSearchIssuedVirtualCardsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardSearchIssuedVirtualCardsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CardSearchIssuedVirtualCardsRequest>() {
           @Override
           public void write(JsonWriter out, CardSearchIssuedVirtualCardsRequest value) throws IOException {
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
           public CardSearchIssuedVirtualCardsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CardSearchIssuedVirtualCardsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CardSearchIssuedVirtualCardsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardSearchIssuedVirtualCardsRequest
  * @throws IOException if the JSON string is invalid with respect to CardSearchIssuedVirtualCardsRequest
  */
  public static CardSearchIssuedVirtualCardsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardSearchIssuedVirtualCardsRequest.class);
  }

 /**
  * Convert an instance of CardSearchIssuedVirtualCardsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

