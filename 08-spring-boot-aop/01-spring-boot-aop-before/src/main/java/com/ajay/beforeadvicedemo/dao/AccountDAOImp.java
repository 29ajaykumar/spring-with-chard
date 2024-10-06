package com.ajay.beforeadvicedemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImp implements AccountDAO{

	@Override
	public void addAccount() {
		System.out.println(getClass()+": Doing my DB work Here for adding account");
		
	}

}
