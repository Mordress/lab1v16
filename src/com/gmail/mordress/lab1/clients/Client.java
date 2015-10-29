package com.gmail.mordress.lab1.clients;

public class Client {

    private final String firstName;

    private final String lastName;

    private final Integer maxDuration;

    private Integer money;

    public Client(String firstName, String lastName, Integer maxDuration, Integer money) {
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

    public Integer getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
