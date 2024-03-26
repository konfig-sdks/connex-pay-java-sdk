

# CardResendTransmissionInfoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transmissionMethods** | **List&lt;String&gt;** | Methods of Transmission. Supported methods: Email, Link, Fax. Populate this parameter as &#39;Email&#39; if you want to email the virtual card to a customer or supplier. Use the &#39;Link&#39; option to have a URL included in the response.  Use the \&quot;Fax\&quot; option to fax the virtual card to a customer or supplier. |  |
|**emailRecipient** | **String** | Mandatory when transmission is Email. Otherwise don&#39;t include. This is the email address of the intended recipient. 255 char max. |  [optional] |
|**merchantPhoneNumber** | **String** | This is the phone number that should display on the virtual card and is the number that should be used if the link has expired. Up to 15 characters. Numbers and plus sign (+) allowed only. |  [optional] |
|**emailFrom** | **String** | For email transmissions, this will be the email address that populates the ‘reply to’ section of the email message. Do not include this parameter on other transmission method types. 255 char max. |  [optional] |
|**recipientName** | **String** | A descriptive name of the email or fax recipient. Does not apply to the Link transmission method type. 255 char max |  [optional] |
|**subject** | **String** | High-level subject line description of the transmission contents. Does not apply to the Link transmission method type. 255 char max. |  [optional] |
|**message** | **String** | The message body of the email or fax. Does not apply to the Link transmission method type. 1024 char max. |  [optional] |
|**daysToExpire** | **Integer** | The number of days after card issuance until the link to the VC expires. Range: 1-999 days. |  [optional] |
|**faxFrom** | **String** | Mandatory for fax transmission. This can be the client name or fax number the fax is coming from that populates the ‘FaxFrom’ section of the fax. 255 char max. |  [optional] |
|**faxRecipient** | **String** | Mandatory for fax transmissions.  The fax number of the intended recipient. |  [optional] |



