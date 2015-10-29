package com.gmail.mordress.lab1.view;

import com.gmail.mordress.lab1.banks.Bank;
import com.gmail.mordress.lab1.clients.Client;
import com.gmail.mordress.lab1.deposits.Deposit;
import com.gmail.mordress.lab1.deposits.ImmutableDeposit;
import com.gmail.mordress.lab1.deposits.MutableDeposit;

import java.util.*;

public class ConsoleView {

    static List<Deposit> allDeposits;

    public static void main(String[] args) {

        //create and show all deposits
        allDeposits = createAllDeposits();
        System.out.println(Arrays.asList(allDeposits));

        System.out.println("************************************");

        //create client and show optimal deposits for his requires
        Client client1 = new Client("Alex", "Brown", 120, 1800);
        System.out.println("For client " + client1.getFirstName() + " " + client1.getLastName() + " optimal deposits:");
        System.out.println(Arrays.asList(client1.getOptimalAvailibleDeposits(allDeposits)));

    }

    public static LinkedList<Deposit> createAllDeposits() {
        LinkedList<Deposit> deposits = new LinkedList<Deposit>();

        Deposit deposit1 = new ImmutableDeposit("Basic", 12, 1000, 180, Bank.ALPHA_BANK);
        Deposit deposit2 = new MutableDeposit("Advanced", 6, 1800, 60, Bank.ALPHA_BANK, 20, 20);
        Deposit deposit3 = new MutableDeposit("AdvancedPlus", 5, 2000, 90, Bank.ALPHA_BANK, 30, 30);

        Deposit deposit4 = new ImmutableDeposit("Ultra", 20, 1500, 120, Bank.BETA_BANK);
        Deposit deposit5 = new ImmutableDeposit("UltraPlus", 18, 1900, 270, Bank.BETA_BANK);
        Deposit deposit6 = new MutableDeposit("Mega", 5, 2200, 180, Bank.BETA_BANK, 45, 25);

        Deposit deposit7 = new ImmutableDeposit("EasyMoney", 25, 1700, 120, Bank.GAMMA_BANK);
        Deposit deposit8 = new ImmutableDeposit("FastMoney", 23, 1000, 240, Bank.GAMMA_BANK);
        Deposit deposit9 = new MutableDeposit("Buisness", 5, 2000, 90, Bank.GAMMA_BANK, 45, 15);

        deposits.add(deposit1);
        deposits.add(deposit2);
        deposits.add(deposit3);
        deposits.add(deposit4);
        deposits.add(deposit5);
        deposits.add(deposit6);
        deposits.add(deposit7);
        deposits.add(deposit8);
        deposits.add(deposit9);

        return deposits;
    }


}
