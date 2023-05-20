// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestUser
 */
public class TestUser {

  @Test
  public void testUserObject() throws Exception {
    //加载spring配置文件，对象创建
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

    //获取创建对象
    User user = (User)context.getBean("user");
    System.out.println("1:" + user);

    //使用对象调用方法进行测试
    user.add();
  }

  //反射创建对象
  @Test
  public  void testUserObject1() throws Exception {
    //获取类Class对象
    Class clazz = Class.forName("com.atguigu.spring6.User");
    //调用方法创建对象
    User user1 = (User) clazz.getDeclaredConstructor().newInstance();
    System.out.println(user1);
  }
}
