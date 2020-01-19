package com.mao.pro.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mao.pro.model.Account;

public interface AccountMapper {

	@Select("select * from account where username = #{username} and password = #{password}")
	Account login(@Param("username") String username,@Param("password") String password);
	
	@Insert("insert into account(username,password,email) values(#{username},#{password},#{email})")
	int regist(Account a1);

	@Select("select * from account ")
	List<Account> listAll();

}
