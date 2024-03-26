

# AchCreateCreditPaymentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantGuid** | **String** | Merchant&#39;s guid. Application level value that indicates the ACH payment is being requested for clients account. Value provided by ConnexPay. |  |
|**amount** | **Float** | Payment amount with the minimum amount &gt; 0.5. |  |
|**payeeName** | **String** | Payee name up to 100 characters. |  |
|**statementCompanyName** | **String** | Company Name to display Bank Statement. The first 16 characters will display on the bank account holders statement. |  [optional] |
|**description** | **String** | For banks who accept statement descriptors, the first 10 characters will display on the bank account holders statement. |  [optional] |
|**accountHolder** | [**AchCreateCreditPaymentRequestAccountHolder**](AchCreateCreditPaymentRequestAccountHolder.md) |  |  |
|**orderNumber** | **String** | This is the most common number you&#39;ll see throughout the ConnexPay Portal.  Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field.  The maximum length is 50 alpha-numeric characters. |  [optional] |
|**sequenceNumber** | **String** | Transaction sequence number within client environment. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric. |  [optional] |
|**associationId** | **String** | This parameter allows you to input an up to 100 character association ID that can be used to tie this ACH Purchase to a sale (Association ID also needs to be included on the sale request). This is useful if you issue the ACH purchase prior to creating the sale that associates to it. |  [optional] |



