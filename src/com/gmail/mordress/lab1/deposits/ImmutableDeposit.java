package com.gmail.mordress.lab1.deposits;

import com.gmail.mordress.lab1.banks.Bank;

public class ImmutableDeposit extends Deposit {

    public ImmutableDeposit(String name, Integer rate, Integer minSum, Integer duration, Bank bank) {
        super(name, rate, minSum, duration, bank);
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
        						.append("\n\t")
        						.append("NOT SUPPORT PRETERM OPERATIONS")
        						.toString();
    }

}
