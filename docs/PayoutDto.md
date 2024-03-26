

# PayoutDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutGuid** | **UUID** | Guid assigned to the Payout by ConnexPay upon creation of a Payout. |  [optional] |
|**merchantGuid** | **UUID** | Application-level value that indicates a Payout is being requested for client&#39;s account. Value provided by ConnexPay. |  |
|**payoutReferenceToken** | **String** | The Payout identifier that will be needed by ConnexPay support teams to research issues. |  [optional] |
|**memo** | **String** | A brief description highlighting the reason for this Payout. |  |
|**status** | **String** | Status of the Payout. |  [optional] |
|**payments** | [**List&lt;PaymentsDto&gt;**](PaymentsDto.md) |  |  |
|**orderNumber** | **String** | The most common number used throughout the ConnexPay Portal. Transaction ID within client environment associated with the order. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple instances of the integration for multiple purposes. The maximum length is 50 alpha-numeric characters and allows dashes ( - ). |  [optional] |
|**customerId** | **String** | Transaction ID within the client environment associated with the customer. This value acts as a secondary identifier in conjunction with OrderNumber. The value is searchable and reportable in the ConnexPay portal. This value may be sent in multiple times within the integration for multiple purposes. The maximum length is 100 characters and is alpha-numeric. |  [optional] |
|**associationId** | **String** | Association ID is used to tie a Payout to a sale or sales. For example, if you have several sales and one Payout to a Payee, association ID can be added to the sales and the Payout for downstream reporting. |  [optional] |
|**labelIds** | **List&lt;Integer&gt;** | Label IDs are used to associate a Payout to specific labels within ConnexPay Bridge UI for an organization. If a Payout is tied to an incorrect Label, it will not filter or display correctly in Bridge&#39;s Search Grid. Please contact your Customer Care Consultant for a list of valid Label IDs before use. |  [optional] |



