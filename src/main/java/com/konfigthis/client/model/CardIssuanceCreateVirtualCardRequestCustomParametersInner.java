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
 * CardIssuanceCreateVirtualCardRequestCustomParametersInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CardIssuanceCreateVirtualCardRequestCustomParametersInner {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public CardIssuanceCreateVirtualCardRequestCustomParametersInner() {
  }

  public CardIssuanceCreateVirtualCardRequestCustomParametersInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The custom parameter name can be anything you want to label the field. You can include as many custom parameters as needed to provide additional data to be included for the virtual card.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The custom parameter name can be anything you want to label the field. You can include as many custom parameters as needed to provide additional data to be included for the virtual card.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CardIssuanceCreateVirtualCardRequestCustomParametersInner value(String value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * The value associated with this parameter. For example, if you are including an invoice number with your virtual card request, you would populate the custom parameter &#39;Name&#39; as &#39;Invoice&#39; and the custom parameter &#39;Value&#39; as the invoice number.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value associated with this parameter. For example, if you are including an invoice number with your virtual card request, you would populate the custom parameter 'Name' as 'Invoice' and the custom parameter 'Value' as the invoice number.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    
    
    
    this.value = value;
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
   * @return the CardIssuanceCreateVirtualCardRequestCustomParametersInner instance itself
   */
  public CardIssuanceCreateVirtualCardRequestCustomParametersInner putAdditionalProperty(String key, Object value) {
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
    CardIssuanceCreateVirtualCardRequestCustomParametersInner cardIssuanceCreateVirtualCardRequestCustomParametersInner = (CardIssuanceCreateVirtualCardRequestCustomParametersInner) o;
    return Objects.equals(this.name, cardIssuanceCreateVirtualCardRequestCustomParametersInner.name) &&
        Objects.equals(this.value, cardIssuanceCreateVirtualCardRequestCustomParametersInner.value)&&
        Objects.equals(this.additionalProperties, cardIssuanceCreateVirtualCardRequestCustomParametersInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardIssuanceCreateVirtualCardRequestCustomParametersInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardIssuanceCreateVirtualCardRequestCustomParametersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CardIssuanceCreateVirtualCardRequestCustomParametersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardIssuanceCreateVirtualCardRequestCustomParametersInner is not found in the empty JSON string", CardIssuanceCreateVirtualCardRequestCustomParametersInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonNull()) && !jsonObj.get("Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardIssuanceCreateVirtualCardRequestCustomParametersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardIssuanceCreateVirtualCardRequestCustomParametersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardIssuanceCreateVirtualCardRequestCustomParametersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardIssuanceCreateVirtualCardRequestCustomParametersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CardIssuanceCreateVirtualCardRequestCustomParametersInner>() {
           @Override
           public void write(JsonWriter out, CardIssuanceCreateVirtualCardRequestCustomParametersInner value) throws IOException {
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
           public CardIssuanceCreateVirtualCardRequestCustomParametersInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CardIssuanceCreateVirtualCardRequestCustomParametersInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CardIssuanceCreateVirtualCardRequestCustomParametersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardIssuanceCreateVirtualCardRequestCustomParametersInner
  * @throws IOException if the JSON string is invalid with respect to CardIssuanceCreateVirtualCardRequestCustomParametersInner
  */
  public static CardIssuanceCreateVirtualCardRequestCustomParametersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardIssuanceCreateVirtualCardRequestCustomParametersInner.class);
  }

 /**
  * Convert an instance of CardIssuanceCreateVirtualCardRequestCustomParametersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

