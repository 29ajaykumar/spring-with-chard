package com.ajay.beforeadvicedemo.dao;

import com.ajay.beforeadvicedemo.Account;

public interface AccountDAO {

	void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);
}