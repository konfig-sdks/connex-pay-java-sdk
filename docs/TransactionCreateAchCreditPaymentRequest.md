

# TransactionCreateAchCreditPaymentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantGuid** | **String** | Merchant&#39;s guid. Application level value that indicates the ACH payment is being requested for clients account. Value provided by ConnexPay. |  |
|**amount** | **Float** | Payment amount. Minimum amount &gt; 0.5. |  |
|**payeeName** | **String** | Payee name up to 100 characters. |  |
|**statementCompanyName** | **String** | Company Name to display Bank Statement. The first 16 characters will display on the bank account holders statement. |  [optional] |
|**description** | **String** | For banks who accept statement descriptors, the first 10 characters will display on the bank account holders statement. |  [optional] |
|**incomingTransactionCode** | **String** | ITC for short Application level setting to associate the ACH payment request with an original sale or sale group. The value is provided in the sale response of the original sale transaction, or in the Group Sale response of the group sale. All ACH payment requests must be associated with an original sale or group transaction. |  |
|**accountHolder** | [**TransactionCreateAchCreditPaymentRequestAccountHolder**](TransactionCreateAchCreditPaymentRequestAccountHolder.md) |  |  |



