

# ReplayPurchaseEventHistoryResendRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceGuid** | **String** | The unique GUID for a particular purchase.  This would be the Guid returned on your virtual card, lodged card, physical card or ACH issue call. |  [optional] |
|**merchantGuid** | **String** | Include your Merchant Guid instead of the Source Guid if you want to see all events for a given date range (you must also include the date range parameters) |  [optional] |
|**eventGuid** | **String** | Transaction ID as displayed in Bridge |  [optional] |
|**fromDateTime** | **LocalDate** | From date |  [optional] |
|**toDateTime** | **LocalDate** | To date |  [optional] |



