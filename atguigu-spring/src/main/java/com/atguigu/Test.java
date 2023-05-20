// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu;

import com.atguigu.bean.AnnotationApplicationContext;
import com.atguigu.bean.ApplicationContext;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;

/**
 * Test
 */
public class Test {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationApplicationContext("com.atguigu");
    UserService userService = (UserService)context.getBean(UserService.class);
    //实际取得是UserImpl
    System.out.println(userService);
    userService.add();
  }
}
