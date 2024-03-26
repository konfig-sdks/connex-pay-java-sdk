

# ReturnItemRequestRequestReturnRetryCard

Card data to be used in the event a sale return to the original card is declined and a retry to a new card should be attempted. This attempt needs to be made within 7 days of the failed return authorization

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardNumber** | **String** | Card number. Must be 16 characters. |  [optional] |
|**cardHolderName** | **String** | Cardholder&#39;s name |  [optional] |
|**cvv2** | **Integer** | The three or four digit CVV code at the back side of the credit and debit card |  [optional] |
|**expirationDate** | **LocalDate** | Card&#39;s expiry date in the YYMM format |  [optional] |



