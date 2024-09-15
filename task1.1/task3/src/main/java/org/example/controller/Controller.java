package org.example.controller;

import org.example.model.BankAccount;
import org.example.services.Service;

import java.util.List;
import java.util.Optional;

public class Controller {

    public static void moneyTransferController(BankAccount account1, BankAccount account2, Double sum) throws Exception{
        Service.moneyTransfer(account1, account2, sum);
    }
    public static List<BankAccount> listNoActive(List<BankAccount> accounts){
        return Service.checkAccount(accounts);
    }
    public static Optional<BankAccount> findById(List<BankAccount> accounts, Long id){
        return Service.checkId(accounts, id);
    }

}
