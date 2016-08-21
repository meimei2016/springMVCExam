package com.hand.springMVCExam.jdbc.mybatis.daoImpl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.springMVCExam.bean.Language;
import com.hand.springMVCExam.jdbc.dao.LanguageManageDao;

public class LanguageManageDaoImpl extends SqlSessionDaoSupport implements
		LanguageManageDao {
	private static final String className=Language.class.getName();
	@Override
	public List<Language> getAllLanguage() {
		String sqlId=".selectAllLanguage";
		List<Language> list=getSqlSession().selectList(className+sqlId);
		return list;
	}

	@Override
	public Language getLanguage(String title) {
		String sqlId=".getLanguageByName";
		Language language=getSqlSession().selectOne(className+sqlId,title);
		return language;
	}

}
