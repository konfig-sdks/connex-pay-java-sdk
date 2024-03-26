

# AddendumCreateAchPurchaseRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemGuid** | **String** | Guid for the ACH Purchase you are attaching information to with this addendum request. This Guid was returned to client when the ACH Purchase was initially created. |  [optional] |
|**value** | **String** | Character data to associate with the Virtual card. |  [optional] |
|**category** | **String** | Can be used by client to specify a desired category for an Addenda item. Consistent category parameters will aid in reporting consistently. See note below regarding the \&quot;MultipleSales\&quot; category and how to use the category specifically to associate an ACH Purchase to an existing sale(s). |  [optional] |
|**idExternal** | **String** | Can be supplied by client to associate this addendum with an ID in client&#39;s data. |  [optional] |
|**note** | **String** | Additional information to associate with this addendum, as desired. |  [optional] |
|**sequence** | **String** | If client creates multiple addenda for a single ACH Purchase this sequence can be specified if a client desires. |  [optional] |



