// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6;

/**
 * User
 */
public class User {

  public User(){
    System.out.println("无参数构造方法执行");
  }
  public void add(){
    System.out.println("add......");
  }

  public static void main(String[] args) {
    User user = new User();
    user.add();
  }
}
