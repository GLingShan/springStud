// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6.iocxml.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestUserDao
 */
public class TestUserDao {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    userDao bean = context.getBean(userDao.class);
    System.out.println(bean);
    bean.run();
  }
}
