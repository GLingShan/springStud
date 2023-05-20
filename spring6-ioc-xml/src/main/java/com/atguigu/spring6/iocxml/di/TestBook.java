// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6.iocxml.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestBook
 */
public class TestBook {

  @Test
  public void t1(){
    ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
    Book book = (Book)context.getBean("book");
    System.out.println(book);
  }

  @Test
  public void t2(){
    ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
    Book book = (Book)context.getBean("bookCon");
    System.out.println(book);
  }
}
