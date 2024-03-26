

# SettingTokenizeBankAccountInfoRequestAccountHolder

Payee's Account information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | Conditional -  Payee&#39;s First name between 2 to 40 characters. Can be left blank if BusinessName is provided |  [optional] |
|**lastName** | **String** | Conditional - Payee&#39;s Last name between 2 to 40 characters. Can be left blank if BusinessName is provided |  [optional] |
|**middleName** | **String** | Payee&#39;s Middle name |  [optional] |
|**businessName** | **String** | Conditional - Can be left blank if FirstName and LastName are provided |  [optional] |
|**email** | **String** | Email up to 100 characters |  [optional] |
|**phone** | **String** | Phone number up to 10 characters |  [optional] |
|**address** | [**TransactionCreateAchCreditPaymentRequestAccountHolderAddress**](TransactionCreateAchCreditPaymentRequestAccountHolderAddress.md) |  |  [optional] |
|**bankAccount** | [**TransactionCreateAchCreditPaymentRequestAccountHolderBankAccount**](TransactionCreateAchCreditPaymentRequestAccountHolderBankAccount.md) |  |  [optional] |



