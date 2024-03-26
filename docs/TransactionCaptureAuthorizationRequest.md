

# TransactionCaptureAuthorizationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceGuid** | **String** | Device&#39;s Guid provided by ConnexPay. |  |
|**authOnlyGuid** | **String** | Guid received from the AuthOnly operation. |  |
|**sequenceNumber** | **String** | Transaction sequence number within client environment. Provide a unique SequenceNumber for each new request. If the same value is sent within 30 minutes it will be considered a duplicate request. Note: value is not searchable or reportable in ConnexPay portal.  Alphanumeric. |  [optional] |
|**connexPayTransaction** | [**TransactionCaptureAuthorizationRequestConnexPayTransaction**](TransactionCaptureAuthorizationRequestConnexPayTransaction.md) |  |  [optional] |
|**orderNumber** | **String** | This is the most common number you&#39;ll see throughout the ConnexPay Portal. Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. Customers in the travel space often send the Record Locator/PNR in this field. The maximum length is 50 alpha-numeric characters and allows dashes ( - ). If you provided an order number in the AUTH request it will be overwritten with the order number in the CAPTURE endpoint. |  [optional] |
|**customerID** | **String** | Transaction ID within client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes. The maximum length is 100 characters and is alpha-numeric. |  [optional] |
|**associationID** | **String** | Utilize the Association ID field to tie a virtual card to a sale or sales. For example, if you have several sales and one virtual card payment to a supplier, you can add association ID to the sales and the virtual card for downstream reporting. |  [optional] |
|**customParameters** | [**List&lt;SaleCreateTransactionRequestCustomParametersInner&gt;**](SaleCreateTransactionRequestCustomParametersInner.md) | You can add custom parameters to your sale request in the event that you need to associate additional information with the pay-in. For example, if you want to add an invoice number you would include the custom parameters object with the name parameter &#x3D; \&quot;invoice\&quot; and the value parameter as the invoice number. This requires customized reporting so you&#39;ll need to work with your implementations specialist to determine what&#39;s required. |  [optional] |



