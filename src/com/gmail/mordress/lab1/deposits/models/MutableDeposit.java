package com.gmail.mordress.lab1.deposits.models;

import com.gmail.mordress.lab1.banks.Bank;
import java.math.BigDecimal;

public class MutableDeposit extends Deposit {

    /* Minimal period for taking part of money */
    private Integer minDurationForChange;

    private BigDecimal maxSummToTakePerMonth;

    public MutableDeposit(String name, Integer rate, BigDecimal minSum, Integer duration, Bank bank,
                          Integer minDurationForChange, BigDecimal maxSummToTakePerMonth) {
        super(name, rate, minSum, duration, bank);
        this.minDurationForChange = minDurationForChange;
        this.maxSummToTakePerMonth = maxSummToTakePerMonth;
    }

    public Integer getMinDurationForChange() {
        return minDurationForChange;
    }

    public BigDecimal getMaxSummToTakePerMonth() {
        return maxSummToTakePerMonth;
    }

    public void setMinDurationForChange(Integer minDurationForChange) {
        this.minDurationForChange = minDurationForChange;
    }

    public void setMaxSummToTakePerMonth(BigDecimal maxSummToTakePerMonth) {
        this.maxSummToTakePerMonth = maxSummToTakePerMonth;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString()).append("\n\t")
                .append("SUPPORT PRETERM OPERATIONS:")
                .append("\n\t").append("MINIMAL PERIOD BEFORE CHANGE: ").append(getMinDurationForChange()).append(" DAYS")
                .append("\n\t").append("MAX SUMM TO TAKE PER MONTH: ").append(getMaxSummToTakePerMonth()).append(" $").append("\n")
                .toString();
    }
}
