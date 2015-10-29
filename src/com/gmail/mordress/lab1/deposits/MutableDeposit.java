package com.gmail.mordress.lab1.deposits;

import com.gmail.mordress.lab1.banks.Bank;

public class MutableDeposit extends Deposit {

    private final Integer minDurationForChange;

    private final Integer maxSummToTakePerMonth;

    public MutableDeposit(String name, Integer rate, Integer minSum, Integer duration, Bank bank, Integer minDurationForChange, Integer maxSummToTakePerMonth) {
        super(name, rate, minSum, duration, bank);
        this.minDurationForChange = minDurationForChange;
        this.maxSummToTakePerMonth = maxSummToTakePerMonth;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString()).append("\n").append("\t")
                                .append("SUPPORT PRETERM OPERATIONS:")
                                .append("\n").append("\t").append("MINIMAL PERIOD BEFORE CHANGE: ").append(minDurationForChange).append(" DAYS")
                                .append("\n").append("\t").append("MAX SUMM TO TAKE PER MONTH: ").append(maxSummToTakePerMonth).append(" $")
                                .toString();
    }
}
