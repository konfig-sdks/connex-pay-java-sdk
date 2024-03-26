

# CardIssuanceCreateVirtualCardRequestTransmission

URL Links (email) or a text document (fax) to virtual cards can be emailed/faxed by including the VCC Transmission object in the IssueCard API call. Including the transmission object for email also allows you to pull back a URL you can use within your application to direct a user to a visual representation of the virtual card.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transmissionMethods** | **List&lt;String&gt;** | Methods of Transmission. Supported methods: Email, Link, Fax. Populate this parameter as &#39;Email&#39; if you want to email the virtual card to a customer or supplier. Use the &#39;Link&#39; option to have a URL included in the response.  Use the \&quot;Fax\&quot; option to fax the virtual card to a customer or supplier. |  [optional] |
|**emailRecipient** | **String** | Mandatory for email transmission. The email address of the intended recipient. 255 char max. |  [optional] |
|**merchantPhoneNumber** | **String** | This is the phone number that should display on the virtual card and is the number that should be used if the link has expired. Up to 15 characters. Numbers and plus sign (+) allowed only. |  [optional] |
|**emailFrom** | **String** | Mandatory for email transmission. This will be the email address that populates the ‘reply to’ section of the email message. 255 char max. |  [optional] |
|**recipientName** | **String** | Mandatory for email or fax transmission. A descriptive name of the email or fax recipient. 255 char max |  [optional] |
|**subject** | **String** | Mandatory for email or fax transmission. High-level subject line description of the transmission contents. 255 char max. |  [optional] |
|**message** | **String** | Mandatory for email or fax transmission. The message body of the email or fax. 1024 char max. |  [optional] |
|**daysToExpire** | **String** | Mandatory for email transmission. The number of days after card issuance until link to VC expires. Range: 1-999 days. |  [optional] |
|**faxFrom** | **String** | Mandatory for fax transmission. This can be the client name or fax number the fax is coming from that populates the ‘FaxFrom’ section of the fax. 255 char max. |  [optional] |
|**faxRecipient** | **String** | Mandatory for fax transmissions.  The fax number of the intended recipient. |  [optional] |



