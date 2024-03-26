

# DailyAccountingSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantGuid** | **UUID** | Merchant Guid    Unique identifier assigned to the merchant by ConnexPay. |  [optional] |
|**clientName** | **String** | Client Name    Unique name assigned to the client by ConnexPay. |  [optional] |
|**releasedDate** | **LocalDate** | Released Date    Date on which the requested transactions were released to the client. |  [optional] |
|**priorDayCashBalance** | **Double** | Prior Day Cash Balance    The starting cash balance from the previous day. |  [optional] |
|**wireAchToFundCashAmount** | **Double** | Wire/ACH to Fund Cash Account Amount (Credit) or Withdraw from Cash Account Amount (Debit)    Funds transferred between the client&#39;s bank account and ConnexPay to fund transactions or to return funds to the client. |  [optional] |
|**beginningCashBalance** | **Double** | Beginning Cash Balance    The funds the client begins the day with. |  [optional] |
|**creditSaleAmount** | **Double** | Credit Card Sale Amount (Credit)    Total amount of incoming credit card sales added to the client&#39;s cash balance. |  [optional] |
|**achSaleAmount** | **Double** | ACH Sale Amount (Credit)    Total amount of incoming ACH sales added to the client&#39;s cash balance. |  [optional] |
|**purchaseAchAmount** | **Double** | ACH Purchase Amount (Debit)    Total amount of ACH purchases decreasing the client&#39;s cash balance. |  [optional] |
|**purchaseCardAmount** | **Double** | Virtual Card Purchase Amount (Debit)    Total amount of issued virtual credit card purchases subtracting from the client&#39;s cash balance. |  [optional] |
|**purchasePushToCardAmount** | **Double** | Purchase Push to Card Amount    Total amount of funds paid out through PushToCard subtracting from the client&#39;s cash balance. |  [optional] |
|**creditVoidAmount** | **Double** | Credit Card Void Amount (Debit)    Total amount of credit card sales voided subtracting from the client&#39;s cash balance. |  [optional] |
|**creditReturnAmount** | **Double** | Credit Card Return Amount (Debit)    Total amount of credit card sales returned subtracting from the client&#39;s cash balance. |  [optional] |
|**creditChargebackAmount** | **Double** | Credit Chargeback Amount    Total amount of Chargebacks received on the credit card sales subtracting from the client&#39;s cash balance. |  [optional] |
|**creditAdjustmentAmount** | **Double** | Credit Adjustment Amount    Total amount of manual credit adjustments created for the client. |  [optional] |
|**achVoidAmount** | **Double** | ACH Void Amount (Debit)    Total amount of ACH sales voided subtracting from the client&#39;s cash balance. |  [optional] |
|**achReturnAmount** | **Double** | ACH Return (Debit)    Total amount of ACH sales returned subtracting from the client&#39;s cash balance. |  [optional] |
|**purchaseCardReturnAmount** | **Double** | Virtual Card Return Amount (Credit)    Total amount returned to issued virtual credit cards adding to the client&#39;s cash balance. |  [optional] |
|**purchaseCardChargebackAmount** | **Double** | Purchase Card Chargeback Amount    Total amount of Chargebacks received on issued virtual credit cards as part of the dispute process. |  [optional] |
|**purchaseAchReturnAmount** | **Double** | Purchase - ACH Return Amount (Credit)    Total amount returned to issued ACHs adding to the client&#39;s cash balance. |  [optional] |
|**totalActivity** | **Double** | Total Activity    The sum of all debits and credits processed on the client&#39;s behalf for the previous day. |  [optional] |
|**newCashBalance** | **Double** | New Cash Balance    Reflects the day&#39;s beginning cash balance plus or minus the client&#39;s total activity. |  [optional] |
|**netDebitCreditToClient** | **Double** | Credit/Debit    The amount to be credited to or debited from the client&#39;s bank account. ConnexPay will collaborate with  the client to determine the percentage that will be returned to the client&#39;s bank account each day. |  [optional] |
|**endingCashBalance** | **Double** | Ending Cash Balance    The client&#39;s New Cash Balance plus or minus the Credit/Debit amount. |  [optional] |
|**minimumCashBalance** | **Double** | Minimum Cash Balance (MCB)    Minimum funding balance that should be maintained by the client with ConnexPay. |  [optional] |
|**achDebitRejectAmount** | **Double** | ACH Debit Reject Amount (Credit)    Total amount of payments that did not clear the supplier&#39;s account. Payments can be rejected for a variety of reasons, including closed accounts, incorrect account numbers, etc. |  [optional] |



