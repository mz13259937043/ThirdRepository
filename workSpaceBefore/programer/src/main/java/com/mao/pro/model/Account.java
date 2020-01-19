package com.mao.pro.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Account {
	private Integer uid;
	private String username;
	private String password;
	private String email;
	private String roles;
	
}
