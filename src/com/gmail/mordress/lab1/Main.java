package com.gmail.mordress.lab1;

import com.gmail.mordress.lab1.banks.Bank;
import com.gmail.mordress.lab1.clients.Client;
import com.gmail.mordress.lab1.deposits.controllers.DepositManager;

public class Main {

    public static void main(String[] args) {

        DepositManager.initDeposits();

        Client client1 = new Client("James", "Gosling", 180, 2000);
        DepositManager depositManager1 = new DepositManager(client1);
        depositManager1.printOptimalDeposits();

        Client client2 = new Client("Bill", "Gates", 120, 1500);
        DepositManager depositManager2 = new DepositManager(client2);
        depositManager2.printOptimalDeposits();

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * *");

        depositManager1.findDepositsByBank(Bank.ALPHA_BANK).printFoundedDeposits();
        depositManager1.findDepositsByDuration(120).printFoundedDeposits();
        depositManager1.findDepositsByRate(10).printFoundedDeposits();

    }


}
