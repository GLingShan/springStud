// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6.iocxml.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TesyUser
 */
public class TesyUser {
  public static void main(String[] args) {
    /**
     * 实际初始化的，并不是真正的user，而是factorybean中的getObject
     */
    ApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");
    User user = context.getBean("user", User.class);
    System.out.println(user);
  }
}
