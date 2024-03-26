

# CardUpdateCardDetailsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**purchaseType** | **String** | Security Control: The industry where the virtual card will be utilized. For example, if value set to airline and the card is used at hotel, it will be declined. Available purchase type values are: &#39;01&#39; (Airline), &#39;02&#39; (Hotels and Resorts), &#39;03&#39; (Car Rental), &#39;04&#39; (Cable, Satellite, Television, and Radio Services),  &#39;05&#39; (Cruise Lines), &#39;11&#39; (Medical Services and Health Practitioners), &#39;21&#39; (Advertising Services), &#39;22&#39; (Misc Advertising and Business Services), &#39;23&#39; (Ticketing), &#39;31&#39; (Insurance Sales, Underwriting, and Premiums), &#39;91&#39; (Restaurants and Food Services), and &#39;93&#39; (Tax Payments). Leave this blank if you plan to utilize MID level controls. |  [optional] |
|**miDWhitelist** | **List&lt;String&gt;** | MID &#x3D; Merchant ID. Whitelisted MIDs are a supplement to Purchase Type. Utilize if you have a supplier MID(s) where the card can be used if that MID is categorized in an MCC other than the Purchase Type selected. Or use instead of Purchase Type. (e.g., [&#39;273154000108778&#39;, &#39;900074LKM&#39;]) |  [optional] |
|**miDBlacklist** | **List&lt;String&gt;** | MID &#x3D; Merchant ID. The list of MIDs where the virtual card will always be DECLINED regardless of PurchaseType or MIDWhitelist. MIDBlacklist overrides all other specifications. (eg. [&#39;273594000108778&#39;].) |  [optional] |
|**usageLimit** | **Integer** | Security Control: Maximum number of times the card may be authorized. The maximum allowed field value is 99, and if you do not provide a value the card will be considered unlimited. Authorization attempts exceeding the provided value will be declined. Even though a virtual card is often considered a “one-time-use” card, some suppliers may need to authorize a card multiple times (pre-authorizations, a purchase comprised of multiple tickets, etc.) and you may consider a value that is not overly restrictive to avoid unwanted declines. |  [optional] |
|**associationId** | **String** | Utilize the Association ID field to tie a virtual card to a sale or sales. For example, if you have several sales and one virtual card payment to a supplier, you can add association ID to the sales and the virtual card for downstream reporting. |  [optional] |
|**terminateDate** | **LocalDate** | The TerminateDate (YYYY-MM-DD format) is the date the Virtual Credit Card will be terminated by ConnexPay. TerminateDate is different than ExpirationDate in that TerminateDate indicates the actual date the card will no longer be active.  The recommendation is to set the ExpirationDate one or two years in the future and set the TerminateDate just a day or two after the VCC is expected to be processed. If a terminate date is not indicated, the card will be inactivated as of the expiration date. Note, Returns can still be processed on terminated VCCs. |  [optional] |
|**amountLimit** | **Float** | Security Control: Maximum dollar amount the card can be authorized and settled, which must be less than or equal to $1,000,000.00. The value must incorporate any anticipated overages such as currency conversion or taxes that a supplier may associate with the transaction. If a supplier attempts to authorize a card for more than the amount limit it will be declined. |  [optional] |



