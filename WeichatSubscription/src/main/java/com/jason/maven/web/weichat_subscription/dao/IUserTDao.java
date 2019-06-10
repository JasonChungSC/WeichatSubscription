package com.jason.maven.web.weichat_subscription.dao;

import org.springframework.stereotype.Component;

import com.jason.maven.web.weichat_subscription.model.UserT;

public interface IUserTDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserT record);

    int insertSelective(UserT record);

    UserT selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserT record);

    int updateByPrimaryKey(UserT record);
}