package com.jeff.web.controller;

import com.jeff.mybatis.mapper.ResourceMapper;
import com.jeff.mybatis.mapper.RoleResourceMapper;
import com.jeff.mybatis.mapper.UserRoleMapper;
import com.jeff.mybatis.po.*;
import com.jeff.web.consts.CacheConsts;
import com.jeff.web.entites.ActiveUser;
import com.jeff.web.util.ActiveUserBLL;
import com.jeff.web.util.CacheBLL;
import net.sf.ehcache.Element;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by liuren on 2017/11/4.
 */
@Controller
public class HomeController {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @RequestMapping(value = "/")
    public ModelAndView index(HttpServletRequest request){

        ModelAndView modelAndView = new ModelAndView("index");

        ActiveUser activeUser = null;//new ActiveUser();
        //获取用户
        String username = request.getParameter("username");
        int userid = 1;//TODO


        Element e = CacheBLL.getCache().get(CacheConsts.ACTIVE_USER+username);
        if(e == null){

//            //获取用户权限
//            SqlSession sqlSession = sqlSessionFactory.openSession();
//            UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
//
//            UserRoleExample example = new UserRoleExample();
//            UserRoleExample.Criteria criteria = example.createCriteria();
//            criteria.andUseridEqualTo(userid);
//            List<UserRoleKey> userRoleKeys = userRoleMapper.selectByExample(example);
//            if(userRoleKeys == null || userRoleKeys.size() == 0){
//                throw new RuntimeException("该用户没有权限");//TODO
//            }
//            //获取上面角色中对应的资源
//            List<Integer> roleids = new ArrayList<Integer>();
//            for (UserRoleKey urk : userRoleKeys){
//                roleids.add(urk.getRoleid());
//            }
//            RoleResourceMapper roleResourceMapper = sqlSession.getMapper(RoleResourceMapper.class);
//            RoleResourceExample roleResourceExample = new RoleResourceExample();
//            RoleResourceExample.Criteria rrCriteria= roleResourceExample.createCriteria();
//            rrCriteria.andRoleidIn(roleids);
//            List<RoleResourceKey> roleResourceKeys = roleResourceMapper.selectByExample(roleResourceExample);
//            if(roleResourceKeys == null || roleResourceKeys.size() == 0){//没有菜单资源
//                return modelAndView;
//            }
//
//            //获取所有的资源
//            List<Integer> resouceids = new ArrayList<Integer>();
//            for (RoleResourceKey resourceKey : roleResourceKeys){
//                resouceids.add(resourceKey.getResourceid());
//            }
//            ResourceMapper resourceMapper = sqlSession.getMapper(ResourceMapper.class);
//            ResourceExample menuExample = new ResourceExample();
//            ResourceExample.Criteria menuCriteria = menuExample.createCriteria();
//            menuCriteria.andIdIn(resouceids).andRestypeEqualTo(0).andResauthEqualTo(1);
//            List<Resource> menuList = resourceMapper.selectByExample(menuExample);//获取所有有权限的菜单
//            //排序
//            Collections.sort(menuList,new Comparator<Resource>(){
//                @Override
//                public int compare(Resource o1, Resource o2) {
//                    return o1.getResorder().compareTo(o2.getResorder());
//                }
//            });
//
//            ResourceExample resExample = new ResourceExample();
//            ResourceExample.Criteria resCriteria = resExample.createCriteria();
//            resCriteria.andIdIn(resouceids).andRestypeEqualTo(1).andResauthEqualTo(1);
//            List<Resource> resList = resourceMapper.selectByExample(menuExample);//获取所有有权限的资源（非菜单）
//
//            activeUser.setUsername(username);
//            activeUser.setMenuList(menuList);
//            activeUser.setResList(resList);

            activeUser = ActiveUserBLL.getInstance().activeUser(username);

            modelAndView.getModel().put("activeUser",activeUser);

            e = new Element(CacheConsts.ACTIVE_USER+username,activeUser,0);
            CacheBLL.getCache().put(e);
        }else {
            modelAndView.getModel().put("activeUser",e.getValue());
        }

        return modelAndView;
    }
}
