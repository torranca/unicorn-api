package com.unicorn.bank.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AccountEntity {
    @Id
    private String id;
  
    private String name;
  
    private Double balance;
}
