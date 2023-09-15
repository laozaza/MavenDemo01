package com.example.mavendemo01.Servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
/*
 * 嵌入式servlet容器三大组件配置(对MyServlet相关组件进行注册)
 * */

@Configuration//标识当前类是自定义配置类
public class ServletConfig {
    //注册 servlet组件
    @Bean
    public ServletRegistrationBean getServlet(MyServlet myServlet) {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(myServlet, "/myServlet");//在浏览器上访问myServlet
        return registrationBean;
    }

    //注册Filter组件
    @Bean
    public FilterRegistrationBean getFilter(MyFilter filter) {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(filter);
        registrationBean.setUrlPatterns(Arrays.asList("/toLoginPage", "/myFilter"));//在浏览器访问
        return registrationBean;
    }

    //注册Listener组件
    @Bean
    public ServletListenerRegistrationBean getServletListener(MyListener myListener) {
        ServletListenerRegistrationBean registrationBean = new ServletListenerRegistrationBean(myListener);
        return registrationBean;
    }

}
