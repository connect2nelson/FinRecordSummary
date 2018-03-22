package com.abm.FinRecordSummary.service;

import com.abm.FinRecordSummary.Transaction;
import com.abm.FinRecordSummary.domainobject.Amount;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class CacheServiceTest {


    @Test
    public void checkWhetherTransactionsAreAddedInCache(){

        CacheService cacheService = new CacheService();
        Transaction transaction = new Transaction(new Amount(10D));
        Transaction save = cacheService.save(transaction);

        assertThat(save).isNull();
    }


}