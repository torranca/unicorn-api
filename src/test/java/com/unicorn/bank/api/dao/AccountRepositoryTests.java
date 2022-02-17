package com.unicorn.bank.api.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import com.unicorn.bank.api.model.AccountEntity;
import com.unicorn.bank.model.Account;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AccountRepositoryTests {
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private AccountRepository accountRepository;

	@Test
	public void testFindByLastName() {
		
		AccountEntity account = new AccountEntity();
		account.setId("unicorn");
		
		entityManager.persist(account);

		Optional<AccountEntity> retrieved = accountRepository.findById(account.getId());
		
		assertThat(retrieved.isPresent());
	}
}