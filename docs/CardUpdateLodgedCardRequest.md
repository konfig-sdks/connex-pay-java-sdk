

# CardUpdateLodgedCardRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**usageLimit** | **Long** | Security Control: Maximum number of times the card may be authorized. This is used in conjunction with the Limit Window; for example, if you specify a Usage Limit of 4 and a Limit Window of Monthly, the card can be authorized up to 4 times per month. The maximum allowed field value is 99, and if you do not provide a value the card will be considered unlimited. Authorization attempts exceeding the provided value will be declined. |  [optional] |
|**amountLimit** | **Float** | Security Control: Maximum dollar amount the card can be authorized and settled, which must be less than or equal to $1,000,000.00. The value must incorporate any anticipated overages such as currency conversion or taxes that a supplier may associate with the transaction. If a supplier attempts to authorize a card for more than the amount limit it will be declined. |  [optional] |
|**limitWindow** | **String** | This is the time period that both the UsageLimit and the AmountLimit applies. Options are: Day, Week, Month, Lifetime. For example AmountLimit is $500 and LimitWindow is \&quot;Week\&quot; then the card can be approved for $500 per week. |  [optional] |
|**purchaseType** | **String** | Security Control: The industry where the virtual card will be utilized. For example, if value set to airline and the card is used at hotel, it will be declined. Available purchase type values are: &#39;01&#39; (Airline), &#39;02&#39; (Hotels and Resorts), &#39;03&#39; (Car Rental), &#39;04&#39; (Cable, Satellite, Television, and Radio Services),  &#39;05&#39; (Cruise Lines), &#39;11&#39; (Medical Services and Health Practitioners), &#39;21&#39; (Advertising Services), &#39;22&#39; (Misc Advertising and Business Services), &#39;23&#39; (Ticketing), &#39;31&#39; (Insurance Sales, Underwriting, and Premiums), &#39;91&#39; (Restaurants and Food Services), and &#39;93&#39; (Tax Payments). Leave this blank if you plan to utilize MID level controls. |  [optional] |
|**activated** | **Boolean** | True activates a lodged card. False suspends a lodged card. |  [optional] |
|**associationId** | **String** | Utilize the Association ID field to tie a lodged card to a sale or sales. For example, if you have several sales and one lodged card payment to a supplier, you can add association ID to the sales and the lodged card for downstream reporting. |  [optional] |
|**terminateDate** | **LocalDate** | The TerminateDate (YYYY-MM-DD format) is the date the Lodged Card will be terminated by ConnexPay. TerminateDate is different than ExpirationDate in that TerminateDate indicates the actual date the card will no longer be active.  The recommendation is to set the ExpirationDate one or two years in the future and set the TerminateDate just a day or two after the Lodged Card is expected to be processed. If a terminate date is not indicated, the card will be inactivated as of the expiration date. Note, Returns can still be processed on terminated Lodged Cards. |  [optional] |



