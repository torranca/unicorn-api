package com.unicorn.bank.api.mapper;

import com.unicorn.bank.api.model.AccountEntity;
import com.unicorn.bank.model.Account;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

	public static AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

	@Mappings({
		@Mapping(target = "petId", source = "id"),
		@Mapping(target = "petName", source = "name"),
	   })
	AccountEntity mapTo(Account account);
	
	@InheritInverseConfiguration
	Account mapTo(AccountEntity accountEntity);
	
}
