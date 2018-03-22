package com.abm.FinRecordSummary.service;

import com.abm.FinRecordSummary.Transaction;
import com.abm.FinRecordSummary.domainobject.Amount;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TransactionServiceTest {


    private TransactionService transactionService ;

    @Mock
    private CacheService cacheService;

    @Before
    public void setup(){

        transactionService = new DefaultTransactionService(cacheService);
    }


    @Test
    public void shouldSaveATransactionInCacheWhenItIsSaved() {

        Amount amount = new Amount(10D);

        Transaction transaction = new Transaction(amount);

        given(cacheService.save(transaction)).willReturn(transaction);

        Transaction add = transactionService.add(transaction);

        assertThat(add).isEqualTo(transaction);

        verify(cacheService, only()).save(transaction);

    }
}