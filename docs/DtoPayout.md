

# DtoPayout


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutGuid** | **UUID** | Unique identifier assigned to the Payout. |  [optional] |
|**payoutReferenceToken** | **String** | The Payout identifier that will be needed by our support teams to research issues. |  [optional] |
|**memo** | **String** | A brief description highlighting the reason for this Payout. |  [optional] |
|**orderNumber** | **String** | The most common number used throughout the ConnexPay Portal. Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. The maximum length is 50 alpha-numeric characters and allows dashes ( - ). |  [optional] |
|**associationId** | **String** | Association ID is used to tie a Payout to a sale or sales. For example, if you have several sales and one Payout to a Payee, association ID can be added to the sales and the Payout for downstream reporting. |  [optional] |
|**customerId** | **String** | Transaction ID within the client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes. The maximum length is 100 characters and is alpha-numeric. |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**createdBy** | **String** |  |  [optional] |
|**labelIds** | **List&lt;Integer&gt;** | Label IDs are used to associate a Payout to specific labels within ConnexPay Bridge UI for an organization. If a Payout is tied to an incorrect Label, it will not filter or display correctly in Bridge&#39;s Search Grid. Please contact your Customer Care Consultant for a list of valid Label IDs before use. |  [optional] |
|**payments** | [**List&lt;DtoPayments&gt;**](DtoPayments.md) |  |  [optional] |



