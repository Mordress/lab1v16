package com.gmail.mordress.lab1;

import com.gmail.mordress.lab1.clients.Client;
import com.gmail.mordress.lab1.deposits.contorllers.DepositManager;

public class Main {

    public static void main(String[] args) {

        DepositManager.initDeposits();
        //DepositManager.printAllDeposits();
        //System.out.println("* * * * *");

        Client client1 = new Client("James", "Gosling", 180, 2000);
        DepositManager depositManager = new DepositManager(client1);
        depositManager.printOptimalDeposits();

        Client client2 = new Client("Bill", "Gates", 120, 1500);
        DepositManager depositManager2 = new DepositManager(client2);
        depositManager2.printOptimalDeposits();

    }


}
