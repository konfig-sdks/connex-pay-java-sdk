

# SaleCreateTransactionRequestCardCustomer

Customer data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | Mandatory for ACH Sales.  Min Length &#x3D; 2 Max Length &#x3D; 30 |  [optional] |
|**lastName** | **String** | Mandatory for ACH Sales. Min Length &#x3D; 2 Max Length &#x3D; 30 |  [optional] |
|**phone** | **String** | Customer&#39;s phone number. Phone number up to 15 characters. Numbers and plus sign (+) allowed only. |  [optional] |
|**city** | **String** | Customer&#39;s City |  [optional] |
|**state** | **String** | Customer&#39;s short name state.  The ISO 3166-2 CA and US state or province code of a customer. Length &#x3D; 2. |  [optional] |
|**country** | **String** | Customer&#39;s country. The ISO country code of a customer’s country.  Length &#x3D; 2 |  [optional] |
|**email** | **String** | Customer&#39;s valid email address which is available in various reports. It is critical that SendReceipt is set to FALSE so that ConnexPay does not send a receipt to the cardholder when the transaction is processed |  [optional] |
|**address1** | **String** | Customer billing address 1. It is strongly recommended to send this value in a card-not-present environment such that enhanced Address Validation (AVS) can be performed on transaction and the lowest possible interchange is received on transaction. Note: only the street number value portion of address is used for enhanced AVS check |  [optional] |
|**address2** | **String** | Customer billing address 2. It is strongly recommended to send this value in a card-not-present environment such that Address Validation (AVS) can be performed on transaction and the lowest possible interchange is received on transaction |  [optional] |
|**zip** | **String** | Customer billing postal code. It is strongly recommended to send this value in a card-not-present environment such that basic Address Validation (AVS) can be performed on transaction and the lowest possible interchange is received on transaction.  Only the a standard U.S. 5 digit zip code is eligible for basic AVS check. Min Length &#x3D; 2 Max Length &#x3D; 15. Alphanumerics and \&quot;-\&quot; allowed. |  [optional] |
|**dateOfBirth** | **LocalDate** | Customer&#39;s date of birth. Allowed format: YYYY-MM-DD. For example: 2002-05-30 |  [optional] |
|**driversLicenseNumber** | **Integer** | Customer&#39;s driver license number.  Only letters, numbers and a hyphen is allowed |  [optional] |
|**driversLicenseState** | **String** | Mandatory when DriverLicenseNumber is provided. Customer&#39;s driver license short name state. The ISO 3166-2 CA and US state or province code of a customer.  Length &#x3D; 2 |  [optional] |
|**SSN4** | **Integer** | Last 4 of Customer&#39;s Social Security Number |  [optional] |



