package com.unicorn.bank.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountEntity {
    @Id
    private String id;
  
    private String name;
  
    private Double balance;

    private String currency;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
}
