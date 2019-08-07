package com.yanglin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanglin.dao.UserDao;
import com.yanglin.service.UserService;

/**
 * 作者: 杨霖
 * 日期: 2019年8月7日
 * 时间: 上午8:51:57
 */
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;

	@Override
	public List<Map<String, Object>> selectAll() {
		List<Map<String, Object>> selectAll = userDao.selectAll();
		return selectAll;
	}
}
