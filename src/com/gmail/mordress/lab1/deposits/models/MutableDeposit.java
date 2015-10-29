package com.gmail.mordress.lab1.deposits.models;

import com.gmail.mordress.lab1.banks.Bank;
import com.gmail.mordress.lab1.deposits.models.Deposit;

public class MutableDeposit extends Deposit {

    private final Integer minDurationForChange;

    private final Integer maxSummToTakePerMonth;

    public MutableDeposit(String name, Integer rate, Integer minSum, Integer duration, Bank bank, Integer minDurationForChange, Integer maxSummToTakePerMonth) {
        super(name, rate, minSum, duration, bank);
        this.minDurationForChange = minDurationForChange;
        this.maxSummToTakePerMonth = maxSummToTakePerMonth;
    }

    public Integer getMinDurationForChange() {
        return minDurationForChange;
    }

    public Integer getMaxSummToTakePerMonth() {
        return maxSummToTakePerMonth;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString()).append("\n\t")
                                .append("SUPPORT PRETERM OPERATIONS:")
                                .append("\n\t").append("MINIMAL PERIOD BEFORE CHANGE: ").append(getMinDurationForChange()).append(" DAYS")
                                .append("\n\t").append("MAX SUMM TO TAKE PER MONTH: ").append(getMaxSummToTakePerMonth()).append(" $")
                                .toString();
    }
}
