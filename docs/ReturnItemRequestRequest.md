

# ReturnItemRequestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceGuid** | **String** | Device&#39;s Guid |  |
|**saleGuid** | **String** | Mandatory when SaleReferenceNumber field is not sent. Sale&#39;s Guid. |  [optional] |
|**saleReferenceNumber** | **Integer** | Mandatory when SaleGuid field is not sent. Sale&#39;s Reference Number |  [optional] |
|**amount** | **Float** | Transaction’s amount. Min. amt.: $0.50 |  |
|**sequenceNumber** | **String** | Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric. |  [optional] |
|**returnRetryCard** | [**ReturnItemRequestRequestReturnRetryCard**](ReturnItemRequestRequestReturnRetryCard.md) |  |  [optional] |



