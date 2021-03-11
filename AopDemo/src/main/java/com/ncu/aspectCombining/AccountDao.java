package com.ncu.aspectCombining;

import org.springframework.stereotype.Component;

@Component("accountDao")
public class AccountDao {
	String AccountName;
	String AccountNo;

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		System.out.println("on setter");
		AccountName = accountName;
	}

	public String getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}

	public void addAccount(int no) {
		System.out.println("in account add"+no);
	}

	public AccountDao getAccountDao() {
		// TODO Auto-generated method stub
		return new AccountDao();
	}
	
}
