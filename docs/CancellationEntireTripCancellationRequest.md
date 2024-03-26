

# CancellationEntireTripCancellationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceGuid** | **String** | Device&#39;s Guid provided by ConnexPay |  |
|**saleGuid** | **String** | Sale transaction Guid |  |
|**sequenceNumber** | **String** | Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric. |  [optional] |
|**voidReason** | **String** | Indicates the reason the transaction was voided |  [optional] |



