package com.gmail.mordress.lab1;

import com.gmail.mordress.lab1.clients.Client;
import com.gmail.mordress.lab1.deposits.contorllers.DepositManager;

public class Main {

    public static void main(String[] args) {

        DepositManager.initDeposits();
        //DepositManager.printAllDeposits();

        Client client1 = new Client("James", "Gosling", 180, 2000);

        DepositManager depositManager = new DepositManager(client1);
        depositManager.printOptimalDeposits();



    }


}
