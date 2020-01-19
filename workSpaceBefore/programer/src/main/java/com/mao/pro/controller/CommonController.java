package com.mao.pro.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mao.pro.model.Account;
import com.mao.pro.service.AccountService;

@Controller
@RequestMapping("/common")
public class CommonController {
	
	@Resource
	private AccountService accountService;
	
	@GetMapping("/listAll")
	public void listAllAcc() {
		List<Account> accs = accountService.listAll();
		for (Account account : accs) {
			System.out.println(account.getUsername());
		}
	}

}