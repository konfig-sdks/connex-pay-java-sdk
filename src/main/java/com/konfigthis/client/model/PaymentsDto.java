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
import java.util.UUID;

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
 * PaymentsDto
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentsDto {
  public static final String SERIALIZED_NAME_PAYEE_REFERENCE_TOKEN = "payeeReferenceToken";
  @SerializedName(SERIALIZED_NAME_PAYEE_REFERENCE_TOKEN)
  private String payeeReferenceToken;

  public static final String SERIALIZED_NAME_RID_REFERENCE_TOKEN = "ridReferenceToken";
  @SerializedName(SERIALIZED_NAME_RID_REFERENCE_TOKEN)
  private String ridReferenceToken;

  public static final String SERIALIZED_NAME_PAYEE_GUID = "payeeGuid";
  @SerializedName(SERIALIZED_NAME_PAYEE_GUID)
  private UUID payeeGuid;

  public static final String SERIALIZED_NAME_PAYMENT_GUID = "paymentGuid";
  @SerializedName(SERIALIZED_NAME_PAYMENT_GUID)
  private UUID paymentGuid;

  public static final String SERIALIZED_NAME_RID_GUID = "ridGuid";
  @SerializedName(SERIALIZED_NAME_RID_GUID)
  private UUID ridGuid;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_FIELD2 = "field2";
  @SerializedName(SERIALIZED_NAME_FIELD2)
  private String field2;

  public static final String SERIALIZED_NAME_FIELD3 = "field3";
  @SerializedName(SERIALIZED_NAME_FIELD3)
  private String field3;

  public static final String SERIALIZED_NAME_FIELD4 = "field4";
  @SerializedName(SERIALIZED_NAME_FIELD4)
  private String field4;

  public static final String SERIALIZED_NAME_FIELD5 = "field5";
  @SerializedName(SERIALIZED_NAME_FIELD5)
  private String field5;

  public PaymentsDto() {
  }

  public PaymentsDto payeeReferenceToken(String payeeReferenceToken) {
    
    
    
    
    this.payeeReferenceToken = payeeReferenceToken;
    return this;
  }

   /**
   * The Payee identifier used by ConnexPay support teams to research issues related to the Payee.
   * @return payeeReferenceToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Payee identifier used by ConnexPay support teams to research issues related to the Payee.")

  public String getPayeeReferenceToken() {
    return payeeReferenceToken;
  }


  public void setPayeeReferenceToken(String payeeReferenceToken) {
    
    
    
    this.payeeReferenceToken = payeeReferenceToken;
  }


  public PaymentsDto ridReferenceToken(String ridReferenceToken) {
    
    
    
    
    this.ridReferenceToken = ridReferenceToken;
    return this;
  }

   /**
   * For Payment Widget customers only. This is the identifier that used by ConnexPay support teams to research issues related to the Payment Widget.
   * @return ridReferenceToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For Payment Widget customers only. This is the identifier that used by ConnexPay support teams to research issues related to the Payment Widget.")

  public String getRidReferenceToken() {
    return ridReferenceToken;
  }


  public void setRidReferenceToken(String ridReferenceToken) {
    
    
    
    this.ridReferenceToken = ridReferenceToken;
  }


  public PaymentsDto payeeGuid(UUID payeeGuid) {
    
    
    
    
    this.payeeGuid = payeeGuid;
    return this;
  }

   /**
   * Unique identifier assigned to the Payee.
   * @return payeeGuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "Unique identifier assigned to the Payee.")

  public UUID getPayeeGuid() {
    return payeeGuid;
  }


  public void setPayeeGuid(UUID payeeGuid) {
    
    
    
    this.payeeGuid = payeeGuid;
  }


  public PaymentsDto paymentGuid(UUID paymentGuid) {
    
    
    
    
    this.paymentGuid = paymentGuid;
    return this;
  }

   /**
   * Unique identifier assigned to the Payment.
   * @return paymentGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Unique identifier assigned to the Payment.")

  public UUID getPaymentGuid() {
    return paymentGuid;
  }


  public void setPaymentGuid(UUID paymentGuid) {
    
    
    
    this.paymentGuid = paymentGuid;
  }


  public PaymentsDto ridGuid(UUID ridGuid) {
    
    
    
    
    this.ridGuid = ridGuid;
    return this;
  }

   /**
   * Unique identifier assigned when using the Payment Widget.
   * @return ridGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Unique identifier assigned when using the Payment Widget.")

  public UUID getRidGuid() {
    return ridGuid;
  }


  public void setRidGuid(UUID ridGuid) {
    
    
    
    this.ridGuid = ridGuid;
  }


  public PaymentsDto value(Double value) {
    
    if (value != null && value > 50000) {
      throw new IllegalArgumentException("Invalid value for value. Must be less than or equal to 50000.");
    }
    
    
    this.value = value;
    return this;
  }

   /**
   * Amount of the Payment.
   * maximum: 50000
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Amount of the Payment.")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    
    if (value != null && value > 50000) {
      throw new IllegalArgumentException("Invalid value for value. Must be less than or equal to 50000.");
    }
    
    this.value = value;
  }


  public PaymentsDto memo(String memo) {
    
    
    if (memo != null && memo.length() < 0) {
      throw new IllegalArgumentException("Invalid value for memo. Length must be greater than or equal to 0.");
    }
    
    this.memo = memo;
    return this;
  }

   /**
   * Payment-level description highlighting the reason for this Payment.
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment-level description highlighting the reason for this Payment.")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    
    
    if (memo != null && memo.length() < 0) {
      throw new IllegalArgumentException("Invalid value for memo. Length must be greater than or equal to 0.");
    }
    this.memo = memo;
  }


  public PaymentsDto field2(String field2) {
    
    
    if (field2 != null && field2.length() < 0) {
      throw new IllegalArgumentException("Invalid value for field2. Length must be greater than or equal to 0.");
    }
    
    this.field2 = field2;
    return this;
  }

   /**
   * Additional data field that can be used to provide additional data to the Payee and for your reporting purposes.
   * @return field2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional data field that can be used to provide additional data to the Payee and for your reporting purposes.")

  public String getField2() {
    return field2;
  }


  public void setField2(String field2) {
    
    
    if (field2 != null && field2.length() < 0) {
      throw new IllegalArgumentException("Invalid value for field2. Length must be greater than or equal to 0.");
    }
    this.field2 = field2;
  }


  public PaymentsDto field3(String field3) {
    
    
    if (field3 != null && field3.length() < 0) {
      throw new IllegalArgumentException("Invalid value for field3. Length must be greater than or equal to 0.");
    }
    
    this.field3 = field3;
    return this;
  }

   /**
   * Additional data field that can be used to provide additional data to the Payee and for your reporting purposes.
   * @return field3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional data field that can be used to provide additional data to the Payee and for your reporting purposes.")

  public String getField3() {
    return field3;
  }


  public void setField3(String field3) {
    
    
    if (field3 != null && field3.length() < 0) {
      throw new IllegalArgumentException("Invalid value for field3. Length must be greater than or equal to 0.");
    }
    this.field3 = field3;
  }


  public PaymentsDto field4(String field4) {
    
    
    if (field4 != null && field4.length() < 0) {
      throw new IllegalArgumentException("Invalid value for field4. Length must be greater than or equal to 0.");
    }
    
    this.field4 = field4;
    return this;
  }

   /**
   * Additional data field that can be used to provide additional data to the Payee and for your reporting purposes.
   * @return field4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional data field that can be used to provide additional data to the Payee and for your reporting purposes.")

  public String getField4() {
    return field4;
  }


  public void setField4(String field4) {
    
    
    if (field4 != null && field4.length() < 0) {
      throw new IllegalArgumentException("Invalid value for field4. Length must be greater than or equal to 0.");
    }
    this.field4 = field4;
  }


  public PaymentsDto field5(String field5) {
    
    
    if (field5 != null && field5.length() < 0) {
      throw new IllegalArgumentException("Invalid value for field5. Length must be greater than or equal to 0.");
    }
    
    this.field5 = field5;
    return this;
  }

   /**
   * Additional data field that can be used to provide additional data to the Payee and for your reporting purposes.
   * @return field5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional data field that can be used to provide additional data to the Payee and for your reporting purposes.")

  public String getField5() {
    return field5;
  }


  public void setField5(String field5) {
    
    
    if (field5 != null && field5.length() < 0) {
      throw new IllegalArgumentException("Invalid value for field5. Length must be greater than or equal to 0.");
    }
    this.field5 = field5;
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
   * @return the PaymentsDto instance itself
   */
  public PaymentsDto putAdditionalProperty(String key, Object value) {
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
    PaymentsDto paymentsDto = (PaymentsDto) o;
    return Objects.equals(this.payeeReferenceToken, paymentsDto.payeeReferenceToken) &&
        Objects.equals(this.ridReferenceToken, paymentsDto.ridReferenceToken) &&
        Objects.equals(this.payeeGuid, paymentsDto.payeeGuid) &&
        Objects.equals(this.paymentGuid, paymentsDto.paymentGuid) &&
        Objects.equals(this.ridGuid, paymentsDto.ridGuid) &&
        Objects.equals(this.value, paymentsDto.value) &&
        Objects.equals(this.memo, paymentsDto.memo) &&
        Objects.equals(this.field2, paymentsDto.field2) &&
        Objects.equals(this.field3, paymentsDto.field3) &&
        Objects.equals(this.field4, paymentsDto.field4) &&
        Objects.equals(this.field5, paymentsDto.field5)&&
        Objects.equals(this.additionalProperties, paymentsDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payeeReferenceToken, ridReferenceToken, payeeGuid, paymentGuid, ridGuid, value, memo, field2, field3, field4, field5, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsDto {\n");
    sb.append("    payeeReferenceToken: ").append(toIndentedString(payeeReferenceToken)).append("\n");
    sb.append("    ridReferenceToken: ").append(toIndentedString(ridReferenceToken)).append("\n");
    sb.append("    payeeGuid: ").append(toIndentedString(payeeGuid)).append("\n");
    sb.append("    paymentGuid: ").append(toIndentedString(paymentGuid)).append("\n");
    sb.append("    ridGuid: ").append(toIndentedString(ridGuid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    field2: ").append(toIndentedString(field2)).append("\n");
    sb.append("    field3: ").append(toIndentedString(field3)).append("\n");
    sb.append("    field4: ").append(toIndentedString(field4)).append("\n");
    sb.append("    field5: ").append(toIndentedString(field5)).append("\n");
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
    openapiFields.add("payeeReferenceToken");
    openapiFields.add("ridReferenceToken");
    openapiFields.add("payeeGuid");
    openapiFields.add("paymentGuid");
    openapiFields.add("ridGuid");
    openapiFields.add("value");
    openapiFields.add("memo");
    openapiFields.add("field2");
    openapiFields.add("field3");
    openapiFields.add("field4");
    openapiFields.add("field5");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payeeGuid");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentsDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentsDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentsDto is not found in the empty JSON string", PaymentsDto.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentsDto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("payeeReferenceToken") != null && !jsonObj.get("payeeReferenceToken").isJsonNull()) && !jsonObj.get("payeeReferenceToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payeeReferenceToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payeeReferenceToken").toString()));
      }
      if ((jsonObj.get("ridReferenceToken") != null && !jsonObj.get("ridReferenceToken").isJsonNull()) && !jsonObj.get("ridReferenceToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ridReferenceToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ridReferenceToken").toString()));
      }
      if (!jsonObj.get("payeeGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payeeGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payeeGuid").toString()));
      }
      if ((jsonObj.get("paymentGuid") != null && !jsonObj.get("paymentGuid").isJsonNull()) && !jsonObj.get("paymentGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentGuid").toString()));
      }
      if ((jsonObj.get("ridGuid") != null && !jsonObj.get("ridGuid").isJsonNull()) && !jsonObj.get("ridGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ridGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ridGuid").toString()));
      }
      if ((jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if ((jsonObj.get("field2") != null && !jsonObj.get("field2").isJsonNull()) && !jsonObj.get("field2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field2").toString()));
      }
      if ((jsonObj.get("field3") != null && !jsonObj.get("field3").isJsonNull()) && !jsonObj.get("field3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field3").toString()));
      }
      if ((jsonObj.get("field4") != null && !jsonObj.get("field4").isJsonNull()) && !jsonObj.get("field4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field4").toString()));
      }
      if ((jsonObj.get("field5") != null && !jsonObj.get("field5").isJsonNull()) && !jsonObj.get("field5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field5").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentsDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentsDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentsDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentsDto.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentsDto>() {
           @Override
           public void write(JsonWriter out, PaymentsDto value) throws IOException {
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
           public PaymentsDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentsDto instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentsDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentsDto
  * @throws IOException if the JSON string is invalid with respect to PaymentsDto
  */
  public static PaymentsDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentsDto.class);
  }

 /**
  * Convert an instance of PaymentsDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

