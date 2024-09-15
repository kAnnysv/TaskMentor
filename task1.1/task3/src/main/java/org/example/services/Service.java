package org.example.services;

import org.example.model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Service {



    public static void moneyTransfer(BankAccount account1, BankAccount account2, Double sum) throws Exception {
        if(account1.getAmount() < sum || !account1.getIsActive() || !account2.getIsActive()){
            throw new Exception();
        }
        account1.setAmount(account1.getAmount() - sum);
        account2.setAmount(account2.getAmount() + sum);
    }
    public static List<BankAccount> checkAccount(List<BankAccount> accounts){

         return  accounts.stream().filter(x -> x.getIsActive() == false).collect(Collectors.toList());
    }

    public static Optional<BankAccount> checkId(List<BankAccount> accounts, Long id){
        return accounts.stream().filter(x -> x.getId().equals(id)).findFirst();
    }
}
