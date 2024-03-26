

# SaleCreateTransactionRequestBankAccount

Customer's Bank Account information. Mandatory if TenderType is ACH. This will be ignored if TenderType is Cash or Credit

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountType** | **String** | Accepted account types are: Saving or Checking |  |
|**routingNumber** | **String** | 9 Digit routing number |  |
|**accountNumber** | **String** | Account number up to 20 characters |  |
|**nameOnAccount** | **String** | Name on the account for ACH transfer (upto 50 characters) |  |
|**accountAndRoutingNumberToken** | **String** | Encrypted Token previously assigned to Bank Account. Either AccountAndRoutingNumberToken or both AccountNumber  and RoutingNumber  should be provided. |  [optional] |
|**customer** | [**SaleCreateTransactionRequestBankAccountCustomer**](SaleCreateTransactionRequestBankAccountCustomer.md) |  |  [optional] |



