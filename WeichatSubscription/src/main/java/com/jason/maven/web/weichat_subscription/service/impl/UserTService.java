package com.jason.maven.web.weichat_subscription.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jason.maven.web.weichat_subscription.dao.IUserTDao;
import com.jason.maven.web.weichat_subscription.model.UserT;
import com.jason.maven.web.weichat_subscription.service.IUserTService;

@Service("userService")
public class UserTService implements IUserTService {

	@Resource
	IUserTDao userTDao;
	
	@Override
	public UserT getUserById(int userId) {
		return this.userTDao.selectByPrimaryKey(userId);
	}

}
