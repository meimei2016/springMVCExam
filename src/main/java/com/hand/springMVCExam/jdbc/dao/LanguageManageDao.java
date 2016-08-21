package com.hand.springMVCExam.jdbc.dao;

import java.util.List;

import com.hand.springMVCExam.bean.Language;

public interface LanguageManageDao {
	public List<Language> getAllLanguage();
	public Language getLanguage(String title);

}
