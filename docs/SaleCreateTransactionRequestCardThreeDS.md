

# SaleCreateTransactionRequestCardThreeDS

ThreeDS object is required when 3DS authentication parameters are being passed in the Sale or Auth.  For US clients: the parameters are identified using the 3DS Authentication endpoint.  For EU clients: the parameters are identified when a cardholder challenge and/or fingerprint authentication is required after calling the Create Sale or Auth Only endpoint with the BrowserData object details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**secureCode** | **String** |  |  [optional] |
|**cavv** | **String** | Cardholder authentication verification value |  [optional] |
|**version** | **String** | Version of 3DS being used |  [optional] |
|**directoryServerTransactionID** | **String** | Unique identifier provided by the card scheme as part of 3D Secure authentication. |  [optional] |
|**acsTransactionId** | **String** | Unique Identifier provided by the Access Control Server of the Card Issuer. |  [optional] |
|**ECI** | **String** | Displays the Electronic Commerce Indicator (ECI). The ECI indicates the security level of the payment information provided to the merchant. A value of 0, 1 or 2 is a Mastercard transaction. A value of 5, 6 or 7 is a Visa, American Express, Diners or Discover card. |  [optional] |



