package com.unicorn.bank.api;

import java.util.Optional;

import com.unicorn.bank.api.dao.AccountRepository;
import com.unicorn.bank.api.mapper.AccountMapper;
import com.unicorn.bank.api.mapper.PaymentMapper;
import com.unicorn.bank.api.model.AccountEntity;
import com.unicorn.bank.api.model.PaymentEntity;
import com.unicorn.bank.model.Account;
import com.unicorn.bank.model.Account.CurrencyEnum;
import com.unicorn.bank.model.Payment;
import com.unicorn.bank.api.dao.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PaymentsApiImpl implements PaymentApiDelegate {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    PaymentRepository PaymentRepository;

    
    public AccountEntity getAccount(String id) {

        Optional<AccountEntity> accountEntity = accountRepository.findById(id);
        
        // if it doesnt exist ... create a new one with $0 balance
        if(!accountEntity.isPresent()) {
            Account account = new Account();
            account.setId(id);
            account.setName("Piggy Bank");
            account.setBalance(0.0);
            account.setCurrency(CurrencyEnum.USD);
            
            AccountEntity newAccountEntity = accountRepository.save(AccountMapper.INSTANCE.mapTo(account));
            
            return newAccountEntity;

        } else {
            return accountEntity.get();
        }
        
    }


    @Override
    public ResponseEntity<Payment> postPayment(Payment payment) {
        
        //get from account
        AccountEntity fromAccount = getAccount(payment.getFromAccountId());
        //get to account
        AccountEntity toAccount = getAccount(payment.getToAccountId());

        //take money from from
        fromAccount.setBalance(fromAccount.getBalance() - payment.getAmount());

        //put money in to
        toAccount.setBalance(toAccount.getBalance() + payment.getAmount());
        
        // save payment
        PaymentEntity paymentEntity = PaymentMapper.INSTANCE.mapTo(payment);
        PaymentEntity newPaymentEntity = PaymentRepository.save(paymentEntity);

        // save account(s)
        accountRepository.save(fromAccount);
        accountRepository.save(toAccount);

        return ResponseEntity.ok(PaymentMapper.INSTANCE.mapTo(newPaymentEntity));
    }


}
