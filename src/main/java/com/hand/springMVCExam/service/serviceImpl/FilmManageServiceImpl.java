package com.hand.springMVCExam.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hand.springMVCExam.bean.Film;
import com.hand.springMVCExam.bean.Language;
import com.hand.springMVCExam.bean.Pagination;
import com.hand.springMVCExam.jdbc.dao.FilmsManageDao;
import com.hand.springMVCExam.jdbc.dao.LanguageManageDao;
import com.hand.springMVCExam.service.FilmsManageService;

public class FilmManageServiceImpl implements FilmsManageService{
	@Autowired
	private FilmsManageDao filmsManageDao;
	@Autowired
	private LanguageManageDao languageManageDao;
	
	
	public List<Film>getAllFilm(){
		List<Film> list=filmsManageDao.getAllFilm();
		return list;
	}
	
	public List<Film> getPaginationFilm(Pagination p){
		List<Film> list=filmsManageDao.queryPagination(p);
		return list;
	}
	
	public int addFilm(Film film){
		int languageId=languageManageDao.getLanguage(film.getLanguage()).getLanguage_id();
		int result=filmsManageDao.addFilm(film,languageId);
		return result;
	}
	
	public int deleteFilm(int filmId){
		int result=filmsManageDao.deleteFilmRefer(filmId);
		return result;
	}
	public int modifyFilmById(Film film){
		Language language=languageManageDao.getLanguage(film.getLanguage());
		int result=filmsManageDao.modifyFilmById(film,language);
		return result;
	}

}
