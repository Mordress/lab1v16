package com.gmail.mordress.lab1.deposits.controllers;

import com.gmail.mordress.lab1.banks.Bank;
import com.gmail.mordress.lab1.clients.Client;
import com.gmail.mordress.lab1.deposits.models.Deposit;
import com.gmail.mordress.lab1.deposits.models.ImmutableDeposit;
import com.gmail.mordress.lab1.deposits.models.MutableDeposit;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DepositManager {

    private static List<Deposit> allDeposits;

    static {
        allDeposits = new ArrayList<>(10);
        allDeposits.add(new ImmutableDeposit("Basic", 12, new BigDecimal(1000), 180, Bank.ALPHA_BANK));
        allDeposits.add(new MutableDeposit("Advanced", 6, new BigDecimal(1500), 60, Bank.ALPHA_BANK, 20, new BigDecimal(20)));
        allDeposits.add(new MutableDeposit("AdvancedPlus", 5, new BigDecimal(2000), 90, Bank.ALPHA_BANK, 30, new BigDecimal(30)));
        allDeposits.add(new ImmutableDeposit("Ultra", 20, new BigDecimal(1700), 120, Bank.BETA_BANK));
        allDeposits.add(new ImmutableDeposit("UltraPlus", 18, new BigDecimal(1900), 270, Bank.BETA_BANK));
        allDeposits.add(new MutableDeposit("Mega", 5, new BigDecimal(2200), 180, Bank.BETA_BANK, 45, new BigDecimal(50)));
        allDeposits.add(new ImmutableDeposit("FastMoney", 23, new BigDecimal(1000), 240, Bank.GAMMA_BANK));
        allDeposits.add(new MutableDeposit("Buisness", 5, new BigDecimal(1400), 90, Bank.GAMMA_BANK, 45, new BigDecimal(25)));
    }

    //List with available deposits for client sorted by profit(from max to min)
    private List<Deposit> availableDeposits;

    private List<Deposit> foundedDeposits;

    private Client client;

    public DepositManager(Client client) {
        this.client = client;
        availableDeposits = new ArrayList<>(10);
        for (Deposit iter : allDeposits) {
            if (this.client.getMoney().intValue() >= iter.getMinSum().intValue() && this.client.getMaxDuration() >= iter.getDuration()) {
                this.availableDeposits.add(iter);
            }
        }
        Collections.sort(availableDeposits);
        Collections.reverse(availableDeposits);

    }

    public static List<Deposit> getAllDeposits() {
        return allDeposits;
    }

    public static void setAllDeposits(List<Deposit> allDeposits) {
        DepositManager.allDeposits = allDeposits;
    }

    public List<Deposit> getAvailableDeposits() {
        return availableDeposits;
    }

    public void setAvailableDeposits(List<Deposit> availableDeposits) {
        this.availableDeposits = availableDeposits;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public static void printAllDeposits() {
        for (Deposit iter : allDeposits) {
            System.out.println(iter);
        }
    }

    public void printAvailableDeposits() {
        System.out.println("For " + this.client + " available deposits:");
        if (!availableDeposits.isEmpty()) {
            for (Deposit iter : availableDeposits) {
                System.out.println(iter);
            }
        } else {
            System.out.println("Sorry, we have not available deposits for this client");
        }
    }

    public DepositManager findDepositsByRate(Integer rate) {
        foundedDeposits = new ArrayList<>(10);
        for (Deposit iter : allDeposits) {
            if (rate <= iter.getRate()) {
                foundedDeposits.add(iter);
            }
        }
        return this;
    }

    public DepositManager findDepositsByDuration(Integer duration) {
        foundedDeposits = new ArrayList<>(10);
        for (Deposit iter : availableDeposits) {
            if (duration >= iter.getDuration()) {
                foundedDeposits.add(iter);
            }
        }
        return this;
    }

    public DepositManager findDepositsByMinimalSumm(BigDecimal minSumm) {
        foundedDeposits = new ArrayList<>(10);
        for (Deposit iter : availableDeposits) {
            if (minSumm.intValue() >= iter.getMinSum().intValue()) {
                foundedDeposits.add(iter);
            }
        }
        return this;
    }

    public DepositManager findDepositsByBank(Bank bank) {
        foundedDeposits = new ArrayList<>(10);
        for (Deposit iter : availableDeposits) {
            if (bank.equals(iter.getBank())) {
                foundedDeposits.add(iter);
            }
        }
        return this;
    }

    public void printFoundedDeposits() {
        if (foundedDeposits != null) {
            for (Deposit deposit : foundedDeposits) {
                System.out.println(deposit);
            }
        }
    }

}
