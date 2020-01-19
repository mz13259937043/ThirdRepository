package com.mao.pro;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.mao.pro.model","com.mao.pro.controller","com.mao.pro.mappers","com.mao.pro.service"})
//@ComponentScan(basePackages = {"com.mao.pro.model"})
@MapperScan("com.mao.pro.mappers")
public class ProgramerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgramerApplication.class, args);
	}

}
