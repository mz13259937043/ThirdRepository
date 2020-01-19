package com.mao.pro.utils;

import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import com.mao.pro.model.Account;

public abstract class SessionUtil {

	public Account getUserSession(HttpSession session) {
		return (Account) session.getAttribute("user");
	}
	
	public void setUserSession(HttpSession session ,Account user) {
		session.setAttribute("user", user);
	}
	
}
