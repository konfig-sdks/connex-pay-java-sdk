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
 * Card data to be used in the event a sale return to the original card is declined and a retry to a new card should be attempted. This attempt needs to be made within 7 days of the failed return authorization
 */
@ApiModel(description = "Card data to be used in the event a sale return to the original card is declined and a retry to a new card should be attempted. This attempt needs to be made within 7 days of the failed return authorization")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReturnItemRequestRequestReturnRetryCard {
  public static final String SERIALIZED_NAME_CARD_NUMBER = "CardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_CARD_HOLDER_NAME = "CardHolderName";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER_NAME)
  private String cardHolderName;

  public static final String SERIALIZED_NAME_CVV2 = "Cvv2";
  @SerializedName(SERIALIZED_NAME_CVV2)
  private Integer cvv2;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "ExpirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private LocalDate expirationDate;

  public ReturnItemRequestRequestReturnRetryCard() {
  }

  public ReturnItemRequestRequestReturnRetryCard cardNumber(String cardNumber) {
    
    
    
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Card number. Must be 16 characters.
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card number. Must be 16 characters.")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    
    
    
    this.cardNumber = cardNumber;
  }


  public ReturnItemRequestRequestReturnRetryCard cardHolderName(String cardHolderName) {
    
    
    
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * Cardholder&#39;s name
   * @return cardHolderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cardholder's name")

  public String getCardHolderName() {
    return cardHolderName;
  }


  public void setCardHolderName(String cardHolderName) {
    
    
    
    this.cardHolderName = cardHolderName;
  }


  public ReturnItemRequestRequestReturnRetryCard cvv2(Integer cvv2) {
    
    
    
    
    this.cvv2 = cvv2;
    return this;
  }

   /**
   * The three or four digit CVV code at the back side of the credit and debit card
   * @return cvv2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The three or four digit CVV code at the back side of the credit and debit card")

  public Integer getCvv2() {
    return cvv2;
  }


  public void setCvv2(Integer cvv2) {
    
    
    
    this.cvv2 = cvv2;
  }


  public ReturnItemRequestRequestReturnRetryCard expirationDate(LocalDate expirationDate) {
    
    
    
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Card&#39;s expiry date in the YYMM format
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card's expiry date in the YYMM format")

  public LocalDate getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(LocalDate expirationDate) {
    
    
    
    this.expirationDate = expirationDate;
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
   * @return the ReturnItemRequestRequestReturnRetryCard instance itself
   */
  public ReturnItemRequestRequestReturnRetryCard putAdditionalProperty(String key, Object value) {
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
    ReturnItemRequestRequestReturnRetryCard returnItemRequestRequestReturnRetryCard = (ReturnItemRequestRequestReturnRetryCard) o;
    return Objects.equals(this.cardNumber, returnItemRequestRequestReturnRetryCard.cardNumber) &&
        Objects.equals(this.cardHolderName, returnItemRequestRequestReturnRetryCard.cardHolderName) &&
        Objects.equals(this.cvv2, returnItemRequestRequestReturnRetryCard.cvv2) &&
        Objects.equals(this.expirationDate, returnItemRequestRequestReturnRetryCard.expirationDate)&&
        Objects.equals(this.additionalProperties, returnItemRequestRequestReturnRetryCard.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, cardHolderName, cvv2, expirationDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnItemRequestRequestReturnRetryCard {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cvv2: ").append(toIndentedString(cvv2)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
    openapiFields.add("CardNumber");
    openapiFields.add("CardHolderName");
    openapiFields.add("Cvv2");
    openapiFields.add("ExpirationDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReturnItemRequestRequestReturnRetryCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReturnItemRequestRequestReturnRetryCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReturnItemRequestRequestReturnRetryCard is not found in the empty JSON string", ReturnItemRequestRequestReturnRetryCard.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("CardNumber") != null && !jsonObj.get("CardNumber").isJsonNull()) && !jsonObj.get("CardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CardNumber").toString()));
      }
      if ((jsonObj.get("CardHolderName") != null && !jsonObj.get("CardHolderName").isJsonNull()) && !jsonObj.get("CardHolderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CardHolderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CardHolderName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReturnItemRequestRequestReturnRetryCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReturnItemRequestRequestReturnRetryCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReturnItemRequestRequestReturnRetryCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReturnItemRequestRequestReturnRetryCard.class));

       return (TypeAdapter<T>) new TypeAdapter<ReturnItemRequestRequestReturnRetryCard>() {
           @Override
           public void write(JsonWriter out, ReturnItemRequestRequestReturnRetryCard value) throws IOException {
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
           public ReturnItemRequestRequestReturnRetryCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReturnItemRequestRequestReturnRetryCard instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReturnItemRequestRequestReturnRetryCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReturnItemRequestRequestReturnRetryCard
  * @throws IOException if the JSON string is invalid with respect to ReturnItemRequestRequestReturnRetryCard
  */
  public static ReturnItemRequestRequestReturnRetryCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReturnItemRequestRequestReturnRetryCard.class);
  }

 /**
  * Convert an instance of ReturnItemRequestRequestReturnRetryCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

