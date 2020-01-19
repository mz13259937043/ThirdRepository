package com.mao.pro.service;

import com.mao.pro.model.PerfectInfo;

public interface PerfectInfoService {

	int realnameCertify(String realname, String idcard);

	int fillOther(PerfectInfo perfectInfo);

}
