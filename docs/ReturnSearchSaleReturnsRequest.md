

# ReturnSearchSaleReturnsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantGuid** | **String** | Merchant’s Guid. |  [optional] |
|**amountFrom** | **Float** | Amount of the transaction. Min. amt.: $0.50 |  [optional] |
|**amountTo** | **Float** | Amount of the transaction. Min. amt.: $0.50 |  [optional] |
|**cardHolderName** | **String** | Cardholder’s name. Providing information in this field allows a user of the ConnexPay portal to search for a transaction using the cardholder name. |  [optional] |
|**status** | **String** | Return’s status.  Allowed values:  1. Transaction - Approved 2. Transaction - Declined 3. Transaction - Created - Local 4. Transaction - Created - Error: Processor not reached 5. Transaction - Processor Error 6. Transaction - Approved - Warning |  [optional] |
|**timeStampFrom** | **LocalDate** | Return’s TimeStamp. |  [optional] |
|**timeStampTo** | **LocalDate** | Return’s TimeStamp. |  [optional] |



