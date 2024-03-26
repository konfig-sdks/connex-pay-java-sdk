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
 * CardGetDetailResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CardGetDetailResponse {
  public static final String SERIALIZED_NAME_CARD_GUID = "cardGuid";
  @SerializedName(SERIALIZED_NAME_CARD_GUID)
  private String cardGuid;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private String expiration;

  public static final String SERIALIZED_NAME_TERMINATE_DATE = "terminateDate";
  @SerializedName(SERIALIZED_NAME_TERMINATE_DATE)
  private String terminateDate;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_FIRST_SIX = "firstSix";
  @SerializedName(SERIALIZED_NAME_FIRST_SIX)
  private String firstSix;

  public static final String SERIALIZED_NAME_LAST_FOUR = "lastFour";
  @SerializedName(SERIALIZED_NAME_LAST_FOUR)
  private String lastFour;

  public static final String SERIALIZED_NAME_NAME_LINE1 = "nameLine1";
  @SerializedName(SERIALIZED_NAME_NAME_LINE1)
  private String nameLine1;

  public static final String SERIALIZED_NAME_NAME_LINE2 = "nameLine2";
  @SerializedName(SERIALIZED_NAME_NAME_LINE2)
  private String nameLine2;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_BANK = "bank";
  @SerializedName(SERIALIZED_NAME_BANK)
  private Integer bank = 0;

  public static final String SERIALIZED_NAME_ISSUED_AMOUNT = "issuedAmount";
  @SerializedName(SERIALIZED_NAME_ISSUED_AMOUNT)
  private Integer issuedAmount = 0;

  public static final String SERIALIZED_NAME_CARD_TYPE = "cardType";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_PURCHASE_TYPE = "purchaseType";
  @SerializedName(SERIALIZED_NAME_PURCHASE_TYPE)
  private String purchaseType;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "availableBalance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private Integer availableBalance = 0;

  public CardGetDetailResponse() {
  }

  public CardGetDetailResponse cardGuid(String cardGuid) {
    
    
    
    
    this.cardGuid = cardGuid;
    return this;
  }

   /**
   * Get cardGuid
   * @return cardGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b6c86e82-5621-440c-94ea-6bd5692e0497", value = "")

  public String getCardGuid() {
    return cardGuid;
  }


  public void setCardGuid(String cardGuid) {
    
    
    
    this.cardGuid = cardGuid;
  }


  public CardGetDetailResponse expirationDate(String expirationDate) {
    
    
    
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-12-30T23:59:59", value = "")

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    
    
    
    this.expirationDate = expirationDate;
  }


  public CardGetDetailResponse expiration(String expiration) {
    
    
    
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1222", value = "")

  public String getExpiration() {
    return expiration;
  }


  public void setExpiration(String expiration) {
    
    
    
    this.expiration = expiration;
  }


  public CardGetDetailResponse terminateDate(String terminateDate) {
    
    
    
    
    this.terminateDate = terminateDate;
    return this;
  }

   /**
   * Get terminateDate
   * @return terminateDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-12-30T23:59:59", value = "")

  public String getTerminateDate() {
    return terminateDate;
  }


  public void setTerminateDate(String terminateDate) {
    
    
    
    this.terminateDate = terminateDate;
  }


  public CardGetDetailResponse currencyCode(String currencyCode) {
    
    
    
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    
    
    
    this.currencyCode = currencyCode;
  }


  public CardGetDetailResponse firstSix(String firstSix) {
    
    
    
    
    this.firstSix = firstSix;
    return this;
  }

   /**
   * Get firstSix
   * @return firstSix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "111111", value = "")

  public String getFirstSix() {
    return firstSix;
  }


  public void setFirstSix(String firstSix) {
    
    
    
    this.firstSix = firstSix;
  }


  public CardGetDetailResponse lastFour(String lastFour) {
    
    
    
    
    this.lastFour = lastFour;
    return this;
  }

   /**
   * Get lastFour
   * @return lastFour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3420", value = "")

  public String getLastFour() {
    return lastFour;
  }


  public void setLastFour(String lastFour) {
    
    
    
    this.lastFour = lastFour;
  }


  public CardGetDetailResponse nameLine1(String nameLine1) {
    
    
    
    
    this.nameLine1 = nameLine1;
    return this;
  }

   /**
   * Get nameLine1
   * @return nameLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ping", value = "")

  public String getNameLine1() {
    return nameLine1;
  }


  public void setNameLine1(String nameLine1) {
    
    
    
    this.nameLine1 = nameLine1;
  }


  public CardGetDetailResponse nameLine2(String nameLine2) {
    
    
    
    
    this.nameLine2 = nameLine2;
    return this;
  }

   /**
   * Get nameLine2
   * @return nameLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VCC", value = "")

  public String getNameLine2() {
    return nameLine2;
  }


  public void setNameLine2(String nameLine2) {
    
    
    
    this.nameLine2 = nameLine2;
  }


  public CardGetDetailResponse status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Card - Active", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public CardGetDetailResponse bank(Integer bank) {
    
    
    
    
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getBank() {
    return bank;
  }


  public void setBank(Integer bank) {
    
    
    
    this.bank = bank;
  }


  public CardGetDetailResponse issuedAmount(Integer issuedAmount) {
    
    
    
    
    this.issuedAmount = issuedAmount;
    return this;
  }

   /**
   * Get issuedAmount
   * @return issuedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "80", value = "")

  public Integer getIssuedAmount() {
    return issuedAmount;
  }


  public void setIssuedAmount(Integer issuedAmount) {
    
    
    
    this.issuedAmount = issuedAmount;
  }


  public CardGetDetailResponse cardType(String cardType) {
    
    
    
    
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Other", value = "")

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    
    
    
    this.cardType = cardType;
  }


  public CardGetDetailResponse purchaseType(String purchaseType) {
    
    
    
    
    this.purchaseType = purchaseType;
    return this;
  }

   /**
   * Get purchaseType
   * @return purchaseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "")

  public String getPurchaseType() {
    return purchaseType;
  }


  public void setPurchaseType(String purchaseType) {
    
    
    
    this.purchaseType = purchaseType;
  }


  public CardGetDetailResponse availableBalance(Integer availableBalance) {
    
    
    
    
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Get availableBalance
   * @return availableBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "80", value = "")

  public Integer getAvailableBalance() {
    return availableBalance;
  }


  public void setAvailableBalance(Integer availableBalance) {
    
    
    
    this.availableBalance = availableBalance;
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
   * @return the CardGetDetailResponse instance itself
   */
  public CardGetDetailResponse putAdditionalProperty(String key, Object value) {
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
    CardGetDetailResponse cardGetDetailResponse = (CardGetDetailResponse) o;
    return Objects.equals(this.cardGuid, cardGetDetailResponse.cardGuid) &&
        Objects.equals(this.expirationDate, cardGetDetailResponse.expirationDate) &&
        Objects.equals(this.expiration, cardGetDetailResponse.expiration) &&
        Objects.equals(this.terminateDate, cardGetDetailResponse.terminateDate) &&
        Objects.equals(this.currencyCode, cardGetDetailResponse.currencyCode) &&
        Objects.equals(this.firstSix, cardGetDetailResponse.firstSix) &&
        Objects.equals(this.lastFour, cardGetDetailResponse.lastFour) &&
        Objects.equals(this.nameLine1, cardGetDetailResponse.nameLine1) &&
        Objects.equals(this.nameLine2, cardGetDetailResponse.nameLine2) &&
        Objects.equals(this.status, cardGetDetailResponse.status) &&
        Objects.equals(this.bank, cardGetDetailResponse.bank) &&
        Objects.equals(this.issuedAmount, cardGetDetailResponse.issuedAmount) &&
        Objects.equals(this.cardType, cardGetDetailResponse.cardType) &&
        Objects.equals(this.purchaseType, cardGetDetailResponse.purchaseType) &&
        Objects.equals(this.availableBalance, cardGetDetailResponse.availableBalance)&&
        Objects.equals(this.additionalProperties, cardGetDetailResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardGuid, expirationDate, expiration, terminateDate, currencyCode, firstSix, lastFour, nameLine1, nameLine2, status, bank, issuedAmount, cardType, purchaseType, availableBalance, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardGetDetailResponse {\n");
    sb.append("    cardGuid: ").append(toIndentedString(cardGuid)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    terminateDate: ").append(toIndentedString(terminateDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    firstSix: ").append(toIndentedString(firstSix)).append("\n");
    sb.append("    lastFour: ").append(toIndentedString(lastFour)).append("\n");
    sb.append("    nameLine1: ").append(toIndentedString(nameLine1)).append("\n");
    sb.append("    nameLine2: ").append(toIndentedString(nameLine2)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    issuedAmount: ").append(toIndentedString(issuedAmount)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    purchaseType: ").append(toIndentedString(purchaseType)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
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
    openapiFields.add("cardGuid");
    openapiFields.add("expirationDate");
    openapiFields.add("expiration");
    openapiFields.add("terminateDate");
    openapiFields.add("currencyCode");
    openapiFields.add("firstSix");
    openapiFields.add("lastFour");
    openapiFields.add("nameLine1");
    openapiFields.add("nameLine2");
    openapiFields.add("status");
    openapiFields.add("bank");
    openapiFields.add("issuedAmount");
    openapiFields.add("cardType");
    openapiFields.add("purchaseType");
    openapiFields.add("availableBalance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardGetDetailResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CardGetDetailResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardGetDetailResponse is not found in the empty JSON string", CardGetDetailResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("cardGuid") != null && !jsonObj.get("cardGuid").isJsonNull()) && !jsonObj.get("cardGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardGuid").toString()));
      }
      if ((jsonObj.get("expirationDate") != null && !jsonObj.get("expirationDate").isJsonNull()) && !jsonObj.get("expirationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationDate").toString()));
      }
      if ((jsonObj.get("expiration") != null && !jsonObj.get("expiration").isJsonNull()) && !jsonObj.get("expiration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiration").toString()));
      }
      if ((jsonObj.get("terminateDate") != null && !jsonObj.get("terminateDate").isJsonNull()) && !jsonObj.get("terminateDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminateDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminateDate").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("firstSix") != null && !jsonObj.get("firstSix").isJsonNull()) && !jsonObj.get("firstSix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstSix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstSix").toString()));
      }
      if ((jsonObj.get("lastFour") != null && !jsonObj.get("lastFour").isJsonNull()) && !jsonObj.get("lastFour").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastFour` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastFour").toString()));
      }
      if ((jsonObj.get("nameLine1") != null && !jsonObj.get("nameLine1").isJsonNull()) && !jsonObj.get("nameLine1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameLine1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameLine1").toString()));
      }
      if ((jsonObj.get("nameLine2") != null && !jsonObj.get("nameLine2").isJsonNull()) && !jsonObj.get("nameLine2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameLine2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameLine2").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("cardType") != null && !jsonObj.get("cardType").isJsonNull()) && !jsonObj.get("cardType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardType").toString()));
      }
      if ((jsonObj.get("purchaseType") != null && !jsonObj.get("purchaseType").isJsonNull()) && !jsonObj.get("purchaseType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchaseType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purchaseType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardGetDetailResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardGetDetailResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardGetDetailResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardGetDetailResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CardGetDetailResponse>() {
           @Override
           public void write(JsonWriter out, CardGetDetailResponse value) throws IOException {
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
           public CardGetDetailResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CardGetDetailResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CardGetDetailResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardGetDetailResponse
  * @throws IOException if the JSON string is invalid with respect to CardGetDetailResponse
  */
  public static CardGetDetailResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardGetDetailResponse.class);
  }

 /**
  * Convert an instance of CardGetDetailResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

