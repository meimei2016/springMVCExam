package com.hand.springMVCExam.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hand.springMVCExam.bean.User;
import com.hand.springMVCExam.common.Constants;
import com.hand.springMVCExam.jdbc.dao.LoginDao;
import com.hand.springMVCExam.service.UserLoginService;

public class UserLoginServiceImpl implements UserLoginService{
	@Autowired
	private LoginDao loginDao;
	

	String tipMessage=Constants.NULL;
	public boolean userInfoCheck(String userName,String password){		
		boolean result=false;
		if(userName.isEmpty()&&password.isEmpty()){
			tipMessage=Constants.TIP_MESSAGE_USER_USERNAME_PASSWORD_NULL;
			return result;
		}else{
			if(userName.isEmpty()){
				tipMessage=Constants.TIP_MESSAGE_USER_USERNAME_NULL;
				return result;
			}else if(password.isEmpty()){
				tipMessage=Constants.TIP_MESSAGE_USER_PASSWORD_NULL;
				return result;
			}else{
				User user=loginDao.getUserByName(userName);
				if(user==null){
					tipMessage=Constants.TIP_MESSAGE_USER_NOT_EXIST;
					return result;
				}else{
					if(password.equals(user.getPassword())&&userName.equals(user.getUserName())){
						result=true;					
					}
				}
				return result;
			}
		}		
	}
	public String getTipMessage(String userName,String password){
		
		boolean b=userInfoCheck(userName,password);
		if(b){
			return "";
		}else{
			if(!tipMessage.isEmpty()){
				return tipMessage;
			}else{
				return Constants.TIP_MESSAGE_USER_INFO_WRONG;
			}			
		}
		/*if(user==null){
			tipMessage="This user don't register so far.";
		}*/		
	}
	@Override
	public User getUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<User> queryAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int modifyUserInfo(User user) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int addUserInBulk(List<User> list) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteUserByName(String userName) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
