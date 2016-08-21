package com.hand.springMVCExam.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hand.springMVCExam.common.Constants;


public class CustomerInterceptor implements HandlerInterceptor  {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		boolean result=true;
		HttpSession session =request.getSession();
		String userNameInSession=(String) session.getAttribute("userName");
		String path=request.getServletPath();
		request.setCharacterEncoding("UTF-8");
		boolean m=(null==userNameInSession||""==userNameInSession);
		if(m){
			boolean a=false;
			for(String suffix:Constants.STATIC_SOURCE){
				if(path.endsWith(suffix)){
					a=true;
					break;
				}
			}
			if(!path.equals("/login")&&!a){
				request.getRequestDispatcher("login.jsp").forward(request, response);
				result=false;
			}			
		}
		return result;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}


}
