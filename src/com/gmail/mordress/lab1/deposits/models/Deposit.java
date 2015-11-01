package com.gmail.mordress.lab1.deposits.models;

import com.gmail.mordress.lab1.Commons;
import com.gmail.mordress.lab1.banks.Bank;

import java.math.BigDecimal;

public abstract class Deposit implements Comparable<Deposit> {

    protected String name;

    protected Integer rate;

    protected BigDecimal minSum;

    protected Integer duration;

    protected Bank bank;

    public Deposit(String name, Integer rate, BigDecimal minSum, Integer duration, Bank bank) {
        this.name = name;
        this.rate = rate;
        this.minSum = minSum;
        this.duration = duration;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public BigDecimal getMinSum() {
        return minSum;
    }

    public void setMinSum(BigDecimal minSum) {
        this.minSum = minSum;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    //theoritical profit
    public BigDecimal getProfit() {
        return minSum.multiply(new BigDecimal(getRate()))
                .multiply(new BigDecimal(getDuration()))
                .divide(new BigDecimal(Commons.DAYS_PER_YEAR), Commons.SCALE, BigDecimal.ROUND_HALF_EVEN)
                .divide(new BigDecimal(Commons.PERCENTS), Commons.SCALE, BigDecimal.ROUND_HALF_EVEN);
        //return getRate() * getMinSum() * getDuration() / Commons.DAYS_PER_YEAR / Commons.PERCENTS;
    }

    @Override
    public String toString() {
        return new StringBuilder("DEPOSIT NAME: ").append(getName())
                                .append("\n\t").append("RATE: ").append(getRate()).append("%")
                                .append("\n\t").append("MINIMAL SUMM: ").append(getMinSum()).append("$")
                                .append("\n\t").append("DURATION: ").append(getDuration()).append(" DAYS")
                                .append("\n\t").append("BANK: ").append(getBank())
                                .append("\n\t").append("DEFAULT PROFIT: ").append(getProfit()).append("$")
                                .toString();
    }

    @Override
    public int compareTo(Deposit o) {
        return getProfit().intValue() - o.getProfit().intValue();

    }

}
