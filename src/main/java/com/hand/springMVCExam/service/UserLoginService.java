package com.hand.springMVCExam.service;

import java.util.List;

import com.hand.springMVCExam.bean.User;

public interface UserLoginService {
	
	User getUser(String userName);
	String getTipMessage(String userName,String password);
	boolean userInfoCheck(String userName,String password);
	List<User> queryAllUser();
	int modifyUserInfo(User user);
	int addUser(User user);
	int addUserInBulk(List<User> list);
	int deleteUserByName(String userName);

}
