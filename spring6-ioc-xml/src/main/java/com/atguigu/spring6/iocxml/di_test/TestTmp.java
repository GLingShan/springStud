// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6.iocxml.di_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestTmp
 */
public class TestTmp {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
    Emp emp = (Emp)context.getBean("emp3");
    emp.work();
  }
}
