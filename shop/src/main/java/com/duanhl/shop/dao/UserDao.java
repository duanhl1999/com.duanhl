package com.duanhl.shop.dao;

import java.util.List;

import com.duanhl.shop.domain.User;

public interface UserDao {
	int addUser();
	List<User> select();
}
