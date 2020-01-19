package com.mao.pro.model;

import java.util.Date;

import lombok.Data;

@Data
public class ApplyRequire {
	
	private Integer aid;
	private Integer expertSalary;
	private String expertPositon;
	private String expertIndustry;
	private Date releaseTime;

}
