package com.unicorn.bank.api.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.unicorn.bank.api.model.AccountEntity;
import com.unicorn.bank.model.Account;
import com.unicorn.bank.model.Account.CurrencyEnum;

import org.junit.jupiter.api.Test;

public class AccountMapperTests {
    
    @Test
    public void testMapping(){

        Account account = new Account();
        account.setId("test");
        account.setName("Piggy");
        account.setBalance(1.0);
        account.setCurrency(CurrencyEnum.USD);

        AccountEntity accountEntity = AccountMapper.INSTANCE.mapTo(account);
        
        assertEquals(account.getId(), accountEntity.getId());
        assertEquals(account.getCurrency().name(), accountEntity.getCurrency());
        
    }
}
