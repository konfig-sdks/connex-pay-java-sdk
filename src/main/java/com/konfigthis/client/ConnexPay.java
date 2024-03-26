package com.konfigthis.client;

import com.konfigthis.client.api.AchApi;
import com.konfigthis.client.api.AccountingApi;
import com.konfigthis.client.api.AddendumApi;
import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.CancellationApi;
import com.konfigthis.client.api.CardApi;
import com.konfigthis.client.api.CardIssuanceApi;
import com.konfigthis.client.api.CardIssueApi;
import com.konfigthis.client.api.FundingApi;
import com.konfigthis.client.api.FundsApi;
import com.konfigthis.client.api.MerchantPayeesApi;
import com.konfigthis.client.api.PushToCardApi;
import com.konfigthis.client.api.ReplayApi;
import com.konfigthis.client.api.ReturnApi;
import com.konfigthis.client.api.SaleApi;
import com.konfigthis.client.api.SettingApi;
import com.konfigthis.client.api.SettlementApi;
import com.konfigthis.client.api.StatusGroupApi;
import com.konfigthis.client.api.TokenApi;
import com.konfigthis.client.api.TransactionApi;
import com.konfigthis.client.api.ValidationApi;
import com.konfigthis.client.api.VerificationApi;
import com.konfigthis.client.api.VoidApi;

public class ConnexPay {
    private ApiClient apiClient;
    public final AchApi ach;
    public final AccountingApi accounting;
    public final AddendumApi addendum;
    public final AuthenticationApi authentication;
    public final CancellationApi cancellation;
    public final CardApi card;
    public final CardIssuanceApi cardIssuance;
    public final CardIssueApi cardIssue;
    public final FundingApi funding;
    public final FundsApi funds;
    public final MerchantPayeesApi merchantPayees;
    public final PushToCardApi pushToCard;
    public final ReplayApi replay;
    public final ReturnApi return;
    public final SaleApi sale;
    public final SettingApi setting;
    public final SettlementApi settlement;
    public final StatusGroupApi statusGroup;
    public final TokenApi token;
    public final TransactionApi transaction;
    public final ValidationApi validation;
    public final VerificationApi verification;
    public final VoidApi void;

    public ConnexPay() {
        this(null);
    }

    public ConnexPay(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.ach = new AchApi(this.apiClient);
        this.accounting = new AccountingApi(this.apiClient);
        this.addendum = new AddendumApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.cancellation = new CancellationApi(this.apiClient);
        this.card = new CardApi(this.apiClient);
        this.cardIssuance = new CardIssuanceApi(this.apiClient);
        this.cardIssue = new CardIssueApi(this.apiClient);
        this.funding = new FundingApi(this.apiClient);
        this.funds = new FundsApi(this.apiClient);
        this.merchantPayees = new MerchantPayeesApi(this.apiClient);
        this.pushToCard = new PushToCardApi(this.apiClient);
        this.replay = new ReplayApi(this.apiClient);
        this.return = new ReturnApi(this.apiClient);
        this.sale = new SaleApi(this.apiClient);
        this.setting = new SettingApi(this.apiClient);
        this.settlement = new SettlementApi(this.apiClient);
        this.statusGroup = new StatusGroupApi(this.apiClient);
        this.token = new TokenApi(this.apiClient);
        this.transaction = new TransactionApi(this.apiClient);
        this.validation = new ValidationApi(this.apiClient);
        this.verification = new VerificationApi(this.apiClient);
        this.void = new VoidApi(this.apiClient);
    }

}
