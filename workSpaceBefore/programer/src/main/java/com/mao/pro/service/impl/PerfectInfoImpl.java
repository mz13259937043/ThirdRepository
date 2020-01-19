package com.mao.pro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mao.pro.mappers.PerfectInfoMapper;
import com.mao.pro.model.PerfectInfo;
import com.mao.pro.service.PerfectInfoService;

@Service("perfectInfoService")
public class PerfectInfoImpl implements PerfectInfoService {
	
	@Autowired
	private PerfectInfoMapper perfectInfoMapper;

	@Override
	public int realnameCertify(String realname, String idcard) {
		return perfectInfoMapper.realnameCertify(realname,idcard);
	}

	@Override
	public int fillOther(PerfectInfo perfectInfo) {
		return perfectInfoMapper.fillOther(perfectInfo);
	}

}
