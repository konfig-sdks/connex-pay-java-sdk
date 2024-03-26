

# VoidCreateVoidRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceGuid** | **String** | Device’s Guid provided by ConnexPay. |  |
|**saleGuid** | **String** | Sale Transaction Guid |  [optional] |
|**returnGuid** | **String** | Return&#39;s Guid |  [optional] |
|**saleReferenceNumber** | **Integer** | Sale Reference Number |  [optional] |
|**authOnlyGuid** | **String** | Guid to include in request when voiding an Auth Only request. |  [optional] |
|**voidReason** | **String** | Indicates the reason the transaction was voided.  Allowed values:  1. POST_AUTH_USER_DECLINE 2. DEVICE_TIMEOUT 3. DEVICE_UNAVAILABLE 4. PARTIAL_REVERSAL 5. TORN_TRANSACTIONS 6. POST_AUTH_CHIP_DECLINE |  [optional] |
|**amount** | **Float** | Amount to be voided.  Note: Amount is be used once only for credit card Sales and should not exceed corresponding Sale’s Amount. |  [optional] |
|**sequenceNumber** | **String** | Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric. |  [optional] |



