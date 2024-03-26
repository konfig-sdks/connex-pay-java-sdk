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
import com.konfigthis.client.model.ReturnItemRequestResponseSaleCard;
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
 * ReturnItemRequestResponseSale
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReturnItemRequestResponseSale {
  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_BATCH_STATUS = "batchStatus";
  @SerializedName(SERIALIZED_NAME_BATCH_STATUS)
  private String batchStatus;

  public static final String SERIALIZED_NAME_TIME_STAMP = "timeStamp";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP)
  private String timeStamp;

  public static final String SERIALIZED_NAME_DEVICE_GUID = "deviceGuid";
  @SerializedName(SERIALIZED_NAME_DEVICE_GUID)
  private String deviceGuid;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount = 0d;

  public static final String SERIALIZED_NAME_EFFECTIVE_AMOUNT = "effectiveAmount";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_AMOUNT)
  private Integer effectiveAmount = 0;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_ORDER_DATE = "orderDate";
  @SerializedName(SERIALIZED_NAME_ORDER_DATE)
  private String orderDate;

  public static final String SERIALIZED_NAME_BATCH_GUID = "batchGuid";
  @SerializedName(SERIALIZED_NAME_BATCH_GUID)
  private String batchGuid;

  public static final String SERIALIZED_NAME_PROCESSOR_STATUS_CODE = "processorStatusCode";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_STATUS_CODE)
  private String processorStatusCode;

  public static final String SERIALIZED_NAME_PROCESSOR_RESPONSE_MESSAGE = "processorResponseMessage";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_RESPONSE_MESSAGE)
  private String processorResponseMessage;

  public static final String SERIALIZED_NAME_WAS_PROCESSED = "wasProcessed";
  @SerializedName(SERIALIZED_NAME_WAS_PROCESSED)
  private Boolean wasProcessed = true;

  public static final String SERIALIZED_NAME_AUTH_CODE = "authCode";
  @SerializedName(SERIALIZED_NAME_AUTH_CODE)
  private String authCode;

  public static final String SERIALIZED_NAME_REF_NUMBER = "refNumber";
  @SerializedName(SERIALIZED_NAME_REF_NUMBER)
  private String refNumber;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_RECEIPT = "customerReceipt";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_RECEIPT)
  private String customerReceipt;

  public static final String SERIALIZED_NAME_CUSTOM_DATA = "customData";
  @SerializedName(SERIALIZED_NAME_CUSTOM_DATA)
  private String customData;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private ReturnItemRequestResponseSaleCard card;

  public ReturnItemRequestResponseSale() {
  }

  public ReturnItemRequestResponseSale guid(String guid) {
    
    
    
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ded98ad3-0553-4607-b84c-1bbd85f474d5", value = "")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    
    
    
    this.guid = guid;
  }


  public ReturnItemRequestResponseSale status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Transaction - Approved", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public ReturnItemRequestResponseSale batchStatus(String batchStatus) {
    
    
    
    
    this.batchStatus = batchStatus;
    return this;
  }

   /**
   * Get batchStatus
   * @return batchStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Batch - Closed", value = "")

  public String getBatchStatus() {
    return batchStatus;
  }


  public void setBatchStatus(String batchStatus) {
    
    
    
    this.batchStatus = batchStatus;
  }


  public ReturnItemRequestResponseSale timeStamp(String timeStamp) {
    
    
    
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-07-11T11:09:53.5", value = "")

  public String getTimeStamp() {
    return timeStamp;
  }


  public void setTimeStamp(String timeStamp) {
    
    
    
    this.timeStamp = timeStamp;
  }


  public ReturnItemRequestResponseSale deviceGuid(String deviceGuid) {
    
    
    
    
    this.deviceGuid = deviceGuid;
    return this;
  }

   /**
   * Get deviceGuid
   * @return deviceGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8f65764d-72c1-4dee-ac9f-4cd4c98e8c35", value = "")

  public String getDeviceGuid() {
    return deviceGuid;
  }


  public void setDeviceGuid(String deviceGuid) {
    
    
    
    this.deviceGuid = deviceGuid;
  }


  public ReturnItemRequestResponseSale amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

  public ReturnItemRequestResponseSale amount(Integer amount) {
    
    
    
    
    this.amount = amount.doubleValue();
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "19.74", value = "")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public ReturnItemRequestResponseSale effectiveAmount(Integer effectiveAmount) {
    
    
    
    
    this.effectiveAmount = effectiveAmount;
    return this;
  }

   /**
   * Get effectiveAmount
   * @return effectiveAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getEffectiveAmount() {
    return effectiveAmount;
  }


  public void setEffectiveAmount(Integer effectiveAmount) {
    
    
    
    this.effectiveAmount = effectiveAmount;
  }


  public ReturnItemRequestResponseSale orderNumber(String orderNumber) {
    
    
    
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11518", value = "")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    
    
    
    this.orderNumber = orderNumber;
  }


  public ReturnItemRequestResponseSale orderDate(String orderDate) {
    
    
    
    
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Get orderDate
   * @return orderDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-02-03T00:00:00", value = "")

  public String getOrderDate() {
    return orderDate;
  }


  public void setOrderDate(String orderDate) {
    
    
    
    this.orderDate = orderDate;
  }


  public ReturnItemRequestResponseSale batchGuid(String batchGuid) {
    
    
    
    
    this.batchGuid = batchGuid;
    return this;
  }

   /**
   * Get batchGuid
   * @return batchGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1564cb1b-eddb-4747-9565-61a7d7d225f9", value = "")

  public String getBatchGuid() {
    return batchGuid;
  }


  public void setBatchGuid(String batchGuid) {
    
    
    
    this.batchGuid = batchGuid;
  }


  public ReturnItemRequestResponseSale processorStatusCode(String processorStatusCode) {
    
    
    
    
    this.processorStatusCode = processorStatusCode;
    return this;
  }

   /**
   * Get processorStatusCode
   * @return processorStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A0000", value = "")

  public String getProcessorStatusCode() {
    return processorStatusCode;
  }


  public void setProcessorStatusCode(String processorStatusCode) {
    
    
    
    this.processorStatusCode = processorStatusCode;
  }


  public ReturnItemRequestResponseSale processorResponseMessage(String processorResponseMessage) {
    
    
    
    
    this.processorResponseMessage = processorResponseMessage;
    return this;
  }

   /**
   * Get processorResponseMessage
   * @return processorResponseMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Success", value = "")

  public String getProcessorResponseMessage() {
    return processorResponseMessage;
  }


  public void setProcessorResponseMessage(String processorResponseMessage) {
    
    
    
    this.processorResponseMessage = processorResponseMessage;
  }


  public ReturnItemRequestResponseSale wasProcessed(Boolean wasProcessed) {
    
    
    
    
    this.wasProcessed = wasProcessed;
    return this;
  }

   /**
   * Get wasProcessed
   * @return wasProcessed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getWasProcessed() {
    return wasProcessed;
  }


  public void setWasProcessed(Boolean wasProcessed) {
    
    
    
    this.wasProcessed = wasProcessed;
  }


  public ReturnItemRequestResponseSale authCode(String authCode) {
    
    
    
    
    this.authCode = authCode;
    return this;
  }

   /**
   * Get authCode
   * @return authCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VTLMC1", value = "")

  public String getAuthCode() {
    return authCode;
  }


  public void setAuthCode(String authCode) {
    
    
    
    this.authCode = authCode;
  }


  public ReturnItemRequestResponseSale refNumber(String refNumber) {
    
    
    
    
    this.refNumber = refNumber;
    return this;
  }

   /**
   * Get refNumber
   * @return refNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13283670", value = "")

  public String getRefNumber() {
    return refNumber;
  }


  public void setRefNumber(String refNumber) {
    
    
    
    this.refNumber = refNumber;
  }


  public ReturnItemRequestResponseSale invoiceNumber(String invoiceNumber) {
    
    
    
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11518", value = "")

  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  public void setInvoiceNumber(String invoiceNumber) {
    
    
    
    this.invoiceNumber = invoiceNumber;
  }


  public ReturnItemRequestResponseSale customerReceipt(String customerReceipt) {
    
    
    
    
    this.customerReceipt = customerReceipt;
    return this;
  }

   /**
   * Get customerReceipt
   * @return customerReceipt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUR TECHNOLOGY HOLDINGS\\n8320 S HARDY DRIVE\\nTEMPE AZ 85284\\n07/11/2017 07:09:56\\n\\nCREDIT - SALE\\n\\nCARD # : **** **** **** 0213\\nCARD TYPE :MASTERCARD\\nEntry Mode : MANUAL\\n\\nREF # : 13283670\\nInvoice number : 11518\\nAUTH CODE : VTLMC1\\nSubtotal:                       $19.74\\n--------------------------------------\\nTotal:                          $19.74\\n--------------------------------------\\n\\n\\n\\nJohn Doe\\n\\nCUSTOMER ACKNOWLEDGES RECEIPT OF\\nGOODS AND/OR SERVICES IN THE AMOUNT\\nOF THE TOTAL SHOWN HEREON AND AGREES\\nTO PERFORM THE OBLIGATIONS SET FORTH\\nBY THE CUSTOMER’S AGREEMENT WITH THE\\nISSUER\\nAPPROVED\\n\\n\\n\\n\\nCustomer Copy\\n", value = "")

  public String getCustomerReceipt() {
    return customerReceipt;
  }


  public void setCustomerReceipt(String customerReceipt) {
    
    
    
    this.customerReceipt = customerReceipt;
  }


  public ReturnItemRequestResponseSale customData(String customData) {
    
    
    
    
    this.customData = customData;
    return this;
  }

   /**
   * Get customData
   * @return customData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "order details", value = "")

  public String getCustomData() {
    return customData;
  }


  public void setCustomData(String customData) {
    
    
    
    this.customData = customData;
  }


  public ReturnItemRequestResponseSale card(ReturnItemRequestResponseSaleCard card) {
    
    
    
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReturnItemRequestResponseSaleCard getCard() {
    return card;
  }


  public void setCard(ReturnItemRequestResponseSaleCard card) {
    
    
    
    this.card = card;
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
   * @return the ReturnItemRequestResponseSale instance itself
   */
  public ReturnItemRequestResponseSale putAdditionalProperty(String key, Object value) {
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
    ReturnItemRequestResponseSale returnItemRequestResponseSale = (ReturnItemRequestResponseSale) o;
    return Objects.equals(this.guid, returnItemRequestResponseSale.guid) &&
        Objects.equals(this.status, returnItemRequestResponseSale.status) &&
        Objects.equals(this.batchStatus, returnItemRequestResponseSale.batchStatus) &&
        Objects.equals(this.timeStamp, returnItemRequestResponseSale.timeStamp) &&
        Objects.equals(this.deviceGuid, returnItemRequestResponseSale.deviceGuid) &&
        Objects.equals(this.amount, returnItemRequestResponseSale.amount) &&
        Objects.equals(this.effectiveAmount, returnItemRequestResponseSale.effectiveAmount) &&
        Objects.equals(this.orderNumber, returnItemRequestResponseSale.orderNumber) &&
        Objects.equals(this.orderDate, returnItemRequestResponseSale.orderDate) &&
        Objects.equals(this.batchGuid, returnItemRequestResponseSale.batchGuid) &&
        Objects.equals(this.processorStatusCode, returnItemRequestResponseSale.processorStatusCode) &&
        Objects.equals(this.processorResponseMessage, returnItemRequestResponseSale.processorResponseMessage) &&
        Objects.equals(this.wasProcessed, returnItemRequestResponseSale.wasProcessed) &&
        Objects.equals(this.authCode, returnItemRequestResponseSale.authCode) &&
        Objects.equals(this.refNumber, returnItemRequestResponseSale.refNumber) &&
        Objects.equals(this.invoiceNumber, returnItemRequestResponseSale.invoiceNumber) &&
        Objects.equals(this.customerReceipt, returnItemRequestResponseSale.customerReceipt) &&
        Objects.equals(this.customData, returnItemRequestResponseSale.customData) &&
        Objects.equals(this.card, returnItemRequestResponseSale.card)&&
        Objects.equals(this.additionalProperties, returnItemRequestResponseSale.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, status, batchStatus, timeStamp, deviceGuid, amount, effectiveAmount, orderNumber, orderDate, batchGuid, processorStatusCode, processorResponseMessage, wasProcessed, authCode, refNumber, invoiceNumber, customerReceipt, customData, card, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnItemRequestResponseSale {\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    batchStatus: ").append(toIndentedString(batchStatus)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    deviceGuid: ").append(toIndentedString(deviceGuid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    effectiveAmount: ").append(toIndentedString(effectiveAmount)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    batchGuid: ").append(toIndentedString(batchGuid)).append("\n");
    sb.append("    processorStatusCode: ").append(toIndentedString(processorStatusCode)).append("\n");
    sb.append("    processorResponseMessage: ").append(toIndentedString(processorResponseMessage)).append("\n");
    sb.append("    wasProcessed: ").append(toIndentedString(wasProcessed)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    customerReceipt: ").append(toIndentedString(customerReceipt)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("batchStatus");
    openapiFields.add("timeStamp");
    openapiFields.add("deviceGuid");
    openapiFields.add("amount");
    openapiFields.add("effectiveAmount");
    openapiFields.add("orderNumber");
    openapiFields.add("orderDate");
    openapiFields.add("batchGuid");
    openapiFields.add("processorStatusCode");
    openapiFields.add("processorResponseMessage");
    openapiFields.add("wasProcessed");
    openapiFields.add("authCode");
    openapiFields.add("refNumber");
    openapiFields.add("invoiceNumber");
    openapiFields.add("customerReceipt");
    openapiFields.add("customData");
    openapiFields.add("card");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReturnItemRequestResponseSale
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReturnItemRequestResponseSale.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReturnItemRequestResponseSale is not found in the empty JSON string", ReturnItemRequestResponseSale.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull()) && !jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("batchStatus") != null && !jsonObj.get("batchStatus").isJsonNull()) && !jsonObj.get("batchStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batchStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batchStatus").toString()));
      }
      if ((jsonObj.get("timeStamp") != null && !jsonObj.get("timeStamp").isJsonNull()) && !jsonObj.get("timeStamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeStamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeStamp").toString()));
      }
      if ((jsonObj.get("deviceGuid") != null && !jsonObj.get("deviceGuid").isJsonNull()) && !jsonObj.get("deviceGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceGuid").toString()));
      }
      if ((jsonObj.get("orderNumber") != null && !jsonObj.get("orderNumber").isJsonNull()) && !jsonObj.get("orderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderNumber").toString()));
      }
      if ((jsonObj.get("orderDate") != null && !jsonObj.get("orderDate").isJsonNull()) && !jsonObj.get("orderDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderDate").toString()));
      }
      if ((jsonObj.get("batchGuid") != null && !jsonObj.get("batchGuid").isJsonNull()) && !jsonObj.get("batchGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `batchGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("batchGuid").toString()));
      }
      if ((jsonObj.get("processorStatusCode") != null && !jsonObj.get("processorStatusCode").isJsonNull()) && !jsonObj.get("processorStatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processorStatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processorStatusCode").toString()));
      }
      if ((jsonObj.get("processorResponseMessage") != null && !jsonObj.get("processorResponseMessage").isJsonNull()) && !jsonObj.get("processorResponseMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processorResponseMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processorResponseMessage").toString()));
      }
      if ((jsonObj.get("authCode") != null && !jsonObj.get("authCode").isJsonNull()) && !jsonObj.get("authCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authCode").toString()));
      }
      if ((jsonObj.get("refNumber") != null && !jsonObj.get("refNumber").isJsonNull()) && !jsonObj.get("refNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refNumber").toString()));
      }
      if ((jsonObj.get("invoiceNumber") != null && !jsonObj.get("invoiceNumber").isJsonNull()) && !jsonObj.get("invoiceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceNumber").toString()));
      }
      if ((jsonObj.get("customerReceipt") != null && !jsonObj.get("customerReceipt").isJsonNull()) && !jsonObj.get("customerReceipt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerReceipt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerReceipt").toString()));
      }
      if ((jsonObj.get("customData") != null && !jsonObj.get("customData").isJsonNull()) && !jsonObj.get("customData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customData").toString()));
      }
      // validate the optional field `card`
      if (jsonObj.get("card") != null && !jsonObj.get("card").isJsonNull()) {
        ReturnItemRequestResponseSaleCard.validateJsonObject(jsonObj.getAsJsonObject("card"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReturnItemRequestResponseSale.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReturnItemRequestResponseSale' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReturnItemRequestResponseSale> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReturnItemRequestResponseSale.class));

       return (TypeAdapter<T>) new TypeAdapter<ReturnItemRequestResponseSale>() {
           @Override
           public void write(JsonWriter out, ReturnItemRequestResponseSale value) throws IOException {
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
           public ReturnItemRequestResponseSale read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReturnItemRequestResponseSale instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReturnItemRequestResponseSale given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReturnItemRequestResponseSale
  * @throws IOException if the JSON string is invalid with respect to ReturnItemRequestResponseSale
  */
  public static ReturnItemRequestResponseSale fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReturnItemRequestResponseSale.class);
  }

 /**
  * Convert an instance of ReturnItemRequestResponseSale to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

