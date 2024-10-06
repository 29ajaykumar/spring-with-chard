package com.ajay.beforeadvicedemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImp implements MemberDAO{

	@Override
	public void addAccount() {
		System.out.println(getClass()+": Doing my DB work Here for adding account");
		
	}

	@Override
	public void addAddress(String address) {
		System.out.println(getClass()+": Adding address "+address);
		
	}

}
