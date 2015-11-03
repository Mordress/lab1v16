package com.gmail.mordress.lab1.deposits.models;

import com.gmail.mordress.lab1.banks.Bank;

import java.math.BigDecimal;

public class ImmutableDeposit extends Deposit {

    public ImmutableDeposit(String name, Integer rate, BigDecimal minSum, Integer duration, Bank bank) {
        super(name, rate, minSum, duration, bank);
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append("\n\t")
                .append("NOT SUPPORT PRETERM OPERATIONS").append("\n")
                .toString();
    }
}
