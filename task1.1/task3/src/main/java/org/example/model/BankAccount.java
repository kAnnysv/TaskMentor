package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankAccount {

    private Long id;
    private String name;
    private Double amount;
    private Boolean isActive;


}
