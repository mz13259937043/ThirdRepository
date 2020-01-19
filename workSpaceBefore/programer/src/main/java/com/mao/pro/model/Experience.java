package com.mao.pro.model;

import java.util.Date;

import lombok.Data;

@Data
public class Experience {

	private Integer eid; 
	private Date workDate;
	private String workPlace;
	private String workCompany;
	private String workPosition;
	private Integer pastSalay;
	private String fiveAndOne;
	
}
