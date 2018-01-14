package study.project.emf.config.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import study.project.emf.config.mvc.intercepter.BasePathInterceptor;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("# WebMvcConfig addResourceHandlers ...");
        //如果打算将静态文件放在resources下面，则需要启用下面一段代码，如果将静态文件放在webapp下面，则什么也不用配置，直接可以访问
        registry.addResourceHandler("/statics/**").addResourceLocations("classpath:/statics/");
        registry.addResourceHandler("/images/**").addResourceLocations("classpath:/images/");

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new BasePathInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
