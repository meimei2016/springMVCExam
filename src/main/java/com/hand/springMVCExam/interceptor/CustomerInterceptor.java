package com.hand.springMVCExam.interceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

public class CustomerInterceptor implements WebRequestInterceptor {

	@Override
	public void preHandle(WebRequest request) throws Exception {
		System.out.println("arrive at preHandle");
	}

	@Override
	public void postHandle(WebRequest request, ModelMap model) throws Exception {
		System.out.println("arrive at postHandle");
	}

	@Override
	public void afterCompletion(WebRequest request, Exception ex)
			throws Exception {
		System.out.println("arrive at afterCompletion");
	}

}
