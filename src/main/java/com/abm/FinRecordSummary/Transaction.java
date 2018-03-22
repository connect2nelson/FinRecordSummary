package com.abm.FinRecordSummary;

import com.abm.FinRecordSummary.domainobject.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;


public class Transaction {

    @JsonProperty
    @NotNull
    private Amount amount;

    @JsonProperty
    @NotNull()
    private ZonedDateTime timeOfTransaction = ZonedDateTime.now();

    public Transaction(Amount amount) {
        this.amount = amount;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public ZonedDateTime getTimeOfTransaction() {
        return timeOfTransaction;
    }

    public void setTimeOfTransaction(ZonedDateTime timeOfTransaction) {
        this.timeOfTransaction = timeOfTransaction;
    }
}
