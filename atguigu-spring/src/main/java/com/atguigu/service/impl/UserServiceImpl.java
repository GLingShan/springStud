// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.service.impl;

import com.atguigu.anno.Bean;
import com.atguigu.anno.Di;
import com.atguigu.dao.UserDao;
import com.atguigu.service.UserService;

/**
 * UserServiceImpl
 */
@Bean
public class UserServiceImpl implements UserService {

  @Di
  private UserDao dao;

  @Override
  public void add() {
    System.out.println("service...");
    dao.add();
  }
}
