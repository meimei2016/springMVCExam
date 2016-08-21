package com.hand.springMVCExam.jdbc.mybatis.daoImpl;


import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.springMVCExam.bean.Rental;
import com.hand.springMVCExam.jdbc.dao.RentalManageDao;

public class RentalManageDaoImpl extends SqlSessionDaoSupport implements RentalManageDao{
	private static final String className=Rental.class.getName();
	public int deleteRentalByInventoryId(int inventoryId){
		String sqlId=".deleteRentalById";
		int i=getSqlSession().delete(className+sqlId, inventoryId);
		return i;
	}
}
