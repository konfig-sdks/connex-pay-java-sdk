

# SaleUpdateDelayedActivationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceGuid** | **String** | Device&#39;s Guid provided by ConnexPay. |  |
|**saleGuid** | **String** | Sales&#39;s Guid that was provided by ConnexPay upon initial creation of the delayed activation sale. |  |
|**amount** | **Float** | Amount of the transaction that will be processed. Note: this value is submitted multiple times (in different formats) within the integration to support different purposes i.e. risk analysis, merchant processing, etc.  The minimun amount is: $0.50. |  |
|**activationDate** | **LocalDate** | Set a future date on which to run this sale, at least one day from creation date and within 600 days. |  [optional] |



