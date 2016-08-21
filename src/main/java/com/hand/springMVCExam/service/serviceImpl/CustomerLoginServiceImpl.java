package com.hand.springMVCExam.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hand.springMVCExam.bean.Customer;
import com.hand.springMVCExam.bean.Pagination;
import com.hand.springMVCExam.jdbc.dao.CustomerLoginDao;
import com.hand.springMVCExam.service.CustomerLoginService;

public class CustomerLoginServiceImpl implements CustomerLoginService{
	@Autowired
	private CustomerLoginDao customerLoginDao;
	@Override
	public int getUserName(String userName) {
		int count=0;
		if(!userName.isEmpty()){
			count=customerLoginDao.getUserName(userName);
		}
		return count;
	}
	@Override
	public int addCustomer(Customer customer) {
		int result=customerLoginDao.addCustomer(customer);
		return result;
	}
	@Override
	public int deleteCustomerById(int customerId) {
		int result=customerLoginDao.deleteCustomerById(customerId);
		return result;
	}
	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> list=customerLoginDao.getAllCustomer();
		return list;
	}
	@Override
	public List<Customer> getCustomerPagination(Pagination p) {		
		List<Customer> list=customerLoginDao.getCustomerPagination(p);
		return list;
	}
	
}
