package com.hand.springMVCExam.service;

import java.util.List;

import com.hand.springMVCExam.bean.Customer;
import com.hand.springMVCExam.bean.Pagination;

public interface CustomerLoginService {
	int getUserName(String userName);
	public int addCustomer(Customer customer);
	public int deleteCustomerById(int customerId);
	public List<Customer> getAllCustomer();
	public List<Customer> getCustomerPagination(Pagination p);
	public int editCustomerById(Customer customer);
}
