package com.hand.springMVCExam.jdbc.dao;

import java.util.List;

import com.hand.springMVCExam.bean.Film;
import com.hand.springMVCExam.bean.Language;
import com.hand.springMVCExam.bean.Pagination;

public interface FilmsManageDao {
	public List<Film> getAllFilm();
	public List<Film> queryPagination(Pagination p);
	public int addFilm(Film f,int languageId);
	public int deleteFilm(String sql, int film_id);
	public int deleteFilmRefer(int film_id);
	public int modifyFilmById(Film f,Language language);

}
