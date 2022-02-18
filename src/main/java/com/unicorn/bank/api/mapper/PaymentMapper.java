package com.unicorn.bank.api.mapper;

import com.unicorn.bank.api.model.PaymentEntity;
import com.unicorn.bank.model.Payment;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentMapper {

	public static PaymentMapper INSTANCE = Mappers.getMapper(PaymentMapper.class);

	PaymentEntity mapTo(Payment payment);
	Payment mapTo(PaymentEntity paymentEntity);
	
}