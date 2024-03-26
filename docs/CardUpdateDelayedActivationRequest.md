

# CardUpdateDelayedActivationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantGuid** | **String** | Merchant&#39;s guid. Application level value that indicates a virtual card is being requested for clients account. Value provided by ConnexPay. |  |
|**activationDate** | **LocalDate** | Provide a future date, up to 600 days, if you wish to update the virtual card&#39;s activation date. Otherwise leave blank. |  [optional] |
|**amountLimit** | **Float** | Provide a card amount if you wish to update the amount limit for the virtual card, otherwise leave blank. |  [optional] |
|**terminateDate** | **LocalDate** | The TerminateDate (YYYY-MM-DD format) is the date the Virtual Credit Card will be terminated by ConnexPay. TerminateDate is different than ExpirationDate in that TerminateDate indicates the actual date the card will no longer be active.  ExpirationDate is the month and year that will be applied to the actual VCC. The recommendation is to set the ExpirationDate one or two years in the future and set the TerminateDate just a day or two after the VCC is expected to be processed. Note, Returns can still be processed on terminated VCCs. |  [optional] |



