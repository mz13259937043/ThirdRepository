package com.mao.pro.service;

import java.util.List;

import com.mao.pro.model.Account;

public interface AccountService {

	Account login(String username, String password);

	void regist(Account a1);

	List<Account> listAll();

}
