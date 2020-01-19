package com.mao.pro.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.mao.pro.model.PerfectInfo;

public interface PerfectInfoMapper {

	@Insert("insert into perfectInfo(realname,idcard) values (#{realname},#{idcard})")
	int realnameCertify(String realname,String idcard);

	@Insert("insert into perfectInfo (phone,friend,sex,motto,lable) values(#{phone},#{friend},#{sex},#{motto},#{lable})")
	int fillOther(PerfectInfo perfectInfo);

}
