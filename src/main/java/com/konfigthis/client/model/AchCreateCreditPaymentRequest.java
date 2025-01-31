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
import com.konfigthis.client.model.AchCreateCreditPaymentRequestAccountHolder;
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
 * AchCreateCreditPaymentRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AchCreateCreditPaymentRequest {
  public static final String SERIALIZED_NAME_MERCHANT_GUID = "MerchantGuid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_GUID)
  private String merchantGuid;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_PAYEE_NAME = "PayeeName";
  @SerializedName(SERIALIZED_NAME_PAYEE_NAME)
  private String payeeName;

  public static final String SERIALIZED_NAME_STATEMENT_COMPANY_NAME = "StatementCompanyName";
  @SerializedName(SERIALIZED_NAME_STATEMENT_COMPANY_NAME)
  private String statementCompanyName = "Merchant Alias";

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER = "AccountHolder";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER)
  private AchCreateCreditPaymentRequestAccountHolder accountHolder;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "OrderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber = "7H2345";

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "SequenceNumber";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private String sequenceNumber;

  public static final String SERIALIZED_NAME_ASSOCIATION_ID = "AssociationId";
  @SerializedName(SERIALIZED_NAME_ASSOCIATION_ID)
  private String associationId;

  public AchCreateCreditPaymentRequest() {
  }

  public AchCreateCreditPaymentRequest merchantGuid(String merchantGuid) {
    
    
    
    
    this.merchantGuid = merchantGuid;
    return this;
  }

   /**
   * Merchant&#39;s guid. Application level value that indicates the ACH payment is being requested for clients account. Value provided by ConnexPay.
   * @return merchantGuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Merchant's guid. Application level value that indicates the ACH payment is being requested for clients account. Value provided by ConnexPay.")

  public String getMerchantGuid() {
    return merchantGuid;
  }


  public void setMerchantGuid(String merchantGuid) {
    
    
    
    this.merchantGuid = merchantGuid;
  }


  public AchCreateCreditPaymentRequest amount(Float amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Payment amount with the minimum amount &gt; 0.5.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Payment amount with the minimum amount > 0.5.")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    
    
    
    this.amount = amount;
  }


  public AchCreateCreditPaymentRequest payeeName(String payeeName) {
    
    
    
    
    this.payeeName = payeeName;
    return this;
  }

   /**
   * Payee name up to 100 characters.
   * @return payeeName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Payee name up to 100 characters.")

  public String getPayeeName() {
    return payeeName;
  }


  public void setPayeeName(String payeeName) {
    
    
    
    this.payeeName = payeeName;
  }


  public AchCreateCreditPaymentRequest statementCompanyName(String statementCompanyName) {
    
    
    
    
    this.statementCompanyName = statementCompanyName;
    return this;
  }

   /**
   * Company Name to display Bank Statement. The first 16 characters will display on the bank account holders statement.
   * @return statementCompanyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Merchant Alias", value = "Company Name to display Bank Statement. The first 16 characters will display on the bank account holders statement.")

  public String getStatementCompanyName() {
    return statementCompanyName;
  }


  public void setStatementCompanyName(String statementCompanyName) {
    
    
    
    this.statementCompanyName = statementCompanyName;
  }


  public AchCreateCreditPaymentRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * For banks who accept statement descriptors, the first 10 characters will display on the bank account holders statement.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For banks who accept statement descriptors, the first 10 characters will display on the bank account holders statement.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AchCreateCreditPaymentRequest accountHolder(AchCreateCreditPaymentRequestAccountHolder accountHolder) {
    
    
    
    
    this.accountHolder = accountHolder;
    return this;
  }

   /**
   * Get accountHolder
   * @return accountHolder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AchCreateCreditPaymentRequestAccountHolder getAccountHolder() {
    return accountHolder;
  }


  public void setAccountHolder(AchCreateCreditPaymentRequestAccountHolder accountHolder) {
    
    
    
    this.accountHolder = accountHolder;
  }


  public AchCreateCreditPaymentRequest orderNumber(String orderNumber) {
    
    
    
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * This is the most common number you&#39;ll see throughout the ConnexPay Portal.  Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field.  The maximum length is 50 alpha-numeric characters.
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7H2345", value = "This is the most common number you'll see throughout the ConnexPay Portal.  Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field.  The maximum length is 50 alpha-numeric characters.")

  public String getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(String orderNumber) {
    
    
    
    this.orderNumber = orderNumber;
  }


  public AchCreateCreditPaymentRequest sequenceNumber(String sequenceNumber) {
    
    
    
    
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Transaction sequence number within client environment. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric.
   * @return sequenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction sequence number within client environment. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric.")

  public String getSequenceNumber() {
    return sequenceNumber;
  }


  public void setSequenceNumber(String sequenceNumber) {
    
    
    
    this.sequenceNumber = sequenceNumber;
  }


  public AchCreateCreditPaymentRequest associationId(String associationId) {
    
    
    
    
    this.associationId = associationId;
    return this;
  }

   /**
   * This parameter allows you to input an up to 100 character association ID that can be used to tie this ACH Purchase to a sale (Association ID also needs to be included on the sale request). This is useful if you issue the ACH purchase prior to creating the sale that associates to it.
   * @return associationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This parameter allows you to input an up to 100 character association ID that can be used to tie this ACH Purchase to a sale (Association ID also needs to be included on the sale request). This is useful if you issue the ACH purchase prior to creating the sale that associates to it.")

  public String getAssociationId() {
    return associationId;
  }


  public void setAssociationId(String associationId) {
    
    
    
    this.associationId = associationId;
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
   * @return the AchCreateCreditPaymentRequest instance itself
   */
  public AchCreateCreditPaymentRequest putAdditionalProperty(String key, Object value) {
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
    AchCreateCreditPaymentRequest achCreateCreditPaymentRequest = (AchCreateCreditPaymentRequest) o;
    return Objects.equals(this.merchantGuid, achCreateCreditPaymentRequest.merchantGuid) &&
        Objects.equals(this.amount, achCreateCreditPaymentRequest.amount) &&
        Objects.equals(this.payeeName, achCreateCreditPaymentRequest.payeeName) &&
        Objects.equals(this.statementCompanyName, achCreateCreditPaymentRequest.statementCompanyName) &&
        Objects.equals(this.description, achCreateCreditPaymentRequest.description) &&
        Objects.equals(this.accountHolder, achCreateCreditPaymentRequest.accountHolder) &&
        Objects.equals(this.orderNumber, achCreateCreditPaymentRequest.orderNumber) &&
        Objects.equals(this.sequenceNumber, achCreateCreditPaymentRequest.sequenceNumber) &&
        Objects.equals(this.associationId, achCreateCreditPaymentRequest.associationId)&&
        Objects.equals(this.additionalProperties, achCreateCreditPaymentRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantGuid, amount, payeeName, statementCompanyName, description, accountHolder, orderNumber, sequenceNumber, associationId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchCreateCreditPaymentRequest {\n");
    sb.append("    merchantGuid: ").append(toIndentedString(merchantGuid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    statementCompanyName: ").append(toIndentedString(statementCompanyName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    associationId: ").append(toIndentedString(associationId)).append("\n");
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
    openapiFields.add("Amount");
    openapiFields.add("PayeeName");
    openapiFields.add("StatementCompanyName");
    openapiFields.add("Description");
    openapiFields.add("AccountHolder");
    openapiFields.add("OrderNumber");
    openapiFields.add("SequenceNumber");
    openapiFields.add("AssociationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("MerchantGuid");
    openapiRequiredFields.add("Amount");
    openapiRequiredFields.add("PayeeName");
    openapiRequiredFields.add("AccountHolder");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AchCreateCreditPaymentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AchCreateCreditPaymentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AchCreateCreditPaymentRequest is not found in the empty JSON string", AchCreateCreditPaymentRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AchCreateCreditPaymentRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("MerchantGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MerchantGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MerchantGuid").toString()));
      }
      if (!jsonObj.get("PayeeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PayeeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayeeName").toString()));
      }
      if ((jsonObj.get("StatementCompanyName") != null && !jsonObj.get("StatementCompanyName").isJsonNull()) && !jsonObj.get("StatementCompanyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StatementCompanyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StatementCompanyName").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      // validate the required field `AccountHolder`
      AchCreateCreditPaymentRequestAccountHolder.validateJsonObject(jsonObj.getAsJsonObject("AccountHolder"));
      if ((jsonObj.get("OrderNumber") != null && !jsonObj.get("OrderNumber").isJsonNull()) && !jsonObj.get("OrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OrderNumber").toString()));
      }
      if ((jsonObj.get("SequenceNumber") != null && !jsonObj.get("SequenceNumber").isJsonNull()) && !jsonObj.get("SequenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SequenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SequenceNumber").toString()));
      }
      if ((jsonObj.get("AssociationId") != null && !jsonObj.get("AssociationId").isJsonNull()) && !jsonObj.get("AssociationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AssociationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AssociationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AchCreateCreditPaymentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AchCreateCreditPaymentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AchCreateCreditPaymentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AchCreateCreditPaymentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AchCreateCreditPaymentRequest>() {
           @Override
           public void write(JsonWriter out, AchCreateCreditPaymentRequest value) throws IOException {
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
           public AchCreateCreditPaymentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AchCreateCreditPaymentRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AchCreateCreditPaymentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AchCreateCreditPaymentRequest
  * @throws IOException if the JSON string is invalid with respect to AchCreateCreditPaymentRequest
  */
  public static AchCreateCreditPaymentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AchCreateCreditPaymentRequest.class);
  }

 /**
  * Convert an instance of AchCreateCreditPaymentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

