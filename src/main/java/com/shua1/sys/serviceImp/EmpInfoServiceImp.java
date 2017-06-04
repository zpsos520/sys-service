package com.shua1.sys.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shua1.sys.api.service.EmpInfoService;
import com.shua1.sys.base.mapper.EmpInfoMapper;
import com.shua1.sys.base.model.EmpInfo;

@Service
public class EmpInfoServiceImp implements EmpInfoService{

	@Autowired
	private EmpInfoMapper eminfoMapper;
	
	@Override
	public EmpInfo selectById(Integer id) {
		return eminfoMapper.selectByPrimaryKey(1);
	}
	
}
