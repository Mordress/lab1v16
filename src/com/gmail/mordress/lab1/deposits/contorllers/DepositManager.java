package com.gmail.mordress.lab1.deposits.contorllers;


import com.gmail.mordress.lab1.banks.Bank;
import com.gmail.mordress.lab1.clients.Client;
import com.gmail.mordress.lab1.deposits.models.Deposit;
import com.gmail.mordress.lab1.deposits.models.ImmutableDeposit;
import com.gmail.mordress.lab1.deposits.models.MutableDeposit;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DepositManager {

    private static List<Deposit> allDeposits;

    private List<Deposit> availableDeposits;

    private List<Deposit> optimalDeposits;

    private List<Deposit> foundedDeposits;

    private Client client;

    public DepositManager(Client client) {
        this.client = client;
        availableDeposits = new LinkedList<>();
        for (Deposit iter : allDeposits) {
            if (this.client.getMoney() >= iter.getMinSum() && this.client.getMaxDuration() >= iter.getDuration()) {
                this.availableDeposits.add(iter);
            }
        }
        if (availableDeposits != null) {
            optimalDeposits = new LinkedList<>(availableDeposits);
            Collections.sort(optimalDeposits);
            Collections.reverse(optimalDeposits);
        }
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

    public static void initDeposits() {
        allDeposits = new LinkedList<>();
        allDeposits.add(new ImmutableDeposit("Basic", 12, 1000, 180, Bank.ALPHA_BANK));
        allDeposits.add(new MutableDeposit("Advanced", 6, 1800, 60, Bank.ALPHA_BANK, 20, 20));
        allDeposits.add(new MutableDeposit("AdvancedPlus", 5, 2000, 90, Bank.ALPHA_BANK, 30, 30));
        allDeposits.add(new ImmutableDeposit("Ultra", 20, 1500, 120, Bank.BETA_BANK));
        allDeposits.add(new ImmutableDeposit("UltraPlus", 18, 1900, 270, Bank.BETA_BANK));
        allDeposits.add(new MutableDeposit("Mega", 5, 2200, 180, Bank.BETA_BANK, 45, 25));
        allDeposits.add(new ImmutableDeposit("FastMoney", 23, 1000, 240, Bank.GAMMA_BANK));
        allDeposits.add(new MutableDeposit("Buisness", 5, 2000, 90, Bank.GAMMA_BANK, 45, 15));
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

    public void printOptimalDeposits() {
        System.out.println("For " + this.client + " optimal deposits (descending):");
        if (!optimalDeposits.isEmpty()) {
            for (Deposit iter : optimalDeposits) {
                System.out.println(iter);
            }
        } else {
            System.out.println("Sorry, we have not available deposits for this client");
        }
    }

    public DepositManager findDepositsByRate(Integer rate) {
        foundedDeposits = new LinkedList<>();
        for (Deposit iter : allDeposits) {
            if (rate <= iter.getRate()) {
                foundedDeposits.add(iter);
            }
        }
        return this;
    }

    public DepositManager findDepositsByDuration(Integer duration) {
        foundedDeposits = new LinkedList<>();
        for (Deposit iter : availableDeposits) {
            if (duration >= iter.getDuration()) {
                foundedDeposits.add(iter);
            }
        }
        return this;
    }

    public DepositManager findDepositsByMinimalSumm(Integer minSumm) {
        foundedDeposits = new LinkedList<>();
        for (Deposit iter : availableDeposits) {
            if (minSumm >= iter.getMinSum()) {
                foundedDeposits.add(iter);
            }
        }
        return this;
    }

    public DepositManager findDepositsByBank(Bank bank) {
        foundedDeposits = new LinkedList<>();
        for (Deposit iter : availableDeposits) {
            if (bank.equals(iter.getBank())) {
                foundedDeposits.add(iter);
            }
        }
        return this;
    }

    public void printFoundedDeposits() {
        for (Deposit deposit : foundedDeposits) {
            System.out.println(deposit);
        }
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *");
    }






}
