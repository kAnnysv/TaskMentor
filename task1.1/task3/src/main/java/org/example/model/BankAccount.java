package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankAccount {

    Long id;
    String name;
    Double amount;
    Boolean isActive;


}
