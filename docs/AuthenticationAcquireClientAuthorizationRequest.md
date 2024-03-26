

# AuthenticationAcquireClientAuthorizationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceGuid** | **String** | Device&#39;s Guid provided by ConnexPay. |  |
|**amount** | **Float** | Amount of the transaction that will be processed. Note: this value is submitted multiple times (in different formats) within the integration to support different purposes i.e. risk analysis, merchant processing, etc.  The minimum amount is: $0.50. |  |
|**sequenceNumber** | **String** | Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric. |  [optional] |
|**orderNumber** | **String** | This is the most common number you&#39;ll see throughout the ConnexPay Portal.  Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field.  The maximum length is 50 alpha-numeric characters. |  [optional] |
|**sendReceipt** | **Boolean** | Value determines whether or not a customer shall be emailed a receipt from the ConnexPay platform if the email address is provided in the API customer block. The default value is TRUE. Set to FALSE so that an email receipt is not sent to the customer. Set to TRUE or leave empty if you want e-mail to be sent. If TRUE, customer&#39;s email must be included in the \&quot;Card.Customer.email\&quot; parameter. |  [optional] |
|**statementDescription** | **String** | US Clients only: The statement description allows a client to customize the Merchant name that appears on the cardholder statement such that the cardholder recognizes the transaction on their statement. ConnexPay recommends sending a recognizable DBA along with the PNR i.e. ABC Travel ABC123. Note: functionality not applicable for American Express OptBlue program.  The maximun length is 25 alpha-numeric characters. |  [optional] |
|**customerID** | **String** | Transaction ID within client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes.  The maximum length is 100 characters and is alpha-numeric. |  [optional] |
|**riskData** | [**AuthenticationAcquireClientAuthorizationRequestRiskData**](AuthenticationAcquireClientAuthorizationRequestRiskData.md) |  |  |
|**card** | [**AuthenticationAcquireClientAuthorizationRequestCard**](AuthenticationAcquireClientAuthorizationRequestCard.md) |  |  [optional] |
|**bankAccount** | [**AuthenticationAcquireClientAuthorizationRequestBankAccount**](AuthenticationAcquireClientAuthorizationRequestBankAccount.md) |  |  [optional] |
|**customer** | [**SaleCreateTransactionRequestCustomer**](SaleCreateTransactionRequestCustomer.md) |  |  [optional] |
|**enhancedData** | [**SaleCreateTransactionRequestEnhancedData**](SaleCreateTransactionRequestEnhancedData.md) |  |  [optional] |
|**associationID** | **String** | Utilize the Association ID field to tie a virtual card to a sale or sales. For example, if you have several sales and one virtual card payment to a supplier, you can add association ID to the sales and the virtual card for downstream reporting. |  [optional] |
|**browserData** | [**AuthenticationAcquireClientAuthorizationRequestBrowserData**](AuthenticationAcquireClientAuthorizationRequestBrowserData.md) |  |  [optional] |



