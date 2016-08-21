package com.hand.springMVCExam.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.hand.springMVCExam.bean.Customer;
import com.hand.springMVCExam.bean.Pagination;
import com.hand.springMVCExam.common.Constants;
import com.hand.springMVCExam.service.CustomerLoginService;

@Controller
public class customerController {
	@Autowired
	CustomerLoginService customerService;
	
	@RequestMapping(value="/login",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView customerLogin(HttpServletRequest request,
			@RequestParam(value="userName", defaultValue="") String userName,
			@RequestParam(value="password", defaultValue="") String password)
			{
		int count=customerService.getUserName(userName);
		ModelAndView modelAndView=new ModelAndView();
		if(count>0&&(!password.isEmpty())){
			HttpSession session =request.getSession();
			session.setAttribute(Constants.SESSION_USER, userName);
			modelAndView.addObject("userName", userName);
			modelAndView.setView(new RedirectView("showCustomer"));
		}else{			
			modelAndView.setViewName("login");
		}		
		return modelAndView;
	}
	
	@RequestMapping(value="/toAddCustomer",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView addCustomer(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("addCustomer");
		return modelAndView;
	}
	
	@RequestMapping(value="/addCustomer",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView addCustomer(@ModelAttribute("Customer")Customer customer){
		ModelAndView modelAndView=new ModelAndView();
		customerService.addCustomer(customer);
		modelAndView.setView(new RedirectView("showCustomer"));
		return modelAndView;
	}
	
	@RequestMapping(value="/showCustomer",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView getCustomerByPagination(@RequestParam(value="currentPage", defaultValue="0") int currentPage){
		ModelAndView modelAndView=new ModelAndView();
		Pagination p =new Pagination();
		int totalPage=(int)Math.ceil(customerService.getAllCustomer().size()/p.getPageSize());
		p.setTotalPage(totalPage);
		if((currentPage>=1)&&(currentPage<=totalPage)){
			p.setCurrentPage(currentPage);
			p.setBeginIndex((currentPage-1)*p.getPageSize());
			p.setEndIndex(currentPage*p.getPageSize());
		}
		List<Customer> customerList=customerService.getCustomerPagination(p);
		modelAndView.addObject("customerList",customerList);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value="/deleteCustomer",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView deleteCustomer(@RequestParam(value="customer_id", defaultValue="0") int customer_id){
		ModelAndView modelAndView=new ModelAndView();
		customerService.deleteCustomerById(customer_id);
		modelAndView.setView(new RedirectView("showCustomer"));
		return modelAndView;
	}
}
