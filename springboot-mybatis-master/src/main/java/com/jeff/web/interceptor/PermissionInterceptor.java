package com.jeff.web.interceptor;

import com.jeff.mybatis.po.Resource;
import com.jeff.web.consts.CacheConsts;
import com.jeff.web.entites.ActiveUser;
import com.jeff.web.util.ActiveUserBLL;
import com.jeff.web.util.CacheBLL;
import com.jeff.web.util.PropertiesBLL;
import net.sf.ehcache.Element;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuren on 2017/11/5.
 *
 * 权限的拦截器
 */
public class PermissionInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    static {
        PropertiesBLL.load("permission.properties");
    }
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        String url = request.getRequestURL().toString();

        //调用获取用户 //TODO
        String username = "";

        blackAndWhiteList(username,response);

        //
        Element e = CacheBLL.getCache().get(CacheConsts.ACTIVE_USER+username);
        ActiveUser activeUser = null;
        if (e == null || (ActiveUser)e.getValue() == null ){
            activeUser  = ActiveUserBLL.getInstance().activeUser(username);
            e = new Element(CacheConsts.ACTIVE_USER+username,activeUser,0);
            CacheBLL.getCache().put(e);
        }else if(((ActiveUser) e.getValue()).getResList() == null){
            activeUser = ActiveUserBLL.getInstance().activeUser(username);

            ((ActiveUser) e.getValue()).setResList(activeUser.getResList());
        }else {
            activeUser = (ActiveUser)e.getValue();
        }

        if(activeUser.getResList() != null){
            for (Resource resource : activeUser.getResList()){
                if(url.contains(resource.getResurl())){
                    return true;//有权限
                }
            }
            return false;//没有权限 //TODO
        }

        return super.preHandle(request, response, handler);
    }

    private boolean blackAndWhiteList(String username,HttpServletResponse response) throws Exception{

        //是白名单用户么
        if(PropertiesBLL.getValue("whiteListofUser").contains(username)){
            return true;
        }

        //是黑名单用户么
        if(PropertiesBLL.getValue("blacklistofUser").contains(username)){
            response.sendRedirect("");
            return false;
        }

        //url是白名单么
        if(PropertiesBLL.getValue("whiteListofURL").contains(username)){
            return true;
        }

        //Url是黑名单么
        if(PropertiesBLL.getValue("blacklistofURL").contains(username)){
            response.sendRedirect("");
            return false;
        }

        return true;
    }
}