package com.unicorn.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.unicorn.bank.api.dao")
public class UnicornApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnicornApiApplication.class, args);
	}

}
