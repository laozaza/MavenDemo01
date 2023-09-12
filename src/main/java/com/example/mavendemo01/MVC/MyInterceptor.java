package com.example.mavendemo01.MVC;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
* 自定义一个拦截器类
* */
@Configuration
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //用户请求/admin开头路径,判断用户是否登录
        String uri = request.getRequestURI();
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (uri.startsWith("/admin") && null == loginUser) {
            response.sendRedirect("/toLoginPage");
            return false;
        }
        return true;}
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        request.setAttribute("currentYear", Calendar.getInstance().get(Calendar.YEAR));
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse
            response, Object handler, @Nullable Exception ex) throws Exception {
    }

}
