package com.abm.FinRecordSummary.service;

import com.abm.FinRecordSummary.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultTransactionService implements TransactionService {

    private CacheService cacheService;

    @Autowired
    public DefaultTransactionService(CacheService cacheService) {
        this.cacheService = cacheService;
    }


    @Override
    public Transaction add(Transaction transaction) {
        return cacheService.save(transaction);
    }
}
