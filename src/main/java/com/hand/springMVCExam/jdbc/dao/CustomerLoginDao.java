package com.hand.springMVCExam.jdbc.dao;

import java.util.List;

import com.hand.springMVCExam.bean.Customer;
import com.hand.springMVCExam.bean.Pagination;

public interface CustomerLoginDao {
	int getUserName(String userName);
	public List<Customer> getCustomerPagination(Pagination p);
	public List<Customer> getAllCustomer();
	public int addCustomer(Customer customer);
	public int deleteCustomerById(int customer_id);
	public int editCustomerById(Customer customer);
}
