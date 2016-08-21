package com.hand.springMVCExam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.hand.springMVCExam.bean.Film;
import com.hand.springMVCExam.bean.Language;
import com.hand.springMVCExam.bean.Pagination;
import com.hand.springMVCExam.common.Constants;
import com.hand.springMVCExam.service.FilmsManageService;
import com.hand.springMVCExam.service.LanguageManageService;

@Controller
public class FilmManageController {
	@Autowired
	private FilmsManageService filmsManageService;
	@Autowired
	LanguageManageService languageManageService;
	
	@RequestMapping(value="/showFilm",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView showFilmsByPagination(@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		ModelAndView modelAndView=new ModelAndView();
		 Pagination p=new Pagination();
		 p.setCurrentPage(currentPage);
		int totalPage=(int) Math.ceil(filmsManageService.getAllFilm().size()/p.getPageSize());
		p.setTotalPage(totalPage);
		//List<Film> filmList=filmsManageService.getAllFilm();
		List<Film> filmList=filmsManageService.getPaginationFilm(p);
		modelAndView.addObject(Constants.FILM_LIST, filmList);
		modelAndView.addObject("pagination",p);
		modelAndView.setViewName("showFilm");
		return modelAndView;
	}
	
	@RequestMapping(value="toDeleteFilm",method=RequestMethod.GET)
	public ModelAndView goToDeleteFilm(){
		//Pagination p=new Pagination(); 
		ModelAndView modelAndView=new ModelAndView();
		List<Film> filmList=filmsManageService.getAllFilm();
		modelAndView.addObject(Constants.FILM_LIST, filmList);
		modelAndView.setViewName("deleteFilm");
		return modelAndView;
	}

	@RequestMapping(value="deleteFilm",method=RequestMethod.GET)
	public ModelAndView deleteFilmById(@RequestParam(value="film_id",required=false,defaultValue="0") int filmId){
		ModelAndView modelAndView=new ModelAndView();
		int result=filmsManageService.deleteFilm(filmId);
		if(result>0){
			modelAndView.setView(new RedirectView("/springMVCMybatisWebProj/toDeleteFilm"));
		}else{
			String tipMessage=Constants.TIP_MESSAGE_DELTE_FAIL;
			modelAndView.addObject(Constants.TIP_MESSAGE_NAME, tipMessage);
			modelAndView.setViewName("resultTip");
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/toAddFilm",method=RequestMethod.GET)
	public ModelAndView toAddFilm(){
		ModelAndView modelAndView=new ModelAndView();
		List<Language> languageList=languageManageService.getAllLanguage();
		modelAndView.addObject(Constants.LANGUAGE_LIST, languageList);
		modelAndView.setViewName("addFilm");
		return modelAndView;
	}
	
	@RequestMapping(value="/addFilm",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView addFilm(@ModelAttribute("Film") Film film){
		ModelAndView modelAndView=new ModelAndView();
		boolean b=!film.getTitle().isEmpty()&&!film.getLanguage().isEmpty()&&!film.getDescription().isEmpty();
		int i=0;
		String tipMessage=Constants.TIP_MESSAGE_ADD_FAIL;
		if(b){
			i=filmsManageService.addFilm(film);
		}
		if(i>0){
			modelAndView.setView(new RedirectView("/springMVCMybatisWebProj/showFilm"));
		}else{
			modelAndView.addObject(Constants.TIP_MESSAGE_NAME, tipMessage);
			modelAndView.setViewName("resultTip");
		}
		return modelAndView;
	}
	
	/*@RequestMapping(value="/toEditFilm",method=RequestMethod.GET)
	public ModelAndView toEditFilm(){
		ModelAndView modelAndView=new ModelAndView();
		List<Language> languageList=languageManageService.getAllLanguage();
		modelAndView.addObject(Constants.LANGUAGE_LIST, languageList);
		modelAndView.setViewName("deleteFilm");
		return modelAndView;
	}
	
	@RequestMapping(value="/editFilm",method=RequestMethod.GET)
	public ModelAndView toEditFilm(@RequestParam(value="film_id",defaultValue="0") int filmId){
		ModelAndView modelAndView=new ModelAndView();
		filmsManageService.
		modelAndView.setViewName("deleteFilm");
		return modelAndView;
	}*/
	

}
