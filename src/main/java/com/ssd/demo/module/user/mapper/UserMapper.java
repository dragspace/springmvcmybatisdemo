package com.ssd.demo.module.user.mapper;


import com.ssd.demo.base.core.BaseMapper;
import com.ssd.demo.module.user.bean.User;

public interface UserMapper extends BaseMapper<User>{
	public User getById(Integer id);
}
