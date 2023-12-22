package com.score.interceptor;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
 
    @Bean
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new LoginFilter());
        registration.addUrlPatterns("/*");
        registration.setName("loginFilter");
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public FilterRegistrationBean wordsFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SensitiveWordFilter());
        registration.addUrlPatterns("/*");
        registration.setName("wordsFilter");
        registration.setOrder(2);
        return registration;
    }
 
}