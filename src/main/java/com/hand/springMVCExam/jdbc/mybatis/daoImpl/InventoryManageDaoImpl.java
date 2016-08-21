package com.hand.springMVCExam.jdbc.mybatis.daoImpl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.springMVCExam.bean.Inventory;
import com.hand.springMVCExam.jdbc.dao.InventoryManageDao;

public class InventoryManageDaoImpl extends SqlSessionDaoSupport implements InventoryManageDao {
	private static final String className=Inventory.class.getName();

	public List<Inventory> getInventoryByFilmId(int filmId){		
		String sqlId=".getInventoryByFilmId";
		List<Inventory> list=getSqlSession().selectList(className+sqlId, filmId);
		return list;
	}
	
	public int deleteByFilmId(int filmId){
		String sqlId=".deleteByFilmId";
		int i=getSqlSession().delete(className+sqlId, filmId);
		return i;
	}

}
