package com.bitdubai.fermat_cbp_plugin.layer.business_transaction.crypto_money_stock_replenishment.developer.bitdubai.version_1.structure;

import com.bitdubai.fermat_cbp_api.all_definition.business_transaction.BusinessTransaction;
import com.bitdubai.fermat_cbp_api.all_definition.enums.BusinessTransactionStatus;
import com.bitdubai.fermat_cbp_api.all_definition.enums.CryptoCurrencyType;
import com.bitdubai.fermat_cbp_api.all_definition.enums.CurrencyType;
import com.bitdubai.fermat_cbp_api.layer.cbp_business_transaction.crypto_money_stock_replenishment.interfaces.CryptoMoneyStockReplenishment;

import java.util.UUID;

/**
 * Created by Yordin Alayn on 29.09.15.
 */
public class CryptoMoneyStockReplenishmentBusinessTransactionImpl implements BusinessTransaction, CryptoMoneyStockReplenishment{

    private UUID transactionId;
    private String publicKeyBroker;
    private CurrencyType merchandiseCurrency;
    private float merchandiseAmount;
    private UUID executionTransactionId;
    private CryptoCurrencyType cryptoCurrencyType;
    private BusinessTransactionStatus transactionStatus;

    public CryptoMoneyStockReplenishmentBusinessTransactionImpl(
            UUID transactionId,
            String publicKeyBroker,
            CurrencyType merchandiseCurrency,
            float merchandiseAmount,
            UUID executionTransactionId,
            CryptoCurrencyType cryptoCurrencyType,
            BusinessTransactionStatus transactionStatus
    ){
        this.transactionId = transactionId;
        this.publicKeyBroker = publicKeyBroker;
        this.merchandiseCurrency = merchandiseCurrency;
        this.merchandiseAmount = merchandiseAmount;
        this.executionTransactionId = executionTransactionId;
        this.cryptoCurrencyType = cryptoCurrencyType;
        this.transactionStatus = transactionStatus;
    }

    @Override
    public UUID getTransactionId(){ return this.transactionId; }
    public void setIdTransaction(UUID id) { this.transactionId = id; }

    @Override
    public String getPublicKeyBroker(){ return this.publicKeyBroker; }
    public  void setPublicKeyBroker(String publicKey){ this.publicKeyBroker = publicKey; }

    @Override
    public CurrencyType getMerchandiseCurrency(){ return this.merchandiseCurrency; }
    public void setMerchandiseCurrency(CurrencyType merchandise){ this.merchandiseCurrency = merchandise; }

    @Override
    public float getMerchandiseAmount(){ return this.merchandiseAmount; }
    public void setMerchandiseAmount(float amount){ this.merchandiseAmount = amount; }

    @Override
    public UUID getExecutionTransactionId(){ return this.executionTransactionId; }
    public void setExecutionTransactionId(UUID execution){ this.executionTransactionId = execution; }

    @Override
    public CryptoCurrencyType getCryptoCurrencyType(){ return this.cryptoCurrencyType; }
    public void setCryptoCurrencyType(CryptoCurrencyType currency){ this.cryptoCurrencyType = currency; }

    @Override
    public BusinessTransactionStatus getStatus(){ return this.transactionStatus; }
    public void setStatus(BusinessTransactionStatus status){ this.transactionStatus = status; }

}
