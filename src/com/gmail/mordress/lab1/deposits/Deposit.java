package com.gmail.mordress.lab1.deposits;

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

    @Override
    public String toString() {
        return new StringBuilder("\n").append("DEPOSIT NAME: ").append(name)
                                .append("\n").append("\t").append("RATE: ").append(rate).append("%")
                                .append("\n").append("\t").append("MINIMAL SUMM: ").append(minSum).append("$")
                                .append("\n").append("\t").append("DURATION: ").append(duration).append(" DAYS")
                                .append("\n").append("\t").append("BANK: ").append(bank)
                                .append("\n").append("\t").append("MAX PROFIT: ").append(this.getProfit()).append("$")
                                .toString();
    }

    public Integer getProfit() {
        return this.getRate() * this.getMinSum() * this.getDuration() / DAYS_PER_YEAR / 100;
    }

    @Override
    public int compareTo(Deposit o) {
        return this.getProfit() - o.getProfit();

    }
}
