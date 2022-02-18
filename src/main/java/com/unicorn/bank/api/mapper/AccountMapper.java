package com.unicorn.bank.api.mapper;

import com.unicorn.bank.api.model.AccountEntity;
import com.unicorn.bank.model.Account;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

	public static AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

	AccountEntity mapTo(Account account);
	Account mapTo(AccountEntity accountEntity);
	
}
