

# SaleSearchSalesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantGuid** | **String** | Merchant’s Guid. |  [optional] |
|**amountFrom** | **Float** | Amount of the transaction. Min. amt.: $0.50 |  [optional] |
|**amountTo** | **Float** | Amount of the transaction. Min. amt.: $0.50 |  [optional] |
|**cardHolderName** | **String** | Cardholder’s name. |  [optional] |
|**cardLastFour** | **String** | Card last four number. |  [optional] |
|**cardType** | **String** | Card type. |  [optional] |
|**invoiceNumber** | **Integer** | Sale’s InvoiceNumber. |  [optional] |
|**orderNumber** | **String** | Sale’s order number. Length &#x3D; 17. |  [optional] |
|**orderDateFrom** | **LocalDate** | Sale’s order Date. |  [optional] |
|**orderDateTo** | **LocalDate** | Sale’s order Date. |  [optional] |
|**timeStampFrom** | **LocalDate** | Sale’s TimeStamp. |  [optional] |
|**timeStampTo** | **LocalDate** | Sale’s TimeStamp. |  [optional] |
|**status** | **String** | Sale’s status. Allowed values:  1. Transaction - Approved 2. Transaction - Declined 3. Transaction - Created - Local 4. Transaction - Created - Error: Processor not reached 5. Transaction - Processor Error 6. Transaction - Approved - Warning |  [optional] |
|**merchantCustomerId** | **String** | Merchant Customer Id. |  [optional] |
|**activated** | **Boolean** | Delayed Activation Sales to be included or not |  [optional] |
|**activationDateFrom** | **LocalDate** | Activation Start Date. This field is applicable only when Activated flag is set to true. |  [optional] |
|**activationDateTo** | **LocalDate** | Activation End Date. This field is applicable only when Activated flag is set to true. |  [optional] |



