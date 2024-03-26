

# ValidationSearchVerifyOperationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantGuid** | **String** | Merchant’s Guid. |  [optional] |
|**cardLastFour** | **String** | Card last four number. |  [optional] |
|**cardHolderName** | **String** | Cardholder’s name. Providing information in this field allows a user of the ConnexPay portal to search for a transaction using the cardholder name. |  [optional] |
|**cardType** | **String** | Card Type. |  [optional] |
|**timeStampFrom** | **LocalDate** | Verify’s TimeStamp From. |  [optional] |
|**timeStampTo** | **LocalDate** | Verify’s TimeStamp To. |  [optional] |
|**status** | **String** | Verify’s status.  Allowed values:  1. Transaction - Approved 2. Transaction - Declined 3. Transaction - Created - Local 4. Transaction - Created - Error: Processor not reached 5. Transaction - Processor Error 6. Transaction - Approved - Warning |  [optional] |



