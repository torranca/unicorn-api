package com.unicorn.bank.api;

import java.util.Optional;

import com.unicorn.bank.api.dao.AccountRepository;
import com.unicorn.bank.api.mapper.AccountMapper;
import com.unicorn.bank.api.model.AccountEntity;
import com.unicorn.bank.model.Account;
import com.unicorn.bank.model.Account.CurrencyEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class AccountsApiImpl implements AccountApiDelegate {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public ResponseEntity<Account> getAccount(String id) {

        Optional<AccountEntity> accountEntity = accountRepository.findById(id);
        
        // if it doesnt exist ... create a new one with $0 balance
        if(!accountEntity.isPresent()) {
            Account account = new Account();
            account.setId(id);
            account.setName("Piggy Bank");
            account.setBalance(0.0);
            account.setCurrency(CurrencyEnum.USD);
            
            AccountEntity newAccountEntity = accountRepository.save(AccountMapper.INSTANCE.mapTo(account));
            
            return ResponseEntity.ok(AccountMapper.INSTANCE.mapTo(newAccountEntity));

        } else {
            return ResponseEntity.ok(AccountMapper.INSTANCE.mapTo(accountEntity.get()));

        }
        
    }
    


}
