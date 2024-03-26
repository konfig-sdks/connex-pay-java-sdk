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
 * AddendumCreateVirtualCardRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddendumCreateVirtualCardRequest {
  public static final String SERIALIZED_NAME_ITEM_GUID = "ItemGuid";
  @SerializedName(SERIALIZED_NAME_ITEM_GUID)
  private String itemGuid = "Mandatory";

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = "Mandatory";

  public static final String SERIALIZED_NAME_CATEGORY = "Category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category = "Optional";

  public static final String SERIALIZED_NAME_ID_EXTERNAL = "IdExternal";
  @SerializedName(SERIALIZED_NAME_ID_EXTERNAL)
  private String idExternal = "Optional";

  public static final String SERIALIZED_NAME_NOTE = "Note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note = "Optional";

  public static final String SERIALIZED_NAME_SEQUENCE = "Sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private String sequence = "Optional";

  public AddendumCreateVirtualCardRequest() {
  }

  public AddendumCreateVirtualCardRequest itemGuid(String itemGuid) {
    
    
    
    
    this.itemGuid = itemGuid;
    return this;
  }

   /**
   * Guid for the Virtual Card you are attaching information to with this addendum request. This Guid was returned to client when the Virtual Card was initially created.
   * @return itemGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mandatory", value = "Guid for the Virtual Card you are attaching information to with this addendum request. This Guid was returned to client when the Virtual Card was initially created.")

  public String getItemGuid() {
    return itemGuid;
  }


  public void setItemGuid(String itemGuid) {
    
    
    
    this.itemGuid = itemGuid;
  }


  public AddendumCreateVirtualCardRequest value(String value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * Character data to associate with the Virtual card.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mandatory", value = "Character data to associate with the Virtual card.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    
    
    
    this.value = value;
  }


  public AddendumCreateVirtualCardRequest category(String category) {
    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * Can be used by client to specify a desired category for an Addenda item.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Optional", value = "Can be used by client to specify a desired category for an Addenda item.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    
    
    
    this.category = category;
  }


  public AddendumCreateVirtualCardRequest idExternal(String idExternal) {
    
    
    
    
    this.idExternal = idExternal;
    return this;
  }

   /**
   * Can be supplied by client to associate this addendum with an ID in client&#39;s data.
   * @return idExternal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Optional", value = "Can be supplied by client to associate this addendum with an ID in client's data.")

  public String getIdExternal() {
    return idExternal;
  }


  public void setIdExternal(String idExternal) {
    
    
    
    this.idExternal = idExternal;
  }


  public AddendumCreateVirtualCardRequest note(String note) {
    
    
    
    
    this.note = note;
    return this;
  }

   /**
   * Additional information to associate with this addendum, as desired.
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Optional", value = "Additional information to associate with this addendum, as desired.")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    
    
    
    this.note = note;
  }


  public AddendumCreateVirtualCardRequest sequence(String sequence) {
    
    
    
    
    this.sequence = sequence;
    return this;
  }

   /**
   * If client creates multiple addenda for a single Virtual Card this sequence can be specified if a client desires.
   * @return sequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Optional", value = "If client creates multiple addenda for a single Virtual Card this sequence can be specified if a client desires.")

  public String getSequence() {
    return sequence;
  }


  public void setSequence(String sequence) {
    
    
    
    this.sequence = sequence;
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
   * @return the AddendumCreateVirtualCardRequest instance itself
   */
  public AddendumCreateVirtualCardRequest putAdditionalProperty(String key, Object value) {
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
    AddendumCreateVirtualCardRequest addendumCreateVirtualCardRequest = (AddendumCreateVirtualCardRequest) o;
    return Objects.equals(this.itemGuid, addendumCreateVirtualCardRequest.itemGuid) &&
        Objects.equals(this.value, addendumCreateVirtualCardRequest.value) &&
        Objects.equals(this.category, addendumCreateVirtualCardRequest.category) &&
        Objects.equals(this.idExternal, addendumCreateVirtualCardRequest.idExternal) &&
        Objects.equals(this.note, addendumCreateVirtualCardRequest.note) &&
        Objects.equals(this.sequence, addendumCreateVirtualCardRequest.sequence)&&
        Objects.equals(this.additionalProperties, addendumCreateVirtualCardRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemGuid, value, category, idExternal, note, sequence, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddendumCreateVirtualCardRequest {\n");
    sb.append("    itemGuid: ").append(toIndentedString(itemGuid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    idExternal: ").append(toIndentedString(idExternal)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
    openapiFields.add("ItemGuid");
    openapiFields.add("Value");
    openapiFields.add("Category");
    openapiFields.add("IdExternal");
    openapiFields.add("Note");
    openapiFields.add("Sequence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddendumCreateVirtualCardRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddendumCreateVirtualCardRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddendumCreateVirtualCardRequest is not found in the empty JSON string", AddendumCreateVirtualCardRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("ItemGuid") != null && !jsonObj.get("ItemGuid").isJsonNull()) && !jsonObj.get("ItemGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ItemGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ItemGuid").toString()));
      }
      if ((jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonNull()) && !jsonObj.get("Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Value").toString()));
      }
      if ((jsonObj.get("Category") != null && !jsonObj.get("Category").isJsonNull()) && !jsonObj.get("Category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Category").toString()));
      }
      if ((jsonObj.get("IdExternal") != null && !jsonObj.get("IdExternal").isJsonNull()) && !jsonObj.get("IdExternal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IdExternal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IdExternal").toString()));
      }
      if ((jsonObj.get("Note") != null && !jsonObj.get("Note").isJsonNull()) && !jsonObj.get("Note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Note").toString()));
      }
      if ((jsonObj.get("Sequence") != null && !jsonObj.get("Sequence").isJsonNull()) && !jsonObj.get("Sequence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Sequence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Sequence").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddendumCreateVirtualCardRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddendumCreateVirtualCardRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddendumCreateVirtualCardRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddendumCreateVirtualCardRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddendumCreateVirtualCardRequest>() {
           @Override
           public void write(JsonWriter out, AddendumCreateVirtualCardRequest value) throws IOException {
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
           public AddendumCreateVirtualCardRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddendumCreateVirtualCardRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddendumCreateVirtualCardRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddendumCreateVirtualCardRequest
  * @throws IOException if the JSON string is invalid with respect to AddendumCreateVirtualCardRequest
  */
  public static AddendumCreateVirtualCardRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddendumCreateVirtualCardRequest.class);
  }

 /**
  * Convert an instance of AddendumCreateVirtualCardRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

