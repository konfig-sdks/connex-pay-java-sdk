

# AuthenticationObtain3DSecureAuthenticationRequestBrowserData

BrowserData is required in order to successfully respond to a cardholder challenge of the authentication.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptanceHeader** | **String** | Required.  Exact content of the http accept header. |  |
|**colorDepth** | **Integer** | Required. Value representing the bit depth of the color palette for displaying images, in bits per pixel. |  |
|**javaEnabled** | **Boolean** | True or False response that represents ability of cardholder browser to execute Java |  |
|**screenHeight** | **Integer** | Total height of the Cardholder&#39;s screen in pixels |  |
|**screenWidth** | **Integer** | Total width of the Cardholder&#39;s screen in pixels |  |
|**timeZoneOffset** | **Integer** | Time Zone difference between browser time zone and UTC time, in hours.  Can be positive or negative. |  |
|**language** | **String** | Value representing the browser language as defined in IETF BCP47 |  |
|**redirectURL** | **String** | The merchant URL to which the browser should be redirected after the challenge session. |  |
|**userAgentHeader** | **String** | Exact content of the HTTP user-agent header. |  |



