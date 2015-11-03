package com.gmail.mordress.lab1.clients;

import java.math.BigDecimal;

public class Client {

    private String firstName;

    private String lastName;

    /*How many days client can keep money at bank*/
    private Integer maxDuration;

    private BigDecimal money;

    public Client(String firstName, String lastName, Integer maxDuration, BigDecimal money) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.maxDuration = maxDuration;
        this.money = money;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getMaxDuration() {
        return maxDuration;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
