

# SaleCreateTransactionRequestRiskData

Mandatory if TenderType is Credit or not set. This will be ignored if TenderType is Cash or ACH

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sessionId** | **String** | If you are using Kount&#39;s Device Data Collector, this would be the SessionId from that particular session. Do not include this property if not using Kount&#39;s Device Data Collector. |  [optional] |
|**name** | **String** | This is the name of the individual making the purchase i.e. cardholder who may or may not also be the customer. This value is submitted in multiple integration points for different purposes. This value/object is specific to fraud mitigation. Note: for airline ticket purchases this value may or may not be the same as the passenger. Max Length &#x3D; 64 |  [optional] |
|**gender** | **String** | Cardholder gender. \&quot;M\&quot; or \&quot;F\&quot;. |  [optional] |
|**dateOfBirth** | **String** | Cardholder date of birth |  [optional] |
|**billingPhoneNumber** | **String** | Phone number associated with cardholder making purchase. Cardholder billing phone number. More specifically, can be used for rule creation or additional identity validation using the White Pages Pro add on option.  Phone number up to 15 characters. Numbers and plus sign (+) allowed only. |  [optional] |
|**billingAddress1** | **String** | Cardholder billing address 1. This value is used in risk analysis and decisioning. More specifically, can be used for rule creation or additional identity validation using the White Pages Pro add on option. |  [optional] |
|**billingAddress2** | **String** | Cardholder billing address 2. This value is used in risk analysis and decisioning. More specifically, can be used for rule creation or additional identity validation using the White Pages Pro add on option. |  [optional] |
|**billingCity** | **String** | Cardholder billing city. This value is used in risk analysis and decisioning. More specifically, can be used for rule creation or additional identity validation using the White Pages Pro add on option. |  [optional] |
|**billingState** | **String** | Cardholder billing state. This value is used in risk analysis and decisioning. More specifically, can be used for rule creation or additional identity validation using the White Pages Pro add on option. |  [optional] |
|**billingPostalCode** | **String** | Cardholder billing postal code. This value is used in risk analysis and decisioning. More specifically, can be used for rule creation or additional identity validation using the White Pages Pro add on option. Max Length &#x3D; 15. Alphanumerics and \&quot;-\&quot; allowed. |  [optional] |
|**billingCountryCode** | **String** | Cardholder billing country code. This value is used in risk analysis and decisioning. More specifically, can be used for rule creation or additional identity validation using the White Pages Pro add on option.  Length &#x3D; 2. |  [optional] |
|**email** | **String** | Cardholder&#39;s valid email address. This value is used in risk analysis and decisioning. More specifically, can be used for rule creation or additional identity validation using the White Pages Pro add on option. |  [optional] |
|**productType** | **String** | Generalized description of the item added passed as plain text. This could be flight, tour, hotel, etc. (This is part of shopping cart information in Kount Console). Each transaction submitted for risk analysis and decisioning must be submitted with one shopping cart item. |  [optional] |
|**productDescription** | **String** | Attribute for a specific description of the item being purchased i.e. airline ticket. This information is general shopping cart information that describes the type of item being purchased. ConnexPay suggests clients submitted a high level description such as Flight, Hotel, Car Rental, etc... and leverage custom parameters to submit more detailed information that can be used for rule creation and transaction decisioning. |  [optional] |
|**productItem** | **String** | Typically the SKU for an item passed as plain text. This information is general shopping cart information to provide secondary detail to the ProductDesc above. ConnexPay suggests clients submit a high level description such as One Way, Round Trip, Seven Nights, etc...and several customer parameters to submit more detailed information that can be used for rule creation and transaction decisioning.  Field is required by Kount therefore some value must be submitted. Alphanumeric. |  [optional] |
|**productQuantity** | **Integer** | Quantity of the item being purchased in the shopping cart. This is just a general quantity field. |  [optional] |
|**productPrice** | **Integer** | Price per unit item, displayed in lowest currency factor - expressed in cents. Example: 42400 (which is $424.00). |  [optional] |
|**orderNumber** | **String** | Transaction ID within client environment associated with the order. The value is searchable and reportable in the Kount portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field.  The maximum length is 32 alpha-numeric characters and allows dashes ( - ). |  [optional] |
|**sellerId** | **String** | Transaction ID within client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the Kount portal. This value may be sent in multiple times within the integration for multiple purposes.  The maximum length is 32 characters. |  [optional] |
|**flightData** | [**SaleCreateTransactionRequestRiskDataFlightData**](SaleCreateTransactionRequestRiskDataFlightData.md) |  |  [optional] |
|**flightPassengers** | [**List&lt;SaleCreateTransactionRequestRiskDataFlightPassengersInner&gt;**](SaleCreateTransactionRequestRiskDataFlightPassengersInner.md) |  |  [optional] |
|**customParameters** | **Object** | Custom Parameters. Array. |  [optional] |



