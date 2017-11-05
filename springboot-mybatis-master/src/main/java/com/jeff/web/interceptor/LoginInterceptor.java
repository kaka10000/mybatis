package com.jeff.web.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuren on 2017/11/5.
 *
 * 登入的拦截器
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        //调用登入的api，判断是否登入
            //没登入
//            response.sendRedirect("");//重定向到sso
            //登入了
        return super.preHandle(request, response, handler);
    }
}
