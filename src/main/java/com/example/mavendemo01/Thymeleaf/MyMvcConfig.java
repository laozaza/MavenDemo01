package com.example.mavendemo01.Thymeleaf;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    //自定义的国际化组件
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResovel();
    }
}
