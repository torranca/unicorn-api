package com.unicorn.bank.api;

import com.unicorn.bank.model.Account;
import com.unicorn.bank.model.Account.CurrencyEnum;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class AccountsApiImpl implements AccountApiDelegate {

    @Override
    public ResponseEntity<Account> getAccount(String id) {
        Account account = new Account();
        account.setId(id);
        account.setName("Piggy");
        account.setBalance(0.0);
        account.setCurrency(CurrencyEnum.USD);
        return ResponseEntity.ok(account);
    }
    


}