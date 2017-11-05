package com.jeff.web.util;

import com.jeff.mybatis.mapper.ResourceMapper;
import com.jeff.mybatis.mapper.RoleResourceMapper;
import com.jeff.mybatis.mapper.UserRoleMapper;
import com.jeff.mybatis.po.*;
import com.jeff.web.entites.ActiveUser;
import com.jeff.web.except.NoMenuException;
import com.jeff.web.except.NoPermissionException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by liuren on 2017/11/5.
 */
public class ActiveUserBLL {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    private ActiveUserBLL(){}

    private static ActiveUserBLL instance = new ActiveUserBLL();
    public static ActiveUserBLL getInstance(){
        return instance;
    }

    public ActiveUser activeUser(String username){

        int userid = 1;//TODO

        ActiveUser activeUser = new ActiveUser();
        //获取用户权限
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);

        UserRoleExample example = new UserRoleExample();
        UserRoleExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<UserRoleKey> userRoleKeys = userRoleMapper.selectByExample(example);
        if(userRoleKeys == null || userRoleKeys.size() == 0){
            throw new NoPermissionException("该用户没有权限");//TODO
        }
        //获取上面角色中对应的资源
        List<Integer> roleids = new ArrayList<Integer>();
        for (UserRoleKey urk : userRoleKeys){
            roleids.add(urk.getRoleid());
        }
        RoleResourceMapper roleResourceMapper = sqlSession.getMapper(RoleResourceMapper.class);
        RoleResourceExample roleResourceExample = new RoleResourceExample();
        RoleResourceExample.Criteria rrCriteria= roleResourceExample.createCriteria();
        rrCriteria.andRoleidIn(roleids);
        List<RoleResourceKey> roleResourceKeys = roleResourceMapper.selectByExample(roleResourceExample);
        if(roleResourceKeys == null || roleResourceKeys.size() == 0){//没有菜单资源
//            return modelAndView;
            throw new NoMenuException("该用户没有菜单资源");
        }

        //获取所有的资源
        List<Integer> resouceids = new ArrayList<Integer>();
        for (RoleResourceKey resourceKey : roleResourceKeys){
            resouceids.add(resourceKey.getResourceid());
        }
        ResourceMapper resourceMapper = sqlSession.getMapper(ResourceMapper.class);
        ResourceExample menuExample = new ResourceExample();
        ResourceExample.Criteria menuCriteria = menuExample.createCriteria();
        menuCriteria.andIdIn(resouceids).andRestypeEqualTo(0).andResauthEqualTo(1);
        List<Resource> menuList = resourceMapper.selectByExample(menuExample);//获取所有有权限的菜单
        //排序
        Collections.sort(menuList,new Comparator<Resource>(){
            @Override
            public int compare(Resource o1, Resource o2) {
                return o1.getResorder().compareTo(o2.getResorder());
            }
        });

        ResourceExample resExample = new ResourceExample();
        ResourceExample.Criteria resCriteria = resExample.createCriteria();
        resCriteria.andIdIn(resouceids).andRestypeEqualTo(1).andResauthEqualTo(1);
        List<Resource> resList = resourceMapper.selectByExample(menuExample);//获取所有有权限的资源（非菜单）

        activeUser.setUsername(username);
        activeUser.setMenuList(menuList);
        activeUser.setResList(resList);

        return activeUser;
    }
}
