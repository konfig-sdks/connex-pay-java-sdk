

# TokenRequestHppTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantName** | **String** | Merchant Name. ConnexPay displays this on the Hosted Payment Page. The max length is 100 characters. |  |
|**description** | **String** | Additional information ConnexPay can display in the Hosted Payment Page. The max length is 2048 characters. |  [optional] |
|**resultRedirectUrl** | **String** | This is a ConnexPay CLIENT server route ConnexPay uses to (re)direct the consumer payment result back to our client upon payment success, failure or cancel. If this data is not set, then it will use the default one from ConnexPay. |  [optional] |
|**logoUrl** | **String** | ConnexPay can display this instead of “MerchantName” in the payment dialog. |  [optional] |
|**tenderTypeOptions** | **List&lt;String&gt;** | Payment types you wish to make available to your consumer when they enter payment information into the Hosted Payment Page. Options are \&quot;ACH\&quot;, \&quot;Credit\&quot;, \&quot;GooglePay\&quot;/ |  [optional] |
|**expiration** | **OffsetDateTime** | Client can request a specific expiration date to identify when the HPP Link will expire. Timestamps will be converted to UTC for consistency within the ConnexPay environment. |  [optional] |
|**sale** | [**TokenRequestHppTokenRequestSale**](TokenRequestHppTokenRequestSale.md) |  |  |



