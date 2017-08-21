package com.hb.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hb.dao.BaseDaoImpl;

@Service
public class BaseService {
	@Resource
	BaseDaoImpl baseDaoImpl;
	public String getStringList(){
		System.out.println("进入baseService***");
		System.out.println(baseDaoImpl.findUserByNameTest());
		return "1";
	}
}
