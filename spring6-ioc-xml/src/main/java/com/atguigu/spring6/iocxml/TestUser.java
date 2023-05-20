// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestUser
 */
public class TestUser {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

    //1 根据id获取
    User user =(User) context.getBean("user");

    //2 根据类型获取
    User bean = context.getBean(User.class);

    //3 根据id和类型
    User user1 = context.getBean("user", User.class);

    System.out.println("user对象"+ user);
    System.out.println("user对象2"+ bean);
    System.out.println("user对象3"+ user1);
  }
}
