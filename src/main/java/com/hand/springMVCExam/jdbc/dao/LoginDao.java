package com.hand.springMVCExam.jdbc.dao;

import java.util.List;

import com.hand.springMVCExam.bean.User;

public interface LoginDao {
	User getUserByName(String userName);
	List<User> queryAllUser();
	int modifyUserInfo(User user);
	int addUser(User user);
	int addUserInBulk(List<User> list);
	int deleteUserByName(String userName);
}
