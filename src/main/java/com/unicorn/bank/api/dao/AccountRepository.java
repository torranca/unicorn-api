package com.unicorn.bank.api.dao;

import java.util.Optional;

import com.unicorn.bank.api.model.AccountEntity;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountEntity, String> {
    
    Optional<AccountEntity> findById(String id);
    
}

