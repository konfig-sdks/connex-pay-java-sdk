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
 * VoidCreateVoidResponseSaleCardCustomer
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VoidCreateVoidResponseSaleCardCustomer {
  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_ADDRESS1 = "address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_DRIVER_LICENSE_NUMBER = "driverLicenseNumber";
  @SerializedName(SERIALIZED_NAME_DRIVER_LICENSE_NUMBER)
  private String driverLicenseNumber;

  public static final String SERIALIZED_NAME_DRIVER_LICENSE_STATE = "driverLicenseState";
  @SerializedName(SERIALIZED_NAME_DRIVER_LICENSE_STATE)
  private String driverLicenseState;

  public static final String SERIALIZED_NAME_SS_N4 = "ssN4";
  @SerializedName(SERIALIZED_NAME_SS_N4)
  private String ssN4;

  public VoidCreateVoidResponseSaleCardCustomer() {
  }

  public VoidCreateVoidResponseSaleCardCustomer guid(String guid) {
    
    
    
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d1cf828d-3050-4e4c-b7cf-f4038d114d39", value = "")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    
    
    
    this.guid = guid;
  }


  public VoidCreateVoidResponseSaleCardCustomer firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public VoidCreateVoidResponseSaleCardCustomer lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Doe", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public VoidCreateVoidResponseSaleCardCustomer phone(String phone) {
    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9177563007", value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    
    this.phone = phone;
  }


  public VoidCreateVoidResponseSaleCardCustomer city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "New York", value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public VoidCreateVoidResponseSaleCardCustomer country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public VoidCreateVoidResponseSaleCardCustomer email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "johnd@gmail.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public VoidCreateVoidResponseSaleCardCustomer zip(String zip) {
    
    
    
    
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10007", value = "")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    
    
    
    this.zip = zip;
  }


  public VoidCreateVoidResponseSaleCardCustomer address1(String address1) {
    
    
    
    
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "107 7th Av.", value = "")

  public String getAddress1() {
    return address1;
  }


  public void setAddress1(String address1) {
    
    
    
    this.address1 = address1;
  }


  public VoidCreateVoidResponseSaleCardCustomer address2(String address2) {
    
    
    
    
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getAddress2() {
    return address2;
  }


  public void setAddress2(String address2) {
    
    
    
    this.address2 = address2;
  }


  public VoidCreateVoidResponseSaleCardCustomer state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NY", value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public VoidCreateVoidResponseSaleCardCustomer dateOfBirth(String dateOfBirth) {
    
    
    
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1987-07-07T00:00:00", value = "")

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {
    
    
    
    this.dateOfBirth = dateOfBirth;
  }


  public VoidCreateVoidResponseSaleCardCustomer driverLicenseNumber(String driverLicenseNumber) {
    
    
    
    
    this.driverLicenseNumber = driverLicenseNumber;
    return this;
  }

   /**
   * Get driverLicenseNumber
   * @return driverLicenseNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12345678", value = "")

  public String getDriverLicenseNumber() {
    return driverLicenseNumber;
  }


  public void setDriverLicenseNumber(String driverLicenseNumber) {
    
    
    
    this.driverLicenseNumber = driverLicenseNumber;
  }


  public VoidCreateVoidResponseSaleCardCustomer driverLicenseState(String driverLicenseState) {
    
    
    
    
    this.driverLicenseState = driverLicenseState;
    return this;
  }

   /**
   * Get driverLicenseState
   * @return driverLicenseState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TX", value = "")

  public String getDriverLicenseState() {
    return driverLicenseState;
  }


  public void setDriverLicenseState(String driverLicenseState) {
    
    
    
    this.driverLicenseState = driverLicenseState;
  }


  public VoidCreateVoidResponseSaleCardCustomer ssN4(String ssN4) {
    
    
    
    
    this.ssN4 = ssN4;
    return this;
  }

   /**
   * Get ssN4
   * @return ssN4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1210", value = "")

  public String getSsN4() {
    return ssN4;
  }


  public void setSsN4(String ssN4) {
    
    
    
    this.ssN4 = ssN4;
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
   * @return the VoidCreateVoidResponseSaleCardCustomer instance itself
   */
  public VoidCreateVoidResponseSaleCardCustomer putAdditionalProperty(String key, Object value) {
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
    VoidCreateVoidResponseSaleCardCustomer voidCreateVoidResponseSaleCardCustomer = (VoidCreateVoidResponseSaleCardCustomer) o;
    return Objects.equals(this.guid, voidCreateVoidResponseSaleCardCustomer.guid) &&
        Objects.equals(this.firstName, voidCreateVoidResponseSaleCardCustomer.firstName) &&
        Objects.equals(this.lastName, voidCreateVoidResponseSaleCardCustomer.lastName) &&
        Objects.equals(this.phone, voidCreateVoidResponseSaleCardCustomer.phone) &&
        Objects.equals(this.city, voidCreateVoidResponseSaleCardCustomer.city) &&
        Objects.equals(this.country, voidCreateVoidResponseSaleCardCustomer.country) &&
        Objects.equals(this.email, voidCreateVoidResponseSaleCardCustomer.email) &&
        Objects.equals(this.zip, voidCreateVoidResponseSaleCardCustomer.zip) &&
        Objects.equals(this.address1, voidCreateVoidResponseSaleCardCustomer.address1) &&
        Objects.equals(this.address2, voidCreateVoidResponseSaleCardCustomer.address2) &&
        Objects.equals(this.state, voidCreateVoidResponseSaleCardCustomer.state) &&
        Objects.equals(this.dateOfBirth, voidCreateVoidResponseSaleCardCustomer.dateOfBirth) &&
        Objects.equals(this.driverLicenseNumber, voidCreateVoidResponseSaleCardCustomer.driverLicenseNumber) &&
        Objects.equals(this.driverLicenseState, voidCreateVoidResponseSaleCardCustomer.driverLicenseState) &&
        Objects.equals(this.ssN4, voidCreateVoidResponseSaleCardCustomer.ssN4)&&
        Objects.equals(this.additionalProperties, voidCreateVoidResponseSaleCardCustomer.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, firstName, lastName, phone, city, country, email, zip, address1, address2, state, dateOfBirth, driverLicenseNumber, driverLicenseState, ssN4, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoidCreateVoidResponseSaleCardCustomer {\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    driverLicenseNumber: ").append(toIndentedString(driverLicenseNumber)).append("\n");
    sb.append("    driverLicenseState: ").append(toIndentedString(driverLicenseState)).append("\n");
    sb.append("    ssN4: ").append(toIndentedString(ssN4)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("phone");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("email");
    openapiFields.add("zip");
    openapiFields.add("address1");
    openapiFields.add("address2");
    openapiFields.add("state");
    openapiFields.add("dateOfBirth");
    openapiFields.add("driverLicenseNumber");
    openapiFields.add("driverLicenseState");
    openapiFields.add("ssN4");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoidCreateVoidResponseSaleCardCustomer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VoidCreateVoidResponseSaleCardCustomer.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoidCreateVoidResponseSaleCardCustomer is not found in the empty JSON string", VoidCreateVoidResponseSaleCardCustomer.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull()) && !jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
      if ((jsonObj.get("address1") != null && !jsonObj.get("address1").isJsonNull()) && !jsonObj.get("address1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address1").toString()));
      }
      if ((jsonObj.get("address2") != null && !jsonObj.get("address2").isJsonNull()) && !jsonObj.get("address2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address2").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("dateOfBirth") != null && !jsonObj.get("dateOfBirth").isJsonNull()) && !jsonObj.get("dateOfBirth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateOfBirth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateOfBirth").toString()));
      }
      if ((jsonObj.get("driverLicenseNumber") != null && !jsonObj.get("driverLicenseNumber").isJsonNull()) && !jsonObj.get("driverLicenseNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driverLicenseNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driverLicenseNumber").toString()));
      }
      if ((jsonObj.get("driverLicenseState") != null && !jsonObj.get("driverLicenseState").isJsonNull()) && !jsonObj.get("driverLicenseState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driverLicenseState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driverLicenseState").toString()));
      }
      if ((jsonObj.get("ssN4") != null && !jsonObj.get("ssN4").isJsonNull()) && !jsonObj.get("ssN4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssN4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssN4").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoidCreateVoidResponseSaleCardCustomer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoidCreateVoidResponseSaleCardCustomer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoidCreateVoidResponseSaleCardCustomer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoidCreateVoidResponseSaleCardCustomer.class));

       return (TypeAdapter<T>) new TypeAdapter<VoidCreateVoidResponseSaleCardCustomer>() {
           @Override
           public void write(JsonWriter out, VoidCreateVoidResponseSaleCardCustomer value) throws IOException {
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
           public VoidCreateVoidResponseSaleCardCustomer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoidCreateVoidResponseSaleCardCustomer instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoidCreateVoidResponseSaleCardCustomer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoidCreateVoidResponseSaleCardCustomer
  * @throws IOException if the JSON string is invalid with respect to VoidCreateVoidResponseSaleCardCustomer
  */
  public static VoidCreateVoidResponseSaleCardCustomer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoidCreateVoidResponseSaleCardCustomer.class);
  }

 /**
  * Convert an instance of VoidCreateVoidResponseSaleCardCustomer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

