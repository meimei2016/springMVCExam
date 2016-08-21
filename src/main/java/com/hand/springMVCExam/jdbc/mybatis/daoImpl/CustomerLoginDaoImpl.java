package com.hand.springMVCExam.jdbc.mybatis.daoImpl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.springMVCExam.bean.Customer;
import com.hand.springMVCExam.bean.Pagination;
import com.hand.springMVCExam.jdbc.dao.CustomerLoginDao;

public class CustomerLoginDaoImpl extends SqlSessionDaoSupport implements CustomerLoginDao {
	private static final String className=Customer.class.getName();
	@Override
	public int getUserName(String userName) {
		String sqlId=".getUserByName";
		int result=getSqlSession().selectOne(className+sqlId,userName);
		return result;
	}

	public List<Customer> getCustomerPagination(Pagination p) {
		String sqlId=".getCustomerPagination";
		RowBounds rowBounds=new RowBounds(p.getBeginIndex(),p.getEndIndex());
		List<Customer> result=getSqlSession().selectList(className+sqlId, rowBounds);
		return result;
	}
	public List<Customer> getAllCustomer() {
		String sqlId=".getAllCustomer";
		List<Customer> result=getSqlSession().selectOne(className+sqlId);
		return result;
	}
	public int addCustomer(Customer customer) {
		String sqlId=".addCustomer";
		int result=getSqlSession().update(className+sqlId,customer);
		return result;
	}

	public int deleteCustomerById(int customerId) {
		String sqlId=".deleteCustomerById";
		deletePaymentByCustomerId(customerId);
		deleteRentalByCustomerId(customerId);
		int i=getSqlSession().delete(className+sqlId, customerId);
		return i;
	}
	public int deletePaymentByCustomerId(int customerId){
		String sqlId=".deletePaymentByCustomerId";
		int i=getSqlSession().delete(className+sqlId, customerId);
		return i;
		
	}
	public int deleteRentalByCustomerId(int customer_id){
		String sqlId=".deleteRentalByCustomerId";
		int i=getSqlSession().delete(className+sqlId, customer_id);
		return i;
	}
}
