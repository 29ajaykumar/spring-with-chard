package com.ajay.beforeadvicedemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ajay.beforeadvicedemo.dao.AccountDAO;
import com.ajay.beforeadvicedemo.dao.MemberDAO;

@SpringBootApplication
public class BeforeadvicedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeforeadvicedemoApplication.class, args);
	}
	@Bean
	 public CommandLineRunner comdLineRunner(AccountDAO accountDao,MemberDAO memberDao) {
		 return runner->{
			 theBeforeAdvice(accountDao,memberDao);
		 }; 
	 }
	private void theBeforeAdvice(AccountDAO accountDao,MemberDAO memberDao) {
		accountDao.addAccount();
		memberDao.addAccount();
		memberDao.addAddress("10/15");
		
	}

}
