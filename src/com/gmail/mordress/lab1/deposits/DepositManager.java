package com.gmail.mordress.lab1.deposits;


import com.gmail.mordress.lab1.banks.Bank;
import com.gmail.mordress.lab1.clients.Client;

import java.util.LinkedList;
import java.util.List;

public class DepositManager {

    private static List<Deposit> allDeposits;

    private List<Deposit> availibleDepositsForClient;

    private Client client;

    public DepositManager(Client client) {
        this.client = client;
    }

    public static List<Deposit> getAllDeposits() {
        return allDeposits;
    }

    public static void setAllDeposits(List<Deposit> allDeposits) {
        DepositManager.allDeposits = allDeposits;
    }

    public List<Deposit> getAvailibleDepositsForClient() {
        return availibleDepositsForClient;
    }

    public void setAvailibleDepositsForClient(List<Deposit> availibleDepositsForClient) {
        this.availibleDepositsForClient = availibleDepositsForClient;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void initDeposits() {
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



}
