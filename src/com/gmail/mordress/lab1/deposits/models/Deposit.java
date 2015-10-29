package com.gmail.mordress.lab1.deposits.models;

import com.gmail.mordress.lab1.banks.Bank;

public abstract class Deposit implements Comparable<Deposit>{

    public static final int DAYS_PER_YEAR = 365;

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

    public Integer getRate() {
        return rate;
    }

    public Integer getMinSum() {
        return minSum;
    }

    public Integer getDuration() {
        return duration;
    }

    public Bank getBank() {
        return bank;
    }

    public Integer getProfit() {
        return this.getRate() * this.getMinSum() * this.getDuration() / DAYS_PER_YEAR / 100;
    }

    @Override
    public String toString() {
        return new StringBuilder("DEPOSIT NAME: ").append(getName())
                                .append("\n\t").append("RATE: ").append(getRate()).append("%")
                                .append("\n\t").append("MINIMAL SUMM: ").append(getMinSum()).append("$")
                                .append("\n\t").append("DURATION: ").append(getDuration()).append(" DAYS")
                                .append("\n\t").append("BANK: ").append(getBank())
                                .append("\n\t").append("DEFAULT PROFIT: ").append(this.getProfit()).append("$")
                                .toString();
    }

    @Override
    public int compareTo(Deposit o) {
        return this.getProfit() - o.getProfit();

    }
}
