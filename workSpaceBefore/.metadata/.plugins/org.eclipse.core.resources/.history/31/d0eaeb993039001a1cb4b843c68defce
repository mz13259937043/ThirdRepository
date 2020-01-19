package com.mao.pro.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mao.pro.model.Account;
import com.mao.pro.service.AccountService;
import com.mao.pro.utils.SessionUtil;

@Controller
@RequestMapping("/index")
public class IndexController extends SessionUtil{
	
	@Resource
	private AccountService accountService;
	
	@RequestMapping("/login")
	//@ResponseBody
	public String login(HttpSession session,String username,String password){
		System.out.println("-----------------登陆----------------");
		System.out.println(username+":"+password);
		Account a1 = accountService.login(username,password);
		System.out.println(a1);
		setUserSession(session, a1);
//		登陆后转发到主页
		return "mainPage";
	}
	@RequestMapping("/regist")
	public String regist(Account a1,Model m1) {
		System.out.println("-----------------注册----------------");
		accountService.regist(a1);
		m1.addAttribute("user", a1);
		return "index";
	}
	@RequestMapping("/exit")
	public String exit(HttpSession session,HttpServletRequest req,HttpServletResponse resp) throws IOException {
		System.out.println("-----------------退出----------------");
		getUserSession(session);
		session.removeAttribute("user");
		return "redirect:/index/login";
	}
	
	@ResponseBody
	@GetMapping("/getLoginUser")
	public Account getSessionUser(HttpSession session) {
		Account a1 = getUserSession(session);
		System.out.println(a1);
		return a1;
	}
}
