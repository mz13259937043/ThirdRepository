package com.mao.pro.model;

import java.util.Date;

import lombok.Data;

@Data
public class OrderInfo {
	
	private Integer oid;
	private String orderName;
	private Date mkOrderTime;
	private Integer orderCount;
	private Integer totalAmount;	

}
