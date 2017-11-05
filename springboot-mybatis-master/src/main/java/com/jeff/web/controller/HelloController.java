package com.jeff.web.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeff.mybatis.mapper.UserMapper;
import com.jeff.mybatis.po.User;
import com.jeff.mybatis.po.UserExample;

@Controller
public class HelloController {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper tUserMapper = sqlSession.getMapper(UserMapper.class);
        User user = tUserMapper.selectByPrimaryKey(1);
        System.out.println(user);
        
        UserExample example = new UserExample();
        
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridBetween(1, 3);//构造查询条件
        List<User> userList = tUserMapper.selectByExample(example);
        System.out.println(userList);
        
        return "hello";
    }
    
    @RequestMapping("/f1")
    @ResponseBody
    public Object f1() {
    	UserExample example = new UserExample();
    	SqlSession sqlSession = sqlSessionFactory.openSession();
    	UserMapper tUserMapper = sqlSession.getMapper(UserMapper.class);
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridBetween(1, 3).andPasswordEqualTo("aaa");//构造查询条件
        List<User> userList = tUserMapper.selectByExample(example);
        System.out.println(userList);
        return userList;
    }
    
    @RequestMapping("/f2")
    @ResponseBody
    public Object f2() {
    	UserExample example = new UserExample();
    	SqlSession sqlSession = sqlSessionFactory.openSession();
    	UserMapper tUserMapper = sqlSession.getMapper(UserMapper.class);
        //构造查询条件,通过criteria调用的api都是构造的and的条件
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPasswordLike("%aa%");
        List<User> userList = tUserMapper.selectByExample(example);
        System.out.println(userList);
        return userList;
    }

    @RequestMapping("/f3")
    @ResponseBody
    public Object f3() {
        UserExample example = new UserExample();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper tUserMapper = sqlSession.getMapper(UserMapper.class);
        UserExample.Criteria criteria = example.createCriteria();
        //构造查询条件,通过criteria调用的api都是构造的and的条件 where userid between [1  3] and password like %aa%
        criteria.andUseridBetween(1,3).andPasswordLike("%aa%");
        List<User> userList = tUserMapper.selectByExample(example);
        System.out.println(userList);
        return userList;
    }

    @RequestMapping("/f4")
    @ResponseBody
    public Object f4() {
        UserExample example = new UserExample();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper tUserMapper = sqlSession.getMapper(UserMapper.class);

        //example.createCriteria() 这个api，创建的Criteria对象，在Example对象的List中只能放一个，也就是只能构造And条件
        UserExample.Criteria criteria1 = example.createCriteria();
        criteria1.andUseridBetween(1, 3).andPasswordEqualTo("aaa");//构造查询条件

        UserExample.Criteria criteria2 = example.createCriteria();
        criteria2.andUseridBetween(1, 3).andPasswordEqualTo("bbb");//构造查询条件

        List<User> userList = tUserMapper.selectByExample(example);
        System.out.println(userList);
        return userList;
    }

    @RequestMapping("/f5")
    @ResponseBody
    public Object f5() {
        UserExample example = new UserExample();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper tUserMapper = sqlSession.getMapper(UserMapper.class);

        UserExample.Criteria criteria1 = example.or();
        //构造查询条件,通过criteria调用的api都是构造的and的条件 where userid between [1  3] and password like %aa%
        criteria1.andUseridBetween(1,3).andPasswordLike("%aa%");


        UserExample.Criteria criteria2 = example.or();
        //构造查询条件,通过criteria调用的api都是构造的and的条件 where userid between [1  3] and password like %aa%
        criteria2.andUseridBetween(1,3).andPasswordLike("%bb%");

        List<User> userList = tUserMapper.selectByExample(example);
        System.out.println(userList);
        return userList;
    }
}
