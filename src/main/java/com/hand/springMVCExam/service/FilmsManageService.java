package com.hand.springMVCExam.service;

import java.util.List;

import com.hand.springMVCExam.bean.Film;
import com.hand.springMVCExam.bean.Pagination;

public interface FilmsManageService {

	public List<Film>getAllFilm();
	
	public int addFilm(Film film);
	
	public int deleteFilm(int filmId);
	public int modifyFilmById(Film film);
	public List<Film> getPaginationFilm(Pagination p);
}
