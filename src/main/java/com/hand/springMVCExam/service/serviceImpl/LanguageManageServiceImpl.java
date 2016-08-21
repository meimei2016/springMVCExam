package com.hand.springMVCExam.service.serviceImpl;

import java.util.List;

import com.hand.springMVCExam.bean.Language;
import com.hand.springMVCExam.jdbc.dao.LanguageManageDao;
import com.hand.springMVCExam.jdbc.mybatis.daoImpl.LanguageManageDaoImpl;
import com.hand.springMVCExam.service.LanguageManageService;

public class LanguageManageServiceImpl implements LanguageManageService{
	LanguageManageDao languageManageDao;
	public void setLanguageManageDao(LanguageManageDaoImpl languageManageDaoImpl){
		this.languageManageDao=languageManageDaoImpl;
	}
	public List<Language> getAllLanguage(){
		List<Language> list=languageManageDao.getAllLanguage();
		return list;
	}

}
