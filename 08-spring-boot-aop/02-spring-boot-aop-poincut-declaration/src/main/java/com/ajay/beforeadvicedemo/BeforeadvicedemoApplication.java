package com.ajay.beforeadvicedemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ajay.beforeadvicedemo.dao.AccountDAO;
import com.ajay.beforeadvicedemo.dao.MembershipDAO;

@SpringBootApplication
public class BeforeadvicedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeforeadvicedemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

		return runner -> {

			demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

		// call the business method
				Account myAccount = new Account();
				theAccountDAO.addAccount(myAccount, true);
				theAccountDAO.doWork();

				// call the accountdao getter/setter methods
				theAccountDAO.setName("foobar");
				theAccountDAO.setServiceCode("silver");

				String name = theAccountDAO.getName();
				String code = theAccountDAO.getServiceCode();

				// call the membership business method
				theMembershipDAO.addSillyMember();
				theMembershipDAO.goToSleep();

	}

}
