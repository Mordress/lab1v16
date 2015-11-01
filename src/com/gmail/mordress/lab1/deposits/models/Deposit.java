package com.gmail.mordress.lab1.deposits.models;

import com.gmail.mordress.lab1.Commons;
import com.gmail.mordress.lab1.banks.Bank;

public abstract class Deposit implements Comparable<Deposit> {

    protected String name;

    protected Integer rate;

    protected Integer minSum;

    protected Integer duration;

    protected Bank bank;

    public Deposit(String name, Integer rate, Integer minSum, Integer duration, Bank bank) {
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

    public Integer getMinSum() {
        return minSum;
    }

    public void setMinSum(Integer minSum) {
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
    public Integer getProfit() {
        return getRate() * getMinSum() * getDuration() / Commons.DAYS_PER_YEAR / Commons.PERCENTS;
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
        return getProfit() - o.getProfit();

    }

}
