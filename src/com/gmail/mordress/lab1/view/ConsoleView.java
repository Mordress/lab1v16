package com.gmail.mordress.lab1.view;

import com.gmail.mordress.lab1.clients.Client;
import com.gmail.mordress.lab1.deposits.DepositManager;

import java.util.Arrays;

public class ConsoleView {

    public static void main(String[] args) {

        DepositManager.initDeposits();
        DepositManager.printAllDeposits();

        Client client1 = new Client("James", "Gosling", 180, 2000);

        DepositManager depositManager = new DepositManager(client1);



    }


}
