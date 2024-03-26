

# PayeeDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payeeGuid** | **UUID** | Guid for the created Payee that is returned by ConnexPay upon creation of a Payee. Ignored if provided in a Payee creation request. |  [optional] |
|**merchantGuid** | **UUID** | Merchant guid for the Payee to be created. |  |
|**firstName** | **String** | First name for the Payee to be created. |  |
|**lastName** | **String** | Last name for the Payee to be created. |  |
|**email** | **String** | Email address for the Payee. |  |
|**address1** | **String** | Postal address line 1 for the Payee. Alphanumerics and [,.-&#39;] are allowed. |  [optional] |
|**address2** | **String** | Postal address line 2 for the Payee. Alphanumerics and [,.-&#39;] are allowed. |  [optional] |
|**city** | **String** | Postal address city for the Payee. |  [optional] |
|**state** | **String** | Postal address state for the Payee. |  [optional] |
|**zipCode** | **String** | Postal code for the Payee. |  [optional] |
|**phone** | **String** | Phone number for the Payee, up to 10-character string. |  |
|**status** | **String** | Status for the Payee. |  [optional] |
|**cardId** | **String** | Unique identifier that refers to the card saved for a Payee when using the Payment Widget. It will be null when a Payee is created but will have a value once stored for the Payee using the Payment Widget. |  [optional] |



