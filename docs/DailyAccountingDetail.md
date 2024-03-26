

# DailyAccountingDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description    The type of transaction being released in this detail record.    Possible Values:    ACH Debit Reject    Bank A ACH Credit Reject    Credit to Client (Withdrawal from Cash Account)    Daily Flex Funding    Debit from Client (Deposit to Cash Account)    Empty    Prior Day Cash Balance    Purchase - ACH Purchase    Purchase - ACH Return    Purchase - Push To Card Payout    Purchase - Virtual Card Chargeback    Purchase - Virtual Card Purchase    Purchase - Virtual Card Return    Reserve Balance    Sale - ACH Return    Sale - ACH Sale    Sale - ACH Void    Sale - Credit Card Adjustment    Sale - Credit Card Chargeback    Sale - Credit Card Return    Sale - Credit Card Sale    Sale - Credit Card Void    Unspecified |  [optional] |
|**merchantGuid** | **UUID** | Merchant Guid    Unique identifier assigned to the merchant by ConnexPay. |  [optional] |
|**clientName** | **String** | Client Name    Unique name assigned to the client by ConnexPay. |  [optional] |
|**releasedDate** | **LocalDate** | Released Date    Date on which the Accounting File for this detail record was released to the client. |  [optional] |
|**orderNumber** | **String** | Order Number    Identifier that may be provided by the client during the Create Sale or IssueLite process to identify the order.  Can be comprised of multiple sales and purchases. |  [optional] |
|**name** | **String** | Name    The name line 1 and 2 of the virtual credit card. |  [optional] |
|**cardLastFour** | **String** | Card Last Four    The last four digits of the card number associated with the detail record. |  [optional] |
|**incomingTransactionCode** | **String** | Incoming Transaction Code (ITC)    A unique ConnexPay generated token that connects an incoming sale transaction to an outbound  purchase (virtual card or ACH) transaction. An ITC is generated and returned for each successful  authorization associated with a Sale request and is required for each purchase request. |  [optional] |
|**customerId** | **String** | Customer ID    Identifier that may be provided by the client during the Create Sale or IssueLite process. Can be comprised   of multiple sales and purchases. Acts as a secondary identifier in conjunction with OrderNumber. |  [optional] |
|**amount** | **Double** | Amount    Amount of the sale or purchase transaction. |  [optional] |
|**merchantName** | **String** | Merchant Name    Name of the supplier processing the virtual credit card transaction. |  [optional] |
|**ticketNumber** | **String** | Ticket Number    Addendum data associated with the transaction that is returned if provided during the virtual credit card or ACH creation |  [optional] |
|**entityGuid** | **UUID** | Entity Guid    Entity Guid of the detail record to link them back to the original entity. |  [optional] |
|**purchaseType** | **String** | Purchase Type    Description of the client&#39;s category group. Essentially, the industry where the virtual card will be utilized.    See the Issue Card method in the Purchases API documentation for more details. |  [optional] |
|**entityId** | **String** | Entity Id    Entity Guid of the detail record to link them back to the original entity. |  [optional] |
|**issuedAmount** | **Double** | Issued Amount    Amount of the virtual credit card issued to the client. |  [optional] |
|**labelName** | **String** | Label Name    Comma-separated list of labels associated with the sale. |  [optional] |
|**associationId** | **String** | Association ID    Used to associate a virtual card to one or more sales. |  [optional] |
|**saleGuid** | **UUID** | Sale Guid    Guid value returned from the Create Sale method in the Sales API. Associated with   sale transaction detail records. |  [optional] |
|**cardGuid** | **UUID** | Card Guid    Guid value return from the Issue Card method in the Purchases API. Associated with   purchase and return detail records. |  [optional] |
|**dateTime** | **OffsetDateTime** | Date Time    For Sale detail records, the date of the sale transaction.    For Purchase and Return detail records, the date of the purchase or return settlement.    Note: This date may not be the same as ReleasedDate because release does not occur on weekends and bank holidays. |  [optional] |



