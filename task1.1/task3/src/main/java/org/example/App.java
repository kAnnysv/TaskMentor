package org.example;

import org.example.controller.Controller;
import org.example.model.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        List<BankAccount> accounts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            accounts.add(new BankAccount((long) i, "Person" + i, amount(i), new Random().nextBoolean()));

        }
        System.out.println(Controller.listNoActive(accounts));
        System.out.println("NotActive - " + Controller.listNoActive(accounts).size());
        System.out.println(Controller.findById(accounts, 9L));
        Controller.moneyTransferController(accounts.get(4), accounts.get(7), 100.8);

    }

    public static Double amount(int i){
        return (double) (Math.random() * 1000 * i);
    }


}
