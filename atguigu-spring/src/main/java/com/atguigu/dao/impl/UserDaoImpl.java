// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.dao.impl;

import com.atguigu.anno.Bean;
import com.atguigu.dao.UserDao;

/**
 * UserDaoImpl
 */
@Bean
public class UserDaoImpl implements UserDao {
  @Override
  public void add() {
    System.out.println("dao.add...");
  }
}
