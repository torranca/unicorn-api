package com.unicorn.bank.api.dao;

import com.unicorn.bank.api.model.PaymentEntity;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<PaymentEntity, String> {
}

