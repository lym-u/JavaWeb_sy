package com.score.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义拦截器1
 *
 * 拦截器和过滤器区别：
 * 归属不同：Filter（过滤器）属于Servlet技术，Interceptor（拦截器）属于SpringMVC技术
 * 拦截内容不同：Filter对所有访问进行增强，Interceptor仅针对SpringMVC的访问进行增强
 */
@Controller
public class ErrorInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	/*	if (response.getStatus() == 404) {
			modelAndView.setViewName("/404.html");
		}*/
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}