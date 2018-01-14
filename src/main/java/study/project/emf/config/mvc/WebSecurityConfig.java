/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package study.project.emf.config.mvc;

/**
 * @author wangzhe 2018/1/13.
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import study.project.emf.config.mvc.intercepter.SecurityInterceptor;


@Configuration
public class WebSecurityConfig extends WebMvcConfigurerAdapter {

    public final static String SESSION_KEY = "username";


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        InterceptorRegistration addInterceptor = registry.addInterceptor(new SecurityInterceptor());

        addInterceptor.excludePathPatterns("/error");
        addInterceptor.excludePathPatterns("/login**");
        addInterceptor.addPathPatterns("/**");
    }


}