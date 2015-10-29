package com.gmail.mordress.lab1.clients;

import com.gmail.mordress.lab1.deposits.Deposit;

import java.util.*;

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

/*    public List<Deposit> getOptimalAvailibleDeposits(List<Deposit> allDeposits) {
        List<Deposit> availibleDeposits = new LinkedList<>();
        for (Deposit deposit : allDeposits) {
            if (this.getMoney() >= deposit.getMinSum() && this.getMaxDuration() >= deposit.getDuration()) {
                availibleDeposits.add(deposit);
            }
        }
        Collections.sort(availibleDeposits);
        Collections.reverse(availibleDeposits);
        return availibleDeposits;
    }*/

}
