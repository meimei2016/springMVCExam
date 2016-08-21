package com.hand.springMVCExam.jdbc.mybatis.daoImpl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.springMVCExam.bean.Address;
import com.hand.springMVCExam.jdbc.dao.AddressDao;

public class AddressDaoImpl extends SqlSessionDaoSupport implements AddressDao {
	private static final String className=Address.class.getName();

	@Override
	public List<Address> getAllAddress() {
		String sqlId=".getAllAddress";
		List<Address> list=getSqlSession().selectList(className+sqlId);
		return list;
	}

	@Override
	public int getAddressId(String address) {
		String sqlId=".getAddressId";
		int result=getSqlSession().selectOne(className+sqlId, address);
		return result;
	}

}
