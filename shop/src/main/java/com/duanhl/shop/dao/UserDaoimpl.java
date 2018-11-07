package com.duanhl.shop.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duanhl.shop.domain.User;

@Service(value="userDao")
public class UserDaoimpl implements UserDao{

	@Override
	public int addUser() {
		
		return 0;
	}

	@Override
	public List<User> select() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
