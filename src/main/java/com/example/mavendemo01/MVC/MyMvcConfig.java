package com.example.mavendemo01.MVC;


import com.example.mavendemo01.Thymeleaf.MyLocalResovel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
实现WebMvcConfigurer接口,用于对MVC框架功能扩展
*/
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //自定义的国际化组件
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResovel();
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //请求toLoginPage映射路径或者logi.html页面都会自动映射到login.html页面
        registry.addViewController("/toLoginPage").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
    }

}


