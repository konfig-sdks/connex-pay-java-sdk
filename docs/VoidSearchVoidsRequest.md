

# VoidSearchVoidsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantGuid** | **String** | Merchant’s Guid. |  [optional] |
|**voidReason** | **String** | Indicates the reason the transaction was voided.  Allowed values:  1. POST_AUTH_USER_DECLINE 2. DEVICE_TIMEOUT 3. DEVICE_UNAVAILABLE 4. PARTIAL_REVERSAL 5. TORN_TRANSACTIONS 6. POST_AUTH_CHIP_DECLINE |  [optional] |
|**status** | **String** | Void’s status.  Allowed values:  1. Transaction - Approved 2. Transaction - Declined 3. Transaction - Created - Local 4. Transaction - Created - Error: Processor not reached 5. Transaction - Processor Error 6. Transaction - Approved - Warning |  [optional] |
|**timeStampFrom** | **LocalDate** | Void’s TimeStamp. |  [optional] |
|**timeStampTo** | **LocalDate** | Void’s TimeStamp. |  [optional] |



